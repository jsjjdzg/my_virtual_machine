package antlrv4_generator_current;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import vm.Instruction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by szj on 2016/6/8.
 */
public class MyCompiler extends CymbolBaseListener{
    private int seqNum = 0;
    private int tempNum = 0;
    private Map<String, String> paramRenameMap ;

    private List<Instruction> insList;
    private void addInstruction(Instruction inc){
        insList.add(inc);
    }

    private Map<String, List<Instruction>> functionMap = new HashMap<String, List<Instruction>>();
    public Map<String, List<Instruction>> getFunctionMap(){
        return this.functionMap;
    }

    private int level = 0;

    @Override
    public void enterFile(CymbolParser.FileContext ctx) {
        super.enterFile(ctx);
    }

    @Override
    public void exitFile(CymbolParser.FileContext ctx) {
        super.exitFile(ctx);
    }

    @Override
    public void enterVarDecl(CymbolParser.VarDeclContext ctx) {
        super.enterVarDecl(ctx);
    }

    @Override
    public void exitVarDecl(CymbolParser.VarDeclContext ctx) {
        super.exitVarDecl(ctx);
    }

    @Override
    public void enterType(CymbolParser.TypeContext ctx) {
        super.enterType(ctx);
    }

    @Override
    public void exitType(CymbolParser.TypeContext ctx) {
        super.exitType(ctx);
    }

    @Override
    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        super.enterFunctionDecl(ctx);
    }

    @Override
    public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        super.exitFunctionDecl(ctx);
    }

    @Override
    public void enterFormalParameters(CymbolParser.FormalParametersContext ctx) {
        super.enterFormalParameters(ctx);
    }

    @Override
    public void exitFormalParameters(CymbolParser.FormalParametersContext ctx) {
        super.exitFormalParameters(ctx);
    }

    @Override
    public void enterFormalParameter(CymbolParser.FormalParameterContext ctx) {
        super.enterFormalParameter(ctx);
    }

    @Override
    public void exitFormalParameter(CymbolParser.FormalParameterContext ctx) {
        super.exitFormalParameter(ctx);
    }

    @Override
    public void enterBlock(CymbolParser.BlockContext ctx) {
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(CymbolParser.BlockContext ctx) {
        super.exitBlock(ctx);
    }

    @Override
    public void enterStat(CymbolParser.StatContext ctx) {
        super.enterStat(ctx);
    }

    @Override
    public void exitStat(CymbolParser.StatContext ctx) {
        super.exitStat(ctx);
    }

    @Override
    public void enterCall(CymbolParser.CallContext ctx) {
        super.enterCall(ctx);
    }

    @Override
    public void exitCall(CymbolParser.CallContext ctx) {
        super.exitCall(ctx);
    }

    @Override
    public void enterNot(CymbolParser.NotContext ctx) {
        super.enterNot(ctx);
    }

    @Override
    public void exitNot(CymbolParser.NotContext ctx) {
        super.exitNot(ctx);
    }

    @Override
    public void enterMulDiv(CymbolParser.MulDivContext ctx) {
        super.enterMulDiv(ctx);
    }

    @Override
    public void exitMulDiv(CymbolParser.MulDivContext ctx) {
        super.exitMulDiv(ctx);
    }

    @Override
    public void enterAddSub(CymbolParser.AddSubContext ctx) {
        super.enterAddSub(ctx);
    }

    @Override
    public void exitAddSub(CymbolParser.AddSubContext ctx) {
        super.exitAddSub(ctx);
    }

    @Override
    public void enterEqual(CymbolParser.EqualContext ctx) {
        super.enterEqual(ctx);
    }

    @Override
    public void exitEqual(CymbolParser.EqualContext ctx) {
        super.exitEqual(ctx);
    }

    @Override
    public void enterVar(CymbolParser.VarContext ctx) {
        super.enterVar(ctx);
    }

    @Override
    public void exitVar(CymbolParser.VarContext ctx) {
        super.exitVar(ctx);
    }

    @Override
    public void enterParens(CymbolParser.ParensContext ctx) {
        super.enterParens(ctx);
    }

    @Override
    public void exitParens(CymbolParser.ParensContext ctx) {
        super.exitParens(ctx);
    }

    @Override
    public void enterIndex(CymbolParser.IndexContext ctx) {
        super.enterIndex(ctx);
    }

    @Override
    public void exitIndex(CymbolParser.IndexContext ctx) {
        super.exitIndex(ctx);
    }

    @Override
    public void enterNegate(CymbolParser.NegateContext ctx) {
        super.enterNegate(ctx);
    }

    @Override
    public void exitNegate(CymbolParser.NegateContext ctx) {
        super.exitNegate(ctx);
    }

    @Override
    public void enterInt(CymbolParser.IntContext ctx) {
        super.enterInt(ctx);
    }

    @Override
    public void exitInt(CymbolParser.IntContext ctx) {
        super.exitInt(ctx);
    }

    @Override
    public void enterExprList(CymbolParser.ExprListContext ctx) {
        super.enterExprList(ctx);
    }

    @Override
    public void exitExprList(CymbolParser.ExprListContext ctx) {
        super.exitExprList(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
