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
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		WS=25, NAME=26, BOOLEAN=27, ZAHL=28;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'bool'", "','", "'+'", "'*'", "'-'", "'('", "'<'", 
		"'int'", "'='", "'haupt'", "'!='", "';'", "'<='", "'&&'", "'||'", "'>'", 
		"'{'", "'definiere'", "'/'", "'=='", "'}'", "'>='", "'!'", "WS", "NAME", 
		"BOOLEAN", "ZAHL"
	};
	public static final int
		RULE_start = 0, RULE_haupt = 1, RULE_def = 2, RULE_code = 3, RULE_zuweisung = 4, 
		RULE_ausdruck = 5, RULE_int_ausdruck = 6, RULE_produkt = 7, RULE_int_faktor = 8, 
		RULE_bool_ausdruck = 9, RULE_bool_faktor = 10, RULE_variablen_def = 11, 
		RULE_daten_typ = 12, RULE_funktions_def = 13, RULE_funktions_aufruf = 14, 
		RULE_parameter = 15;
	public static final String[] ruleNames = {
		"start", "haupt", "def", "code", "zuweisung", "ausdruck", "int_ausdruck", 
		"produkt", "int_faktor", "bool_ausdruck", "bool_faktor", "variablen_def", 
		"daten_typ", "funktions_def", "funktions_aufruf", "parameter"
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
		public HauptContext haupt() {
			return getRuleContext(HauptContext.class,0);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << 19))) != 0)) {
				{
				{
				setState(32); def();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38); haupt();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << 19))) != 0)) {
				{
				{
				setState(39); def();
				}
				}
				setState(44);
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
		enterRule(_localctx, 2, RULE_haupt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(11);
			setState(46); match(18);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << NAME))) != 0)) {
				{
				{
				setState(47); code();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53); match(22);
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

	public static class DefContext extends ParserRuleContext {
		public Variablen_defContext variablen_def() {
			return getRuleContext(Variablen_defContext.class,0);
		}
		public Funktions_defContext funktions_def() {
			return getRuleContext(Funktions_defContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case 2:
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); variablen_def();
				setState(56); match(13);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); funktions_def();
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

	public static class CodeContext extends ParserRuleContext {
		public Variablen_defContext variablen_def() {
			return getRuleContext(Variablen_defContext.class,0);
		}
		public Funktions_aufrufContext funktions_aufruf() {
			return getRuleContext(Funktions_aufrufContext.class,0);
		}
		public ZuweisungContext zuweisung() {
			return getRuleContext(ZuweisungContext.class,0);
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
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); variablen_def();
				setState(62); match(13);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); zuweisung();
				setState(65); match(13);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); funktions_aufruf();
				setState(68); match(13);
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

	public static class ZuweisungContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public ZuweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zuweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterZuweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitZuweisung(this);
		}
	}

	public final ZuweisungContext zuweisung() throws RecognitionException {
		ZuweisungContext _localctx = new ZuweisungContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_zuweisung);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(NAME);
			setState(73); match(10);
			setState(74); ausdruck();
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
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); int_ausdruck();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); bool_ausdruck();
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
			setState(80); produkt();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==6) {
				{
				{
				setState(81);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==6) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(82); produkt();
				}
				}
				setState(87);
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
		public Int_faktorContext int_faktor(int i) {
			return getRuleContext(Int_faktorContext.class,i);
		}
		public List<Int_faktorContext> int_faktor() {
			return getRuleContexts(Int_faktorContext.class);
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
			setState(88); int_faktor();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5 || _la==20) {
				{
				{
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==5 || _la==20) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(90); int_faktor();
				}
				}
				setState(95);
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

	public static class Int_faktorContext extends ParserRuleContext {
		public Int_ausdruckContext int_ausdruck() {
			return getRuleContext(Int_ausdruckContext.class,0);
		}
		public TerminalNode ZAHL() { return getToken(toolParser.ZAHL, 0); }
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public Funktions_aufrufContext funktions_aufruf() {
			return getRuleContext(Funktions_aufrufContext.class,0);
		}
		public Int_faktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_faktor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterInt_faktor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitInt_faktor(this);
		}
	}

	public final Int_faktorContext int_faktor() throws RecognitionException {
		Int_faktorContext _localctx = new Int_faktorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_int_faktor);
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); match(7);
				setState(97); int_ausdruck();
				setState(98); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); funktions_aufruf();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); match(NAME);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102); match(ZAHL);
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

	public static class Bool_ausdruckContext extends ParserRuleContext {
		public List<Bool_faktorContext> bool_faktor() {
			return getRuleContexts(Bool_faktorContext.class);
		}
		public Bool_faktorContext bool_faktor(int i) {
			return getRuleContext(Bool_faktorContext.class,i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105); bool_faktor();
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 21) | (1L << 23))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(107); bool_faktor();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Bool_faktorContext extends ParserRuleContext {
		public Int_ausdruckContext int_ausdruck() {
			return getRuleContext(Int_ausdruckContext.class,0);
		}
		public Bool_ausdruckContext bool_ausdruck() {
			return getRuleContext(Bool_ausdruckContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(toolParser.BOOLEAN, 0); }
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public Funktions_aufrufContext funktions_aufruf() {
			return getRuleContext(Funktions_aufrufContext.class,0);
		}
		public Bool_faktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_faktor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterBool_faktor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitBool_faktor(this);
		}
	}

	public final Bool_faktorContext bool_faktor() throws RecognitionException {
		Bool_faktorContext _localctx = new Bool_faktorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bool_faktor);
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(7);
				setState(114); bool_ausdruck();
				setState(115); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); match(24);
				setState(118); bool_ausdruck();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119); funktions_aufruf();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120); int_ausdruck();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121); match(NAME);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122); match(BOOLEAN);
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

	public static class Variablen_defContext extends ParserRuleContext {
		public Daten_typContext daten_typ() {
			return getRuleContext(Daten_typContext.class,0);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public ZuweisungContext zuweisung() {
			return getRuleContext(ZuweisungContext.class,0);
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
		enterRule(_localctx, 22, RULE_variablen_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); daten_typ();
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(126); match(NAME);
				}
				break;

			case 2:
				{
				setState(127); zuweisung();
				}
				break;
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

	public static class Daten_typContext extends ParserRuleContext {
		public Daten_typContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daten_typ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterDaten_typ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitDaten_typ(this);
		}
	}

	public final Daten_typContext daten_typ() throws RecognitionException {
		Daten_typContext _localctx = new Daten_typContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_daten_typ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==9) ) {
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

	public static class Funktions_defContext extends ParserRuleContext {
		public Daten_typContext daten_typ() {
			return getRuleContext(Daten_typContext.class,0);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public Funktions_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funktions_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterFunktions_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitFunktions_def(this);
		}
	}

	public final Funktions_defContext funktions_def() throws RecognitionException {
		Funktions_defContext _localctx = new Funktions_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funktions_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(19);
			setState(133); daten_typ();
			setState(134); match(NAME);
			setState(135); match(7);
			setState(144);
			_la = _input.LA(1);
			if (_la==2 || _la==9) {
				{
				setState(136); parameter();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(137); match(3);
					setState(138); parameter();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(146); match(1);
			setState(147); match(18);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << NAME))) != 0)) {
				{
				{
				setState(148); code();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154); match(22);
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

	public static class Funktions_aufrufContext extends ParserRuleContext {
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public Funktions_aufrufContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funktions_aufruf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterFunktions_aufruf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitFunktions_aufruf(this);
		}
	}

	public final Funktions_aufrufContext funktions_aufruf() throws RecognitionException {
		Funktions_aufrufContext _localctx = new Funktions_aufrufContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funktions_aufruf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(NAME);
			setState(157); match(7);
			setState(166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 24) | (1L << NAME) | (1L << BOOLEAN) | (1L << ZAHL))) != 0)) {
				{
				setState(158); ausdruck();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(159); match(3);
					setState(160); ausdruck();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(168); match(1);
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

	public static class ParameterContext extends ParserRuleContext {
		public Daten_typContext daten_typ() {
			return getRuleContext(Daten_typContext.class,0);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); daten_typ();
			setState(171); match(NAME);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\36\u00b0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\3\3\3\3\3\7\3"+
		"\63\n\3\f\3\16\3\66\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7Q\n\7\3\b"+
		"\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\t\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\7\13o\n\13\f\13\16"+
		"\13r\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\r\3\r\3"+
		"\r\5\r\u0083\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u008e"+
		"\n\17\f\17\16\17\u0091\13\17\5\17\u0093\n\17\3\17\3\17\3\17\7\17\u0098"+
		"\n\17\f\17\16\17\u009b\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00a4"+
		"\n\20\f\20\16\20\u00a7\13\20\5\20\u00a9\n\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\4\2\6\6\b\b\4\2"+
		"\7\7\26\26\7\2\n\n\16\16\20\23\27\27\31\31\4\2\4\4\13\13\u00b7\2%\3\2"+
		"\2\2\4/\3\2\2\2\6=\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2\fP\3\2\2\2\16R\3\2\2"+
		"\2\20Z\3\2\2\2\22i\3\2\2\2\24k\3\2\2\2\26}\3\2\2\2\30\177\3\2\2\2\32\u0084"+
		"\3\2\2\2\34\u0086\3\2\2\2\36\u009e\3\2\2\2 \u00ac\3\2\2\2\"$\5\6\4\2#"+
		"\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(,\5\4\3"+
		"\2)+\5\6\4\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\3\3\2\2\2.,\3\2"+
		"\2\2/\60\7\r\2\2\60\64\7\24\2\2\61\63\5\b\5\2\62\61\3\2\2\2\63\66\3\2"+
		"\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\30"+
		"\2\28\5\3\2\2\29:\5\30\r\2:;\7\17\2\2;>\3\2\2\2<>\5\34\17\2=9\3\2\2\2"+
		"=<\3\2\2\2>\7\3\2\2\2?@\5\30\r\2@A\7\17\2\2AI\3\2\2\2BC\5\n\6\2CD\7\17"+
		"\2\2DI\3\2\2\2EF\5\36\20\2FG\7\17\2\2GI\3\2\2\2H?\3\2\2\2HB\3\2\2\2HE"+
		"\3\2\2\2I\t\3\2\2\2JK\7\34\2\2KL\7\f\2\2LM\5\f\7\2M\13\3\2\2\2NQ\5\16"+
		"\b\2OQ\5\24\13\2PN\3\2\2\2PO\3\2\2\2Q\r\3\2\2\2RW\5\20\t\2ST\t\2\2\2T"+
		"V\5\20\t\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\17\3\2\2\2YW\3\2\2"+
		"\2Z_\5\22\n\2[\\\t\3\2\2\\^\5\22\n\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`\21\3\2\2\2a_\3\2\2\2bc\7\t\2\2cd\5\16\b\2de\7\3\2\2ej\3\2\2\2"+
		"fj\5\36\20\2gj\7\34\2\2hj\7\36\2\2ib\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2"+
		"\2\2j\23\3\2\2\2kp\5\26\f\2lm\t\4\2\2mo\5\26\f\2nl\3\2\2\2or\3\2\2\2p"+
		"n\3\2\2\2pq\3\2\2\2q\25\3\2\2\2rp\3\2\2\2st\7\t\2\2tu\5\24\13\2uv\7\3"+
		"\2\2v~\3\2\2\2wx\7\32\2\2x~\5\24\13\2y~\5\36\20\2z~\5\16\b\2{~\7\34\2"+
		"\2|~\7\35\2\2}s\3\2\2\2}w\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2"+
		"\2\2~\27\3\2\2\2\177\u0082\5\32\16\2\u0080\u0083\7\34\2\2\u0081\u0083"+
		"\5\n\6\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\31\3\2\2\2\u0084"+
		"\u0085\t\5\2\2\u0085\33\3\2\2\2\u0086\u0087\7\25\2\2\u0087\u0088\5\32"+
		"\16\2\u0088\u0089\7\34\2\2\u0089\u0092\7\t\2\2\u008a\u008f\5 \21\2\u008b"+
		"\u008c\7\5\2\2\u008c\u008e\5 \21\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\7\3\2\2\u0095\u0099\7\24\2\2\u0096\u0098\5\b\5\2\u0097"+
		"\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\30\2\2\u009d"+
		"\35\3\2\2\2\u009e\u009f\7\34\2\2\u009f\u00a8\7\t\2\2\u00a0\u00a5\5\f\7"+
		"\2\u00a1\u00a2\7\5\2\2\u00a2\u00a4\5\f\7\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\7\3\2\2\u00ab\37\3\2\2\2\u00ac\u00ad\5\32\16\2\u00ad"+
		"\u00ae\7\34\2\2\u00ae!\3\2\2\2\23%,\64=HPW_ip}\u0082\u008f\u0092\u0099"+
		"\u00a5\u00a8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}