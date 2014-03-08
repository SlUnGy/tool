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
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		WS=25, NAME=26, BOOLEAN=27, ZAHL=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'bool'", "','", "'+'", "'*'", "'-'", "'('", "'<'", "'int'", "'='", 
		"'haupt'", "'!='", "';'", "'<='", "'&&'", "'||'", "'>'", "'{'", "'definiere'", 
		"'/'", "'=='", "'}'", "'>='", "'!'", "WS", "NAME", "BOOLEAN", "ZAHL"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WS", 
		"NAME", "BOOLEAN", "ZAHL"
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
		case 24: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\36\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\6\32\u0084\n\32\r\32\16\32\u0085\3\32\3\32\3"+
		"\33\6\33\u008b\n\33\r\33\16\33\u008c\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u009a\n\34\3\35\3\35\7\35\u009e\n\35\f\35\16"+
		"\35\u00a1\13\35\3\35\5\35\u00a4\n\35\2\36\3\3\1\5\4\1\7\5\1\t\6\1\13\7"+
		"\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\2"+
		"\65\34\1\67\35\19\36\1\3\2\6\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\63;\3\2\62"+
		";\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\3;\3\2\2\2\5=\3\2\2\2\7B\3\2\2\2\tD\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2"+
		"\17J\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31Z\3\2\2"+
		"\2\33]\3\2\2\2\35_\3\2\2\2\37b\3\2\2\2!e\3\2\2\2#h\3\2\2\2%j\3\2\2\2\'"+
		"l\3\2\2\2)v\3\2\2\2+x\3\2\2\2-{\3\2\2\2/}\3\2\2\2\61\u0080\3\2\2\2\63"+
		"\u0083\3\2\2\2\65\u008a\3\2\2\2\67\u0099\3\2\2\29\u00a3\3\2\2\2;<\7+\2"+
		"\2<\4\3\2\2\2=>\7d\2\2>?\7q\2\2?@\7q\2\2@A\7n\2\2A\6\3\2\2\2BC\7.\2\2"+
		"C\b\3\2\2\2DE\7-\2\2E\n\3\2\2\2FG\7,\2\2G\f\3\2\2\2HI\7/\2\2I\16\3\2\2"+
		"\2JK\7*\2\2K\20\3\2\2\2LM\7>\2\2M\22\3\2\2\2NO\7k\2\2OP\7p\2\2PQ\7v\2"+
		"\2Q\24\3\2\2\2RS\7?\2\2S\26\3\2\2\2TU\7j\2\2UV\7c\2\2VW\7w\2\2WX\7r\2"+
		"\2XY\7v\2\2Y\30\3\2\2\2Z[\7#\2\2[\\\7?\2\2\\\32\3\2\2\2]^\7=\2\2^\34\3"+
		"\2\2\2_`\7>\2\2`a\7?\2\2a\36\3\2\2\2bc\7(\2\2cd\7(\2\2d \3\2\2\2ef\7~"+
		"\2\2fg\7~\2\2g\"\3\2\2\2hi\7@\2\2i$\3\2\2\2jk\7}\2\2k&\3\2\2\2lm\7f\2"+
		"\2mn\7g\2\2no\7h\2\2op\7k\2\2pq\7p\2\2qr\7k\2\2rs\7g\2\2st\7t\2\2tu\7"+
		"g\2\2u(\3\2\2\2vw\7\61\2\2w*\3\2\2\2xy\7?\2\2yz\7?\2\2z,\3\2\2\2{|\7\177"+
		"\2\2|.\3\2\2\2}~\7@\2\2~\177\7?\2\2\177\60\3\2\2\2\u0080\u0081\7#\2\2"+
		"\u0081\62\3\2\2\2\u0082\u0084\t\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\b\32\2\2\u0088\64\3\2\2\2\u0089\u008b\t\3\2\2\u008a\u0089\3\2\2"+
		"\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\66"+
		"\3\2\2\2\u008e\u008f\7a\2\2\u008f\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7w\2\2\u0092\u009a\7g\2\2\u0093\u0094\7a\2\2\u0094\u0095\7h\2\2"+
		"\u0095\u0096\7c\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098\u009a"+
		"\7g\2\2\u0099\u008e\3\2\2\2\u0099\u0093\3\2\2\2\u009a8\3\2\2\2\u009b\u009f"+
		"\t\4\2\2\u009c\u009e\t\5\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a4\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a4\7\62\2\2\u00a3\u009b\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		":\3\2\2\2\b\2\u0085\u008c\u0099\u009f\u00a3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}