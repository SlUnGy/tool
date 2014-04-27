// Generated from C:/Users/franz/Documents/Uni-Shizzle/Compilerbau/tool\Tool.g4 by ANTLR 4.x
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
		RULE_condition = 5, RULE_elif_structure = 6, RULE_else_structure = 7, 
		RULE_assignment = 8, RULE_expr = 9, RULE_var_name = 10, RULE_int_expr = 11, 
		RULE_product = 12, RULE_int_factor = 13, RULE_bool_expr = 14, RULE_bool_factor = 15, 
		RULE_str_expr = 16, RULE_str_factor = 17, RULE_var_def = 18, RULE_var_data_type = 19, 
		RULE_func_data_type = 20, RULE_func_def = 21, RULE_func_def_params = 22, 
		RULE_func_call = 23, RULE_func_call_params = 24, RULE_parameter = 25;
	public static final String[] ruleNames = {
		"start", "main", "def", "code", "contr_structure", "condition", "elif_structure", 
		"else_structure", "assignment", "expr", "var_name", "int_expr", "product", 
		"int_factor", "bool_expr", "bool_factor", "str_expr", "str_factor", "var_def", 
		"var_data_type", "func_data_type", "func_def", "func_def_params", "func_call", 
		"func_call_params", "parameter"
	};

	@Override
	public String getGrammarFileName() { return "Tool.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

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
		public DefContext def;
		public List<DefContext> before = new ArrayList<DefContext>();
		public MainContext m;
		public List<DefContext> after = new ArrayList<DefContext>();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitProgram(this);
		}
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				{
				setState(52); ((ProgramContext)_localctx).def = def();
				((ProgramContext)_localctx).before.add(((ProgramContext)_localctx).def);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58); ((ProgramContext)_localctx).m = main();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				{
				setState(59); ((ProgramContext)_localctx).def = def();
				((ProgramContext)_localctx).after.add(((ProgramContext)_localctx).def);
				}
				}
				setState(64);
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
	public static class MainFunctionContext extends MainContext {
		public CodeContext code;
		public List<CodeContext> instructions = new ArrayList<CodeContext>();
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
		public MainFunctionContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			_localctx = new MainFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(MAIN);
			setState(66); match(L_PAREN);
			setState(67); match(R_PAREN);
			setState(68); match(L_C_BRACE);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(69); ((MainFunctionContext)_localctx).code = code();
				((MainFunctionContext)_localctx).instructions.add(((MainFunctionContext)_localctx).code);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75); match(R_C_BRACE);
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
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	 
		public DefContext() { }
		public void copyFrom(DefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefFunctionDefContext extends DefContext {
		public Func_defContext functionDef;
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public DefFunctionDefContext(DefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterDefFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitDefFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDefFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefVariableDefContext extends DefContext {
		public Var_defContext variableDef;
		public TerminalNode SEMICOLON() { return getToken(ToolParser.SEMICOLON, 0); }
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public DefVariableDefContext(DefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterDefVariableDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitDefVariableDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDefVariableDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
			case TYPE_STRING:
				_localctx = new DefVariableDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77); ((DefVariableDefContext)_localctx).variableDef = var_def();
				setState(78); match(SEMICOLON);
				}
				break;
			case DEFINE:
				_localctx = new DefFunctionDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80); ((DefFunctionDefContext)_localctx).functionDef = func_def();
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
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	 
		public CodeContext() { }
		public void copyFrom(CodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CodeControllStructureContext extends CodeContext {
		public Contr_structureContext instruction;
		public Contr_structureContext contr_structure() {
			return getRuleContext(Contr_structureContext.class,0);
		}
		public CodeControllStructureContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterCodeControllStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitCodeControllStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitCodeControllStructure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodeFunctionCallContext extends CodeContext {
		public Token fn_name;
		public Func_call_paramsContext parameters;
		public TerminalNode SEMICOLON() { return getToken(ToolParser.SEMICOLON, 0); }
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public Func_call_paramsContext func_call_params() {
			return getRuleContext(Func_call_paramsContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public CodeFunctionCallContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterCodeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitCodeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitCodeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodeAssignmentContext extends CodeContext {
		public AssignmentContext instruction;
		public TerminalNode SEMICOLON() { return getToken(ToolParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CodeAssignmentContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterCodeAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitCodeAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitCodeAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodeVariableDefinitionContext extends CodeContext {
		public Var_defContext instruction;
		public TerminalNode SEMICOLON() { return getToken(ToolParser.SEMICOLON, 0); }
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public CodeVariableDefinitionContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterCodeVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitCodeVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitCodeVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_code);
		int _la;
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new CodeVariableDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83); ((CodeVariableDefinitionContext)_localctx).instruction = var_def();
				setState(84); match(SEMICOLON);
				}
				break;

			case 2:
				_localctx = new CodeAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86); ((CodeAssignmentContext)_localctx).instruction = assignment();
				setState(87); match(SEMICOLON);
				}
				break;

			case 3:
				_localctx = new CodeFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89); ((CodeFunctionCallContext)_localctx).fn_name = match(NAME);
				setState(90); match(L_PAREN);
				setState(92);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << INVERT) | (1L << NAME) | (1L << STRING) | (1L << BOOLEAN) | (1L << NUMBER))) != 0)) {
					{
					setState(91); ((CodeFunctionCallContext)_localctx).parameters = func_call_params();
					}
				}

				setState(94); match(R_PAREN);
				setState(95); match(SEMICOLON);
				}
				break;

			case 4:
				_localctx = new CodeControllStructureContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96); ((CodeControllStructureContext)_localctx).instruction = contr_structure();
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
	public static class IfContext extends Contr_structureContext {
		public Bool_exprContext if_condition;
		public CodeContext code;
		public List<CodeContext> if_instructions = new ArrayList<CodeContext>();
		public Elif_structureContext elif_structure;
		public List<Elif_structureContext> elifs = new ArrayList<Elif_structureContext>();
		public Else_structureContext elseStructure;
		public TerminalNode IF() { return getToken(ToolParser.IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_C_BRACE() { return getToken(ToolParser.L_C_BRACE, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public Else_structureContext else_structure() {
			return getRuleContext(Else_structureContext.class,0);
		}
		public Elif_structureContext elif_structure(int i) {
			return getRuleContext(Elif_structureContext.class,i);
		}
		public List<Elif_structureContext> elif_structure() {
			return getRuleContexts(Elif_structureContext.class);
		}
		public TerminalNode R_C_BRACE() { return getToken(ToolParser.R_C_BRACE, 0); }
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public IfContext(Contr_structureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileContext extends Contr_structureContext {
		public CodeContext code;
		public List<CodeContext> instructions = new ArrayList<CodeContext>();
		public TerminalNode SEMICOLON() { return getToken(ToolParser.SEMICOLON, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		public DoWhileContext(Contr_structureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends Contr_structureContext {
		public Bool_exprContext while_condition;
		public CodeContext code;
		public List<CodeContext> instructions = new ArrayList<CodeContext>();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitWhile(this);
		}
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
			setState(147);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99); match(IF);
				setState(100); match(L_PAREN);
				setState(101); ((IfContext)_localctx).if_condition = bool_expr();
				setState(102); match(R_PAREN);
				setState(103); match(L_C_BRACE);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
					{
					{
					setState(104); ((IfContext)_localctx).code = code();
					((IfContext)_localctx).if_instructions.add(((IfContext)_localctx).code);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110); match(R_C_BRACE);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(111); ((IfContext)_localctx).elif_structure = elif_structure();
					((IfContext)_localctx).elifs.add(((IfContext)_localctx).elif_structure);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(117); ((IfContext)_localctx).elseStructure = else_structure();
					}
				}

				}
				break;
			case DO_WHILE:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(DO_WHILE);
				setState(121); match(L_C_BRACE);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
					{
					{
					setState(122); ((DoWhileContext)_localctx).code = code();
					((DoWhileContext)_localctx).instructions.add(((DoWhileContext)_localctx).code);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128); match(R_C_BRACE);
				setState(129); match(L_PAREN);
				setState(130); condition();
				setState(131); match(R_PAREN);
				setState(132); match(SEMICOLON);
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134); match(WHILE);
				setState(135); match(L_PAREN);
				setState(136); ((WhileContext)_localctx).while_condition = bool_expr();
				setState(137); match(R_PAREN);
				setState(138); match(L_C_BRACE);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
					{
					{
					setState(139); ((WhileContext)_localctx).code = code();
					((WhileContext)_localctx).instructions.add(((WhileContext)_localctx).code);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145); match(R_C_BRACE);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondContext extends ConditionContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public CondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			_localctx = new CondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149); bool_expr();
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

	public static class Elif_structureContext extends ParserRuleContext {
		public Elif_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_structure; }
	 
		public Elif_structureContext() { }
		public void copyFrom(Elif_structureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseIfContext extends Elif_structureContext {
		public Bool_exprContext elif_condition;
		public CodeContext code;
		public List<CodeContext> elif_instructions = new ArrayList<CodeContext>();
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode ELSEIF() { return getToken(ToolParser.ELSEIF, 0); }
		public TerminalNode L_C_BRACE() { return getToken(ToolParser.L_C_BRACE, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public TerminalNode R_C_BRACE() { return getToken(ToolParser.R_C_BRACE, 0); }
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public ElseIfContext(Elif_structureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_structureContext elif_structure() throws RecognitionException {
		Elif_structureContext _localctx = new Elif_structureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elif_structure);
		int _la;
		try {
			_localctx = new ElseIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(ELSEIF);
			setState(152); match(L_PAREN);
			setState(153); ((ElseIfContext)_localctx).elif_condition = bool_expr();
			setState(154); match(R_PAREN);
			setState(155); match(L_C_BRACE);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(156); ((ElseIfContext)_localctx).code = code();
				((ElseIfContext)_localctx).elif_instructions.add(((ElseIfContext)_localctx).code);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162); match(R_C_BRACE);
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

	public static class Else_structureContext extends ParserRuleContext {
		public Else_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_structure; }
	 
		public Else_structureContext() { }
		public void copyFrom(Else_structureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseContext extends Else_structureContext {
		public CodeContext code;
		public List<CodeContext> else_instructions = new ArrayList<CodeContext>();
		public TerminalNode L_C_BRACE() { return getToken(ToolParser.L_C_BRACE, 0); }
		public TerminalNode ELSE() { return getToken(ToolParser.ELSE, 0); }
		public TerminalNode R_C_BRACE() { return getToken(ToolParser.R_C_BRACE, 0); }
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public ElseContext(Else_structureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_structureContext else_structure() throws RecognitionException {
		Else_structureContext _localctx = new Else_structureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_structure);
		int _la;
		try {
			_localctx = new ElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(ELSE);
			setState(165); match(L_C_BRACE);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(166); ((ElseContext)_localctx).code = code();
				((ElseContext)_localctx).else_instructions.add(((ElseContext)_localctx).code);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172); match(R_C_BRACE);
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
	public static class AssignToContext extends AssignmentContext {
		public Token variableName;
		public ExprContext value;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public TerminalNode ASSIGN_TO() { return getToken(ToolParser.ASSIGN_TO, 0); }
		public AssignToContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterAssignTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitAssignTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitAssignTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			_localctx = new AssignToContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174); ((AssignToContext)_localctx).variableName = match(NAME);
			setState(175); match(ASSIGN_TO);
			setState(176); ((AssignToContext)_localctx).value = expr();
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprBooleanContext extends ExprContext {
		public Bool_exprContext e;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public ExprBooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterExprBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitExprBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitExprBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntegerContext extends ExprContext {
		public Int_exprContext e;
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public ExprIntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterExprInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitExprInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitExprInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunctionNameContext extends ExprContext {
		public Func_callContext e;
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ExprFunctionNameContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterExprFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitExprFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitExprFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVariableNameContext extends ExprContext {
		public Var_nameContext e;
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public ExprVariableNameContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterExprVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitExprVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitExprVariableName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public Str_exprContext e;
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ExprVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178); ((ExprVariableNameContext)_localctx).e = var_name();
				}
				break;

			case 2:
				_localctx = new ExprFunctionNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179); ((ExprFunctionNameContext)_localctx).e = func_call();
				}
				break;

			case 3:
				_localctx = new ExprIntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180); ((ExprIntegerContext)_localctx).e = int_expr(0);
				}
				break;

			case 4:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181); ((ExprStringContext)_localctx).e = str_expr();
				}
				break;

			case 5:
				_localctx = new ExprBooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(182); ((ExprBooleanContext)_localctx).e = bool_expr();
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
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
	 
		public Var_nameContext() { }
		public void copyFrom(Var_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableNameContext extends Var_nameContext {
		public Token name;
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public VariableNameContext(Var_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_name);
		try {
			_localctx = new VariableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(185); ((VariableNameContext)_localctx).name = match(NAME);
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
		public Int_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_expr; }
	 
		public Int_exprContext() { }
		public void copyFrom(Int_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerSubtractionContext extends Int_exprContext {
		public Int_exprContext left;
		public ProductContext right;
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public IntegerSubtractionContext(Int_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIntegerSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIntegerSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerAdditionContext extends Int_exprContext {
		public Int_exprContext left;
		public ProductContext right;
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public IntegerAdditionContext(Int_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIntegerAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIntegerAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerProductContext extends Int_exprContext {
		public ProductContext left;
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public IntegerProductContext(Int_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIntegerProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIntegerProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_exprContext int_expr() throws RecognitionException {
		return int_expr(0);
	}

	private Int_exprContext int_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_exprContext _localctx = new Int_exprContext(_ctx, _parentState);
		Int_exprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_int_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IntegerProductContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(188); ((IntegerProductContext)_localctx).left = product(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new IntegerAdditionContext(new Int_exprContext(_parentctx, _parentState));
						((IntegerAdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_expr);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191); match(CAT);
						setState(192); ((IntegerAdditionContext)_localctx).right = product(0);
						}
						break;

					case 2:
						{
						_localctx = new IntegerSubtractionContext(new Int_exprContext(_parentctx, _parentState));
						((IntegerSubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_expr);
						setState(193);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(194); match(3);
						setState(195); ((IntegerSubtractionContext)_localctx).right = product(0);
						}
						break;
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ProductContext extends ParserRuleContext {
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
	 
		public ProductContext() { }
		public void copyFrom(ProductContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerMultiplicationContext extends ProductContext {
		public ProductContext left;
		public Int_factorContext right;
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public Int_factorContext int_factor() {
			return getRuleContext(Int_factorContext.class,0);
		}
		public IntegerMultiplicationContext(ProductContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIntegerMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIntegerMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerProductFactorContext extends ProductContext {
		public Int_factorContext left;
		public Int_factorContext int_factor() {
			return getRuleContext(Int_factorContext.class,0);
		}
		public IntegerProductFactorContext(ProductContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIntegerProductFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIntegerProductFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerProductFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerDivisionContext extends ProductContext {
		public ProductContext left;
		public Int_factorContext right;
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public Int_factorContext int_factor() {
			return getRuleContext(Int_factorContext.class,0);
		}
		public IntegerDivisionContext(ProductContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIntegerDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIntegerDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		return product(0);
	}

	private ProductContext product(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProductContext _localctx = new ProductContext(_ctx, _parentState);
		ProductContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_product, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IntegerProductFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(202); ((IntegerProductFactorContext)_localctx).left = int_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new IntegerMultiplicationContext(new ProductContext(_parentctx, _parentState));
						((IntegerMultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_product);
						setState(204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(205); match(4);
						setState(206); ((IntegerMultiplicationContext)_localctx).right = int_factor();
						}
						break;

					case 2:
						{
						_localctx = new IntegerDivisionContext(new ProductContext(_parentctx, _parentState));
						((IntegerDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_product);
						setState(207);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(208); match(5);
						setState(209); ((IntegerDivisionContext)_localctx).right = int_factor();
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Int_factorContext extends ParserRuleContext {
		public Int_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_factor; }
	 
		public Int_factorContext() { }
		public void copyFrom(Int_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerFactorContext extends Int_factorContext {
		public Token factor;
		public TerminalNode NUMBER() { return getToken(ToolParser.NUMBER, 0); }
		public IntegerFactorContext(Int_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIntegerFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIntegerFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerFactorVariableNameContext extends Int_factorContext {
		public Var_nameContext factor;
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public IntegerFactorVariableNameContext(Int_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIntegerFactorVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIntegerFactorVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFactorVariableName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerFactorParenthesisContext extends Int_factorContext {
		public Int_exprContext factor;
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public IntegerFactorParenthesisContext(Int_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIntegerFactorParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIntegerFactorParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFactorParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerFactorFunctionCallContext extends Int_factorContext {
		public Func_callContext factor;
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public IntegerFactorFunctionCallContext(Int_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterIntegerFactorFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitIntegerFactorFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFactorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_factorContext int_factor() throws RecognitionException {
		Int_factorContext _localctx = new Int_factorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_int_factor);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IntegerFactorParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(L_PAREN);
				setState(216); ((IntegerFactorParenthesisContext)_localctx).factor = int_expr(0);
				setState(217); match(R_PAREN);
				}
				break;

			case 2:
				_localctx = new IntegerFactorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219); ((IntegerFactorFunctionCallContext)_localctx).factor = func_call();
				}
				break;

			case 3:
				_localctx = new IntegerFactorVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220); ((IntegerFactorVariableNameContext)_localctx).factor = var_name();
				}
				break;

			case 4:
				_localctx = new IntegerFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(221); ((IntegerFactorContext)_localctx).factor = match(NUMBER);
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
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
	 
		public Bool_exprContext() { }
		public void copyFrom(Bool_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanUnequalContext extends Bool_exprContext {
		public Bool_factorContext left;
		public Bool_exprContext right;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public BooleanUnequalContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanUnequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanUnequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanUnequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAndContext extends Bool_exprContext {
		public Bool_factorContext left;
		public Bool_exprContext right;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public BooleanAndContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanGreaterContext extends Bool_exprContext {
		public Bool_factorContext left;
		public Bool_exprContext right;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public BooleanGreaterContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLEContext extends Bool_exprContext {
		public Bool_factorContext left;
		public Bool_exprContext right;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public BooleanLEContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanOrContext extends Bool_exprContext {
		public Bool_factorContext left;
		public Bool_exprContext right;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public BooleanOrContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanGEContext extends Bool_exprContext {
		public Bool_factorContext left;
		public Bool_exprContext right;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public BooleanGEContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanGE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanGE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanGE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFactorContext extends Bool_exprContext {
		public Bool_factorContext left;
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public BooleanFactorContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLowerContext extends Bool_exprContext {
		public Bool_factorContext left;
		public Bool_exprContext right;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public BooleanLowerContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanLower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanLower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanLower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanEqualContext extends Bool_exprContext {
		public Bool_factorContext left;
		public Bool_exprContext right;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public BooleanEqualContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool_expr);
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new BooleanLowerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224); ((BooleanLowerContext)_localctx).left = bool_factor();
				setState(225); match(6);
				setState(226); ((BooleanLowerContext)_localctx).right = bool_expr();
				}
				break;

			case 2:
				_localctx = new BooleanGreaterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228); ((BooleanGreaterContext)_localctx).left = bool_factor();
				setState(229); match(2);
				setState(230); ((BooleanGreaterContext)_localctx).right = bool_expr();
				}
				break;

			case 3:
				_localctx = new BooleanLEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(232); ((BooleanLEContext)_localctx).left = bool_factor();
				setState(233); match(10);
				setState(234); ((BooleanLEContext)_localctx).right = bool_expr();
				}
				break;

			case 4:
				_localctx = new BooleanGEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(236); ((BooleanGEContext)_localctx).left = bool_factor();
				setState(237); match(8);
				setState(238); ((BooleanGEContext)_localctx).right = bool_expr();
				}
				break;

			case 5:
				_localctx = new BooleanEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(240); ((BooleanEqualContext)_localctx).left = bool_factor();
				setState(241); match(7);
				setState(242); ((BooleanEqualContext)_localctx).right = bool_expr();
				}
				break;

			case 6:
				_localctx = new BooleanUnequalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(244); ((BooleanUnequalContext)_localctx).left = bool_factor();
				setState(245); match(9);
				setState(246); ((BooleanUnequalContext)_localctx).right = bool_expr();
				}
				break;

			case 7:
				_localctx = new BooleanOrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(248); ((BooleanOrContext)_localctx).left = bool_factor();
				setState(249); match(1);
				setState(250); ((BooleanOrContext)_localctx).right = bool_expr();
				}
				break;

			case 8:
				_localctx = new BooleanAndContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(252); ((BooleanAndContext)_localctx).left = bool_factor();
				setState(253); match(11);
				setState(254); ((BooleanAndContext)_localctx).right = bool_expr();
				}
				break;

			case 9:
				_localctx = new BooleanFactorContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(256); ((BooleanFactorContext)_localctx).left = bool_factor();
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

	public static class Bool_factorContext extends ParserRuleContext {
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
	 
		public Bool_factorContext() { }
		public void copyFrom(Bool_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanFactorVariableNameContext extends Bool_factorContext {
		public Var_nameContext factor;
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public BooleanFactorVariableNameContext(Bool_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanFactorVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanFactorVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorVariableName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFactorIntContext extends Bool_factorContext {
		public Int_exprContext factor;
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public BooleanFactorIntContext(Bool_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanFactorInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanFactorInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFactorInvertedContext extends Bool_factorContext {
		public Bool_exprContext factor;
		public TerminalNode INVERT() { return getToken(ToolParser.INVERT, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BooleanFactorInvertedContext(Bool_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanFactorInverted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanFactorInverted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorInverted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFactorStringContext extends Bool_factorContext {
		public Str_exprContext factor;
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public BooleanFactorStringContext(Bool_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanFactorString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanFactorString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFactorBooleanContext extends Bool_factorContext {
		public Token factor;
		public TerminalNode BOOLEAN() { return getToken(ToolParser.BOOLEAN, 0); }
		public BooleanFactorBooleanContext(Bool_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanFactorBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanFactorBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFactorFunctionCallContext extends Bool_factorContext {
		public Func_callContext factor;
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public BooleanFactorFunctionCallContext(Bool_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanFactorFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanFactorFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFactorParenthesisContext extends Bool_factorContext {
		public Bool_exprContext factor;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public BooleanFactorParenthesisContext(Bool_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterBooleanFactorParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitBooleanFactorParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool_factor);
		try {
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new BooleanFactorParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259); match(L_PAREN);
				setState(260); ((BooleanFactorParenthesisContext)_localctx).factor = bool_expr();
				setState(261); match(R_PAREN);
				}
				break;

			case 2:
				_localctx = new BooleanFactorInvertedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263); match(INVERT);
				setState(264); ((BooleanFactorInvertedContext)_localctx).factor = bool_expr();
				}
				break;

			case 3:
				_localctx = new BooleanFactorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265); ((BooleanFactorFunctionCallContext)_localctx).factor = func_call();
				}
				break;

			case 4:
				_localctx = new BooleanFactorIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(266); ((BooleanFactorIntContext)_localctx).factor = int_expr(0);
				}
				break;

			case 5:
				_localctx = new BooleanFactorStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(267); ((BooleanFactorStringContext)_localctx).factor = str_expr();
				}
				break;

			case 6:
				_localctx = new BooleanFactorVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(268); ((BooleanFactorVariableNameContext)_localctx).factor = var_name();
				}
				break;

			case 7:
				_localctx = new BooleanFactorBooleanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(269); ((BooleanFactorBooleanContext)_localctx).factor = match(BOOLEAN);
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
		public Str_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_expr; }
	 
		public Str_exprContext() { }
		public void copyFrom(Str_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExpressionContext extends Str_exprContext {
		public Str_factorContext left;
		public Str_factorContext str_factor;
		public List<Str_factorContext> right = new ArrayList<Str_factorContext>();
		public Str_factorContext str_factor(int i) {
			return getRuleContext(Str_factorContext.class,i);
		}
		public List<Str_factorContext> str_factor() {
			return getRuleContexts(Str_factorContext.class);
		}
		public TerminalNode CAT(int i) {
			return getToken(ToolParser.CAT, i);
		}
		public List<TerminalNode> CAT() { return getTokens(ToolParser.CAT); }
		public StringExpressionContext(Str_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_exprContext str_expr() throws RecognitionException {
		Str_exprContext _localctx = new Str_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_str_expr);
		int _la;
		try {
			_localctx = new StringExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(272); ((StringExpressionContext)_localctx).left = str_factor();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CAT) {
				{
				{
				setState(273); match(CAT);
				setState(274); ((StringExpressionContext)_localctx).str_factor = str_factor();
				((StringExpressionContext)_localctx).right.add(((StringExpressionContext)_localctx).str_factor);
				}
				}
				setState(279);
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

	public static class Str_factorContext extends ParserRuleContext {
		public Str_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_factor; }
	 
		public Str_factorContext() { }
		public void copyFrom(Str_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringFactorStringContext extends Str_factorContext {
		public Token factor;
		public TerminalNode STRING() { return getToken(ToolParser.STRING, 0); }
		public StringFactorStringContext(Str_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterStringFactorString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitStringFactorString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringFactorString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFactorFunctionCallContext extends Str_factorContext {
		public Func_callContext factor;
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public StringFactorFunctionCallContext(Str_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterStringFactorFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitStringFactorFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringFactorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFactorParenthesisContext extends Str_factorContext {
		public Str_exprContext factor;
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public StringFactorParenthesisContext(Str_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterStringFactorParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitStringFactorParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringFactorParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFactorVariableNameContext extends Str_factorContext {
		public Var_nameContext factor;
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public StringFactorVariableNameContext(Str_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterStringFactorVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitStringFactorVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringFactorVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_factorContext str_factor() throws RecognitionException {
		Str_factorContext _localctx = new Str_factorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_str_factor);
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new StringFactorParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280); match(L_PAREN);
				setState(281); ((StringFactorParenthesisContext)_localctx).factor = str_expr();
				setState(282); match(R_PAREN);
				}
				break;

			case 2:
				_localctx = new StringFactorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284); ((StringFactorFunctionCallContext)_localctx).factor = func_call();
				}
				break;

			case 3:
				_localctx = new StringFactorVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285); ((StringFactorVariableNameContext)_localctx).factor = var_name();
				}
				break;

			case 4:
				_localctx = new StringFactorStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(286); ((StringFactorStringContext)_localctx).factor = match(STRING);
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
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
	 
		public Var_defContext() { }
		public void copyFrom(Var_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDefinitionContext extends Var_defContext {
		public Var_data_typeContext type;
		public Token variableName;
		public ExprContext value;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public Var_data_typeContext var_data_type() {
			return getRuleContext(Var_data_typeContext.class,0);
		}
		public TerminalNode ASSIGN_TO() { return getToken(ToolParser.ASSIGN_TO, 0); }
		public VariableDefinitionContext(Var_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_def);
		int _la;
		try {
			_localctx = new VariableDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(289); ((VariableDefinitionContext)_localctx).type = var_data_type();
			setState(290); ((VariableDefinitionContext)_localctx).variableName = match(NAME);
			setState(293);
			_la = _input.LA(1);
			if (_la==ASSIGN_TO) {
				{
				setState(291); match(ASSIGN_TO);
				setState(292); ((VariableDefinitionContext)_localctx).value = expr();
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

	public static class Var_data_typeContext extends ParserRuleContext {
		public Var_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_data_type; }
	 
		public Var_data_typeContext() { }
		public void copyFrom(Var_data_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataTypeContext extends Var_data_typeContext {
		public Token type;
		public TerminalNode TYPE_STRING() { return getToken(ToolParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_BOOL() { return getToken(ToolParser.TYPE_BOOL, 0); }
		public TerminalNode TYPE_INT() { return getToken(ToolParser.TYPE_INT, 0); }
		public DataTypeContext(Var_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_data_typeContext var_data_type() throws RecognitionException {
		Var_data_typeContext _localctx = new Var_data_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var_data_type);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case TYPE_INT:
				_localctx = new DataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295); ((DataTypeContext)_localctx).type = match(TYPE_INT);
				}
				break;
			case TYPE_BOOL:
				_localctx = new DataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296); ((DataTypeContext)_localctx).type = match(TYPE_BOOL);
				}
				break;
			case TYPE_STRING:
				_localctx = new DataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(297); ((DataTypeContext)_localctx).type = match(TYPE_STRING);
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

	public static class Func_data_typeContext extends ParserRuleContext {
		public Func_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_data_type; }
	 
		public Func_data_typeContext() { }
		public void copyFrom(Func_data_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDataTypeContext extends Func_data_typeContext {
		public Token type;
		public TerminalNode TYPE_VOID() { return getToken(ToolParser.TYPE_VOID, 0); }
		public Var_data_typeContext var_data_type() {
			return getRuleContext(Var_data_typeContext.class,0);
		}
		public FunctionDataTypeContext(Func_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterFunctionDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitFunctionDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_data_typeContext func_data_type() throws RecognitionException {
		Func_data_typeContext _localctx = new Func_data_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_func_data_type);
		try {
			setState(302);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
			case TYPE_STRING:
				_localctx = new FunctionDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300); var_data_type();
				}
				break;
			case TYPE_VOID:
				_localctx = new FunctionDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301); ((FunctionDataTypeContext)_localctx).type = match(TYPE_VOID);
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
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
	 
		public Func_defContext() { }
		public void copyFrom(Func_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDefinitionContext extends Func_defContext {
		public Func_data_typeContext type;
		public Token fn_name;
		public Func_def_paramsContext parameter_list;
		public CodeContext code;
		public List<CodeContext> instructions = new ArrayList<CodeContext>();
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
		public FunctionDefinitionContext(Func_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_func_def);
		int _la;
		try {
			_localctx = new FunctionDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(304); match(DEFINE);
			setState(305); ((FunctionDefinitionContext)_localctx).type = func_data_type();
			setState(306); ((FunctionDefinitionContext)_localctx).fn_name = match(NAME);
			setState(307); match(L_PAREN);
			setState(309);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				setState(308); ((FunctionDefinitionContext)_localctx).parameter_list = func_def_params();
				}
			}

			setState(311); match(R_PAREN);
			setState(312); match(L_C_BRACE);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(313); ((FunctionDefinitionContext)_localctx).code = code();
				((FunctionDefinitionContext)_localctx).instructions.add(((FunctionDefinitionContext)_localctx).code);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319); match(R_C_BRACE);
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
		public Func_def_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def_params; }
	 
		public Func_def_paramsContext() { }
		public void copyFrom(Func_def_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDefinitionParametersContext extends Func_def_paramsContext {
		public ParameterContext param;
		public ParameterContext parameter;
		public List<ParameterContext> remainder = new ArrayList<ParameterContext>();
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
		public FunctionDefinitionParametersContext(Func_def_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterFunctionDefinitionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitFunctionDefinitionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionDefinitionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_def_paramsContext func_def_params() throws RecognitionException {
		Func_def_paramsContext _localctx = new Func_def_paramsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func_def_params);
		int _la;
		try {
			_localctx = new FunctionDefinitionParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(321); ((FunctionDefinitionParametersContext)_localctx).param = parameter();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(322); match(COMMA);
				setState(323); ((FunctionDefinitionParametersContext)_localctx).parameter = parameter();
				((FunctionDefinitionParametersContext)_localctx).remainder.add(((FunctionDefinitionParametersContext)_localctx).parameter);
				}
				}
				setState(328);
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
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	 
		public Func_callContext() { }
		public void copyFrom(Func_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallContext extends Func_callContext {
		public Token fn_name;
		public Func_call_paramsContext parameters;
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public Func_call_paramsContext func_call_params() {
			return getRuleContext(Func_call_paramsContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public FunctionCallContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_func_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(329); ((FunctionCallContext)_localctx).fn_name = match(NAME);
			setState(330); match(L_PAREN);
			setState(332);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << INVERT) | (1L << NAME) | (1L << STRING) | (1L << BOOLEAN) | (1L << NUMBER))) != 0)) {
				{
				setState(331); ((FunctionCallContext)_localctx).parameters = func_call_params();
				}
			}

			setState(334); match(R_PAREN);
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
		public Func_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_params; }
	 
		public Func_call_paramsContext() { }
		public void copyFrom(Func_call_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallParametersContext extends Func_call_paramsContext {
		public ExprContext param;
		public ExprContext expr;
		public List<ExprContext> remainder = new ArrayList<ExprContext>();
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
		public FunctionCallParametersContext(Func_call_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterFunctionCallParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitFunctionCallParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionCallParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_call_paramsContext func_call_params() throws RecognitionException {
		Func_call_paramsContext _localctx = new Func_call_paramsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_func_call_params);
		int _la;
		try {
			_localctx = new FunctionCallParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(336); ((FunctionCallParametersContext)_localctx).param = expr();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(337); match(COMMA);
				setState(338); ((FunctionCallParametersContext)_localctx).expr = expr();
				((FunctionCallParametersContext)_localctx).remainder.add(((FunctionCallParametersContext)_localctx).expr);
				}
				}
				setState(343);
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
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterDefinitionContext extends ParameterContext {
		public Var_data_typeContext type;
		public Token name;
		public TerminalNode NAME() { return getToken(ToolParser.NAME, 0); }
		public Var_data_typeContext var_data_type() {
			return getRuleContext(Var_data_typeContext.class,0);
		}
		public ParameterDefinitionContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).enterParameterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToolListener ) ((ToolListener)listener).exitParameterDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitParameterDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameter);
		try {
			_localctx = new ParameterDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(344); ((ParameterDefinitionContext)_localctx).type = var_data_type();
			setState(345); ((ParameterDefinitionContext)_localctx).name = match(NAME);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return int_expr_sempred((Int_exprContext)_localctx, predIndex);

		case 12: return product_sempred((ProductContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean product_sempred(ProductContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean int_expr_sempred(Int_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);

		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u015e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\3\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\5\3"+
		"\5\3\5\5\5d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3"+
		"\6\7\6s\n\6\f\6\16\6v\13\6\3\6\5\6y\n\6\3\6\3\6\3\6\7\6~\n\6\f\6\16\6"+
		"\u0081\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008f"+
		"\n\6\f\6\16\6\u0092\13\6\3\6\3\6\5\6\u0096\n\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00a0\n\b\f\b\16\b\u00a3\13\b\3\b\3\b\3\t\3\t\3\t\7\t\u00aa"+
		"\n\t\f\t\16\t\u00ad\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00ba\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c7"+
		"\n\r\f\r\16\r\u00ca\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00d5\n\16\f\16\16\16\u00d8\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00e1\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0104\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0111\n\21\3\22\3\22"+
		"\3\22\7\22\u0116\n\22\f\22\16\22\u0119\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0122\n\23\3\24\3\24\3\24\3\24\5\24\u0128\n\24\3\25\3"+
		"\25\3\25\5\25\u012d\n\25\3\26\3\26\5\26\u0131\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0138\n\27\3\27\3\27\3\27\7\27\u013d\n\27\f\27\16\27\u0140"+
		"\13\27\3\27\3\27\3\30\3\30\3\30\7\30\u0147\n\30\f\30\16\30\u014a\13\30"+
		"\3\31\3\31\3\31\5\31\u014f\n\31\3\31\3\31\3\32\3\32\3\32\7\32\u0156\n"+
		"\32\f\32\16\32\u0159\13\32\3\33\3\33\3\33\3\33\2\4\30\32\34\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\u017a\29\3\2\2\2\4"+
		"C\3\2\2\2\6S\3\2\2\2\bc\3\2\2\2\n\u0095\3\2\2\2\f\u0097\3\2\2\2\16\u0099"+
		"\3\2\2\2\20\u00a6\3\2\2\2\22\u00b0\3\2\2\2\24\u00b9\3\2\2\2\26\u00bb\3"+
		"\2\2\2\30\u00bd\3\2\2\2\32\u00cb\3\2\2\2\34\u00e0\3\2\2\2\36\u0103\3\2"+
		"\2\2 \u0110\3\2\2\2\"\u0112\3\2\2\2$\u0121\3\2\2\2&\u0123\3\2\2\2(\u012c"+
		"\3\2\2\2*\u0130\3\2\2\2,\u0132\3\2\2\2.\u0143\3\2\2\2\60\u014b\3\2\2\2"+
		"\62\u0152\3\2\2\2\64\u015a\3\2\2\2\668\5\6\4\2\67\66\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<@\5\4\3\2=?\5\6\4\2>=\3\2\2"+
		"\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3\3\2\2\2B@\3\2\2\2CD\7\27\2\2DE\7\16"+
		"\2\2EF\7\17\2\2FJ\7\21\2\2GI\5\b\5\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\20\2\2N\5\3\2\2\2OP\5&\24\2PQ\7\22\2\2"+
		"QT\3\2\2\2RT\5,\27\2SO\3\2\2\2SR\3\2\2\2T\7\3\2\2\2UV\5&\24\2VW\7\22\2"+
		"\2Wd\3\2\2\2XY\5\22\n\2YZ\7\22\2\2Zd\3\2\2\2[\\\7\"\2\2\\^\7\16\2\2]_"+
		"\5\62\32\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\17\2\2ad\7\22\2\2bd\5\n\6"+
		"\2cU\3\2\2\2cX\3\2\2\2c[\3\2\2\2cb\3\2\2\2d\t\3\2\2\2ef\7\30\2\2fg\7\16"+
		"\2\2gh\5\36\20\2hi\7\17\2\2im\7\21\2\2jl\5\b\5\2kj\3\2\2\2lo\3\2\2\2m"+
		"k\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pt\7\20\2\2qs\5\16\b\2rq\3\2\2"+
		"\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wy\5\20\t\2xw\3\2"+
		"\2\2xy\3\2\2\2y\u0096\3\2\2\2z{\7\33\2\2{\177\7\21\2\2|~\5\b\5\2}|\3\2"+
		"\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0082\u0083\7\20\2\2\u0083\u0084\7\16\2\2\u0084\u0085"+
		"\5\f\7\2\u0085\u0086\7\17\2\2\u0086\u0087\7\22\2\2\u0087\u0096\3\2\2\2"+
		"\u0088\u0089\7\34\2\2\u0089\u008a\7\16\2\2\u008a\u008b\5\36\20\2\u008b"+
		"\u008c\7\17\2\2\u008c\u0090\7\21\2\2\u008d\u008f\5\b\5\2\u008e\u008d\3"+
		"\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\20\2\2\u0094\u0096\3"+
		"\2\2\2\u0095e\3\2\2\2\u0095z\3\2\2\2\u0095\u0088\3\2\2\2\u0096\13\3\2"+
		"\2\2\u0097\u0098\5\36\20\2\u0098\r\3\2\2\2\u0099\u009a\7\31\2\2\u009a"+
		"\u009b\7\16\2\2\u009b\u009c\5\36\20\2\u009c\u009d\7\17\2\2\u009d\u00a1"+
		"\7\21\2\2\u009e\u00a0\5\b\5\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a5\7\20\2\2\u00a5\17\3\2\2\2\u00a6\u00a7\7\32\2\2\u00a7"+
		"\u00ab\7\21\2\2\u00a8\u00aa\5\b\5\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\7\20\2\2\u00af\21\3\2\2\2\u00b0\u00b1\7\"\2"+
		"\2\u00b1\u00b2\7\24\2\2\u00b2\u00b3\5\24\13\2\u00b3\23\3\2\2\2\u00b4\u00ba"+
		"\5\26\f\2\u00b5\u00ba\5\60\31\2\u00b6\u00ba\5\30\r\2\u00b7\u00ba\5\"\22"+
		"\2\u00b8\u00ba\5\36\20\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9"+
		"\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\25\3\2\2"+
		"\2\u00bb\u00bc\7\"\2\2\u00bc\27\3\2\2\2\u00bd\u00be\b\r\1\2\u00be\u00bf"+
		"\5\32\16\2\u00bf\u00c8\3\2\2\2\u00c0\u00c1\f\5\2\2\u00c1\u00c2\7\25\2"+
		"\2\u00c2\u00c7\5\32\16\2\u00c3\u00c4\f\4\2\2\u00c4\u00c5\7\5\2\2\u00c5"+
		"\u00c7\5\32\16\2\u00c6\u00c0\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\31\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\b\16\1\2\u00cc\u00cd\5\34\17\2\u00cd\u00d6"+
		"\3\2\2\2\u00ce\u00cf\f\5\2\2\u00cf\u00d0\7\6\2\2\u00d0\u00d5\5\34\17\2"+
		"\u00d1\u00d2\f\4\2\2\u00d2\u00d3\7\7\2\2\u00d3\u00d5\5\34\17\2\u00d4\u00ce"+
		"\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\33\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\16\2"+
		"\2\u00da\u00db\5\30\r\2\u00db\u00dc\7\17\2\2\u00dc\u00e1\3\2\2\2\u00dd"+
		"\u00e1\5\60\31\2\u00de\u00e1\5\26\f\2\u00df\u00e1\7%\2\2\u00e0\u00d9\3"+
		"\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\35\3\2\2\2\u00e2\u00e3\5 \21\2\u00e3\u00e4\7\b\2\2\u00e4\u00e5\5\36\20"+
		"\2\u00e5\u0104\3\2\2\2\u00e6\u00e7\5 \21\2\u00e7\u00e8\7\4\2\2\u00e8\u00e9"+
		"\5\36\20\2\u00e9\u0104\3\2\2\2\u00ea\u00eb\5 \21\2\u00eb\u00ec\7\f\2\2"+
		"\u00ec\u00ed\5\36\20\2\u00ed\u0104\3\2\2\2\u00ee\u00ef\5 \21\2\u00ef\u00f0"+
		"\7\n\2\2\u00f0\u00f1\5\36\20\2\u00f1\u0104\3\2\2\2\u00f2\u00f3\5 \21\2"+
		"\u00f3\u00f4\7\t\2\2\u00f4\u00f5\5\36\20\2\u00f5\u0104\3\2\2\2\u00f6\u00f7"+
		"\5 \21\2\u00f7\u00f8\7\13\2\2\u00f8\u00f9\5\36\20\2\u00f9\u0104\3\2\2"+
		"\2\u00fa\u00fb\5 \21\2\u00fb\u00fc\7\3\2\2\u00fc\u00fd\5\36\20\2\u00fd"+
		"\u0104\3\2\2\2\u00fe\u00ff\5 \21\2\u00ff\u0100\7\r\2\2\u0100\u0101\5\36"+
		"\20\2\u0101\u0104\3\2\2\2\u0102\u0104\5 \21\2\u0103\u00e2\3\2\2\2\u0103"+
		"\u00e6\3\2\2\2\u0103\u00ea\3\2\2\2\u0103\u00ee\3\2\2\2\u0103\u00f2\3\2"+
		"\2\2\u0103\u00f6\3\2\2\2\u0103\u00fa\3\2\2\2\u0103\u00fe\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\37\3\2\2\2\u0105\u0106\7\16\2\2\u0106\u0107\5\36"+
		"\20\2\u0107\u0108\7\17\2\2\u0108\u0111\3\2\2\2\u0109\u010a\7\26\2\2\u010a"+
		"\u0111\5\36\20\2\u010b\u0111\5\60\31\2\u010c\u0111\5\30\r\2\u010d\u0111"+
		"\5\"\22\2\u010e\u0111\5\26\f\2\u010f\u0111\7$\2\2\u0110\u0105\3\2\2\2"+
		"\u0110\u0109\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010d"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111!\3\2\2\2\u0112"+
		"\u0117\5$\23\2\u0113\u0114\7\25\2\2\u0114\u0116\5$\23\2\u0115\u0113\3"+
		"\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"#\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7\16\2\2\u011b\u011c\5\"\22"+
		"\2\u011c\u011d\7\17\2\2\u011d\u0122\3\2\2\2\u011e\u0122\5\60\31\2\u011f"+
		"\u0122\5\26\f\2\u0120\u0122\7#\2\2\u0121\u011a\3\2\2\2\u0121\u011e\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122%\3\2\2\2\u0123\u0124"+
		"\5(\25\2\u0124\u0127\7\"\2\2\u0125\u0126\7\24\2\2\u0126\u0128\5\24\13"+
		"\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\'\3\2\2\2\u0129\u012d"+
		"\7\36\2\2\u012a\u012d\7\37\2\2\u012b\u012d\7 \2\2\u012c\u0129\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d)\3\2\2\2\u012e\u0131\5"+
		"(\25\2\u012f\u0131\7!\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"+\3\2\2\2\u0132\u0133\7\35\2\2\u0133\u0134\5*\26\2\u0134\u0135\7\"\2\2"+
		"\u0135\u0137\7\16\2\2\u0136\u0138\5.\30\2\u0137\u0136\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\17\2\2\u013a\u013e\7\21\2\2"+
		"\u013b\u013d\5\b\5\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0142\7\20\2\2\u0142-\3\2\2\2\u0143\u0148\5\64\33\2\u0144\u0145\7\23"+
		"\2\2\u0145\u0147\5\64\33\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149/\3\2\2\2\u014a\u0148\3\2\2\2"+
		"\u014b\u014c\7\"\2\2\u014c\u014e\7\16\2\2\u014d\u014f\5\62\32\2\u014e"+
		"\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\17"+
		"\2\2\u0151\61\3\2\2\2\u0152\u0157\5\24\13\2\u0153\u0154\7\23\2\2\u0154"+
		"\u0156\5\24\13\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\63\3\2\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015b\5(\25\2\u015b\u015c\7\"\2\2\u015c\65\3\2\2\2\"9@JS^cmtx\177\u0090"+
		"\u0095\u00a1\u00ab\u00b9\u00c6\u00c8\u00d4\u00d6\u00e0\u0103\u0110\u0117"+
		"\u0121\u0127\u012c\u0130\u0137\u013e\u0148\u014e\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}