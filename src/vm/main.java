package vm;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by szj on 2016/6/5.
 */
public class main {


    public static void main(String[] arg0) throws IOException {
        String[] tests = {
                "D:\\workspace\\soul_virtual_machine\\src\\vm\\Var"
        };

        for (String s : tests) {
            CymbolLexer lexer = new CymbolLexer(new ANTLRFileStream(s));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CymbolParser parser = new CymbolParser(tokens);
            MyCompiler compiler = new MyCompiler();
            compiler.visit(parser.prog());

            //print compile result
            Map<String, List<Instruction>> functionMap = compiler.getFunctionMap();
            Set<Map.Entry<String, List<Instruction>>> set = functionMap.entrySet();
            for (Map.Entry<String, List<Instruction>> e : set) {
                System.out.println();
                System.out.println(e.getKey());
                for(Instruction ins: e.getValue()){
                    System.out.println(ins.toString());
                }
            }
            AbstractMachine vm = new AbstractMachine(functionMap);
            vm.compute();
        }
    }
}
