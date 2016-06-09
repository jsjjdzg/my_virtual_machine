package vm;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by szj on 2016/6/8.
 */
public class MyCompiler extends CymbolBaseListener {
    private int seqNum = 0;
    private int tempNum = 0;
    private int level = 0;
    private Map<String, String> paramRenameMap = new HashMap<>();
    private String funName = null;
    private List<Instruction> insList = new ArrayList<>();

    private void addInstruction(Instruction inc) {
        insList.add(inc);
    }

    private Map<String, List<Instruction>> functionMap = new HashMap<String, List<Instruction>>();

    public Map<String, List<Instruction>> getFunctionMap() {
        return this.functionMap;
    }

    @Override
    public void enterProg(CymbolParser.ProgContext ctx) {
        super.enterProg(ctx);
    }

    @Override
    public void exitProg(CymbolParser.ProgContext ctx) {
        super.exitProg(ctx);
    }

    @Override
    public void enterFunDecl(CymbolParser.FunDeclContext ctx) {
        seqNum = 0;
        tempNum = 0;
        funName = ctx.ID().getText();
        functionMap.put(ctx.ID().getText(), insList);
    }

    @Override
    public void exitFunDecl(CymbolParser.FunDeclContext ctx) {
        super.exitFunDecl(ctx);
    }

    @Override
    public void enterParameterList(CymbolParser.ParameterListContext ctx) {
        super.enterParameterList(ctx);
    }

    @Override
    public void exitParameterList(CymbolParser.ParameterListContext ctx) {
        super.exitParameterList(ctx);
    }

    @Override
    public void enterParameter(CymbolParser.ParameterContext ctx) {
//        addInstruction(new Instruction(seqNum++, ctx.getText()));
    }

    @Override
    public void exitParameter(CymbolParser.ParameterContext ctx) {
        super.exitParameter(ctx);
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
    public void enterStmtList(CymbolParser.StmtListContext ctx) {
        super.enterStmtList(ctx);
    }

    @Override
    public void exitStmtList(CymbolParser.StmtListContext ctx) {
        super.exitStmtList(ctx);
    }

    @Override
    public void enterStmt(CymbolParser.StmtContext ctx) {
        super.enterStmt(ctx);
    }

    @Override
    public void exitStmt(CymbolParser.StmtContext ctx) {
        if(ctx.RETURN() != null){
            if(funName.equals("main")){
                addInstruction(new Instruction(seqNum++, "halt"));
            }else {
                addInstruction(new Instruction(seqNum++,"ret"));
            }
        }
    }

    @Override
    public void enterIfStmt(CymbolParser.IfStmtContext ctx) {
        super.enterIfStmt(ctx);
    }

    @Override
    public void exitIfStmt(CymbolParser.IfStmtContext ctx) {
        super.exitIfStmt(ctx);
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
    public void enterNumber(CymbolParser.NumberContext ctx) {
    }

    @Override
    public void exitNumber(CymbolParser.NumberContext ctx) {
        addInstruction(new Instruction(seqNum++, "ldc", ctx.getText()));
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

    }

    @Override
    public void exitAddSub(CymbolParser.AddSubContext ctx) {
        if(ctx.op.getText().equalsIgnoreCase("+")){
            addInstruction(new Instruction(seqNum++, "add"));
        }
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
        String var = paramRenameMap.get(ctx.ID().getText());
        if(var == null){
            String temp = "t" + tempNum++;
            paramRenameMap.put(ctx.ID().getText(), temp);
            var = temp;
        }
        addInstruction(new Instruction(seqNum++,"ldv",var));
    }

    @Override
    public void enterAssign(CymbolParser.AssignContext ctx) {
        level++;
    }

    @Override
    public void exitAssign(CymbolParser.AssignContext ctx) {
        if(level > 1) {
            addInstruction(new Instruction(seqNum++, "dup"));
        }
        String var = paramRenameMap.get(ctx.ID().getText());
        if (null == var) {
            String temp = "t" + tempNum++;
            paramRenameMap.put(ctx.ID().getText(), temp);
            var = temp;
            addInstruction(new Instruction(seqNum++, "asn", var));
        }
        level--;
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
