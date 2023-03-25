// Generated from Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eval}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(ExprParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ExprParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(ExprParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(ExprParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nums}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNums(ExprParser.NumsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(ExprParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(ExprParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(ExprParser.Func_nameContext ctx);
}