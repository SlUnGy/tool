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
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, MAIN=21, IF=22, ELSEIF=23, ELSE=24, 
		DEFINE=25, TYPE_INT=26, TYPE_BOOL=27, TYPE_STRING=28, NAME=29, STRING=30, 
		BOOLEAN=31, NUMBER=32, WS=33;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'+'", "'*'", "'-'", "'('", "'<'", "'='", "'!='", 
		"';'", "'<='", "'&&'", "'||'", "'>'", "'{'", "'/'", "'=='", "'}'", "'>='", 
		"'!'", "'_haupt'", "'_wenn'", "'_oder_dies'", "'_sonst'", "'definiere'", 
		"'int'", "'bool'", "'str'", "NAME", "STRING", "BOOLEAN", "NUMBER", "WS"
	};
	public static final int
		RULE_start = 0, RULE_main = 1, RULE_def = 2, RULE_code = 3, RULE_cont_structure = 4, 
		RULE_assignment = 5, RULE_expression = 6, RULE_int_expression = 7, RULE_produkt = 8, 
		RULE_int_faktor = 9, RULE_bool_expression = 10, RULE_bool_faktor = 11, 
		RULE_str_expression = 12, RULE_var_def = 13, RULE_data_type = 14, RULE_func_def = 15, 
		RULE_func_call = 16, RULE_parameter = 17;
	public static final String[] ruleNames = {
		"start", "main", "def", "code", "cont_structure", "assignment", "expression", 
		"int_expression", "produkt", "int_faktor", "bool_expression", "bool_faktor", 
		"str_expression", "var_def", "data_type", "func_def", "func_call", "parameter"
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				{
				setState(36); def();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); main();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				{
				setState(43); def();
				}
				}
				setState(48);
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

	public static class MainContext extends ParserRuleContext {
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public TerminalNode MAIN() { return getToken(toolParser.MAIN, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(MAIN);
			setState(50); match(6);
			setState(51); match(1);
			setState(52); match(15);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(53); code();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59); match(18);
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
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
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
			setState(65);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
			case TYPE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); var_def();
				setState(62); match(10);
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); func_def();
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
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Cont_structureContext cont_structure() {
			return getRuleContext(Cont_structureContext.class,0);
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
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); var_def();
				setState(68); match(10);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); assignment();
				setState(71); match(10);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); func_call();
				setState(74); match(10);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76); cont_structure();
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

	public static class Cont_structureContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(toolParser.IF, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(toolParser.ELSEIF); }
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public TerminalNode ELSE() { return getToken(toolParser.ELSE, 0); }
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode ELSEIF(int i) {
			return getToken(toolParser.ELSEIF, i);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public Cont_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterCont_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitCont_structure(this);
		}
	}

	public final Cont_structureContext cont_structure() throws RecognitionException {
		Cont_structureContext _localctx = new Cont_structureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cont_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(IF);
			setState(80); match(6);
			setState(81); bool_expression();
			setState(82); match(1);
			setState(83); match(15);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84); code();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
			setState(89); match(18);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(90); match(ELSEIF);
				setState(91); match(6);
				setState(92); bool_expression();
				setState(93); match(1);
				setState(94); match(15);
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95); code();
					}
					}
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
				setState(100); match(18);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(107); match(ELSE);
				setState(108); match(15);
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(109); code();
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
				setState(114); match(18);
				}
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(NAME);
			setState(119); match(8);
			setState(120); expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Int_expressionContext int_expression() {
			return getRuleContext(Int_expressionContext.class,0);
		}
		public Str_expressionContext str_expression() {
			return getRuleContext(Str_expressionContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); int_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); bool_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124); str_expression();
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

	public static class Int_expressionContext extends ParserRuleContext {
		public ProduktContext produkt(int i) {
			return getRuleContext(ProduktContext.class,i);
		}
		public List<ProduktContext> produkt() {
			return getRuleContexts(ProduktContext.class);
		}
		public Int_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterInt_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitInt_expression(this);
		}
	}

	public final Int_expressionContext int_expression() throws RecognitionException {
		Int_expressionContext _localctx = new Int_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_int_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); produkt();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==5) {
				{
				{
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==3 || _la==5) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(129); produkt();
				}
				}
				setState(134);
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
		enterRule(_localctx, 16, RULE_produkt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); int_faktor();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==16) {
				{
				{
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==16) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(137); int_faktor();
				}
				}
				setState(142);
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
		public Int_expressionContext int_expression() {
			return getRuleContext(Int_expressionContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(toolParser.NUMBER, 0); }
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
		enterRule(_localctx, 18, RULE_int_faktor);
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); match(6);
				setState(144); int_expression();
				setState(145); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); func_call();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148); match(NAME);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149); match(NUMBER);
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public List<Bool_faktorContext> bool_faktor() {
			return getRuleContexts(Bool_faktorContext.class);
		}
		public Bool_faktorContext bool_faktor(int i) {
			return getRuleContext(Bool_faktorContext.class,i);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bool_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); bool_faktor();
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 17) | (1L << 19))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(154); bool_faktor();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public Int_expressionContext int_expression() {
			return getRuleContext(Int_expressionContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(toolParser.BOOLEAN, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(toolParser.STRING, 0); }
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
		enterRule(_localctx, 22, RULE_bool_faktor);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); match(6);
				setState(161); bool_expression();
				setState(162); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); match(20);
				setState(165); bool_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166); func_call();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167); int_expression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168); match(NAME);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169); match(BOOLEAN);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170); match(STRING);
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

	public static class Str_expressionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(toolParser.STRING, 0); }
		public Str_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterStr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitStr_expression(this);
		}
	}

	public final Str_expressionContext str_expression() throws RecognitionException {
		Str_expressionContext _localctx = new Str_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_str_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(STRING);
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

	public static class Var_defContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitVar_def(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); data_type();
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(176); match(NAME);
				}
				break;

			case 2:
				{
				setState(177); assignment();
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode TYPE_STRING() { return getToken(toolParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_BOOL() { return getToken(toolParser.TYPE_BOOL, 0); }
		public TerminalNode TYPE_INT() { return getToken(toolParser.TYPE_INT, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) ) {
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(toolParser.DEFINE, 0); }
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
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
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitFunc_def(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(DEFINE);
			setState(183); data_type();
			setState(184); match(NAME);
			setState(185); match(6);
			setState(194);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				setState(186); parameter();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(187); match(2);
					setState(188); parameter();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(196); match(1);
			setState(197); match(15);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(198); code();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204); match(18);
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

	public static class Func_callContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof toolListener ) ((toolListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(NAME);
			setState(207); match(6);
			setState(216);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 20) | (1L << NAME) | (1L << STRING) | (1L << BOOLEAN) | (1L << NUMBER))) != 0)) {
				{
				setState(208); expression();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(209); match(2);
					setState(210); expression();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(218); match(1);
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
		public TerminalNode NAME() { return getToken(toolParser.NAME, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); data_type();
			setState(221); match(NAME);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3#\u00e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\5\4D\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\6\6X\n\6\r\6\16\6Y\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6c\n\6\r"+
		"\6\16\6d\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\6\6\6q\n\6\r\6\16\6"+
		"r\3\6\3\6\5\6w\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3"+
		"\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16"+
		"\n\u0090\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3"+
		"\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\16\3\16\3\17\3\17\3\17\5\17\u00b5\n\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00c0\n\21\f\21\16"+
		"\21\u00c3\13\21\5\21\u00c5\n\21\3\21\3\21\3\21\7\21\u00ca\n\21\f\21\16"+
		"\21\u00cd\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00d6\n\22\f\22"+
		"\16\22\u00d9\13\22\5\22\u00db\n\22\3\22\3\22\3\23\3\23\3\23\3\23\2\24"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\6\4\2\5\5\7\7\4\2\6\6\22"+
		"\22\7\2\t\t\13\13\r\20\23\23\25\25\3\2\34\36\u00ef\2)\3\2\2\2\4\63\3\2"+
		"\2\2\6C\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\fx\3\2\2\2\16\177\3\2\2\2\20\u0081"+
		"\3\2\2\2\22\u0089\3\2\2\2\24\u0098\3\2\2\2\26\u009a\3\2\2\2\30\u00ad\3"+
		"\2\2\2\32\u00af\3\2\2\2\34\u00b1\3\2\2\2\36\u00b6\3\2\2\2 \u00b8\3\2\2"+
		"\2\"\u00d0\3\2\2\2$\u00de\3\2\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3"+
		"\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,\60\5\4\3\2-/\5\6\4\2.-\3\2\2\2/"+
		"\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2\62\60\3\2\2\2\63\64"+
		"\7\27\2\2\64\65\7\b\2\2\65\66\7\3\2\2\66:\7\21\2\2\679\5\b\5\28\67\3\2"+
		"\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\24\2\2>\5\3"+
		"\2\2\2?@\5\34\17\2@A\7\f\2\2AD\3\2\2\2BD\5 \21\2C?\3\2\2\2CB\3\2\2\2D"+
		"\7\3\2\2\2EF\5\34\17\2FG\7\f\2\2GP\3\2\2\2HI\5\f\7\2IJ\7\f\2\2JP\3\2\2"+
		"\2KL\5\"\22\2LM\7\f\2\2MP\3\2\2\2NP\5\n\6\2OE\3\2\2\2OH\3\2\2\2OK\3\2"+
		"\2\2ON\3\2\2\2P\t\3\2\2\2QR\7\30\2\2RS\7\b\2\2ST\5\26\f\2TU\7\3\2\2UW"+
		"\7\21\2\2VX\5\b\5\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2"+
		"[j\7\24\2\2\\]\7\31\2\2]^\7\b\2\2^_\5\26\f\2_`\7\3\2\2`b\7\21\2\2ac\5"+
		"\b\5\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\24\2\2gi"+
		"\3\2\2\2h\\\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kv\3\2\2\2lj\3\2\2\2"+
		"mn\7\32\2\2np\7\21\2\2oq\5\b\5\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2st\3\2\2\2tu\7\24\2\2uw\3\2\2\2vm\3\2\2\2vw\3\2\2\2w\13\3\2\2\2xy\7"+
		"\37\2\2yz\7\n\2\2z{\5\16\b\2{\r\3\2\2\2|\u0080\5\20\t\2}\u0080\5\26\f"+
		"\2~\u0080\5\32\16\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\17\3"+
		"\2\2\2\u0081\u0086\5\22\n\2\u0082\u0083\t\2\2\2\u0083\u0085\5\22\n\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\21\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008e\5\24\13\2\u008a"+
		"\u008b\t\3\2\2\u008b\u008d\5\24\13\2\u008c\u008a\3\2\2\2\u008d\u0090\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\23\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\7\b\2\2\u0092\u0093\5\20\t\2\u0093\u0094\7"+
		"\3\2\2\u0094\u0099\3\2\2\2\u0095\u0099\5\"\22\2\u0096\u0099\7\37\2\2\u0097"+
		"\u0099\7\"\2\2\u0098\u0091\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0097\3\2\2\2\u0099\25\3\2\2\2\u009a\u009f\5\30\r\2\u009b\u009c"+
		"\t\4\2\2\u009c\u009e\5\30\r\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7\3\2\2"+
		"\u00a5\u00ae\3\2\2\2\u00a6\u00a7\7\26\2\2\u00a7\u00ae\5\26\f\2\u00a8\u00ae"+
		"\5\"\22\2\u00a9\u00ae\5\20\t\2\u00aa\u00ae\7\37\2\2\u00ab\u00ae\7!\2\2"+
		"\u00ac\u00ae\7 \2\2\u00ad\u00a2\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a8"+
		"\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0\7 \2\2\u00b0\33\3\2\2\2\u00b1"+
		"\u00b4\5\36\20\2\u00b2\u00b5\7\37\2\2\u00b3\u00b5\5\f\7\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\35\3\2\2\2\u00b6\u00b7\t\5\2\2\u00b7"+
		"\37\3\2\2\2\u00b8\u00b9\7\33\2\2\u00b9\u00ba\5\36\20\2\u00ba\u00bb\7\37"+
		"\2\2\u00bb\u00c4\7\b\2\2\u00bc\u00c1\5$\23\2\u00bd\u00be\7\4\2\2\u00be"+
		"\u00c0\5$\23\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00bc\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\3"+
		"\2\2\u00c7\u00cb\7\21\2\2\u00c8\u00ca\5\b\5\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\24\2\2\u00cf!\3\2\2\2\u00d0\u00d1"+
		"\7\37\2\2\u00d1\u00da\7\b\2\2\u00d2\u00d7\5\16\b\2\u00d3\u00d4\7\4\2\2"+
		"\u00d4\u00d6\5\16\b\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00d2\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\3"+
		"\2\2\u00dd#\3\2\2\2\u00de\u00df\5\36\20\2\u00df\u00e0\7\37\2\2\u00e0%"+
		"\3\2\2\2\30)\60:COYdjrv\177\u0086\u008e\u0098\u009f\u00ad\u00b4\u00c1"+
		"\u00c4\u00cb\u00d7\u00da";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}