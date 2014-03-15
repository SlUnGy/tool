// Generated from Tool.g4 by ANTLR 4.1
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToolParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, L_PAREN=12, R_PAREN=13, R_C_BRACE=14, L_C_BRACE=15, 
		SEMICOLON=16, COMMA=17, ASSIGN_TO=18, CAT=19, INVERT=20, MAIN=21, IF=22, 
		ELSEIF=23, ELSE=24, DO_WHILE=25, WHILE=26, DEFINE=27, TYPE_INT=28, TYPE_BOOL=29, 
		TYPE_STRING=30, TYPE_VOID=31, NAME=32, STRING=33, BOOLEAN=34, NUMBER=35, 
		COMMENT=36, WS=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'||'", "'>'", "'-'", "'*'", "'/'", "'<'", "'=='", "'>='", 
		"'!='", "'<='", "'&&'", "'('", "')'", "'}'", "'{'", "';'", "','", "'='", 
		"'+'", "'!'", "'_haupt'", "'_wenn'", "'_oder_dies'", "'_sonst'", "'_solange_bis'", 
		"'_schleife'", "'_definiere'", "'int'", "'bool'", "'str'", "'leer'", "NAME", 
		"STRING", "BOOLEAN", "NUMBER", "COMMENT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_main = 1, RULE_def = 2, RULE_code = 3, RULE_contr_structure = 4, 
		RULE_assignment = 5, RULE_expr = 6, RULE_var_name = 7, RULE_int_expr = 8, 
		RULE_produkt = 9, RULE_int_faktor = 10, RULE_bool_expr = 11, RULE_bool_faktor = 12, 
		RULE_str_expr = 13, RULE_str_faktor = 14, RULE_var_def = 15, RULE_var_data_type = 16, 
		RULE_func_data_type = 17, RULE_func_def = 18, RULE_func_def_params = 19, 
		RULE_func_call = 20, RULE_func_call_params = 21, RULE_parameter = 22;
	public static final String[] ruleNames = {
		"start", "main", "def", "code", "contr_structure", "assignment", "expr", 
		"var_name", "int_expr", "produkt", "int_faktor", "bool_expr", "bool_faktor", 
		"str_expr", "str_faktor", "var_def", "var_data_type", "func_data_type", 
		"func_def", "func_def_params", "func_call", "func_call_params", "parameter"
	};

	@Override
	public String getGrammarFileName() { return "Tool.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ToolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends StartContext {
		public DefContext befDef;
		public DefContext aftDef;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ProgramContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				{
				setState(46); ((ProgramContext)_localctx).befDef = def();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52); main();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				{
				setState(53); ((ProgramContext)_localctx).aftDef = def();
				}
				}
				setState(58);
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
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	 
		public MainContext() { }
		public void copyFrom(MainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Main_funcContext extends MainContext {
		public CodeContext instructions;
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_C_BRACE() { return getToken(ToolParser.L_C_BRACE, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public TerminalNode R_C_BRACE() { return getToken(ToolParser.R_C_BRACE, 0); }
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public TerminalNode MAIN() { return getToken(ToolParser.MAIN, 0); }
		public Main_funcContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitMain_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			_localctx = new Main_funcContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(MAIN);
			setState(60); match(L_PAREN);
			setState(61); match(R_PAREN);
			setState(62); match(L_C_BRACE);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(63); ((Main_funcContext)_localctx).instructions = code();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69); match(R_C_BRACE);
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
		public Var_defContext variableDef;
		public Func_defContext functionDef;
		public TerminalNode SEMICOLON() { return getToken(ToolParser.SEMICOLON, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
			case TYPE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); ((DefContext)_localctx).variableDef = var_def();
				setState(72); match(SEMICOLON);
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); ((DefContext)_localctx).functionDef = func_def();
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
		public Contr_structureContext contr_structure() {
			return getRuleContext(Contr_structureContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ToolParser.SEMICOLON, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_code);
		try {
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); var_def();
				setState(78); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); assignment();
				setState(81); match(SEMICOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83); func_call();
				setState(84); match(SEMICOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86); contr_structure();
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

	public static class Contr_structureContext extends ParserRuleContext {
		public Contr_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contr_structure; }
	 
		public Contr_structureContext() { }
		public void copyFrom(Contr_structureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Do_whileContext extends Contr_structureContext {
		public CodeContext instructions;
		public Bool_exprContext condition;
		public TerminalNode SEMICOLON() { return getToken(ToolParser.SEMICOLON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_C_BRACE() { return getToken(ToolParser.L_C_BRACE, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public TerminalNode R_C_BRACE() { return getToken(ToolParser.R_C_BRACE, 0); }
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode DO_WHILE() { return getToken(ToolParser.DO_WHILE, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public Do_whileContext(Contr_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends Contr_structureContext {
		public Bool_exprContext if_condition;
		public CodeContext if_instructions;
		public Bool_exprContext elif_condigion;
		public CodeContext elif_instructions;
		public CodeContext else_instructions;
		public List<TerminalNode> R_PAREN() { return getTokens(ToolParser.R_PAREN); }
		public List<TerminalNode> ELSEIF() { return getTokens(ToolParser.ELSEIF); }
		public List<TerminalNode> L_C_BRACE() { return getTokens(ToolParser.L_C_BRACE); }
		public List<TerminalNode> L_PAREN() { return getTokens(ToolParser.L_PAREN); }
		public TerminalNode L_PAREN(int i) {
			return getToken(ToolParser.L_PAREN, i);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode R_C_BRACE(int i) {
			return getToken(ToolParser.R_C_BRACE, i);
		}
		public TerminalNode IF() { return getToken(ToolParser.IF, 0); }
		public TerminalNode L_C_BRACE(int i) {
			return getToken(ToolParser.L_C_BRACE, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public TerminalNode R_PAREN(int i) {
			return getToken(ToolParser.R_PAREN, i);
		}
		public TerminalNode ELSE() { return getToken(ToolParser.ELSE, 0); }
		public List<TerminalNode> R_C_BRACE() { return getTokens(ToolParser.R_C_BRACE); }
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode ELSEIF(int i) {
			return getToken(ToolParser.ELSEIF, i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public IfContext(Contr_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends Contr_structureContext {
		public Bool_exprContext condition;
		public CodeContext instructions;
		public TerminalNode WHILE() { return getToken(ToolParser.WHILE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_C_BRACE() { return getToken(ToolParser.L_C_BRACE, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public TerminalNode R_C_BRACE() { return getToken(ToolParser.R_C_BRACE, 0); }
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public WhileContext(Contr_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contr_structureContext contr_structure() throws RecognitionException {
		Contr_structureContext _localctx = new Contr_structureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_contr_structure);
		int _la;
		try {
			setState(153);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89); match(IF);
				setState(90); match(L_PAREN);
				setState(91); ((IfContext)_localctx).if_condition = bool_expr();
				setState(92); match(R_PAREN);
				setState(93); match(L_C_BRACE);
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94); ((IfContext)_localctx).if_instructions = code();
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
				setState(99); match(R_C_BRACE);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(100); match(ELSEIF);
					setState(101); match(L_PAREN);
					setState(102); ((IfContext)_localctx).elif_condigion = bool_expr();
					setState(103); match(R_PAREN);
					setState(104); match(L_C_BRACE);
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(105); ((IfContext)_localctx).elif_instructions = code();
						}
						}
						setState(108); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
					setState(110); match(R_C_BRACE);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(117); match(ELSE);
					setState(118); match(L_C_BRACE);
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(119); ((IfContext)_localctx).else_instructions = code();
						}
						}
						setState(122); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
					setState(124); match(R_C_BRACE);
					}
				}

				}
				break;
			case DO_WHILE:
				_localctx = new Do_whileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128); match(DO_WHILE);
				setState(129); match(L_C_BRACE);
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130); ((Do_whileContext)_localctx).instructions = code();
					}
					}
					setState(133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
				setState(135); match(R_C_BRACE);
				setState(136); match(L_PAREN);
				setState(137); ((Do_whileContext)_localctx).condition = bool_expr();
				setState(138); match(R_PAREN);
				setState(139); match(SEMICOLON);
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141); match(WHILE);
				setState(142); match(L_PAREN);
				setState(143); ((WhileContext)_localctx).condition = bool_expr();
				setState(144); match(R_PAREN);
				setState(145); match(L_C_BRACE);
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146); ((WhileContext)_localctx).instructions = code();
					}
					}
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
				setState(151); match(R_C_BRACE);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assign_toContext extends AssignmentContext {
		public Token variableName;
		public ExprContext value;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public TerminalNode ASSIGN_TO() { return getToken(ToolParser.ASSIGN_TO, 0); }
		public Assign_toContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitAssign_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			_localctx = new Assign_toContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(155); ((Assign_toContext)_localctx).variableName = match(NAME);
			setState(156); match(ASSIGN_TO);
			setState(157); ((Assign_toContext)_localctx).value = expr();
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

	public static class ExprContext extends ParserRuleContext {
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); var_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); func_call();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161); int_expr();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162); str_expr();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163); bool_expr();
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

	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(NAME);
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

	public static class Int_exprContext extends ParserRuleContext {
		public ProduktContext left;
		public Token operator;
		public ProduktContext val;
		public ProduktContext produkt(int i) {
			return getRuleContext(ProduktContext.class,i);
		}
		public List<ProduktContext> produkt() {
			return getRuleContexts(ProduktContext.class);
		}
		public Int_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitInt_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_exprContext int_expr() throws RecognitionException {
		Int_exprContext _localctx = new Int_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_int_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); ((Int_exprContext)_localctx).left = produkt();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==CAT) {
				{
				{
				setState(169);
				((Int_exprContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==3 || _la==CAT) ) {
					((Int_exprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(170); ((Int_exprContext)_localctx).val = produkt();
				}
				}
				setState(175);
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
		public Int_faktorContext left;
		public Token operator;
		public Int_faktorContext val;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitProdukt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProduktContext produkt() throws RecognitionException {
		ProduktContext _localctx = new ProduktContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_produkt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); ((ProduktContext)_localctx).left = int_faktor();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==5) {
				{
				{
				setState(177);
				((ProduktContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==5) ) {
					((ProduktContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(178); ((ProduktContext)_localctx).val = int_faktor();
				}
				}
				setState(183);
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
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public TerminalNode NUMBER() { return getToken(ToolParser.NUMBER, 0); }
		public Int_faktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_faktor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitInt_faktor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_faktorContext int_faktor() throws RecognitionException {
		Int_faktorContext _localctx = new Int_faktorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_int_faktor);
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); match(L_PAREN);
				setState(185); int_expr();
				setState(186); match(R_PAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); func_call();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); var_name();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190); match(NUMBER);
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

	public static class Bool_exprContext extends ParserRuleContext {
		public Bool_faktorContext left;
		public Token operator;
		public Bool_faktorContext val;
		public List<Bool_faktorContext> bool_faktor() {
			return getRuleContexts(Bool_faktorContext.class);
		}
		public Bool_faktorContext bool_faktor(int i) {
			return getRuleContext(Bool_faktorContext.class,i);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193); ((Bool_exprContext)_localctx).left = bool_faktor();
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					((Bool_exprContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11))) != 0)) ) {
						((Bool_exprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(195); ((Bool_exprContext)_localctx).val = bool_faktor();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode INVERT() { return getToken(ToolParser.INVERT, 0); }
		public TerminalNode BOOLEAN() { return getToken(ToolParser.BOOLEAN, 0); }
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public Bool_faktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_faktor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBool_faktor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_faktorContext bool_faktor() throws RecognitionException {
		Bool_faktorContext _localctx = new Bool_faktorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_faktor);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201); match(L_PAREN);
				setState(202); bool_expr();
				setState(203); match(R_PAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); match(INVERT);
				setState(206); bool_expr();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207); func_call();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208); int_expr();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209); str_expr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(210); var_name();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211); match(BOOLEAN);
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

	public static class Str_exprContext extends ParserRuleContext {
		public Str_faktorContext left;
		public Str_faktorContext str_faktor(int i) {
			return getRuleContext(Str_faktorContext.class,i);
		}
		public List<Str_faktorContext> str_faktor() {
			return getRuleContexts(Str_faktorContext.class);
		}
		public TerminalNode CAT(int i) {
			return getToken(ToolParser.CAT, i);
		}
		public List<TerminalNode> CAT() { return getTokens(ToolParser.CAT); }
		public Str_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_exprContext str_expr() throws RecognitionException {
		Str_exprContext _localctx = new Str_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_str_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); ((Str_exprContext)_localctx).left = str_faktor();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CAT) {
				{
				{
				setState(215); match(CAT);
				setState(216); str_faktor();
				}
				}
				setState(221);
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

	public static class Str_faktorContext extends ParserRuleContext {
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ToolParser.STRING, 0); }
		public Str_faktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_faktor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStr_faktor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_faktorContext str_faktor() throws RecognitionException {
		Str_faktorContext _localctx = new Str_faktorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_str_faktor);
		try {
			setState(228);
			switch (_input.LA(1)) {
			case L_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); match(L_PAREN);
				setState(223); str_expr();
				setState(224); match(R_PAREN);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); func_call();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(227); match(STRING);
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

	public static class Var_defContext extends ParserRuleContext {
		public Var_data_typeContext type;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public Var_data_typeContext var_data_type() {
			return getRuleContext(Var_data_typeContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); ((Var_defContext)_localctx).type = var_data_type();
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(231); match(NAME);
				}
				break;

			case 2:
				{
				setState(232); assignment();
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

	public static class Var_data_typeContext extends ParserRuleContext {
		public TerminalNode TYPE_STRING() { return getToken(ToolParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_BOOL() { return getToken(ToolParser.TYPE_BOOL, 0); }
		public TerminalNode TYPE_INT() { return getToken(ToolParser.TYPE_INT, 0); }
		public Var_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitVar_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_data_typeContext var_data_type() throws RecognitionException {
		Var_data_typeContext _localctx = new Var_data_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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

	public static class Func_data_typeContext extends ParserRuleContext {
		public TerminalNode TYPE_VOID() { return getToken(ToolParser.TYPE_VOID, 0); }
		public Var_data_typeContext var_data_type() {
			return getRuleContext(Var_data_typeContext.class,0);
		}
		public Func_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunc_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_data_typeContext func_data_type() throws RecognitionException {
		Func_data_typeContext _localctx = new Func_data_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_func_data_type);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
			case TYPE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); var_data_type();
				}
				break;
			case TYPE_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); match(TYPE_VOID);
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

	public static class Func_defContext extends ParserRuleContext {
		public Func_data_typeContext type;
		public Token fn_name;
		public Func_def_paramsContext parameter_list;
		public CodeContext instructions;
		public Func_def_paramsContext func_def_params() {
			return getRuleContext(Func_def_paramsContext.class,0);
		}
		public TerminalNode DEFINE() { return getToken(ToolParser.DEFINE, 0); }
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_C_BRACE() { return getToken(ToolParser.L_C_BRACE, 0); }
		public Func_data_typeContext func_data_type() {
			return getRuleContext(Func_data_typeContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public TerminalNode R_C_BRACE() { return getToken(ToolParser.R_C_BRACE, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(DEFINE);
			setState(242); ((Func_defContext)_localctx).type = func_data_type();
			setState(243); ((Func_defContext)_localctx).fn_name = match(NAME);
			setState(244); match(L_PAREN);
			setState(246);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				setState(245); ((Func_defContext)_localctx).parameter_list = func_def_params();
				}
			}

			setState(248); match(R_PAREN);
			setState(249); match(L_C_BRACE);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(250); ((Func_defContext)_localctx).instructions = code();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256); match(R_C_BRACE);
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

	public static class Func_def_paramsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(ToolParser.COMMA); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ToolParser.COMMA, i);
		}
		public Func_def_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunc_def_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_def_paramsContext func_def_params() throws RecognitionException {
		Func_def_paramsContext _localctx = new Func_def_paramsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_def_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); parameter();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259); match(COMMA);
				setState(260); parameter();
				}
				}
				setState(265);
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

	public static class Func_callContext extends ParserRuleContext {
		public Token fn_name;
		public Func_call_paramsContext parameters;
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public Func_call_paramsContext func_call_params() {
			return getRuleContext(Func_call_paramsContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); ((Func_callContext)_localctx).fn_name = match(NAME);
			setState(267); match(L_PAREN);
			setState(269);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << INVERT) | (1L << NAME) | (1L << STRING) | (1L << BOOLEAN) | (1L << NUMBER))) != 0)) {
				{
				setState(268); ((Func_callContext)_localctx).parameters = func_call_params();
				}
			}

			setState(271); match(R_PAREN);
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

	public static class Func_call_paramsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(ToolParser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ToolParser.COMMA, i);
		}
		public Func_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunc_call_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_call_paramsContext func_call_params() throws RecognitionException {
		Func_call_paramsContext _localctx = new Func_call_paramsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_func_call_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); expr();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(274); match(COMMA);
				setState(275); expr();
				}
				}
				setState(280);
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

	public static class ParameterContext extends ParserRuleContext {
		public Var_data_typeContext type;
		public Token name;
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public Var_data_typeContext var_data_type() {
			return getRuleContext(Var_data_typeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); ((ParameterContext)_localctx).type = var_data_type();
			setState(282); ((ParameterContext)_localctx).name = match(NAME);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\'\u011f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6"+
		"b\n\6\r\6\16\6c\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6m\n\6\r\6\16\6n\3\6\3\6"+
		"\7\6s\n\6\f\6\16\6v\13\6\3\6\3\6\3\6\6\6{\n\6\r\6\16\6|\3\6\3\6\5\6\u0081"+
		"\n\6\3\6\3\6\3\6\6\6\u0086\n\6\r\6\16\6\u0087\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0096\n\6\r\6\16\6\u0097\3\6\3\6\5\6\u009c"+
		"\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a7\n\b\3\t\3\t\3\n\3\n"+
		"\3\n\7\n\u00ae\n\n\f\n\16\n\u00b1\13\n\3\13\3\13\3\13\7\13\u00b6\n\13"+
		"\f\13\16\13\u00b9\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\r"+
		"\3\r\3\r\7\r\u00c7\n\r\f\r\16\r\u00ca\13\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d7\n\16\3\17\3\17\3\17\7\17\u00dc"+
		"\n\17\f\17\16\17\u00df\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e7"+
		"\n\20\3\21\3\21\3\21\5\21\u00ec\n\21\3\22\3\22\3\23\3\23\5\23\u00f2\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u00f9\n\24\3\24\3\24\3\24\7\24\u00fe"+
		"\n\24\f\24\16\24\u0101\13\24\3\24\3\24\3\25\3\25\3\25\7\25\u0108\n\25"+
		"\f\25\16\25\u010b\13\25\3\26\3\26\3\26\5\26\u0110\n\26\3\26\3\26\3\27"+
		"\3\27\3\27\7\27\u0117\n\27\f\27\16\27\u011a\13\27\3\30\3\30\3\30\3\30"+
		"\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\6\4\2\5\5\25\25"+
		"\3\2\6\7\4\2\3\4\b\r\3\2\36 \u0131\2\63\3\2\2\2\4=\3\2\2\2\6M\3\2\2\2"+
		"\bY\3\2\2\2\n\u009b\3\2\2\2\f\u009d\3\2\2\2\16\u00a6\3\2\2\2\20\u00a8"+
		"\3\2\2\2\22\u00aa\3\2\2\2\24\u00b2\3\2\2\2\26\u00c1\3\2\2\2\30\u00c3\3"+
		"\2\2\2\32\u00d6\3\2\2\2\34\u00d8\3\2\2\2\36\u00e6\3\2\2\2 \u00e8\3\2\2"+
		"\2\"\u00ed\3\2\2\2$\u00f1\3\2\2\2&\u00f3\3\2\2\2(\u0104\3\2\2\2*\u010c"+
		"\3\2\2\2,\u0113\3\2\2\2.\u011b\3\2\2\2\60\62\5\6\4\2\61\60\3\2\2\2\62"+
		"\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66"+
		":\5\4\3\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\3\3\2"+
		"\2\2<:\3\2\2\2=>\7\27\2\2>?\7\16\2\2?@\7\17\2\2@D\7\21\2\2AC\5\b\5\2B"+
		"A\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\20\2\2"+
		"H\5\3\2\2\2IJ\5 \21\2JK\7\22\2\2KN\3\2\2\2LN\5&\24\2MI\3\2\2\2ML\3\2\2"+
		"\2N\7\3\2\2\2OP\5 \21\2PQ\7\22\2\2QZ\3\2\2\2RS\5\f\7\2ST\7\22\2\2TZ\3"+
		"\2\2\2UV\5*\26\2VW\7\22\2\2WZ\3\2\2\2XZ\5\n\6\2YO\3\2\2\2YR\3\2\2\2YU"+
		"\3\2\2\2YX\3\2\2\2Z\t\3\2\2\2[\\\7\30\2\2\\]\7\16\2\2]^\5\30\r\2^_\7\17"+
		"\2\2_a\7\21\2\2`b\5\b\5\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3"+
		"\2\2\2et\7\20\2\2fg\7\31\2\2gh\7\16\2\2hi\5\30\r\2ij\7\17\2\2jl\7\21\2"+
		"\2km\5\b\5\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\20"+
		"\2\2qs\3\2\2\2rf\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\u0080\3\2\2\2"+
		"vt\3\2\2\2wx\7\32\2\2xz\7\21\2\2y{\5\b\5\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}~\3\2\2\2~\177\7\20\2\2\177\u0081\3\2\2\2\u0080w\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u009c\3\2\2\2\u0082\u0083\7\33\2\2\u0083\u0085"+
		"\7\21\2\2\u0084\u0086\5\b\5\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\7\20\2\2\u008a\u008b\7\16\2\2\u008b\u008c\5\30\r\2\u008c\u008d\7\17\2"+
		"\2\u008d\u008e\7\22\2\2\u008e\u009c\3\2\2\2\u008f\u0090\7\34\2\2\u0090"+
		"\u0091\7\16\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7\17\2\2\u0093\u0095"+
		"\7\21\2\2\u0094\u0096\5\b\5\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\7\20\2\2\u009a\u009c\3\2\2\2\u009b[\3\2\2\2\u009b\u0082\3\2\2\2\u009b"+
		"\u008f\3\2\2\2\u009c\13\3\2\2\2\u009d\u009e\7\"\2\2\u009e\u009f\7\24\2"+
		"\2\u009f\u00a0\5\16\b\2\u00a0\r\3\2\2\2\u00a1\u00a7\5\20\t\2\u00a2\u00a7"+
		"\5*\26\2\u00a3\u00a7\5\22\n\2\u00a4\u00a7\5\34\17\2\u00a5\u00a7\5\30\r"+
		"\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\7\"\2\2\u00a9"+
		"\21\3\2\2\2\u00aa\u00af\5\24\13\2\u00ab\u00ac\t\2\2\2\u00ac\u00ae\5\24"+
		"\13\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\23\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b7\5\26\f"+
		"\2\u00b3\u00b4\t\3\2\2\u00b4\u00b6\5\26\f\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\25\3\2\2"+
		"\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00bc\5\22\n\2\u00bc"+
		"\u00bd\7\17\2\2\u00bd\u00c2\3\2\2\2\u00be\u00c2\5*\26\2\u00bf\u00c2\5"+
		"\20\t\2\u00c0\u00c2\7%\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c8\5\32\16"+
		"\2\u00c4\u00c5\t\4\2\2\u00c5\u00c7\5\32\16\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\31\3\2\2"+
		"\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\16\2\2\u00cc\u00cd\5\30\r\2\u00cd"+
		"\u00ce\7\17\2\2\u00ce\u00d7\3\2\2\2\u00cf\u00d0\7\26\2\2\u00d0\u00d7\5"+
		"\30\r\2\u00d1\u00d7\5*\26\2\u00d2\u00d7\5\22\n\2\u00d3\u00d7\5\34\17\2"+
		"\u00d4\u00d7\5\20\t\2\u00d5\u00d7\7$\2\2\u00d6\u00cb\3\2\2\2\u00d6\u00cf"+
		"\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\33\3\2\2\2\u00d8\u00dd\5\36\20"+
		"\2\u00d9\u00da\7\25\2\2\u00da\u00dc\5\36\20\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\35\3\2\2"+
		"\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\16\2\2\u00e1\u00e2\5\34\17\2\u00e2"+
		"\u00e3\7\17\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e7\5*\26\2\u00e5\u00e7\7"+
		"#\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\37\3\2\2\2\u00e8\u00eb\5\"\22\2\u00e9\u00ec\7\"\2\2\u00ea\u00ec\5\f\7"+
		"\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec!\3\2\2\2\u00ed\u00ee"+
		"\t\5\2\2\u00ee#\3\2\2\2\u00ef\u00f2\5\"\22\2\u00f0\u00f2\7!\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2%\3\2\2\2\u00f3\u00f4\7\35\2\2"+
		"\u00f4\u00f5\5$\23\2\u00f5\u00f6\7\"\2\2\u00f6\u00f8\7\16\2\2\u00f7\u00f9"+
		"\5(\25\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\7\17\2\2\u00fb\u00ff\7\21\2\2\u00fc\u00fe\5\b\5\2\u00fd\u00fc\3"+
		"\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\20\2\2\u0103\'\3\2\2"+
		"\2\u0104\u0109\5.\30\2\u0105\u0106\7\23\2\2\u0106\u0108\5.\30\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a)\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\"\2\2\u010d\u010f"+
		"\7\16\2\2\u010e\u0110\5,\27\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u0112\7\17\2\2\u0112+\3\2\2\2\u0113\u0118\5"+
		"\16\b\2\u0114\u0115\7\23\2\2\u0115\u0117\5\16\b\2\u0116\u0114\3\2\2\2"+
		"\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119-\3"+
		"\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\5\"\22\2\u011c\u011d\7\"\2\2\u011d"+
		"/\3\2\2\2\36\63:DMYcnt|\u0080\u0087\u0097\u009b\u00a6\u00af\u00b7\u00c1"+
		"\u00c8\u00d6\u00dd\u00e6\u00eb\u00f1\u00f8\u00ff\u0109\u010f\u0118";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}