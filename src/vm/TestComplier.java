package vm;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


public class TestComplier {
	
	public static void main(String[] args) throws Exception {
		String path = "";
		String[] tests = { 		        
			      "f1.txt"
				, "f2.txt"
				, "f3.txt"
				};
		
		for (String s : tests) {
			path = "D:\\迅雷下载\\antlr_app\\antlr_app\\" + s;
			System.out.println(path);
			run(path);
			System.out.println();
		}
	}

	public static void run(String in) throws Exception {
		ANTLRFileStream input = new ANTLRFileStream(in);
        
		//lexer 
		FunctionLexer lexer = new FunctionLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
        //parser
		FunctionParser parser = new FunctionParser(tokens);
		FunctionParser.prog_return ret = parser.prog();
		
		//AST		
		CommonTree t = (CommonTree) ret.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);

		//compiler
		FunctionComplier c= new FunctionComplier(nodes);
		c.prog();
		
		//print compile result
		Map<String, List<Instruction>> functionMap = c.getFunctionMap();
		Set<Entry<String, List<Instruction>>> set = functionMap.entrySet();
		for (Entry<String, List<Instruction>> e : set) {
			System.out.println();
			System.out.println(e.getKey());
			for(Instruction ins: e.getValue()){
				System.out.println(ins.toString());				
			}
		}		
	}
}
