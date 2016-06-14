package vm;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;


public class TestParser {
	
	public static void main(String[] args) throws Exception {

		String[] tests = { 		        
		      "f1.txt"
			, "f2.txt"
			, "f3.txt"
		};

		for (String s : tests) {
			System.out.println("Input file: " + s);
			run(s);
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
		System.out.println(t.toStringTree());		
	}
}
