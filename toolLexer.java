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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, WS=14, NAME=15, WERT=16, BOOLEAN=17, 
		ZAHL=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'bool'", "')'", "'+'", "'*'", "'-'", "'('", "'int'", "'='", "'haupt'", 
		"';'", "'{'", "'/'", "'}'", "WS", "NAME", "WERT", "BOOLEAN", "ZAHL"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "WS", "NAME", "WERT", "BOOLEAN", "ZAHL"
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
		case 13: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\24o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\6\17L\n\17\r\17\16\17M\3\17\3\17\3\20\6\20S\n\20\r"+
		"\20\16\20T\3\21\3\21\5\21Y\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22d\n\22\3\23\3\23\7\23h\n\23\f\23\16\23k\13\23\3\23\5\23n\n\23"+
		"\2\24\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f"+
		"\1\27\r\1\31\16\1\33\17\1\35\20\2\37\21\1!\22\1#\23\1%\24\1\3\2\6\5\2"+
		"\13\f\17\17\"\"\4\2C\\c|\3\2\63;\3\2\62;t\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2"+
		"\5,\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\17\66\3"+
		"\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25B\3\2\2\2\27D\3\2\2\2\31F\3\2\2\2\33"+
		"H\3\2\2\2\35K\3\2\2\2\37R\3\2\2\2!X\3\2\2\2#c\3\2\2\2%m\3\2\2\2\'(\7d"+
		"\2\2()\7q\2\2)*\7q\2\2*+\7n\2\2+\4\3\2\2\2,-\7+\2\2-\6\3\2\2\2./\7-\2"+
		"\2/\b\3\2\2\2\60\61\7,\2\2\61\n\3\2\2\2\62\63\7/\2\2\63\f\3\2\2\2\64\65"+
		"\7*\2\2\65\16\3\2\2\2\66\67\7k\2\2\678\7p\2\289\7v\2\29\20\3\2\2\2:;\7"+
		"?\2\2;\22\3\2\2\2<=\7j\2\2=>\7c\2\2>?\7w\2\2?@\7r\2\2@A\7v\2\2A\24\3\2"+
		"\2\2BC\7=\2\2C\26\3\2\2\2DE\7}\2\2E\30\3\2\2\2FG\7\61\2\2G\32\3\2\2\2"+
		"HI\7\177\2\2I\34\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2NO\3\2\2\2OP\b\17\2\2P\36\3\2\2\2QS\t\3\2\2RQ\3\2\2\2ST\3\2\2\2TR"+
		"\3\2\2\2TU\3\2\2\2U \3\2\2\2VY\5%\23\2WY\5#\22\2XV\3\2\2\2XW\3\2\2\2Y"+
		"\"\3\2\2\2Z[\7v\2\2[\\\7t\2\2\\]\7w\2\2]d\7g\2\2^_\7h\2\2_`\7c\2\2`a\7"+
		"n\2\2ab\7u\2\2bd\7g\2\2cZ\3\2\2\2c^\3\2\2\2d$\3\2\2\2ei\t\4\2\2fh\t\5"+
		"\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jn\3\2\2\2ki\3\2\2\2ln\7\62"+
		"\2\2me\3\2\2\2ml\3\2\2\2n&\3\2\2\2\t\2MTXcim";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}