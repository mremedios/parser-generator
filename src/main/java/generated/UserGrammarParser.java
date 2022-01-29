// Generated from C:/Users/Mary/Documents/edu3/mt/generator/src/main/java\UserGrammar.g4 by ANTLR 4.9.2
package generated;

import entities.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UserGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Integer=8, WS=9, 
		Lower=10, Capitalized=11, Eps=12, Colon=13, Semi=14, Quote=15, Regex=16, 
		Params=17, Code=18;
	public static final int
		RULE_buildGrammar = 0, RULE_grammarName = 1, RULE_grammarStart = 2, RULE_grammarTerminals = 3, 
		RULE_grammarTerminal = 4, RULE_grammarRules = 5, RULE_grammarRule = 6, 
		RULE_ruleArgs = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"buildGrammar", "grammarName", "grammarStart", "grammarTerminals", "grammarTerminal", 
			"grammarRules", "grammarRule", "ruleArgs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "'start'", "'terminals'", "'rules'", "'returns'", 
			"'->'", "'|'", null, null, null, null, "'_'", "':'", "';'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "Integer", "WS", "Lower", 
			"Capitalized", "Eps", "Colon", "Semi", "Quote", "Regex", "Params", "Code"
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
	public String getGrammarFileName() { return "UserGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UserGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BuildGrammarContext extends ParserRuleContext {
		public Grammar grammar;
		public ArrayList<NonTerminal> nonterms;
		public GrammarNameContext grammarName;
		public GrammarStartContext grammarStart;
		public GrammarTerminalsContext grammarTerminals;
		public GrammarRulesContext grammarRules;
		public GrammarNameContext grammarName() {
			return getRuleContext(GrammarNameContext.class,0);
		}
		public GrammarStartContext grammarStart() {
			return getRuleContext(GrammarStartContext.class,0);
		}
		public GrammarTerminalsContext grammarTerminals() {
			return getRuleContext(GrammarTerminalsContext.class,0);
		}
		public GrammarRulesContext grammarRules() {
			return getRuleContext(GrammarRulesContext.class,0);
		}
		public BuildGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).enterBuildGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).exitBuildGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserGrammarVisitor ) return ((UserGrammarVisitor<? extends T>)visitor).visitBuildGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildGrammarContext buildGrammar() throws RecognitionException {
		BuildGrammarContext _localctx = new BuildGrammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_buildGrammar);

		        ((BuildGrammarContext)_localctx).nonterms =  new ArrayList<NonTerminal>();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((BuildGrammarContext)_localctx).grammarName = grammarName();
			setState(17);
			((BuildGrammarContext)_localctx).grammarStart = grammarStart();
			setState(18);
			((BuildGrammarContext)_localctx).grammarTerminals = grammarTerminals();
			setState(19);
			((BuildGrammarContext)_localctx).grammarRules = grammarRules(_localctx.nonterms);
			((BuildGrammarContext)_localctx).grammar =  new Grammar(
			        ((BuildGrammarContext)_localctx).grammarName.name,
			        ((BuildGrammarContext)_localctx).grammarStart.start,
			        ((BuildGrammarContext)_localctx).grammarTerminals.terminals,
			        _localctx.nonterms,
			        ((BuildGrammarContext)_localctx).grammarRules.rules
			    );
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

	public static class GrammarNameContext extends ParserRuleContext {
		public String name;
		public Token Capitalized;
		public TerminalNode Capitalized() { return getToken(UserGrammarParser.Capitalized, 0); }
		public TerminalNode Semi() { return getToken(UserGrammarParser.Semi, 0); }
		public GrammarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).enterGrammarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).exitGrammarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserGrammarVisitor ) return ((UserGrammarVisitor<? extends T>)visitor).visitGrammarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarNameContext grammarName() throws RecognitionException {
		GrammarNameContext _localctx = new GrammarNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			((GrammarNameContext)_localctx).Capitalized = match(Capitalized);
			((GrammarNameContext)_localctx).name =  (((GrammarNameContext)_localctx).Capitalized!=null?((GrammarNameContext)_localctx).Capitalized.getText():null); 
			setState(25);
			match(Semi);
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

	public static class GrammarStartContext extends ParserRuleContext {
		public String start;
		public Token Lower;
		public TerminalNode Colon() { return getToken(UserGrammarParser.Colon, 0); }
		public TerminalNode Lower() { return getToken(UserGrammarParser.Lower, 0); }
		public TerminalNode Semi() { return getToken(UserGrammarParser.Semi, 0); }
		public GrammarStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).enterGrammarStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).exitGrammarStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserGrammarVisitor ) return ((UserGrammarVisitor<? extends T>)visitor).visitGrammarStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarStartContext grammarStart() throws RecognitionException {
		GrammarStartContext _localctx = new GrammarStartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__1);
			setState(28);
			match(Colon);
			setState(29);
			((GrammarStartContext)_localctx).Lower = match(Lower);
			((GrammarStartContext)_localctx).start =  (((GrammarStartContext)_localctx).Lower!=null?((GrammarStartContext)_localctx).Lower.getText():null);
			setState(31);
			match(Semi);
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

	public static class GrammarTerminalsContext extends ParserRuleContext {
		public ArrayList<Terminal> terminals;
		public GrammarTerminalContext grammarTerminal;
		public TerminalNode Colon() { return getToken(UserGrammarParser.Colon, 0); }
		public List<GrammarTerminalContext> grammarTerminal() {
			return getRuleContexts(GrammarTerminalContext.class);
		}
		public GrammarTerminalContext grammarTerminal(int i) {
			return getRuleContext(GrammarTerminalContext.class,i);
		}
		public GrammarTerminalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarTerminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).enterGrammarTerminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).exitGrammarTerminals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserGrammarVisitor ) return ((UserGrammarVisitor<? extends T>)visitor).visitGrammarTerminals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarTerminalsContext grammarTerminals() throws RecognitionException {
		GrammarTerminalsContext _localctx = new GrammarTerminalsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_grammarTerminals);

		        ((GrammarTerminalsContext)_localctx).terminals =  new ArrayList<Terminal>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__2);
			setState(34);
			match(Colon);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Capitalized) {
				{
				{
				setState(35);
				((GrammarTerminalsContext)_localctx).grammarTerminal = grammarTerminal();
				_localctx.terminals.add(((GrammarTerminalsContext)_localctx).grammarTerminal.terminal); 
				}
				}
				setState(42);
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

	public static class GrammarTerminalContext extends ParserRuleContext {
		public Terminal terminal;
		public Token Capitalized;
		public Token Regex;
		public TerminalNode Capitalized() { return getToken(UserGrammarParser.Capitalized, 0); }
		public TerminalNode Colon() { return getToken(UserGrammarParser.Colon, 0); }
		public TerminalNode Regex() { return getToken(UserGrammarParser.Regex, 0); }
		public TerminalNode Semi() { return getToken(UserGrammarParser.Semi, 0); }
		public GrammarTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).enterGrammarTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).exitGrammarTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserGrammarVisitor ) return ((UserGrammarVisitor<? extends T>)visitor).visitGrammarTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarTerminalContext grammarTerminal() throws RecognitionException {
		GrammarTerminalContext _localctx = new GrammarTerminalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_grammarTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((GrammarTerminalContext)_localctx).Capitalized = match(Capitalized);
			setState(44);
			match(Colon);
			setState(45);
			((GrammarTerminalContext)_localctx).Regex = match(Regex);
			((GrammarTerminalContext)_localctx).terminal =  new Terminal((((GrammarTerminalContext)_localctx).Capitalized!=null?((GrammarTerminalContext)_localctx).Capitalized.getText():null), (((GrammarTerminalContext)_localctx).Regex!=null?((GrammarTerminalContext)_localctx).Regex.getText():null));
			setState(47);
			match(Semi);
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

	public static class GrammarRulesContext extends ParserRuleContext {
		public ArrayList<NonTerminal> nonterms;
		public ArrayList<Rule> rules;
		public GrammarRuleContext grammarRule;
		public TerminalNode Colon() { return getToken(UserGrammarParser.Colon, 0); }
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public GrammarRulesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrammarRulesContext(ParserRuleContext parent, int invokingState, ArrayList<NonTerminal> nonterms) {
			super(parent, invokingState);
			this.nonterms = nonterms;
		}
		@Override public int getRuleIndex() { return RULE_grammarRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).enterGrammarRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).exitGrammarRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserGrammarVisitor ) return ((UserGrammarVisitor<? extends T>)visitor).visitGrammarRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRulesContext grammarRules(ArrayList<NonTerminal> nonterms) throws RecognitionException {
		GrammarRulesContext _localctx = new GrammarRulesContext(_ctx, getState(), nonterms);
		enterRule(_localctx, 10, RULE_grammarRules);

		        ((GrammarRulesContext)_localctx).rules =  new ArrayList<Rule>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__3);
			setState(50);
			match(Colon);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Lower) {
				{
				{
				setState(51);
				((GrammarRulesContext)_localctx).grammarRule = grammarRule(nonterms);
				_localctx.rules.addAll(((GrammarRulesContext)_localctx).grammarRule.rules); 
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

	public static class GrammarRuleContext extends ParserRuleContext {
		public ArrayList<NonTerminal> nonterms;
		public ArrayList<Rule> rules;
		public Token l;
		public Token p;
		public Token r;
		public RuleArgsContext ruleArgs;
		public List<RuleArgsContext> ruleArgs() {
			return getRuleContexts(RuleArgsContext.class);
		}
		public RuleArgsContext ruleArgs(int i) {
			return getRuleContext(RuleArgsContext.class,i);
		}
		public TerminalNode Lower() { return getToken(UserGrammarParser.Lower, 0); }
		public List<TerminalNode> Params() { return getTokens(UserGrammarParser.Params); }
		public TerminalNode Params(int i) {
			return getToken(UserGrammarParser.Params, i);
		}
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrammarRuleContext(ParserRuleContext parent, int invokingState, ArrayList<NonTerminal> nonterms) {
			super(parent, invokingState);
			this.nonterms = nonterms;
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).exitGrammarRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserGrammarVisitor ) return ((UserGrammarVisitor<? extends T>)visitor).visitGrammarRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRuleContext grammarRule(ArrayList<NonTerminal> nonterms) throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState(), nonterms);
		enterRule(_localctx, 12, RULE_grammarRule);

		        ((GrammarRuleContext)_localctx).rules =  new ArrayList<Rule>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((GrammarRuleContext)_localctx).l = match(Lower);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Params) {
				{
				setState(60);
				((GrammarRuleContext)_localctx).p = match(Params);
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(63);
				match(T__4);
				setState(64);
				((GrammarRuleContext)_localctx).r = match(Params);
				}
			}

			_localctx.nonterms.add(new NonTerminal((((GrammarRuleContext)_localctx).l!=null?((GrammarRuleContext)_localctx).l.getText():null), (((GrammarRuleContext)_localctx).p!=null?((GrammarRuleContext)_localctx).p.getText():null), (((GrammarRuleContext)_localctx).r!=null?((GrammarRuleContext)_localctx).r.getText():null))); 
			setState(68);
			match(T__5);
			setState(69);
			((GrammarRuleContext)_localctx).ruleArgs = ruleArgs();
			_localctx.rules.add(new Rule((((GrammarRuleContext)_localctx).l!=null?((GrammarRuleContext)_localctx).l.getText():null), ((GrammarRuleContext)_localctx).ruleArgs.right)); 
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(71);
				match(T__6);
				setState(72);
				((GrammarRuleContext)_localctx).ruleArgs = ruleArgs();
				_localctx.rules.add(new Rule((((GrammarRuleContext)_localctx).l!=null?((GrammarRuleContext)_localctx).l.getText():null), ((GrammarRuleContext)_localctx).ruleArgs.right)); 
				}
				}
				setState(79);
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

	public static class RuleArgsContext extends ParserRuleContext {
		public ArrayList<Argument> right;
		public Token Lower;
		public Token Params;
		public Token Capitalized;
		public Token Eps;
		public Token Code;
		public List<TerminalNode> Lower() { return getTokens(UserGrammarParser.Lower); }
		public TerminalNode Lower(int i) {
			return getToken(UserGrammarParser.Lower, i);
		}
		public List<TerminalNode> Capitalized() { return getTokens(UserGrammarParser.Capitalized); }
		public TerminalNode Capitalized(int i) {
			return getToken(UserGrammarParser.Capitalized, i);
		}
		public List<TerminalNode> Eps() { return getTokens(UserGrammarParser.Eps); }
		public TerminalNode Eps(int i) {
			return getToken(UserGrammarParser.Eps, i);
		}
		public List<TerminalNode> Code() { return getTokens(UserGrammarParser.Code); }
		public TerminalNode Code(int i) {
			return getToken(UserGrammarParser.Code, i);
		}
		public List<TerminalNode> Params() { return getTokens(UserGrammarParser.Params); }
		public TerminalNode Params(int i) {
			return getToken(UserGrammarParser.Params, i);
		}
		public RuleArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).enterRuleArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserGrammarListener ) ((UserGrammarListener)listener).exitRuleArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserGrammarVisitor ) return ((UserGrammarVisitor<? extends T>)visitor).visitRuleArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleArgsContext ruleArgs() throws RecognitionException {
		RuleArgsContext _localctx = new RuleArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ruleArgs);

		        ((RuleArgsContext)_localctx).right =  new ArrayList<Argument>();
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(91);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Lower:
						{
						setState(80);
						((RuleArgsContext)_localctx).Lower = match(Lower);
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Params) {
							{
							setState(81);
							((RuleArgsContext)_localctx).Params = match(Params);
							}
						}

						_localctx.right.add(new Argument((((RuleArgsContext)_localctx).Lower!=null?((RuleArgsContext)_localctx).Lower.getText():null), (((RuleArgsContext)_localctx).Params!=null?((RuleArgsContext)_localctx).Params.getText():null)));
						}
						break;
					case Capitalized:
						{
						setState(85);
						((RuleArgsContext)_localctx).Capitalized = match(Capitalized);
						_localctx.right.add(new Argument((((RuleArgsContext)_localctx).Capitalized!=null?((RuleArgsContext)_localctx).Capitalized.getText():null)));
						}
						break;
					case Eps:
						{
						setState(87);
						((RuleArgsContext)_localctx).Eps = match(Eps);
						_localctx.right.add(new Argument((((RuleArgsContext)_localctx).Eps!=null?((RuleArgsContext)_localctx).Eps.getText():null)));
						}
						break;
					case Code:
						{
						setState(89);
						((RuleArgsContext)_localctx).Code = match(Code);
						_localctx.right.add(new Argument((((RuleArgsContext)_localctx).Code!=null?((RuleArgsContext)_localctx).Code.getText():null)));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24b\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7"+
		"\5)\n\5\f\5\16\5,\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7"+
		"9\n\7\f\7\16\7<\13\7\3\b\3\b\5\b@\n\b\3\b\3\b\5\bD\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\t\3\t\5\tU\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\6\t^\n\t\r\t\16\t_\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2"+
		"c\2\22\3\2\2\2\4\30\3\2\2\2\6\35\3\2\2\2\b#\3\2\2\2\n-\3\2\2\2\f\63\3"+
		"\2\2\2\16=\3\2\2\2\20]\3\2\2\2\22\23\5\4\3\2\23\24\5\6\4\2\24\25\5\b\5"+
		"\2\25\26\5\f\7\2\26\27\b\2\1\2\27\3\3\2\2\2\30\31\7\3\2\2\31\32\7\r\2"+
		"\2\32\33\b\3\1\2\33\34\7\20\2\2\34\5\3\2\2\2\35\36\7\4\2\2\36\37\7\17"+
		"\2\2\37 \7\f\2\2 !\b\4\1\2!\"\7\20\2\2\"\7\3\2\2\2#$\7\5\2\2$*\7\17\2"+
		"\2%&\5\n\6\2&\'\b\5\1\2\')\3\2\2\2(%\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2"+
		"\2\2+\t\3\2\2\2,*\3\2\2\2-.\7\r\2\2./\7\17\2\2/\60\7\22\2\2\60\61\b\6"+
		"\1\2\61\62\7\20\2\2\62\13\3\2\2\2\63\64\7\6\2\2\64:\7\17\2\2\65\66\5\16"+
		"\b\2\66\67\b\7\1\2\679\3\2\2\28\65\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2"+
		"\2;\r\3\2\2\2<:\3\2\2\2=?\7\f\2\2>@\7\23\2\2?>\3\2\2\2?@\3\2\2\2@C\3\2"+
		"\2\2AB\7\7\2\2BD\7\23\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\b\1\2FG\7"+
		"\b\2\2GH\5\20\t\2HO\b\b\1\2IJ\7\t\2\2JK\5\20\t\2KL\b\b\1\2LN\3\2\2\2M"+
		"I\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\17\3\2\2\2QO\3\2\2\2RT\7\f\2"+
		"\2SU\7\23\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2V^\b\t\1\2WX\7\r\2\2X^\b\t"+
		"\1\2YZ\7\16\2\2Z^\b\t\1\2[\\\7\24\2\2\\^\b\t\1\2]R\3\2\2\2]W\3\2\2\2]"+
		"Y\3\2\2\2][\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\21\3\2\2\2\n*:?COT"+
		"]_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}