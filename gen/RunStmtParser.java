// Generated from C:/Users/VIKRAMBHOSLE/IdeaProjects/skynet/src/main/antlr4\RunStmt.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RunStmtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ABEND=18, END=19, LENGTH=20, QKUPCASE=21, SYSEVALF=22, ABORT=23, EVAL=24, 
		LET=25, QSCAN=26, SYSEXEC=27, ACT=28, FILE=29, LIST=30, QSUBSTR=31, SYSFUNC=32, 
		ACTIVATE=33, GLOBAL=34, LISTM=35, QSYSFUNC=36, SYSGET=37, BQUOTE=38, GO=39, 
		LOCAL=40, QUOTE=41, SYSRPUT=42, BY=43, GOTO=44, MACRO=45, CONTINUE=46, 
		LEAVE=47, QUPCASE=48, THEN=49, CLEAR=50, IF=51, MEND=52, RESOLVE=53, TO=54, 
		CLOSE=55, INC=56, PAUSE=57, RETURN=58, TSO=59, CMS=60, INCLUDE=61, NRSTR=62, 
		RUN=63, UNQUOTE=64, COMANDR=65, INDEX=66, ON=67, SAVE=68, UNSTR=69, COPY=70, 
		INFILE=71, OPEN=72, SCAN=73, UNTIL=74, DEACT=75, INPUT=76, PUT=77, DELIMITER=78, 
		DELIM=79, FIRSTOBS=80, OBS=81, STOP=82, UPCASE=83, DEL=84, KCMPRES=85, 
		NRBQUOTE=86, STR=87, WHILE=88, DELETE=89, KINDEX=90, NRQUOTE=91, SYSCALL=92, 
		WINDOW=93, DISPLAY=94, KLEFT=95, METASYM=96, SUBSTR=97, DMIDSPLY=98, KLENGTH=99, 
		QKCMPRES=100, SUPERQ=101, DMISPLIT=102, KSCAN=103, QKLEFT=104, SYMDEL=105, 
		DO=106, KSUBSTR=107, QKSCAN=108, SYMEXIST=109, EDIT=110, KTRIM=111, QKSUBSTR=112, 
		SYMGLOBL=113, ELSE=114, KUPCASE=115, QKTRIM=116, SYMLOCAL=117, Tk_NULL=118, 
		CANCEL=119, NOLIST=120, ARRAY=121, ARRAY_NUMERIC_ELEMENTS=122, ARRAY_CHARACTER_ELEMENTS=123, 
		ARRAY_ALL_ELEMENTS=124, GROUPFORMAT=125, NOTSORTED=126, DESCENDING=127, 
		CALL=128, DEBUG=129, NESTING=130, STACK=131, READ=132, PW=133, SOURCE=134, 
		VIEW=135, PGM=136, ENCRYPT=137, NOSAVE=138, DATALINES=139, CARDS=140, 
		LINES=141, DATALINES4=142, CARDS4=143, LINES4=144, END_DATALINES4=145, 
		ALTER=146, DISK=147, DUMMY=148, GTERM=149, PIPE=150, PLOTTER=151, PRINTER=152, 
		TAPE=153, TEMP=154, TERMINAL=155, UPRINTER=156, DSD=157, EXPANDTABS=158, 
		NOEXPANDTABS=159, FLOWOVER=160, MISSOVER=161, PAD=162, NOPAD=163, SCANOVER=164, 
		SHAREBUFFERS=165, STOPOVER=166, TRUNCOVER=167, V_INFILE_=168, INPUT_ODS=169, 
		DATE=170, DATETIME=171, DDMMYY=172, INFORMAT_COMMA=173, INFORMAT_CHAR=174, 
		DROP=175, PROC=176, ANOVA=177, MEANS=178, REG=179, CORR=180, SGPLOT=181, 
		PRINT=182, DATA=183, Informat=184, DOLLAR=185, EQ=186, NE=187, GT=188, 
		LT=189, GE=190, LE=191, IN=192, EQC=193, NEC=194, GTC=195, LTC=196, GEC=197, 
		LEC=198, INColon=199, AND=200, OR=201, NOT=202, MIN=203, MAX=204, DateLiteral=205, 
		TimeLiteral=206, DateTimeLiteral=207, BitLiteral=208, NameLiteral=209, 
		HexLiteral=210, STRINGLITERAL=211, INT=212, FloatingPointLiteral=213, 
		Identifier=214, DOT=215, AT=216, EQUAL=217, COMMA=218, LBracket=219, RBracket=220, 
		WS=221, COMMENT=222, LINE_COMMENT=223;
	public static final int
		RULE_run_main = 0, RULE_run_stmt = 1, RULE_expression = 2, RULE_expressionList = 3, 
		RULE_of_var_list = 4, RULE_identifiers_list = 5, RULE_in_var_list = 6, 
		RULE_colonInts = 7, RULE_literal = 8, RULE_variables = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"run_main", "run_stmt", "expression", "expressionList", "of_var_list", 
			"identifiers_list", "in_var_list", "colonInts", "literal", "variables"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'**'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'||'", "'!!'", "'of'", "':'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "';;;;'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'$'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'><'", "'<>'", null, null, null, null, null, 
			null, null, null, null, null, "'.'", "'@'", "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ABEND", "END", "LENGTH", "QKUPCASE", 
			"SYSEVALF", "ABORT", "EVAL", "LET", "QSCAN", "SYSEXEC", "ACT", "FILE", 
			"LIST", "QSUBSTR", "SYSFUNC", "ACTIVATE", "GLOBAL", "LISTM", "QSYSFUNC", 
			"SYSGET", "BQUOTE", "GO", "LOCAL", "QUOTE", "SYSRPUT", "BY", "GOTO", 
			"MACRO", "CONTINUE", "LEAVE", "QUPCASE", "THEN", "CLEAR", "IF", "MEND", 
			"RESOLVE", "TO", "CLOSE", "INC", "PAUSE", "RETURN", "TSO", "CMS", "INCLUDE", 
			"NRSTR", "RUN", "UNQUOTE", "COMANDR", "INDEX", "ON", "SAVE", "UNSTR", 
			"COPY", "INFILE", "OPEN", "SCAN", "UNTIL", "DEACT", "INPUT", "PUT", "DELIMITER", 
			"DELIM", "FIRSTOBS", "OBS", "STOP", "UPCASE", "DEL", "KCMPRES", "NRBQUOTE", 
			"STR", "WHILE", "DELETE", "KINDEX", "NRQUOTE", "SYSCALL", "WINDOW", "DISPLAY", 
			"KLEFT", "METASYM", "SUBSTR", "DMIDSPLY", "KLENGTH", "QKCMPRES", "SUPERQ", 
			"DMISPLIT", "KSCAN", "QKLEFT", "SYMDEL", "DO", "KSUBSTR", "QKSCAN", "SYMEXIST", 
			"EDIT", "KTRIM", "QKSUBSTR", "SYMGLOBL", "ELSE", "KUPCASE", "QKTRIM", 
			"SYMLOCAL", "Tk_NULL", "CANCEL", "NOLIST", "ARRAY", "ARRAY_NUMERIC_ELEMENTS", 
			"ARRAY_CHARACTER_ELEMENTS", "ARRAY_ALL_ELEMENTS", "GROUPFORMAT", "NOTSORTED", 
			"DESCENDING", "CALL", "DEBUG", "NESTING", "STACK", "READ", "PW", "SOURCE", 
			"VIEW", "PGM", "ENCRYPT", "NOSAVE", "DATALINES", "CARDS", "LINES", "DATALINES4", 
			"CARDS4", "LINES4", "END_DATALINES4", "ALTER", "DISK", "DUMMY", "GTERM", 
			"PIPE", "PLOTTER", "PRINTER", "TAPE", "TEMP", "TERMINAL", "UPRINTER", 
			"DSD", "EXPANDTABS", "NOEXPANDTABS", "FLOWOVER", "MISSOVER", "PAD", "NOPAD", 
			"SCANOVER", "SHAREBUFFERS", "STOPOVER", "TRUNCOVER", "V_INFILE_", "INPUT_ODS", 
			"DATE", "DATETIME", "DDMMYY", "INFORMAT_COMMA", "INFORMAT_CHAR", "DROP", 
			"PROC", "ANOVA", "MEANS", "REG", "CORR", "SGPLOT", "PRINT", "DATA", "Informat", 
			"DOLLAR", "EQ", "NE", "GT", "LT", "GE", "LE", "IN", "EQC", "NEC", "GTC", 
			"LTC", "GEC", "LEC", "INColon", "AND", "OR", "NOT", "MIN", "MAX", "DateLiteral", 
			"TimeLiteral", "DateTimeLiteral", "BitLiteral", "NameLiteral", "HexLiteral", 
			"STRINGLITERAL", "INT", "FloatingPointLiteral", "Identifier", "DOT", 
			"AT", "EQUAL", "COMMA", "LBracket", "RBracket", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "RunStmt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RunStmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Run_mainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RunStmtParser.EOF, 0); }
		public List<Run_stmtContext> run_stmt() {
			return getRuleContexts(Run_stmtContext.class);
		}
		public Run_stmtContext run_stmt(int i) {
			return getRuleContext(Run_stmtContext.class,i);
		}
		public Run_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).enterRun_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).exitRun_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RunStmtVisitor ) return ((RunStmtVisitor<? extends T>)visitor).visitRun_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Run_mainContext run_main() throws RecognitionException {
		Run_mainContext _localctx = new Run_mainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_run_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RUN) {
				{
				{
				setState(20);
				run_stmt();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(EOF);
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

	public static class Run_stmtContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(RunStmtParser.RUN, 0); }
		public TerminalNode CANCEL() { return getToken(RunStmtParser.CANCEL, 0); }
		public Run_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).enterRun_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).exitRun_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RunStmtVisitor ) return ((RunStmtVisitor<? extends T>)visitor).visitRun_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Run_stmtContext run_stmt() throws RecognitionException {
		Run_stmtContext _localctx = new Run_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_run_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(RUN);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CANCEL) {
				{
				setState(29);
				match(CANCEL);
				}
			}

			setState(32);
			match(T__0);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(RunStmtParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(RunStmtParser.NOT, 0); }
		public TerminalNode MIN() { return getToken(RunStmtParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(RunStmtParser.MAX, 0); }
		public TerminalNode EQ() { return getToken(RunStmtParser.EQ, 0); }
		public TerminalNode NE() { return getToken(RunStmtParser.NE, 0); }
		public TerminalNode GT() { return getToken(RunStmtParser.GT, 0); }
		public TerminalNode LT() { return getToken(RunStmtParser.LT, 0); }
		public TerminalNode GE() { return getToken(RunStmtParser.GE, 0); }
		public TerminalNode LE() { return getToken(RunStmtParser.LE, 0); }
		public TerminalNode EQC() { return getToken(RunStmtParser.EQC, 0); }
		public TerminalNode NEC() { return getToken(RunStmtParser.NEC, 0); }
		public TerminalNode GTC() { return getToken(RunStmtParser.GTC, 0); }
		public TerminalNode LTC() { return getToken(RunStmtParser.LTC, 0); }
		public TerminalNode GEC() { return getToken(RunStmtParser.GEC, 0); }
		public TerminalNode LEC() { return getToken(RunStmtParser.LEC, 0); }
		public TerminalNode AND() { return getToken(RunStmtParser.AND, 0); }
		public TerminalNode OR() { return getToken(RunStmtParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(RunStmtParser.EQUAL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public In_var_listContext in_var_list() {
			return getRuleContext(In_var_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(RunStmtParser.IN, 0); }
		public TerminalNode INColon() { return getToken(RunStmtParser.INColon, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RunStmtVisitor ) return ((RunStmtVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DateLiteral:
			case TimeLiteral:
			case DateTimeLiteral:
			case BitLiteral:
			case NameLiteral:
			case HexLiteral:
			case STRINGLITERAL:
			case INT:
			case FloatingPointLiteral:
			case DOT:
				{
				setState(35);
				literal();
				}
				break;
			case Identifier:
				{
				setState(36);
				match(Identifier);
				}
				break;
			case T__1:
				{
				setState(37);
				match(T__1);
				setState(38);
				expression(0);
				setState(39);
				match(T__2);
				}
				break;
			case T__8:
			case T__9:
				{
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
				expression(12);
				}
				break;
			case NOT:
				{
				setState(43);
				match(NOT);
				setState(44);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(47);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(48);
						match(T__7);
						setState(49);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(50);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(51);
						match(MIN);
						setState(52);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(54);
						match(MAX);
						setState(55);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(57);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(60);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(63);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(66);
						_la = _input.LA(1);
						if ( !(((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (EQ - 186)) | (1L << (NE - 186)) | (1L << (GT - 186)) | (1L << (LT - 186)) | (1L << (GE - 186)) | (1L << (LE - 186)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(69);
						_la = _input.LA(1);
						if ( !(((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (EQC - 193)) | (1L << (NEC - 193)) | (1L << (GTC - 193)) | (1L << (LTC - 193)) | (1L << (GEC - 193)) | (1L << (LEC - 193)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(75);
						match(EQUAL);
						setState(76);
						expression(1);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(78);
						match(T__1);
						setState(80);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__15))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (NOT - 202)) | (1L << (DateLiteral - 202)) | (1L << (TimeLiteral - 202)) | (1L << (DateTimeLiteral - 202)) | (1L << (BitLiteral - 202)) | (1L << (NameLiteral - 202)) | (1L << (HexLiteral - 202)) | (1L << (STRINGLITERAL - 202)) | (1L << (INT - 202)) | (1L << (FloatingPointLiteral - 202)) | (1L << (Identifier - 202)) | (1L << (DOT - 202)))) != 0)) {
							{
							setState(79);
							expressionList(0);
							}
						}

						setState(82);
						match(T__2);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(84);
						match(T__3);
						setState(85);
						expression(0);
						setState(86);
						match(T__4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(89);
						match(T__5);
						setState(90);
						expression(0);
						setState(91);
						match(T__6);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==INColon) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						in_var_list();
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Of_var_listContext> of_var_list() {
			return getRuleContexts(Of_var_listContext.class);
		}
		public Of_var_listContext of_var_list(int i) {
			return getRuleContext(Of_var_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RunStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RunStmtParser.COMMA, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RunStmtVisitor ) return ((RunStmtVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		return expressionList(0);
	}

	private ExpressionListContext expressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, _parentState);
		ExpressionListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressionList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__8:
			case T__9:
			case NOT:
			case DateLiteral:
			case TimeLiteral:
			case DateTimeLiteral:
			case BitLiteral:
			case NameLiteral:
			case HexLiteral:
			case STRINGLITERAL:
			case INT:
			case FloatingPointLiteral:
			case Identifier:
			case DOT:
				{
				setState(102);
				expression(0);
				}
				break;
			case T__15:
				{
				setState(103);
				of_var_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					match(COMMA);
					setState(109);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__8:
					case T__9:
					case NOT:
					case DateLiteral:
					case TimeLiteral:
					case DateTimeLiteral:
					case BitLiteral:
					case NameLiteral:
					case HexLiteral:
					case STRINGLITERAL:
					case INT:
					case FloatingPointLiteral:
					case Identifier:
					case DOT:
						{
						setState(107);
						expression(0);
						}
						break;
					case T__15:
						{
						setState(108);
						of_var_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(116);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(117);
						match(COMMA);
						}
						}
						setState(120); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(122);
					expressionList(2);
					}
					} 
				}
				setState(127);
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

	public static class Of_var_listContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(RunStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RunStmtParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RunStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RunStmtParser.COMMA, i);
		}
		public Of_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_of_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).enterOf_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).exitOf_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RunStmtVisitor ) return ((RunStmtVisitor<? extends T>)visitor).visitOf_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Of_var_listContext of_var_list() throws RecognitionException {
		Of_var_listContext _localctx = new Of_var_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_of_var_list);
		int _la;
		try {
			int _alt;
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__15);
				{
				setState(129);
				match(Identifier);
				setState(130);
				match(T__9);
				setState(131);
				match(Identifier);
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(133);
							match(COMMA);
							setState(134);
							match(T__15);
							}
						}

						{
						setState(137);
						match(Identifier);
						setState(138);
						match(T__9);
						setState(139);
						match(Identifier);
						}
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__15);
				setState(146);
				match(Identifier);
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(147);
						match(Identifier);
						}
						} 
					}
					setState(152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__15);
				setState(154);
				match(Identifier);
				setState(155);
				match(T__5);
				setState(156);
				match(T__10);
				setState(157);
				match(T__6);
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

	public static class Identifiers_listContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(RunStmtParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RunStmtParser.Identifier, i);
		}
		public Identifiers_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).enterIdentifiers_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).exitIdentifiers_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RunStmtVisitor ) return ((RunStmtVisitor<? extends T>)visitor).visitIdentifiers_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifiers_listContext identifiers_list() throws RecognitionException {
		Identifiers_listContext _localctx = new Identifiers_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifiers_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(160);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(161);
					match(Identifier);
					setState(162);
					match(T__9);
					setState(163);
					match(Identifier);
					}
					break;
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
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

	public static class In_var_listContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RunStmtParser.Identifier, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<ColonIntsContext> colonInts() {
			return getRuleContexts(ColonIntsContext.class);
		}
		public ColonIntsContext colonInts(int i) {
			return getRuleContext(ColonIntsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RunStmtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RunStmtParser.COMMA, i);
		}
		public In_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).enterIn_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).exitIn_var_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RunStmtVisitor ) return ((RunStmtVisitor<? extends T>)visitor).visitIn_var_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_var_listContext in_var_list() throws RecognitionException {
		In_var_listContext _localctx = new In_var_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_in_var_list);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(Identifier);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__1);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(170);
					literal();
					}
					break;
				case 2:
					{
					setState(171);
					colonInts();
					}
					break;
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(174);
					match(COMMA);
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(175);
						literal();
						}
						break;
					case 2:
						{
						setState(176);
						colonInts();
						}
						break;
					}
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(T__2);
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

	public static class ColonIntsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(RunStmtParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(RunStmtParser.INT, i);
		}
		public ColonIntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonInts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).enterColonInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).exitColonInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RunStmtVisitor ) return ((RunStmtVisitor<? extends T>)visitor).visitColonInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonIntsContext colonInts() throws RecognitionException {
		ColonIntsContext _localctx = new ColonIntsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_colonInts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(INT);
			setState(189);
			match(T__16);
			setState(190);
			match(INT);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RunStmtParser.INT, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(RunStmtParser.FloatingPointLiteral, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(RunStmtParser.STRINGLITERAL, 0); }
		public TerminalNode DateLiteral() { return getToken(RunStmtParser.DateLiteral, 0); }
		public TerminalNode TimeLiteral() { return getToken(RunStmtParser.TimeLiteral, 0); }
		public TerminalNode DateTimeLiteral() { return getToken(RunStmtParser.DateTimeLiteral, 0); }
		public TerminalNode BitLiteral() { return getToken(RunStmtParser.BitLiteral, 0); }
		public TerminalNode NameLiteral() { return getToken(RunStmtParser.NameLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(RunStmtParser.HexLiteral, 0); }
		public TerminalNode DOT() { return getToken(RunStmtParser.DOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RunStmtVisitor ) return ((RunStmtVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DateLiteral - 205)) | (1L << (TimeLiteral - 205)) | (1L << (DateTimeLiteral - 205)) | (1L << (BitLiteral - 205)) | (1L << (NameLiteral - 205)) | (1L << (HexLiteral - 205)) | (1L << (STRINGLITERAL - 205)) | (1L << (INT - 205)) | (1L << (FloatingPointLiteral - 205)) | (1L << (DOT - 205)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RunStmtParser.Identifier, 0); }
		public TerminalNode DATE() { return getToken(RunStmtParser.DATE, 0); }
		public TerminalNode ALTER() { return getToken(RunStmtParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(RunStmtParser.DROP, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode DOT() { return getToken(RunStmtParser.DOT, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RunStmtListener ) ((RunStmtListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RunStmtVisitor ) return ((RunStmtVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		return variables(0);
	}

	private VariablesContext variables(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariablesContext _localctx = new VariablesContext(_ctx, _parentState);
		VariablesContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(195);
				match(Identifier);
				}
				break;
			case DATE:
				{
				setState(196);
				match(DATE);
				}
				break;
			case ALTER:
				{
				setState(197);
				match(ALTER);
				}
				break;
			case DROP:
				{
				setState(198);
				match(DROP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariablesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variables);
					setState(201);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(202);
					match(DOT);
					setState(203);
					variables(6);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 3:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 9:
			return variables_sempred((VariablesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expressionList_sempred(ExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean variables_sempred(VariablesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e1\u00d4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\5\3!\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4S\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4c\n\4\f\4\16\4f\13\4\3"+
		"\5\3\5\3\5\5\5k\n\5\3\5\3\5\3\5\5\5p\n\5\7\5r\n\5\f\5\16\5u\13\5\3\5\3"+
		"\5\6\5y\n\5\r\5\16\5z\3\5\7\5~\n\5\f\5\16\5\u0081\13\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u008a\n\6\3\6\3\6\3\6\7\6\u008f\n\6\f\6\16\6\u0092\13"+
		"\6\3\6\3\6\3\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00a1\n\6\3\7\3\7\3\7\3\7\6\7\u00a7\n\7\r\7\16\7\u00a8\3\b\3\b\3\b"+
		"\3\b\5\b\u00af\n\b\3\b\3\b\3\b\5\b\u00b4\n\b\7\b\u00b6\n\b\f\b\16\b\u00b9"+
		"\13\b\3\b\3\b\5\b\u00bd\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00ca\n\13\3\13\3\13\3\13\7\13\u00cf\n\13\f\13\16\13\u00d2"+
		"\13\13\3\13\2\5\6\b\24\f\2\4\6\b\n\f\16\20\22\24\2\n\3\2\13\f\3\2\r\17"+
		"\3\2\20\21\3\2\u00bc\u00c1\3\2\u00c3\u00c8\3\2\u00ca\u00cb\4\2\u00c2\u00c2"+
		"\u00c9\u00c9\4\2\u00cf\u00d7\u00d9\u00d9\2\u00f2\2\31\3\2\2\2\4\36\3\2"+
		"\2\2\6/\3\2\2\2\bg\3\2\2\2\n\u00a0\3\2\2\2\f\u00a6\3\2\2\2\16\u00bc\3"+
		"\2\2\2\20\u00be\3\2\2\2\22\u00c2\3\2\2\2\24\u00c9\3\2\2\2\26\30\5\4\3"+
		"\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2"+
		"\2\33\31\3\2\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36 \7A\2\2\37!\7y\2\2 \37"+
		"\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\3\2\2#\5\3\2\2\2$%\b\4\1\2%\60\5\22"+
		"\n\2&\60\7\u00d8\2\2\'(\7\4\2\2()\5\6\4\2)*\7\5\2\2*\60\3\2\2\2+,\t\2"+
		"\2\2,\60\5\6\4\16-.\7\u00cc\2\2.\60\5\6\4\r/$\3\2\2\2/&\3\2\2\2/\'\3\2"+
		"\2\2/+\3\2\2\2/-\3\2\2\2\60d\3\2\2\2\61\62\f\17\2\2\62\63\7\n\2\2\63c"+
		"\5\6\4\17\64\65\f\f\2\2\65\66\7\u00cd\2\2\66c\5\6\4\r\678\f\13\2\289\7"+
		"\u00ce\2\29c\5\6\4\f:;\f\n\2\2;<\t\3\2\2<c\5\6\4\13=>\f\t\2\2>?\t\2\2"+
		"\2?c\5\6\4\n@A\f\b\2\2AB\t\4\2\2Bc\5\6\4\tCD\f\7\2\2DE\t\5\2\2Ec\5\6\4"+
		"\bFG\f\6\2\2GH\t\6\2\2Hc\5\6\4\7IJ\f\4\2\2JK\t\7\2\2Kc\5\6\4\5LM\f\3\2"+
		"\2MN\7\u00db\2\2Nc\5\6\4\3OP\f\22\2\2PR\7\4\2\2QS\5\b\5\2RQ\3\2\2\2RS"+
		"\3\2\2\2ST\3\2\2\2Tc\7\5\2\2UV\f\21\2\2VW\7\6\2\2WX\5\6\4\2XY\7\7\2\2"+
		"Yc\3\2\2\2Z[\f\20\2\2[\\\7\b\2\2\\]\5\6\4\2]^\7\t\2\2^c\3\2\2\2_`\f\5"+
		"\2\2`a\t\b\2\2ac\5\16\b\2b\61\3\2\2\2b\64\3\2\2\2b\67\3\2\2\2b:\3\2\2"+
		"\2b=\3\2\2\2b@\3\2\2\2bC\3\2\2\2bF\3\2\2\2bI\3\2\2\2bL\3\2\2\2bO\3\2\2"+
		"\2bU\3\2\2\2bZ\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\7\3\2"+
		"\2\2fd\3\2\2\2gj\b\5\1\2hk\5\6\4\2ik\5\n\6\2jh\3\2\2\2ji\3\2\2\2ks\3\2"+
		"\2\2lo\7\u00dc\2\2mp\5\6\4\2np\5\n\6\2om\3\2\2\2on\3\2\2\2pr\3\2\2\2q"+
		"l\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\177\3\2\2\2us\3\2\2\2vx\f\3\2"+
		"\2wy\7\u00dc\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\5"+
		"\b\5\4}v\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\t"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\22\2\2\u0083\u0084\7\u00d8\2"+
		"\2\u0084\u0085\7\f\2\2\u0085\u0086\7\u00d8\2\2\u0086\u0090\3\2\2\2\u0087"+
		"\u0088\7\u00dc\2\2\u0088\u008a\7\22\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\u00d8\2\2\u008c\u008d\7\f\2"+
		"\2\u008d\u008f\7\u00d8\2\2\u008e\u0089\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u00a1\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0094\7\22\2\2\u0094\u0098\7\u00d8\2\2\u0095\u0097\7\u00d8"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u00a1\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\22"+
		"\2\2\u009c\u009d\7\u00d8\2\2\u009d\u009e\7\b\2\2\u009e\u009f\7\r\2\2\u009f"+
		"\u00a1\7\t\2\2\u00a0\u0082\3\2\2\2\u00a0\u0093\3\2\2\2\u00a0\u009b\3\2"+
		"\2\2\u00a1\13\3\2\2\2\u00a2\u00a7\7\u00d8\2\2\u00a3\u00a4\7\u00d8\2\2"+
		"\u00a4\u00a5\7\f\2\2\u00a5\u00a7\7\u00d8\2\2\u00a6\u00a2\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\r\3\2\2\2\u00aa\u00bd\7\u00d8\2\2\u00ab\u00ae\7\4\2\2\u00ac"+
		"\u00af\5\22\n\2\u00ad\u00af\5\20\t\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3"+
		"\2\2\2\u00af\u00b7\3\2\2\2\u00b0\u00b3\7\u00dc\2\2\u00b1\u00b4\5\22\n"+
		"\2\u00b2\u00b4\5\20\t\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\5\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00aa\3\2\2\2\u00bc\u00ab\3\2"+
		"\2\2\u00bd\17\3\2\2\2\u00be\u00bf\7\u00d6\2\2\u00bf\u00c0\7\23\2\2\u00c0"+
		"\u00c1\7\u00d6\2\2\u00c1\21\3\2\2\2\u00c2\u00c3\t\t\2\2\u00c3\23\3\2\2"+
		"\2\u00c4\u00c5\b\13\1\2\u00c5\u00ca\7\u00d8\2\2\u00c6\u00ca\7\u00ac\2"+
		"\2\u00c7\u00ca\7\u0094\2\2\u00c8\u00ca\7\u00b1\2\2\u00c9\u00c4\3\2\2\2"+
		"\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00d0"+
		"\3\2\2\2\u00cb\u00cc\f\7\2\2\u00cc\u00cd\7\u00d9\2\2\u00cd\u00cf\5\24"+
		"\13\b\u00ce\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\25\3\2\2\2\u00d2\u00d0\3\2\2\2\31\31 /Rbdjosz\177"+
		"\u0089\u0090\u0098\u00a0\u00a6\u00a8\u00ae\u00b3\u00b7\u00bc\u00c9\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}