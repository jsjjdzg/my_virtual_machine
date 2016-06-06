package code_language_implementation;

/**
 * Created by szj on 2016/6/5.
 */
public class Symbol {
    public String name;
    public Type type;

    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Symbol(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        if(type != null){
            return  '<' + getName() + ':' + type + '>';
        }
        return getName();
    }
}
