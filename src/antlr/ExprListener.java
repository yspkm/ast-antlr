// Generated from src/antlr/Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eval}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterEval(ExprParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eval}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitEval(ExprParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eol}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterEol(ExprParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eol}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitEol(ExprParser.EolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExprParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExprParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(ExprParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(ExprParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(ExprParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(ExprParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fncall}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFncall(ExprParser.FncallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fncall}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFncall(ExprParser.FncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varid}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarid(ExprParser.VaridContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varid}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarid(ExprParser.VaridContext ctx);
	/**
	 * Enter a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMuldiv(ExprParser.MuldivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMuldiv(ExprParser.MuldivContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ExprParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ExprParser.FuncContext ctx);
}