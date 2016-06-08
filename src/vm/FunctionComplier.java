package vm;// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g 2011-07-07 16:27:08

	import java.util.Map;
	import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;

public class FunctionComplier extends TreeParser {
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


        public FunctionComplier(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public FunctionComplier(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("FunctionComplierTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return FunctionComplier.tokenNames; }
    public String getGrammarFileName() { return "E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g"; }


    	private int seqNum = 0;
    	private int tempNum = 0;
    	private Map<String, String> paramRenameMap ;
    	
    	private List<Instruction> insList;	
    	private void addInstruction(Instruction inc){
    		insList.add(inc);
    	}
       
        private Map<String, List<Instruction>> functionMap = new HashMap<String, List<Instruction>>();
        public Map<String, List<Instruction>> getFunctionMap(){
        	return this.functionMap;
        }    
        
        private int level = 0;


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "prog"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:32:1: prog : ( funDecl )+ ;
    public final FunctionComplier.prog_return prog() throws RecognitionException {
        FunctionComplier.prog_return retval = new FunctionComplier.prog_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:32:5: ( ( funDecl )+ )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:32:7: ( funDecl )+
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:32:7: ( funDecl )+
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
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:32:7: funDecl
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

    protected static class funDecl_scope {
        String funcName;
    }
    protected Stack funDecl_stack = new Stack();

    public static class funDecl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "funDecl"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:34:1: funDecl : ^( FUNCTION fn= ID parmeters block ) ;
    public final FunctionComplier.funDecl_return funDecl() throws RecognitionException {
        funDecl_stack.push(new funDecl_scope());
        FunctionComplier.funDecl_return retval = new FunctionComplier.funDecl_return();
        retval.start = input.LT(1);

        CommonTree fn=null;

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:35:2: ( ^( FUNCTION fn= ID parmeters block ) )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:35:5: ^( FUNCTION fn= ID parmeters block )
            {
            seqNum = 0; tempNum = 0; paramRenameMap = new HashMap<String, String>();
            match(input,FUNCTION,FOLLOW_FUNCTION_in_funDecl73); 

            match(input, Token.DOWN, null); 
            fn=(CommonTree)match(input,ID,FOLLOW_ID_in_funDecl77); 
            ((funDecl_scope)funDecl_stack.peek()).funcName =fn.getText(); List<Instruction> insList = new ArrayList<Instruction>(); functionMap.put(fn.getText(), insList); this.insList=insList;
            pushFollow(FOLLOW_parmeters_in_funDecl85);
            parmeters();

            state._fsp--;

            pushFollow(FOLLOW_block_in_funDecl87);
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
            funDecl_stack.pop();
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
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:40:1: parmeters : ( | ^( PARAMATERS paramDeclList ) );
    public final FunctionComplier.parmeters_return parmeters() throws RecognitionException {
        FunctionComplier.parmeters_return retval = new FunctionComplier.parmeters_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:40:10: ( | ^( PARAMATERS paramDeclList ) )
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
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:41:4: 
                    {
                    }
                    break;
                case 2 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:41:6: ^( PARAMATERS paramDeclList )
                    {
                    match(input,PARAMATERS,FOLLOW_PARAMATERS_in_parmeters104); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_paramDeclList_in_parmeters106);
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
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:44:1: paramDeclList : ( paramDecl )* ;
    public final FunctionComplier.paramDeclList_return paramDeclList() throws RecognitionException {
        FunctionComplier.paramDeclList_return retval = new FunctionComplier.paramDeclList_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:45:2: ( ( paramDecl )* )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:45:4: ( paramDecl )*
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:45:4: ( paramDecl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PARAM) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:45:4: paramDecl
            	    {
            	    pushFollow(FOLLOW_paramDecl_in_paramDeclList117);
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
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:48:1: paramDecl : ^( PARAM p= ID ) ;
    public final FunctionComplier.paramDecl_return paramDecl() throws RecognitionException {
        FunctionComplier.paramDecl_return retval = new FunctionComplier.paramDecl_return();
        retval.start = input.LT(1);

        CommonTree p=null;

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:49:2: ( ^( PARAM p= ID ) )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:49:4: ^( PARAM p= ID )
            {
            match(input,PARAM,FOLLOW_PARAM_in_paramDecl129); 

            match(input, Token.DOWN, null); 
            p=(CommonTree)match(input,ID,FOLLOW_ID_in_paramDecl133); 

            match(input, Token.UP, null); 
            String temp="t"+ tempNum++; paramRenameMap.put(p.getText(),temp);

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
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:52:1: block : ^( BLOCK ^( STMTS stmtList ) ) ;
    public final FunctionComplier.block_return block() throws RecognitionException {
        FunctionComplier.block_return retval = new FunctionComplier.block_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:53:2: ( ^( BLOCK ^( STMTS stmtList ) ) )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:53:4: ^( BLOCK ^( STMTS stmtList ) )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block149); 

            match(input, Token.DOWN, null); 
            match(input,STMTS,FOLLOW_STMTS_in_block152); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_stmtList_in_block154);
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
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:56:1: stmtList : ( stmt )* ;
    public final FunctionComplier.stmtList_return stmtList() throws RecognitionException {
        FunctionComplier.stmtList_return retval = new FunctionComplier.stmtList_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:56:10: ( ( stmt )* )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:56:12: ( stmt )*
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:56:12: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BLOCK||LA4_0==ASSIGN||(LA4_0>=NUM && LA4_0<=CALL)||(LA4_0>=RETURN && LA4_0<=IF)||(LA4_0>=36 && LA4_0<=47)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:56:12: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtList165);
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
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:59:1: stmt : ( ^( RETURN expr ) | ifStmt | whileStmt | block | expr );
    public final FunctionComplier.stmt_return stmt() throws RecognitionException {
        FunctionComplier.stmt_return retval = new FunctionComplier.stmt_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:59:6: ( ^( RETURN expr ) | ifStmt | whileStmt | block | expr )
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
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:60:11: ^( RETURN expr )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_stmt188); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_stmt190);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    if("main".equals(((funDecl_scope)funDecl_stack.peek()).funcName)){addInstruction(new Instruction(seqNum++, "halt"));}else {addInstruction(new Instruction(seqNum++, "ret"));}

                    }
                    break;
                case 2 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:61:5: ifStmt
                    {
                    pushFollow(FOLLOW_ifStmt_in_stmt199);
                    ifStmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:62:5: whileStmt
                    {
                    pushFollow(FOLLOW_whileStmt_in_stmt205);
                    whileStmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:63:5: block
                    {
                    pushFollow(FOLLOW_block_in_stmt211);
                    block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:64:5: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmt217);
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
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:66:1: whileStmt : ^( WHILE expr stmt ) ;
    public final FunctionComplier.whileStmt_return whileStmt() throws RecognitionException {
        FunctionComplier.whileStmt_return retval = new FunctionComplier.whileStmt_return();
        retval.start = input.LT(1);

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:67:1: ( ^( WHILE expr stmt ) )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:68:4: ^( WHILE expr stmt )
            {
            Instruction instruct1 = null, instruct2 = null;insList.add(new Instruction(seqNum++, "rem",  "beginWhile")); int whileTestLine = seqNum;
            match(input,WHILE,FOLLOW_WHILE_in_whileStmt234); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_whileStmt236);
            expr();

            state._fsp--;

            instruct1 =new Instruction(seqNum++, "jz"); insList.add(instruct1);
            pushFollow(FOLLOW_stmt_in_whileStmt244);
            stmt();

            state._fsp--;


            match(input, Token.UP, null); 
            instruct2 =new Instruction(seqNum++, "jmp", whileTestLine+"");insList.add(instruct2);
            int seq = seqNum;instruct1.oprand1=seq+"";
            insList.add(new Instruction(seqNum++, "rem", "endWhile"));

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
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:73:1: ifStmt : ^( IF expr s1= ( stmt ) s2= ( stmt | NOP ) ) ;
    public final FunctionComplier.ifStmt_return ifStmt() throws RecognitionException {
        FunctionComplier.ifStmt_return retval = new FunctionComplier.ifStmt_return();
        retval.start = input.LT(1);

        CommonTree s1=null;
        CommonTree s2=null;

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:74:1: ( ^( IF expr s1= ( stmt ) s2= ( stmt | NOP ) ) )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:75:5: ^( IF expr s1= ( stmt ) s2= ( stmt | NOP ) )
            {
            Instruction instruct1 = null, instruct2 = null;insList.add(new Instruction(seqNum++, "rem",  "beginIf"));
            match(input,IF,FOLLOW_IF_in_ifStmt276); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_ifStmt278);
            expr();

            state._fsp--;

            instruct1 =new Instruction(seqNum++, "jz"); insList.add(instruct1);
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:77:9: ( stmt )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:77:10: stmt
            {
            pushFollow(FOLLOW_stmt_in_ifStmt291);
            stmt();

            state._fsp--;


            }

            instruct2 =new Instruction(seqNum++, "jmp");insList.add(instruct2);
            int seq = seqNum;instruct1.oprand1=seq+"";
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:78:9: ( stmt | NOP )
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
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:78:10: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_ifStmt307);
                    stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:78:15: NOP
                    {
                    match(input,NOP,FOLLOW_NOP_in_ifStmt309); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            int seq2=seqNum;instruct2.oprand1=seq2+"";insList.add(new Instruction(seqNum++, "rem", "endIf"));

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:82:1: expr : ( ^( ASSIGN v= ID expr ) | ^(t= ( '||' ) e1= expr e2= expr ) | ^(t= ( '&&' ) e1= expr e2= expr ) | ^(t= ( '==' ) e1= expr e2= expr ) | ^(t= ( '!=' ) e1= expr e2= expr ) | ^(t= ( '>' ) e1= expr e2= expr ) | ^(t= ( '>=' ) e1= expr e2= expr ) | ^(t= ( '<' ) e1= expr e2= expr ) | ^(t= ( '<=' ) e1= expr e2= expr ) | ^(t= ( '+' ) e1= expr e2= expr ) | ^(t= ( '-' ) e1= expr e2= expr ) | ^(t= ( '*' ) e1= expr e2= expr ) | ^(t= ( '/' ) e1= expr e2= expr ) | ^( NOT e= expr ) | ^( NEGATE e= expr ) | atom );
    public final FunctionComplier.expr_return expr() throws RecognitionException {
        FunctionComplier.expr_return retval = new FunctionComplier.expr_return();
        retval.start = input.LT(1);

        CommonTree v=null;
        CommonTree t=null;
        FunctionComplier.expr_return e1 = null;

        FunctionComplier.expr_return e2 = null;

        FunctionComplier.expr_return e = null;


        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:83:1: ( ^( ASSIGN v= ID expr ) | ^(t= ( '||' ) e1= expr e2= expr ) | ^(t= ( '&&' ) e1= expr e2= expr ) | ^(t= ( '==' ) e1= expr e2= expr ) | ^(t= ( '!=' ) e1= expr e2= expr ) | ^(t= ( '>' ) e1= expr e2= expr ) | ^(t= ( '>=' ) e1= expr e2= expr ) | ^(t= ( '<' ) e1= expr e2= expr ) | ^(t= ( '<=' ) e1= expr e2= expr ) | ^(t= ( '+' ) e1= expr e2= expr ) | ^(t= ( '-' ) e1= expr e2= expr ) | ^(t= ( '*' ) e1= expr e2= expr ) | ^(t= ( '/' ) e1= expr e2= expr ) | ^( NOT e= expr ) | ^( NEGATE e= expr ) | atom )
            int alt7=16;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 38:
                {
                alt7=4;
                }
                break;
            case 39:
                {
                alt7=5;
                }
                break;
            case 40:
                {
                alt7=6;
                }
                break;
            case 43:
                {
                alt7=7;
                }
                break;
            case 41:
                {
                alt7=8;
                }
                break;
            case 42:
                {
                alt7=9;
                }
                break;
            case 44:
                {
                alt7=10;
                }
                break;
            case 45:
                {
                alt7=11;
                }
                break;
            case 46:
                {
                alt7=12;
                }
                break;
            case 47:
                {
                alt7=13;
                }
                break;
            case NOT:
                {
                alt7=14;
                }
                break;
            case NEGATE:
                {
                alt7=15;
                }
                break;
            case NUM:
            case VAR:
            case CALL:
                {
                alt7=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:84:7: ^( ASSIGN v= ID expr )
                    {
                    level +=1;
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr344); 

                    match(input, Token.DOWN, null); 
                    v=(CommonTree)match(input,ID,FOLLOW_ID_in_expr348); 
                    pushFollow(FOLLOW_expr_in_expr350);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    if(level > 1){addInstruction(new Instruction(seqNum++, "dup"));} String var =paramRenameMap.get(v.getText()); if(null==var){String temp="t"+ tempNum++; paramRenameMap.put(v.getText(),temp);var=temp;} addInstruction(new Instruction(seqNum++, "asn", var));
                    level -=1;

                    }
                    break;
                case 2 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:86:4: ^(t= ( '||' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:86:8: ( '||' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:86:9: '||'
                    {
                    match(input,36,FOLLOW_36_in_expr373); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr378);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr382);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "or"));

                    }
                    break;
                case 3 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:87:7: ^(t= ( '&&' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:87:11: ( '&&' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:87:12: '&&'
                    {
                    match(input,37,FOLLOW_37_in_expr397); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr402);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr406);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "and"));

                    }
                    break;
                case 4 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:88:7: ^(t= ( '==' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:88:11: ( '==' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:88:12: '=='
                    {
                    match(input,38,FOLLOW_38_in_expr421); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr426);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr430);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "eq"));

                    }
                    break;
                case 5 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:89:7: ^(t= ( '!=' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:89:11: ( '!=' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:89:12: '!='
                    {
                    match(input,39,FOLLOW_39_in_expr445); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr450);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr454);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "neq"));

                    }
                    break;
                case 6 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:90:7: ^(t= ( '>' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:90:11: ( '>' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:90:12: '>'
                    {
                    match(input,40,FOLLOW_40_in_expr469); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr474);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr478);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "gt"));

                    }
                    break;
                case 7 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:91:7: ^(t= ( '>=' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:91:11: ( '>=' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:91:12: '>='
                    {
                    match(input,43,FOLLOW_43_in_expr493); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr498);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr502);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "ge"));

                    }
                    break;
                case 8 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:92:7: ^(t= ( '<' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:92:11: ( '<' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:92:12: '<'
                    {
                    match(input,41,FOLLOW_41_in_expr517); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr522);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr526);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "lt"));

                    }
                    break;
                case 9 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:93:7: ^(t= ( '<=' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:93:11: ( '<=' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:93:12: '<='
                    {
                    match(input,42,FOLLOW_42_in_expr542); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr547);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr551);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "le"));

                    }
                    break;
                case 10 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:94:7: ^(t= ( '+' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:94:11: ( '+' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:94:12: '+'
                    {
                    match(input,44,FOLLOW_44_in_expr571); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr576);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr580);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "add"));

                    }
                    break;
                case 11 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:95:7: ^(t= ( '-' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:95:11: ( '-' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:95:12: '-'
                    {
                    match(input,45,FOLLOW_45_in_expr600); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr605);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr609);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "sub"));

                    }
                    break;
                case 12 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:96:7: ^(t= ( '*' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:96:11: ( '*' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:96:12: '*'
                    {
                    match(input,46,FOLLOW_46_in_expr628); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr633);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr637);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "mul"));

                    }
                    break;
                case 13 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:97:7: ^(t= ( '/' ) e1= expr e2= expr )
                    {
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:97:11: ( '/' )
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:97:12: '/'
                    {
                    match(input,47,FOLLOW_47_in_expr657); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr662);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr666);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "div"));

                    }
                    break;
                case 14 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:98:4: ^( NOT e= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr690); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr694);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "not"));

                    }
                    break;
                case 15 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:99:4: ^( NEGATE e= expr )
                    {
                    match(input,NEGATE,FOLLOW_NEGATE_in_expr703); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr707);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "ldc", "-1"));addInstruction(new Instruction(seqNum++, "mul"));

                    }
                    break;
                case 16 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:100:4: atom
                    {
                    pushFollow(FOLLOW_atom_in_expr718);
                    atom();

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
    // $ANTLR end "expr"

    public static class atom_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "atom"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:103:1: atom : ( ^( NUM n= NUMBER ) | ^( CALL v= ID el= exprList ) | ^( VAR v= ID ) );
    public final FunctionComplier.atom_return atom() throws RecognitionException {
        FunctionComplier.atom_return retval = new FunctionComplier.atom_return();
        retval.start = input.LT(1);

        CommonTree n=null;
        CommonTree v=null;
        FunctionComplier.exprList_return el = null;


        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:104:1: ( ^( NUM n= NUMBER ) | ^( CALL v= ID el= exprList ) | ^( VAR v= ID ) )
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
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:105:5: ^( NUM n= NUMBER )
                    {
                    match(input,NUM,FOLLOW_NUM_in_atom734); 

                    match(input, Token.DOWN, null); 
                    n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_atom738); 

                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "ldc", n.getText())); 

                    }
                    break;
                case 2 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:106:5: ^( CALL v= ID el= exprList )
                    {
                    match(input,CALL,FOLLOW_CALL_in_atom751); 

                    match(input, Token.DOWN, null); 
                    v=(CommonTree)match(input,ID,FOLLOW_ID_in_atom755); 
                    pushFollow(FOLLOW_exprList_in_atom759);
                    el=exprList();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    addInstruction(new Instruction(seqNum++, "call", v.getText(), (el!=null?el.paramNum:null).toString())); 

                    }
                    break;
                case 3 :
                    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:107:5: ^( VAR v= ID )
                    {
                    match(input,VAR,FOLLOW_VAR_in_atom773); 

                    match(input, Token.DOWN, null); 
                    v=(CommonTree)match(input,ID,FOLLOW_ID_in_atom777); 

                    match(input, Token.UP, null); 
                    String var =paramRenameMap.get(v.getText()); if(null==var){String temp="t"+ tempNum++; paramRenameMap.put(v.getText(),temp);var=temp;} addInstruction(new Instruction(seqNum++, "ldv", var));

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
        public Integer paramNum;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "exprList"
    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:110:1: exprList returns [Integer paramNum] : (vars+= expr )* ;
    public final FunctionComplier.exprList_return exprList() throws RecognitionException {
        FunctionComplier.exprList_return retval = new FunctionComplier.exprList_return();
        retval.start = input.LT(1);

        List list_vars=null;
        RuleReturnScope vars = null;

        retval.paramNum =0;

        try {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:114:1: ( (vars+= expr )* )
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:114:3: (vars+= expr )*
            {
            // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:114:3: (vars+= expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ASSIGN||(LA9_0>=NUM && LA9_0<=CALL)||(LA9_0>=36 && LA9_0<=47)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // E:\\MyEclipse\\workspace\\antlr_app\\src\\FunctionComplier.g:114:4: vars+= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_exprList800);
            	    vars=expr();

            	    state._fsp--;

            	    if (list_vars==null) list_vars=new ArrayList();
            	    list_vars.add(vars.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            retval.paramNum =list_vars.size();

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
    public static final BitSet FOLLOW_FUNCTION_in_funDecl73 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_funDecl77 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_parmeters_in_funDecl85 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_block_in_funDecl87 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMATERS_in_parmeters104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_paramDeclList_in_parmeters106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_paramDecl_in_paramDeclList117 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_PARAM_in_paramDecl129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_paramDecl133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STMTS_in_block152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stmtList_in_block154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_stmt_in_stmtList165 = new BitSet(new long[]{0x0000FFF00039F2A2L});
    public static final BitSet FOLLOW_RETURN_in_stmt188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_stmt190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifStmt_in_stmt199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStmt_in_stmt205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stmt211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStmt234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_whileStmt236 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_stmt_in_whileStmt244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifStmt276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifStmt278 = new BitSet(new long[]{0x0000FFF00039F6A8L});
    public static final BitSet FOLLOW_stmt_in_ifStmt291 = new BitSet(new long[]{0x0000FFF00039F6A8L});
    public static final BitSet FOLLOW_stmt_in_ifStmt307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOP_in_ifStmt309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr348 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_expr373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr378 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_37_in_expr397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr402 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr406 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_38_in_expr421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr426 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_39_in_expr445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr450 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_expr469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr474 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_43_in_expr493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr498 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_41_in_expr517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr522 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr526 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_42_in_expr542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr547 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr551 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_44_in_expr571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr576 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_45_in_expr600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr605 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr609 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_46_in_expr628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr633 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_expr657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr662 = new BitSet(new long[]{0x0000FFF00039F2A8L});
    public static final BitSet FOLLOW_expr_in_expr666 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATE_in_expr703 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_expr718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_atom738 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_atom751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_atom755 = new BitSet(new long[]{0x0000FFF00039F2A0L});
    public static final BitSet FOLLOW_exprList_in_atom759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_atom773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_atom777 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_exprList800 = new BitSet(new long[]{0x0000FFF00039F2A2L});

}