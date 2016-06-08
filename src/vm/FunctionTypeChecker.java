package vm;// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g 2011-07-07 16:27:08

	import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;
import org.antlr.runtime.tree.TreeRuleReturnScope;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;

import java.util.HashMap;
import java.util.Map;

public class FunctionTypeChecker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "PARAMATERS", "PARAM", "BLOCK", "STMTS", "ASSIGN", "NOP", "EXPR", "NUM", "VAR", "NOT", "NEGATE", "CALL", "HALT", "ID", "RETURN", "WHILE", "IF", "NUMBER", "NEWLINE", "WS", "'('", "')'", "','", "'{'", "'}'", "';'", "'do'", "'for'", "'else'", "'unless'", "'='", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'"
    };
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

    // delegates
    // delegators


        public FunctionTypeChecker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public FunctionTypeChecker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("FunctionTypeCheckerTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return FunctionTypeChecker.tokenNames; }
    public String getGrammarFileName() { return "E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g"; }


    	private static final String bool = "bool";
    	private static final String number = "number";
    	private Map<String, String> symbolTable = new HashMap<String, String>();
    	
    	private void checkType(String expected, String actual, String context){
    		if(!expected.equals(actual)) throw new TypeErrorException(expected, actual, context);
    	}


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "prog"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:24:1: prog : ( funDecl )+ ;
    public final FunctionTypeChecker.prog_return prog() throws RecognitionException {
        FunctionTypeChecker.prog_return retval = new FunctionTypeChecker.prog_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:24:5: ( ( funDecl )+ )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:24:7: ( funDecl )+
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:24:7: ( funDecl )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNCTION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:24:7: funDecl
            	    {
            	    pushFollow(FOLLOW_funDecl_in_prog50);
            	    funDecl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class funDecl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "funDecl"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:26:1: funDecl : ^( FUNCTION ID parmeters block ) ;
    public final FunctionTypeChecker.funDecl_return funDecl() throws RecognitionException {
        FunctionTypeChecker.funDecl_return retval = new FunctionTypeChecker.funDecl_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:27:2: ( ^( FUNCTION ID parmeters block ) )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:27:4: ^( FUNCTION ID parmeters block )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_funDecl62); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_funDecl64); 
            pushFollow(FOLLOW_parmeters_in_funDecl66);
            parmeters();

            state._fsp--;

            pushFollow(FOLLOW_block_in_funDecl68);
            block();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funDecl"

    public static class parmeters_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "parmeters"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:30:1: parmeters : ( | ^( PARAMATERS paramDeclList ) );
    public final FunctionTypeChecker.parmeters_return parmeters() throws RecognitionException {
        FunctionTypeChecker.parmeters_return retval = new FunctionTypeChecker.parmeters_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:30:10: ( | ^( PARAMATERS paramDeclList ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==BLOCK) ) {
                alt2=1;
            }
            else if ( (LA2_0==PARAMATERS) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:31:4: 
                    {
                    }
                    break;
                case 2 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:31:6: ^( PARAMATERS paramDeclList )
                    {
                    match(input,PARAMATERS,FOLLOW_PARAMATERS_in_parmeters85); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_paramDeclList_in_parmeters87);
                        paramDeclList();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parmeters"

    public static class paramDeclList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "paramDeclList"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:34:1: paramDeclList : ( paramDecl )* ;
    public final FunctionTypeChecker.paramDeclList_return paramDeclList() throws RecognitionException {
        FunctionTypeChecker.paramDeclList_return retval = new FunctionTypeChecker.paramDeclList_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:35:2: ( ( paramDecl )* )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:35:4: ( paramDecl )*
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:35:4: ( paramDecl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PARAM) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:35:4: paramDecl
            	    {
            	    pushFollow(FOLLOW_paramDecl_in_paramDeclList98);
            	    paramDecl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "paramDeclList"

    public static class paramDecl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "paramDecl"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:38:1: paramDecl : ^( PARAM p= ID ) ;
    public final FunctionTypeChecker.paramDecl_return paramDecl() throws RecognitionException {
        FunctionTypeChecker.paramDecl_return retval = new FunctionTypeChecker.paramDecl_return();
        retval.start = input.LT(1);

        CommonTree p=null;

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:39:2: ( ^( PARAM p= ID ) )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:39:4: ^( PARAM p= ID )
            {
            match(input,PARAM,FOLLOW_PARAM_in_paramDecl110); 

            match(input, Token.DOWN, null); 
            p=(CommonTree)match(input,ID,FOLLOW_ID_in_paramDecl114); 

            match(input, Token.UP, null); 
            symbolTable.put(p.getText(), number);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "paramDecl"

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:42:1: block : ^( BLOCK ^( STMTS stmtList ) ) ;
    public final FunctionTypeChecker.block_return block() throws RecognitionException {
        FunctionTypeChecker.block_return retval = new FunctionTypeChecker.block_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:43:2: ( ^( BLOCK ^( STMTS stmtList ) ) )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:43:4: ^( BLOCK ^( STMTS stmtList ) )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block133); 

            match(input, Token.DOWN, null); 
            match(input,STMTS,FOLLOW_STMTS_in_block136); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_stmtList_in_block138);
                stmtList();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class stmtList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stmtList"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:46:1: stmtList : ( stmt )* ;
    public final FunctionTypeChecker.stmtList_return stmtList() throws RecognitionException {
        FunctionTypeChecker.stmtList_return retval = new FunctionTypeChecker.stmtList_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:46:10: ( ( stmt )* )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:46:12: ( stmt )*
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:46:12: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BLOCK||LA4_0==ASSIGN||(LA4_0>=NUM && LA4_0<=CALL)||(LA4_0>=RETURN && LA4_0<=IF)||(LA4_0>=36 && LA4_0<=47)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:46:12: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtList149);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stmtList"

    public static class stmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stmt"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:49:1: stmt : ( ^( RETURN expr ) | ifStmt | whileStmt | block | expr );
    public final FunctionTypeChecker.stmt_return stmt() throws RecognitionException {
        FunctionTypeChecker.stmt_return retval = new FunctionTypeChecker.stmt_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:49:6: ( ^( RETURN expr ) | ifStmt | whileStmt | block | expr )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RETURN:
                {
                alt5=1;
                }
                break;
            case IF:
                {
                alt5=2;
                }
                break;
            case WHILE:
                {
                alt5=3;
                }
                break;
            case BLOCK:
                {
                alt5=4;
                }
                break;
            case ASSIGN:
            case NUM:
            case VAR:
            case NOT:
            case NEGATE:
            case CALL:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:50:5: ^( RETURN expr )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_stmt166); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_stmt168);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:51:5: ifStmt
                    {
                    pushFollow(FOLLOW_ifStmt_in_stmt176);
                    ifStmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:52:5: whileStmt
                    {
                    pushFollow(FOLLOW_whileStmt_in_stmt182);
                    whileStmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:53:5: block
                    {
                    pushFollow(FOLLOW_block_in_stmt188);
                    block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:54:5: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmt194);
                    expr();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stmt"

    public static class whileStmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "whileStmt"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:56:1: whileStmt : ^( WHILE e= expr stmt ) ;
    public final FunctionTypeChecker.whileStmt_return whileStmt() throws RecognitionException {
        FunctionTypeChecker.whileStmt_return retval = new FunctionTypeChecker.whileStmt_return();
        retval.start = input.LT(1);

        FunctionTypeChecker.expr_return e = null;


        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:57:1: ( ^( WHILE e= expr stmt ) )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:58:2: ^( WHILE e= expr stmt )
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStmt205); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_whileStmt209);
            e=expr();

            state._fsp--;

            checkType(bool, e.clazz, input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(retval.start),
              input.getTreeAdaptor().getTokenStopIndex(retval.start)));
            pushFollow(FOLLOW_stmt_in_whileStmt217);
            stmt();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStmt"

    public static class ifStmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ifStmt"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:61:1: ifStmt : ^( IF e= expr ( stmt ) ( stmt | NOP ) ) ;
    public final FunctionTypeChecker.ifStmt_return ifStmt() throws RecognitionException {
        FunctionTypeChecker.ifStmt_return retval = new FunctionTypeChecker.ifStmt_return();
        retval.start = input.LT(1);

        FunctionTypeChecker.expr_return e = null;


        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:62:1: ( ^( IF e= expr ( stmt ) ( stmt | NOP ) ) )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:64:4: ^( IF e= expr ( stmt ) ( stmt | NOP ) )
            {
            match(input,IF,FOLLOW_IF_in_ifStmt239); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_ifStmt243);
            e=expr();

            state._fsp--;

            checkType(bool, e.clazz, input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(retval.start),
              input.getTreeAdaptor().getTokenStopIndex(retval.start)));
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:65:6: ( stmt )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:65:7: stmt
            {
            pushFollow(FOLLOW_stmt_in_ifStmt254);
            stmt();

            state._fsp--;


            }

            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:66:6: ( stmt | NOP )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BLOCK||LA6_0==ASSIGN||(LA6_0>=NUM && LA6_0<=CALL)||(LA6_0>=RETURN && LA6_0<=IF)||(LA6_0>=36 && LA6_0<=47)) ) {
                alt6=1;
            }
            else if ( (LA6_0==NOP) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:66:7: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_ifStmt265);
                    stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:66:12: NOP
                    {
                    match(input,NOP,FOLLOW_NOP_in_ifStmt267); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStmt"

    public static class expr_return extends TreeRuleReturnScope {
        public String clazz;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:70:1: expr returns [String clazz] : ( ^( ASSIGN v= ID e= expr ) | ^(t= ( '||' | '&&' ) e1= expr e2= expr ) | ^(t= ( '==' | '!=' | '>' | '>=' | '<' | '<=' ) e1= expr e2= expr ) | ^(t= ( '+' | '-' | '*' | '/' ) e1= expr e2= expr ) | ^( NOT e= expr ) | ^( NEGATE e= expr ) | a= atom );
    public final FunctionTypeChecker.expr_return expr() throws RecognitionException {
        FunctionTypeChecker.expr_return retval = new FunctionTypeChecker.expr_return();
        retval.start = input.LT(1);

        CommonTree v=null;
        CommonTree t=null;
        FunctionTypeChecker.expr_return e = null;

        FunctionTypeChecker.expr_return e1 = null;

        FunctionTypeChecker.expr_return e2 = null;

        FunctionTypeChecker.atom_return a = null;


        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:71:1: ( ^( ASSIGN v= ID e= expr ) | ^(t= ( '||' | '&&' ) e1= expr e2= expr ) | ^(t= ( '==' | '!=' | '>' | '>=' | '<' | '<=' ) e1= expr e2= expr ) | ^(t= ( '+' | '-' | '*' | '/' ) e1= expr e2= expr ) | ^( NOT e= expr ) | ^( NEGATE e= expr ) | a= atom )
            int alt7=7;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt7=1;
                }
                break;
            case 36:
            case 37:
                {
                alt7=2;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt7=3;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
                {
                alt7=4;
                }
                break;
            case NOT:
                {
                alt7=5;
                }
                break;
            case NEGATE:
                {
                alt7=6;
                }
                break;
            case NUM:
            case VAR:
            case CALL:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:72:7: ^( ASSIGN v= ID e= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr294); 

                    match(input, Token.DOWN, null); 
                    v=(CommonTree)match(input,ID,FOLLOW_ID_in_expr298); 
                    pushFollow(FOLLOW_expr_in_expr302);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    symbolTable.put(v.getText(), e.clazz); retval.clazz =e.clazz;

                    }
                    break;
                case 2 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:73:7: ^(t= ( '||' | '&&' ) e1= expr e2= expr )
                    {
                    t=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr329);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr333);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    checkType(bool, e1.clazz, input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(retval.start),
                      input.getTreeAdaptor().getTokenStopIndex(retval.start))); checkType(bool, e2.clazz, input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(retval.start),
                      input.getTreeAdaptor().getTokenStopIndex(retval.start))); retval.clazz = bool;

                    }
                    break;
                case 3 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:74:7: ^(t= ( '==' | '!=' | '>' | '>=' | '<' | '<=' ) e1= expr e2= expr )
                    {
                    t=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=38 && input.LA(1)<=43) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr363);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr367);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    checkType(number, e1.clazz, input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(retval.start),
                      input.getTreeAdaptor().getTokenStopIndex(retval.start))); checkType(number, e2.clazz, input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(retval.start),
                      input.getTreeAdaptor().getTokenStopIndex(retval.start))); retval.clazz = bool;

                    }
                    break;
                case 4 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:75:7: ^(t= ( '+' | '-' | '*' | '/' ) e1= expr e2= expr )
                    {
                    t=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=44 && input.LA(1)<=47) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr393);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr397);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    checkType(number, e1.clazz, input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(retval.start),
                      input.getTreeAdaptor().getTokenStopIndex(retval.start))); checkType(number, e2.clazz, input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(retval.start),
                      input.getTreeAdaptor().getTokenStopIndex(retval.start))); retval.clazz = number;

                    }
                    break;
                case 5 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:76:4: ^( NOT e= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr406); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr410);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    checkType(bool, e.clazz, input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(retval.start),
                      input.getTreeAdaptor().getTokenStopIndex(retval.start))); retval.clazz = bool;

                    }
                    break;
                case 6 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:77:4: ^( NEGATE e= expr )
                    {
                    match(input,NEGATE,FOLLOW_NEGATE_in_expr419); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr423);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    checkType(number, e.clazz, input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(retval.start),
                      input.getTreeAdaptor().getTokenStopIndex(retval.start))); retval.clazz = number;

                    }
                    break;
                case 7 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:78:4: a= atom
                    {
                    pushFollow(FOLLOW_atom_in_expr436);
                    a=atom();

                    state._fsp--;

                    retval.clazz =a.clazz;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class atom_return extends TreeRuleReturnScope {
        public String clazz;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "atom"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:81:1: atom returns [String clazz] : ( ^( NUM NUMBER ) | ^( CALL ID exprList ) | ^( VAR v= ID ) );
    public final FunctionTypeChecker.atom_return atom() throws RecognitionException {
        FunctionTypeChecker.atom_return retval = new FunctionTypeChecker.atom_return();
        retval.start = input.LT(1);

        CommonTree v=null;

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:82:1: ( ^( NUM NUMBER ) | ^( CALL ID exprList ) | ^( VAR v= ID ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case NUM:
                {
                alt8=1;
                }
                break;
            case CALL:
                {
                alt8=2;
                }
                break;
            case VAR:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:83:5: ^( NUM NUMBER )
                    {
                    match(input,NUM,FOLLOW_NUM_in_atom455); 

                    match(input, Token.DOWN, null); 
                    match(input,NUMBER,FOLLOW_NUMBER_in_atom457); 

                    match(input, Token.UP, null); 
                    retval.clazz = number;

                    }
                    break;
                case 2 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:84:5: ^( CALL ID exprList )
                    {
                    match(input,CALL,FOLLOW_CALL_in_atom470); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_atom472); 
                    pushFollow(FOLLOW_exprList_in_atom474);
                    exprList();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.clazz = number;

                    }
                    break;
                case 3 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:85:5: ^( VAR v= ID )
                    {
                    match(input,VAR,FOLLOW_VAR_in_atom488); 

                    match(input, Token.DOWN, null); 
                    v=(CommonTree)match(input,ID,FOLLOW_ID_in_atom492); 

                    match(input, Token.UP, null); 
                    retval.clazz =symbolTable.get(v.getText()); if(null==retval.clazz){retval.clazz = number;} 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class exprList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "exprList"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:88:1: exprList : ( expr )* ;
    public final FunctionTypeChecker.exprList_return exprList() throws RecognitionException {
        FunctionTypeChecker.exprList_return retval = new FunctionTypeChecker.exprList_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:89:1: ( ( expr )* )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:89:3: ( expr )*
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:89:3: ( expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ASSIGN||(LA9_0>=NUM && LA9_0<=CALL)||(LA9_0>=36 && LA9_0<=47)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionTypeChecker.g:89:3: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_exprList505);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprList"

    // Delegated rules


 

    public static final BitSet FOLLOW_funDecl_in_prog50 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_FUNCTION_in_funDecl62 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_funDecl64 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_parmeters_in_funDecl66 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_block_in_funDecl68 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMATERS_in_parmeters85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_paramDeclList_in_parmeters87 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_paramDecl_in_paramDeclList98 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_PARAM_in_paramDecl110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_paramDecl114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STMTS_in_block136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stmtList_in_block138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_stmt_in_stmtList149 = new BitSet(new long[]{0x0000FFF00039F2A2L});
    public static final BitSet FOLLOW_RETURN_in_stmt166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_stmt168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifStmt_in_stmt176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStmt_in_stmt182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stmt188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStmt205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_whileStmt209 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_stmt_in_whileStmt217 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifStmt239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifStmt243 = new BitSet(new long[]{0x0000FFF00039F6A8L});
    public static final BitSet FOLLOW_stmt_in_ifStmt254 = new BitSet(new long[]{0x0000FFF00039F6A8L});
    public static final BitSet FOLLOW_stmt_in_ifStmt265 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOP_in_ifStmt267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr298 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expr321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr329 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expr347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr363 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expr381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr393 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATE_in_expr419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_expr436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_atom457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_atom470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_atom472 = new BitSet(new long[]{0x0000FFF00039F2A0L});
    public static final BitSet FOLLOW_exprList_in_atom474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_atom488 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_atom492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_exprList505 = new BitSet(new long[]{0x0000FFF00039F2A2L});

}