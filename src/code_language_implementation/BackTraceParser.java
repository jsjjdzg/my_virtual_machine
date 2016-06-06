package code_language_implementation;

import java.util.*;

/**
 * Created by szj on 2016/6/4.
 * 回溯
 */
public class BackTraceParser {
    Lexer input;
    Stack<Integer> marks = new Stack<>();
    List<Token> lookahead = new ArrayList<>();
    int p = 0;

    static int FAILED = -1;
    static int UNKNOWN = 0;
    static int KNOWN = 1;
    Map<Integer, Integer> list_memo = new HashMap<>();

    public BackTraceParser(Lexer input) {
        this.input = input;
    }

    //演算
    public void list() {
        boolean failed = false;
        int startTokenIndex = index();
        if (isSpeculating() && alreadyParsedRule(list_memo)) {
            return;
        }
        try {
            _list();
        } catch (Exception e) {
            failed = true;
            throw e;
        } finally {
            if (isSpeculating()) {
                memoize(list_memo, startTokenIndex, failed);
            }
        }
    }

    public boolean alreadyParsedRule(Map<Integer, Integer> memoization) {
        Integer memoI = memoization.get(index());
        if (memoI == null) {
            return false;
        }
        int memo = memoI.intValue();
        System.out.println("parsed list before at index " + index() +
                "skip head to token index " + memo + " : " + lookahead.get(memo).text);
        if (memo == FAILED) {
            throw new Error("曾经parse出错");
        }
        seek(memo);
        return true;
    }

    public void memoize(Map<Integer, Integer> memoization, int startTokenIndex, boolean failed) {
        int stopTokenIndex = failed ? FAILED : index();
        memoization.put(startTokenIndex, stopTokenIndex);
    }

    public int index() {
        return p;
    }

    public void _list() {
        match(ListLexer.LBRACK);
        elements();
        match(ListLexer.RBRACK);
    }

    public void _assign() {
        list();
        match(ListLexer.EQUAL);
        list();
    }


    public void stat() {
        if (speculate_stat_alt1()) {
            list();
            match(Lexer.EOF_TYPE);
        } else if (speculate_stat_alt2()) {
            _assign();
            match(Lexer.EOF_TYPE);
        } else {
            throw new Error("expecting stat found" + lt(1));
        }
    }

    public boolean speculate_stat_alt1() {
        boolean success = true;
        mark();
        try {
            list();
            match(Lexer.EOF_TYPE);
        } catch (Error e) {
            success = false;
        }
        release();
        return success;
    }

    public boolean speculate_stat_alt2() {
        boolean success = true;
        mark();
        try {
            _assign();
            match(Lexer.EOF_TYPE);
        } catch (Error e) {
            success = false;
        }
        release();
        return success;
    }

    public void consume() {
        p++;
        if (p == lookahead.size() && !isSpeculating()) {
            p = 0;
            lookahead.clear();
            list_memo.clear();
        }
        sync(1);
    }

    /**
     * 保证向前看n个元素，缓冲中有足够的容量
     **/
    public void sync(int i) {
        if (p + i - 1 > (lookahead.size() - 1)) {
            int n = (p + i + 1) - (lookahead.size() - 1);
            fill(n);
        }
    }

    public void fill(int n) {
        for (int i = 1; i <= n; i++) {
            lookahead.add(input.nextToken());
        }
    }

    public int mark() {
        marks.push(p);
        return p;
    }

    public void release() {
        int mark = marks.pop();
        seek(mark);
    }

    public void seek(int index) {
        p = index;
    }

    public boolean isSpeculating() {
        return marks.size() > 0;
    }


    public void elements() {
        element();
        while (lookahead.get(p).type == ListLexer.COMMA) {
            match(ListLexer.COMMA);
            element();
        }
    }

    public void element() {
        if (la(1) == ListLexer.NAME && la(2) == ListLexer.EQUAL) {
            match(ListLexer.NAME);
            match(ListLexer.EQUAL);
            match(ListLexer.NAME);
        } else if (la(1) == ListLexer.NAME) {
            match(ListLexer.NAME);
        } else if (la(1) == ListLexer.LBRACK) {
            list();
        } else {
            throw new Error("excepting name or list; found" + lt(1));
        }
    }

    public void match(int x) {
        if (la(1) == x) {
            System.out.println(lt(1));
            consume();
        } else {
            throw new Error("expecting" + input.getTokenName(x) + "; found " + lt(1));
        }
    }

    public Token lt(int i) {
        sync(i);
        return lookahead.get(p + i - 1);
    }

    public int la(int i) {
        return lt(i).type;
    }

    public static void main(String[] arg0) {
        Lexer lexer = new ListLexer("[a,b]=[b,c]");
        BackTraceParser parser = new BackTraceParser(lexer);
        parser.stat();

    }
}
