// Generated from Tool.g4 by ANTLR 4.2
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
		RULE_elif_structure = 5, RULE_assignment = 6, RULE_expr = 7, RULE_var_name = 8, 
		RULE_int_expr = 9, RULE_product = 10, RULE_int_factor = 11, RULE_bool_expr = 12, 
		RULE_bool_factor = 13, RULE_str_expr = 14, RULE_str_factor = 15, RULE_var_def = 16, 
		RULE_var_data_type = 17, RULE_func_data_type = 18, RULE_func_def = 19, 
		RULE_func_def_params = 20, RULE_func_call = 21, RULE_func_call_params = 22, 
		RULE_parameter = 23;
	public static final String[] ruleNames = {
		"start", "main", "def", "code", "contr_structure", "elif_structure", "assignment", 
		"expr", "var_name", "int_expr", "product", "int_factor", "bool_expr", 
		"bool_factor", "str_expr", "str_factor", "var_def", "var_data_type", "func_data_type", 
		"func_def", "func_def_params", "func_call", "func_call_params", "parameter"
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				{
				setState(48); ((ProgramContext)_localctx).def = def();
				((ProgramContext)_localctx).before.add(((ProgramContext)_localctx).def);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54); ((ProgramContext)_localctx).m = main();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				{
				setState(55); ((ProgramContext)_localctx).def = def();
				((ProgramContext)_localctx).after.add(((ProgramContext)_localctx).def);
				}
				}
				setState(60);
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
			setState(61); match(MAIN);
			setState(62); match(L_PAREN);
			setState(63); match(R_PAREN);
			setState(64); match(L_C_BRACE);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(65); ((MainFunctionContext)_localctx).code = code();
				((MainFunctionContext)_localctx).instructions.add(((MainFunctionContext)_localctx).code);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); match(R_C_BRACE);
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
			setState(77);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
			case TYPE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); ((DefContext)_localctx).variableDef = var_def();
				setState(74); match(SEMICOLON);
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); ((DefContext)_localctx).functionDef = func_def();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitCodeControllStructure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodeFunctionCallContext extends CodeContext {
		public Func_callContext instruction;
		public TerminalNode SEMICOLON() { return getToken(ToolParser.SEMICOLON, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public CodeFunctionCallContext(CodeContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitCodeVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_code);
		try {
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new CodeVariableDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79); ((CodeVariableDefinitionContext)_localctx).instruction = var_def();
				setState(80); match(SEMICOLON);
				}
				break;

			case 2:
				_localctx = new CodeAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82); ((CodeAssignmentContext)_localctx).instruction = assignment();
				setState(83); match(SEMICOLON);
				}
				break;

			case 3:
				_localctx = new CodeFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85); ((CodeFunctionCallContext)_localctx).instruction = func_call();
				setState(86); match(SEMICOLON);
				}
				break;

			case 4:
				_localctx = new CodeControllStructureContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88); ((CodeControllStructureContext)_localctx).instruction = contr_structure();
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
		public List<CodeContext> else_instructions = new ArrayList<CodeContext>();
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public List<TerminalNode> L_C_BRACE() { return getTokens(ToolParser.L_C_BRACE); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public Elif_structureContext elif_structure(int i) {
			return getRuleContext(Elif_structureContext.class,i);
		}
		public TerminalNode R_C_BRACE(int i) {
			return getToken(ToolParser.R_C_BRACE, i);
		}
		public TerminalNode IF() { return getToken(ToolParser.IF, 0); }
		public TerminalNode L_C_BRACE(int i) {
			return getToken(ToolParser.L_C_BRACE, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(ToolParser.ELSE, 0); }
		public List<TerminalNode> R_C_BRACE() { return getTokens(ToolParser.R_C_BRACE); }
		public List<Elif_structureContext> elif_structure() {
			return getRuleContexts(Elif_structureContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
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
	public static class DoWhileContext extends Contr_structureContext {
		public CodeContext code;
		public List<CodeContext> instructions = new ArrayList<CodeContext>();
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
		public DoWhileContext(Contr_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends Contr_structureContext {
		public Bool_exprContext condition;
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
				setState(91); match(IF);
				setState(92); match(L_PAREN);
				setState(93); ((IfContext)_localctx).if_condition = bool_expr();
				setState(94); match(R_PAREN);
				setState(95); match(L_C_BRACE);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
					{
					{
					setState(96); ((IfContext)_localctx).code = code();
					((IfContext)_localctx).if_instructions.add(((IfContext)_localctx).code);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102); match(R_C_BRACE);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(103); ((IfContext)_localctx).elif_structure = elif_structure();
					((IfContext)_localctx).elifs.add(((IfContext)_localctx).elif_structure);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(109); match(ELSE);
					setState(110); match(L_C_BRACE);
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
						{
						{
						setState(111); ((IfContext)_localctx).code = code();
						((IfContext)_localctx).else_instructions.add(((IfContext)_localctx).code);
						}
						}
						setState(116);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(117); match(R_C_BRACE);
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
				setState(130); ((DoWhileContext)_localctx).condition = bool_expr();
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
				setState(136); ((WhileContext)_localctx).condition = bool_expr();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_structureContext elif_structure() throws RecognitionException {
		Elif_structureContext _localctx = new Elif_structureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elif_structure);
		int _la;
		try {
			_localctx = new ElseIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(ELSEIF);
			setState(150); match(L_PAREN);
			setState(151); ((ElseIfContext)_localctx).elif_condition = bool_expr();
			setState(152); match(R_PAREN);
			setState(153); match(L_C_BRACE);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(154); ((ElseIfContext)_localctx).code = code();
				((ElseIfContext)_localctx).elif_instructions.add(((ElseIfContext)_localctx).code);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160); match(R_C_BRACE);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitAssignTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			_localctx = new AssignToContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162); ((AssignToContext)_localctx).variableName = match(NAME);
			setState(163); match(ASSIGN_TO);
			setState(164); ((AssignToContext)_localctx).value = expr();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitExprInteger(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitExprVariableName(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitExprFunctionName(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ExprVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166); ((ExprVariableNameContext)_localctx).e = var_name();
				}
				break;

			case 2:
				_localctx = new ExprFunctionNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167); ((ExprFunctionNameContext)_localctx).e = func_call();
				}
				break;

			case 3:
				_localctx = new ExprIntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168); ((ExprIntegerContext)_localctx).e = int_expr(0);
				}
				break;

			case 4:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169); ((ExprStringContext)_localctx).e = str_expr();
				}
				break;

			case 5:
				_localctx = new ExprBooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170); ((ExprBooleanContext)_localctx).e = bool_expr();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_name);
		try {
			_localctx = new VariableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173); ((VariableNameContext)_localctx).name = match(NAME);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerSubtraction(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerProduct(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerAddition(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_int_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IntegerProductContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(176); ((IntegerProductContext)_localctx).left = product(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new IntegerAdditionContext(new Int_exprContext(_parentctx, _parentState));
						((IntegerAdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_expr);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179); match(CAT);
						setState(180); ((IntegerAdditionContext)_localctx).right = product(0);
						}
						break;

					case 2:
						{
						_localctx = new IntegerSubtractionContext(new Int_exprContext(_parentctx, _parentState));
						((IntegerSubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_expr);
						setState(181);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(182); match(3);
						setState(183); ((IntegerSubtractionContext)_localctx).right = product(0);
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_product, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IntegerProductFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(190); ((IntegerProductFactorContext)_localctx).left = int_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new IntegerMultiplicationContext(new ProductContext(_parentctx, _parentState));
						((IntegerMultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_product);
						setState(192);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(193); match(4);
						setState(194); ((IntegerMultiplicationContext)_localctx).right = int_factor();
						}
						break;

					case 2:
						{
						_localctx = new IntegerDivisionContext(new ProductContext(_parentctx, _parentState));
						((IntegerDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_product);
						setState(195);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(196); match(5);
						setState(197); ((IntegerDivisionContext)_localctx).right = int_factor();
						}
						break;
					}
					} 
				}
				setState(202);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFactor(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFactorParenthesis(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFactorVariableName(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFactorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_factorContext int_factor() throws RecognitionException {
		Int_factorContext _localctx = new Int_factorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_int_factor);
		try {
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new IntegerFactorParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203); match(L_PAREN);
				setState(204); ((IntegerFactorParenthesisContext)_localctx).factor = int_expr(0);
				setState(205); match(R_PAREN);
				}
				break;

			case 2:
				_localctx = new IntegerFactorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207); ((IntegerFactorFunctionCallContext)_localctx).factor = func_call();
				}
				break;

			case 3:
				_localctx = new IntegerFactorVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208); ((IntegerFactorVariableNameContext)_localctx).factor = var_name();
				}
				break;

			case 4:
				_localctx = new IntegerFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(209); ((IntegerFactorContext)_localctx).factor = match(NUMBER);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanGE(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanLower(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactor(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_expr);
		try {
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new BooleanLowerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212); ((BooleanLowerContext)_localctx).left = bool_factor();
				setState(213); match(6);
				setState(214); ((BooleanLowerContext)_localctx).right = bool_expr();
				}
				break;

			case 2:
				_localctx = new BooleanGreaterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216); ((BooleanGreaterContext)_localctx).left = bool_factor();
				setState(217); match(2);
				setState(218); ((BooleanGreaterContext)_localctx).right = bool_expr();
				}
				break;

			case 3:
				_localctx = new BooleanLEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220); ((BooleanLEContext)_localctx).left = bool_factor();
				setState(221); match(10);
				setState(222); ((BooleanLEContext)_localctx).right = bool_expr();
				}
				break;

			case 4:
				_localctx = new BooleanGEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224); ((BooleanGEContext)_localctx).left = bool_factor();
				setState(225); match(8);
				setState(226); ((BooleanGEContext)_localctx).right = bool_expr();
				}
				break;

			case 5:
				_localctx = new BooleanEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(228); ((BooleanEqualContext)_localctx).left = bool_factor();
				setState(229); match(7);
				setState(230); ((BooleanEqualContext)_localctx).right = bool_expr();
				}
				break;

			case 6:
				_localctx = new BooleanUnequalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(232); ((BooleanUnequalContext)_localctx).left = bool_factor();
				setState(233); match(9);
				setState(234); ((BooleanUnequalContext)_localctx).right = bool_expr();
				}
				break;

			case 7:
				_localctx = new BooleanOrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(236); ((BooleanOrContext)_localctx).left = bool_factor();
				setState(237); match(1);
				setState(238); ((BooleanOrContext)_localctx).right = bool_expr();
				}
				break;

			case 8:
				_localctx = new BooleanAndContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(240); ((BooleanAndContext)_localctx).left = bool_factor();
				setState(241); match(11);
				setState(242); ((BooleanAndContext)_localctx).right = bool_expr();
				}
				break;

			case 9:
				_localctx = new BooleanFactorContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(244); ((BooleanFactorContext)_localctx).left = bool_factor();
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
	public static class BooleanFactorIntContext extends Bool_factorContext {
		public Int_exprContext factor;
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public BooleanFactorIntContext(Bool_factorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFactorVariableNameContext extends Bool_factorContext {
		public Var_nameContext factor;
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public BooleanFactorVariableNameContext(Bool_factorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorVariableName(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorString(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFactorBooleanContext extends Bool_factorContext {
		public Token factor;
		public TerminalNode BOOLEAN() { return getToken(ToolParser.BOOLEAN, 0); }
		public BooleanFactorBooleanContext(Bool_factorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorBoolean(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFactorParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_factor);
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new BooleanFactorParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247); match(L_PAREN);
				setState(248); ((BooleanFactorParenthesisContext)_localctx).factor = bool_expr();
				setState(249); match(R_PAREN);
				}
				break;

			case 2:
				_localctx = new BooleanFactorInvertedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251); match(INVERT);
				setState(252); ((BooleanFactorInvertedContext)_localctx).factor = bool_expr();
				}
				break;

			case 3:
				_localctx = new BooleanFactorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(253); ((BooleanFactorFunctionCallContext)_localctx).factor = func_call();
				}
				break;

			case 4:
				_localctx = new BooleanFactorIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(254); ((BooleanFactorIntContext)_localctx).factor = int_expr(0);
				}
				break;

			case 5:
				_localctx = new BooleanFactorStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(255); ((BooleanFactorStringContext)_localctx).factor = str_expr();
				}
				break;

			case 6:
				_localctx = new BooleanFactorVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(256); ((BooleanFactorVariableNameContext)_localctx).factor = var_name();
				}
				break;

			case 7:
				_localctx = new BooleanFactorBooleanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(257); ((BooleanFactorBooleanContext)_localctx).factor = match(BOOLEAN);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_exprContext str_expr() throws RecognitionException {
		Str_exprContext _localctx = new Str_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_str_expr);
		int _la;
		try {
			_localctx = new StringExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(260); ((StringExpressionContext)_localctx).left = str_factor();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CAT) {
				{
				{
				setState(261); match(CAT);
				setState(262); ((StringExpressionContext)_localctx).str_factor = str_factor();
				((StringExpressionContext)_localctx).right.add(((StringExpressionContext)_localctx).str_factor);
				}
				}
				setState(267);
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
	public static class StringFactorFunctionCallContext extends Str_factorContext {
		public Func_callContext factor;
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public StringFactorFunctionCallContext(Str_factorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringFactorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFactorStringContext extends Str_factorContext {
		public Token factor;
		public TerminalNode STRING() { return getToken(ToolParser.STRING, 0); }
		public StringFactorStringContext(Str_factorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringFactorString(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringFactorVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_factorContext str_factor() throws RecognitionException {
		Str_factorContext _localctx = new Str_factorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_str_factor);
		try {
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new StringFactorParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(L_PAREN);
				setState(269); ((StringFactorParenthesisContext)_localctx).factor = str_expr();
				setState(270); match(R_PAREN);
				}
				break;

			case 2:
				_localctx = new StringFactorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272); ((StringFactorFunctionCallContext)_localctx).factor = func_call();
				}
				break;

			case 3:
				_localctx = new StringFactorVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273); ((StringFactorVariableNameContext)_localctx).factor = var_name();
				}
				break;

			case 4:
				_localctx = new StringFactorStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274); ((StringFactorStringContext)_localctx).factor = match(STRING);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var_def);
		int _la;
		try {
			_localctx = new VariableDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277); ((VariableDefinitionContext)_localctx).type = var_data_type();
			setState(278); ((VariableDefinitionContext)_localctx).variableName = match(NAME);
			setState(281);
			_la = _input.LA(1);
			if (_la==ASSIGN_TO) {
				{
				setState(279); match(ASSIGN_TO);
				setState(280); ((VariableDefinitionContext)_localctx).value = expr();
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
		public DataTypeContext(Var_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_data_typeContext var_data_type() throws RecognitionException {
		Var_data_typeContext _localctx = new Var_data_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var_data_type);
		try {
			setState(286);
			switch (_input.LA(1)) {
			case TYPE_INT:
				_localctx = new DataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283); ((DataTypeContext)_localctx).type = match(TYPE_INT);
				}
				break;
			case TYPE_BOOL:
				_localctx = new DataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284); ((DataTypeContext)_localctx).type = match(TYPE_BOOL);
				}
				break;
			case TYPE_STRING:
				_localctx = new DataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285); ((DataTypeContext)_localctx).type = match(TYPE_STRING);
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
		public FunctionDataTypeContext(Func_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_data_typeContext func_data_type() throws RecognitionException {
		Func_data_typeContext _localctx = new Func_data_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_data_type);
		try {
			setState(290);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
			case TYPE_STRING:
				_localctx = new FunctionDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288); var_data_type();
				}
				break;
			case TYPE_VOID:
				_localctx = new FunctionDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289); ((FunctionDataTypeContext)_localctx).type = match(TYPE_VOID);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_def);
		int _la;
		try {
			_localctx = new FunctionDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(DEFINE);
			setState(293); ((FunctionDefinitionContext)_localctx).type = func_data_type();
			setState(294); ((FunctionDefinitionContext)_localctx).fn_name = match(NAME);
			setState(295); match(L_PAREN);
			setState(297);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				setState(296); ((FunctionDefinitionContext)_localctx).parameter_list = func_def_params();
				}
			}

			setState(299); match(R_PAREN);
			setState(300); match(L_C_BRACE);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(301); ((FunctionDefinitionContext)_localctx).code = code();
				((FunctionDefinitionContext)_localctx).instructions.add(((FunctionDefinitionContext)_localctx).code);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307); match(R_C_BRACE);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionDefinitionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_def_paramsContext func_def_params() throws RecognitionException {
		Func_def_paramsContext _localctx = new Func_def_paramsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_func_def_params);
		int _la;
		try {
			_localctx = new FunctionDefinitionParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(309); ((FunctionDefinitionParametersContext)_localctx).param = parameter();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310); match(COMMA);
				setState(311); ((FunctionDefinitionParametersContext)_localctx).parameter = parameter();
				((FunctionDefinitionParametersContext)_localctx).remainder.add(((FunctionDefinitionParametersContext)_localctx).parameter);
				}
				}
				setState(316);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_func_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(317); ((FunctionCallContext)_localctx).fn_name = match(NAME);
			setState(318); match(L_PAREN);
			setState(320);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << INVERT) | (1L << NAME) | (1L << STRING) | (1L << BOOLEAN) | (1L << NUMBER))) != 0)) {
				{
				setState(319); ((FunctionCallContext)_localctx).parameters = func_call_params();
				}
			}

			setState(322); match(R_PAREN);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionCallParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_call_paramsContext func_call_params() throws RecognitionException {
		Func_call_paramsContext _localctx = new Func_call_paramsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func_call_params);
		int _la;
		try {
			_localctx = new FunctionCallParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(324); ((FunctionCallParametersContext)_localctx).param = expr();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(325); match(COMMA);
				setState(326); ((FunctionCallParametersContext)_localctx).expr = expr();
				((FunctionCallParametersContext)_localctx).remainder.add(((FunctionCallParametersContext)_localctx).expr);
				}
				}
				setState(331);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitParameterDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameter);
		try {
			_localctx = new ParameterDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(332); ((ParameterDefinitionContext)_localctx).type = var_data_type();
			setState(333); ((ParameterDefinitionContext)_localctx).name = match(NAME);
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
		case 9: return int_expr_sempred((Int_exprContext)_localctx, predIndex);

		case 10: return product_sempred((ProductContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u0152\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4P\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6"+
		"\3\6\7\6s\n\6\f\6\16\6v\13\6\3\6\5\6y\n\6\3\6\3\6\3\6\7\6~\n\6\f\6\16"+
		"\6\u0081\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008f"+
		"\n\6\f\6\16\6\u0092\13\6\3\6\3\6\5\6\u0096\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u009e\n\7\f\7\16\7\u00a1\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00ae\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00bb\n\13\f\13\16\13\u00be\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00d5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f8\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\20\3\20\3\20"+
		"\7\20\u010a\n\20\f\20\16\20\u010d\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0116\n\21\3\22\3\22\3\22\3\22\5\22\u011c\n\22\3\23\3\23\3"+
		"\23\5\23\u0121\n\23\3\24\3\24\5\24\u0125\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u012c\n\25\3\25\3\25\3\25\7\25\u0131\n\25\f\25\16\25\u0134\13\25"+
		"\3\25\3\25\3\26\3\26\3\26\7\26\u013b\n\26\f\26\16\26\u013e\13\26\3\27"+
		"\3\27\3\27\5\27\u0143\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u014a\n\30\f"+
		"\30\16\30\u014d\13\30\3\31\3\31\3\31\3\31\2\4\24\26\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\u016f\2\65\3\2\2\2\4?\3\2\2\2"+
		"\6O\3\2\2\2\b[\3\2\2\2\n\u0095\3\2\2\2\f\u0097\3\2\2\2\16\u00a4\3\2\2"+
		"\2\20\u00ad\3\2\2\2\22\u00af\3\2\2\2\24\u00b1\3\2\2\2\26\u00bf\3\2\2\2"+
		"\30\u00d4\3\2\2\2\32\u00f7\3\2\2\2\34\u0104\3\2\2\2\36\u0106\3\2\2\2 "+
		"\u0115\3\2\2\2\"\u0117\3\2\2\2$\u0120\3\2\2\2&\u0124\3\2\2\2(\u0126\3"+
		"\2\2\2*\u0137\3\2\2\2,\u013f\3\2\2\2.\u0146\3\2\2\2\60\u014e\3\2\2\2\62"+
		"\64\5\6\4\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"8\3\2\2\2\67\65\3\2\2\28<\5\4\3\29;\5\6\4\2:9\3\2\2\2;>\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=\3\3\2\2\2><\3\2\2\2?@\7\27\2\2@A\7\16\2\2AB\7\17\2\2B"+
		"F\7\21\2\2CE\5\b\5\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2"+
		"HF\3\2\2\2IJ\7\20\2\2J\5\3\2\2\2KL\5\"\22\2LM\7\22\2\2MP\3\2\2\2NP\5("+
		"\25\2OK\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR\5\"\22\2RS\7\22\2\2S\\\3\2\2\2"+
		"TU\5\16\b\2UV\7\22\2\2V\\\3\2\2\2WX\5,\27\2XY\7\22\2\2Y\\\3\2\2\2Z\\\5"+
		"\n\6\2[Q\3\2\2\2[T\3\2\2\2[W\3\2\2\2[Z\3\2\2\2\\\t\3\2\2\2]^\7\30\2\2"+
		"^_\7\16\2\2_`\5\32\16\2`a\7\17\2\2ae\7\21\2\2bd\5\b\5\2cb\3\2\2\2dg\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hl\7\20\2\2ik\5\f\7\2ji"+
		"\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mx\3\2\2\2nl\3\2\2\2op\7\32\2\2"+
		"pt\7\21\2\2qs\5\b\5\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2"+
		"\2vt\3\2\2\2wy\7\20\2\2xo\3\2\2\2xy\3\2\2\2y\u0096\3\2\2\2z{\7\33\2\2"+
		"{\177\7\21\2\2|~\5\b\5\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\20\2\2\u0083"+
		"\u0084\7\16\2\2\u0084\u0085\5\32\16\2\u0085\u0086\7\17\2\2\u0086\u0087"+
		"\7\22\2\2\u0087\u0096\3\2\2\2\u0088\u0089\7\34\2\2\u0089\u008a\7\16\2"+
		"\2\u008a\u008b\5\32\16\2\u008b\u008c\7\17\2\2\u008c\u0090\7\21\2\2\u008d"+
		"\u008f\5\b\5\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7\20\2\2\u0094\u0096\3\2\2\2\u0095]\3\2\2\2\u0095z\3\2\2\2\u0095"+
		"\u0088\3\2\2\2\u0096\13\3\2\2\2\u0097\u0098\7\31\2\2\u0098\u0099\7\16"+
		"\2\2\u0099\u009a\5\32\16\2\u009a\u009b\7\17\2\2\u009b\u009f\7\21\2\2\u009c"+
		"\u009e\5\b\5\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\7\20\2\2\u00a3\r\3\2\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7\24\2"+
		"\2\u00a6\u00a7\5\20\t\2\u00a7\17\3\2\2\2\u00a8\u00ae\5\22\n\2\u00a9\u00ae"+
		"\5,\27\2\u00aa\u00ae\5\24\13\2\u00ab\u00ae\5\36\20\2\u00ac\u00ae\5\32"+
		"\16\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00b0\7\"\2"+
		"\2\u00b0\23\3\2\2\2\u00b1\u00b2\b\13\1\2\u00b2\u00b3\5\26\f\2\u00b3\u00bc"+
		"\3\2\2\2\u00b4\u00b5\f\5\2\2\u00b5\u00b6\7\25\2\2\u00b6\u00bb\5\26\f\2"+
		"\u00b7\u00b8\f\4\2\2\u00b8\u00b9\7\5\2\2\u00b9\u00bb\5\26\f\2\u00ba\u00b4"+
		"\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\25\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\f\1"+
		"\2\u00c0\u00c1\5\30\r\2\u00c1\u00ca\3\2\2\2\u00c2\u00c3\f\5\2\2\u00c3"+
		"\u00c4\7\6\2\2\u00c4\u00c9\5\30\r\2\u00c5\u00c6\f\4\2\2\u00c6\u00c7\7"+
		"\7\2\2\u00c7\u00c9\5\30\r\2\u00c8\u00c2\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\27\3\2\2"+
		"\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\16\2\2\u00ce\u00cf\5\24\13\2\u00cf"+
		"\u00d0\7\17\2\2\u00d0\u00d5\3\2\2\2\u00d1\u00d5\5,\27\2\u00d2\u00d5\5"+
		"\22\n\2\u00d3\u00d5\7%\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\31\3\2\2\2\u00d6\u00d7\5\34\17"+
		"\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9\5\32\16\2\u00d9\u00f8\3\2\2\2\u00da"+
		"\u00db\5\34\17\2\u00db\u00dc\7\4\2\2\u00dc\u00dd\5\32\16\2\u00dd\u00f8"+
		"\3\2\2\2\u00de\u00df\5\34\17\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\5\32\16"+
		"\2\u00e1\u00f8\3\2\2\2\u00e2\u00e3\5\34\17\2\u00e3\u00e4\7\n\2\2\u00e4"+
		"\u00e5\5\32\16\2\u00e5\u00f8\3\2\2\2\u00e6\u00e7\5\34\17\2\u00e7\u00e8"+
		"\7\t\2\2\u00e8\u00e9\5\32\16\2\u00e9\u00f8\3\2\2\2\u00ea\u00eb\5\34\17"+
		"\2\u00eb\u00ec\7\13\2\2\u00ec\u00ed\5\32\16\2\u00ed\u00f8\3\2\2\2\u00ee"+
		"\u00ef\5\34\17\2\u00ef\u00f0\7\3\2\2\u00f0\u00f1\5\32\16\2\u00f1\u00f8"+
		"\3\2\2\2\u00f2\u00f3\5\34\17\2\u00f3\u00f4\7\r\2\2\u00f4\u00f5\5\32\16"+
		"\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8\5\34\17\2\u00f7\u00d6\3\2\2\2\u00f7"+
		"\u00da\3\2\2\2\u00f7\u00de\3\2\2\2\u00f7\u00e2\3\2\2\2\u00f7\u00e6\3\2"+
		"\2\2\u00f7\u00ea\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\33\3\2\2\2\u00f9\u00fa\7\16\2\2\u00fa\u00fb\5\32"+
		"\16\2\u00fb\u00fc\7\17\2\2\u00fc\u0105\3\2\2\2\u00fd\u00fe\7\26\2\2\u00fe"+
		"\u0105\5\32\16\2\u00ff\u0105\5,\27\2\u0100\u0105\5\24\13\2\u0101\u0105"+
		"\5\36\20\2\u0102\u0105\5\22\n\2\u0103\u0105\7$\2\2\u0104\u00f9\3\2\2\2"+
		"\u0104\u00fd\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0101"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\35\3\2\2\2\u0106"+
		"\u010b\5 \21\2\u0107\u0108\7\25\2\2\u0108\u010a\5 \21\2\u0109\u0107\3"+
		"\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\37\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\16\2\2\u010f\u0110\5\36"+
		"\20\2\u0110\u0111\7\17\2\2\u0111\u0116\3\2\2\2\u0112\u0116\5,\27\2\u0113"+
		"\u0116\5\22\n\2\u0114\u0116\7#\2\2\u0115\u010e\3\2\2\2\u0115\u0112\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116!\3\2\2\2\u0117\u0118"+
		"\5$\23\2\u0118\u011b\7\"\2\2\u0119\u011a\7\24\2\2\u011a\u011c\5\20\t\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c#\3\2\2\2\u011d\u0121\7"+
		"\36\2\2\u011e\u0121\7\37\2\2\u011f\u0121\7 \2\2\u0120\u011d\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121%\3\2\2\2\u0122\u0125\5$\23\2"+
		"\u0123\u0125\7!\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\'\3"+
		"\2\2\2\u0126\u0127\7\35\2\2\u0127\u0128\5&\24\2\u0128\u0129\7\"\2\2\u0129"+
		"\u012b\7\16\2\2\u012a\u012c\5*\26\2\u012b\u012a\3\2\2\2\u012b\u012c\3"+
		"\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\17\2\2\u012e\u0132\7\21\2\2\u012f"+
		"\u0131\5\b\5\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0136\7\20\2\2\u0136)\3\2\2\2\u0137\u013c\5\60\31\2\u0138\u0139\7\23"+
		"\2\2\u0139\u013b\5\60\31\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d+\3\2\2\2\u013e\u013c\3\2\2\2"+
		"\u013f\u0140\7\"\2\2\u0140\u0142\7\16\2\2\u0141\u0143\5.\30\2\u0142\u0141"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\17\2\2"+
		"\u0145-\3\2\2\2\u0146\u014b\5\20\t\2\u0147\u0148\7\23\2\2\u0148\u014a"+
		"\5\20\t\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c/\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\5"+
		"$\23\2\u014f\u0150\7\"\2\2\u0150\61\3\2\2\2!\65<FO[eltx\177\u0090\u0095"+
		"\u009f\u00ad\u00ba\u00bc\u00c8\u00ca\u00d4\u00f7\u0104\u010b\u0115\u011b"+
		"\u0120\u0124\u012b\u0132\u013c\u0142\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}