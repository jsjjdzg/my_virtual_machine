// Generated from D:/workspace/soul_virtual_machine\Cymbol.g4 by ANTLR 4.5.1
package antlrv4_generator_current;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, K_FLOAT=15, K_INT=16, 
		K_VOID=17, ID=18, INT=19, WS=20, SL_COMMENT=21, MUL=22, DIV=23, ADD=24, 
		SUB=25, NEG=26, NOT=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "K_FLOAT", "K_INT", "K_VOID", 
		"ID", "LETTER", "INT", "WS", "SL_COMMENT", "MUL", "DIV", "ADD", "SUB", 
		"NEG", "NOT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'('", "')'", "','", "'{'", "'}'", "'if'", "'then'", 
		"'else'", "'return'", "'['", "']'", "'=='", "'float'", "'int'", "'void'", 
		null, null, null, null, "'*'", "'/'", "'+'", null, null, "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "K_FLOAT", "K_INT", "K_VOID", "ID", "INT", "WS", "SL_COMMENT", 
		"MUL", "DIV", "ADD", "SUB", "NEG", "NOT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CymbolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cymbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\7\23w\n\23\f\23\16\23z\13\23\3\24\3\24"+
		"\3\25\6\25\177\n\25\r\25\16\25\u0080\3\26\6\26\u0084\n\26\r\26\16\26\u0085"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u008e\n\27\f\27\16\27\u0091\13\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\u008f\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\26-\27/\30\61\31\63"+
		"\32\65\33\67\349\35\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00a5\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2"+
		"\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3\2\2"+
		"\2\23L\3\2\2\2\25Q\3\2\2\2\27V\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35a\3\2"+
		"\2\2\37d\3\2\2\2!j\3\2\2\2#n\3\2\2\2%s\3\2\2\2\'{\3\2\2\2)~\3\2\2\2+\u0083"+
		"\3\2\2\2-\u0089\3\2\2\2/\u0096\3\2\2\2\61\u0098\3\2\2\2\63\u009a\3\2\2"+
		"\2\65\u009c\3\2\2\2\67\u009e\3\2\2\29\u00a0\3\2\2\2;<\7?\2\2<\4\3\2\2"+
		"\2=>\7=\2\2>\6\3\2\2\2?@\7*\2\2@\b\3\2\2\2AB\7+\2\2B\n\3\2\2\2CD\7.\2"+
		"\2D\f\3\2\2\2EF\7}\2\2F\16\3\2\2\2GH\7\177\2\2H\20\3\2\2\2IJ\7k\2\2JK"+
		"\7h\2\2K\22\3\2\2\2LM\7v\2\2MN\7j\2\2NO\7g\2\2OP\7p\2\2P\24\3\2\2\2QR"+
		"\7g\2\2RS\7n\2\2ST\7u\2\2TU\7g\2\2U\26\3\2\2\2VW\7t\2\2WX\7g\2\2XY\7v"+
		"\2\2YZ\7w\2\2Z[\7t\2\2[\\\7p\2\2\\\30\3\2\2\2]^\7]\2\2^\32\3\2\2\2_`\7"+
		"_\2\2`\34\3\2\2\2ab\7?\2\2bc\7?\2\2c\36\3\2\2\2de\7h\2\2ef\7n\2\2fg\7"+
		"q\2\2gh\7c\2\2hi\7v\2\2i \3\2\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2m\"\3\2\2"+
		"\2no\7x\2\2op\7q\2\2pq\7k\2\2qr\7f\2\2r$\3\2\2\2sx\5\'\24\2tw\5\'\24\2"+
		"uw\t\2\2\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y&\3\2\2\2"+
		"zx\3\2\2\2{|\t\3\2\2|(\3\2\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081*\3\2\2\2\u0082\u0084\t\4\2"+
		"\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\26\2\2\u0088,\3\2\2\2\u0089"+
		"\u008a\7\61\2\2\u008a\u008b\7\61\2\2\u008b\u008f\3\2\2\2\u008c\u008e\13"+
		"\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\f"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\27\2\2\u0095.\3\2\2\2\u0096\u0097"+
		"\7,\2\2\u0097\60\3\2\2\2\u0098\u0099\7\61\2\2\u0099\62\3\2\2\2\u009a\u009b"+
		"\7-\2\2\u009b\64\3\2\2\2\u009c\u009d\7/\2\2\u009d\66\3\2\2\2\u009e\u009f"+
		"\7/\2\2\u009f8\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1:\3\2\2\2\b\2vx\u0080\u0085"+
		"\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}