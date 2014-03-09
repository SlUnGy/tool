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
		DEFINE=25, TYPE_INT=26, TYPE_BOOL=27, NAME=28, BOOLEAN=29, NUMBER=30, 
		WS=31;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'+'", "'*'", "'-'", "'('", "'<'", "'='", "'!='", 
		"';'", "'<='", "'&&'", "'||'", "'>'", "'{'", "'/'", "'=='", "'}'", "'>='", 
		"'!'", "'_haupt'", "'_wenn'", "'_oder_dies'", "'_sonst'", "'definiere'", 
		"'int'", "'bool'", "NAME", "BOOLEAN", "NUMBER", "WS"
	};
	public static final int
		RULE_start = 0, RULE_main = 1, RULE_def = 2, RULE_code = 3, RULE_cont_structure = 4, 
		RULE_assignment = 5, RULE_expression = 6, RULE_int_expression = 7, RULE_produkt = 8, 
		RULE_int_faktor = 9, RULE_bool_expression = 10, RULE_bool_faktor = 11, 
		RULE_var_def = 12, RULE_data_type = 13, RULE_func_def = 14, RULE_func_call = 15, 
		RULE_parameter = 16;
	public static final String[] ruleNames = {
		"start", "main", "def", "code", "cont_structure", "assignment", "expression", 
		"int_expression", "produkt", "int_faktor", "bool_expression", "bool_faktor", 
		"var_def", "data_type", "func_def", "func_call", "parameter"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL))) != 0)) {
				{
				{
				setState(34); def();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40); main();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL))) != 0)) {
				{
				{
				setState(41); def();
				}
				}
				setState(46);
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
			setState(47); match(MAIN);
			setState(48); match(6);
			setState(49); match(1);
			setState(50); match(15);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << NAME))) != 0)) {
				{
				{
				setState(51); code();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); match(18);
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
			setState(63);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); var_def();
				setState(60); match(10);
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); func_def();
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
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); var_def();
				setState(66); match(10);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); assignment();
				setState(69); match(10);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); func_call();
				setState(72); match(10);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74); cont_structure();
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
			setState(77); match(IF);
			setState(78); match(6);
			setState(79); bool_expression();
			setState(80); match(1);
			setState(81); match(15);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82); code();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << NAME))) != 0) );
			setState(87); match(18);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(88); match(ELSEIF);
				setState(89); match(6);
				setState(90); bool_expression();
				setState(91); match(1);
				setState(92); match(15);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93); code();
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << NAME))) != 0) );
				setState(98); match(18);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(105); match(ELSE);
				setState(106); match(15);
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(107); code();
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << NAME))) != 0) );
				setState(112); match(18);
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
			setState(116); match(NAME);
			setState(117); match(8);
			setState(118); expression();
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
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); int_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); bool_expression();
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
			setState(124); produkt();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==5) {
				{
				{
				setState(125);
				_la = _input.LA(1);
				if ( !(_la==3 || _la==5) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(126); produkt();
				}
				}
				setState(131);
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
			setState(132); int_faktor();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==16) {
				{
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==16) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(134); int_faktor();
				}
				}
				setState(139);
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
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); match(6);
				setState(141); int_expression();
				setState(142); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); func_call();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145); match(NAME);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146); match(NUMBER);
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
			setState(149); bool_faktor();
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 17) | (1L << 19))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(151); bool_faktor();
					}
					} 
				}
				setState(156);
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
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); match(6);
				setState(158); bool_expression();
				setState(159); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(20);
				setState(162); bool_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163); func_call();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164); int_expression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165); match(NAME);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166); match(BOOLEAN);
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
		enterRule(_localctx, 24, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); data_type();
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(170); match(NAME);
				}
				break;

			case 2:
				{
				setState(171); assignment();
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
		enterRule(_localctx, 26, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==TYPE_INT || _la==TYPE_BOOL) ) {
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
		enterRule(_localctx, 28, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(DEFINE);
			setState(177); data_type();
			setState(178); match(NAME);
			setState(179); match(6);
			setState(188);
			_la = _input.LA(1);
			if (_la==TYPE_INT || _la==TYPE_BOOL) {
				{
				setState(180); parameter();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(181); match(2);
					setState(182); parameter();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(190); match(1);
			setState(191); match(15);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << NAME))) != 0)) {
				{
				{
				setState(192); code();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198); match(18);
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
		enterRule(_localctx, 30, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(NAME);
			setState(201); match(6);
			setState(210);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 20) | (1L << NAME) | (1L << BOOLEAN) | (1L << NUMBER))) != 0)) {
				{
				setState(202); expression();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(203); match(2);
					setState(204); expression();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(212); match(1);
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
		enterRule(_localctx, 32, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); data_type();
			setState(215); match(NAME);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3!\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4B\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\6\6V\n\6\r\6\16\6W\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6a\n\6\r\6\16"+
		"\6b\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\3\6\6\6o\n\6\r\6\16\6p\3\6"+
		"\3\6\5\6u\n\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\7\t\u0082\n"+
		"\t\f\t\16\t\u0085\13\t\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\f\3\f\3\f\7\f\u009b"+
		"\n\f\f\f\16\f\u009e\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00aa"+
		"\n\r\3\16\3\16\3\16\5\16\u00af\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00ba\n\20\f\20\16\20\u00bd\13\20\5\20\u00bf\n\20\3\20"+
		"\3\20\3\20\7\20\u00c4\n\20\f\20\16\20\u00c7\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u00d0\n\21\f\21\16\21\u00d3\13\21\5\21\u00d5\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"\2\6\4\2\5\5\7\7\4\2\6\6\22\22\7\2\t\t\13\13\r\20\23\23\25\25\3"+
		"\2\34\35\u00e8\2\'\3\2\2\2\4\61\3\2\2\2\6A\3\2\2\2\bM\3\2\2\2\nO\3\2\2"+
		"\2\fv\3\2\2\2\16|\3\2\2\2\20~\3\2\2\2\22\u0086\3\2\2\2\24\u0095\3\2\2"+
		"\2\26\u0097\3\2\2\2\30\u00a9\3\2\2\2\32\u00ab\3\2\2\2\34\u00b0\3\2\2\2"+
		"\36\u00b2\3\2\2\2 \u00ca\3\2\2\2\"\u00d8\3\2\2\2$&\5\6\4\2%$\3\2\2\2&"+
		")\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*.\5\4\3\2+-\5\6\4"+
		"\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60.\3\2\2\2\61"+
		"\62\7\27\2\2\62\63\7\b\2\2\63\64\7\3\2\2\648\7\21\2\2\65\67\5\b\5\2\66"+
		"\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7"+
		"\24\2\2<\5\3\2\2\2=>\5\32\16\2>?\7\f\2\2?B\3\2\2\2@B\5\36\20\2A=\3\2\2"+
		"\2A@\3\2\2\2B\7\3\2\2\2CD\5\32\16\2DE\7\f\2\2EN\3\2\2\2FG\5\f\7\2GH\7"+
		"\f\2\2HN\3\2\2\2IJ\5 \21\2JK\7\f\2\2KN\3\2\2\2LN\5\n\6\2MC\3\2\2\2MF\3"+
		"\2\2\2MI\3\2\2\2ML\3\2\2\2N\t\3\2\2\2OP\7\30\2\2PQ\7\b\2\2QR\5\26\f\2"+
		"RS\7\3\2\2SU\7\21\2\2TV\5\b\5\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2XY\3\2\2\2Yh\7\24\2\2Z[\7\31\2\2[\\\7\b\2\2\\]\5\26\f\2]^\7\3\2\2^`"+
		"\7\21\2\2_a\5\b\5\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2"+
		"de\7\24\2\2eg\3\2\2\2fZ\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2it\3\2\2"+
		"\2jh\3\2\2\2kl\7\32\2\2ln\7\21\2\2mo\5\b\5\2nm\3\2\2\2op\3\2\2\2pn\3\2"+
		"\2\2pq\3\2\2\2qr\3\2\2\2rs\7\24\2\2su\3\2\2\2tk\3\2\2\2tu\3\2\2\2u\13"+
		"\3\2\2\2vw\7\36\2\2wx\7\n\2\2xy\5\16\b\2y\r\3\2\2\2z}\5\20\t\2{}\5\26"+
		"\f\2|z\3\2\2\2|{\3\2\2\2}\17\3\2\2\2~\u0083\5\22\n\2\177\u0080\t\2\2\2"+
		"\u0080\u0082\5\22\n\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u008b\5\24\13\2\u0087\u0088\t\3\2\2\u0088\u008a\5\24\13\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\23\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\b\2\2\u008f\u0090\5\20\t"+
		"\2\u0090\u0091\7\3\2\2\u0091\u0096\3\2\2\2\u0092\u0096\5 \21\2\u0093\u0096"+
		"\7\36\2\2\u0094\u0096\7 \2\2\u0095\u008e\3\2\2\2\u0095\u0092\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\25\3\2\2\2\u0097\u009c\5\30\r"+
		"\2\u0098\u0099\t\4\2\2\u0099\u009b\5\30\r\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\27\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\5\26\f\2\u00a1"+
		"\u00a2\7\3\2\2\u00a2\u00aa\3\2\2\2\u00a3\u00a4\7\26\2\2\u00a4\u00aa\5"+
		"\26\f\2\u00a5\u00aa\5 \21\2\u00a6\u00aa\5\20\t\2\u00a7\u00aa\7\36\2\2"+
		"\u00a8\u00aa\7\37\2\2\u00a9\u009f\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a5"+
		"\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\31\3\2\2\2\u00ab\u00ae\5\34\17\2\u00ac\u00af\7\36\2\2\u00ad\u00af\5\f"+
		"\7\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\33\3\2\2\2\u00b0\u00b1"+
		"\t\5\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\5\34\17\2\u00b4"+
		"\u00b5\7\36\2\2\u00b5\u00be\7\b\2\2\u00b6\u00bb\5\"\22\2\u00b7\u00b8\7"+
		"\4\2\2\u00b8\u00ba\5\"\22\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00b6\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\7\3\2\2\u00c1\u00c5\7\21\2\2\u00c2\u00c4\5\b\5\2\u00c3\u00c2\3"+
		"\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\24\2\2\u00c9\37\3\2\2"+
		"\2\u00ca\u00cb\7\36\2\2\u00cb\u00d4\7\b\2\2\u00cc\u00d1\5\16\b\2\u00cd"+
		"\u00ce\7\4\2\2\u00ce\u00d0\5\16\b\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3"+
		"\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\7\3\2\2\u00d7!\3\2\2\2\u00d8\u00d9\5\34\17\2\u00d9\u00da"+
		"\7\36\2\2\u00da#\3\2\2\2\30\'.8AMWbhpt|\u0083\u008b\u0095\u009c\u00a9"+
		"\u00ae\u00bb\u00be\u00c5\u00d1\u00d4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}