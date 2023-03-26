// Generated from src/antlr/Expr.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by the {@code eol}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEol(ExprParser.EolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExprParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(ExprParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(ExprParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fncall}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFncall(ExprParser.FncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varid}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarid(ExprParser.VaridContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldiv(ExprParser.MuldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(ExprParser.FuncContext ctx);
}