__author__ = 'MengJungLin'

"""
OPCODES:
    SR1 --> Set R1 (Register 1)
    SR2 --> Set R2 (Register 2)
    SR3 --> Set R3 (Register 3, used to store call function location)
    PUSH    --> Push R1 to stack
    GET OFFSET  --> Set R1 = stack[OFFSET]
    SET OFFSET  --> Set stack[OFFSET] = R1
    FNS NAME    --> Function NAME start
    FNE --> Function end, return value store in R1, swap R1&R3, JMP to R1, swap R1&R3
    CALL NAME   --> Call function
    SW    --> Swap R1 & R2
    JMP LOCATION    --> Jump to LOCATION
    JNE LOCATION    --> Jump to LOCATION if R1 != R2
    ADD, SUB, MUL, DIV  --> Set R1 = R1 operation R2
    GT, LT, EQ  --> Greater Than, Less Than, Equal to: compare R1 & R2, store 1 or 0 in R1
    PRT    --> Print R1
    EOF --> End Of File (technically won't need this, but seeing EOF will force the program to end)
"""

function_dict = dict()
op_start_block = "SBLOCK"
op_end_block = "EBLOCK"


class Interpreter:
    def __init__(self, code, debug=True):
        self.loc = 0  # Line number
        self.stack = []
        self.r1 = 0
        self.r2 = 0
        self.r3 = 0  # store function call location
        self.code = code
        self.declare_func = False
        self.block_start = -1
        self.block_end = -1
        self.run_block = True
        self.debug = debug

    def advance(self):
        line = self.code[self.loc]
        self.loc += 1

        tokens = line.split()
        opcode = tokens.pop(0)

        if hasattr(self, opcode):
            getattr(self, opcode)(tokens)
        else:
            print "unsupported opcode: ", opcode
        if self.debug:
            print '{:03}{:11}R1:{:<5}R2:{:<5}R3:{:<5}Stack:{:20}'.format(self.loc, line.strip(), self.r1, self.r2, self.r3, self.stack), self.declare_func
            # This is to perform some test print operations.
    def execute(self):  # execute the code line by line
        while self.loc < len(self.code):
            self.advance()

    def ASK(self, args):
        if not self.declare_func:
            self.r1 = input()

    def SR1(self, args):
        if not self.declare_func:
            value = int(args[0])
            self.r1 = value

    def SR2(self, args):
        if not self.declare_func:
            value = int(args[0])
            self.r2 = value

    def PUSH(self, args):
        if not self.declare_func:
            self.stack.append(self.r1)

    def GET(self, args):
        if not self.declare_func:
            offset = int(args[0])
            self.r1 = self.stack[offset]

    def SET(self, args):
        if not self.declare_func:
            offset = int(args[0])
            self.stack[offset] = self.r1

    def FNS(self, args):
        function_dict[args[0]] = self.loc
        self.declare_func = True

    def FNE(self, args):
        if not self.declare_func:
            self.r1, self.r3 = self.r3, self.r1  # swap R1 & R3
            self.JMP([self.r1])  # jump to R1, which currently has the function call location
            self.r1, self.r3 = self.r3, self.r1  # swap R1 & R3 (now R1 is return value, R3 is the function call location)
            self.stack = []
        self.declare_func = False

    def CALL(self, args):
        self.r3 = self.loc
        self.JMP([function_dict[args[0]]])

    def SW(self, args):
        if not self.declare_func:
            self.r1, self.r2 = self.r2, self.r1

    def JMP(self, args):
        if not self.declare_func:
            if isinstance(args[0], basestring):  # string
                new_loc = self.find_block(args[0])
            else:  # int
                new_loc = args[0]
            self.loc = new_loc

    def JNE(self, args):
        if not self.declare_func:
            if self.r1 != self.r2:
                self.JMP(args)

    def ADD(self, args):
        if not self.declare_func:
            self.r1 += self.r2

    def SUB(self, args):
        if not self.declare_func:
            self.r1 -= self.r2

    def MUL(self, args):
        if not self.declare_func:
            self.r1 *= self.r2

    def DIV(self, args):
        if not self.declare_func:
            self.r1 /= self.r2

    def GT(self, args):
        self.r1 = 1 if self.r1 > self.r2 else 0

    def LT(self, args):
        self.r1 = 1 if self.r1 < self.r2 else 0

    def EQ(self, args):
        self.r1 = 1 if self.r1 == self.r2 else 0

    def CHECK(self, args):
        if not self.declare_func:
            if self.stack[0] == self.stack[1]:
                self.run_block = True
            else:
                self.run_block = False

    def SBLOCK(self, args):
        if not self.declare_func:
            if self.run_block:
                self.block_start = self.loc
                self.block_end = self.find_block(op_end_block)
            else:
                self.block_start = self.loc
                self.block_end = self.find_block(op_end_block)
                self.JMP([self.block_end])

    def EBLOCK(self, args): #alternate run_block
        if not self.declare_func:
            self.run_block = True if not self.run_block else False

    def PRT(self, args):
        if not self.declare_func:
            print self.r1

    def EOF(self, args):
        exit()

    """
    Supporting Functions
    """
    def find_block(self, name):  # find the location of the next block
        if name == op_start_block and self.block_start != -1:
            return self.block_start
        cur = self.loc
        while self.code[cur].strip() != name:
            cur += 1
        return cur


def main():
    with open("IntermediateCode.txt") as f:
        content = f.readlines()

    temp = Interpreter(content)
    temp.execute()


if __name__ == '__main__':
    main()
