// Generated from C:/Users/Mary/Documents/edu3/mt/generator/src/main/java\UserGrammar.g4 by ANTLR 4.9.2
package generated;

import entities.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UserGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Integer=8, WS=9, 
		Lower=10, Capitalized=11, Eps=12, Colon=13, Semi=14, Quote=15, Regex=16, 
		Params=17, Code=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "Integer", "WS", 
			"Lower", "Capitalized", "Eps", "Colon", "Semi", "Quote", "Regex", "Params", 
			"Code"
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


	public UserGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UserGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\6\tT\n\t\r\t\16\t"+
		"U\3\n\6\nY\n\n\r\n\16\nZ\3\n\3\n\3\13\3\13\7\13a\n\13\f\13\16\13d\13\13"+
		"\3\f\3\f\7\fh\n\f\f\f\16\fk\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\7\21w\n\21\f\21\16\21z\13\21\3\21\3\21\3\22\3\22\7\22\u0080"+
		"\n\22\f\22\16\22\u0083\13\22\3\22\3\22\3\23\3\23\7\23\u0089\n\23\f\23"+
		"\16\23\u008c\13\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\n\3\2\62;\5\2"+
		"\13\f\17\17\"\"\3\2c|\4\2C\\c|\3\2C\\\3\2$$\3\2__\3\2\177\177\2\u0095"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\3\'\3\2\2\2\5/\3\2\2\2\7\65\3\2\2\2\t?\3\2\2\2\13E\3\2"+
		"\2\2\rM\3\2\2\2\17P\3\2\2\2\21S\3\2\2\2\23X\3\2\2\2\25^\3\2\2\2\27e\3"+
		"\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#}\3\2"+
		"\2\2%\u0086\3\2\2\2\'(\7i\2\2()\7t\2\2)*\7c\2\2*+\7o\2\2+,\7o\2\2,-\7"+
		"c\2\2-.\7t\2\2.\4\3\2\2\2/\60\7u\2\2\60\61\7v\2\2\61\62\7c\2\2\62\63\7"+
		"t\2\2\63\64\7v\2\2\64\6\3\2\2\2\65\66\7v\2\2\66\67\7g\2\2\678\7t\2\28"+
		"9\7o\2\29:\7k\2\2:;\7p\2\2;<\7c\2\2<=\7n\2\2=>\7u\2\2>\b\3\2\2\2?@\7t"+
		"\2\2@A\7w\2\2AB\7n\2\2BC\7g\2\2CD\7u\2\2D\n\3\2\2\2EF\7t\2\2FG\7g\2\2"+
		"GH\7v\2\2HI\7w\2\2IJ\7t\2\2JK\7p\2\2KL\7u\2\2L\f\3\2\2\2MN\7/\2\2NO\7"+
		"@\2\2O\16\3\2\2\2PQ\7~\2\2Q\20\3\2\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2U"+
		"S\3\2\2\2UV\3\2\2\2V\22\3\2\2\2WY\t\3\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\n\2\2]\24\3\2\2\2^b\t\4\2\2_a\t\5\2\2`_\3"+
		"\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\26\3\2\2\2db\3\2\2\2ei\t\6\2\2f"+
		"h\t\5\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\30\3\2\2\2ki\3\2\2"+
		"\2lm\7a\2\2m\32\3\2\2\2no\7<\2\2o\34\3\2\2\2pq\7=\2\2q\36\3\2\2\2rs\7"+
		")\2\2s \3\2\2\2tx\7$\2\2uw\n\7\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2"+
		"\2\2y{\3\2\2\2zx\3\2\2\2{|\7$\2\2|\"\3\2\2\2}\u0081\7]\2\2~\u0080\n\b"+
		"\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7_\2\2\u0085"+
		"$\3\2\2\2\u0086\u008a\7}\2\2\u0087\u0089\n\t\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\177\2\2\u008e&\3\2\2\2\n\2UZbi"+
		"x\u0081\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}