package antlrv4_generator;// Generated from D:/workspace/soul_virtual_machine\ArrayInit.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayInitParser}.
 */
public interface ArrayInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayInitParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ArrayInitParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayInitParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ArrayInitParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ArrayInitParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(ArrayInitParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ArrayInitParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(ArrayInitParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ArrayInitParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ArrayInitParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ArrayInitParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ArrayInitParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ArrayInitParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(ArrayInitParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ArrayInitParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(ArrayInitParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(ArrayInitParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(ArrayInitParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ArrayInitParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ArrayInitParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ArrayInitParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ArrayInitParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ArrayInitParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ArrayInitParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ArrayInitParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ArrayInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ArrayInitParser.IntContext ctx);
}