// Generated from src/antlr/Expr.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, FUNC_ID=4, MIN=5, MAX=6, POW=7, SQRT=8, MUL=9, 
		DIV=10, ADD=11, SUB=12, ASG=13, VAR_ID=14, NUMS=15, EOL=16, WC=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "FUNC_ID", "MIN", "MAX", "POW", "SQRT", "MUL", 
			"DIV", "ADD", "SUB", "ASG", "VAR_ID", "NUMS", "EOL", "WC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", null, "'min'", "'max'", "'pow'", "'sqrt'", 
			"'*'", "'/'", "'+'", "'-'", "'='", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "FUNC_ID", "MIN", "MAX", "POW", "SQRT", "MUL", 
			"DIV", "ADD", "SUB", "ASG", "VAR_ID", "NUMS", "EOL", "WC"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5\60\n\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17N\n\17\r\17\16\17O\3\20\5\20S\n\20\3"+
		"\20\6\20V\n\20\r\20\16\20W\3\20\3\20\6\20\\\n\20\r\20\16\20]\5\20`\n\20"+
		"\3\21\3\21\3\22\6\22e\n\22\r\22\16\22f\3\22\3\22\2\2\23\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"\3\2\5\4\2C\\c|\3\2\62;\6\2\13\f\17\17\"\"AA\2r\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3"+
		"\2\2\2\7)\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\65\3\2\2\2\179\3\2\2\2\21"+
		"=\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33J\3\2\2\2"+
		"\35M\3\2\2\2\37R\3\2\2\2!a\3\2\2\2#d\3\2\2\2%&\7*\2\2&\4\3\2\2\2\'(\7"+
		".\2\2(\6\3\2\2\2)*\7+\2\2*\b\3\2\2\2+\60\5\13\6\2,\60\5\r\7\2-\60\5\17"+
		"\b\2.\60\5\21\t\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\n\3\2\2\2"+
		"\61\62\7o\2\2\62\63\7k\2\2\63\64\7p\2\2\64\f\3\2\2\2\65\66\7o\2\2\66\67"+
		"\7c\2\2\678\7z\2\28\16\3\2\2\29:\7r\2\2:;\7q\2\2;<\7y\2\2<\20\3\2\2\2"+
		"=>\7u\2\2>?\7s\2\2?@\7t\2\2@A\7v\2\2A\22\3\2\2\2BC\7,\2\2C\24\3\2\2\2"+
		"DE\7\61\2\2E\26\3\2\2\2FG\7-\2\2G\30\3\2\2\2HI\7/\2\2I\32\3\2\2\2JK\7"+
		"?\2\2K\34\3\2\2\2LN\t\2\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\36"+
		"\3\2\2\2QS\7/\2\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\t\3\2\2UT\3\2\2\2VW"+
		"\3\2\2\2WU\3\2\2\2WX\3\2\2\2X_\3\2\2\2Y[\7\60\2\2Z\\\t\3\2\2[Z\3\2\2\2"+
		"\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_Y\3\2\2\2_`\3\2\2\2` \3\2\2"+
		"\2ab\7=\2\2b\"\3\2\2\2ce\t\4\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2gh\3\2\2\2hi\b\22\2\2i$\3\2\2\2\n\2/ORW]_f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}