// Generated from tool.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class toolParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, WS=14, NAME=15, WERT=16, BOOLEAN=17, 
		ZAHL=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'bool'", "')'", "'+'", "'*'", "'-'", "'('", "'int'", "'='", 
		"'haupt'", "';'", "'{'", "'/'", "'}'", "WS", "NAME", "WERT", "BOOLEAN", 
		"ZAHL"
	};
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_haupt = 2, RULE_code = 3, RULE_variablen_zuweisung = 4, 
		RULE_ausdruck = 5, RULE_int_ausdruck = 6, RULE_produkt = 7, RULE_faktor = 8, 
		RULE_bool_ausdruck = 9, RULE_variablen_def = 10, RULE_variablen_typ = 11;
	public static final String[] ruleNames = {
		"start", "program", "haupt", "code", "variablen_zuweisung", "ausdruck", 
		"int_ausdruck", "produkt", "faktor", "bool_ausdruck", "variablen_def", 
		"variablen_typ"
	};

	@Override
	public String getGrammarFileName() { return "tool.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public toolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public HauptContext haupt() {
			return getRuleContext(HauptContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); haupt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HauptContext extends ParserRuleContext {
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public HauptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haupt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterHaupt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitHaupt(this);
		}
	}

	public final HauptContext haupt() throws RecognitionException {
		HauptContext _localctx = new HauptContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_haupt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(9);
			setState(29); match(11);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 7) | (1L << NAME))) != 0)) {
				{
				{
				setState(30); code();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public Variablen_defContext variablen_def() {
			return getRuleContext(Variablen_defContext.class,0);
		}
		public Variablen_zuweisungContext variablen_zuweisung() {
			return getRuleContext(Variablen_zuweisungContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_code);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case 1:
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); variablen_def();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); variablen_zuweisung();
				setState(40); match(10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variablen_zuweisungContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public Variablen_zuweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablen_zuweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterVariablen_zuweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitVariablen_zuweisung(this);
		}
	}

	public final Variablen_zuweisungContext variablen_zuweisung() throws RecognitionException {
		Variablen_zuweisungContext _localctx = new Variablen_zuweisungContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variablen_zuweisung);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(NAME);
			setState(45); match(8);
			setState(46); ausdruck();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AusdruckContext extends ParserRuleContext {
		public Bool_ausdruckContext bool_ausdruck() {
			return getRuleContext(Bool_ausdruckContext.class,0);
		}
		public Int_ausdruckContext int_ausdruck() {
			return getRuleContext(Int_ausdruckContext.class,0);
		}
		public AusdruckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausdruck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterAusdruck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitAusdruck(this);
		}
	}

	public final AusdruckContext ausdruck() throws RecognitionException {
		AusdruckContext _localctx = new AusdruckContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ausdruck);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); int_ausdruck();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); bool_ausdruck();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_ausdruckContext extends ParserRuleContext {
		public ProduktContext produkt(int i) {
			return getRuleContext(ProduktContext.class,i);
		}
		public List<ProduktContext> produkt() {
			return getRuleContexts(ProduktContext.class);
		}
		public Int_ausdruckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_ausdruck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterInt_ausdruck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitInt_ausdruck(this);
		}
	}

	public final Int_ausdruckContext int_ausdruck() throws RecognitionException {
		Int_ausdruckContext _localctx = new Int_ausdruckContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_int_ausdruck);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); produkt();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==5) {
				{
				{
				setState(53);
				_la = _input.LA(1);
				if ( !(_la==3 || _la==5) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(54); produkt();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProduktContext extends ParserRuleContext {
		public FaktorContext faktor(int i) {
			return getRuleContext(FaktorContext.class,i);
		}
		public List<FaktorContext> faktor() {
			return getRuleContexts(FaktorContext.class);
		}
		public ProduktContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_produkt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterProdukt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitProdukt(this);
		}
	}

	public final ProduktContext produkt() throws RecognitionException {
		ProduktContext _localctx = new ProduktContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_produkt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); faktor();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==12) {
				{
				{
				setState(61);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==12) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(62); faktor();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaktorContext extends ParserRuleContext {
		public Int_ausdruckContext int_ausdruck() {
			return getRuleContext(Int_ausdruckContext.class,0);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public TerminalNode WERT() { return getToken(toolParser.WERT, 0); }
		public FaktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faktor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterFaktor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitFaktor(this);
		}
	}

	public final FaktorContext faktor() throws RecognitionException {
		FaktorContext _localctx = new FaktorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_faktor);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(6);
				setState(69); int_ausdruck();
				setState(70); match(2);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); match(NAME);
				}
				break;
			case WERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); match(WERT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_ausdruckContext extends ParserRuleContext {
		public Bool_ausdruckContext bool_ausdruck() {
			return getRuleContext(Bool_ausdruckContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(toolParser.BOOLEAN, 0); }
		public Bool_ausdruckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_ausdruck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterBool_ausdruck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitBool_ausdruck(this);
		}
	}

	public final Bool_ausdruckContext bool_ausdruck() throws RecognitionException {
		Bool_ausdruckContext _localctx = new Bool_ausdruckContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_ausdruck);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); match(6);
				setState(77); bool_ausdruck();
				setState(78); match(2);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variablen_defContext extends ParserRuleContext {
		public Variablen_typContext variablen_typ() {
			return getRuleContext(Variablen_typContext.class,0);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public Variablen_zuweisungContext variablen_zuweisung() {
			return getRuleContext(Variablen_zuweisungContext.class,0);
		}
		public Variablen_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablen_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterVariablen_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitVariablen_def(this);
		}
	}

	public final Variablen_defContext variablen_def() throws RecognitionException {
		Variablen_defContext _localctx = new Variablen_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variablen_def);
		try {
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); variablen_typ();
				setState(84); match(NAME);
				setState(85); match(10);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); variablen_typ();
				setState(88); variablen_zuweisung();
				setState(89); match(10);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variablen_typContext extends ParserRuleContext {
		public Variablen_typContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablen_typ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterVariablen_typ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitVariablen_typ(this);
		}
	}

	public final Variablen_typContext variablen_typ() throws RecognitionException {
		Variablen_typContext _localctx = new Variablen_typContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variablen_typ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==7) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\24b\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4\"\n\4\f\4\16\4%\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5-\n\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7\65\n\7\3\b"+
		"\3\b\3\b\7\b:\n\b\f\b\16\b=\13\b\3\t\3\t\3\t\7\tB\n\t\f\t\16\tE\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\nM\n\n\3\13\3\13\3\13\3\13\3\13\5\13T\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f^\n\f\3\r\3\r\3\r\2\16\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\2\5\4\2\5\5\7\7\4\2\6\6\16\16\4\2\3\3\t\t^\2\32\3\2\2"+
		"\2\4\34\3\2\2\2\6\36\3\2\2\2\b,\3\2\2\2\n.\3\2\2\2\f\64\3\2\2\2\16\66"+
		"\3\2\2\2\20>\3\2\2\2\22L\3\2\2\2\24S\3\2\2\2\26]\3\2\2\2\30_\3\2\2\2\32"+
		"\33\5\4\3\2\33\3\3\2\2\2\34\35\5\6\4\2\35\5\3\2\2\2\36\37\7\13\2\2\37"+
		"#\7\r\2\2 \"\5\b\5\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2"+
		"\2%#\3\2\2\2&\'\7\17\2\2\'\7\3\2\2\2(-\5\26\f\2)*\5\n\6\2*+\7\f\2\2+-"+
		"\3\2\2\2,(\3\2\2\2,)\3\2\2\2-\t\3\2\2\2./\7\21\2\2/\60\7\n\2\2\60\61\5"+
		"\f\7\2\61\13\3\2\2\2\62\65\5\16\b\2\63\65\5\24\13\2\64\62\3\2\2\2\64\63"+
		"\3\2\2\2\65\r\3\2\2\2\66;\5\20\t\2\678\t\2\2\28:\5\20\t\29\67\3\2\2\2"+
		":=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\17\3\2\2\2=;\3\2\2\2>C\5\22\n\2?@\t\3"+
		"\2\2@B\5\22\n\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\21\3\2\2\2EC"+
		"\3\2\2\2FG\7\b\2\2GH\5\16\b\2HI\7\4\2\2IM\3\2\2\2JM\7\21\2\2KM\7\22\2"+
		"\2LF\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\23\3\2\2\2NO\7\b\2\2OP\5\24\13\2PQ\7"+
		"\4\2\2QT\3\2\2\2RT\7\23\2\2SN\3\2\2\2SR\3\2\2\2T\25\3\2\2\2UV\5\30\r\2"+
		"VW\7\21\2\2WX\7\f\2\2X^\3\2\2\2YZ\5\30\r\2Z[\5\n\6\2[\\\7\f\2\2\\^\3\2"+
		"\2\2]U\3\2\2\2]Y\3\2\2\2^\27\3\2\2\2_`\t\4\2\2`\31\3\2\2\2\n#,\64;CLS"+
		"]";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}