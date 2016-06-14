package vm;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class TestMachine {

	public static void main(String[] args) throws Exception {

		String[] tests = { 		        
			      "f1.txt"
				, "f2.txt"
				, "f3.txt"
				};

		for (String s : tests) {
			System.out.println();
			System.out.println("Input file: " + s);
			Map<String, List<Instruction>> functionMap = compile(s);
 
			Set<Entry<String, List<Instruction>>> set = functionMap.entrySet();
			for (Entry<String, List<Instruction>> e : set) {
				System.out.println();
				System.out.println(e.getKey());
				for(Instruction ins: e.getValue()){
					System.out.println(ins.toString());				
				}
			}		
			// call AbstractMachine to excute instruciton
			AbstractMachine am = new AbstractMachine(functionMap);
			am.compute();
		}

	}

	public static Map<String, List<Instruction>> compile(String in)
			throws Exception {
		ANTLRFileStream input = new ANTLRFileStream(in);

		// lexer
		FunctionLexer lexer = new FunctionLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// parser
		FunctionParser parser = new FunctionParser(tokens);
		FunctionParser.prog_return ret = parser.prog();

		// AST
		CommonTree t = (CommonTree) ret.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);

		// type checker
		FunctionTypeChecker tc = new FunctionTypeChecker(nodes);
		tc.prog();

		nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);
		// compiler
		FunctionComplier c = new FunctionComplier(nodes);
		c.prog();

		// return compile result
		return c.getFunctionMap();
	}
}
