// Generated from D:/workspace/soul_virtual_machine\Cymbol.g4 by ANTLR 4.5.1
package vm;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolParser}.
 */
public interface CymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CymbolParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CymbolParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#funDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunDecl(CymbolParser.FunDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#funDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunDecl(CymbolParser.FunDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CymbolParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CymbolParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CymbolParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CymbolParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(CymbolParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(CymbolParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CymbolParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CymbolParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CymbolParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CymbolParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(CymbolParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(CymbolParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(CymbolParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(CymbolParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CymbolParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CymbolParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CymbolParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CymbolParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CymbolParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CymbolParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(CymbolParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(CymbolParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(CymbolParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(CymbolParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtLt}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGtLt(CymbolParser.GtLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtLt}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGtLt(CymbolParser.GtLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CymbolParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CymbolParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(CymbolParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(CymbolParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CymbolParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CymbolParser.ExprListContext ctx);
}