package code_language_implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by szj on 2016/6/5.
 */
public class AST {
    Token token;
    List<AST> children = new ArrayList<>();
    public AST(Token token){
        this.token = token;
    }
    public void addChild(AST child){
        children.add(child);
    }
}
