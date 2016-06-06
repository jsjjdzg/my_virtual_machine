package code_language_implementation;

/**
 * Created by szj on 2016/6/4.
 */
public class ListLexer extends Lexer {

    public static int NAME = 2;
    public static int COMMA = 3;
    public static int LBRACK = 4;
    public static int RBRACK = 5;
    public static int EQUAL = 6;
    public static String[] tokenNames = {"n/a", "<EOF>", "NAME", "COMMA", "LBRACK", "RBRACK", "EQUAL"};

    boolean isLetter() {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    public ListLexer(String input) {
        super(input);
    }

    @Override
    public Token nextToken() {
        while (c != EOF) {
            switch (c) {
                case ' ':
                case '\t':
                case '\n':
                case '\r':
                    ws();
                    continue;
                case ',':
                    consume();
                    return new Token(COMMA, ",");
                case '[':
                    consume();
                    return new Token(LBRACK, "[");
                case ']':
                    consume();
                    return new Token(RBRACK, "]");
                case '=':
                    consume();
                    return new Token(EQUAL, "=");
                default:
                    if (isLetter()) {
                        return name();
                    }
                    throw new Error("invalid character :" + c);
            }
        }
        return new Token(EOF_TYPE, "<EOF>");
    }

    Token name() {
        StringBuilder buf = new StringBuilder();
        do {
            buf.append(c);
            consume();
        } while (isLetter());
        return new Token(NAME, buf.toString());
    }

    void ws() {
        while (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
            consume();
        }
    }

    @Override
    public String getTokenName(int tokenType) {
        return tokenNames[tokenType];
    }
}
