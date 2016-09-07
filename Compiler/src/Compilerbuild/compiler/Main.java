package Compilerbuild.compiler;
import java.io.IOException;

import java.io.File;
import java.io.FileWriter;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import Compilerbuild.parser.ShawLexer;
import Compilerbuild.parser.ShawParser;

public class Main {
	public static void main(String args[]) throws IOException{
		
		ANTLRInputStream input  = new ANTLRFileStream("test.Shaw");
		ShawLexer lexer = new ShawLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ShawParser parser = new ShawParser(tokens);
		
		ParseTree tree = parser.start();
		 MyVisitor v = new MyVisitor();
	        v.visit(tree);
	        String output="";
	        for(String t : v.statements){
	            output += t + "\n";
	        }
	        write(output);
	    }

	    private static void write(String output) throws IOException {
	        File file = new File("IntermediateCode.txt");
	        FileWriter fw = new FileWriter(file);
	        fw.write(output);
	        fw.close();
	    }
		
	}
