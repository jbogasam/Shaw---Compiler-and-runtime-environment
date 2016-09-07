// Generated from Shaw.g4 by ANTLR 4.5.3
package Compilerbuild.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShawParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, Identifier=30, Numval=31, 
		Stringval=32, WHITESPACE=33;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_blockstmt = 2, RULE_funcdeclaration = 3, 
		RULE_localvariabledeclarationstmt = 4, RULE_variabledeclarators = 5, RULE_variabledeclarator = 6, 
		RULE_variabledeclaratorId = 7, RULE_variableInitializer = 8, RULE_stmt = 9, 
		RULE_parexpression = 10, RULE_expression = 11, RULE_type = 12, RULE_argument = 13, 
		RULE_boolval = 14;
	public static final String[] ruleNames = {
		"start", "block", "blockstmt", "funcdeclaration", "localvariabledeclarationstmt", 
		"variabledeclarators", "variabledeclarator", "variabledeclaratorId", "variableInitializer", 
		"stmt", "parexpression", "expression", "type", "argument", "boolval"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'{'", "'}'", "'func'", "'void'", "'('", "')'", "','", 
		"'='", "'return'", "'while'", "'if'", "'else'", "'=='", "'!='", "'+'", 
		"'-'", "'*'", "'/'", "'<'", "'<='", "'>'", "'>='", "'int'", "'bool'", 
		"'String'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "Identifier", "Numval", "Stringval", 
		"WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Shaw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShawParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			block();
			setState(32);
			match(T__1);
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockstmtContext> blockstmt() {
			return getRuleContexts(BlockstmtContext.class);
		}
		public BlockstmtContext blockstmt(int i) {
			return getRuleContext(BlockstmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__2);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << Identifier) | (1L << Numval) | (1L << Stringval))) != 0)) {
				{
				{
				setState(35);
				blockstmt();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(T__3);
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

	public static class BlockstmtContext extends ParserRuleContext {
		public FuncdeclarationContext funcdeclaration() {
			return getRuleContext(FuncdeclarationContext.class,0);
		}
		public LocalvariabledeclarationstmtContext localvariabledeclarationstmt() {
			return getRuleContext(LocalvariabledeclarationstmtContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitBlockstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockstmtContext blockstmt() throws RecognitionException {
		BlockstmtContext _localctx = new BlockstmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blockstmt);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				funcdeclaration();
				}
				break;
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				localvariabledeclarationstmt();
				}
				break;
			case T__2:
			case T__6:
			case T__10:
			case T__11:
			case T__12:
			case T__27:
			case T__28:
			case Identifier:
			case Numval:
			case Stringval:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				stmt();
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

	public static class FuncdeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ShawParser.Identifier, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitFuncdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclarationContext funcdeclaration() throws RecognitionException {
		FuncdeclarationContext _localctx = new FuncdeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__4);
			setState(51);
			switch (_input.LA(1)) {
			case T__24:
			case T__25:
			case T__26:
				{
				setState(49);
				type();
				}
				break;
			case T__5:
				{
				setState(50);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(53);
			match(Identifier);
			setState(54);
			match(T__6);
			setState(55);
			argument();
			setState(56);
			match(T__7);
			setState(57);
			block();
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

	public static class LocalvariabledeclarationstmtContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariabledeclaratorsContext variabledeclarators() {
			return getRuleContext(VariabledeclaratorsContext.class,0);
		}
		public LocalvariabledeclarationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localvariabledeclarationstmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitLocalvariabledeclarationstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalvariabledeclarationstmtContext localvariabledeclarationstmt() throws RecognitionException {
		LocalvariabledeclarationstmtContext _localctx = new LocalvariabledeclarationstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_localvariabledeclarationstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			type();
			setState(60);
			variabledeclarators();
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

	public static class VariabledeclaratorsContext extends ParserRuleContext {
		public List<VariabledeclaratorContext> variabledeclarator() {
			return getRuleContexts(VariabledeclaratorContext.class);
		}
		public VariabledeclaratorContext variabledeclarator(int i) {
			return getRuleContext(VariabledeclaratorContext.class,i);
		}
		public VariabledeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitVariabledeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclaratorsContext variabledeclarators() throws RecognitionException {
		VariabledeclaratorsContext _localctx = new VariabledeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variabledeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			variabledeclarator();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(63);
				match(T__8);
				setState(64);
				variabledeclarator();
				}
				}
				setState(69);
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

	public static class VariabledeclaratorContext extends ParserRuleContext {
		public VariabledeclaratorIdContext variabledeclaratorId() {
			return getRuleContext(VariabledeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariabledeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitVariabledeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclaratorContext variabledeclarator() throws RecognitionException {
		VariabledeclaratorContext _localctx = new VariabledeclaratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variabledeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			variabledeclaratorId();
			setState(73);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(71);
				match(T__9);
				setState(72);
				variableInitializer();
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

	public static class VariabledeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ShawParser.Identifier, 0); }
		public VariabledeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitVariabledeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclaratorIdContext variabledeclaratorId() throws RecognitionException {
		VariabledeclaratorIdContext _localctx = new VariabledeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variabledeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(Identifier);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			expression(0);
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

	public static class StmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParexpressionContext parexpression() {
			return getRuleContext(ParexpressionContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				block();
				}
				break;
			case T__6:
			case T__27:
			case T__28:
			case Identifier:
			case Numval:
			case Stringval:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				expression(0);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(T__10);
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(82);
					expression(0);
					}
					break;
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(T__11);
				setState(86);
				parexpression();
				setState(87);
				stmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(T__12);
				setState(90);
				parexpression();
				setState(91);
				stmt();
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(92);
					match(T__13);
					setState(93);
					stmt();
					}
					break;
				}
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

	public static class ParexpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitParexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParexpressionContext parexpression() throws RecognitionException {
		ParexpressionContext _localctx = new ParexpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__6);
			setState(99);
			expression(0);
			setState(100);
			match(T__7);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Numval() { return getToken(ShawParser.Numval, 0); }
		public BoolvalContext boolval() {
			return getRuleContext(BoolvalContext.class,0);
		}
		public TerminalNode Stringval() { return getToken(ShawParser.Stringval, 0); }
		public TerminalNode Identifier() { return getToken(ShawParser.Identifier, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(103);
				match(T__6);
				setState(104);
				expression(0);
				setState(105);
				match(T__7);
				}
				break;
			case Numval:
				{
				setState(107);
				match(Numval);
				}
				break;
			case T__27:
			case T__28:
				{
				setState(108);
				boolval();
				}
				break;
			case Stringval:
				{
				setState(109);
				match(Stringval);
				}
				break;
			case Identifier:
				{
				setState(110);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(114);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(115);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(117);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(118);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(120);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(121);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(123);
						match(T__6);
						setState(124);
						expression(0);
						setState(125);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ShawParser.Identifier, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			type();
			setState(135);
			match(Identifier);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					match(T__8);
					setState(137);
					argument();
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class BoolvalContext extends ParserRuleContext {
		public BoolvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShawVisitor ) return ((ShawVisitor<? extends T>)visitor).visitBoolval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolvalContext boolval() throws RecognitionException {
		BoolvalContext _localctx = new BoolvalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0094\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3"+
		"\5\5\5\66\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7D\n\7"+
		"\f\7\16\7G\13\7\3\b\3\b\3\b\5\bL\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\5\13V\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13a\n\13"+
		"\5\13c\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rr\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0082\n"+
		"\r\f\r\16\r\u0085\13\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u008d\n\17\f"+
		"\17\16\17\u0090\13\17\3\20\3\20\3\20\2\3\30\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\7\3\2\21\22\3\2\23\26\4\2\f\f\27\32\3\2\33\35\3\2\36"+
		"\37\u0099\2 \3\2\2\2\4$\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n=\3\2\2\2\f"+
		"@\3\2\2\2\16H\3\2\2\2\20M\3\2\2\2\22O\3\2\2\2\24b\3\2\2\2\26d\3\2\2\2"+
		"\30q\3\2\2\2\32\u0086\3\2\2\2\34\u0088\3\2\2\2\36\u0091\3\2\2\2 !\7\3"+
		"\2\2!\"\5\4\3\2\"#\7\4\2\2#\3\3\2\2\2$(\7\5\2\2%\'\5\6\4\2&%\3\2\2\2\'"+
		"*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\6\2\2,\5\3\2\2\2"+
		"-\61\5\b\5\2.\61\5\n\6\2/\61\5\24\13\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2"+
		"\2\2\61\7\3\2\2\2\62\65\7\7\2\2\63\66\5\32\16\2\64\66\7\b\2\2\65\63\3"+
		"\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\678\7 \2\289\7\t\2\29:\5\34\17\2:;"+
		"\7\n\2\2;<\5\4\3\2<\t\3\2\2\2=>\5\32\16\2>?\5\f\7\2?\13\3\2\2\2@E\5\16"+
		"\b\2AB\7\13\2\2BD\5\16\b\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\r"+
		"\3\2\2\2GE\3\2\2\2HK\5\20\t\2IJ\7\f\2\2JL\5\22\n\2KI\3\2\2\2KL\3\2\2\2"+
		"L\17\3\2\2\2MN\7 \2\2N\21\3\2\2\2OP\5\30\r\2P\23\3\2\2\2Qc\5\4\3\2Rc\5"+
		"\30\r\2SU\7\r\2\2TV\5\30\r\2UT\3\2\2\2UV\3\2\2\2Vc\3\2\2\2WX\7\16\2\2"+
		"XY\5\26\f\2YZ\5\24\13\2Zc\3\2\2\2[\\\7\17\2\2\\]\5\26\f\2]`\5\24\13\2"+
		"^_\7\20\2\2_a\5\24\13\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2bQ\3\2\2\2bR\3\2"+
		"\2\2bS\3\2\2\2bW\3\2\2\2b[\3\2\2\2c\25\3\2\2\2de\7\t\2\2ef\5\30\r\2fg"+
		"\7\n\2\2g\27\3\2\2\2hi\b\r\1\2ij\7\t\2\2jk\5\30\r\2kl\7\n\2\2lr\3\2\2"+
		"\2mr\7!\2\2nr\5\36\20\2or\7\"\2\2pr\7 \2\2qh\3\2\2\2qm\3\2\2\2qn\3\2\2"+
		"\2qo\3\2\2\2qp\3\2\2\2r\u0083\3\2\2\2st\f\13\2\2tu\t\2\2\2u\u0082\5\30"+
		"\r\fvw\f\n\2\2wx\t\3\2\2x\u0082\5\30\r\13yz\f\t\2\2z{\t\4\2\2{\u0082\5"+
		"\30\r\n|}\f\7\2\2}~\7\t\2\2~\177\5\30\r\2\177\u0080\7\n\2\2\u0080\u0082"+
		"\3\2\2\2\u0081s\3\2\2\2\u0081v\3\2\2\2\u0081y\3\2\2\2\u0081|\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\31\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0086\u0087\t\5\2\2\u0087\33\3\2\2\2\u0088\u0089"+
		"\5\32\16\2\u0089\u008e\7 \2\2\u008a\u008b\7\13\2\2\u008b\u008d\5\34\17"+
		"\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\35\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\t\6\2\2\u0092"+
		"\37\3\2\2\2\16(\60\65EKU`bq\u0081\u0083\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}