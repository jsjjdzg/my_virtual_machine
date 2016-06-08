package soul_language;

import java.io.*;
import java.util.Scanner;

import antlrv4_generator_java.JavaBaseListener;
import antlrv4_generator_java.JavaLexer;
import antlrv4_generator_java.JavaParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlrv4_generator_calculator.ArrayInitLexer;
import antlrv4_generator_calculator.ArrayInitParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

/**
 * Created by szj on 2016/6/5.
 */
public class main {
    @Test
    public void testCalculator() throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder buff = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            buff.append(scanner.nextLine() + '\n');
        }
        ArrayInitLexer lexer = new ArrayInitLexer(new ANTLRInputStream(buff.toString()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokens);
        ParseTree tree = parser.prog();
        MyVisitor visitor = new MyVisitor();
        System.out.println(tree.toStringTree(parser));
        visitor.visit(tree);
    }

    public void t(int i) {
        System.out.print(i);
    }

    @Test
    public void testJava() throws IOException {
        File file = new File("D:\\workspace\\soul_virtual_machine\\src\\soul_language\\MyVisitor.java");
        InputStream in = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
        StringBuilder buff = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            buff.append(line);
        }
        JavaLexer lexer = new JavaLexer(new ANTLRInputStream(buff.toString()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
    }

    public static void main(String[] arg0) throws IOException {
        String[] tests = {
                "D:\\workspace\\soul_virtual_machine\\src\\antlrv4_generator_current\\Var"
        };

        for (String s : tests) {
            ParseTreeWalker walker = new ParseTreeWalker();
            JavaLexer lexer = new JavaLexer(new ANTLRFileStream(s));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaParser parser = new JavaParser(tokens);
            JavaBaseListener listener = new JavaBaseListener();
            walker.walk(listener, parser.compilationUnit());
        }
    }
}
