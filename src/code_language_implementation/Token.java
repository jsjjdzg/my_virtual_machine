package code_language_implementation;

/**
 * Created by szj on 2016/6/4.
 */
public class Token {
    public int type;
    public String text;
    public Token(int type, String text){
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text + ":" + ListLexer.tokenNames[this.type];
    }
}


