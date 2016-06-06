package code_language_implementation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by szj on 2016/6/5.
 */
public class SymbolTable implements Scope {
    Map<String, Symbol> symbols = new HashMap<>();

    public SymbolTable(){
        initTypeSystem();
    }

    protected void initTypeSystem(){
        define(new BuiltInTypeSymbol("int"));
        define(new BuiltInTypeSymbol("float"));
    }

    @Override
    public String getScopeName() {
        return "global";
    }

    @Override
    public Scope getEnclosingScope() {
        return null;
    }

    @Override
    public void define(Symbol sym) {
        symbols.put(sym.getName(), sym);
    }

    @Override
    public Symbol resolve(String name) {
        return symbols.get(name);
    }

    @Override
    public String toString() {
        return getScopeName() + ':' + symbols;
    }
}
