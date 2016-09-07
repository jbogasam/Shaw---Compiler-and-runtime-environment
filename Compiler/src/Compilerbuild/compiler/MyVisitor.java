package Compilerbuild.compiler;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;
import Compilerbuild.parser.ShawBaseVisitor;
import Compilerbuild.parser.ShawParser.BlockContext;
import Compilerbuild.parser.ShawParser.BlockstmtContext;
import Compilerbuild.parser.ShawParser.BoolvalContext;
import Compilerbuild.parser.ShawParser.ExpressionContext;
import Compilerbuild.parser.ShawParser.FuncdeclarationContext;
import Compilerbuild.parser.ShawParser.LocalvariabledeclarationstmtContext;
import Compilerbuild.parser.ShawParser.StartContext;
import Compilerbuild.parser.ShawParser.StmtContext;
import Compilerbuild.parser.ShawParser.TypeContext;
import Compilerbuild.parser.ShawParser.VariableInitializerContext;
import Compilerbuild.parser.ShawParser.VariabledeclaratorIdContext;
 
public class MyVisitor extends ShawBaseVisitor<String>{
	
    public static List<String> statements = new ArrayList<>();
    
	@Override
	public String visitStart(StartContext ctx) {
		visitChildren(ctx);
		return null;
	}
	@Override
	public String visitBlock(BlockContext ctx) {
		visitChildren(ctx);
		return null;
	}
	@Override
	public String visitBlockstmt(BlockstmtContext ctx) {
		visitChildren(ctx);
		return null;
	}
	@Override
	public String visitBoolval(BoolvalContext ctx) {
		visitChildren(ctx);
		return null;
	}
	@Override
	public String visitVariabledeclaratorId(VariabledeclaratorIdContext ctx) {
		if(ctx.getChild(0) != null)
		{
			statements.add("Load" + ctx.getChild(0));
		}
		return super.visitVariabledeclaratorId(ctx);
	}
	
	public String visitLocalvariabledeclarationstmt(LocalvariabledeclarationstmtContext ctx) {
		if(ctx.getChild(0).getChild(0).getText().equals("INT"))
			statements.add("SR1" + " " + ctx.getChild(1).getChild(0).getChild(2).getChild(0).getChild(0).getText()+"\n" + "PUSH");
		else if (ctx.getChild(0).getChild(0).getText().equals("BOOL"))
			statements.add("BOOL" + " " + ctx.getChild(1).getChild(0).getChild(2).getChild(0).getChild(0).getText()+"\n" + "PUSH");
			
		return "";
	}
	@Override
	public String visitStmt(StmtContext ctx) {
		if(ctx.getChild(0).getText().equals("if"))
		{
			statements.add("SR1" + " " + ctx.getChild(1).getChild(1).getChild(2).getChild(0).getText()+"\n"+"PUSH");
			statements.add("CHECK" + "\n" + "SBLOCK");
		}
		else if(ctx.getChild(3).getText().equals("else"))
		{	
			statements.add("SR1" + " " + ctx.getChild(1).getChild(1).getChild(2).getChild(0).getText()+"\n"+"PUSH");
			statements.add("JNE EBLOCK");
		}	
		return "";
	}
	@Override
	public String visitVariableInitializer(VariableInitializerContext ctx) {
		statements.add("SR2" + " " + ctx.getChild(0).getChild(0).getText());
		return "";
	}
	@Override
	public String visitFuncdeclaration(FuncdeclarationContext ctx) {
		if(ctx.getChild(0).equals("fun"))
		{
			statements.add("FNS" +" " + ctx.getChild(2).getText() + "\n");
			statements.add("LOAD" + "" + ctx.getChild(4).getChild(1));
		}
		if (ctx.getChild(0).getChildCount()==2)
		{
			statements.add("SET"+ ctx.getChildCount());
			statements.add("GET" + (ctx.getChildCount()-1));
		}
		visitChildren(ctx);
		statements.add("FNE");
		return "";
	}
	
	@Override
	public String visitExpression(ExpressionContext ctx) {
		if(ctx.getChild(0).getText().equals("=="))
			statements.add(ctx.getChild(2).getText()+ "\n" + " EQ");
		else if (ctx.getChild(0).getText().equals("!="))
			statements.add(ctx.getChild(2).getText()+ "\n" + " NEQ");
		else if (ctx.getChild(0).getText().equals(">"))
			statements.add(ctx.getChild(2).getText()+ "\n" + " GT");
		else if (ctx.getChild(0).getText().equals("<"))
			statements.add(ctx.getChild(2).getText()+ "\n" + " LT");
		else if (ctx.getChild(0).getText().equals(">="))
			statements.add(ctx.getChild(2).getText()+ "\n" + " GTEQ");
		else if (ctx.getChild(0).getText().equals("<="))
			statements.add(ctx.getChild(2).getText()+ "\n" + " LTEQ");
		else if (ctx.getChild(0).getText().equals("+"))
			statements.add(ctx.getChild(2).getText()+ "\n" + " ADD");
		else if (ctx.getChild(0).getText().equals("-"))
			statements.add(ctx.getChild(2).getText()+ "\n" + " SUB");
		else if (ctx.getChild(0).getText().equals("*"))
			statements.add(ctx.getChild(2).getText()+ "\n" + " MUL");
		else if (ctx.getChild(0).getText().equals("/"))
			statements.add(ctx.getChild(2).getText()+ "\n" + " DIV");
		return "";
	}

	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if(aggregate == null)
		{
			return nextResult;
		}
		if(nextResult == null)
		{
			return aggregate;
		}
		return aggregate + "\n" + nextResult;
	}

}
