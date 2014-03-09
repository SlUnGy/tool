// Generated from tool.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class toolLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, MAIN=21, IF=22, ELSEIF=23, ELSE=24, 
		DEFINE=25, TYPE_INT=26, TYPE_BOOL=27, TYPE_STRING=28, NAME=29, STRING=30, 
		BOOLEAN=31, NUMBER=32, WS=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'+'", "'*'", "'-'", "'('", "'<'", "'='", "'!='", "';'", 
		"'<='", "'&&'", "'||'", "'>'", "'{'", "'/'", "'=='", "'}'", "'>='", "'!'", 
		"'_haupt'", "'_wenn'", "'_oder_dies'", "'_sonst'", "'definiere'", "'int'", 
		"'bool'", "'str'", "NAME", "STRING", "BOOLEAN", "NUMBER", "WS"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "MAIN", "IF", "ELSEIF", "ELSE", "DEFINE", "TYPE_INT", 
		"TYPE_BOOL", "TYPE_STRING", "NAME", "STRING", "BOOLEAN", "NUMBER", "WS"
	};


	public toolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tool.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 32: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2#\u00d5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\6\36\u00ab\n\36\r\36\16\36\u00ac\3\37\3\37\7\37\u00b1\n\37\f\37\16"+
		"\37\u00b4\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00c3\n"+
		" \3!\3!\7!\u00c7\n!\f!\16!\u00ca\13!\3!\5!\u00cd\n!\3\"\6\"\u00d0\n\""+
		"\r\"\16\"\u00d1\3\"\3\"\3\u00b2#\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!"+
		"\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\2\3\2\6\4\2C\\c|\3\2\63;\3\2\62"+
		";\5\2\13\f\17\17\"\"\u00da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2"+
		"\2\17Q\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31]\3\2"+
		"\2\2\33`\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i\3\2\2\2%l\3\2\2\2"+
		"\'n\3\2\2\2)q\3\2\2\2+s\3\2\2\2-z\3\2\2\2/\u0080\3\2\2\2\61\u008b\3\2"+
		"\2\2\63\u0092\3\2\2\2\65\u009c\3\2\2\2\67\u00a0\3\2\2\29\u00a5\3\2\2\2"+
		";\u00aa\3\2\2\2=\u00ae\3\2\2\2?\u00c2\3\2\2\2A\u00cc\3\2\2\2C\u00cf\3"+
		"\2\2\2EF\7+\2\2F\4\3\2\2\2GH\7.\2\2H\6\3\2\2\2IJ\7-\2\2J\b\3\2\2\2KL\7"+
		",\2\2L\n\3\2\2\2MN\7/\2\2N\f\3\2\2\2OP\7*\2\2P\16\3\2\2\2QR\7>\2\2R\20"+
		"\3\2\2\2ST\7?\2\2T\22\3\2\2\2UV\7#\2\2VW\7?\2\2W\24\3\2\2\2XY\7=\2\2Y"+
		"\26\3\2\2\2Z[\7>\2\2[\\\7?\2\2\\\30\3\2\2\2]^\7(\2\2^_\7(\2\2_\32\3\2"+
		"\2\2`a\7~\2\2ab\7~\2\2b\34\3\2\2\2cd\7@\2\2d\36\3\2\2\2ef\7}\2\2f \3\2"+
		"\2\2gh\7\61\2\2h\"\3\2\2\2ij\7?\2\2jk\7?\2\2k$\3\2\2\2lm\7\177\2\2m&\3"+
		"\2\2\2no\7@\2\2op\7?\2\2p(\3\2\2\2qr\7#\2\2r*\3\2\2\2st\7a\2\2tu\7j\2"+
		"\2uv\7c\2\2vw\7w\2\2wx\7r\2\2xy\7v\2\2y,\3\2\2\2z{\7a\2\2{|\7y\2\2|}\7"+
		"g\2\2}~\7p\2\2~\177\7p\2\2\177.\3\2\2\2\u0080\u0081\7a\2\2\u0081\u0082"+
		"\7q\2\2\u0082\u0083\7f\2\2\u0083\u0084\7g\2\2\u0084\u0085\7t\2\2\u0085"+
		"\u0086\7a\2\2\u0086\u0087\7f\2\2\u0087\u0088\7k\2\2\u0088\u0089\7g\2\2"+
		"\u0089\u008a\7u\2\2\u008a\60\3\2\2\2\u008b\u008c\7a\2\2\u008c\u008d\7"+
		"u\2\2\u008d\u008e\7q\2\2\u008e\u008f\7p\2\2\u008f\u0090\7u\2\2\u0090\u0091"+
		"\7v\2\2\u0091\62\3\2\2\2\u0092\u0093\7f\2\2\u0093\u0094\7g\2\2\u0094\u0095"+
		"\7h\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7t\2\2\u009a\u009b\7g\2\2\u009b\64\3\2\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\66\3\2\2\2\u00a0"+
		"\u00a1\7d\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7n\2\2"+
		"\u00a48\3\2\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2"+
		"\2\u00a8:\3\2\2\2\u00a9\u00ab\t\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad<\3\2\2\2\u00ae"+
		"\u00b2\7$\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7a\2\2\u00b8"+
		"\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7w\2\2\u00bb\u00c3\7g\2\2"+
		"\u00bc\u00bd\7a\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0"+
		"\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c3\7g\2\2\u00c2\u00b7\3\2\2\2\u00c2"+
		"\u00bc\3\2\2\2\u00c3@\3\2\2\2\u00c4\u00c8\t\3\2\2\u00c5\u00c7\t\4\2\2"+
		"\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\62\2\2"+
		"\u00cc\u00c4\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cdB\3\2\2\2\u00ce\u00d0\t"+
		"\5\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\"\2\2\u00d4D\3\2\2\2"+
		"\t\2\u00ac\u00b2\u00c2\u00c8\u00cc\u00d1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}