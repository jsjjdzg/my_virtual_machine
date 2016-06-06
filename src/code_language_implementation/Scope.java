package code_language_implementation;

/**
 * Created by szj on 2016/6/5.
 */
public interface Scope {
    String getScopeName();
    Scope getEnclosingScope();
    void define(Symbol sym);
    Symbol resolve(String name);
}
