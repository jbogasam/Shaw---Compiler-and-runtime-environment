// Generated from Shaw.g4 by ANTLR 4.5.3
package Compilerbuild.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShawParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShawVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShawParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ShawParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ShawParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#blockstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstmt(ShawParser.BlockstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#funcdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdeclaration(ShawParser.FuncdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#localvariabledeclarationstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalvariabledeclarationstmt(ShawParser.LocalvariabledeclarationstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#variabledeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclarators(ShawParser.VariabledeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#variabledeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclarator(ShawParser.VariabledeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#variabledeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclaratorId(ShawParser.VariabledeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(ShawParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ShawParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#parexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpression(ShawParser.ParexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ShawParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ShawParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ShawParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShawParser#boolval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolval(ShawParser.BoolvalContext ctx);
}