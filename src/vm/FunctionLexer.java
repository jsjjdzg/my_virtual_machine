package vm;// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g 2011-07-07 16:27:08

import org.antlr.runtime.*;

public class FunctionLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int EXPR=11;
    public static final int NEWLINE=23;
    public static final int ASSIGN=9;
    public static final int BLOCK=7;
    public static final int PARAM=6;
    public static final int NUM=12;
    public static final int PARAMATERS=5;
    public static final int CALL=16;
    public static final int WS=24;
    public static final int EOF=-1;
    public static final int FUNCTION=4;
    public static final int NUMBER=22;
    public static final int HALT=17;
    public static final int T__48=48;
    public static final int T__47=47;
    public static final int T__46=46;
    public static final int T__45=45;
    public static final int T__44=44;
    public static final int T__43=43;
    public static final int NOT=14;
    public static final int T__42=42;
    public static final int T__41=41;
    public static final int T__40=40;
    public static final int RETURN=19;
    public static final int NOP=10;
    public static final int IF=21;
    public static final int ID=18;
    public static final int T__39=39;
    public static final int T__38=38;
    public static final int T__37=37;
    public static final int T__36=36;
    public static final int T__35=35;
    public static final int T__34=34;
    public static final int T__33=33;
    public static final int T__32=32;
    public static final int T__31=31;
    public static final int T__30=30;
    public static final int WHILE=20;
    public static final int STMTS=8;
    public static final int VAR=13;
    public static final int NEGATE=15;

        private String errMsg = "";
        public void emitErrorMessage(String msg) {
             errMsg =msg;
             throw new SyntaxErrorException(msg);
        }
        public String getErrorMessage(){
        	return errMsg;
        }


    // delegates
    // delegators

    public FunctionLexer() {;} 
    public FunctionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FunctionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g"; }

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:14:7: ( '(' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:15:7: ( ')' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:16:7: ( ',' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:17:7: ( '{' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:18:7: ( '}' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:19:7: ( ';' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:20:7: ( 'do' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:20:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:21:7: ( 'for' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:21:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:22:7: ( 'else' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:22:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:23:7: ( 'unless' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:23:9: 'unless'
            {
            match("unless"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:24:7: ( '=' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:25:7: ( '||' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:25:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:26:7: ( '&&' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:26:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:27:7: ( '==' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:27:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:28:7: ( '!=' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:28:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:29:7: ( '>' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:29:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:30:7: ( '<' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:30:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:31:7: ( '<=' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:31:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:32:7: ( '>=' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:32:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:33:7: ( '+' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:33:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:34:7: ( '-' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:34:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:35:7: ( '*' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:35:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:36:7: ( '/' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:36:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:37:7: ( '!' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:37:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:135:4: ( 'if' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:135:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:136:7: ( 'while' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:136:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:137:8: ( 'return' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:137:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:138:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:138:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:138:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:139:8: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:139:10: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:139:10: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:139:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:139:22: ( '.' ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:139:23: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:139:27: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:139:28: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:140:8: ( ( '\\r' )? '\\n' )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:140:9: ( '\\r' )? '\\n'
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:140:9: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:140:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:141:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:141:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:141:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | IF | WHILE | RETURN | ID | NUMBER | NEWLINE | WS )
        int alt7=31;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:10: T__25
                {
                mT__25(); 

                }
                break;
            case 2 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:16: T__26
                {
                mT__26(); 

                }
                break;
            case 3 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:22: T__27
                {
                mT__27(); 

                }
                break;
            case 4 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:28: T__28
                {
                mT__28(); 

                }
                break;
            case 5 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:34: T__29
                {
                mT__29(); 

                }
                break;
            case 6 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:40: T__30
                {
                mT__30(); 

                }
                break;
            case 7 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:46: T__31
                {
                mT__31(); 

                }
                break;
            case 8 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:52: T__32
                {
                mT__32(); 

                }
                break;
            case 9 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:58: T__33
                {
                mT__33(); 

                }
                break;
            case 10 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:64: T__34
                {
                mT__34(); 

                }
                break;
            case 11 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:70: T__35
                {
                mT__35(); 

                }
                break;
            case 12 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:76: T__36
                {
                mT__36(); 

                }
                break;
            case 13 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:82: T__37
                {
                mT__37(); 

                }
                break;
            case 14 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:88: T__38
                {
                mT__38(); 

                }
                break;
            case 15 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:94: T__39
                {
                mT__39(); 

                }
                break;
            case 16 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:100: T__40
                {
                mT__40(); 

                }
                break;
            case 17 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:106: T__41
                {
                mT__41(); 

                }
                break;
            case 18 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:112: T__42
                {
                mT__42(); 

                }
                break;
            case 19 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:118: T__43
                {
                mT__43(); 

                }
                break;
            case 20 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:124: T__44
                {
                mT__44(); 

                }
                break;
            case 21 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:130: T__45
                {
                mT__45(); 

                }
                break;
            case 22 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:136: T__46
                {
                mT__46(); 

                }
                break;
            case 23 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:142: T__47
                {
                mT__47(); 

                }
                break;
            case 24 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:148: T__48
                {
                mT__48(); 

                }
                break;
            case 25 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:154: IF
                {
                mIF(); 

                }
                break;
            case 26 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:157: WHILE
                {
                mWHILE(); 

                }
                break;
            case 27 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:163: RETURN
                {
                mRETURN(); 

                }
                break;
            case 28 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:170: ID
                {
                mID(); 

                }
                break;
            case 29 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:173: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 30 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:180: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 31 :
                // E:\\MyEclipse\\workspace\\antlr_app\\src\\Function.g:1:188: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\7\uffff\4\30\1\42\2\uffff\1\44\1\46\1\50\4\uffff\3\30\2\uffff"+
        "\1\34\1\54\1\uffff\1\55\3\30\10\uffff\1\61\2\30\2\uffff\1\64\2\30"+
        "\1\uffff\2\30\1\uffff\1\71\3\30\1\uffff\1\30\1\76\1\30\1\100\1\uffff"+
        "\1\101\2\uffff";
    static final String DFA7_eofS =
        "\102\uffff";
    static final String DFA7_minS =
        "\1\11\6\uffff\2\157\1\154\1\156\1\75\2\uffff\3\75\4\uffff\1\146"+
        "\1\150\1\145\2\uffff\1\12\1\11\1\uffff\1\60\1\162\1\163\1\154\10"+
        "\uffff\1\60\1\151\1\164\2\uffff\1\60\2\145\1\uffff\1\154\1\165\1"+
        "\uffff\1\60\1\163\1\145\1\162\1\uffff\1\163\1\60\1\156\1\60\1\uffff"+
        "\1\60\2\uffff";
    static final String DFA7_maxS =
        "\1\175\6\uffff\2\157\1\154\1\156\1\75\2\uffff\3\75\4\uffff\1\146"+
        "\1\150\1\145\2\uffff\1\12\1\40\1\uffff\1\172\1\162\1\163\1\154\10"+
        "\uffff\1\172\1\151\1\164\2\uffff\1\172\2\145\1\uffff\1\154\1\165"+
        "\1\uffff\1\172\1\163\1\145\1\162\1\uffff\1\163\1\172\1\156\1\172"+
        "\1\uffff\1\172\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\5\uffff\1\14\1\15\3\uffff\1\24"+
        "\1\25\1\26\1\27\3\uffff\1\34\1\35\2\uffff\1\37\4\uffff\1\16\1\13"+
        "\1\17\1\30\1\23\1\20\1\22\1\21\3\uffff\1\36\1\7\3\uffff\1\31\2\uffff"+
        "\1\10\4\uffff\1\11\4\uffff\1\32\1\uffff\1\12\1\33";
    static final String DFA7_specialS =
        "\102\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\34\1\33\2\uffff\1\32\22\uffff\1\34\1\16\4\uffff\1\15\1\uffff"+
            "\1\1\1\2\1\23\1\21\1\3\1\22\1\uffff\1\24\12\31\1\uffff\1\6\1"+
            "\20\1\13\1\17\2\uffff\32\30\6\uffff\3\30\1\7\1\11\1\10\2\30"+
            "\1\25\10\30\1\27\2\30\1\12\1\30\1\26\3\30\1\4\1\14\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "",
            "",
            "\1\43",
            "\1\45",
            "\1\47",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "\1\33",
            "\2\34\2\uffff\1\34\22\uffff\1\34",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\62",
            "\1\63",
            "",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\65",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "\1\75",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\77",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | IF | WHILE | RETURN | ID | NUMBER | NEWLINE | WS );";
        }
    }
 

}