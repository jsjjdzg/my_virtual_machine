package antlrv4_generator_current;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

/**
 * Created by szj on 2016/6/5.
 */
public class main {


    public static void main(String[] arg0) throws IOException {
        String[] tests = {
                "D:\\workspace\\soul_virtual_machine\\src\\antlrv4_generator_current\\Var"
        };

        for (String s : tests) {
            ParseTreeWalker walker = new ParseTreeWalker();
            DefPhase defPhase = new DefPhase();
            CymbolLexer lexer = new CymbolLexer(new ANTLRFileStream(s));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CymbolParser parser = new CymbolParser(tokens);
            CymbolBaseListener listener = new CymbolBaseListener();
            walker.walk(listener, parser.file());
        }
    }
}
