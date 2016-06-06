package code_language_implementation;

/**
 * Created by szj on 2016/6/4.
 */
public abstract class Lexer {
    public static final char EOF = (char) -1;
    public static final int EOF_TYPE = 1;
    String input;//输入
    int p = 0;//字符下标
    char c;//当前字符

    //构造器
    public Lexer(String input){
        this.input = input;
        c= input.charAt(p);
    }

    //读一位
    public void consume(){
        p++;
        if( p >= input.length()){
            c = EOF;
        }else{
            c = input.charAt(p);
        }
    }

    //判断c == x
    public void match(char x){
        if(c == x){
            consume();
        }else{
            throw new Error("expecting" + x + "; found" + c);
        }
    }

    public abstract Token nextToken();
    public abstract String getTokenName(int tokenType);

}
