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
		RULE_int_expr_right = 9, RULE_product = 10, RULE_product_right = 11, RULE_int_faktor = 12, 
		RULE_bool_expr = 13, RULE_bool_expr_right = 14, RULE_bool_faktor = 15, 
		RULE_str_expr = 16, RULE_str_expr_right = 17, RULE_str_faktor = 18, RULE_var_def = 19, 
		RULE_var_data_type = 20, RULE_func_data_type = 21, RULE_func_def = 22, 
		RULE_func_def_params = 23, RULE_func_call = 24, RULE_func_call_params = 25, 
		RULE_parameter = 26;
	public static final String[] ruleNames = {
		"start", "main", "def", "code", "contr_structure", "assignment", "expr", 
		"var_name", "int_expr", "int_expr_right", "product", "product_right", 
		"int_faktor", "bool_expr", "bool_expr_right", "bool_faktor", "str_expr", 
		"str_expr_right", "str_faktor", "var_def", "var_data_type", "func_data_type", 
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				{
				setState(54); ((ProgramContext)_localctx).befDef = def();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60); main();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				{
				setState(61); ((ProgramContext)_localctx).aftDef = def();
				}
				}
				setState(66);
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
			setState(67); match(MAIN);
			setState(68); match(L_PAREN);
			setState(69); match(R_PAREN);
			setState(70); match(L_C_BRACE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(71); ((MainFunctionContext)_localctx).instructions = code();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); match(R_C_BRACE);
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
	public static class DefFunctionDefinitionContext extends DefContext {
		public Func_defContext functionDef;
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public DefFunctionDefinitionContext(DefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDefFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefVariableDefinitionContext extends DefContext {
		public Var_defContext variableDef;
		public TerminalNode SEMICOLON() { return getToken(ToolParser.SEMICOLON, 0); }
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public DefVariableDefinitionContext(DefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDefVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
			case TYPE_STRING:
				_localctx = new DefVariableDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79); ((DefVariableDefinitionContext)_localctx).variableDef = var_def();
				setState(80); match(SEMICOLON);
				}
				break;
			case DEFINE:
				_localctx = new DefFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82); ((DefFunctionDefinitionContext)_localctx).functionDef = func_def();
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
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new CodeVariableDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85); ((CodeVariableDefinitionContext)_localctx).instruction = var_def();
				setState(86); match(SEMICOLON);
				}
				break;

			case 2:
				_localctx = new CodeAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88); ((CodeAssignmentContext)_localctx).instruction = assignment();
				setState(89); match(SEMICOLON);
				}
				break;

			case 3:
				_localctx = new CodeFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91); ((CodeFunctionCallContext)_localctx).instruction = func_call();
				setState(92); match(SEMICOLON);
				}
				break;

			case 4:
				_localctx = new CodeControllStructureContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94); ((CodeControllStructureContext)_localctx).instruction = contr_structure();
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
	public static class DoWhileContext extends Contr_structureContext {
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
		public DoWhileContext(Contr_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitDoWhile(this);
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
			setState(161);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97); match(IF);
				setState(98); match(L_PAREN);
				setState(99); ((IfContext)_localctx).if_condition = bool_expr();
				setState(100); match(R_PAREN);
				setState(101); match(L_C_BRACE);
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102); ((IfContext)_localctx).if_instructions = code();
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
				setState(107); match(R_C_BRACE);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(108); match(ELSEIF);
					setState(109); match(L_PAREN);
					setState(110); ((IfContext)_localctx).elif_condigion = bool_expr();
					setState(111); match(R_PAREN);
					setState(112); match(L_C_BRACE);
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(113); ((IfContext)_localctx).elif_instructions = code();
						}
						}
						setState(116); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
					setState(118); match(R_C_BRACE);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(125); match(ELSE);
					setState(126); match(L_C_BRACE);
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(127); ((IfContext)_localctx).else_instructions = code();
						}
						}
						setState(130); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
					setState(132); match(R_C_BRACE);
					}
				}

				}
				break;
			case DO_WHILE:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(DO_WHILE);
				setState(137); match(L_C_BRACE);
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138); ((DoWhileContext)_localctx).instructions = code();
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
				setState(143); match(R_C_BRACE);
				setState(144); match(L_PAREN);
				setState(145); ((DoWhileContext)_localctx).condition = bool_expr();
				setState(146); match(R_PAREN);
				setState(147); match(SEMICOLON);
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149); match(WHILE);
				setState(150); match(L_PAREN);
				setState(151); ((WhileContext)_localctx).condition = bool_expr();
				setState(152); match(R_PAREN);
				setState(153); match(L_C_BRACE);
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154); ((WhileContext)_localctx).instructions = code();
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0) );
				setState(159); match(R_C_BRACE);
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
		enterRule(_localctx, 10, RULE_assignment);
		try {
			_localctx = new AssignToContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(163); ((AssignToContext)_localctx).variableName = match(NAME);
			setState(164); match(ASSIGN_TO);
			setState(165); ((AssignToContext)_localctx).value = expr();
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
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ExprVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167); ((ExprVariableNameContext)_localctx).e = var_name();
				}
				break;

			case 2:
				_localctx = new ExprFunctionNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168); ((ExprFunctionNameContext)_localctx).e = func_call();
				}
				break;

			case 3:
				_localctx = new ExprIntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169); ((ExprIntegerContext)_localctx).e = int_expr();
				}
				break;

			case 4:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(170); ((ExprStringContext)_localctx).e = str_expr();
				}
				break;

			case 5:
				_localctx = new ExprBooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(171); ((ExprBooleanContext)_localctx).e = bool_expr();
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
		enterRule(_localctx, 14, RULE_var_name);
		try {
			_localctx = new VariableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174); ((VariableNameContext)_localctx).name = match(NAME);
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
	public static class IntegerExpressionContext extends Int_exprContext {
		public ProductContext left;
		public Int_expr_rightContext right;
		public Int_expr_rightContext int_expr_right() {
			return getRuleContext(Int_expr_rightContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public IntegerExpressionContext(Int_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_exprContext int_expr() throws RecognitionException {
		Int_exprContext _localctx = new Int_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_int_expr);
		int _la;
		try {
			_localctx = new IntegerExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176); ((IntegerExpressionContext)_localctx).left = product();
			setState(178);
			_la = _input.LA(1);
			if (_la==3 || _la==CAT) {
				{
				setState(177); ((IntegerExpressionContext)_localctx).right = int_expr_right();
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

	public static class Int_expr_rightContext extends ParserRuleContext {
		public Int_expr_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_expr_right; }
	 
		public Int_expr_rightContext() { }
		public void copyFrom(Int_expr_rightContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerExpressionRightContext extends Int_expr_rightContext {
		public Token operator;
		public Int_exprContext right;
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public IntegerExpressionRightContext(Int_expr_rightContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerExpressionRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_expr_rightContext int_expr_right() throws RecognitionException {
		Int_expr_rightContext _localctx = new Int_expr_rightContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_int_expr_right);
		int _la;
		try {
			_localctx = new IntegerExpressionRightContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((IntegerExpressionRightContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==3 || _la==CAT) ) {
				((IntegerExpressionRightContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(181); ((IntegerExpressionRightContext)_localctx).right = int_expr();
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
	public static class ProductCalcContext extends ProductContext {
		public Int_faktorContext left;
		public Product_rightContext right;
		public Product_rightContext product_right() {
			return getRuleContext(Product_rightContext.class,0);
		}
		public Int_faktorContext int_faktor() {
			return getRuleContext(Int_faktorContext.class,0);
		}
		public ProductCalcContext(ProductContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitProductCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_product);
		int _la;
		try {
			_localctx = new ProductCalcContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183); ((ProductCalcContext)_localctx).left = int_faktor();
			setState(185);
			_la = _input.LA(1);
			if (_la==4 || _la==5) {
				{
				setState(184); ((ProductCalcContext)_localctx).right = product_right();
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

	public static class Product_rightContext extends ParserRuleContext {
		public Product_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product_right; }
	 
		public Product_rightContext() { }
		public void copyFrom(Product_rightContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProductRightContext extends Product_rightContext {
		public Token operator;
		public ProductContext right;
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public ProductRightContext(Product_rightContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitProductRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Product_rightContext product_right() throws RecognitionException {
		Product_rightContext _localctx = new Product_rightContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_product_right);
		int _la;
		try {
			_localctx = new ProductRightContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((ProductRightContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==4 || _la==5) ) {
				((ProductRightContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(188); ((ProductRightContext)_localctx).right = product();
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
		public Int_faktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_faktor; }
	 
		public Int_faktorContext() { }
		public void copyFrom(Int_faktorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerFaktorVariableNameContext extends Int_faktorContext {
		public Var_nameContext e;
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public IntegerFaktorVariableNameContext(Int_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFaktorVariableName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerFaktorContext extends Int_faktorContext {
		public Token e;
		public TerminalNode NUMBER() { return getToken(ToolParser.NUMBER, 0); }
		public IntegerFaktorContext(Int_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFaktor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerFaktorFunctionCallContext extends Int_faktorContext {
		public Func_callContext e;
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public IntegerFaktorFunctionCallContext(Int_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFaktorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerFaktorParenthesisContext extends Int_faktorContext {
		public Int_exprContext e;
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public IntegerFaktorParenthesisContext(Int_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitIntegerFaktorParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_faktorContext int_faktor() throws RecognitionException {
		Int_faktorContext _localctx = new Int_faktorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_int_faktor);
		try {
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IntegerFaktorParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190); match(L_PAREN);
				setState(191); ((IntegerFaktorParenthesisContext)_localctx).e = int_expr();
				setState(192); match(R_PAREN);
				}
				break;

			case 2:
				_localctx = new IntegerFaktorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194); ((IntegerFaktorFunctionCallContext)_localctx).e = func_call();
				}
				break;

			case 3:
				_localctx = new IntegerFaktorVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195); ((IntegerFaktorVariableNameContext)_localctx).e = var_name();
				}
				break;

			case 4:
				_localctx = new IntegerFaktorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(196); ((IntegerFaktorContext)_localctx).e = match(NUMBER);
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
	public static class BooleanExpressionContext extends Bool_exprContext {
		public Bool_faktorContext left;
		public Bool_expr_rightContext right;
		public Bool_faktorContext bool_faktor() {
			return getRuleContext(Bool_faktorContext.class,0);
		}
		public Bool_expr_rightContext bool_expr_right() {
			return getRuleContext(Bool_expr_rightContext.class,0);
		}
		public BooleanExpressionContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_expr);
		try {
			_localctx = new BooleanExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199); ((BooleanExpressionContext)_localctx).left = bool_faktor();
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(200); ((BooleanExpressionContext)_localctx).right = bool_expr_right();
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

	public static class Bool_expr_rightContext extends ParserRuleContext {
		public Bool_expr_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_right; }
	 
		public Bool_expr_rightContext() { }
		public void copyFrom(Bool_expr_rightContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanExpressionRightContext extends Bool_expr_rightContext {
		public Token operator;
		public Bool_exprContext right;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BooleanExpressionRightContext(Bool_expr_rightContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanExpressionRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_rightContext bool_expr_right() throws RecognitionException {
		Bool_expr_rightContext _localctx = new Bool_expr_rightContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool_expr_right);
		int _la;
		try {
			_localctx = new BooleanExpressionRightContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			((BooleanExpressionRightContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11))) != 0)) ) {
				((BooleanExpressionRightContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(204); ((BooleanExpressionRightContext)_localctx).right = bool_expr();
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
		public Bool_faktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_faktor; }
	 
		public Bool_faktorContext() { }
		public void copyFrom(Bool_faktorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanFaktorStringContext extends Bool_faktorContext {
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public BooleanFaktorStringContext(Bool_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFaktorString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFaktorFunctionCallContext extends Bool_faktorContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public BooleanFaktorFunctionCallContext(Bool_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFaktorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFaktorParenthesisContext extends Bool_faktorContext {
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public BooleanFaktorParenthesisContext(Bool_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFaktorParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFaktorBooleanContext extends Bool_faktorContext {
		public TerminalNode BOOLEAN() { return getToken(ToolParser.BOOLEAN, 0); }
		public BooleanFaktorBooleanContext(Bool_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFaktorBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFaktorIntContext extends Bool_faktorContext {
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public BooleanFaktorIntContext(Bool_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFaktorInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFaktorInvertedContext extends Bool_faktorContext {
		public TerminalNode INVERT() { return getToken(ToolParser.INVERT, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BooleanFaktorInvertedContext(Bool_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFaktorInverted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFaktorVariableNameContext extends Bool_faktorContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public BooleanFaktorVariableNameContext(Bool_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitBooleanFaktorVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_faktorContext bool_faktor() throws RecognitionException {
		Bool_faktorContext _localctx = new Bool_faktorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool_faktor);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new BooleanFaktorParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206); match(L_PAREN);
				setState(207); bool_expr();
				setState(208); match(R_PAREN);
				}
				break;

			case 2:
				_localctx = new BooleanFaktorInvertedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210); match(INVERT);
				setState(211); bool_expr();
				}
				break;

			case 3:
				_localctx = new BooleanFaktorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212); func_call();
				}
				break;

			case 4:
				_localctx = new BooleanFaktorIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213); int_expr();
				}
				break;

			case 5:
				_localctx = new BooleanFaktorStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214); str_expr();
				}
				break;

			case 6:
				_localctx = new BooleanFaktorVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(215); var_name();
				}
				break;

			case 7:
				_localctx = new BooleanFaktorBooleanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(216); match(BOOLEAN);
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
		public Str_faktorContext left;
		public Str_expr_rightContext right;
		public Str_expr_rightContext str_expr_right() {
			return getRuleContext(Str_expr_rightContext.class,0);
		}
		public Str_faktorContext str_faktor() {
			return getRuleContext(Str_faktorContext.class,0);
		}
		public StringExpressionContext(Str_exprContext ctx) { copyFrom(ctx); }
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
			setState(219); ((StringExpressionContext)_localctx).left = str_faktor();
			setState(221);
			_la = _input.LA(1);
			if (_la==CAT) {
				{
				setState(220); ((StringExpressionContext)_localctx).right = str_expr_right();
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

	public static class Str_expr_rightContext extends ParserRuleContext {
		public Str_expr_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_expr_right; }
	 
		public Str_expr_rightContext() { }
		public void copyFrom(Str_expr_rightContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExpressionRightContext extends Str_expr_rightContext {
		public Str_exprContext right;
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public TerminalNode CAT() { return getToken(ToolParser.CAT, 0); }
		public StringExpressionRightContext(Str_expr_rightContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringExpressionRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_expr_rightContext str_expr_right() throws RecognitionException {
		Str_expr_rightContext _localctx = new Str_expr_rightContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_str_expr_right);
		try {
			_localctx = new StringExpressionRightContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(CAT);
			setState(224); ((StringExpressionRightContext)_localctx).right = str_expr();
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
		public Str_faktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_faktor; }
	 
		public Str_faktorContext() { }
		public void copyFrom(Str_faktorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringFaktorStringContext extends Str_faktorContext {
		public TerminalNode STRING() { return getToken(ToolParser.STRING, 0); }
		public StringFaktorStringContext(Str_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringFaktorString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFaktorFunctionCallContext extends Str_faktorContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public StringFaktorFunctionCallContext(Str_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringFaktorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFaktorParenthesisContext extends Str_faktorContext {
		public TerminalNode R_PAREN() { return getToken(ToolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(ToolParser.L_PAREN, 0); }
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public StringFaktorParenthesisContext(Str_faktorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitStringFaktorParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_faktorContext str_faktor() throws RecognitionException {
		Str_faktorContext _localctx = new Str_faktorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_str_faktor);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case L_PAREN:
				_localctx = new StringFaktorParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226); match(L_PAREN);
				setState(227); str_expr();
				setState(228); match(R_PAREN);
				}
				break;
			case NAME:
				_localctx = new StringFaktorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230); func_call();
				}
				break;
			case STRING:
				_localctx = new StringFaktorStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231); match(STRING);
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
		enterRule(_localctx, 38, RULE_var_def);
		int _la;
		try {
			_localctx = new VariableDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234); ((VariableDefinitionContext)_localctx).type = var_data_type();
			setState(235); ((VariableDefinitionContext)_localctx).variableName = match(NAME);
			setState(238);
			_la = _input.LA(1);
			if (_la==ASSIGN_TO) {
				{
				setState(236); match(ASSIGN_TO);
				setState(237); ((VariableDefinitionContext)_localctx).value = expr();
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
		enterRule(_localctx, 40, RULE_var_data_type);
		try {
			setState(243);
			switch (_input.LA(1)) {
			case TYPE_INT:
				_localctx = new DataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240); ((DataTypeContext)_localctx).type = match(TYPE_INT);
				}
				break;
			case TYPE_BOOL:
				_localctx = new DataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241); ((DataTypeContext)_localctx).type = match(TYPE_BOOL);
				}
				break;
			case TYPE_STRING:
				_localctx = new DataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242); ((DataTypeContext)_localctx).type = match(TYPE_STRING);
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
		enterRule(_localctx, 42, RULE_func_data_type);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
			case TYPE_STRING:
				_localctx = new FunctionDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245); var_data_type();
				}
				break;
			case TYPE_VOID:
				_localctx = new FunctionDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246); ((FunctionDataTypeContext)_localctx).type = match(TYPE_VOID);
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
		public FunctionDefinitionContext(Func_defContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToolVisitor ) return ((ToolVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func_def);
		int _la;
		try {
			_localctx = new FunctionDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(DEFINE);
			setState(250); ((FunctionDefinitionContext)_localctx).type = func_data_type();
			setState(251); ((FunctionDefinitionContext)_localctx).fn_name = match(NAME);
			setState(252); match(L_PAREN);
			setState(254);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING))) != 0)) {
				{
				setState(253); ((FunctionDefinitionContext)_localctx).parameter_list = func_def_params();
				}
			}

			setState(256); match(R_PAREN);
			setState(257); match(L_C_BRACE);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO_WHILE) | (1L << WHILE) | (1L << TYPE_INT) | (1L << TYPE_BOOL) | (1L << TYPE_STRING) | (1L << NAME))) != 0)) {
				{
				{
				setState(258); ((FunctionDefinitionContext)_localctx).instructions = code();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264); match(R_C_BRACE);
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
		public Func_def_paramsContext rest;
		public Func_def_paramsContext func_def_params() {
			return getRuleContext(Func_def_paramsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ToolParser.COMMA, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
		enterRule(_localctx, 46, RULE_func_def_params);
		int _la;
		try {
			_localctx = new FunctionDefinitionParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(266); ((FunctionDefinitionParametersContext)_localctx).param = parameter();
			setState(269);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(267); match(COMMA);
				setState(268); ((FunctionDefinitionParametersContext)_localctx).rest = func_def_params();
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
		enterRule(_localctx, 48, RULE_func_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(271); ((FunctionCallContext)_localctx).fn_name = match(NAME);
			setState(272); match(L_PAREN);
			setState(274);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << INVERT) | (1L << NAME) | (1L << STRING) | (1L << BOOLEAN) | (1L << NUMBER))) != 0)) {
				{
				setState(273); ((FunctionCallContext)_localctx).parameters = func_call_params();
				}
			}

			setState(276); match(R_PAREN);
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
		public Func_call_paramsContext rest;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ToolParser.COMMA, 0); }
		public Func_call_paramsContext func_call_params() {
			return getRuleContext(Func_call_paramsContext.class,0);
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
		enterRule(_localctx, 50, RULE_func_call_params);
		int _la;
		try {
			_localctx = new FunctionCallParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(278); ((FunctionCallParametersContext)_localctx).param = expr();
			setState(281);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(279); match(COMMA);
				setState(280); ((FunctionCallParametersContext)_localctx).rest = func_call_params();
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
		enterRule(_localctx, 52, RULE_parameter);
		try {
			_localctx = new ParameterDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283); ((ParameterDefinitionContext)_localctx).type = var_data_type();
			setState(284); ((ParameterDefinitionContext)_localctx).name = match(NAME);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\'\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\3\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6j\n\6\r\6\16\6k\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\6\6u\n\6\r\6\16\6v\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\3\6\3"+
		"\6\6\6\u0083\n\6\r\6\16\6\u0084\3\6\3\6\5\6\u0089\n\6\3\6\3\6\3\6\6\6"+
		"\u008e\n\6\r\6\16\6\u008f\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\6\6\u009e\n\6\r\6\16\6\u009f\3\6\3\6\5\6\u00a4\n\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\5\b\u00af\n\b\3\t\3\t\3\n\3\n\5\n\u00b5\n\n\3\13"+
		"\3\13\3\13\3\f\3\f\5\f\u00bc\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00c8\n\16\3\17\3\17\5\17\u00cc\n\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dc\n\21"+
		"\3\22\3\22\5\22\u00e0\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00eb\n\24\3\25\3\25\3\25\3\25\5\25\u00f1\n\25\3\26\3\26\3\26\5"+
		"\26\u00f6\n\26\3\27\3\27\5\27\u00fa\n\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0101\n\30\3\30\3\30\3\30\7\30\u0106\n\30\f\30\16\30\u0109\13\30\3\30"+
		"\3\30\3\31\3\31\3\31\5\31\u0110\n\31\3\32\3\32\3\32\5\32\u0115\n\32\3"+
		"\32\3\32\3\33\3\33\3\33\5\33\u011c\n\33\3\34\3\34\3\34\3\34\2\35\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\5\4\2\5\5\25"+
		"\25\3\2\6\7\4\2\3\4\b\r\u0131\2;\3\2\2\2\4E\3\2\2\2\6U\3\2\2\2\ba\3\2"+
		"\2\2\n\u00a3\3\2\2\2\f\u00a5\3\2\2\2\16\u00ae\3\2\2\2\20\u00b0\3\2\2\2"+
		"\22\u00b2\3\2\2\2\24\u00b6\3\2\2\2\26\u00b9\3\2\2\2\30\u00bd\3\2\2\2\32"+
		"\u00c7\3\2\2\2\34\u00c9\3\2\2\2\36\u00cd\3\2\2\2 \u00db\3\2\2\2\"\u00dd"+
		"\3\2\2\2$\u00e1\3\2\2\2&\u00ea\3\2\2\2(\u00ec\3\2\2\2*\u00f5\3\2\2\2,"+
		"\u00f9\3\2\2\2.\u00fb\3\2\2\2\60\u010c\3\2\2\2\62\u0111\3\2\2\2\64\u0118"+
		"\3\2\2\2\66\u011d\3\2\2\28:\5\6\4\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3"+
		"\2\2\2<>\3\2\2\2=;\3\2\2\2>B\5\4\3\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2C\3\3\2\2\2DB\3\2\2\2EF\7\27\2\2FG\7\16\2\2GH\7\17\2\2"+
		"HL\7\21\2\2IK\5\b\5\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2"+
		"\2NL\3\2\2\2OP\7\20\2\2P\5\3\2\2\2QR\5(\25\2RS\7\22\2\2SV\3\2\2\2TV\5"+
		".\30\2UQ\3\2\2\2UT\3\2\2\2V\7\3\2\2\2WX\5(\25\2XY\7\22\2\2Yb\3\2\2\2Z"+
		"[\5\f\7\2[\\\7\22\2\2\\b\3\2\2\2]^\5\62\32\2^_\7\22\2\2_b\3\2\2\2`b\5"+
		"\n\6\2aW\3\2\2\2aZ\3\2\2\2a]\3\2\2\2a`\3\2\2\2b\t\3\2\2\2cd\7\30\2\2d"+
		"e\7\16\2\2ef\5\34\17\2fg\7\17\2\2gi\7\21\2\2hj\5\b\5\2ih\3\2\2\2jk\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2m|\7\20\2\2no\7\31\2\2op\7\16\2\2pq"+
		"\5\34\17\2qr\7\17\2\2rt\7\21\2\2su\5\b\5\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2"+
		"\2vw\3\2\2\2wx\3\2\2\2xy\7\20\2\2y{\3\2\2\2zn\3\2\2\2{~\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}\u0088\3\2\2\2~|\3\2\2\2\177\u0080\7\32\2\2\u0080\u0082"+
		"\7\21\2\2\u0081\u0083\5\b\5\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\7\20\2\2\u0087\u0089\3\2\2\2\u0088\177\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u00a4\3\2\2\2\u008a\u008b\7\33\2\2\u008b\u008d\7\21\2\2\u008c\u008e\5"+
		"\b\5\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\20\2\2\u0092\u0093\7"+
		"\16\2\2\u0093\u0094\5\34\17\2\u0094\u0095\7\17\2\2\u0095\u0096\7\22\2"+
		"\2\u0096\u00a4\3\2\2\2\u0097\u0098\7\34\2\2\u0098\u0099\7\16\2\2\u0099"+
		"\u009a\5\34\17\2\u009a\u009b\7\17\2\2\u009b\u009d\7\21\2\2\u009c\u009e"+
		"\5\b\5\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00a4\3"+
		"\2\2\2\u00a3c\3\2\2\2\u00a3\u008a\3\2\2\2\u00a3\u0097\3\2\2\2\u00a4\13"+
		"\3\2\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7\24\2\2\u00a7\u00a8\5\16\b\2"+
		"\u00a8\r\3\2\2\2\u00a9\u00af\5\20\t\2\u00aa\u00af\5\62\32\2\u00ab\u00af"+
		"\5\22\n\2\u00ac\u00af\5\"\22\2\u00ad\u00af\5\34\17\2\u00ae\u00a9\3\2\2"+
		"\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\17\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1\21\3\2\2\2\u00b2\u00b4"+
		"\5\26\f\2\u00b3\u00b5\5\24\13\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2"+
		"\2\u00b5\23\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7\u00b8\5\22\n\2\u00b8\25"+
		"\3\2\2\2\u00b9\u00bb\5\32\16\2\u00ba\u00bc\5\30\r\2\u00bb\u00ba\3\2\2"+
		"\2\u00bb\u00bc\3\2\2\2\u00bc\27\3\2\2\2\u00bd\u00be\t\3\2\2\u00be\u00bf"+
		"\5\26\f\2\u00bf\31\3\2\2\2\u00c0\u00c1\7\16\2\2\u00c1\u00c2\5\22\n\2\u00c2"+
		"\u00c3\7\17\2\2\u00c3\u00c8\3\2\2\2\u00c4\u00c8\5\62\32\2\u00c5\u00c8"+
		"\5\20\t\2\u00c6\u00c8\7%\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00cb\5 \21"+
		"\2\u00ca\u00cc\5\36\20\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\35\3\2\2\2\u00cd\u00ce\t\4\2\2\u00ce\u00cf\5\34\17\2\u00cf\37\3\2\2\2"+
		"\u00d0\u00d1\7\16\2\2\u00d1\u00d2\5\34\17\2\u00d2\u00d3\7\17\2\2\u00d3"+
		"\u00dc\3\2\2\2\u00d4\u00d5\7\26\2\2\u00d5\u00dc\5\34\17\2\u00d6\u00dc"+
		"\5\62\32\2\u00d7\u00dc\5\22\n\2\u00d8\u00dc\5\"\22\2\u00d9\u00dc\5\20"+
		"\t\2\u00da\u00dc\7$\2\2\u00db\u00d0\3\2\2\2\u00db\u00d4\3\2\2\2\u00db"+
		"\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00da\3\2\2\2\u00dc!\3\2\2\2\u00dd\u00df\5&\24\2\u00de\u00e0"+
		"\5$\23\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0#\3\2\2\2\u00e1"+
		"\u00e2\7\25\2\2\u00e2\u00e3\5\"\22\2\u00e3%\3\2\2\2\u00e4\u00e5\7\16\2"+
		"\2\u00e5\u00e6\5\"\22\2\u00e6\u00e7\7\17\2\2\u00e7\u00eb\3\2\2\2\u00e8"+
		"\u00eb\5\62\32\2\u00e9\u00eb\7#\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\'\3\2\2\2\u00ec\u00ed\5*\26\2\u00ed\u00f0"+
		"\7\"\2\2\u00ee\u00ef\7\24\2\2\u00ef\u00f1\5\16\b\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1)\3\2\2\2\u00f2\u00f6\7\36\2\2\u00f3\u00f6\7"+
		"\37\2\2\u00f4\u00f6\7 \2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6+\3\2\2\2\u00f7\u00fa\5*\26\2\u00f8\u00fa\7!\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa-\3\2\2\2\u00fb\u00fc\7\35\2\2"+
		"\u00fc\u00fd\5,\27\2\u00fd\u00fe\7\"\2\2\u00fe\u0100\7\16\2\2\u00ff\u0101"+
		"\5\60\31\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0102\u0103\7\17\2\2\u0103\u0107\7\21\2\2\u0104\u0106\5\b\5\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\20\2\2\u010b/\3\2\2\2"+
		"\u010c\u010f\5\66\34\2\u010d\u010e\7\23\2\2\u010e\u0110\5\60\31\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\61\3\2\2\2\u0111\u0112\7\"\2"+
		"\2\u0112\u0114\7\16\2\2\u0113\u0115\5\64\33\2\u0114\u0113\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\17\2\2\u0117\63\3\2\2"+
		"\2\u0118\u011b\5\16\b\2\u0119\u011a\7\23\2\2\u011a\u011c\5\64\33\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\65\3\2\2\2\u011d\u011e\5*\26"+
		"\2\u011e\u011f\7\"\2\2\u011f\67\3\2\2\2\37;BLUakv|\u0084\u0088\u008f\u009f"+
		"\u00a3\u00ae\u00b4\u00bb\u00c7\u00cb\u00db\u00df\u00ea\u00f0\u00f5\u00f9"+
		"\u0100\u0107\u010f\u0114\u011b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}