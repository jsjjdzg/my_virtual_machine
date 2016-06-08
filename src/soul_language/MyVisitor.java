package soul_language;

import antlrv4_generator_calculator.ArrayInitBaseVisitor;
import antlrv4_generator_calculator.ArrayInitParser;

import java.util.HashMap;
import java.util.Map;


public class MyVisitor extends ArrayInitBaseVisitor<Integer> {

	Map<String, Integer> memory = new HashMap<>();

	@Override
	public Integer visitPrintExpr(ArrayInitParser.PrintExprContext ctx) {
		int value = visit(ctx.expr());
		System.out.print(value);
		return 0;
	}

	@Override
	public Integer visitAssign(ArrayInitParser.AssignContext ctx) {
		String id = ctx.ID().getText();
		int value = visit(ctx.expr());
		memory.put(id,value);
		System.out.println(memory);
		return super.visitAssign(ctx);
	}


	@Override
	public Integer visitParens(ArrayInitParser.ParensContext ctx) {
		return visit(ctx.expr());
	}

	@Override
	public Integer visitMulDiv(ArrayInitParser.MulDivContext ctx) {
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if(ctx.op.getType() == ArrayInitParser.MUL){
			return left * right;
		}
		return left/right;
	}

	@Override
	public Integer visitAddSub(ArrayInitParser.AddSubContext ctx) {
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if(ctx.op.getType() == ArrayInitParser.ADD){
			return left + right;
		}
		return left + right;
	}

	@Override
	public Integer visitId(ArrayInitParser.IdContext ctx) {
		String id = ctx.ID().getText();
		if(memory.containsKey(id));
		return memory.get(id);
	}

	@Override
	public Integer visitInt(ArrayInitParser.IntContext ctx) {
		return Integer.parseInt(ctx.INT().getText());
	}
}
