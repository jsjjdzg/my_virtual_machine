package soul_language;

import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlrv4_generator.ArrayInitLexer;
import antlrv4_generator.ArrayInitParser;

/**
 * Created by szj on 2016/6/5.
 */
public class main {
    public static void main(String[] arg0) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder buff = new StringBuilder();
        for(int i = 0 ; i < 4; i++){
            buff.append(scanner.nextLine()+'\n');
        }
        ArrayInitLexer lexer = new ArrayInitLexer(new ANTLRInputStream(buff.toString()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokens);
        ParseTree tree = parser.prog();
        MyVisitor visitor = new MyVisitor();
        System.out.println(tree.toStringTree(parser));
        visitor.visit(tree);
    }
}
