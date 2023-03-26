// Generated from src/main/antlr/Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MIN=4, MAX=5, POW=6, SQRT=7, MUL=8, DIV=9, ADD=10, 
		SUB=11, ASG=12, VAR_ID=13, NUMS=14, EOL=15, WC=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MIN", "MAX", "POW", "SQRT", "MUL", "DIV", "ADD", 
			"SUB", "ASG", "VAR_ID", "NUMS", "EOL", "WC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'min'", "'max'", "'pow'", "'sqrt'", "'*'", 
			"'/'", "'+'", "'-'", "'='", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MIN", "MAX", "POW", "SQRT", "MUL", "DIV", "ADD", 
			"SUB", "ASG", "VAR_ID", "NUMS", "EOL", "WC"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16F\n\16"+
		"\r\16\16\16G\3\17\5\17K\n\17\3\17\6\17N\n\17\r\17\16\17O\3\17\3\17\6\17"+
		"T\n\17\r\17\16\17U\5\17X\n\17\3\20\3\20\3\21\6\21]\n\21\r\21\16\21^\3"+
		"\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22\3\2\5\4\2C\\c|\3\2\62;\6\2\13\f\17\17\"\"AA"+
		"\2g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3"+
		"\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13-\3\2\2\2\r\61\3\2\2\2\17\65"+
		"\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2\27@\3\2\2\2\31B\3\2\2\2\33"+
		"E\3\2\2\2\35J\3\2\2\2\37Y\3\2\2\2!\\\3\2\2\2#$\7*\2\2$\4\3\2\2\2%&\7."+
		"\2\2&\6\3\2\2\2\'(\7+\2\2(\b\3\2\2\2)*\7o\2\2*+\7k\2\2+,\7p\2\2,\n\3\2"+
		"\2\2-.\7o\2\2./\7c\2\2/\60\7z\2\2\60\f\3\2\2\2\61\62\7r\2\2\62\63\7q\2"+
		"\2\63\64\7y\2\2\64\16\3\2\2\2\65\66\7u\2\2\66\67\7s\2\2\678\7t\2\289\7"+
		"v\2\29\20\3\2\2\2:;\7,\2\2;\22\3\2\2\2<=\7\61\2\2=\24\3\2\2\2>?\7-\2\2"+
		"?\26\3\2\2\2@A\7/\2\2A\30\3\2\2\2BC\7?\2\2C\32\3\2\2\2DF\t\2\2\2ED\3\2"+
		"\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\34\3\2\2\2IK\7/\2\2JI\3\2\2\2JK\3"+
		"\2\2\2KM\3\2\2\2LN\t\3\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PW\3"+
		"\2\2\2QS\7\60\2\2RT\t\3\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VX"+
		"\3\2\2\2WQ\3\2\2\2WX\3\2\2\2X\36\3\2\2\2YZ\7=\2\2Z \3\2\2\2[]\t\4\2\2"+
		"\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\21\2\2a\"\3\2"+
		"\2\2\t\2GJOUW^\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}