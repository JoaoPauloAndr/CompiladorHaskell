// Generated from HaskellParser.g4 by ANTLR 4.9.2

    package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, TAB=2, WS=3, AS=4, CASE=5, CLASS=6, DATA=7, DEFAULT=8, DERIVING=9, 
		DO=10, ELSE=11, HIDING=12, IF=13, IMPORT=14, IN=15, INFIX=16, INFIXL=17, 
		INFIXR=18, INSTANCE=19, LET=20, MODULE=21, NEWTYPE=22, OF=23, QUALIFIED=24, 
		THEN=25, TYPE=26, WHERE=27, WILDCARD=28, FORALL=29, FOREIGN=30, EXPORT=31, 
		SAFE=32, INTERRUPTIBLE=33, UNSAFE=34, MDO=35, FAMILY=36, ROLE=37, STDCALL=38, 
		CCALL=39, CAPI=40, CPPCALL=41, JSCALL=42, REC=43, GROUP=44, BY=45, USING=46, 
		PATTERN=47, STOCK=48, ANYCLASS=49, VIA=50, LANGUAGE=51, OPTIONS_GHC=52, 
		OPTIONS=53, INLINE=54, NOINLINE=55, SPECIALISE=56, SPECINLINE=57, SOURCE=58, 
		RULES=59, SCC=60, DEPRECATED=61, WARNING=62, UNPACK=63, NOUNPACK=64, ANN=65, 
		MINIMAL=66, CTYPE=67, OVERLAPPING=68, OVERLAPPABLE=69, OVERLAPS=70, INCOHERENT=71, 
		COMPLETE=72, LCASE=73, DoubleArrow=74, DoubleColon=75, Arrow=76, Revarrow=77, 
		LarrowTail=78, RarrowTail=79, LLarrowTail=80, RRarrowTail=81, Hash=82, 
		Less=83, Greater=84, Ampersand=85, Pipe=86, Bang=87, Caret=88, Plus=89, 
		Minus=90, Asterisk=91, Percent=92, Divide=93, Tilde=94, Atsign=95, DDollar=96, 
		Dollar=97, DoubleDot=98, Dot=99, Semi=100, QuestionMark=101, Comma=102, 
		Colon=103, Eq=104, Equal=105, Quote=106, DoubleQuote=107, ReverseSlash=108, 
		BackQuote=109, AopenParen=110, AcloseParen=111, TopenTexpQuote=112, TcloseTExpQoute=113, 
		TopenExpQuote=114, TopenPatQuote=115, TopenTypQoute=116, TopenDecQoute=117, 
		TcloseQoute=118, OpenBoxParen=119, CloseBoxParen=120, OpenRoundBracket=121, 
		CloseRoundBracket=122, OpenSquareBracket=123, CloseSquareBracket=124, 
		CHAR=125, STRING=126, VARID=127, CONID=128, OpenPragmaBracket=129, ClosePragmaBracket=130, 
		COMMENT=131, NCOMMENT=132, OCURLY=133, CCURLY=134, VOCURLY=135, VCCURLY=136, 
		SEMI=137, DECIMAL=138, OCTAL=139, HEXADECIMAL=140, FLOAT=141, EXPONENT=142;
	public static final int
		RULE_module = 0, RULE_module_content = 1, RULE_where_module = 2, RULE_module_body = 3, 
		RULE_pragmas = 4, RULE_pragma = 5, RULE_language_pragma = 6, RULE_options_ghc = 7, 
		RULE_simple_options = 8, RULE_extension_ = 9, RULE_body = 10, RULE_impdecls = 11, 
		RULE_exports = 12, RULE_exprt = 13, RULE_impdecl = 14, RULE_impspec = 15, 
		RULE_himport = 16, RULE_cname = 17, RULE_fixity = 18, RULE_ops = 19, RULE_topdecls = 20, 
		RULE_topdecl = 21, RULE_cl_decl = 22, RULE_ty_decl = 23, RULE_standalone_kind_sig = 24, 
		RULE_sks_vars = 25, RULE_inst_decl = 26, RULE_overlap_pragma = 27, RULE_deriv_strategy_no_via = 28, 
		RULE_deriv_strategy_via = 29, RULE_deriv_standalone_strategy = 30, RULE_opt_injective_info = 31, 
		RULE_injectivity_cond = 32, RULE_inj_varids = 33, RULE_where_type_family = 34, 
		RULE_ty_fam_inst_eqn_list = 35, RULE_ty_fam_inst_eqns = 36, RULE_ty_fam_inst_eqn = 37, 
		RULE_at_decl_cls = 38, RULE_at_decl_inst = 39, RULE_opt_kind_sig = 40, 
		RULE_opt_datafam_kind_sig = 41, RULE_opt_tyfam_kind_sig = 42, RULE_opt_at_kind_inj_sig = 43, 
		RULE_tycl_hdr = 44, RULE_tycl_hdr_inst = 45, RULE_capi_ctype = 46, RULE_standalone_deriving = 47, 
		RULE_role_annot = 48, RULE_roles = 49, RULE_role = 50, RULE_pattern_synonym_decl = 51, 
		RULE_pattern_synonym_lhs = 52, RULE_vars_ = 53, RULE_cvars = 54, RULE_where_decls = 55, 
		RULE_pattern_synonym_sig = 56, RULE_decl_cls = 57, RULE_decls_cls = 58, 
		RULE_decllist_cls = 59, RULE_where_cls = 60, RULE_decl_inst = 61, RULE_decls_inst = 62, 
		RULE_decllist_inst = 63, RULE_where_inst = 64, RULE_decls = 65, RULE_decllist = 66, 
		RULE_binds = 67, RULE_wherebinds = 68, RULE_rules = 69, RULE_pragma_rule = 70, 
		RULE_rule_activation_marker = 71, RULE_rule_activation = 72, RULE_rule_foralls = 73, 
		RULE_rule_vars = 74, RULE_rule_var = 75, RULE_warnings = 76, RULE_pragma_warning = 77, 
		RULE_deprecations = 78, RULE_pragma_deprecation = 79, RULE_strings = 80, 
		RULE_stringlist = 81, RULE_annotation = 82, RULE_fdecl = 83, RULE_callconv = 84, 
		RULE_safety = 85, RULE_fspec = 86, RULE_opt_sig = 87, RULE_opt_tyconsig = 88, 
		RULE_sigtype = 89, RULE_sigtypedoc = 90, RULE_sig_vars = 91, RULE_sigtypes1 = 92, 
		RULE_unpackedness = 93, RULE_forall_vis_flag = 94, RULE_ktype = 95, RULE_ktypedoc = 96, 
		RULE_ctype = 97, RULE_ctypedoc = 98, RULE_tycl_context = 99, RULE_constr_context = 100, 
		RULE_type_ = 101, RULE_typedoc = 102, RULE_constr_btype = 103, RULE_constr_tyapps = 104, 
		RULE_constr_tyapp = 105, RULE_btype = 106, RULE_tyapps = 107, RULE_tyapp = 108, 
		RULE_atype = 109, RULE_inst_type = 110, RULE_deriv_types = 111, RULE_comma_types = 112, 
		RULE_bar_types2 = 113, RULE_tv_bndrs = 114, RULE_tv_bndr = 115, RULE_tv_bndr_no_braces = 116, 
		RULE_fds = 117, RULE_fds1 = 118, RULE_fd = 119, RULE_varids0 = 120, RULE_kind = 121, 
		RULE_gadt_constrlist = 122, RULE_gadt_constrs = 123, RULE_gadt_constr_with_doc = 124, 
		RULE_gadt_constr = 125, RULE_constrs = 126, RULE_constrs1 = 127, RULE_constr = 128, 
		RULE_forall = 129, RULE_constr_stuff = 130, RULE_fielddecls = 131, RULE_fielddecl = 132, 
		RULE_derivings = 133, RULE_deriving = 134, RULE_deriv_clause_types = 135, 
		RULE_decl_no_th = 136, RULE_decl = 137, RULE_rhs = 138, RULE_gdrhs = 139, 
		RULE_gdrh = 140, RULE_sigdecl = 141, RULE_activation = 142, RULE_th_quasiquote = 143, 
		RULE_th_qquasiquote = 144, RULE_quasiquote = 145, RULE_exp = 146, RULE_infixexp = 147, 
		RULE_exp10p = 148, RULE_exp10 = 149, RULE_fexp = 150, RULE_aexp = 151, 
		RULE_aexp1 = 152, RULE_aexp2 = 153, RULE_splice_exp = 154, RULE_splice_untyped = 155, 
		RULE_splice_typed = 156, RULE_cmdargs = 157, RULE_acmd = 158, RULE_cvtopbody = 159, 
		RULE_cvtopdecls0 = 160, RULE_texp = 161, RULE_tup_exprs = 162, RULE_commas_tup_tail = 163, 
		RULE_tup_tail = 164, RULE_list_ = 165, RULE_lexps = 166, RULE_flattenedpquals = 167, 
		RULE_pquals = 168, RULE_squals = 169, RULE_transformqual = 170, RULE_guards = 171, 
		RULE_guard_ = 172, RULE_alts = 173, RULE_alt = 174, RULE_alt_rhs = 175, 
		RULE_ralt = 176, RULE_gdpats = 177, RULE_ifgdpats = 178, RULE_gdpat = 179, 
		RULE_pat = 180, RULE_bindpat = 181, RULE_apat = 182, RULE_apats = 183, 
		RULE_fpat = 184, RULE_stmtlist = 185, RULE_stmts = 186, RULE_stmt = 187, 
		RULE_qual = 188, RULE_fbinds = 189, RULE_fbind = 190, RULE_dbinds = 191, 
		RULE_dbind = 192, RULE_name_boolformula_opt = 193, RULE_name_boolformula_and = 194, 
		RULE_name_boolformula_and_list = 195, RULE_name_boolformula_atom = 196, 
		RULE_namelist = 197, RULE_name_var = 198, RULE_qcon_nowiredlist = 199, 
		RULE_qcon = 200, RULE_gen_qcon = 201, RULE_con = 202, RULE_con_list = 203, 
		RULE_sysdcon_nolist = 204, RULE_sysdcon = 205, RULE_conop = 206, RULE_qconop = 207, 
		RULE_gconsym = 208, RULE_gtycon = 209, RULE_ntgtycon = 210, RULE_oqtycon = 211, 
		RULE_qtyconop = 212, RULE_qtycon = 213, RULE_tycon = 214, RULE_qtyconsym = 215, 
		RULE_tyconsym = 216, RULE_op = 217, RULE_varop = 218, RULE_qop = 219, 
		RULE_qopm = 220, RULE_hole_op = 221, RULE_qvarop = 222, RULE_qvaropm = 223, 
		RULE_tyvar = 224, RULE_tyvarop = 225, RULE_tyvarid = 226, RULE_tycls = 227, 
		RULE_qtycls = 228, RULE_var_ = 229, RULE_qvar = 230, RULE_qvarid = 231, 
		RULE_varid = 232, RULE_qvarsym = 233, RULE_qvarsym_no_minus = 234, RULE_varsym = 235, 
		RULE_varsym_no_minus = 236, RULE_special_id = 237, RULE_qconid = 238, 
		RULE_conid = 239, RULE_qconsym = 240, RULE_consym = 241, RULE_literal = 242, 
		RULE_open_ = 243, RULE_close = 244, RULE_semi = 245, RULE_modid = 246, 
		RULE_commas = 247, RULE_bars = 248, RULE_special = 249, RULE_symbol = 250, 
		RULE_ascSymbol = 251, RULE_num = 252, RULE_fractional = 253, RULE_integer = 254, 
		RULE_pfloat = 255, RULE_pchar = 256, RULE_pstring = 257;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "module_content", "where_module", "module_body", "pragmas", 
			"pragma", "language_pragma", "options_ghc", "simple_options", "extension_", 
			"body", "impdecls", "exports", "exprt", "impdecl", "impspec", "himport", 
			"cname", "fixity", "ops", "topdecls", "topdecl", "cl_decl", "ty_decl", 
			"standalone_kind_sig", "sks_vars", "inst_decl", "overlap_pragma", "deriv_strategy_no_via", 
			"deriv_strategy_via", "deriv_standalone_strategy", "opt_injective_info", 
			"injectivity_cond", "inj_varids", "where_type_family", "ty_fam_inst_eqn_list", 
			"ty_fam_inst_eqns", "ty_fam_inst_eqn", "at_decl_cls", "at_decl_inst", 
			"opt_kind_sig", "opt_datafam_kind_sig", "opt_tyfam_kind_sig", "opt_at_kind_inj_sig", 
			"tycl_hdr", "tycl_hdr_inst", "capi_ctype", "standalone_deriving", "role_annot", 
			"roles", "role", "pattern_synonym_decl", "pattern_synonym_lhs", "vars_", 
			"cvars", "where_decls", "pattern_synonym_sig", "decl_cls", "decls_cls", 
			"decllist_cls", "where_cls", "decl_inst", "decls_inst", "decllist_inst", 
			"where_inst", "decls", "decllist", "binds", "wherebinds", "rules", "pragma_rule", 
			"rule_activation_marker", "rule_activation", "rule_foralls", "rule_vars", 
			"rule_var", "warnings", "pragma_warning", "deprecations", "pragma_deprecation", 
			"strings", "stringlist", "annotation", "fdecl", "callconv", "safety", 
			"fspec", "opt_sig", "opt_tyconsig", "sigtype", "sigtypedoc", "sig_vars", 
			"sigtypes1", "unpackedness", "forall_vis_flag", "ktype", "ktypedoc", 
			"ctype", "ctypedoc", "tycl_context", "constr_context", "type_", "typedoc", 
			"constr_btype", "constr_tyapps", "constr_tyapp", "btype", "tyapps", "tyapp", 
			"atype", "inst_type", "deriv_types", "comma_types", "bar_types2", "tv_bndrs", 
			"tv_bndr", "tv_bndr_no_braces", "fds", "fds1", "fd", "varids0", "kind", 
			"gadt_constrlist", "gadt_constrs", "gadt_constr_with_doc", "gadt_constr", 
			"constrs", "constrs1", "constr", "forall", "constr_stuff", "fielddecls", 
			"fielddecl", "derivings", "deriving", "deriv_clause_types", "decl_no_th", 
			"decl", "rhs", "gdrhs", "gdrh", "sigdecl", "activation", "th_quasiquote", 
			"th_qquasiquote", "quasiquote", "exp", "infixexp", "exp10p", "exp10", 
			"fexp", "aexp", "aexp1", "aexp2", "splice_exp", "splice_untyped", "splice_typed", 
			"cmdargs", "acmd", "cvtopbody", "cvtopdecls0", "texp", "tup_exprs", "commas_tup_tail", 
			"tup_tail", "list_", "lexps", "flattenedpquals", "pquals", "squals", 
			"transformqual", "guards", "guard_", "alts", "alt", "alt_rhs", "ralt", 
			"gdpats", "ifgdpats", "gdpat", "pat", "bindpat", "apat", "apats", "fpat", 
			"stmtlist", "stmts", "stmt", "qual", "fbinds", "fbind", "dbinds", "dbind", 
			"name_boolformula_opt", "name_boolformula_and", "name_boolformula_and_list", 
			"name_boolformula_atom", "namelist", "name_var", "qcon_nowiredlist", 
			"qcon", "gen_qcon", "con", "con_list", "sysdcon_nolist", "sysdcon", "conop", 
			"qconop", "gconsym", "gtycon", "ntgtycon", "oqtycon", "qtyconop", "qtycon", 
			"tycon", "qtyconsym", "tyconsym", "op", "varop", "qop", "qopm", "hole_op", 
			"qvarop", "qvaropm", "tyvar", "tyvarop", "tyvarid", "tycls", "qtycls", 
			"var_", "qvar", "qvarid", "varid", "qvarsym", "qvarsym_no_minus", "varsym", 
			"varsym_no_minus", "special_id", "qconid", "conid", "qconsym", "consym", 
			"literal", "open_", "close", "semi", "modid", "commas", "bars", "special", 
			"symbol", "ascSymbol", "num", "fractional", "integer", "pfloat", "pchar", 
			"pstring"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'as'", "'case'", "'class'", "'data'", "'default'", 
			"'deriving'", "'do'", "'else'", "'hiding'", "'if'", "'import'", "'in'", 
			"'infix'", "'infixl'", "'infixr'", "'instance'", "'let'", "'module'", 
			"'newtype'", "'of'", "'qualified'", "'then'", "'type'", "'where'", "'_'", 
			"'forall'", "'foreign'", "'export'", "'safe'", "'interruptible'", "'unsafe'", 
			"'mdo'", "'family'", "'role'", "'stdcall'", "'ccall'", "'capi'", "'cplusplus'", 
			"'javascript'", "'rec'", "'group'", "'by'", "'using'", "'pattern'", "'stock'", 
			"'anyclass'", "'via'", "'LANGUAGE'", "'OPTIONS_GHC'", "'OPTIONS'", "'INLINE'", 
			"'NOINLINE'", "'SPECIALISE'", "'SPECIALISE_INLINE'", "'SOURCE'", "'RULES'", 
			"'SCC'", "'DEPRECATED'", "'WARNING'", "'UNPACK'", "'NOUNPACK'", "'ANN'", 
			"'MINIMAL'", "'CTYPE'", "'OVERLAPPING'", "'OVERLAPPABLE'", "'OVERLAPS'", 
			"'INCOHERENT'", "'COMPLETE'", null, "'=>'", "'::'", "'->'", "'<-'", "'-<'", 
			"'>-'", "'-<<'", "'>>-'", "'#'", "'<'", "'>'", "'&'", "'|'", "'!'", "'^'", 
			"'+'", "'-'", "'*'", "'%'", "'/'", "'~'", "'@'", "'$$'", "'$'", "'..'", 
			"'.'", "';'", "'?'", "','", "':'", "'='", "'=='", "'''", "''''", "'\\'", 
			"'`'", null, null, "'[||'", "'||]'", "'[|'", "'[p|'", "'[t|'", "'[d|'", 
			"'|]'", "'(#'", "'#)'", "'('", "')'", "'['", "']'", null, null, null, 
			null, "'{-#'", "'#-}'", null, null, "'{'", "'}'", "'VOCURLY'", "'VCCURLY'", 
			"'SEMI'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "TAB", "WS", "AS", "CASE", "CLASS", "DATA", "DEFAULT", 
			"DERIVING", "DO", "ELSE", "HIDING", "IF", "IMPORT", "IN", "INFIX", "INFIXL", 
			"INFIXR", "INSTANCE", "LET", "MODULE", "NEWTYPE", "OF", "QUALIFIED", 
			"THEN", "TYPE", "WHERE", "WILDCARD", "FORALL", "FOREIGN", "EXPORT", "SAFE", 
			"INTERRUPTIBLE", "UNSAFE", "MDO", "FAMILY", "ROLE", "STDCALL", "CCALL", 
			"CAPI", "CPPCALL", "JSCALL", "REC", "GROUP", "BY", "USING", "PATTERN", 
			"STOCK", "ANYCLASS", "VIA", "LANGUAGE", "OPTIONS_GHC", "OPTIONS", "INLINE", 
			"NOINLINE", "SPECIALISE", "SPECINLINE", "SOURCE", "RULES", "SCC", "DEPRECATED", 
			"WARNING", "UNPACK", "NOUNPACK", "ANN", "MINIMAL", "CTYPE", "OVERLAPPING", 
			"OVERLAPPABLE", "OVERLAPS", "INCOHERENT", "COMPLETE", "LCASE", "DoubleArrow", 
			"DoubleColon", "Arrow", "Revarrow", "LarrowTail", "RarrowTail", "LLarrowTail", 
			"RRarrowTail", "Hash", "Less", "Greater", "Ampersand", "Pipe", "Bang", 
			"Caret", "Plus", "Minus", "Asterisk", "Percent", "Divide", "Tilde", "Atsign", 
			"DDollar", "Dollar", "DoubleDot", "Dot", "Semi", "QuestionMark", "Comma", 
			"Colon", "Eq", "Equal", "Quote", "DoubleQuote", "ReverseSlash", "BackQuote", 
			"AopenParen", "AcloseParen", "TopenTexpQuote", "TcloseTExpQoute", "TopenExpQuote", 
			"TopenPatQuote", "TopenTypQoute", "TopenDecQoute", "TcloseQoute", "OpenBoxParen", 
			"CloseBoxParen", "OpenRoundBracket", "CloseRoundBracket", "OpenSquareBracket", 
			"CloseSquareBracket", "CHAR", "STRING", "VARID", "CONID", "OpenPragmaBracket", 
			"ClosePragmaBracket", "COMMENT", "NCOMMENT", "OCURLY", "CCURLY", "VOCURLY", 
			"VCCURLY", "SEMI", "DECIMAL", "OCTAL", "HEXADECIMAL", "FLOAT", "EXPONENT"
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
	public String getGrammarFileName() { return "HaskellParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HaskellParser.EOF, 0); }
		public Module_contentContext module_content() {
			return getRuleContext(Module_contentContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode OCURLY() { return getToken(HaskellParser.OCURLY, 0); }
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public PragmasContext pragmas() {
			return getRuleContext(PragmasContext.class,0);
		}
		public TerminalNode CCURLY() { return getToken(HaskellParser.CCURLY, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OCURLY) {
				{
				setState(516);
				match(OCURLY);
				}
			}

			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					semi();
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(525);
				pragmas();
				}
				break;
			}
			setState(531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(528);
					semi();
					}
					} 
				}
				setState(533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
				{
				setState(534);
				module_content();
				}
				break;
			case NEWLINE:
			case AS:
			case CASE:
			case CLASS:
			case DATA:
			case DEFAULT:
			case DERIVING:
			case DO:
			case HIDING:
			case IF:
			case IMPORT:
			case INFIX:
			case INFIXL:
			case INFIXR:
			case INSTANCE:
			case LET:
			case NEWTYPE:
			case QUALIFIED:
			case TYPE:
			case WILDCARD:
			case FOREIGN:
			case EXPORT:
			case MDO:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case PATTERN:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case LCASE:
			case Bang:
			case Minus:
			case Tilde:
			case DDollar:
			case Dollar:
			case Semi:
			case Quote:
			case DoubleQuote:
			case ReverseSlash:
			case AopenParen:
			case TopenTexpQuote:
			case TopenExpQuote:
			case TopenPatQuote:
			case TopenTypQoute:
			case TopenDecQoute:
			case OpenBoxParen:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case CHAR:
			case STRING:
			case VARID:
			case CONID:
			case OpenPragmaBracket:
			case SEMI:
			case DECIMAL:
			case OCTAL:
			case HEXADECIMAL:
			case FLOAT:
				{
				setState(535);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CCURLY) {
				{
				setState(538);
				match(CCURLY);
				}
			}

			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi || _la==SEMI) {
				{
				setState(541);
				semi();
				}
			}

			setState(544);
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

	public static class Module_contentContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(HaskellParser.MODULE, 0); }
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public Where_moduleContext where_module() {
			return getRuleContext(Where_moduleContext.class,0);
		}
		public ExportsContext exports() {
			return getRuleContext(ExportsContext.class,0);
		}
		public Module_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_content; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitModule_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_contentContext module_content() throws RecognitionException {
		Module_contentContext _localctx = new Module_contentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(MODULE);
			setState(547);
			modid();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(548);
				exports();
				}
			}

			setState(551);
			where_module();
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

	public static class Where_moduleContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public Module_bodyContext module_body() {
			return getRuleContext(Module_bodyContext.class,0);
		}
		public Where_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_module; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitWhere_module(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_moduleContext where_module() throws RecognitionException {
		Where_moduleContext _localctx = new Where_moduleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_where_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(WHERE);
			setState(554);
			module_body();
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

	public static class Module_bodyContext extends ParserRuleContext {
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public Module_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitModule_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_bodyContext module_body() throws RecognitionException {
		Module_bodyContext _localctx = new Module_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_module_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			open_();
			setState(557);
			body();
			setState(558);
			close();
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(559);
					semi();
					}
					} 
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class PragmasContext extends ParserRuleContext {
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public PragmasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPragmas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmasContext pragmas() throws RecognitionException {
		PragmasContext _localctx = new PragmasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pragmas);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(565);
					pragma();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(568); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class PragmaContext extends ParserRuleContext {
		public Language_pragmaContext language_pragma() {
			return getRuleContext(Language_pragmaContext.class,0);
		}
		public Options_ghcContext options_ghc() {
			return getRuleContext(Options_ghcContext.class,0);
		}
		public Simple_optionsContext simple_options() {
			return getRuleContext(Simple_optionsContext.class,0);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pragma);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				language_pragma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				options_ghc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				simple_options();
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

	public static class Language_pragmaContext extends ParserRuleContext {
		public TerminalNode OpenPragmaBracket() { return getToken(HaskellParser.OpenPragmaBracket, 0); }
		public TerminalNode LANGUAGE() { return getToken(HaskellParser.LANGUAGE, 0); }
		public List<Extension_Context> extension_() {
			return getRuleContexts(Extension_Context.class);
		}
		public Extension_Context extension_(int i) {
			return getRuleContext(Extension_Context.class,i);
		}
		public TerminalNode ClosePragmaBracket() { return getToken(HaskellParser.ClosePragmaBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public Language_pragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language_pragma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitLanguage_pragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Language_pragmaContext language_pragma() throws RecognitionException {
		Language_pragmaContext _localctx = new Language_pragmaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_language_pragma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(OpenPragmaBracket);
			setState(576);
			match(LANGUAGE);
			setState(577);
			extension_();
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(578);
				match(Comma);
				setState(579);
				extension_();
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585);
			match(ClosePragmaBracket);
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(586);
				semi();
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

	public static class Options_ghcContext extends ParserRuleContext {
		public TerminalNode OpenPragmaBracket() { return getToken(HaskellParser.OpenPragmaBracket, 0); }
		public TerminalNode OPTIONS_GHC() { return getToken(HaskellParser.OPTIONS_GHC, 0); }
		public TerminalNode ClosePragmaBracket() { return getToken(HaskellParser.ClosePragmaBracket, 0); }
		public List<TerminalNode> Minus() { return getTokens(HaskellParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(HaskellParser.Minus, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public List<VaridContext> varid() {
			return getRuleContexts(VaridContext.class);
		}
		public VaridContext varid(int i) {
			return getRuleContext(VaridContext.class,i);
		}
		public List<ConidContext> conid() {
			return getRuleContexts(ConidContext.class);
		}
		public ConidContext conid(int i) {
			return getRuleContext(ConidContext.class,i);
		}
		public Options_ghcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options_ghc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOptions_ghc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Options_ghcContext options_ghc() throws RecognitionException {
		Options_ghcContext _localctx = new Options_ghcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_options_ghc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(OpenPragmaBracket);
			setState(590);
			match(OPTIONS_GHC);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Minus) {
				{
				{
				setState(591);
				match(Minus);
				setState(594);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AS:
				case HIDING:
				case QUALIFIED:
				case EXPORT:
				case STDCALL:
				case CCALL:
				case CAPI:
				case JSCALL:
				case STOCK:
				case ANYCLASS:
				case VIA:
				case VARID:
					{
					setState(592);
					varid();
					}
					break;
				case CONID:
					{
					setState(593);
					conid();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(601);
			match(ClosePragmaBracket);
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(602);
				semi();
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

	public static class Simple_optionsContext extends ParserRuleContext {
		public TerminalNode OpenPragmaBracket() { return getToken(HaskellParser.OpenPragmaBracket, 0); }
		public TerminalNode OPTIONS() { return getToken(HaskellParser.OPTIONS, 0); }
		public TerminalNode ClosePragmaBracket() { return getToken(HaskellParser.ClosePragmaBracket, 0); }
		public List<TerminalNode> Minus() { return getTokens(HaskellParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(HaskellParser.Minus, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public List<VaridContext> varid() {
			return getRuleContexts(VaridContext.class);
		}
		public VaridContext varid(int i) {
			return getRuleContext(VaridContext.class,i);
		}
		public List<ConidContext> conid() {
			return getRuleContexts(ConidContext.class);
		}
		public ConidContext conid(int i) {
			return getRuleContext(ConidContext.class,i);
		}
		public Simple_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_options; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSimple_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_optionsContext simple_options() throws RecognitionException {
		Simple_optionsContext _localctx = new Simple_optionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(OpenPragmaBracket);
			setState(606);
			match(OPTIONS);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Minus) {
				{
				{
				setState(607);
				match(Minus);
				setState(610);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AS:
				case HIDING:
				case QUALIFIED:
				case EXPORT:
				case STDCALL:
				case CCALL:
				case CAPI:
				case JSCALL:
				case STOCK:
				case ANYCLASS:
				case VIA:
				case VARID:
					{
					setState(608);
					varid();
					}
					break;
				case CONID:
					{
					setState(609);
					conid();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			match(ClosePragmaBracket);
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(618);
				semi();
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

	public static class Extension_Context extends ParserRuleContext {
		public TerminalNode CONID() { return getToken(HaskellParser.CONID, 0); }
		public Extension_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExtension_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_Context extension_() throws RecognitionException {
		Extension_Context _localctx = new Extension_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_extension_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(CONID);
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

	public static class BodyContext extends ParserRuleContext {
		public ImpdeclsContext impdecls() {
			return getRuleContext(ImpdeclsContext.class,0);
		}
		public TopdeclsContext topdecls() {
			return getRuleContext(TopdeclsContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_body);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(623);
				impdecls();
				setState(624);
				topdecls();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				impdecls();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				topdecls();
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

	public static class ImpdeclsContext extends ParserRuleContext {
		public List<ImpdeclContext> impdecl() {
			return getRuleContexts(ImpdeclContext.class);
		}
		public ImpdeclContext impdecl(int i) {
			return getRuleContext(ImpdeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public ImpdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impdecls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitImpdecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpdeclsContext impdecls() throws RecognitionException {
		ImpdeclsContext _localctx = new ImpdeclsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_impdecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(633);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IMPORT:
						{
						setState(630);
						impdecl();
						}
						break;
					case NEWLINE:
						{
						setState(631);
						match(NEWLINE);
						}
						break;
					case Semi:
					case SEMI:
						{
						setState(632);
						semi();
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
				setState(635); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ExportsContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public List<ExprtContext> exprt() {
			return getRuleContexts(ExprtContext.class);
		}
		public ExprtContext exprt(int i) {
			return getRuleContext(ExprtContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public ExportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exports; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportsContext exports() throws RecognitionException {
		ExportsContext _localctx = new ExportsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exports);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(OpenRoundBracket);
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << MODULE) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (CONID - 121)))) != 0)) {
				{
				setState(638);
				exprt();
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(639);
						match(Comma);
						setState(640);
						exprt();
						}
						} 
					}
					setState(645);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
			}

			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(648);
				match(Comma);
				}
			}

			setState(651);
			match(CloseRoundBracket);
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

	public static class ExprtContext extends ParserRuleContext {
		public List<QvarContext> qvar() {
			return getRuleContexts(QvarContext.class);
		}
		public QvarContext qvar(int i) {
			return getRuleContext(QvarContext.class,i);
		}
		public QtyconContext qtycon() {
			return getRuleContext(QtyconContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode DoubleDot() { return getToken(HaskellParser.DoubleDot, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public List<CnameContext> cname() {
			return getRuleContexts(CnameContext.class);
		}
		public CnameContext cname(int i) {
			return getRuleContext(CnameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public QtyclsContext qtycls() {
			return getRuleContext(QtyclsContext.class,0);
		}
		public TerminalNode MODULE() { return getToken(HaskellParser.MODULE, 0); }
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public ExprtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExprt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprtContext exprt() throws RecognitionException {
		ExprtContext _localctx = new ExprtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprt);
		int _la;
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				qvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(654);
				qtycon();
				setState(670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					{
					setState(655);
					match(OpenRoundBracket);
					setState(656);
					match(DoubleDot);
					setState(657);
					match(CloseRoundBracket);
					}
					}
					break;
				case 2:
					{
					{
					setState(658);
					match(OpenRoundBracket);
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (OpenBoxParen - 119)) | (1L << (OpenRoundBracket - 119)) | (1L << (OpenSquareBracket - 119)) | (1L << (VARID - 119)) | (1L << (CONID - 119)))) != 0)) {
						{
						setState(659);
						cname();
						setState(664);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(660);
							match(Comma);
							setState(661);
							cname();
							}
							}
							setState(666);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(669);
					match(CloseRoundBracket);
					}
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(672);
				qtycls();
				setState(688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					{
					setState(673);
					match(OpenRoundBracket);
					setState(674);
					match(DoubleDot);
					setState(675);
					match(CloseRoundBracket);
					}
					}
					break;
				case 2:
					{
					{
					setState(676);
					match(OpenRoundBracket);
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (CONID - 121)))) != 0)) {
						{
						setState(677);
						qvar();
						setState(682);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(678);
							match(Comma);
							setState(679);
							qvar();
							}
							}
							setState(684);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(687);
					match(CloseRoundBracket);
					}
					}
					break;
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(690);
				match(MODULE);
				setState(691);
				modid();
				}
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

	public static class ImpdeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(HaskellParser.IMPORT, 0); }
		public List<ModidContext> modid() {
			return getRuleContexts(ModidContext.class);
		}
		public ModidContext modid(int i) {
			return getRuleContext(ModidContext.class,i);
		}
		public TerminalNode QUALIFIED() { return getToken(HaskellParser.QUALIFIED, 0); }
		public TerminalNode AS() { return getToken(HaskellParser.AS, 0); }
		public ImpspecContext impspec() {
			return getRuleContext(ImpspecContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public ImpdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitImpdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpdeclContext impdecl() throws RecognitionException {
		ImpdeclContext _localctx = new ImpdeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_impdecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(IMPORT);
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUALIFIED) {
				{
				setState(695);
				match(QUALIFIED);
				}
			}

			setState(698);
			modid();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(699);
				match(AS);
				setState(700);
				modid();
				}
			}

			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HIDING || _la==OpenRoundBracket) {
				{
				setState(703);
				impspec();
				}
			}

			setState(707); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(706);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(709); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class ImpspecContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public List<HimportContext> himport() {
			return getRuleContexts(HimportContext.class);
		}
		public HimportContext himport(int i) {
			return getRuleContext(HimportContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public TerminalNode HIDING() { return getToken(HaskellParser.HIDING, 0); }
		public ImpspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impspec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitImpspec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpspecContext impspec() throws RecognitionException {
		ImpspecContext _localctx = new ImpspecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_impspec);
		int _la;
		try {
			int _alt;
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(711);
				match(OpenRoundBracket);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (CONID - 121)))) != 0)) {
					{
					setState(712);
					himport();
					setState(717);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(713);
							match(Comma);
							setState(714);
							himport();
							}
							} 
						}
						setState(719);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(720);
						match(Comma);
						}
					}

					}
				}

				setState(725);
				match(CloseRoundBracket);
				}
				}
				break;
			case HIDING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(726);
				match(HIDING);
				setState(727);
				match(OpenRoundBracket);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (CONID - 121)))) != 0)) {
					{
					setState(728);
					himport();
					setState(733);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(729);
							match(Comma);
							setState(730);
							himport();
							}
							} 
						}
						setState(735);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(736);
						match(Comma);
						}
					}

					}
				}

				setState(741);
				match(CloseRoundBracket);
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

	public static class HimportContext extends ParserRuleContext {
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public TyconContext tycon() {
			return getRuleContext(TyconContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode DoubleDot() { return getToken(HaskellParser.DoubleDot, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public List<CnameContext> cname() {
			return getRuleContexts(CnameContext.class);
		}
		public CnameContext cname(int i) {
			return getRuleContext(CnameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public TyclsContext tycls() {
			return getRuleContext(TyclsContext.class,0);
		}
		public Sig_varsContext sig_vars() {
			return getRuleContext(Sig_varsContext.class,0);
		}
		public HimportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_himport; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitHimport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HimportContext himport() throws RecognitionException {
		HimportContext _localctx = new HimportContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_himport);
		int _la;
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				var_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(745);
				tycon();
				setState(761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					{
					setState(746);
					match(OpenRoundBracket);
					setState(747);
					match(DoubleDot);
					setState(748);
					match(CloseRoundBracket);
					}
					}
					break;
				case 2:
					{
					{
					setState(749);
					match(OpenRoundBracket);
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (OpenBoxParen - 119)) | (1L << (OpenRoundBracket - 119)) | (1L << (OpenSquareBracket - 119)) | (1L << (VARID - 119)) | (1L << (CONID - 119)))) != 0)) {
						{
						setState(750);
						cname();
						setState(755);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(751);
							match(Comma);
							setState(752);
							cname();
							}
							}
							setState(757);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(760);
					match(CloseRoundBracket);
					}
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(763);
				tycls();
				setState(772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					{
					setState(764);
					match(OpenRoundBracket);
					setState(765);
					match(DoubleDot);
					setState(766);
					match(CloseRoundBracket);
					}
					}
					break;
				case 2:
					{
					{
					setState(767);
					match(OpenRoundBracket);
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==OpenRoundBracket || _la==VARID) {
						{
						setState(768);
						sig_vars();
						}
					}

					setState(771);
					match(CloseRoundBracket);
					}
					}
					break;
				}
				}
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

	public static class CnameContext extends ParserRuleContext {
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public CnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CnameContext cname() throws RecognitionException {
		CnameContext _localctx = new CnameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cname);
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				var_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				con();
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

	public static class FixityContext extends ParserRuleContext {
		public TerminalNode INFIX() { return getToken(HaskellParser.INFIX, 0); }
		public TerminalNode INFIXL() { return getToken(HaskellParser.INFIXL, 0); }
		public TerminalNode INFIXR() { return getToken(HaskellParser.INFIXR, 0); }
		public FixityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFixity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixityContext fixity() throws RecognitionException {
		FixityContext _localctx = new FixityContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fixity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFIX) | (1L << INFIXL) | (1L << INFIXR))) != 0)) ) {
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

	public static class OpsContext extends ParserRuleContext {
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			op();
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(783);
				match(Comma);
				setState(784);
				op();
				}
				}
				setState(789);
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

	public static class TopdeclsContext extends ParserRuleContext {
		public List<TopdeclContext> topdecl() {
			return getRuleContexts(TopdeclContext.class);
		}
		public TopdeclContext topdecl(int i) {
			return getRuleContext(TopdeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public TopdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topdecls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTopdecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopdeclsContext topdecls() throws RecognitionException {
		TopdeclsContext _localctx = new TopdeclsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_topdecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(798); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(798);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(790);
						topdecl();
						setState(792); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(791);
								semi();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(794); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						setState(796);
						match(NEWLINE);
						}
						break;
					case 3:
						{
						setState(797);
						semi();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(800); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class TopdeclContext extends ParserRuleContext {
		public Cl_declContext cl_decl() {
			return getRuleContext(Cl_declContext.class,0);
		}
		public Ty_declContext ty_decl() {
			return getRuleContext(Ty_declContext.class,0);
		}
		public Standalone_kind_sigContext standalone_kind_sig() {
			return getRuleContext(Standalone_kind_sigContext.class,0);
		}
		public Inst_declContext inst_decl() {
			return getRuleContext(Inst_declContext.class,0);
		}
		public Standalone_derivingContext standalone_deriving() {
			return getRuleContext(Standalone_derivingContext.class,0);
		}
		public Role_annotContext role_annot() {
			return getRuleContext(Role_annotContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(HaskellParser.DEFAULT, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public Comma_typesContext comma_types() {
			return getRuleContext(Comma_typesContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(HaskellParser.FOREIGN, 0); }
		public FdeclContext fdecl() {
			return getRuleContext(FdeclContext.class,0);
		}
		public TerminalNode OpenPragmaBracket() { return getToken(HaskellParser.OpenPragmaBracket, 0); }
		public TerminalNode DEPRECATED() { return getToken(HaskellParser.DEPRECATED, 0); }
		public TerminalNode ClosePragmaBracket() { return getToken(HaskellParser.ClosePragmaBracket, 0); }
		public DeprecationsContext deprecations() {
			return getRuleContext(DeprecationsContext.class,0);
		}
		public TerminalNode WARNING() { return getToken(HaskellParser.WARNING, 0); }
		public WarningsContext warnings() {
			return getRuleContext(WarningsContext.class,0);
		}
		public TerminalNode RULES() { return getToken(HaskellParser.RULES, 0); }
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public Decl_no_thContext decl_no_th() {
			return getRuleContext(Decl_no_thContext.class,0);
		}
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public TopdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTopdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopdeclContext topdecl() throws RecognitionException {
		TopdeclContext _localctx = new TopdeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_topdecl);
		int _la;
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				cl_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				ty_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(804);
				standalone_kind_sig();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(805);
				inst_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(806);
				standalone_deriving();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(807);
				role_annot();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(808);
				match(DEFAULT);
				setState(809);
				match(OpenRoundBracket);
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << FORALL) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (Hash - 82)) | (1L << (Less - 82)) | (1L << (Greater - 82)) | (1L << (Ampersand - 82)) | (1L << (Pipe - 82)) | (1L << (Bang - 82)) | (1L << (Caret - 82)) | (1L << (Plus - 82)) | (1L << (Minus - 82)) | (1L << (Asterisk - 82)) | (1L << (Percent - 82)) | (1L << (Divide - 82)) | (1L << (Tilde - 82)) | (1L << (Atsign - 82)) | (1L << (Dollar - 82)) | (1L << (Dot - 82)) | (1L << (QuestionMark - 82)) | (1L << (Colon - 82)) | (1L << (Eq - 82)) | (1L << (Equal - 82)) | (1L << (Quote - 82)) | (1L << (ReverseSlash - 82)) | (1L << (BackQuote - 82)) | (1L << (OpenBoxParen - 82)) | (1L << (OpenRoundBracket - 82)) | (1L << (OpenSquareBracket - 82)) | (1L << (STRING - 82)) | (1L << (VARID - 82)) | (1L << (CONID - 82)) | (1L << (OpenPragmaBracket - 82)) | (1L << (OCURLY - 82)) | (1L << (DECIMAL - 82)) | (1L << (OCTAL - 82)) | (1L << (HEXADECIMAL - 82)))) != 0)) {
					{
					setState(810);
					comma_types();
					}
				}

				setState(813);
				match(CloseRoundBracket);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(814);
				match(FOREIGN);
				setState(815);
				fdecl();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(816);
				match(OpenPragmaBracket);
				setState(817);
				match(DEPRECATED);
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (OpenBoxParen - 119)) | (1L << (OpenRoundBracket - 119)) | (1L << (OpenSquareBracket - 119)) | (1L << (VARID - 119)) | (1L << (CONID - 119)))) != 0)) {
					{
					setState(818);
					deprecations();
					}
				}

				setState(821);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(822);
				match(OpenPragmaBracket);
				setState(823);
				match(WARNING);
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (OpenBoxParen - 119)) | (1L << (OpenRoundBracket - 119)) | (1L << (OpenSquareBracket - 119)) | (1L << (VARID - 119)) | (1L << (CONID - 119)))) != 0)) {
					{
					setState(824);
					warnings();
					}
				}

				setState(827);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(828);
				match(OpenPragmaBracket);
				setState(829);
				match(RULES);
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(830);
					rules();
					}
				}

				setState(833);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(834);
				annotation();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(835);
				decl_no_th();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(836);
				infixexp();
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

	public static class Cl_declContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(HaskellParser.CLASS, 0); }
		public Tycl_hdrContext tycl_hdr() {
			return getRuleContext(Tycl_hdrContext.class,0);
		}
		public FdsContext fds() {
			return getRuleContext(FdsContext.class,0);
		}
		public Where_clsContext where_cls() {
			return getRuleContext(Where_clsContext.class,0);
		}
		public Cl_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cl_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCl_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cl_declContext cl_decl() throws RecognitionException {
		Cl_declContext _localctx = new Cl_declContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cl_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(CLASS);
			setState(840);
			tycl_hdr();
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Pipe) {
				{
				setState(841);
				fds();
				}
			}

			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(844);
				where_cls();
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

	public static class Ty_declContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HaskellParser.TYPE, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public KtypedocContext ktypedoc() {
			return getRuleContext(KtypedocContext.class,0);
		}
		public TerminalNode FAMILY() { return getToken(HaskellParser.FAMILY, 0); }
		public Opt_tyfam_kind_sigContext opt_tyfam_kind_sig() {
			return getRuleContext(Opt_tyfam_kind_sigContext.class,0);
		}
		public Opt_injective_infoContext opt_injective_info() {
			return getRuleContext(Opt_injective_infoContext.class,0);
		}
		public Where_type_familyContext where_type_family() {
			return getRuleContext(Where_type_familyContext.class,0);
		}
		public TerminalNode DATA() { return getToken(HaskellParser.DATA, 0); }
		public Tycl_hdrContext tycl_hdr() {
			return getRuleContext(Tycl_hdrContext.class,0);
		}
		public ConstrsContext constrs() {
			return getRuleContext(ConstrsContext.class,0);
		}
		public Capi_ctypeContext capi_ctype() {
			return getRuleContext(Capi_ctypeContext.class,0);
		}
		public DerivingsContext derivings() {
			return getRuleContext(DerivingsContext.class,0);
		}
		public TerminalNode NEWTYPE() { return getToken(HaskellParser.NEWTYPE, 0); }
		public Opt_kind_sigContext opt_kind_sig() {
			return getRuleContext(Opt_kind_sigContext.class,0);
		}
		public Gadt_constrlistContext gadt_constrlist() {
			return getRuleContext(Gadt_constrlistContext.class,0);
		}
		public Opt_datafam_kind_sigContext opt_datafam_kind_sig() {
			return getRuleContext(Opt_datafam_kind_sigContext.class,0);
		}
		public Ty_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ty_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTy_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ty_declContext ty_decl() throws RecognitionException {
		Ty_declContext _localctx = new Ty_declContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ty_decl);
		int _la;
		try {
			setState(916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(TYPE);
				setState(848);
				type_();
				setState(849);
				match(Eq);
				setState(850);
				ktypedoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				match(TYPE);
				setState(853);
				match(FAMILY);
				setState(854);
				type_();
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon || _la==Eq) {
					{
					setState(855);
					opt_tyfam_kind_sig();
					}
				}

				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(858);
					opt_injective_info();
					}
				}

				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(861);
					where_type_family();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				match(DATA);
				setState(866);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(865);
					capi_ctype();
					}
					break;
				}
				setState(868);
				tycl_hdr();
				setState(869);
				constrs();
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(870);
					derivings();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(873);
				match(NEWTYPE);
				setState(875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(874);
					capi_ctype();
					}
					break;
				}
				setState(877);
				tycl_hdr();
				setState(878);
				constrs();
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(879);
					derivings();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(882);
				match(DATA);
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(883);
					capi_ctype();
					}
					break;
				}
				setState(886);
				tycl_hdr();
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(887);
					opt_kind_sig();
					}
				}

				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(890);
					gadt_constrlist();
					}
				}

				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(893);
					derivings();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(896);
				match(NEWTYPE);
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(897);
					capi_ctype();
					}
					break;
				}
				setState(900);
				tycl_hdr();
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(901);
					opt_kind_sig();
					}
				}

				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(904);
					gadt_constrlist();
					}
				}

				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(907);
					derivings();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(910);
				match(DATA);
				setState(911);
				match(FAMILY);
				setState(912);
				type_();
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(913);
					opt_datafam_kind_sig();
					}
				}

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

	public static class Standalone_kind_sigContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HaskellParser.TYPE, 0); }
		public Sks_varsContext sks_vars() {
			return getRuleContext(Sks_varsContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public KtypedocContext ktypedoc() {
			return getRuleContext(KtypedocContext.class,0);
		}
		public Standalone_kind_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone_kind_sig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitStandalone_kind_sig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standalone_kind_sigContext standalone_kind_sig() throws RecognitionException {
		Standalone_kind_sigContext _localctx = new Standalone_kind_sigContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_standalone_kind_sig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(TYPE);
			setState(919);
			sks_vars();
			setState(920);
			match(DoubleColon);
			setState(921);
			ktypedoc();
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

	public static class Sks_varsContext extends ParserRuleContext {
		public List<OqtyconContext> oqtycon() {
			return getRuleContexts(OqtyconContext.class);
		}
		public OqtyconContext oqtycon(int i) {
			return getRuleContext(OqtyconContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public Sks_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sks_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSks_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sks_varsContext sks_vars() throws RecognitionException {
		Sks_varsContext _localctx = new Sks_varsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sks_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			oqtycon();
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(924);
				match(Comma);
				setState(925);
				oqtycon();
				}
				}
				setState(930);
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

	public static class Inst_declContext extends ParserRuleContext {
		public TerminalNode INSTANCE() { return getToken(HaskellParser.INSTANCE, 0); }
		public Inst_typeContext inst_type() {
			return getRuleContext(Inst_typeContext.class,0);
		}
		public Overlap_pragmaContext overlap_pragma() {
			return getRuleContext(Overlap_pragmaContext.class,0);
		}
		public Where_instContext where_inst() {
			return getRuleContext(Where_instContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(HaskellParser.TYPE, 0); }
		public Ty_fam_inst_eqnContext ty_fam_inst_eqn() {
			return getRuleContext(Ty_fam_inst_eqnContext.class,0);
		}
		public TerminalNode DATA() { return getToken(HaskellParser.DATA, 0); }
		public Tycl_hdr_instContext tycl_hdr_inst() {
			return getRuleContext(Tycl_hdr_instContext.class,0);
		}
		public Capi_ctypeContext capi_ctype() {
			return getRuleContext(Capi_ctypeContext.class,0);
		}
		public DerivingsContext derivings() {
			return getRuleContext(DerivingsContext.class,0);
		}
		public TerminalNode NEWTYPE() { return getToken(HaskellParser.NEWTYPE, 0); }
		public Opt_kind_sigContext opt_kind_sig() {
			return getRuleContext(Opt_kind_sigContext.class,0);
		}
		public Gadt_constrlistContext gadt_constrlist() {
			return getRuleContext(Gadt_constrlistContext.class,0);
		}
		public Inst_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitInst_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_declContext inst_decl() throws RecognitionException {
		Inst_declContext _localctx = new Inst_declContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_inst_decl);
		int _la;
		try {
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(931);
				match(INSTANCE);
				setState(933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(932);
					overlap_pragma();
					}
					break;
				}
				setState(935);
				inst_type();
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(936);
					where_inst();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(939);
				match(TYPE);
				setState(940);
				match(INSTANCE);
				setState(941);
				ty_fam_inst_eqn();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(942);
				match(DATA);
				setState(943);
				match(INSTANCE);
				setState(945);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(944);
					capi_ctype();
					}
					break;
				}
				setState(947);
				tycl_hdr_inst();
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(948);
					derivings();
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(951);
				match(NEWTYPE);
				setState(952);
				match(INSTANCE);
				setState(954);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(953);
					capi_ctype();
					}
					break;
				}
				setState(956);
				tycl_hdr_inst();
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(957);
					derivings();
					}
				}

				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(960);
				match(DATA);
				setState(961);
				match(INSTANCE);
				setState(963);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(962);
					capi_ctype();
					}
					break;
				}
				setState(965);
				tycl_hdr_inst();
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(966);
					opt_kind_sig();
					}
				}

				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(969);
					gadt_constrlist();
					}
				}

				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(972);
					derivings();
					}
				}

				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(975);
				match(NEWTYPE);
				setState(976);
				match(INSTANCE);
				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(977);
					capi_ctype();
					}
					break;
				}
				setState(980);
				tycl_hdr_inst();
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(981);
					opt_kind_sig();
					}
				}

				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(984);
					gadt_constrlist();
					}
				}

				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(987);
					derivings();
					}
				}

				}
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

	public static class Overlap_pragmaContext extends ParserRuleContext {
		public TerminalNode OpenPragmaBracket() { return getToken(HaskellParser.OpenPragmaBracket, 0); }
		public TerminalNode OVERLAPPABLE() { return getToken(HaskellParser.OVERLAPPABLE, 0); }
		public TerminalNode ClosePragmaBracket() { return getToken(HaskellParser.ClosePragmaBracket, 0); }
		public TerminalNode OVERLAPPING() { return getToken(HaskellParser.OVERLAPPING, 0); }
		public TerminalNode OVERLAPS() { return getToken(HaskellParser.OVERLAPS, 0); }
		public TerminalNode INCOHERENT() { return getToken(HaskellParser.INCOHERENT, 0); }
		public Overlap_pragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overlap_pragma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOverlap_pragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Overlap_pragmaContext overlap_pragma() throws RecognitionException {
		Overlap_pragmaContext _localctx = new Overlap_pragmaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_overlap_pragma);
		try {
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				match(OpenPragmaBracket);
				setState(993);
				match(OVERLAPPABLE);
				setState(994);
				match(ClosePragmaBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(OpenPragmaBracket);
				setState(996);
				match(OVERLAPPING);
				setState(997);
				match(ClosePragmaBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(998);
				match(OpenPragmaBracket);
				setState(999);
				match(OVERLAPS);
				setState(1000);
				match(ClosePragmaBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1001);
				match(OpenPragmaBracket);
				setState(1002);
				match(INCOHERENT);
				setState(1003);
				match(ClosePragmaBracket);
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

	public static class Deriv_strategy_no_viaContext extends ParserRuleContext {
		public TerminalNode STOCK() { return getToken(HaskellParser.STOCK, 0); }
		public TerminalNode ANYCLASS() { return getToken(HaskellParser.ANYCLASS, 0); }
		public TerminalNode NEWTYPE() { return getToken(HaskellParser.NEWTYPE, 0); }
		public Deriv_strategy_no_viaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriv_strategy_no_via; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDeriv_strategy_no_via(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deriv_strategy_no_viaContext deriv_strategy_no_via() throws RecognitionException {
		Deriv_strategy_no_viaContext _localctx = new Deriv_strategy_no_viaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deriv_strategy_no_via);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWTYPE) | (1L << STOCK) | (1L << ANYCLASS))) != 0)) ) {
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

	public static class Deriv_strategy_viaContext extends ParserRuleContext {
		public TerminalNode VIA() { return getToken(HaskellParser.VIA, 0); }
		public KtypeContext ktype() {
			return getRuleContext(KtypeContext.class,0);
		}
		public Deriv_strategy_viaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriv_strategy_via; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDeriv_strategy_via(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deriv_strategy_viaContext deriv_strategy_via() throws RecognitionException {
		Deriv_strategy_viaContext _localctx = new Deriv_strategy_viaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_deriv_strategy_via);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(VIA);
			setState(1009);
			ktype();
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

	public static class Deriv_standalone_strategyContext extends ParserRuleContext {
		public TerminalNode STOCK() { return getToken(HaskellParser.STOCK, 0); }
		public TerminalNode ANYCLASS() { return getToken(HaskellParser.ANYCLASS, 0); }
		public TerminalNode NEWTYPE() { return getToken(HaskellParser.NEWTYPE, 0); }
		public Deriv_strategy_viaContext deriv_strategy_via() {
			return getRuleContext(Deriv_strategy_viaContext.class,0);
		}
		public Deriv_standalone_strategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriv_standalone_strategy; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDeriv_standalone_strategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deriv_standalone_strategyContext deriv_standalone_strategy() throws RecognitionException {
		Deriv_standalone_strategyContext _localctx = new Deriv_standalone_strategyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_deriv_standalone_strategy);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				match(STOCK);
				}
				break;
			case ANYCLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				match(ANYCLASS);
				}
				break;
			case NEWTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1013);
				match(NEWTYPE);
				}
				break;
			case VIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(1014);
				deriv_strategy_via();
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

	public static class Opt_injective_infoContext extends ParserRuleContext {
		public TerminalNode Pipe() { return getToken(HaskellParser.Pipe, 0); }
		public Injectivity_condContext injectivity_cond() {
			return getRuleContext(Injectivity_condContext.class,0);
		}
		public Opt_injective_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_injective_info; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOpt_injective_info(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_injective_infoContext opt_injective_info() throws RecognitionException {
		Opt_injective_infoContext _localctx = new Opt_injective_infoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_opt_injective_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(Pipe);
			setState(1018);
			injectivity_cond();
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

	public static class Injectivity_condContext extends ParserRuleContext {
		public TyvaridContext tyvarid() {
			return getRuleContext(TyvaridContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(HaskellParser.Arrow, 0); }
		public Inj_varidsContext inj_varids() {
			return getRuleContext(Inj_varidsContext.class,0);
		}
		public Injectivity_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectivity_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitInjectivity_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Injectivity_condContext injectivity_cond() throws RecognitionException {
		Injectivity_condContext _localctx = new Injectivity_condContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_injectivity_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			tyvarid();
			setState(1021);
			match(Arrow);
			setState(1022);
			inj_varids();
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

	public static class Inj_varidsContext extends ParserRuleContext {
		public List<TyvaridContext> tyvarid() {
			return getRuleContexts(TyvaridContext.class);
		}
		public TyvaridContext tyvarid(int i) {
			return getRuleContext(TyvaridContext.class,i);
		}
		public Inj_varidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inj_varids; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitInj_varids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inj_varidsContext inj_varids() throws RecognitionException {
		Inj_varidsContext _localctx = new Inj_varidsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_inj_varids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1024);
				tyvarid();
				}
				}
				setState(1027); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << SAFE) | (1L << INTERRUPTIBLE) | (1L << UNSAFE) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==VARID );
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

	public static class Where_type_familyContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public Ty_fam_inst_eqn_listContext ty_fam_inst_eqn_list() {
			return getRuleContext(Ty_fam_inst_eqn_listContext.class,0);
		}
		public Where_type_familyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_type_family; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitWhere_type_family(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_type_familyContext where_type_family() throws RecognitionException {
		Where_type_familyContext _localctx = new Where_type_familyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_where_type_family);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(WHERE);
			setState(1030);
			ty_fam_inst_eqn_list();
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

	public static class Ty_fam_inst_eqn_listContext extends ParserRuleContext {
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public Ty_fam_inst_eqnsContext ty_fam_inst_eqns() {
			return getRuleContext(Ty_fam_inst_eqnsContext.class,0);
		}
		public TerminalNode OCURLY() { return getToken(HaskellParser.OCURLY, 0); }
		public TerminalNode DoubleDot() { return getToken(HaskellParser.DoubleDot, 0); }
		public TerminalNode CCURLY() { return getToken(HaskellParser.CCURLY, 0); }
		public Ty_fam_inst_eqn_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ty_fam_inst_eqn_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTy_fam_inst_eqn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ty_fam_inst_eqn_listContext ty_fam_inst_eqn_list() throws RecognitionException {
		Ty_fam_inst_eqn_listContext _localctx = new Ty_fam_inst_eqn_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ty_fam_inst_eqn_list);
		int _la;
		try {
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1032);
				open_();
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << FORALL) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (Hash - 82)) | (1L << (Less - 82)) | (1L << (Greater - 82)) | (1L << (Ampersand - 82)) | (1L << (Pipe - 82)) | (1L << (Bang - 82)) | (1L << (Caret - 82)) | (1L << (Plus - 82)) | (1L << (Minus - 82)) | (1L << (Asterisk - 82)) | (1L << (Percent - 82)) | (1L << (Divide - 82)) | (1L << (Tilde - 82)) | (1L << (Atsign - 82)) | (1L << (Dollar - 82)) | (1L << (Dot - 82)) | (1L << (QuestionMark - 82)) | (1L << (Colon - 82)) | (1L << (Eq - 82)) | (1L << (Equal - 82)) | (1L << (Quote - 82)) | (1L << (ReverseSlash - 82)) | (1L << (BackQuote - 82)) | (1L << (OpenBoxParen - 82)) | (1L << (OpenRoundBracket - 82)) | (1L << (OpenSquareBracket - 82)) | (1L << (STRING - 82)) | (1L << (VARID - 82)) | (1L << (CONID - 82)) | (1L << (OpenPragmaBracket - 82)) | (1L << (OCURLY - 82)) | (1L << (DECIMAL - 82)) | (1L << (OCTAL - 82)) | (1L << (HEXADECIMAL - 82)))) != 0)) {
					{
					setState(1033);
					ty_fam_inst_eqns();
					}
				}

				setState(1036);
				close();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1038);
				match(OCURLY);
				setState(1039);
				match(DoubleDot);
				setState(1040);
				match(CCURLY);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1041);
				open_();
				setState(1042);
				match(DoubleDot);
				setState(1043);
				close();
				}
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

	public static class Ty_fam_inst_eqnsContext extends ParserRuleContext {
		public List<Ty_fam_inst_eqnContext> ty_fam_inst_eqn() {
			return getRuleContexts(Ty_fam_inst_eqnContext.class);
		}
		public Ty_fam_inst_eqnContext ty_fam_inst_eqn(int i) {
			return getRuleContext(Ty_fam_inst_eqnContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public Ty_fam_inst_eqnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ty_fam_inst_eqns; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTy_fam_inst_eqns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ty_fam_inst_eqnsContext ty_fam_inst_eqns() throws RecognitionException {
		Ty_fam_inst_eqnsContext _localctx = new Ty_fam_inst_eqnsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ty_fam_inst_eqns);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			ty_fam_inst_eqn();
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1049); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1048);
						semi();
						}
						}
						setState(1051); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Semi || _la==SEMI );
					setState(1053);
					ty_fam_inst_eqn();
					}
					} 
				}
				setState(1059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi || _la==SEMI) {
				{
				{
				setState(1060);
				semi();
				}
				}
				setState(1065);
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

	public static class Ty_fam_inst_eqnContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(HaskellParser.FORALL, 0); }
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public KtypeContext ktype() {
			return getRuleContext(KtypeContext.class,0);
		}
		public Tv_bndrsContext tv_bndrs() {
			return getRuleContext(Tv_bndrsContext.class,0);
		}
		public Ty_fam_inst_eqnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ty_fam_inst_eqn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTy_fam_inst_eqn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ty_fam_inst_eqnContext ty_fam_inst_eqn() throws RecognitionException {
		Ty_fam_inst_eqnContext _localctx = new Ty_fam_inst_eqnContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ty_fam_inst_eqn);
		int _la;
		try {
			setState(1079);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				match(FORALL);
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (OCURLY - 121)))) != 0)) {
					{
					setState(1067);
					tv_bndrs();
					}
				}

				setState(1070);
				match(Dot);
				setState(1071);
				type_();
				setState(1072);
				match(Eq);
				setState(1073);
				ktype();
				}
				break;
			case AS:
			case HIDING:
			case QUALIFIED:
			case WILDCARD:
			case EXPORT:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case Hash:
			case Less:
			case Greater:
			case Ampersand:
			case Pipe:
			case Bang:
			case Caret:
			case Plus:
			case Minus:
			case Asterisk:
			case Percent:
			case Divide:
			case Tilde:
			case Atsign:
			case Dollar:
			case Dot:
			case QuestionMark:
			case Colon:
			case Eq:
			case Equal:
			case Quote:
			case ReverseSlash:
			case BackQuote:
			case OpenBoxParen:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case STRING:
			case VARID:
			case CONID:
			case OpenPragmaBracket:
			case OCURLY:
			case DECIMAL:
			case OCTAL:
			case HEXADECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1075);
				type_();
				setState(1076);
				match(Eq);
				setState(1077);
				ktype();
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

	public static class At_decl_clsContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(HaskellParser.DATA, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode FAMILY() { return getToken(HaskellParser.FAMILY, 0); }
		public Opt_datafam_kind_sigContext opt_datafam_kind_sig() {
			return getRuleContext(Opt_datafam_kind_sigContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(HaskellParser.TYPE, 0); }
		public Opt_at_kind_inj_sigContext opt_at_kind_inj_sig() {
			return getRuleContext(Opt_at_kind_inj_sigContext.class,0);
		}
		public Ty_fam_inst_eqnContext ty_fam_inst_eqn() {
			return getRuleContext(Ty_fam_inst_eqnContext.class,0);
		}
		public TerminalNode INSTANCE() { return getToken(HaskellParser.INSTANCE, 0); }
		public At_decl_clsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at_decl_cls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAt_decl_cls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final At_decl_clsContext at_decl_cls() throws RecognitionException {
		At_decl_clsContext _localctx = new At_decl_clsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_at_decl_cls);
		int _la;
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1081);
				match(DATA);
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FAMILY) {
					{
					setState(1082);
					match(FAMILY);
					}
				}

				setState(1085);
				type_();
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(1086);
					opt_datafam_kind_sig();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1089);
				match(TYPE);
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FAMILY) {
					{
					setState(1090);
					match(FAMILY);
					}
				}

				setState(1093);
				type_();
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon || _la==Eq) {
					{
					setState(1094);
					opt_at_kind_inj_sig();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1097);
				match(TYPE);
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSTANCE) {
					{
					setState(1098);
					match(INSTANCE);
					}
				}

				setState(1101);
				ty_fam_inst_eqn();
				}
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

	public static class At_decl_instContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HaskellParser.TYPE, 0); }
		public Ty_fam_inst_eqnContext ty_fam_inst_eqn() {
			return getRuleContext(Ty_fam_inst_eqnContext.class,0);
		}
		public TerminalNode INSTANCE() { return getToken(HaskellParser.INSTANCE, 0); }
		public TerminalNode DATA() { return getToken(HaskellParser.DATA, 0); }
		public Tycl_hdr_instContext tycl_hdr_inst() {
			return getRuleContext(Tycl_hdr_instContext.class,0);
		}
		public ConstrsContext constrs() {
			return getRuleContext(ConstrsContext.class,0);
		}
		public Capi_ctypeContext capi_ctype() {
			return getRuleContext(Capi_ctypeContext.class,0);
		}
		public DerivingsContext derivings() {
			return getRuleContext(DerivingsContext.class,0);
		}
		public TerminalNode NEWTYPE() { return getToken(HaskellParser.NEWTYPE, 0); }
		public Opt_kind_sigContext opt_kind_sig() {
			return getRuleContext(Opt_kind_sigContext.class,0);
		}
		public Gadt_constrlistContext gadt_constrlist() {
			return getRuleContext(Gadt_constrlistContext.class,0);
		}
		public At_decl_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at_decl_inst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAt_decl_inst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final At_decl_instContext at_decl_inst() throws RecognitionException {
		At_decl_instContext _localctx = new At_decl_instContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_at_decl_inst);
		int _la;
		try {
			setState(1167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1104);
				match(TYPE);
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSTANCE) {
					{
					setState(1105);
					match(INSTANCE);
					}
				}

				setState(1108);
				ty_fam_inst_eqn();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1109);
				match(DATA);
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSTANCE) {
					{
					setState(1110);
					match(INSTANCE);
					}
				}

				setState(1114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1113);
					capi_ctype();
					}
					break;
				}
				setState(1116);
				tycl_hdr_inst();
				setState(1117);
				constrs();
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(1118);
					derivings();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1121);
				match(NEWTYPE);
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSTANCE) {
					{
					setState(1122);
					match(INSTANCE);
					}
				}

				setState(1126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1125);
					capi_ctype();
					}
					break;
				}
				setState(1128);
				tycl_hdr_inst();
				setState(1129);
				constrs();
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(1130);
					derivings();
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1133);
				match(DATA);
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSTANCE) {
					{
					setState(1134);
					match(INSTANCE);
					}
				}

				setState(1138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1137);
					capi_ctype();
					}
					break;
				}
				setState(1140);
				tycl_hdr_inst();
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(1141);
					opt_kind_sig();
					}
				}

				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1144);
					gadt_constrlist();
					}
				}

				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(1147);
					derivings();
					}
				}

				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1150);
				match(NEWTYPE);
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSTANCE) {
					{
					setState(1151);
					match(INSTANCE);
					}
				}

				setState(1155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1154);
					capi_ctype();
					}
					break;
				}
				setState(1157);
				tycl_hdr_inst();
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(1158);
					opt_kind_sig();
					}
				}

				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1161);
					gadt_constrlist();
					}
				}

				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(1164);
					derivings();
					}
				}

				}
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

	public static class Opt_kind_sigContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public Opt_kind_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_kind_sig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOpt_kind_sig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_kind_sigContext opt_kind_sig() throws RecognitionException {
		Opt_kind_sigContext _localctx = new Opt_kind_sigContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_opt_kind_sig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			match(DoubleColon);
			setState(1170);
			kind();
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

	public static class Opt_datafam_kind_sigContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public Opt_datafam_kind_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_datafam_kind_sig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOpt_datafam_kind_sig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_datafam_kind_sigContext opt_datafam_kind_sig() throws RecognitionException {
		Opt_datafam_kind_sigContext _localctx = new Opt_datafam_kind_sigContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_opt_datafam_kind_sig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(DoubleColon);
			setState(1173);
			kind();
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

	public static class Opt_tyfam_kind_sigContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public Tv_bndrContext tv_bndr() {
			return getRuleContext(Tv_bndrContext.class,0);
		}
		public Opt_tyfam_kind_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_tyfam_kind_sig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOpt_tyfam_kind_sig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_tyfam_kind_sigContext opt_tyfam_kind_sig() throws RecognitionException {
		Opt_tyfam_kind_sigContext _localctx = new Opt_tyfam_kind_sigContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_opt_tyfam_kind_sig);
		try {
			setState(1179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DoubleColon:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1175);
				match(DoubleColon);
				setState(1176);
				kind();
				}
				}
				break;
			case Eq:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1177);
				match(Eq);
				setState(1178);
				tv_bndr();
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

	public static class Opt_at_kind_inj_sigContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public Tv_bndr_no_bracesContext tv_bndr_no_braces() {
			return getRuleContext(Tv_bndr_no_bracesContext.class,0);
		}
		public TerminalNode Pipe() { return getToken(HaskellParser.Pipe, 0); }
		public Injectivity_condContext injectivity_cond() {
			return getRuleContext(Injectivity_condContext.class,0);
		}
		public Opt_at_kind_inj_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_at_kind_inj_sig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOpt_at_kind_inj_sig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_at_kind_inj_sigContext opt_at_kind_inj_sig() throws RecognitionException {
		Opt_at_kind_inj_sigContext _localctx = new Opt_at_kind_inj_sigContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_opt_at_kind_inj_sig);
		try {
			setState(1188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DoubleColon:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1181);
				match(DoubleColon);
				setState(1182);
				kind();
				}
				}
				break;
			case Eq:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1183);
				match(Eq);
				setState(1184);
				tv_bndr_no_braces();
				setState(1185);
				match(Pipe);
				setState(1186);
				injectivity_cond();
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

	public static class Tycl_hdrContext extends ParserRuleContext {
		public Tycl_contextContext tycl_context() {
			return getRuleContext(Tycl_contextContext.class,0);
		}
		public TerminalNode DoubleArrow() { return getToken(HaskellParser.DoubleArrow, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Tycl_hdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tycl_hdr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTycl_hdr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tycl_hdrContext tycl_hdr() throws RecognitionException {
		Tycl_hdrContext _localctx = new Tycl_hdrContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tycl_hdr);
		try {
			setState(1195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1190);
				tycl_context();
				setState(1191);
				match(DoubleArrow);
				setState(1192);
				type_();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1194);
				type_();
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

	public static class Tycl_hdr_instContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(HaskellParser.FORALL, 0); }
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public Tycl_contextContext tycl_context() {
			return getRuleContext(Tycl_contextContext.class,0);
		}
		public TerminalNode DoubleArrow() { return getToken(HaskellParser.DoubleArrow, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Tv_bndrsContext tv_bndrs() {
			return getRuleContext(Tv_bndrsContext.class,0);
		}
		public Tycl_hdr_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tycl_hdr_inst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTycl_hdr_inst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tycl_hdr_instContext tycl_hdr_inst() throws RecognitionException {
		Tycl_hdr_instContext _localctx = new Tycl_hdr_instContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tycl_hdr_inst);
		int _la;
		try {
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1197);
				match(FORALL);
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (OCURLY - 121)))) != 0)) {
					{
					setState(1198);
					tv_bndrs();
					}
				}

				setState(1201);
				match(Dot);
				setState(1202);
				tycl_context();
				setState(1203);
				match(DoubleArrow);
				setState(1204);
				type_();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1206);
				match(FORALL);
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (OCURLY - 121)))) != 0)) {
					{
					setState(1207);
					tv_bndrs();
					}
				}

				setState(1210);
				match(Dot);
				setState(1211);
				type_();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1212);
				tycl_context();
				setState(1213);
				match(DoubleArrow);
				setState(1214);
				type_();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1216);
				type_();
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

	public static class Capi_ctypeContext extends ParserRuleContext {
		public TerminalNode OpenPragmaBracket() { return getToken(HaskellParser.OpenPragmaBracket, 0); }
		public TerminalNode CTYPE() { return getToken(HaskellParser.CTYPE, 0); }
		public List<TerminalNode> STRING() { return getTokens(HaskellParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HaskellParser.STRING, i);
		}
		public TerminalNode ClosePragmaBracket() { return getToken(HaskellParser.ClosePragmaBracket, 0); }
		public Capi_ctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capi_ctype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCapi_ctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capi_ctypeContext capi_ctype() throws RecognitionException {
		Capi_ctypeContext _localctx = new Capi_ctypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_capi_ctype);
		try {
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1219);
				match(OpenPragmaBracket);
				setState(1220);
				match(CTYPE);
				setState(1221);
				match(STRING);
				setState(1222);
				match(STRING);
				setState(1223);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1224);
				match(OpenPragmaBracket);
				setState(1225);
				match(CTYPE);
				setState(1226);
				match(STRING);
				setState(1227);
				match(ClosePragmaBracket);
				}
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

	public static class Standalone_derivingContext extends ParserRuleContext {
		public TerminalNode DERIVING() { return getToken(HaskellParser.DERIVING, 0); }
		public TerminalNode INSTANCE() { return getToken(HaskellParser.INSTANCE, 0); }
		public Inst_typeContext inst_type() {
			return getRuleContext(Inst_typeContext.class,0);
		}
		public Deriv_standalone_strategyContext deriv_standalone_strategy() {
			return getRuleContext(Deriv_standalone_strategyContext.class,0);
		}
		public Overlap_pragmaContext overlap_pragma() {
			return getRuleContext(Overlap_pragmaContext.class,0);
		}
		public Standalone_derivingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone_deriving; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitStandalone_deriving(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standalone_derivingContext standalone_deriving() throws RecognitionException {
		Standalone_derivingContext _localctx = new Standalone_derivingContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_standalone_deriving);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(DERIVING);
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWTYPE) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0)) {
				{
				setState(1231);
				deriv_standalone_strategy();
				}
			}

			setState(1234);
			match(INSTANCE);
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1235);
				overlap_pragma();
				}
				break;
			}
			setState(1238);
			inst_type();
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

	public static class Role_annotContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HaskellParser.TYPE, 0); }
		public TerminalNode ROLE() { return getToken(HaskellParser.ROLE, 0); }
		public OqtyconContext oqtycon() {
			return getRuleContext(OqtyconContext.class,0);
		}
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public Role_annotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role_annot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRole_annot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Role_annotContext role_annot() throws RecognitionException {
		Role_annotContext _localctx = new Role_annotContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_role_annot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(TYPE);
			setState(1241);
			match(ROLE);
			setState(1242);
			oqtycon();
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==VARID) {
				{
				setState(1243);
				roles();
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

	public static class RolesContext extends ParserRuleContext {
		public List<RoleContext> role() {
			return getRuleContexts(RoleContext.class);
		}
		public RoleContext role(int i) {
			return getRuleContext(RoleContext.class,i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRoles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1246);
				role();
				}
				}
				setState(1249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==VARID );
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

	public static class RoleContext extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(HaskellParser.WILDCARD, 0); }
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_role);
		try {
			setState(1253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case HIDING:
			case QUALIFIED:
			case EXPORT:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case VARID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				varid();
				}
				break;
			case WILDCARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1252);
				match(WILDCARD);
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

	public static class Pattern_synonym_declContext extends ParserRuleContext {
		public TerminalNode PATTERN() { return getToken(HaskellParser.PATTERN, 0); }
		public Pattern_synonym_lhsContext pattern_synonym_lhs() {
			return getRuleContext(Pattern_synonym_lhsContext.class,0);
		}
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public TerminalNode Revarrow() { return getToken(HaskellParser.Revarrow, 0); }
		public Where_declsContext where_decls() {
			return getRuleContext(Where_declsContext.class,0);
		}
		public Pattern_synonym_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_synonym_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPattern_synonym_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_synonym_declContext pattern_synonym_decl() throws RecognitionException {
		Pattern_synonym_declContext _localctx = new Pattern_synonym_declContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_pattern_synonym_decl);
		int _la;
		try {
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1255);
				match(PATTERN);
				setState(1256);
				pattern_synonym_lhs();
				setState(1257);
				match(Eq);
				setState(1258);
				pat();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1260);
				match(PATTERN);
				setState(1261);
				pattern_synonym_lhs();
				setState(1262);
				match(Revarrow);
				setState(1263);
				pat();
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1264);
					where_decls();
					}
				}

				}
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

	public static class Pattern_synonym_lhsContext extends ParserRuleContext {
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public Vars_Context vars_() {
			return getRuleContext(Vars_Context.class,0);
		}
		public List<VaridContext> varid() {
			return getRuleContexts(VaridContext.class);
		}
		public VaridContext varid(int i) {
			return getRuleContext(VaridContext.class,i);
		}
		public ConopContext conop() {
			return getRuleContext(ConopContext.class,0);
		}
		public TerminalNode OCURLY() { return getToken(HaskellParser.OCURLY, 0); }
		public CvarsContext cvars() {
			return getRuleContext(CvarsContext.class,0);
		}
		public TerminalNode CCURLY() { return getToken(HaskellParser.CCURLY, 0); }
		public Pattern_synonym_lhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_synonym_lhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPattern_synonym_lhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_synonym_lhsContext pattern_synonym_lhs() throws RecognitionException {
		Pattern_synonym_lhsContext _localctx = new Pattern_synonym_lhsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_pattern_synonym_lhs);
		int _la;
		try {
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1269);
				con();
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==VARID) {
					{
					setState(1270);
					vars_();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1273);
				varid();
				setState(1274);
				conop();
				setState(1275);
				varid();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1277);
				con();
				setState(1278);
				match(OCURLY);
				setState(1279);
				cvars();
				setState(1280);
				match(CCURLY);
				}
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

	public static class Vars_Context extends ParserRuleContext {
		public List<VaridContext> varid() {
			return getRuleContexts(VaridContext.class);
		}
		public VaridContext varid(int i) {
			return getRuleContext(VaridContext.class,i);
		}
		public Vars_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVars_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vars_Context vars_() throws RecognitionException {
		Vars_Context _localctx = new Vars_Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_vars_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1284);
				varid();
				}
				}
				setState(1287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==VARID );
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

	public static class CvarsContext extends ParserRuleContext {
		public List<Var_Context> var_() {
			return getRuleContexts(Var_Context.class);
		}
		public Var_Context var_(int i) {
			return getRuleContext(Var_Context.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public CvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCvars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvarsContext cvars() throws RecognitionException {
		CvarsContext _localctx = new CvarsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cvars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			var_();
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1290);
				match(Comma);
				setState(1291);
				var_();
				}
				}
				setState(1296);
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

	public static class Where_declsContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public Where_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_decls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitWhere_decls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_declsContext where_decls() throws RecognitionException {
		Where_declsContext _localctx = new Where_declsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_where_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			match(WHERE);
			setState(1298);
			open_();
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << CASE) | (1L << DO) | (1L << HIDING) | (1L << IF) | (1L << INFIX) | (1L << INFIXL) | (1L << INFIXR) | (1L << LET) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << EXPORT) | (1L << MDO) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << PATTERN) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LCASE - 73)) | (1L << (Bang - 73)) | (1L << (Minus - 73)) | (1L << (Tilde - 73)) | (1L << (DDollar - 73)) | (1L << (Dollar - 73)) | (1L << (Semi - 73)) | (1L << (Quote - 73)) | (1L << (DoubleQuote - 73)) | (1L << (ReverseSlash - 73)) | (1L << (AopenParen - 73)) | (1L << (TopenTexpQuote - 73)) | (1L << (TopenExpQuote - 73)) | (1L << (TopenPatQuote - 73)) | (1L << (TopenTypQoute - 73)) | (1L << (TopenDecQoute - 73)) | (1L << (OpenBoxParen - 73)) | (1L << (OpenRoundBracket - 73)) | (1L << (OpenSquareBracket - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (VARID - 73)) | (1L << (CONID - 73)) | (1L << (OpenPragmaBracket - 73)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (SEMI - 137)) | (1L << (DECIMAL - 137)) | (1L << (OCTAL - 137)) | (1L << (HEXADECIMAL - 137)) | (1L << (FLOAT - 137)))) != 0)) {
				{
				setState(1299);
				decls();
				}
			}

			setState(1302);
			close();
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

	public static class Pattern_synonym_sigContext extends ParserRuleContext {
		public TerminalNode PATTERN() { return getToken(HaskellParser.PATTERN, 0); }
		public Con_listContext con_list() {
			return getRuleContext(Con_listContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public SigtypedocContext sigtypedoc() {
			return getRuleContext(SigtypedocContext.class,0);
		}
		public Pattern_synonym_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_synonym_sig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPattern_synonym_sig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_synonym_sigContext pattern_synonym_sig() throws RecognitionException {
		Pattern_synonym_sigContext _localctx = new Pattern_synonym_sigContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_pattern_synonym_sig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			match(PATTERN);
			setState(1305);
			con_list();
			setState(1306);
			match(DoubleColon);
			setState(1307);
			sigtypedoc();
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

	public static class Decl_clsContext extends ParserRuleContext {
		public At_decl_clsContext at_decl_cls() {
			return getRuleContext(At_decl_clsContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(HaskellParser.DEFAULT, 0); }
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public SigtypedocContext sigtypedoc() {
			return getRuleContext(SigtypedocContext.class,0);
		}
		public Decl_clsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_cls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecl_cls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_clsContext decl_cls() throws RecognitionException {
		Decl_clsContext _localctx = new Decl_clsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_decl_cls);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA:
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				at_decl_cls();
				}
				break;
			case AS:
			case CASE:
			case DO:
			case HIDING:
			case IF:
			case INFIX:
			case INFIXL:
			case INFIXR:
			case LET:
			case QUALIFIED:
			case WILDCARD:
			case EXPORT:
			case MDO:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case PATTERN:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case LCASE:
			case Bang:
			case Minus:
			case Tilde:
			case DDollar:
			case Dollar:
			case Semi:
			case Quote:
			case DoubleQuote:
			case ReverseSlash:
			case AopenParen:
			case TopenTexpQuote:
			case TopenExpQuote:
			case TopenPatQuote:
			case TopenTypQoute:
			case TopenDecQoute:
			case OpenBoxParen:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case CHAR:
			case STRING:
			case VARID:
			case CONID:
			case OpenPragmaBracket:
			case SEMI:
			case DECIMAL:
			case OCTAL:
			case HEXADECIMAL:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				decl();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1311);
				match(DEFAULT);
				setState(1312);
				infixexp();
				setState(1313);
				match(DoubleColon);
				setState(1314);
				sigtypedoc();
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

	public static class Decls_clsContext extends ParserRuleContext {
		public List<Decl_clsContext> decl_cls() {
			return getRuleContexts(Decl_clsContext.class);
		}
		public Decl_clsContext decl_cls(int i) {
			return getRuleContext(Decl_clsContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public Decls_clsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls_cls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecls_cls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decls_clsContext decls_cls() throws RecognitionException {
		Decls_clsContext _localctx = new Decls_clsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_decls_cls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			decl_cls();
			setState(1328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1320); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1319);
							semi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1322); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1324);
					decl_cls();
					}
					} 
				}
				setState(1330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi || _la==SEMI) {
				{
				{
				setState(1331);
				semi();
				}
				}
				setState(1336);
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

	public static class Decllist_clsContext extends ParserRuleContext {
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public Decls_clsContext decls_cls() {
			return getRuleContext(Decls_clsContext.class,0);
		}
		public Decllist_clsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decllist_cls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecllist_cls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decllist_clsContext decllist_cls() throws RecognitionException {
		Decllist_clsContext _localctx = new Decllist_clsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_decllist_cls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			open_();
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << CASE) | (1L << DATA) | (1L << DEFAULT) | (1L << DO) | (1L << HIDING) | (1L << IF) | (1L << INFIX) | (1L << INFIXL) | (1L << INFIXR) | (1L << LET) | (1L << QUALIFIED) | (1L << TYPE) | (1L << WILDCARD) | (1L << EXPORT) | (1L << MDO) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << PATTERN) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LCASE - 73)) | (1L << (Bang - 73)) | (1L << (Minus - 73)) | (1L << (Tilde - 73)) | (1L << (DDollar - 73)) | (1L << (Dollar - 73)) | (1L << (Semi - 73)) | (1L << (Quote - 73)) | (1L << (DoubleQuote - 73)) | (1L << (ReverseSlash - 73)) | (1L << (AopenParen - 73)) | (1L << (TopenTexpQuote - 73)) | (1L << (TopenExpQuote - 73)) | (1L << (TopenPatQuote - 73)) | (1L << (TopenTypQoute - 73)) | (1L << (TopenDecQoute - 73)) | (1L << (OpenBoxParen - 73)) | (1L << (OpenRoundBracket - 73)) | (1L << (OpenSquareBracket - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (VARID - 73)) | (1L << (CONID - 73)) | (1L << (OpenPragmaBracket - 73)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (SEMI - 137)) | (1L << (DECIMAL - 137)) | (1L << (OCTAL - 137)) | (1L << (HEXADECIMAL - 137)) | (1L << (FLOAT - 137)))) != 0)) {
				{
				setState(1338);
				decls_cls();
				}
			}

			setState(1341);
			close();
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

	public static class Where_clsContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public Decllist_clsContext decllist_cls() {
			return getRuleContext(Decllist_clsContext.class,0);
		}
		public Where_clsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_cls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitWhere_cls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clsContext where_cls() throws RecognitionException {
		Where_clsContext _localctx = new Where_clsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_where_cls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			match(WHERE);
			setState(1344);
			decllist_cls();
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

	public static class Decl_instContext extends ParserRuleContext {
		public At_decl_instContext at_decl_inst() {
			return getRuleContext(At_decl_instContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Decl_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_inst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecl_inst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_instContext decl_inst() throws RecognitionException {
		Decl_instContext _localctx = new Decl_instContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_decl_inst);
		try {
			setState(1348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA:
			case NEWTYPE:
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1346);
				at_decl_inst();
				}
				break;
			case AS:
			case CASE:
			case DO:
			case HIDING:
			case IF:
			case INFIX:
			case INFIXL:
			case INFIXR:
			case LET:
			case QUALIFIED:
			case WILDCARD:
			case EXPORT:
			case MDO:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case PATTERN:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case LCASE:
			case Bang:
			case Minus:
			case Tilde:
			case DDollar:
			case Dollar:
			case Semi:
			case Quote:
			case DoubleQuote:
			case ReverseSlash:
			case AopenParen:
			case TopenTexpQuote:
			case TopenExpQuote:
			case TopenPatQuote:
			case TopenTypQoute:
			case TopenDecQoute:
			case OpenBoxParen:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case CHAR:
			case STRING:
			case VARID:
			case CONID:
			case OpenPragmaBracket:
			case SEMI:
			case DECIMAL:
			case OCTAL:
			case HEXADECIMAL:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1347);
				decl();
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

	public static class Decls_instContext extends ParserRuleContext {
		public List<Decl_instContext> decl_inst() {
			return getRuleContexts(Decl_instContext.class);
		}
		public Decl_instContext decl_inst(int i) {
			return getRuleContext(Decl_instContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public Decls_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls_inst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecls_inst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decls_instContext decls_inst() throws RecognitionException {
		Decls_instContext _localctx = new Decls_instContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_decls_inst);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			decl_inst();
			setState(1360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1352); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1351);
							semi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1354); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1356);
					decl_inst();
					}
					} 
				}
				setState(1362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi || _la==SEMI) {
				{
				{
				setState(1363);
				semi();
				}
				}
				setState(1368);
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

	public static class Decllist_instContext extends ParserRuleContext {
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public Decls_instContext decls_inst() {
			return getRuleContext(Decls_instContext.class,0);
		}
		public Decllist_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decllist_inst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecllist_inst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decllist_instContext decllist_inst() throws RecognitionException {
		Decllist_instContext _localctx = new Decllist_instContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_decllist_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			open_();
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << CASE) | (1L << DATA) | (1L << DO) | (1L << HIDING) | (1L << IF) | (1L << INFIX) | (1L << INFIXL) | (1L << INFIXR) | (1L << LET) | (1L << NEWTYPE) | (1L << QUALIFIED) | (1L << TYPE) | (1L << WILDCARD) | (1L << EXPORT) | (1L << MDO) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << PATTERN) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LCASE - 73)) | (1L << (Bang - 73)) | (1L << (Minus - 73)) | (1L << (Tilde - 73)) | (1L << (DDollar - 73)) | (1L << (Dollar - 73)) | (1L << (Semi - 73)) | (1L << (Quote - 73)) | (1L << (DoubleQuote - 73)) | (1L << (ReverseSlash - 73)) | (1L << (AopenParen - 73)) | (1L << (TopenTexpQuote - 73)) | (1L << (TopenExpQuote - 73)) | (1L << (TopenPatQuote - 73)) | (1L << (TopenTypQoute - 73)) | (1L << (TopenDecQoute - 73)) | (1L << (OpenBoxParen - 73)) | (1L << (OpenRoundBracket - 73)) | (1L << (OpenSquareBracket - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (VARID - 73)) | (1L << (CONID - 73)) | (1L << (OpenPragmaBracket - 73)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (SEMI - 137)) | (1L << (DECIMAL - 137)) | (1L << (OCTAL - 137)) | (1L << (HEXADECIMAL - 137)) | (1L << (FLOAT - 137)))) != 0)) {
				{
				setState(1370);
				decls_inst();
				}
			}

			setState(1373);
			close();
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

	public static class Where_instContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public Decllist_instContext decllist_inst() {
			return getRuleContext(Decllist_instContext.class,0);
		}
		public Where_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_inst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitWhere_inst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_instContext where_inst() throws RecognitionException {
		Where_instContext _localctx = new Where_instContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_where_inst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(WHERE);
			setState(1376);
			decllist_inst();
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

	public static class DeclsContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_decls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			decl();
			setState(1388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1380); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1379);
							semi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1382); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1384);
					decl();
					}
					} 
				}
				setState(1390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi || _la==SEMI) {
				{
				{
				setState(1391);
				semi();
				}
				}
				setState(1396);
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

	public static class DecllistContext extends ParserRuleContext {
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public DecllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decllist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecllistContext decllist() throws RecognitionException {
		DecllistContext _localctx = new DecllistContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_decllist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			open_();
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << CASE) | (1L << DO) | (1L << HIDING) | (1L << IF) | (1L << INFIX) | (1L << INFIXL) | (1L << INFIXR) | (1L << LET) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << EXPORT) | (1L << MDO) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << PATTERN) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LCASE - 73)) | (1L << (Bang - 73)) | (1L << (Minus - 73)) | (1L << (Tilde - 73)) | (1L << (DDollar - 73)) | (1L << (Dollar - 73)) | (1L << (Semi - 73)) | (1L << (Quote - 73)) | (1L << (DoubleQuote - 73)) | (1L << (ReverseSlash - 73)) | (1L << (AopenParen - 73)) | (1L << (TopenTexpQuote - 73)) | (1L << (TopenExpQuote - 73)) | (1L << (TopenPatQuote - 73)) | (1L << (TopenTypQoute - 73)) | (1L << (TopenDecQoute - 73)) | (1L << (OpenBoxParen - 73)) | (1L << (OpenRoundBracket - 73)) | (1L << (OpenSquareBracket - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (VARID - 73)) | (1L << (CONID - 73)) | (1L << (OpenPragmaBracket - 73)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (SEMI - 137)) | (1L << (DECIMAL - 137)) | (1L << (OCTAL - 137)) | (1L << (HEXADECIMAL - 137)) | (1L << (FLOAT - 137)))) != 0)) {
				{
				setState(1398);
				decls();
				}
			}

			setState(1401);
			close();
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

	public static class BindsContext extends ParserRuleContext {
		public DecllistContext decllist() {
			return getRuleContext(DecllistContext.class,0);
		}
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public DbindsContext dbinds() {
			return getRuleContext(DbindsContext.class,0);
		}
		public BindsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitBinds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindsContext binds() throws RecognitionException {
		BindsContext _localctx = new BindsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_binds);
		int _la;
		try {
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1403);
				decllist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1404);
				open_();
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==VARID) {
					{
					setState(1405);
					dbinds();
					}
				}

				setState(1408);
				close();
				}
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

	public static class WherebindsContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public BindsContext binds() {
			return getRuleContext(BindsContext.class,0);
		}
		public WherebindsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wherebinds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitWherebinds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WherebindsContext wherebinds() throws RecognitionException {
		WherebindsContext _localctx = new WherebindsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_wherebinds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(WHERE);
			setState(1413);
			binds();
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

	public static class RulesContext extends ParserRuleContext {
		public List<Pragma_ruleContext> pragma_rule() {
			return getRuleContexts(Pragma_ruleContext.class);
		}
		public Pragma_ruleContext pragma_rule(int i) {
			return getRuleContext(Pragma_ruleContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_rules);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			pragma_rule();
			setState(1421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1416);
					semi();
					setState(1417);
					pragma_rule();
					}
					} 
				}
				setState(1423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi || _la==SEMI) {
				{
				setState(1424);
				semi();
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

	public static class Pragma_ruleContext extends ParserRuleContext {
		public PstringContext pstring() {
			return getRuleContext(PstringContext.class,0);
		}
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Rule_activationContext rule_activation() {
			return getRuleContext(Rule_activationContext.class,0);
		}
		public Rule_forallsContext rule_foralls() {
			return getRuleContext(Rule_forallsContext.class,0);
		}
		public Pragma_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_rule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPragma_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_ruleContext pragma_rule() throws RecognitionException {
		Pragma_ruleContext _localctx = new Pragma_ruleContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_pragma_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			pstring();
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1428);
				rule_activation();
				}
				break;
			}
			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(1431);
				rule_foralls();
				}
			}

			setState(1434);
			infixexp();
			setState(1435);
			match(Eq);
			setState(1436);
			exp();
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

	public static class Rule_activation_markerContext extends ParserRuleContext {
		public TerminalNode Tilde() { return getToken(HaskellParser.Tilde, 0); }
		public VarsymContext varsym() {
			return getRuleContext(VarsymContext.class,0);
		}
		public Rule_activation_markerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_activation_marker; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRule_activation_marker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_activation_markerContext rule_activation_marker() throws RecognitionException {
		Rule_activation_markerContext _localctx = new Rule_activation_markerContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_rule_activation_marker);
		try {
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1438);
				match(Tilde);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				varsym();
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

	public static class Rule_activationContext extends ParserRuleContext {
		public TerminalNode OpenSquareBracket() { return getToken(HaskellParser.OpenSquareBracket, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode CloseSquareBracket() { return getToken(HaskellParser.CloseSquareBracket, 0); }
		public Rule_activation_markerContext rule_activation_marker() {
			return getRuleContext(Rule_activation_markerContext.class,0);
		}
		public Rule_activationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_activation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRule_activation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_activationContext rule_activation() throws RecognitionException {
		Rule_activationContext _localctx = new Rule_activationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_rule_activation);
		try {
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1442);
				match(OpenSquareBracket);
				setState(1443);
				integer();
				setState(1444);
				match(CloseSquareBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1446);
				match(OpenSquareBracket);
				setState(1447);
				rule_activation_marker();
				setState(1448);
				integer();
				setState(1449);
				match(CloseSquareBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1451);
				match(OpenSquareBracket);
				setState(1452);
				rule_activation_marker();
				setState(1453);
				match(CloseSquareBracket);
				}
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

	public static class Rule_forallsContext extends ParserRuleContext {
		public List<TerminalNode> FORALL() { return getTokens(HaskellParser.FORALL); }
		public TerminalNode FORALL(int i) {
			return getToken(HaskellParser.FORALL, i);
		}
		public List<TerminalNode> Dot() { return getTokens(HaskellParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(HaskellParser.Dot, i);
		}
		public List<Rule_varsContext> rule_vars() {
			return getRuleContexts(Rule_varsContext.class);
		}
		public Rule_varsContext rule_vars(int i) {
			return getRuleContext(Rule_varsContext.class,i);
		}
		public Rule_forallsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_foralls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRule_foralls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_forallsContext rule_foralls() throws RecognitionException {
		Rule_forallsContext _localctx = new Rule_forallsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_rule_foralls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1457);
			match(FORALL);
			setState(1459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==OpenRoundBracket || _la==VARID) {
				{
				setState(1458);
				rule_vars();
				}
			}

			setState(1461);
			match(Dot);
			setState(1467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(1462);
				match(FORALL);
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==OpenRoundBracket || _la==VARID) {
					{
					setState(1463);
					rule_vars();
					}
				}

				setState(1466);
				match(Dot);
				}
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

	public static class Rule_varsContext extends ParserRuleContext {
		public List<Rule_varContext> rule_var() {
			return getRuleContexts(Rule_varContext.class);
		}
		public Rule_varContext rule_var(int i) {
			return getRuleContext(Rule_varContext.class,i);
		}
		public Rule_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRule_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_varsContext rule_vars() throws RecognitionException {
		Rule_varsContext _localctx = new Rule_varsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_rule_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1469);
				rule_var();
				}
				}
				setState(1472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==OpenRoundBracket || _la==VARID );
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

	public static class Rule_varContext extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public CtypeContext ctype() {
			return getRuleContext(CtypeContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public Rule_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRule_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_varContext rule_var() throws RecognitionException {
		Rule_varContext _localctx = new Rule_varContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_rule_var);
		try {
			setState(1481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case HIDING:
			case QUALIFIED:
			case EXPORT:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case VARID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1474);
				varid();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1475);
				match(OpenRoundBracket);
				setState(1476);
				varid();
				setState(1477);
				match(DoubleColon);
				setState(1478);
				ctype();
				setState(1479);
				match(CloseRoundBracket);
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

	public static class WarningsContext extends ParserRuleContext {
		public List<Pragma_warningContext> pragma_warning() {
			return getRuleContexts(Pragma_warningContext.class);
		}
		public Pragma_warningContext pragma_warning(int i) {
			return getRuleContext(Pragma_warningContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public WarningsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_warnings; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitWarnings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WarningsContext warnings() throws RecognitionException {
		WarningsContext _localctx = new WarningsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_warnings);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			pragma_warning();
			setState(1489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1484);
					semi();
					setState(1485);
					pragma_warning();
					}
					} 
				}
				setState(1491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi || _la==SEMI) {
				{
				setState(1492);
				semi();
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

	public static class Pragma_warningContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public Pragma_warningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_warning; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPragma_warning(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_warningContext pragma_warning() throws RecognitionException {
		Pragma_warningContext _localctx = new Pragma_warningContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_pragma_warning);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			namelist();
			setState(1496);
			strings();
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

	public static class DeprecationsContext extends ParserRuleContext {
		public List<Pragma_deprecationContext> pragma_deprecation() {
			return getRuleContexts(Pragma_deprecationContext.class);
		}
		public Pragma_deprecationContext pragma_deprecation(int i) {
			return getRuleContext(Pragma_deprecationContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public DeprecationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deprecations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDeprecations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeprecationsContext deprecations() throws RecognitionException {
		DeprecationsContext _localctx = new DeprecationsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_deprecations);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			pragma_deprecation();
			setState(1504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1499);
					semi();
					setState(1500);
					pragma_deprecation();
					}
					} 
				}
				setState(1506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi || _la==SEMI) {
				{
				setState(1507);
				semi();
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

	public static class Pragma_deprecationContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public Pragma_deprecationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_deprecation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPragma_deprecation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_deprecationContext pragma_deprecation() throws RecognitionException {
		Pragma_deprecationContext _localctx = new Pragma_deprecationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_pragma_deprecation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			namelist();
			setState(1511);
			strings();
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

	public static class StringsContext extends ParserRuleContext {
		public PstringContext pstring() {
			return getRuleContext(PstringContext.class,0);
		}
		public TerminalNode OpenSquareBracket() { return getToken(HaskellParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(HaskellParser.CloseSquareBracket, 0); }
		public StringlistContext stringlist() {
			return getRuleContext(StringlistContext.class,0);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_strings);
		int _la;
		try {
			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513);
				pstring();
				}
				break;
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1514);
				match(OpenSquareBracket);
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1515);
					stringlist();
					}
				}

				setState(1518);
				match(CloseSquareBracket);
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

	public static class StringlistContext extends ParserRuleContext {
		public List<PstringContext> pstring() {
			return getRuleContexts(PstringContext.class);
		}
		public PstringContext pstring(int i) {
			return getRuleContext(PstringContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public StringlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitStringlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringlistContext stringlist() throws RecognitionException {
		StringlistContext _localctx = new StringlistContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_stringlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			pstring();
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1522);
				match(Comma);
				setState(1523);
				pstring();
				}
				}
				setState(1528);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode OpenPragmaBracket() { return getToken(HaskellParser.OpenPragmaBracket, 0); }
		public TerminalNode ANN() { return getToken(HaskellParser.ANN, 0); }
		public Name_varContext name_var() {
			return getRuleContext(Name_varContext.class,0);
		}
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public TerminalNode ClosePragmaBracket() { return getToken(HaskellParser.ClosePragmaBracket, 0); }
		public TyconContext tycon() {
			return getRuleContext(TyconContext.class,0);
		}
		public TerminalNode MODULE() { return getToken(HaskellParser.MODULE, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_annotation);
		try {
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1529);
				match(OpenPragmaBracket);
				setState(1530);
				match(ANN);
				setState(1531);
				name_var();
				setState(1532);
				aexp();
				setState(1533);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1535);
				match(OpenPragmaBracket);
				setState(1536);
				match(ANN);
				setState(1537);
				tycon();
				setState(1538);
				aexp();
				setState(1539);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1541);
				match(OpenPragmaBracket);
				setState(1542);
				match(ANN);
				setState(1543);
				match(MODULE);
				setState(1544);
				aexp();
				setState(1545);
				match(ClosePragmaBracket);
				}
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

	public static class FdeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(HaskellParser.IMPORT, 0); }
		public CallconvContext callconv() {
			return getRuleContext(CallconvContext.class,0);
		}
		public FspecContext fspec() {
			return getRuleContext(FspecContext.class,0);
		}
		public SafetyContext safety() {
			return getRuleContext(SafetyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(HaskellParser.EXPORT, 0); }
		public FdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FdeclContext fdecl() throws RecognitionException {
		FdeclContext _localctx = new FdeclContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_fdecl);
		int _la;
		try {
			setState(1560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1549);
				match(IMPORT);
				setState(1550);
				callconv();
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SAFE) | (1L << INTERRUPTIBLE) | (1L << UNSAFE))) != 0)) {
					{
					setState(1551);
					safety();
					}
				}

				setState(1554);
				fspec();
				}
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1556);
				match(EXPORT);
				setState(1557);
				callconv();
				setState(1558);
				fspec();
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

	public static class CallconvContext extends ParserRuleContext {
		public TerminalNode CCALL() { return getToken(HaskellParser.CCALL, 0); }
		public TerminalNode STDCALL() { return getToken(HaskellParser.STDCALL, 0); }
		public TerminalNode CPPCALL() { return getToken(HaskellParser.CPPCALL, 0); }
		public TerminalNode JSCALL() { return getToken(HaskellParser.JSCALL, 0); }
		public CallconvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callconv; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCallconv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallconvContext callconv() throws RecognitionException {
		CallconvContext _localctx = new CallconvContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_callconv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STDCALL) | (1L << CCALL) | (1L << CPPCALL) | (1L << JSCALL))) != 0)) ) {
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

	public static class SafetyContext extends ParserRuleContext {
		public TerminalNode UNSAFE() { return getToken(HaskellParser.UNSAFE, 0); }
		public TerminalNode SAFE() { return getToken(HaskellParser.SAFE, 0); }
		public TerminalNode INTERRUPTIBLE() { return getToken(HaskellParser.INTERRUPTIBLE, 0); }
		public SafetyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safety; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSafety(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafetyContext safety() throws RecognitionException {
		SafetyContext _localctx = new SafetyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_safety);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SAFE) | (1L << INTERRUPTIBLE) | (1L << UNSAFE))) != 0)) ) {
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

	public static class FspecContext extends ParserRuleContext {
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public SigtypedocContext sigtypedoc() {
			return getRuleContext(SigtypedocContext.class,0);
		}
		public PstringContext pstring() {
			return getRuleContext(PstringContext.class,0);
		}
		public FspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fspec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFspec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FspecContext fspec() throws RecognitionException {
		FspecContext _localctx = new FspecContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_fspec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(1566);
				pstring();
				}
			}

			setState(1569);
			var_();
			setState(1570);
			match(DoubleColon);
			setState(1571);
			sigtypedoc();
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

	public static class Opt_sigContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public SigtypeContext sigtype() {
			return getRuleContext(SigtypeContext.class,0);
		}
		public Opt_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_sig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOpt_sig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_sigContext opt_sig() throws RecognitionException {
		Opt_sigContext _localctx = new Opt_sigContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_opt_sig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(DoubleColon);
			setState(1574);
			sigtype();
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

	public static class Opt_tyconsigContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public GtyconContext gtycon() {
			return getRuleContext(GtyconContext.class,0);
		}
		public Opt_tyconsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_tyconsig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOpt_tyconsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_tyconsigContext opt_tyconsig() throws RecognitionException {
		Opt_tyconsigContext _localctx = new Opt_tyconsigContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_opt_tyconsig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			match(DoubleColon);
			setState(1577);
			gtycon();
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

	public static class SigtypeContext extends ParserRuleContext {
		public CtypeContext ctype() {
			return getRuleContext(CtypeContext.class,0);
		}
		public SigtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sigtype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSigtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SigtypeContext sigtype() throws RecognitionException {
		SigtypeContext _localctx = new SigtypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_sigtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			ctype();
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

	public static class SigtypedocContext extends ParserRuleContext {
		public CtypedocContext ctypedoc() {
			return getRuleContext(CtypedocContext.class,0);
		}
		public SigtypedocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sigtypedoc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSigtypedoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SigtypedocContext sigtypedoc() throws RecognitionException {
		SigtypedocContext _localctx = new SigtypedocContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_sigtypedoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			ctypedoc();
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

	public static class Sig_varsContext extends ParserRuleContext {
		public List<Var_Context> var_() {
			return getRuleContexts(Var_Context.class);
		}
		public Var_Context var_(int i) {
			return getRuleContext(Var_Context.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public Sig_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sig_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSig_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sig_varsContext sig_vars() throws RecognitionException {
		Sig_varsContext _localctx = new Sig_varsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_sig_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			var_();
			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1584);
				match(Comma);
				setState(1585);
				var_();
				}
				}
				setState(1590);
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

	public static class Sigtypes1Context extends ParserRuleContext {
		public List<SigtypeContext> sigtype() {
			return getRuleContexts(SigtypeContext.class);
		}
		public SigtypeContext sigtype(int i) {
			return getRuleContext(SigtypeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public Sigtypes1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sigtypes1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSigtypes1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sigtypes1Context sigtypes1() throws RecognitionException {
		Sigtypes1Context _localctx = new Sigtypes1Context(_ctx, getState());
		enterRule(_localctx, 184, RULE_sigtypes1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			sigtype();
			setState(1596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1592);
				match(Comma);
				setState(1593);
				sigtype();
				}
				}
				setState(1598);
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

	public static class UnpackednessContext extends ParserRuleContext {
		public TerminalNode OpenPragmaBracket() { return getToken(HaskellParser.OpenPragmaBracket, 0); }
		public TerminalNode UNPACK() { return getToken(HaskellParser.UNPACK, 0); }
		public TerminalNode ClosePragmaBracket() { return getToken(HaskellParser.ClosePragmaBracket, 0); }
		public TerminalNode NOUNPACK() { return getToken(HaskellParser.NOUNPACK, 0); }
		public UnpackednessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedness; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitUnpackedness(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpackednessContext unpackedness() throws RecognitionException {
		UnpackednessContext _localctx = new UnpackednessContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_unpackedness);
		try {
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1599);
				match(OpenPragmaBracket);
				setState(1600);
				match(UNPACK);
				setState(1601);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1602);
				match(OpenPragmaBracket);
				setState(1603);
				match(NOUNPACK);
				setState(1604);
				match(ClosePragmaBracket);
				}
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

	public static class Forall_vis_flagContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public TerminalNode Arrow() { return getToken(HaskellParser.Arrow, 0); }
		public Forall_vis_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forall_vis_flag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitForall_vis_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forall_vis_flagContext forall_vis_flag() throws RecognitionException {
		Forall_vis_flagContext _localctx = new Forall_vis_flagContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_forall_vis_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			_la = _input.LA(1);
			if ( !(_la==Arrow || _la==Dot) ) {
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

	public static class KtypeContext extends ParserRuleContext {
		public CtypeContext ctype() {
			return getRuleContext(CtypeContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public KtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ktype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitKtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KtypeContext ktype() throws RecognitionException {
		KtypeContext _localctx = new KtypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_ktype);
		try {
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				ctype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1610);
				ctype();
				setState(1611);
				match(DoubleColon);
				setState(1612);
				kind();
				}
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

	public static class KtypedocContext extends ParserRuleContext {
		public CtypedocContext ctypedoc() {
			return getRuleContext(CtypedocContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public KtypedocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ktypedoc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitKtypedoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KtypedocContext ktypedoc() throws RecognitionException {
		KtypedocContext _localctx = new KtypedocContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_ktypedoc);
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1616);
				ctypedoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1617);
				ctypedoc();
				setState(1618);
				match(DoubleColon);
				setState(1619);
				kind();
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

	public static class CtypeContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(HaskellParser.FORALL, 0); }
		public Forall_vis_flagContext forall_vis_flag() {
			return getRuleContext(Forall_vis_flagContext.class,0);
		}
		public CtypeContext ctype() {
			return getRuleContext(CtypeContext.class,0);
		}
		public Tv_bndrsContext tv_bndrs() {
			return getRuleContext(Tv_bndrsContext.class,0);
		}
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TerminalNode DoubleArrow() { return getToken(HaskellParser.DoubleArrow, 0); }
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public CtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtypeContext ctype() throws RecognitionException {
		CtypeContext _localctx = new CtypeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_ctype);
		int _la;
		try {
			setState(1639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1623);
				match(FORALL);
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (OCURLY - 121)))) != 0)) {
					{
					setState(1624);
					tv_bndrs();
					}
				}

				setState(1627);
				forall_vis_flag();
				setState(1628);
				ctype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1630);
				btype();
				setState(1631);
				match(DoubleArrow);
				setState(1632);
				ctype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1634);
				var_();
				setState(1635);
				match(DoubleColon);
				setState(1636);
				type_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1638);
				type_();
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

	public static class CtypedocContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(HaskellParser.FORALL, 0); }
		public Forall_vis_flagContext forall_vis_flag() {
			return getRuleContext(Forall_vis_flagContext.class,0);
		}
		public CtypedocContext ctypedoc() {
			return getRuleContext(CtypedocContext.class,0);
		}
		public Tv_bndrsContext tv_bndrs() {
			return getRuleContext(Tv_bndrsContext.class,0);
		}
		public Tycl_contextContext tycl_context() {
			return getRuleContext(Tycl_contextContext.class,0);
		}
		public TerminalNode DoubleArrow() { return getToken(HaskellParser.DoubleArrow, 0); }
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypedocContext typedoc() {
			return getRuleContext(TypedocContext.class,0);
		}
		public CtypedocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctypedoc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCtypedoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtypedocContext ctypedoc() throws RecognitionException {
		CtypedocContext _localctx = new CtypedocContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_ctypedoc);
		int _la;
		try {
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1641);
				match(FORALL);
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (OCURLY - 121)))) != 0)) {
					{
					setState(1642);
					tv_bndrs();
					}
				}

				setState(1645);
				forall_vis_flag();
				setState(1646);
				ctypedoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
				tycl_context();
				setState(1649);
				match(DoubleArrow);
				setState(1650);
				ctypedoc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1652);
				var_();
				setState(1653);
				match(DoubleColon);
				setState(1654);
				type_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1656);
				typedoc();
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

	public static class Tycl_contextContext extends ParserRuleContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public Tycl_contextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tycl_context; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTycl_context(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tycl_contextContext tycl_context() throws RecognitionException {
		Tycl_contextContext _localctx = new Tycl_contextContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_tycl_context);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			btype();
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

	public static class Constr_contextContext extends ParserRuleContext {
		public Constr_btypeContext constr_btype() {
			return getRuleContext(Constr_btypeContext.class,0);
		}
		public Constr_contextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_context; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConstr_context(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_contextContext constr_context() throws RecognitionException {
		Constr_contextContext _localctx = new Constr_contextContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_constr_context);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			constr_btype();
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

	public static class Type_Context extends ParserRuleContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(HaskellParser.Arrow, 0); }
		public CtypeContext ctype() {
			return getRuleContext(CtypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 202, RULE_type_);
		try {
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				btype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664);
				btype();
				setState(1665);
				match(Arrow);
				setState(1666);
				ctype();
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

	public static class TypedocContext extends ParserRuleContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(HaskellParser.Arrow, 0); }
		public CtypedocContext ctypedoc() {
			return getRuleContext(CtypedocContext.class,0);
		}
		public TypedocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedoc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTypedoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedocContext typedoc() throws RecognitionException {
		TypedocContext _localctx = new TypedocContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_typedoc);
		try {
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1670);
				btype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1671);
				btype();
				setState(1672);
				match(Arrow);
				setState(1673);
				ctypedoc();
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

	public static class Constr_btypeContext extends ParserRuleContext {
		public Constr_tyappsContext constr_tyapps() {
			return getRuleContext(Constr_tyappsContext.class,0);
		}
		public Constr_btypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_btype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConstr_btype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_btypeContext constr_btype() throws RecognitionException {
		Constr_btypeContext _localctx = new Constr_btypeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_constr_btype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			constr_tyapps();
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

	public static class Constr_tyappsContext extends ParserRuleContext {
		public List<Constr_tyappContext> constr_tyapp() {
			return getRuleContexts(Constr_tyappContext.class);
		}
		public Constr_tyappContext constr_tyapp(int i) {
			return getRuleContext(Constr_tyappContext.class,i);
		}
		public Constr_tyappsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_tyapps; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConstr_tyapps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_tyappsContext constr_tyapps() throws RecognitionException {
		Constr_tyappsContext _localctx = new Constr_tyappsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_constr_tyapps);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1680); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1679);
					constr_tyapp();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1682); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
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

	public static class Constr_tyappContext extends ParserRuleContext {
		public TyappContext tyapp() {
			return getRuleContext(TyappContext.class,0);
		}
		public Constr_tyappContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_tyapp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConstr_tyapp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_tyappContext constr_tyapp() throws RecognitionException {
		Constr_tyappContext _localctx = new Constr_tyappContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constr_tyapp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			tyapp();
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

	public static class BtypeContext extends ParserRuleContext {
		public TyappsContext tyapps() {
			return getRuleContext(TyappsContext.class,0);
		}
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitBtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_btype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			tyapps();
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

	public static class TyappsContext extends ParserRuleContext {
		public List<TyappContext> tyapp() {
			return getRuleContexts(TyappContext.class);
		}
		public TyappContext tyapp(int i) {
			return getRuleContext(TyappContext.class,i);
		}
		public TyappsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyapps; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTyapps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyappsContext tyapps() throws RecognitionException {
		TyappsContext _localctx = new TyappsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_tyapps);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1689); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1688);
					tyapp();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1691); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
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

	public static class TyappContext extends ParserRuleContext {
		public AtypeContext atype() {
			return getRuleContext(AtypeContext.class,0);
		}
		public TerminalNode Atsign() { return getToken(HaskellParser.Atsign, 0); }
		public QtyconopContext qtyconop() {
			return getRuleContext(QtyconopContext.class,0);
		}
		public TyvaropContext tyvarop() {
			return getRuleContext(TyvaropContext.class,0);
		}
		public TerminalNode Quote() { return getToken(HaskellParser.Quote, 0); }
		public QconopContext qconop() {
			return getRuleContext(QconopContext.class,0);
		}
		public VaropContext varop() {
			return getRuleContext(VaropContext.class,0);
		}
		public UnpackednessContext unpackedness() {
			return getRuleContext(UnpackednessContext.class,0);
		}
		public TyappContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyapp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTyapp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyappContext tyapp() throws RecognitionException {
		TyappContext _localctx = new TyappContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_tyapp);
		try {
			setState(1703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				atype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1694);
				match(Atsign);
				setState(1695);
				atype();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1696);
				qtyconop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1697);
				tyvarop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1698);
				match(Quote);
				setState(1699);
				qconop();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1700);
				match(Quote);
				setState(1701);
				varop();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1702);
				unpackedness();
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

	public static class AtypeContext extends ParserRuleContext {
		public NtgtyconContext ntgtycon() {
			return getRuleContext(NtgtyconContext.class,0);
		}
		public TyvarContext tyvar() {
			return getRuleContext(TyvarContext.class,0);
		}
		public TerminalNode Asterisk() { return getToken(HaskellParser.Asterisk, 0); }
		public TerminalNode Tilde() { return getToken(HaskellParser.Tilde, 0); }
		public AtypeContext atype() {
			return getRuleContext(AtypeContext.class,0);
		}
		public TerminalNode Bang() { return getToken(HaskellParser.Bang, 0); }
		public TerminalNode OCURLY() { return getToken(HaskellParser.OCURLY, 0); }
		public TerminalNode CCURLY() { return getToken(HaskellParser.CCURLY, 0); }
		public FielddeclsContext fielddecls() {
			return getRuleContext(FielddeclsContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public KtypeContext ktype() {
			return getRuleContext(KtypeContext.class,0);
		}
		public TerminalNode Comma() { return getToken(HaskellParser.Comma, 0); }
		public Comma_typesContext comma_types() {
			return getRuleContext(Comma_typesContext.class,0);
		}
		public TerminalNode OpenBoxParen() { return getToken(HaskellParser.OpenBoxParen, 0); }
		public TerminalNode CloseBoxParen() { return getToken(HaskellParser.CloseBoxParen, 0); }
		public Bar_types2Context bar_types2() {
			return getRuleContext(Bar_types2Context.class,0);
		}
		public TerminalNode OpenSquareBracket() { return getToken(HaskellParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(HaskellParser.CloseSquareBracket, 0); }
		public QuasiquoteContext quasiquote() {
			return getRuleContext(QuasiquoteContext.class,0);
		}
		public Splice_untypedContext splice_untyped() {
			return getRuleContext(Splice_untypedContext.class,0);
		}
		public TerminalNode Quote() { return getToken(HaskellParser.Quote, 0); }
		public Qcon_nowiredlistContext qcon_nowiredlist() {
			return getRuleContext(Qcon_nowiredlistContext.class,0);
		}
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PstringContext pstring() {
			return getRuleContext(PstringContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(HaskellParser.WILDCARD, 0); }
		public AtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtypeContext atype() throws RecognitionException {
		AtypeContext _localctx = new AtypeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_atype);
		int _la;
		try {
			setState(1771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1705);
				ntgtycon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1706);
				tyvar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1707);
				match(Asterisk);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1708);
				match(Tilde);
				setState(1709);
				atype();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1710);
				match(Bang);
				setState(1711);
				atype();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1712);
				match(OCURLY);
				setState(1714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==OpenRoundBracket || _la==VARID) {
					{
					setState(1713);
					fielddecls();
					}
				}

				setState(1716);
				match(CCURLY);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1717);
				match(OpenRoundBracket);
				setState(1718);
				match(CloseRoundBracket);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1719);
				match(OpenRoundBracket);
				setState(1720);
				ktype();
				setState(1721);
				match(Comma);
				setState(1722);
				comma_types();
				setState(1723);
				match(CloseRoundBracket);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1725);
				match(OpenBoxParen);
				setState(1726);
				match(CloseBoxParen);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1727);
				match(OpenBoxParen);
				setState(1728);
				comma_types();
				setState(1729);
				match(CloseBoxParen);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(1731);
				match(OpenBoxParen);
				setState(1732);
				bar_types2();
				setState(1733);
				match(CloseBoxParen);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(1735);
				match(OpenSquareBracket);
				setState(1736);
				ktype();
				setState(1737);
				match(CloseSquareBracket);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(1739);
				match(OpenRoundBracket);
				setState(1740);
				ktype();
				setState(1741);
				match(CloseRoundBracket);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1743);
				quasiquote();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1744);
				splice_untyped();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(1745);
				match(Quote);
				setState(1746);
				qcon_nowiredlist();
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(1747);
				match(Quote);
				setState(1748);
				match(OpenRoundBracket);
				setState(1749);
				ktype();
				setState(1750);
				match(Comma);
				setState(1751);
				comma_types();
				setState(1752);
				match(CloseRoundBracket);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				{
				setState(1754);
				match(Quote);
				setState(1755);
				match(OpenSquareBracket);
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << FORALL) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (Hash - 82)) | (1L << (Less - 82)) | (1L << (Greater - 82)) | (1L << (Ampersand - 82)) | (1L << (Pipe - 82)) | (1L << (Bang - 82)) | (1L << (Caret - 82)) | (1L << (Plus - 82)) | (1L << (Minus - 82)) | (1L << (Asterisk - 82)) | (1L << (Percent - 82)) | (1L << (Divide - 82)) | (1L << (Tilde - 82)) | (1L << (Atsign - 82)) | (1L << (Dollar - 82)) | (1L << (Dot - 82)) | (1L << (QuestionMark - 82)) | (1L << (Colon - 82)) | (1L << (Eq - 82)) | (1L << (Equal - 82)) | (1L << (Quote - 82)) | (1L << (ReverseSlash - 82)) | (1L << (BackQuote - 82)) | (1L << (OpenBoxParen - 82)) | (1L << (OpenRoundBracket - 82)) | (1L << (OpenSquareBracket - 82)) | (1L << (STRING - 82)) | (1L << (VARID - 82)) | (1L << (CONID - 82)) | (1L << (OpenPragmaBracket - 82)) | (1L << (OCURLY - 82)) | (1L << (DECIMAL - 82)) | (1L << (OCTAL - 82)) | (1L << (HEXADECIMAL - 82)))) != 0)) {
					{
					setState(1756);
					comma_types();
					}
				}

				setState(1759);
				match(CloseSquareBracket);
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				{
				setState(1760);
				match(Quote);
				setState(1761);
				var_();
				}
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				{
				setState(1762);
				match(OpenSquareBracket);
				setState(1763);
				ktype();
				setState(1764);
				match(Comma);
				setState(1765);
				comma_types();
				setState(1766);
				match(CloseSquareBracket);
				}
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1768);
				integer();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1769);
				pstring();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1770);
				match(WILDCARD);
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

	public static class Inst_typeContext extends ParserRuleContext {
		public SigtypeContext sigtype() {
			return getRuleContext(SigtypeContext.class,0);
		}
		public Inst_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitInst_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_typeContext inst_type() throws RecognitionException {
		Inst_typeContext _localctx = new Inst_typeContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_inst_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			sigtype();
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

	public static class Deriv_typesContext extends ParserRuleContext {
		public List<KtypedocContext> ktypedoc() {
			return getRuleContexts(KtypedocContext.class);
		}
		public KtypedocContext ktypedoc(int i) {
			return getRuleContext(KtypedocContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public Deriv_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriv_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDeriv_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deriv_typesContext deriv_types() throws RecognitionException {
		Deriv_typesContext _localctx = new Deriv_typesContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_deriv_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			ktypedoc();
			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1776);
				match(Comma);
				setState(1777);
				ktypedoc();
				}
				}
				setState(1782);
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

	public static class Comma_typesContext extends ParserRuleContext {
		public List<KtypeContext> ktype() {
			return getRuleContexts(KtypeContext.class);
		}
		public KtypeContext ktype(int i) {
			return getRuleContext(KtypeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public Comma_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitComma_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_typesContext comma_types() throws RecognitionException {
		Comma_typesContext _localctx = new Comma_typesContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_comma_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			ktype();
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1784);
				match(Comma);
				setState(1785);
				ktype();
				}
				}
				setState(1790);
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

	public static class Bar_types2Context extends ParserRuleContext {
		public List<KtypeContext> ktype() {
			return getRuleContexts(KtypeContext.class);
		}
		public KtypeContext ktype(int i) {
			return getRuleContext(KtypeContext.class,i);
		}
		public List<TerminalNode> Pipe() { return getTokens(HaskellParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(HaskellParser.Pipe, i);
		}
		public Bar_types2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bar_types2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitBar_types2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bar_types2Context bar_types2() throws RecognitionException {
		Bar_types2Context _localctx = new Bar_types2Context(_ctx, getState());
		enterRule(_localctx, 226, RULE_bar_types2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			ktype();
			setState(1792);
			match(Pipe);
			setState(1793);
			ktype();
			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(1794);
				match(Pipe);
				setState(1795);
				ktype();
				}
				}
				setState(1800);
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

	public static class Tv_bndrsContext extends ParserRuleContext {
		public List<Tv_bndrContext> tv_bndr() {
			return getRuleContexts(Tv_bndrContext.class);
		}
		public Tv_bndrContext tv_bndr(int i) {
			return getRuleContext(Tv_bndrContext.class,i);
		}
		public Tv_bndrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tv_bndrs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTv_bndrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tv_bndrsContext tv_bndrs() throws RecognitionException {
		Tv_bndrsContext _localctx = new Tv_bndrsContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_tv_bndrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1801);
				tv_bndr();
				}
				}
				setState(1804); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (OCURLY - 121)))) != 0) );
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

	public static class Tv_bndrContext extends ParserRuleContext {
		public Tv_bndr_no_bracesContext tv_bndr_no_braces() {
			return getRuleContext(Tv_bndr_no_bracesContext.class,0);
		}
		public TerminalNode OCURLY() { return getToken(HaskellParser.OCURLY, 0); }
		public TyvarContext tyvar() {
			return getRuleContext(TyvarContext.class,0);
		}
		public TerminalNode CCURLY() { return getToken(HaskellParser.CCURLY, 0); }
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public Tv_bndrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tv_bndr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTv_bndr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tv_bndrContext tv_bndr() throws RecognitionException {
		Tv_bndrContext _localctx = new Tv_bndrContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_tv_bndr);
		try {
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1806);
				tv_bndr_no_braces();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1807);
				match(OCURLY);
				setState(1808);
				tyvar();
				setState(1809);
				match(CCURLY);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1811);
				match(OCURLY);
				setState(1812);
				tyvar();
				setState(1813);
				match(DoubleColon);
				setState(1814);
				kind();
				setState(1815);
				match(CCURLY);
				}
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

	public static class Tv_bndr_no_bracesContext extends ParserRuleContext {
		public TyvarContext tyvar() {
			return getRuleContext(TyvarContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public Tv_bndr_no_bracesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tv_bndr_no_braces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTv_bndr_no_braces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tv_bndr_no_bracesContext tv_bndr_no_braces() throws RecognitionException {
		Tv_bndr_no_bracesContext _localctx = new Tv_bndr_no_bracesContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_tv_bndr_no_braces);
		try {
			setState(1826);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case HIDING:
			case QUALIFIED:
			case EXPORT:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case VARID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1819);
				tyvar();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1820);
				match(OpenRoundBracket);
				setState(1821);
				tyvar();
				setState(1822);
				match(DoubleColon);
				setState(1823);
				kind();
				setState(1824);
				match(CloseRoundBracket);
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

	public static class FdsContext extends ParserRuleContext {
		public TerminalNode Pipe() { return getToken(HaskellParser.Pipe, 0); }
		public Fds1Context fds1() {
			return getRuleContext(Fds1Context.class,0);
		}
		public FdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FdsContext fds() throws RecognitionException {
		FdsContext _localctx = new FdsContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_fds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(Pipe);
			setState(1829);
			fds1();
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

	public static class Fds1Context extends ParserRuleContext {
		public List<FdContext> fd() {
			return getRuleContexts(FdContext.class);
		}
		public FdContext fd(int i) {
			return getRuleContext(FdContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public Fds1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fds1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFds1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fds1Context fds1() throws RecognitionException {
		Fds1Context _localctx = new Fds1Context(_ctx, getState());
		enterRule(_localctx, 236, RULE_fds1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			fd();
			setState(1836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1832);
				match(Comma);
				setState(1833);
				fd();
				}
				}
				setState(1838);
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

	public static class FdContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(HaskellParser.Arrow, 0); }
		public List<Varids0Context> varids0() {
			return getRuleContexts(Varids0Context.class);
		}
		public Varids0Context varids0(int i) {
			return getRuleContext(Varids0Context.class,i);
		}
		public FdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FdContext fd() throws RecognitionException {
		FdContext _localctx = new FdContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_fd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==VARID) {
				{
				setState(1839);
				varids0();
				}
			}

			setState(1842);
			match(Arrow);
			setState(1844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==VARID) {
				{
				setState(1843);
				varids0();
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

	public static class Varids0Context extends ParserRuleContext {
		public List<TyvarContext> tyvar() {
			return getRuleContexts(TyvarContext.class);
		}
		public TyvarContext tyvar(int i) {
			return getRuleContext(TyvarContext.class,i);
		}
		public Varids0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varids0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVarids0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varids0Context varids0() throws RecognitionException {
		Varids0Context _localctx = new Varids0Context(_ctx, getState());
		enterRule(_localctx, 240, RULE_varids0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1846);
				tyvar();
				}
				}
				setState(1849); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || _la==VARID );
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

	public static class KindContext extends ParserRuleContext {
		public CtypeContext ctype() {
			return getRuleContext(CtypeContext.class,0);
		}
		public KindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KindContext kind() throws RecognitionException {
		KindContext _localctx = new KindContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_kind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			ctype();
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

	public static class Gadt_constrlistContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public Gadt_constrsContext gadt_constrs() {
			return getRuleContext(Gadt_constrsContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public Gadt_constrlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gadt_constrlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGadt_constrlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gadt_constrlistContext gadt_constrlist() throws RecognitionException {
		Gadt_constrlistContext _localctx = new Gadt_constrlistContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_gadt_constrlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			match(WHERE);
			setState(1854);
			open_();
			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (OpenBoxParen - 119)) | (1L << (OpenRoundBracket - 119)) | (1L << (OpenSquareBracket - 119)) | (1L << (CONID - 119)))) != 0)) {
				{
				setState(1855);
				gadt_constrs();
				}
			}

			setState(1861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi || _la==SEMI) {
				{
				{
				setState(1858);
				semi();
				}
				}
				setState(1863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1864);
			close();
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

	public static class Gadt_constrsContext extends ParserRuleContext {
		public List<Gadt_constr_with_docContext> gadt_constr_with_doc() {
			return getRuleContexts(Gadt_constr_with_docContext.class);
		}
		public Gadt_constr_with_docContext gadt_constr_with_doc(int i) {
			return getRuleContext(Gadt_constr_with_docContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public Gadt_constrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gadt_constrs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGadt_constrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gadt_constrsContext gadt_constrs() throws RecognitionException {
		Gadt_constrsContext _localctx = new Gadt_constrsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_gadt_constrs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			gadt_constr_with_doc();
			setState(1872);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1867);
					semi();
					setState(1868);
					gadt_constr_with_doc();
					}
					} 
				}
				setState(1874);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
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

	public static class Gadt_constr_with_docContext extends ParserRuleContext {
		public Gadt_constrContext gadt_constr() {
			return getRuleContext(Gadt_constrContext.class,0);
		}
		public Gadt_constr_with_docContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gadt_constr_with_doc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGadt_constr_with_doc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gadt_constr_with_docContext gadt_constr_with_doc() throws RecognitionException {
		Gadt_constr_with_docContext _localctx = new Gadt_constr_with_docContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_gadt_constr_with_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			gadt_constr();
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

	public static class Gadt_constrContext extends ParserRuleContext {
		public Con_listContext con_list() {
			return getRuleContext(Con_listContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public SigtypedocContext sigtypedoc() {
			return getRuleContext(SigtypedocContext.class,0);
		}
		public Gadt_constrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gadt_constr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGadt_constr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gadt_constrContext gadt_constr() throws RecognitionException {
		Gadt_constrContext _localctx = new Gadt_constrContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_gadt_constr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			con_list();
			setState(1878);
			match(DoubleColon);
			setState(1879);
			sigtypedoc();
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

	public static class ConstrsContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public Constrs1Context constrs1() {
			return getRuleContext(Constrs1Context.class,0);
		}
		public ConstrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConstrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrsContext constrs() throws RecognitionException {
		ConstrsContext _localctx = new ConstrsContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_constrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
			match(Eq);
			setState(1882);
			constrs1();
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

	public static class Constrs1Context extends ParserRuleContext {
		public List<ConstrContext> constr() {
			return getRuleContexts(ConstrContext.class);
		}
		public ConstrContext constr(int i) {
			return getRuleContext(ConstrContext.class,i);
		}
		public List<TerminalNode> Pipe() { return getTokens(HaskellParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(HaskellParser.Pipe, i);
		}
		public Constrs1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrs1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConstrs1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constrs1Context constrs1() throws RecognitionException {
		Constrs1Context _localctx = new Constrs1Context(_ctx, getState());
		enterRule(_localctx, 254, RULE_constrs1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			constr();
			setState(1889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(1885);
				match(Pipe);
				setState(1886);
				constr();
				}
				}
				setState(1891);
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

	public static class ConstrContext extends ParserRuleContext {
		public Constr_stuffContext constr_stuff() {
			return getRuleContext(Constr_stuffContext.class,0);
		}
		public ForallContext forall() {
			return getRuleContext(ForallContext.class,0);
		}
		public Constr_contextContext constr_context() {
			return getRuleContext(Constr_contextContext.class,0);
		}
		public TerminalNode DoubleArrow() { return getToken(HaskellParser.DoubleArrow, 0); }
		public ConstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrContext constr() throws RecognitionException {
		ConstrContext _localctx = new ConstrContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_constr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORALL) {
				{
				setState(1892);
				forall();
				}
			}

			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1895);
				constr_context();
				setState(1896);
				match(DoubleArrow);
				}
				break;
			}
			setState(1900);
			constr_stuff();
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

	public static class ForallContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(HaskellParser.FORALL, 0); }
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public Tv_bndrsContext tv_bndrs() {
			return getRuleContext(Tv_bndrsContext.class,0);
		}
		public ForallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitForall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForallContext forall() throws RecognitionException {
		ForallContext _localctx = new ForallContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_forall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			match(FORALL);
			setState(1904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (OpenRoundBracket - 121)) | (1L << (VARID - 121)) | (1L << (OCURLY - 121)))) != 0)) {
				{
				setState(1903);
				tv_bndrs();
				}
			}

			setState(1906);
			match(Dot);
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

	public static class Constr_stuffContext extends ParserRuleContext {
		public Constr_tyappsContext constr_tyapps() {
			return getRuleContext(Constr_tyappsContext.class,0);
		}
		public Constr_stuffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_stuff; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConstr_stuff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_stuffContext constr_stuff() throws RecognitionException {
		Constr_stuffContext _localctx = new Constr_stuffContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_constr_stuff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			constr_tyapps();
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

	public static class FielddeclsContext extends ParserRuleContext {
		public List<FielddeclContext> fielddecl() {
			return getRuleContexts(FielddeclContext.class);
		}
		public FielddeclContext fielddecl(int i) {
			return getRuleContext(FielddeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public FielddeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fielddecls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFielddecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FielddeclsContext fielddecls() throws RecognitionException {
		FielddeclsContext _localctx = new FielddeclsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_fielddecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			fielddecl();
			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1911);
				match(Comma);
				setState(1912);
				fielddecl();
				}
				}
				setState(1917);
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

	public static class FielddeclContext extends ParserRuleContext {
		public Sig_varsContext sig_vars() {
			return getRuleContext(Sig_varsContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public CtypeContext ctype() {
			return getRuleContext(CtypeContext.class,0);
		}
		public FielddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fielddecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFielddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FielddeclContext fielddecl() throws RecognitionException {
		FielddeclContext _localctx = new FielddeclContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_fielddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			sig_vars();
			setState(1919);
			match(DoubleColon);
			setState(1920);
			ctype();
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

	public static class DerivingsContext extends ParserRuleContext {
		public List<DerivingContext> deriving() {
			return getRuleContexts(DerivingContext.class);
		}
		public DerivingContext deriving(int i) {
			return getRuleContext(DerivingContext.class,i);
		}
		public DerivingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivings; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDerivings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivingsContext derivings() throws RecognitionException {
		DerivingsContext _localctx = new DerivingsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_derivings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1922);
				deriving();
				}
				}
				setState(1925); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DERIVING );
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

	public static class DerivingContext extends ParserRuleContext {
		public TerminalNode DERIVING() { return getToken(HaskellParser.DERIVING, 0); }
		public Deriv_clause_typesContext deriv_clause_types() {
			return getRuleContext(Deriv_clause_typesContext.class,0);
		}
		public Deriv_strategy_no_viaContext deriv_strategy_no_via() {
			return getRuleContext(Deriv_strategy_no_viaContext.class,0);
		}
		public Deriv_strategy_viaContext deriv_strategy_via() {
			return getRuleContext(Deriv_strategy_viaContext.class,0);
		}
		public DerivingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriving; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDeriving(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivingContext deriving() throws RecognitionException {
		DerivingContext _localctx = new DerivingContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_deriving);
		try {
			setState(1937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1927);
				match(DERIVING);
				setState(1928);
				deriv_clause_types();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1929);
				match(DERIVING);
				setState(1930);
				deriv_strategy_no_via();
				setState(1931);
				deriv_clause_types();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1933);
				match(DERIVING);
				setState(1934);
				deriv_clause_types();
				setState(1935);
				deriv_strategy_via();
				}
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

	public static class Deriv_clause_typesContext extends ParserRuleContext {
		public QtyconContext qtycon() {
			return getRuleContext(QtyconContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public Deriv_typesContext deriv_types() {
			return getRuleContext(Deriv_typesContext.class,0);
		}
		public Deriv_clause_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriv_clause_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDeriv_clause_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deriv_clause_typesContext deriv_clause_types() throws RecognitionException {
		Deriv_clause_typesContext _localctx = new Deriv_clause_typesContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_deriv_clause_types);
		try {
			setState(1946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1939);
				qtycon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1940);
				match(OpenRoundBracket);
				setState(1941);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1942);
				match(OpenRoundBracket);
				setState(1943);
				deriv_types();
				setState(1944);
				match(CloseRoundBracket);
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

	public static class Decl_no_thContext extends ParserRuleContext {
		public SigdeclContext sigdecl() {
			return getRuleContext(SigdeclContext.class,0);
		}
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public Opt_sigContext opt_sig() {
			return getRuleContext(Opt_sigContext.class,0);
		}
		public Pattern_synonym_declContext pattern_synonym_decl() {
			return getRuleContext(Pattern_synonym_declContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public Decl_no_thContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_no_th; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecl_no_th(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_no_thContext decl_no_th() throws RecognitionException {
		Decl_no_thContext _localctx = new Decl_no_thContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_decl_no_th);
		int _la;
		try {
			int _alt;
			setState(1961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1948);
				sigdecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1949);
				infixexp();
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(1950);
					opt_sig();
					}
				}

				setState(1953);
				rhs();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1955);
				pattern_synonym_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1957); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1956);
						semi();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1959); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclContext extends ParserRuleContext {
		public Decl_no_thContext decl_no_th() {
			return getRuleContext(Decl_no_thContext.class,0);
		}
		public Splice_expContext splice_exp() {
			return getRuleContext(Splice_expContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_decl);
		try {
			int _alt;
			setState(1970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1963);
				decl_no_th();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1964);
				splice_exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1966); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1965);
						semi();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1968); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class RhsContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public WherebindsContext wherebinds() {
			return getRuleContext(WherebindsContext.class,0);
		}
		public GdrhsContext gdrhs() {
			return getRuleContext(GdrhsContext.class,0);
		}
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_rhs);
		int _la;
		try {
			setState(1981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Eq:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1972);
				match(Eq);
				setState(1973);
				exp();
				setState(1975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1974);
					wherebinds();
					}
				}

				}
				}
				break;
			case Pipe:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1977);
				gdrhs();
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1978);
					wherebinds();
					}
				}

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

	public static class GdrhsContext extends ParserRuleContext {
		public List<GdrhContext> gdrh() {
			return getRuleContexts(GdrhContext.class);
		}
		public GdrhContext gdrh(int i) {
			return getRuleContext(GdrhContext.class,i);
		}
		public GdrhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gdrhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGdrhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdrhsContext gdrhs() throws RecognitionException {
		GdrhsContext _localctx = new GdrhsContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_gdrhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1983);
				gdrh();
				}
				}
				setState(1986); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Pipe );
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

	public static class GdrhContext extends ParserRuleContext {
		public TerminalNode Pipe() { return getToken(HaskellParser.Pipe, 0); }
		public GuardsContext guards() {
			return getRuleContext(GuardsContext.class,0);
		}
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GdrhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gdrh; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGdrh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdrhContext gdrh() throws RecognitionException {
		GdrhContext _localctx = new GdrhContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_gdrh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			match(Pipe);
			setState(1989);
			guards();
			setState(1990);
			match(Eq);
			setState(1991);
			exp();
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

	public static class SigdeclContext extends ParserRuleContext {
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public SigtypedocContext sigtypedoc() {
			return getRuleContext(SigtypedocContext.class,0);
		}
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public TerminalNode Comma() { return getToken(HaskellParser.Comma, 0); }
		public Sig_varsContext sig_vars() {
			return getRuleContext(Sig_varsContext.class,0);
		}
		public FixityContext fixity() {
			return getRuleContext(FixityContext.class,0);
		}
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Pattern_synonym_sigContext pattern_synonym_sig() {
			return getRuleContext(Pattern_synonym_sigContext.class,0);
		}
		public TerminalNode OpenPragmaBracket() { return getToken(HaskellParser.OpenPragmaBracket, 0); }
		public TerminalNode COMPLETE() { return getToken(HaskellParser.COMPLETE, 0); }
		public Con_listContext con_list() {
			return getRuleContext(Con_listContext.class,0);
		}
		public List<TerminalNode> ClosePragmaBracket() { return getTokens(HaskellParser.ClosePragmaBracket); }
		public TerminalNode ClosePragmaBracket(int i) {
			return getToken(HaskellParser.ClosePragmaBracket, i);
		}
		public Opt_tyconsigContext opt_tyconsig() {
			return getRuleContext(Opt_tyconsigContext.class,0);
		}
		public TerminalNode INLINE() { return getToken(HaskellParser.INLINE, 0); }
		public QvarContext qvar() {
			return getRuleContext(QvarContext.class,0);
		}
		public ActivationContext activation() {
			return getRuleContext(ActivationContext.class,0);
		}
		public TerminalNode SCC() { return getToken(HaskellParser.SCC, 0); }
		public PstringContext pstring() {
			return getRuleContext(PstringContext.class,0);
		}
		public TerminalNode SPECIALISE() { return getToken(HaskellParser.SPECIALISE, 0); }
		public Sigtypes1Context sigtypes1() {
			return getRuleContext(Sigtypes1Context.class,0);
		}
		public TerminalNode SPECINLINE() { return getToken(HaskellParser.SPECINLINE, 0); }
		public TerminalNode INSTANCE() { return getToken(HaskellParser.INSTANCE, 0); }
		public Inst_typeContext inst_type() {
			return getRuleContext(Inst_typeContext.class,0);
		}
		public TerminalNode MINIMAL() { return getToken(HaskellParser.MINIMAL, 0); }
		public Name_boolformula_optContext name_boolformula_opt() {
			return getRuleContext(Name_boolformula_optContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public SigdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sigdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSigdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SigdeclContext sigdecl() throws RecognitionException {
		SigdeclContext _localctx = new SigdeclContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_sigdecl);
		int _la;
		try {
			int _alt;
			setState(2072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1993);
				infixexp();
				setState(1994);
				match(DoubleColon);
				setState(1995);
				sigtypedoc();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1997);
				var_();
				setState(1998);
				match(Comma);
				setState(1999);
				sig_vars();
				setState(2000);
				match(DoubleColon);
				setState(2001);
				sigtypedoc();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2003);
				fixity();
				setState(2005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (DECIMAL - 138)) | (1L << (OCTAL - 138)) | (1L << (HEXADECIMAL - 138)))) != 0)) {
					{
					setState(2004);
					integer();
					}
				}

				setState(2007);
				ops();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2009);
				pattern_synonym_sig();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(2010);
				match(OpenPragmaBracket);
				setState(2011);
				match(COMPLETE);
				setState(2012);
				con_list();
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleColon) {
					{
					setState(2013);
					opt_tyconsig();
					}
				}

				setState(2016);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(2018);
				match(OpenPragmaBracket);
				setState(2019);
				match(INLINE);
				setState(2021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenSquareBracket) {
					{
					setState(2020);
					activation();
					}
				}

				setState(2023);
				qvar();
				setState(2024);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(2026);
				match(OpenPragmaBracket);
				setState(2027);
				match(SCC);
				setState(2028);
				qvar();
				setState(2030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(2029);
					pstring();
					}
				}

				setState(2032);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(2034);
				match(OpenPragmaBracket);
				setState(2035);
				match(SPECIALISE);
				setState(2037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenSquareBracket) {
					{
					setState(2036);
					activation();
					}
				}

				setState(2039);
				qvar();
				setState(2040);
				match(DoubleColon);
				setState(2041);
				sigtypes1();
				setState(2042);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(2044);
				match(OpenPragmaBracket);
				setState(2045);
				match(SPECINLINE);
				setState(2047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenSquareBracket) {
					{
					setState(2046);
					activation();
					}
				}

				setState(2049);
				qvar();
				setState(2050);
				match(DoubleColon);
				setState(2051);
				sigtypes1();
				setState(2052);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(2054);
				match(OpenPragmaBracket);
				setState(2055);
				match(SPECIALISE);
				setState(2056);
				match(INSTANCE);
				setState(2057);
				inst_type();
				setState(2058);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(2060);
				match(OpenPragmaBracket);
				setState(2061);
				match(MINIMAL);
				setState(2062);
				match(ClosePragmaBracket);
				setState(2064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (OpenBoxParen - 119)) | (1L << (OpenRoundBracket - 119)) | (1L << (OpenSquareBracket - 119)) | (1L << (VARID - 119)) | (1L << (CONID - 119)))) != 0)) {
					{
					setState(2063);
					name_boolformula_opt();
					}
				}

				setState(2066);
				match(ClosePragmaBracket);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(2068); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2067);
						semi();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2070); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
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

	public static class ActivationContext extends ParserRuleContext {
		public TerminalNode OpenSquareBracket() { return getToken(HaskellParser.OpenSquareBracket, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode CloseSquareBracket() { return getToken(HaskellParser.CloseSquareBracket, 0); }
		public Rule_activation_markerContext rule_activation_marker() {
			return getRuleContext(Rule_activation_markerContext.class,0);
		}
		public ActivationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitActivation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActivationContext activation() throws RecognitionException {
		ActivationContext _localctx = new ActivationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_activation);
		try {
			setState(2083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2074);
				match(OpenSquareBracket);
				setState(2075);
				integer();
				setState(2076);
				match(CloseSquareBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2078);
				match(OpenSquareBracket);
				setState(2079);
				rule_activation_marker();
				setState(2080);
				integer();
				setState(2081);
				match(CloseSquareBracket);
				}
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

	public static class Th_quasiquoteContext extends ParserRuleContext {
		public TerminalNode OpenSquareBracket() { return getToken(HaskellParser.OpenSquareBracket, 0); }
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TerminalNode Pipe() { return getToken(HaskellParser.Pipe, 0); }
		public Th_quasiquoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_th_quasiquote; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTh_quasiquote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Th_quasiquoteContext th_quasiquote() throws RecognitionException {
		Th_quasiquoteContext _localctx = new Th_quasiquoteContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_th_quasiquote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			match(OpenSquareBracket);
			setState(2086);
			varid();
			setState(2087);
			match(Pipe);
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

	public static class Th_qquasiquoteContext extends ParserRuleContext {
		public TerminalNode OpenSquareBracket() { return getToken(HaskellParser.OpenSquareBracket, 0); }
		public QvaridContext qvarid() {
			return getRuleContext(QvaridContext.class,0);
		}
		public TerminalNode Pipe() { return getToken(HaskellParser.Pipe, 0); }
		public Th_qquasiquoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_th_qquasiquote; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTh_qquasiquote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Th_qquasiquoteContext th_qquasiquote() throws RecognitionException {
		Th_qquasiquoteContext _localctx = new Th_qquasiquoteContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_th_qquasiquote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			match(OpenSquareBracket);
			setState(2090);
			qvarid();
			setState(2091);
			match(Pipe);
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

	public static class QuasiquoteContext extends ParserRuleContext {
		public Th_quasiquoteContext th_quasiquote() {
			return getRuleContext(Th_quasiquoteContext.class,0);
		}
		public Th_qquasiquoteContext th_qquasiquote() {
			return getRuleContext(Th_qquasiquoteContext.class,0);
		}
		public QuasiquoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quasiquote; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQuasiquote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuasiquoteContext quasiquote() throws RecognitionException {
		QuasiquoteContext _localctx = new QuasiquoteContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_quasiquote);
		try {
			setState(2095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2093);
				th_quasiquote();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2094);
				th_qquasiquote();
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

	public static class ExpContext extends ParserRuleContext {
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(HaskellParser.DoubleColon, 0); }
		public SigtypeContext sigtype() {
			return getRuleContext(SigtypeContext.class,0);
		}
		public TerminalNode LarrowTail() { return getToken(HaskellParser.LarrowTail, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RarrowTail() { return getToken(HaskellParser.RarrowTail, 0); }
		public TerminalNode LLarrowTail() { return getToken(HaskellParser.LLarrowTail, 0); }
		public TerminalNode RRarrowTail() { return getToken(HaskellParser.RRarrowTail, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_exp);
		try {
			setState(2118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2097);
				infixexp();
				setState(2098);
				match(DoubleColon);
				setState(2099);
				sigtype();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2101);
				infixexp();
				setState(2102);
				match(LarrowTail);
				setState(2103);
				exp();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2105);
				infixexp();
				setState(2106);
				match(RarrowTail);
				setState(2107);
				exp();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2109);
				infixexp();
				setState(2110);
				match(LLarrowTail);
				setState(2111);
				exp();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(2113);
				infixexp();
				setState(2114);
				match(RRarrowTail);
				setState(2115);
				exp();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2117);
				infixexp();
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

	public static class InfixexpContext extends ParserRuleContext {
		public Exp10Context exp10() {
			return getRuleContext(Exp10Context.class,0);
		}
		public List<QopContext> qop() {
			return getRuleContexts(QopContext.class);
		}
		public QopContext qop(int i) {
			return getRuleContext(QopContext.class,i);
		}
		public List<Exp10pContext> exp10p() {
			return getRuleContexts(Exp10pContext.class);
		}
		public Exp10pContext exp10p(int i) {
			return getRuleContext(Exp10pContext.class,i);
		}
		public InfixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitInfixexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixexpContext infixexp() throws RecognitionException {
		InfixexpContext _localctx = new InfixexpContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_infixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			exp10();
			setState(2126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2121);
					qop();
					setState(2122);
					exp10p();
					}
					} 
				}
				setState(2128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
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

	public static class Exp10pContext extends ParserRuleContext {
		public Exp10Context exp10() {
			return getRuleContext(Exp10Context.class,0);
		}
		public Exp10pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp10p; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExp10p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp10pContext exp10p() throws RecognitionException {
		Exp10pContext _localctx = new Exp10pContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_exp10p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			exp10();
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

	public static class Exp10Context extends ParserRuleContext {
		public FexpContext fexp() {
			return getRuleContext(FexpContext.class,0);
		}
		public TerminalNode Minus() { return getToken(HaskellParser.Minus, 0); }
		public Exp10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp10; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExp10(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp10Context exp10() throws RecognitionException {
		Exp10Context _localctx = new Exp10Context(_ctx, getState());
		enterRule(_localctx, 298, RULE_exp10);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(2131);
				match(Minus);
				}
			}

			setState(2134);
			fexp();
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

	public static class FexpContext extends ParserRuleContext {
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public TerminalNode Atsign() { return getToken(HaskellParser.Atsign, 0); }
		public AtypeContext atype() {
			return getRuleContext(AtypeContext.class,0);
		}
		public FexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FexpContext fexp() throws RecognitionException {
		FexpContext _localctx = new FexpContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_fexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2136);
					aexp();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2139); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(2141);
				match(Atsign);
				setState(2142);
				atype();
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

	public static class AexpContext extends ParserRuleContext {
		public QvarContext qvar() {
			return getRuleContext(QvarContext.class,0);
		}
		public TerminalNode Atsign() { return getToken(HaskellParser.Atsign, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(HaskellParser.Tilde, 0); }
		public TerminalNode Bang() { return getToken(HaskellParser.Bang, 0); }
		public TerminalNode ReverseSlash() { return getToken(HaskellParser.ReverseSlash, 0); }
		public ApatsContext apats() {
			return getRuleContext(ApatsContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(HaskellParser.Arrow, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public DecllistContext decllist() {
			return getRuleContext(DecllistContext.class,0);
		}
		public TerminalNode IN() { return getToken(HaskellParser.IN, 0); }
		public TerminalNode LCASE() { return getToken(HaskellParser.LCASE, 0); }
		public AltsContext alts() {
			return getRuleContext(AltsContext.class,0);
		}
		public TerminalNode IF() { return getToken(HaskellParser.IF, 0); }
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(HaskellParser.ELSE, 0); }
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public IfgdpatsContext ifgdpats() {
			return getRuleContext(IfgdpatsContext.class,0);
		}
		public TerminalNode CASE() { return getToken(HaskellParser.CASE, 0); }
		public TerminalNode OF() { return getToken(HaskellParser.OF, 0); }
		public TerminalNode DO() { return getToken(HaskellParser.DO, 0); }
		public StmtlistContext stmtlist() {
			return getRuleContext(StmtlistContext.class,0);
		}
		public TerminalNode MDO() { return getToken(HaskellParser.MDO, 0); }
		public Aexp1Context aexp1() {
			return getRuleContext(Aexp1Context.class,0);
		}
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexpContext aexp() throws RecognitionException {
		AexpContext _localctx = new AexpContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_aexp);
		int _la;
		try {
			setState(2190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2145);
				qvar();
				setState(2146);
				match(Atsign);
				setState(2147);
				aexp();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2149);
				match(Tilde);
				setState(2150);
				aexp();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2151);
				match(Bang);
				setState(2152);
				aexp();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2153);
				match(ReverseSlash);
				setState(2154);
				apats();
				setState(2155);
				match(Arrow);
				setState(2156);
				exp();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(2158);
				match(LET);
				setState(2159);
				decllist();
				setState(2160);
				match(IN);
				setState(2161);
				exp();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(2163);
				match(LCASE);
				setState(2164);
				alts();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(2165);
				match(IF);
				setState(2166);
				exp();
				setState(2168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semi || _la==SEMI) {
					{
					setState(2167);
					semi();
					}
				}

				setState(2170);
				match(THEN);
				setState(2171);
				exp();
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semi || _la==SEMI) {
					{
					setState(2172);
					semi();
					}
				}

				setState(2175);
				match(ELSE);
				setState(2176);
				exp();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(2178);
				match(IF);
				setState(2179);
				ifgdpats();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(2180);
				match(CASE);
				setState(2181);
				exp();
				setState(2182);
				match(OF);
				setState(2183);
				alts();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(2185);
				match(DO);
				setState(2186);
				stmtlist();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(2187);
				match(MDO);
				setState(2188);
				stmtlist();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2189);
				aexp1();
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

	public static class Aexp1Context extends ParserRuleContext {
		public Aexp2Context aexp2() {
			return getRuleContext(Aexp2Context.class,0);
		}
		public List<TerminalNode> OCURLY() { return getTokens(HaskellParser.OCURLY); }
		public TerminalNode OCURLY(int i) {
			return getToken(HaskellParser.OCURLY, i);
		}
		public List<TerminalNode> CCURLY() { return getTokens(HaskellParser.CCURLY); }
		public TerminalNode CCURLY(int i) {
			return getToken(HaskellParser.CCURLY, i);
		}
		public List<FbindsContext> fbinds() {
			return getRuleContexts(FbindsContext.class);
		}
		public FbindsContext fbinds(int i) {
			return getRuleContext(FbindsContext.class,i);
		}
		public Aexp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAexp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aexp1Context aexp1() throws RecognitionException {
		Aexp1Context _localctx = new Aexp1Context(_ctx, getState());
		enterRule(_localctx, 304, RULE_aexp1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			aexp2();
			setState(2200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2193);
					match(OCURLY);
					setState(2195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (DoubleDot - 98)) | (1L << (OpenRoundBracket - 98)) | (1L << (VARID - 98)) | (1L << (CONID - 98)))) != 0)) {
						{
						setState(2194);
						fbinds();
						}
					}

					setState(2197);
					match(CCURLY);
					}
					} 
				}
				setState(2202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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

	public static class Aexp2Context extends ParserRuleContext {
		public QvarContext qvar() {
			return getRuleContext(QvarContext.class,0);
		}
		public QconContext qcon() {
			return getRuleContext(QconContext.class,0);
		}
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PstringContext pstring() {
			return getRuleContext(PstringContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PfloatContext pfloat() {
			return getRuleContext(PfloatContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TexpContext texp() {
			return getRuleContext(TexpContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public Tup_exprsContext tup_exprs() {
			return getRuleContext(Tup_exprsContext.class,0);
		}
		public TerminalNode OpenBoxParen() { return getToken(HaskellParser.OpenBoxParen, 0); }
		public TerminalNode CloseBoxParen() { return getToken(HaskellParser.CloseBoxParen, 0); }
		public TerminalNode OpenSquareBracket() { return getToken(HaskellParser.OpenSquareBracket, 0); }
		public List_Context list_() {
			return getRuleContext(List_Context.class,0);
		}
		public TerminalNode CloseSquareBracket() { return getToken(HaskellParser.CloseSquareBracket, 0); }
		public TerminalNode WILDCARD() { return getToken(HaskellParser.WILDCARD, 0); }
		public Splice_untypedContext splice_untyped() {
			return getRuleContext(Splice_untypedContext.class,0);
		}
		public Splice_typedContext splice_typed() {
			return getRuleContext(Splice_typedContext.class,0);
		}
		public TerminalNode Quote() { return getToken(HaskellParser.Quote, 0); }
		public TerminalNode DoubleQuote() { return getToken(HaskellParser.DoubleQuote, 0); }
		public TyvarContext tyvar() {
			return getRuleContext(TyvarContext.class,0);
		}
		public GtyconContext gtycon() {
			return getRuleContext(GtyconContext.class,0);
		}
		public TerminalNode TopenExpQuote() { return getToken(HaskellParser.TopenExpQuote, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TcloseQoute() { return getToken(HaskellParser.TcloseQoute, 0); }
		public TerminalNode TopenTexpQuote() { return getToken(HaskellParser.TopenTexpQuote, 0); }
		public TerminalNode TcloseTExpQoute() { return getToken(HaskellParser.TcloseTExpQoute, 0); }
		public TerminalNode TopenTypQoute() { return getToken(HaskellParser.TopenTypQoute, 0); }
		public KtypeContext ktype() {
			return getRuleContext(KtypeContext.class,0);
		}
		public TerminalNode TopenPatQuote() { return getToken(HaskellParser.TopenPatQuote, 0); }
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public TerminalNode TopenDecQoute() { return getToken(HaskellParser.TopenDecQoute, 0); }
		public CvtopbodyContext cvtopbody() {
			return getRuleContext(CvtopbodyContext.class,0);
		}
		public QuasiquoteContext quasiquote() {
			return getRuleContext(QuasiquoteContext.class,0);
		}
		public List<TerminalNode> AopenParen() { return getTokens(HaskellParser.AopenParen); }
		public TerminalNode AopenParen(int i) {
			return getToken(HaskellParser.AopenParen, i);
		}
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public CmdargsContext cmdargs() {
			return getRuleContext(CmdargsContext.class,0);
		}
		public Aexp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAexp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aexp2Context aexp2() throws RecognitionException {
		Aexp2Context _localctx = new Aexp2Context(_ctx, getState());
		enterRule(_localctx, 306, RULE_aexp2);
		try {
			setState(2270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2203);
				qvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2204);
				qcon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2205);
				varid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2206);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2207);
				pstring();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2208);
				integer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2209);
				pfloat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(2210);
				match(OpenRoundBracket);
				setState(2211);
				texp();
				setState(2212);
				match(CloseRoundBracket);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(2214);
				match(OpenRoundBracket);
				setState(2215);
				tup_exprs();
				setState(2216);
				match(CloseRoundBracket);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(2218);
				match(OpenBoxParen);
				setState(2219);
				texp();
				setState(2220);
				match(CloseBoxParen);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(2222);
				match(OpenBoxParen);
				setState(2223);
				tup_exprs();
				setState(2224);
				match(CloseBoxParen);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(2226);
				match(OpenSquareBracket);
				setState(2227);
				list_();
				setState(2228);
				match(CloseSquareBracket);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2230);
				match(WILDCARD);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2231);
				splice_untyped();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2232);
				splice_typed();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(2233);
				match(Quote);
				setState(2234);
				qvar();
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(2235);
				match(Quote);
				setState(2236);
				qcon();
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				{
				setState(2237);
				match(DoubleQuote);
				setState(2238);
				tyvar();
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				{
				setState(2239);
				match(DoubleQuote);
				setState(2240);
				gtycon();
				}
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2241);
				match(DoubleQuote);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2242);
				match(TopenExpQuote);
				setState(2243);
				exp();
				setState(2244);
				match(TcloseQoute);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2246);
				match(TopenTexpQuote);
				setState(2247);
				exp();
				setState(2248);
				match(TcloseTExpQoute);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2250);
				match(TopenTypQoute);
				setState(2251);
				ktype();
				setState(2252);
				match(TcloseQoute);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2254);
				match(TopenPatQuote);
				setState(2255);
				infixexp();
				setState(2256);
				match(TcloseQoute);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2258);
				match(TopenDecQoute);
				setState(2259);
				cvtopbody();
				setState(2260);
				match(TcloseQoute);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2262);
				quasiquote();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				{
				setState(2263);
				match(AopenParen);
				setState(2264);
				aexp();
				setState(2266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2265);
					cmdargs();
					}
					break;
				}
				setState(2268);
				match(AopenParen);
				}
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

	public static class Splice_expContext extends ParserRuleContext {
		public Splice_typedContext splice_typed() {
			return getRuleContext(Splice_typedContext.class,0);
		}
		public Splice_untypedContext splice_untyped() {
			return getRuleContext(Splice_untypedContext.class,0);
		}
		public Splice_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splice_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSplice_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Splice_expContext splice_exp() throws RecognitionException {
		Splice_expContext _localctx = new Splice_expContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_splice_exp);
		try {
			setState(2274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DDollar:
				enterOuterAlt(_localctx, 1);
				{
				setState(2272);
				splice_typed();
				}
				break;
			case Dollar:
				enterOuterAlt(_localctx, 2);
				{
				setState(2273);
				splice_untyped();
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

	public static class Splice_untypedContext extends ParserRuleContext {
		public TerminalNode Dollar() { return getToken(HaskellParser.Dollar, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public Splice_untypedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splice_untyped; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSplice_untyped(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Splice_untypedContext splice_untyped() throws RecognitionException {
		Splice_untypedContext _localctx = new Splice_untypedContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_splice_untyped);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2276);
			match(Dollar);
			setState(2277);
			aexp();
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

	public static class Splice_typedContext extends ParserRuleContext {
		public TerminalNode DDollar() { return getToken(HaskellParser.DDollar, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public Splice_typedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splice_typed; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSplice_typed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Splice_typedContext splice_typed() throws RecognitionException {
		Splice_typedContext _localctx = new Splice_typedContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_splice_typed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
			match(DDollar);
			setState(2280);
			aexp();
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

	public static class CmdargsContext extends ParserRuleContext {
		public List<AcmdContext> acmd() {
			return getRuleContexts(AcmdContext.class);
		}
		public AcmdContext acmd(int i) {
			return getRuleContext(AcmdContext.class,i);
		}
		public CmdargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdargs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCmdargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdargsContext cmdargs() throws RecognitionException {
		CmdargsContext _localctx = new CmdargsContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_cmdargs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2283); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2282);
					acmd();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2285); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
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

	public static class AcmdContext extends ParserRuleContext {
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public AcmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acmd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAcmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcmdContext acmd() throws RecognitionException {
		AcmdContext _localctx = new AcmdContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_acmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2287);
			aexp();
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

	public static class CvtopbodyContext extends ParserRuleContext {
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public Cvtopdecls0Context cvtopdecls0() {
			return getRuleContext(Cvtopdecls0Context.class,0);
		}
		public CvtopbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvtopbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCvtopbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvtopbodyContext cvtopbody() throws RecognitionException {
		CvtopbodyContext _localctx = new CvtopbodyContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_cvtopbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2289);
			open_();
			setState(2291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << AS) | (1L << CASE) | (1L << CLASS) | (1L << DATA) | (1L << DEFAULT) | (1L << DERIVING) | (1L << DO) | (1L << HIDING) | (1L << IF) | (1L << INFIX) | (1L << INFIXL) | (1L << INFIXR) | (1L << INSTANCE) | (1L << LET) | (1L << NEWTYPE) | (1L << QUALIFIED) | (1L << TYPE) | (1L << WILDCARD) | (1L << FOREIGN) | (1L << EXPORT) | (1L << MDO) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << PATTERN) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LCASE - 73)) | (1L << (Bang - 73)) | (1L << (Minus - 73)) | (1L << (Tilde - 73)) | (1L << (DDollar - 73)) | (1L << (Dollar - 73)) | (1L << (Semi - 73)) | (1L << (Quote - 73)) | (1L << (DoubleQuote - 73)) | (1L << (ReverseSlash - 73)) | (1L << (AopenParen - 73)) | (1L << (TopenTexpQuote - 73)) | (1L << (TopenExpQuote - 73)) | (1L << (TopenPatQuote - 73)) | (1L << (TopenTypQoute - 73)) | (1L << (TopenDecQoute - 73)) | (1L << (OpenBoxParen - 73)) | (1L << (OpenRoundBracket - 73)) | (1L << (OpenSquareBracket - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (VARID - 73)) | (1L << (CONID - 73)) | (1L << (OpenPragmaBracket - 73)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (SEMI - 137)) | (1L << (DECIMAL - 137)) | (1L << (OCTAL - 137)) | (1L << (HEXADECIMAL - 137)) | (1L << (FLOAT - 137)))) != 0)) {
				{
				setState(2290);
				cvtopdecls0();
				}
			}

			setState(2293);
			close();
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

	public static class Cvtopdecls0Context extends ParserRuleContext {
		public TopdeclsContext topdecls() {
			return getRuleContext(TopdeclsContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public Cvtopdecls0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvtopdecls0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCvtopdecls0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cvtopdecls0Context cvtopdecls0() throws RecognitionException {
		Cvtopdecls0Context _localctx = new Cvtopdecls0Context(_ctx, getState());
		enterRule(_localctx, 320, RULE_cvtopdecls0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2295);
			topdecls();
			setState(2299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi || _la==SEMI) {
				{
				{
				setState(2296);
				semi();
				}
				}
				setState(2301);
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

	public static class TexpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public QopContext qop() {
			return getRuleContext(QopContext.class,0);
		}
		public QopmContext qopm() {
			return getRuleContext(QopmContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(HaskellParser.Arrow, 0); }
		public TexpContext texp() {
			return getRuleContext(TexpContext.class,0);
		}
		public TexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TexpContext texp() throws RecognitionException {
		TexpContext _localctx = new TexpContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_texp);
		try {
			setState(2313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2302);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2303);
				infixexp();
				setState(2304);
				qop();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2306);
				qopm();
				setState(2307);
				infixexp();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2309);
				exp();
				setState(2310);
				match(Arrow);
				setState(2311);
				texp();
				}
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

	public static class Tup_exprsContext extends ParserRuleContext {
		public TexpContext texp() {
			return getRuleContext(TexpContext.class,0);
		}
		public Commas_tup_tailContext commas_tup_tail() {
			return getRuleContext(Commas_tup_tailContext.class,0);
		}
		public List<BarsContext> bars() {
			return getRuleContexts(BarsContext.class);
		}
		public BarsContext bars(int i) {
			return getRuleContext(BarsContext.class,i);
		}
		public CommasContext commas() {
			return getRuleContext(CommasContext.class,0);
		}
		public Tup_tailContext tup_tail() {
			return getRuleContext(Tup_tailContext.class,0);
		}
		public Tup_exprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tup_exprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTup_exprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tup_exprsContext tup_exprs() throws RecognitionException {
		Tup_exprsContext _localctx = new Tup_exprsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_tup_exprs);
		int _la;
		try {
			setState(2330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2315);
				texp();
				setState(2316);
				commas_tup_tail();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2318);
				texp();
				setState(2319);
				bars();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2321);
				commas();
				setState(2323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << CASE) | (1L << DO) | (1L << HIDING) | (1L << IF) | (1L << LET) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << EXPORT) | (1L << MDO) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LCASE - 73)) | (1L << (Hash - 73)) | (1L << (Less - 73)) | (1L << (Greater - 73)) | (1L << (Ampersand - 73)) | (1L << (Pipe - 73)) | (1L << (Bang - 73)) | (1L << (Caret - 73)) | (1L << (Plus - 73)) | (1L << (Minus - 73)) | (1L << (Asterisk - 73)) | (1L << (Percent - 73)) | (1L << (Divide - 73)) | (1L << (Tilde - 73)) | (1L << (Atsign - 73)) | (1L << (DDollar - 73)) | (1L << (Dollar - 73)) | (1L << (Dot - 73)) | (1L << (QuestionMark - 73)) | (1L << (Colon - 73)) | (1L << (Eq - 73)) | (1L << (Equal - 73)) | (1L << (Quote - 73)) | (1L << (DoubleQuote - 73)) | (1L << (ReverseSlash - 73)) | (1L << (BackQuote - 73)) | (1L << (AopenParen - 73)) | (1L << (TopenTexpQuote - 73)) | (1L << (TopenExpQuote - 73)) | (1L << (TopenPatQuote - 73)) | (1L << (TopenTypQoute - 73)) | (1L << (TopenDecQoute - 73)) | (1L << (OpenBoxParen - 73)) | (1L << (OpenRoundBracket - 73)) | (1L << (OpenSquareBracket - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (VARID - 73)) | (1L << (CONID - 73)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (DECIMAL - 138)) | (1L << (OCTAL - 138)) | (1L << (HEXADECIMAL - 138)) | (1L << (FLOAT - 138)))) != 0)) {
					{
					setState(2322);
					tup_tail();
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2325);
				bars();
				setState(2326);
				texp();
				setState(2328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(2327);
					bars();
					}
				}

				}
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

	public static class Commas_tup_tailContext extends ParserRuleContext {
		public CommasContext commas() {
			return getRuleContext(CommasContext.class,0);
		}
		public Tup_tailContext tup_tail() {
			return getRuleContext(Tup_tailContext.class,0);
		}
		public Commas_tup_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commas_tup_tail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCommas_tup_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commas_tup_tailContext commas_tup_tail() throws RecognitionException {
		Commas_tup_tailContext _localctx = new Commas_tup_tailContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_commas_tup_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
			commas();
			setState(2334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << CASE) | (1L << DO) | (1L << HIDING) | (1L << IF) | (1L << LET) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << EXPORT) | (1L << MDO) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LCASE - 73)) | (1L << (Hash - 73)) | (1L << (Less - 73)) | (1L << (Greater - 73)) | (1L << (Ampersand - 73)) | (1L << (Pipe - 73)) | (1L << (Bang - 73)) | (1L << (Caret - 73)) | (1L << (Plus - 73)) | (1L << (Minus - 73)) | (1L << (Asterisk - 73)) | (1L << (Percent - 73)) | (1L << (Divide - 73)) | (1L << (Tilde - 73)) | (1L << (Atsign - 73)) | (1L << (DDollar - 73)) | (1L << (Dollar - 73)) | (1L << (Dot - 73)) | (1L << (QuestionMark - 73)) | (1L << (Colon - 73)) | (1L << (Eq - 73)) | (1L << (Equal - 73)) | (1L << (Quote - 73)) | (1L << (DoubleQuote - 73)) | (1L << (ReverseSlash - 73)) | (1L << (BackQuote - 73)) | (1L << (AopenParen - 73)) | (1L << (TopenTexpQuote - 73)) | (1L << (TopenExpQuote - 73)) | (1L << (TopenPatQuote - 73)) | (1L << (TopenTypQoute - 73)) | (1L << (TopenDecQoute - 73)) | (1L << (OpenBoxParen - 73)) | (1L << (OpenRoundBracket - 73)) | (1L << (OpenSquareBracket - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (VARID - 73)) | (1L << (CONID - 73)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (DECIMAL - 138)) | (1L << (OCTAL - 138)) | (1L << (HEXADECIMAL - 138)) | (1L << (FLOAT - 138)))) != 0)) {
				{
				setState(2333);
				tup_tail();
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

	public static class Tup_tailContext extends ParserRuleContext {
		public TexpContext texp() {
			return getRuleContext(TexpContext.class,0);
		}
		public Commas_tup_tailContext commas_tup_tail() {
			return getRuleContext(Commas_tup_tailContext.class,0);
		}
		public Tup_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tup_tail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTup_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tup_tailContext tup_tail() throws RecognitionException {
		Tup_tailContext _localctx = new Tup_tailContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_tup_tail);
		try {
			setState(2340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2336);
				texp();
				setState(2337);
				commas_tup_tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2339);
				texp();
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

	public static class List_Context extends ParserRuleContext {
		public TexpContext texp() {
			return getRuleContext(TexpContext.class,0);
		}
		public LexpsContext lexps() {
			return getRuleContext(LexpsContext.class,0);
		}
		public TerminalNode DoubleDot() { return getToken(HaskellParser.DoubleDot, 0); }
		public TerminalNode Comma() { return getToken(HaskellParser.Comma, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Pipe() { return getToken(HaskellParser.Pipe, 0); }
		public FlattenedpqualsContext flattenedpquals() {
			return getRuleContext(FlattenedpqualsContext.class,0);
		}
		public List_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitList_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_Context list_() throws RecognitionException {
		List_Context _localctx = new List_Context(_ctx, getState());
		enterRule(_localctx, 330, RULE_list_);
		try {
			setState(2366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2342);
				texp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2343);
				lexps();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2344);
				texp();
				setState(2345);
				match(DoubleDot);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2347);
				texp();
				setState(2348);
				match(Comma);
				setState(2349);
				exp();
				setState(2350);
				match(DoubleDot);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2352);
				texp();
				setState(2353);
				match(DoubleDot);
				setState(2354);
				exp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2356);
				texp();
				setState(2357);
				match(Comma);
				setState(2358);
				exp();
				setState(2359);
				match(DoubleDot);
				setState(2360);
				exp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2362);
				texp();
				setState(2363);
				match(Pipe);
				setState(2364);
				flattenedpquals();
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

	public static class LexpsContext extends ParserRuleContext {
		public List<TexpContext> texp() {
			return getRuleContexts(TexpContext.class);
		}
		public TexpContext texp(int i) {
			return getRuleContext(TexpContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public LexpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexps; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitLexps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexpsContext lexps() throws RecognitionException {
		LexpsContext _localctx = new LexpsContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_lexps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2368);
			texp();
			setState(2369);
			match(Comma);
			setState(2370);
			texp();
			setState(2375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2371);
				match(Comma);
				setState(2372);
				texp();
				}
				}
				setState(2377);
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

	public static class FlattenedpqualsContext extends ParserRuleContext {
		public PqualsContext pquals() {
			return getRuleContext(PqualsContext.class,0);
		}
		public FlattenedpqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flattenedpquals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFlattenedpquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlattenedpqualsContext flattenedpquals() throws RecognitionException {
		FlattenedpqualsContext _localctx = new FlattenedpqualsContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_flattenedpquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2378);
			pquals();
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

	public static class PqualsContext extends ParserRuleContext {
		public List<SqualsContext> squals() {
			return getRuleContexts(SqualsContext.class);
		}
		public SqualsContext squals(int i) {
			return getRuleContext(SqualsContext.class,i);
		}
		public List<TerminalNode> Pipe() { return getTokens(HaskellParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(HaskellParser.Pipe, i);
		}
		public PqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pquals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PqualsContext pquals() throws RecognitionException {
		PqualsContext _localctx = new PqualsContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_pquals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			squals();
			setState(2385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(2381);
				match(Pipe);
				setState(2382);
				squals();
				}
				}
				setState(2387);
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

	public static class SqualsContext extends ParserRuleContext {
		public List<TransformqualContext> transformqual() {
			return getRuleContexts(TransformqualContext.class);
		}
		public TransformqualContext transformqual(int i) {
			return getRuleContext(TransformqualContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public List<QualContext> qual() {
			return getRuleContexts(QualContext.class);
		}
		public QualContext qual(int i) {
			return getRuleContext(QualContext.class,i);
		}
		public SqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqualsContext squals() throws RecognitionException {
		SqualsContext _localctx = new SqualsContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_squals);
		int _la;
		try {
			setState(2420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2388);
				transformqual();
				setState(2393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(2389);
					match(Comma);
					setState(2390);
					transformqual();
					}
					}
					setState(2395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2396);
				transformqual();
				setState(2401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(2397);
					match(Comma);
					setState(2398);
					qual();
					}
					}
					setState(2403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2404);
				qual();
				setState(2409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(2405);
					match(Comma);
					setState(2406);
					transformqual();
					}
					}
					setState(2411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2412);
				qual();
				setState(2417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(2413);
					match(Comma);
					setState(2414);
					qual();
					}
					}
					setState(2419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TransformqualContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode BY() { return getToken(HaskellParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(HaskellParser.GROUP, 0); }
		public TerminalNode USING() { return getToken(HaskellParser.USING, 0); }
		public TransformqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformqual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTransformqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformqualContext transformqual() throws RecognitionException {
		TransformqualContext _localctx = new TransformqualContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_transformqual);
		try {
			setState(2440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2422);
				match(THEN);
				setState(2423);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2424);
				match(THEN);
				setState(2425);
				exp();
				setState(2426);
				match(BY);
				setState(2427);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2429);
				match(THEN);
				setState(2430);
				match(GROUP);
				setState(2431);
				match(USING);
				setState(2432);
				exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2433);
				match(THEN);
				setState(2434);
				match(GROUP);
				setState(2435);
				match(BY);
				setState(2436);
				exp();
				setState(2437);
				match(USING);
				setState(2438);
				exp();
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

	public static class GuardsContext extends ParserRuleContext {
		public List<Guard_Context> guard_() {
			return getRuleContexts(Guard_Context.class);
		}
		public Guard_Context guard_(int i) {
			return getRuleContext(Guard_Context.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public GuardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guards; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGuards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardsContext guards() throws RecognitionException {
		GuardsContext _localctx = new GuardsContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_guards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2442);
			guard_();
			setState(2447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2443);
				match(Comma);
				setState(2444);
				guard_();
				}
				}
				setState(2449);
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

	public static class Guard_Context extends ParserRuleContext {
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public TerminalNode Revarrow() { return getToken(HaskellParser.Revarrow, 0); }
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public DecllistContext decllist() {
			return getRuleContext(DecllistContext.class,0);
		}
		public Guard_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGuard_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_Context guard_() throws RecognitionException {
		Guard_Context _localctx = new Guard_Context(_ctx, getState());
		enterRule(_localctx, 344, RULE_guard_);
		try {
			setState(2457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2450);
				pat();
				setState(2451);
				match(Revarrow);
				setState(2452);
				infixexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2454);
				match(LET);
				setState(2455);
				decllist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2456);
				infixexp();
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

	public static class AltsContext extends ParserRuleContext {
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public List<AltContext> alt() {
			return getRuleContexts(AltContext.class);
		}
		public AltContext alt(int i) {
			return getRuleContext(AltContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public AltsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAlts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltsContext alts() throws RecognitionException {
		AltsContext _localctx = new AltsContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_alts);
		int _la;
		try {
			setState(2476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2459);
				open_();
				setState(2467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2460);
					alt();
					setState(2464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Semi || _la==SEMI) {
						{
						{
						setState(2461);
						semi();
						}
						}
						setState(2466);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(2469); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << CASE) | (1L << DO) | (1L << HIDING) | (1L << IF) | (1L << LET) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << EXPORT) | (1L << MDO) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LCASE - 73)) | (1L << (Bang - 73)) | (1L << (Minus - 73)) | (1L << (Tilde - 73)) | (1L << (DDollar - 73)) | (1L << (Dollar - 73)) | (1L << (Quote - 73)) | (1L << (DoubleQuote - 73)) | (1L << (ReverseSlash - 73)) | (1L << (AopenParen - 73)) | (1L << (TopenTexpQuote - 73)) | (1L << (TopenExpQuote - 73)) | (1L << (TopenPatQuote - 73)) | (1L << (TopenTypQoute - 73)) | (1L << (TopenDecQoute - 73)) | (1L << (OpenBoxParen - 73)) | (1L << (OpenRoundBracket - 73)) | (1L << (OpenSquareBracket - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (VARID - 73)) | (1L << (CONID - 73)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (DECIMAL - 138)) | (1L << (OCTAL - 138)) | (1L << (HEXADECIMAL - 138)) | (1L << (FLOAT - 138)))) != 0) );
				setState(2471);
				close();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2473);
				open_();
				setState(2474);
				close();
				}
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

	public static class AltContext extends ParserRuleContext {
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public Alt_rhsContext alt_rhs() {
			return getRuleContext(Alt_rhsContext.class,0);
		}
		public AltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltContext alt() throws RecognitionException {
		AltContext _localctx = new AltContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_alt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
			pat();
			setState(2479);
			alt_rhs();
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

	public static class Alt_rhsContext extends ParserRuleContext {
		public RaltContext ralt() {
			return getRuleContext(RaltContext.class,0);
		}
		public WherebindsContext wherebinds() {
			return getRuleContext(WherebindsContext.class,0);
		}
		public Alt_rhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_rhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAlt_rhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alt_rhsContext alt_rhs() throws RecognitionException {
		Alt_rhsContext _localctx = new Alt_rhsContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_alt_rhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
			ralt();
			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2482);
				wherebinds();
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

	public static class RaltContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(HaskellParser.Arrow, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GdpatsContext gdpats() {
			return getRuleContext(GdpatsContext.class,0);
		}
		public RaltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ralt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRalt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaltContext ralt() throws RecognitionException {
		RaltContext _localctx = new RaltContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_ralt);
		try {
			setState(2488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Arrow:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2485);
				match(Arrow);
				setState(2486);
				exp();
				}
				}
				break;
			case Pipe:
				enterOuterAlt(_localctx, 2);
				{
				setState(2487);
				gdpats();
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

	public static class GdpatsContext extends ParserRuleContext {
		public List<GdpatContext> gdpat() {
			return getRuleContexts(GdpatContext.class);
		}
		public GdpatContext gdpat(int i) {
			return getRuleContext(GdpatContext.class,i);
		}
		public GdpatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gdpats; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGdpats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdpatsContext gdpats() throws RecognitionException {
		GdpatsContext _localctx = new GdpatsContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_gdpats);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2491); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2490);
					gdpat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2493); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
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

	public static class IfgdpatsContext extends ParserRuleContext {
		public TerminalNode OCURLY() { return getToken(HaskellParser.OCURLY, 0); }
		public GdpatsContext gdpats() {
			return getRuleContext(GdpatsContext.class,0);
		}
		public TerminalNode CCURLY() { return getToken(HaskellParser.CCURLY, 0); }
		public IfgdpatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifgdpats; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitIfgdpats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfgdpatsContext ifgdpats() throws RecognitionException {
		IfgdpatsContext _localctx = new IfgdpatsContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_ifgdpats);
		try {
			setState(2500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2495);
				match(OCURLY);
				setState(2496);
				gdpats();
				setState(2497);
				match(CCURLY);
				}
				break;
			case Pipe:
				enterOuterAlt(_localctx, 2);
				{
				setState(2499);
				gdpats();
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

	public static class GdpatContext extends ParserRuleContext {
		public TerminalNode Pipe() { return getToken(HaskellParser.Pipe, 0); }
		public GuardsContext guards() {
			return getRuleContext(GuardsContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(HaskellParser.Arrow, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GdpatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gdpat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGdpat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdpatContext gdpat() throws RecognitionException {
		GdpatContext _localctx = new GdpatContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_gdpat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
			match(Pipe);
			setState(2503);
			guards();
			setState(2504);
			match(Arrow);
			setState(2505);
			exp();
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

	public static class PatContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatContext pat() throws RecognitionException {
		PatContext _localctx = new PatContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_pat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2507);
			exp();
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

	public static class BindpatContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BindpatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindpat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitBindpat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindpatContext bindpat() throws RecognitionException {
		BindpatContext _localctx = new BindpatContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_bindpat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			exp();
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

	public static class ApatContext extends ParserRuleContext {
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public ApatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitApat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApatContext apat() throws RecognitionException {
		ApatContext _localctx = new ApatContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_apat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2511);
			aexp();
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

	public static class ApatsContext extends ParserRuleContext {
		public List<ApatContext> apat() {
			return getRuleContexts(ApatContext.class);
		}
		public ApatContext apat(int i) {
			return getRuleContext(ApatContext.class,i);
		}
		public ApatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apats; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitApats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApatsContext apats() throws RecognitionException {
		ApatsContext _localctx = new ApatsContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_apats);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2513);
				apat();
				}
				}
				setState(2516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << CASE) | (1L << DO) | (1L << HIDING) | (1L << IF) | (1L << LET) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << EXPORT) | (1L << MDO) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LCASE - 73)) | (1L << (Bang - 73)) | (1L << (Tilde - 73)) | (1L << (DDollar - 73)) | (1L << (Dollar - 73)) | (1L << (Quote - 73)) | (1L << (DoubleQuote - 73)) | (1L << (ReverseSlash - 73)) | (1L << (AopenParen - 73)) | (1L << (TopenTexpQuote - 73)) | (1L << (TopenExpQuote - 73)) | (1L << (TopenPatQuote - 73)) | (1L << (TopenTypQoute - 73)) | (1L << (TopenDecQoute - 73)) | (1L << (OpenBoxParen - 73)) | (1L << (OpenRoundBracket - 73)) | (1L << (OpenSquareBracket - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (VARID - 73)) | (1L << (CONID - 73)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (DECIMAL - 138)) | (1L << (OCTAL - 138)) | (1L << (HEXADECIMAL - 138)) | (1L << (FLOAT - 138)))) != 0) );
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

	public static class FpatContext extends ParserRuleContext {
		public QvarContext qvar() {
			return getRuleContext(QvarContext.class,0);
		}
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public FpatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFpat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FpatContext fpat() throws RecognitionException {
		FpatContext _localctx = new FpatContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_fpat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2518);
			qvar();
			setState(2519);
			match(Eq);
			setState(2520);
			pat();
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

	public static class StmtlistContext extends ParserRuleContext {
		public Open_Context open_() {
			return getRuleContext(Open_Context.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public StmtlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitStmtlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtlistContext stmtlist() throws RecognitionException {
		StmtlistContext _localctx = new StmtlistContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_stmtlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2522);
			open_();
			setState(2524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << CASE) | (1L << DO) | (1L << HIDING) | (1L << IF) | (1L << LET) | (1L << QUALIFIED) | (1L << WILDCARD) | (1L << EXPORT) | (1L << MDO) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << REC) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LCASE - 73)) | (1L << (Bang - 73)) | (1L << (Minus - 73)) | (1L << (Tilde - 73)) | (1L << (DDollar - 73)) | (1L << (Dollar - 73)) | (1L << (Semi - 73)) | (1L << (Quote - 73)) | (1L << (DoubleQuote - 73)) | (1L << (ReverseSlash - 73)) | (1L << (AopenParen - 73)) | (1L << (TopenTexpQuote - 73)) | (1L << (TopenExpQuote - 73)) | (1L << (TopenPatQuote - 73)) | (1L << (TopenTypQoute - 73)) | (1L << (TopenDecQoute - 73)) | (1L << (OpenBoxParen - 73)) | (1L << (OpenRoundBracket - 73)) | (1L << (OpenSquareBracket - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (VARID - 73)) | (1L << (CONID - 73)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (SEMI - 137)) | (1L << (DECIMAL - 137)) | (1L << (OCTAL - 137)) | (1L << (HEXADECIMAL - 137)) | (1L << (FLOAT - 137)))) != 0)) {
				{
				setState(2523);
				stmts();
				}
			}

			setState(2526);
			close();
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

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_stmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2528);
			stmt();
			setState(2538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2530); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2529);
							semi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2532); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(2534);
					stmt();
					}
					} 
				}
				setState(2540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			setState(2544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi || _la==SEMI) {
				{
				{
				setState(2541);
				semi();
				}
				}
				setState(2546);
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

	public static class StmtContext extends ParserRuleContext {
		public QualContext qual() {
			return getRuleContext(QualContext.class,0);
		}
		public TerminalNode REC() { return getToken(HaskellParser.REC, 0); }
		public StmtlistContext stmtlist() {
			return getRuleContext(StmtlistContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_stmt);
		try {
			int _alt;
			setState(2555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case CASE:
			case DO:
			case HIDING:
			case IF:
			case LET:
			case QUALIFIED:
			case WILDCARD:
			case EXPORT:
			case MDO:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case LCASE:
			case Bang:
			case Minus:
			case Tilde:
			case DDollar:
			case Dollar:
			case Quote:
			case DoubleQuote:
			case ReverseSlash:
			case AopenParen:
			case TopenTexpQuote:
			case TopenExpQuote:
			case TopenPatQuote:
			case TopenTypQoute:
			case TopenDecQoute:
			case OpenBoxParen:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case CHAR:
			case STRING:
			case VARID:
			case CONID:
			case DECIMAL:
			case OCTAL:
			case HEXADECIMAL:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2547);
				qual();
				}
				break;
			case REC:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2548);
				match(REC);
				setState(2549);
				stmtlist();
				}
				}
				break;
			case Semi:
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(2551); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2550);
						semi();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2553); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class QualContext extends ParserRuleContext {
		public BindpatContext bindpat() {
			return getRuleContext(BindpatContext.class,0);
		}
		public TerminalNode Revarrow() { return getToken(HaskellParser.Revarrow, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public BindsContext binds() {
			return getRuleContext(BindsContext.class,0);
		}
		public QualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualContext qual() throws RecognitionException {
		QualContext _localctx = new QualContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_qual);
		try {
			setState(2564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2557);
				bindpat();
				setState(2558);
				match(Revarrow);
				setState(2559);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2561);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2562);
				match(LET);
				setState(2563);
				binds();
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

	public static class FbindsContext extends ParserRuleContext {
		public List<FbindContext> fbind() {
			return getRuleContexts(FbindContext.class);
		}
		public FbindContext fbind(int i) {
			return getRuleContext(FbindContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public TerminalNode DoubleDot() { return getToken(HaskellParser.DoubleDot, 0); }
		public FbindsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fbinds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFbinds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FbindsContext fbinds() throws RecognitionException {
		FbindsContext _localctx = new FbindsContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_fbinds);
		int _la;
		try {
			setState(2575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case HIDING:
			case QUALIFIED:
			case EXPORT:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case OpenRoundBracket:
			case VARID:
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2566);
				fbind();
				setState(2571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(2567);
					match(Comma);
					setState(2568);
					fbind();
					}
					}
					setState(2573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case DoubleDot:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2574);
				match(DoubleDot);
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

	public static class FbindContext extends ParserRuleContext {
		public QvarContext qvar() {
			return getRuleContext(QvarContext.class,0);
		}
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FbindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fbind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFbind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FbindContext fbind() throws RecognitionException {
		FbindContext _localctx = new FbindContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_fbind);
		try {
			setState(2582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2577);
				qvar();
				setState(2578);
				match(Eq);
				setState(2579);
				exp();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2581);
				qvar();
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

	public static class DbindsContext extends ParserRuleContext {
		public List<DbindContext> dbind() {
			return getRuleContexts(DbindContext.class);
		}
		public DbindContext dbind(int i) {
			return getRuleContext(DbindContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public DbindsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbinds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDbinds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbindsContext dbinds() throws RecognitionException {
		DbindsContext _localctx = new DbindsContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_dbinds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			dbind();
			{
			setState(2586); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2585);
				semi();
				}
				}
				setState(2588); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Semi || _la==SEMI );
			setState(2590);
			dbind();
			}
			setState(2595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi || _la==SEMI) {
				{
				{
				setState(2592);
				semi();
				}
				}
				setState(2597);
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

	public static class DbindContext extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DbindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDbind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbindContext dbind() throws RecognitionException {
		DbindContext _localctx = new DbindContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_dbind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2598);
			varid();
			setState(2599);
			match(Eq);
			setState(2600);
			exp();
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

	public static class Name_boolformula_optContext extends ParserRuleContext {
		public List<Name_boolformula_andContext> name_boolformula_and() {
			return getRuleContexts(Name_boolformula_andContext.class);
		}
		public Name_boolformula_andContext name_boolformula_and(int i) {
			return getRuleContext(Name_boolformula_andContext.class,i);
		}
		public List<TerminalNode> Pipe() { return getTokens(HaskellParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(HaskellParser.Pipe, i);
		}
		public Name_boolformula_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_boolformula_opt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitName_boolformula_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_boolformula_optContext name_boolformula_opt() throws RecognitionException {
		Name_boolformula_optContext _localctx = new Name_boolformula_optContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_name_boolformula_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2602);
			name_boolformula_and();
			setState(2607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(2603);
				match(Pipe);
				setState(2604);
				name_boolformula_and();
				}
				}
				setState(2609);
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

	public static class Name_boolformula_andContext extends ParserRuleContext {
		public Name_boolformula_and_listContext name_boolformula_and_list() {
			return getRuleContext(Name_boolformula_and_listContext.class,0);
		}
		public Name_boolformula_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_boolformula_and; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitName_boolformula_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_boolformula_andContext name_boolformula_and() throws RecognitionException {
		Name_boolformula_andContext _localctx = new Name_boolformula_andContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_name_boolformula_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2610);
			name_boolformula_and_list();
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

	public static class Name_boolformula_and_listContext extends ParserRuleContext {
		public List<Name_boolformula_atomContext> name_boolformula_atom() {
			return getRuleContexts(Name_boolformula_atomContext.class);
		}
		public Name_boolformula_atomContext name_boolformula_atom(int i) {
			return getRuleContext(Name_boolformula_atomContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public Name_boolformula_and_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_boolformula_and_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitName_boolformula_and_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_boolformula_and_listContext name_boolformula_and_list() throws RecognitionException {
		Name_boolformula_and_listContext _localctx = new Name_boolformula_and_listContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_name_boolformula_and_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			name_boolformula_atom();
			setState(2617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2613);
				match(Comma);
				setState(2614);
				name_boolformula_atom();
				}
				}
				setState(2619);
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

	public static class Name_boolformula_atomContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public Name_boolformula_optContext name_boolformula_opt() {
			return getRuleContext(Name_boolformula_optContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public Name_varContext name_var() {
			return getRuleContext(Name_varContext.class,0);
		}
		public Name_boolformula_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_boolformula_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitName_boolformula_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_boolformula_atomContext name_boolformula_atom() throws RecognitionException {
		Name_boolformula_atomContext _localctx = new Name_boolformula_atomContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_name_boolformula_atom);
		try {
			setState(2625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2620);
				match(OpenRoundBracket);
				setState(2621);
				name_boolformula_opt();
				setState(2622);
				match(CloseRoundBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2624);
				name_var();
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

	public static class NamelistContext extends ParserRuleContext {
		public List<Name_varContext> name_var() {
			return getRuleContexts(Name_varContext.class);
		}
		public Name_varContext name_var(int i) {
			return getRuleContext(Name_varContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitNamelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_namelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
			name_var();
			setState(2632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2628);
				match(Comma);
				setState(2629);
				name_var();
				}
				}
				setState(2634);
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

	public static class Name_varContext extends ParserRuleContext {
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public Name_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitName_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_varContext name_var() throws RecognitionException {
		Name_varContext _localctx = new Name_varContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_name_var);
		try {
			setState(2637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2635);
				var_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2636);
				con();
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

	public static class Qcon_nowiredlistContext extends ParserRuleContext {
		public Gen_qconContext gen_qcon() {
			return getRuleContext(Gen_qconContext.class,0);
		}
		public Sysdcon_nolistContext sysdcon_nolist() {
			return getRuleContext(Sysdcon_nolistContext.class,0);
		}
		public Qcon_nowiredlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qcon_nowiredlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQcon_nowiredlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qcon_nowiredlistContext qcon_nowiredlist() throws RecognitionException {
		Qcon_nowiredlistContext _localctx = new Qcon_nowiredlistContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_qcon_nowiredlist);
		try {
			setState(2641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2639);
				gen_qcon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2640);
				sysdcon_nolist();
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

	public static class QconContext extends ParserRuleContext {
		public Gen_qconContext gen_qcon() {
			return getRuleContext(Gen_qconContext.class,0);
		}
		public SysdconContext sysdcon() {
			return getRuleContext(SysdconContext.class,0);
		}
		public QconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qcon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QconContext qcon() throws RecognitionException {
		QconContext _localctx = new QconContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_qcon);
		try {
			setState(2645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2643);
				gen_qcon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2644);
				sysdcon();
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

	public static class Gen_qconContext extends ParserRuleContext {
		public QconidContext qconid() {
			return getRuleContext(QconidContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public QconsymContext qconsym() {
			return getRuleContext(QconsymContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public Gen_qconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_qcon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGen_qcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen_qconContext gen_qcon() throws RecognitionException {
		Gen_qconContext _localctx = new Gen_qconContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_gen_qcon);
		try {
			setState(2652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2647);
				qconid();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2648);
				match(OpenRoundBracket);
				setState(2649);
				qconsym();
				setState(2650);
				match(CloseRoundBracket);
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

	public static class ConContext extends ParserRuleContext {
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public ConsymContext consym() {
			return getRuleContext(ConsymContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public SysdconContext sysdcon() {
			return getRuleContext(SysdconContext.class,0);
		}
		public ConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_con; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConContext con() throws RecognitionException {
		ConContext _localctx = new ConContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_con);
		try {
			setState(2660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2654);
				conid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2655);
				match(OpenRoundBracket);
				setState(2656);
				consym();
				setState(2657);
				match(CloseRoundBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2659);
				sysdcon();
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

	public static class Con_listContext extends ParserRuleContext {
		public List<ConContext> con() {
			return getRuleContexts(ConContext.class);
		}
		public ConContext con(int i) {
			return getRuleContext(ConContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public Con_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_con_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCon_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Con_listContext con_list() throws RecognitionException {
		Con_listContext _localctx = new Con_listContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_con_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			con();
			setState(2667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2663);
				match(Comma);
				setState(2664);
				con();
				}
				}
				setState(2669);
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

	public static class Sysdcon_nolistContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public CommasContext commas() {
			return getRuleContext(CommasContext.class,0);
		}
		public TerminalNode OpenBoxParen() { return getToken(HaskellParser.OpenBoxParen, 0); }
		public TerminalNode CloseBoxParen() { return getToken(HaskellParser.CloseBoxParen, 0); }
		public Sysdcon_nolistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sysdcon_nolist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSysdcon_nolist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sysdcon_nolistContext sysdcon_nolist() throws RecognitionException {
		Sysdcon_nolistContext _localctx = new Sysdcon_nolistContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_sysdcon_nolist);
		try {
			setState(2682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2670);
				match(OpenRoundBracket);
				setState(2671);
				match(CloseRoundBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2672);
				match(OpenRoundBracket);
				setState(2673);
				commas();
				setState(2674);
				match(CloseRoundBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2676);
				match(OpenBoxParen);
				setState(2677);
				match(CloseBoxParen);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2678);
				match(OpenBoxParen);
				setState(2679);
				commas();
				setState(2680);
				match(CloseBoxParen);
				}
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

	public static class SysdconContext extends ParserRuleContext {
		public Sysdcon_nolistContext sysdcon_nolist() {
			return getRuleContext(Sysdcon_nolistContext.class,0);
		}
		public TerminalNode OpenSquareBracket() { return getToken(HaskellParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(HaskellParser.CloseSquareBracket, 0); }
		public SysdconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sysdcon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSysdcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SysdconContext sysdcon() throws RecognitionException {
		SysdconContext _localctx = new SysdconContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_sysdcon);
		try {
			setState(2687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBoxParen:
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(2684);
				sysdcon_nolist();
				}
				break;
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2685);
				match(OpenSquareBracket);
				setState(2686);
				match(CloseSquareBracket);
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

	public static class ConopContext extends ParserRuleContext {
		public ConsymContext consym() {
			return getRuleContext(ConsymContext.class,0);
		}
		public List<TerminalNode> BackQuote() { return getTokens(HaskellParser.BackQuote); }
		public TerminalNode BackQuote(int i) {
			return getToken(HaskellParser.BackQuote, i);
		}
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public ConopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConopContext conop() throws RecognitionException {
		ConopContext _localctx = new ConopContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_conop);
		try {
			setState(2694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				enterOuterAlt(_localctx, 1);
				{
				setState(2689);
				consym();
				}
				break;
			case BackQuote:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2690);
				match(BackQuote);
				setState(2691);
				conid();
				setState(2692);
				match(BackQuote);
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

	public static class QconopContext extends ParserRuleContext {
		public GconsymContext gconsym() {
			return getRuleContext(GconsymContext.class,0);
		}
		public List<TerminalNode> BackQuote() { return getTokens(HaskellParser.BackQuote); }
		public TerminalNode BackQuote(int i) {
			return getToken(HaskellParser.BackQuote, i);
		}
		public QconidContext qconid() {
			return getRuleContext(QconidContext.class,0);
		}
		public QconopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qconop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQconop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QconopContext qconop() throws RecognitionException {
		QconopContext _localctx = new QconopContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_qconop);
		try {
			setState(2701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2696);
				gconsym();
				}
				break;
			case BackQuote:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2697);
				match(BackQuote);
				setState(2698);
				qconid();
				setState(2699);
				match(BackQuote);
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

	public static class GconsymContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(HaskellParser.Colon, 0); }
		public QconsymContext qconsym() {
			return getRuleContext(QconsymContext.class,0);
		}
		public GconsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gconsym; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGconsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GconsymContext gconsym() throws RecognitionException {
		GconsymContext _localctx = new GconsymContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_gconsym);
		try {
			setState(2705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2703);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2704);
				qconsym();
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

	public static class GtyconContext extends ParserRuleContext {
		public NtgtyconContext ntgtycon() {
			return getRuleContext(NtgtyconContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public TerminalNode OpenBoxParen() { return getToken(HaskellParser.OpenBoxParen, 0); }
		public TerminalNode CloseBoxParen() { return getToken(HaskellParser.CloseBoxParen, 0); }
		public GtyconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtycon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGtycon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtyconContext gtycon() throws RecognitionException {
		GtyconContext _localctx = new GtyconContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_gtycon);
		try {
			setState(2712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2707);
				ntgtycon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2708);
				match(OpenRoundBracket);
				setState(2709);
				match(CloseRoundBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2710);
				match(OpenBoxParen);
				setState(2711);
				match(CloseBoxParen);
				}
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

	public static class NtgtyconContext extends ParserRuleContext {
		public OqtyconContext oqtycon() {
			return getRuleContext(OqtyconContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public CommasContext commas() {
			return getRuleContext(CommasContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public TerminalNode OpenBoxParen() { return getToken(HaskellParser.OpenBoxParen, 0); }
		public TerminalNode CloseBoxParen() { return getToken(HaskellParser.CloseBoxParen, 0); }
		public TerminalNode Arrow() { return getToken(HaskellParser.Arrow, 0); }
		public TerminalNode OpenSquareBracket() { return getToken(HaskellParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(HaskellParser.CloseSquareBracket, 0); }
		public NtgtyconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntgtycon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitNtgtycon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NtgtyconContext ntgtycon() throws RecognitionException {
		NtgtyconContext _localctx = new NtgtyconContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_ntgtycon);
		try {
			setState(2728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2714);
				oqtycon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2715);
				match(OpenRoundBracket);
				setState(2716);
				commas();
				setState(2717);
				match(CloseRoundBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2719);
				match(OpenBoxParen);
				setState(2720);
				commas();
				setState(2721);
				match(CloseBoxParen);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(2723);
				match(OpenRoundBracket);
				setState(2724);
				match(Arrow);
				setState(2725);
				match(CloseRoundBracket);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(2726);
				match(OpenSquareBracket);
				setState(2727);
				match(CloseSquareBracket);
				}
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

	public static class OqtyconContext extends ParserRuleContext {
		public QtyconContext qtycon() {
			return getRuleContext(QtyconContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public QtyconsymContext qtyconsym() {
			return getRuleContext(QtyconsymContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public OqtyconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oqtycon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOqtycon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OqtyconContext oqtycon() throws RecognitionException {
		OqtyconContext _localctx = new OqtyconContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_oqtycon);
		try {
			setState(2735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2730);
				qtycon();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2731);
				match(OpenRoundBracket);
				setState(2732);
				qtyconsym();
				setState(2733);
				match(CloseRoundBracket);
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

	public static class QtyconopContext extends ParserRuleContext {
		public QtyconsymContext qtyconsym() {
			return getRuleContext(QtyconsymContext.class,0);
		}
		public List<TerminalNode> BackQuote() { return getTokens(HaskellParser.BackQuote); }
		public TerminalNode BackQuote(int i) {
			return getToken(HaskellParser.BackQuote, i);
		}
		public QtyconContext qtycon() {
			return getRuleContext(QtyconContext.class,0);
		}
		public QtyconopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtyconop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQtyconop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QtyconopContext qtyconop() throws RecognitionException {
		QtyconopContext _localctx = new QtyconopContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_qtyconop);
		try {
			setState(2742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Hash:
			case Less:
			case Greater:
			case Ampersand:
			case Pipe:
			case Bang:
			case Caret:
			case Plus:
			case Minus:
			case Asterisk:
			case Percent:
			case Divide:
			case Tilde:
			case Atsign:
			case Dollar:
			case Dot:
			case QuestionMark:
			case Colon:
			case Eq:
			case Equal:
			case ReverseSlash:
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2737);
				qtyconsym();
				}
				break;
			case BackQuote:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2738);
				match(BackQuote);
				setState(2739);
				qtycon();
				setState(2740);
				match(BackQuote);
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

	public static class QtyconContext extends ParserRuleContext {
		public TyconContext tycon() {
			return getRuleContext(TyconContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public QtyconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtycon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQtycon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QtyconContext qtycon() throws RecognitionException {
		QtyconContext _localctx = new QtyconContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_qtycon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2744);
				modid();
				setState(2745);
				match(Dot);
				}
				break;
			}
			setState(2749);
			tycon();
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

	public static class TyconContext extends ParserRuleContext {
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public TyconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tycon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTycon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyconContext tycon() throws RecognitionException {
		TyconContext _localctx = new TyconContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_tycon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2751);
			conid();
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

	public static class QtyconsymContext extends ParserRuleContext {
		public QconsymContext qconsym() {
			return getRuleContext(QconsymContext.class,0);
		}
		public QvarsymContext qvarsym() {
			return getRuleContext(QvarsymContext.class,0);
		}
		public TyconsymContext tyconsym() {
			return getRuleContext(TyconsymContext.class,0);
		}
		public QtyconsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtyconsym; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQtyconsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QtyconsymContext qtyconsym() throws RecognitionException {
		QtyconsymContext _localctx = new QtyconsymContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_qtyconsym);
		try {
			setState(2756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2753);
				qconsym();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2754);
				qvarsym();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2755);
				tyconsym();
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

	public static class TyconsymContext extends ParserRuleContext {
		public ConsymContext consym() {
			return getRuleContext(ConsymContext.class,0);
		}
		public VarsymContext varsym() {
			return getRuleContext(VarsymContext.class,0);
		}
		public TerminalNode Colon() { return getToken(HaskellParser.Colon, 0); }
		public TerminalNode Minus() { return getToken(HaskellParser.Minus, 0); }
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public TyconsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyconsym; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTyconsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyconsymContext tyconsym() throws RecognitionException {
		TyconsymContext _localctx = new TyconsymContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_tyconsym);
		try {
			setState(2763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2758);
				consym();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2759);
				varsym();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2760);
				match(Colon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2761);
				match(Minus);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2762);
				match(Dot);
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

	public static class OpContext extends ParserRuleContext {
		public VaropContext varop() {
			return getRuleContext(VaropContext.class,0);
		}
		public ConopContext conop() {
			return getRuleContext(ConopContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_op);
		try {
			setState(2767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2765);
				varop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2766);
				conop();
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

	public static class VaropContext extends ParserRuleContext {
		public VarsymContext varsym() {
			return getRuleContext(VarsymContext.class,0);
		}
		public List<TerminalNode> BackQuote() { return getTokens(HaskellParser.BackQuote); }
		public TerminalNode BackQuote(int i) {
			return getToken(HaskellParser.BackQuote, i);
		}
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public VaropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVarop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaropContext varop() throws RecognitionException {
		VaropContext _localctx = new VaropContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_varop);
		try {
			setState(2774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Hash:
			case Less:
			case Greater:
			case Ampersand:
			case Pipe:
			case Bang:
			case Caret:
			case Plus:
			case Minus:
			case Asterisk:
			case Percent:
			case Divide:
			case Tilde:
			case Atsign:
			case Dollar:
			case Dot:
			case QuestionMark:
			case Colon:
			case Eq:
			case Equal:
			case ReverseSlash:
				enterOuterAlt(_localctx, 1);
				{
				setState(2769);
				varsym();
				}
				break;
			case BackQuote:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2770);
				match(BackQuote);
				setState(2771);
				varid();
				setState(2772);
				match(BackQuote);
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

	public static class QopContext extends ParserRuleContext {
		public QvaropContext qvarop() {
			return getRuleContext(QvaropContext.class,0);
		}
		public QconopContext qconop() {
			return getRuleContext(QconopContext.class,0);
		}
		public QopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QopContext qop() throws RecognitionException {
		QopContext _localctx = new QopContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_qop);
		try {
			setState(2778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2776);
				qvarop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2777);
				qconop();
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

	public static class QopmContext extends ParserRuleContext {
		public QvaropmContext qvaropm() {
			return getRuleContext(QvaropmContext.class,0);
		}
		public QconopContext qconop() {
			return getRuleContext(QconopContext.class,0);
		}
		public Hole_opContext hole_op() {
			return getRuleContext(Hole_opContext.class,0);
		}
		public QopmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qopm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQopm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QopmContext qopm() throws RecognitionException {
		QopmContext _localctx = new QopmContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_qopm);
		try {
			setState(2783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2780);
				qvaropm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2781);
				qconop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2782);
				hole_op();
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

	public static class Hole_opContext extends ParserRuleContext {
		public List<TerminalNode> BackQuote() { return getTokens(HaskellParser.BackQuote); }
		public TerminalNode BackQuote(int i) {
			return getToken(HaskellParser.BackQuote, i);
		}
		public TerminalNode WILDCARD() { return getToken(HaskellParser.WILDCARD, 0); }
		public Hole_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hole_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitHole_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hole_opContext hole_op() throws RecognitionException {
		Hole_opContext _localctx = new Hole_opContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_hole_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2785);
			match(BackQuote);
			setState(2786);
			match(WILDCARD);
			setState(2787);
			match(BackQuote);
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

	public static class QvaropContext extends ParserRuleContext {
		public QvarsymContext qvarsym() {
			return getRuleContext(QvarsymContext.class,0);
		}
		public List<TerminalNode> BackQuote() { return getTokens(HaskellParser.BackQuote); }
		public TerminalNode BackQuote(int i) {
			return getToken(HaskellParser.BackQuote, i);
		}
		public QvaridContext qvarid() {
			return getRuleContext(QvaridContext.class,0);
		}
		public QvaropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvarop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQvarop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QvaropContext qvarop() throws RecognitionException {
		QvaropContext _localctx = new QvaropContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_qvarop);
		try {
			setState(2794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Hash:
			case Less:
			case Greater:
			case Ampersand:
			case Pipe:
			case Bang:
			case Caret:
			case Plus:
			case Minus:
			case Asterisk:
			case Percent:
			case Divide:
			case Tilde:
			case Atsign:
			case Dollar:
			case Dot:
			case QuestionMark:
			case Colon:
			case Eq:
			case Equal:
			case ReverseSlash:
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2789);
				qvarsym();
				}
				break;
			case BackQuote:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2790);
				match(BackQuote);
				setState(2791);
				qvarid();
				setState(2792);
				match(BackQuote);
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

	public static class QvaropmContext extends ParserRuleContext {
		public Qvarsym_no_minusContext qvarsym_no_minus() {
			return getRuleContext(Qvarsym_no_minusContext.class,0);
		}
		public List<TerminalNode> BackQuote() { return getTokens(HaskellParser.BackQuote); }
		public TerminalNode BackQuote(int i) {
			return getToken(HaskellParser.BackQuote, i);
		}
		public QvaridContext qvarid() {
			return getRuleContext(QvaridContext.class,0);
		}
		public QvaropmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvaropm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQvaropm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QvaropmContext qvaropm() throws RecognitionException {
		QvaropmContext _localctx = new QvaropmContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_qvaropm);
		try {
			setState(2801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Hash:
			case Less:
			case Greater:
			case Ampersand:
			case Pipe:
			case Bang:
			case Caret:
			case Plus:
			case Minus:
			case Asterisk:
			case Percent:
			case Divide:
			case Tilde:
			case Atsign:
			case Dollar:
			case Dot:
			case QuestionMark:
			case Colon:
			case Eq:
			case Equal:
			case ReverseSlash:
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2796);
				qvarsym_no_minus();
				}
				break;
			case BackQuote:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2797);
				match(BackQuote);
				setState(2798);
				qvarid();
				setState(2799);
				match(BackQuote);
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

	public static class TyvarContext extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TyvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyvar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTyvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyvarContext tyvar() throws RecognitionException {
		TyvarContext _localctx = new TyvarContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_tyvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2803);
			varid();
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

	public static class TyvaropContext extends ParserRuleContext {
		public List<TerminalNode> BackQuote() { return getTokens(HaskellParser.BackQuote); }
		public TerminalNode BackQuote(int i) {
			return getToken(HaskellParser.BackQuote, i);
		}
		public TyvaridContext tyvarid() {
			return getRuleContext(TyvaridContext.class,0);
		}
		public TyvaropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyvarop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTyvarop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyvaropContext tyvarop() throws RecognitionException {
		TyvaropContext _localctx = new TyvaropContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_tyvarop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2805);
			match(BackQuote);
			setState(2806);
			tyvarid();
			setState(2807);
			match(BackQuote);
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

	public static class TyvaridContext extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public Special_idContext special_id() {
			return getRuleContext(Special_idContext.class,0);
		}
		public TerminalNode UNSAFE() { return getToken(HaskellParser.UNSAFE, 0); }
		public TerminalNode SAFE() { return getToken(HaskellParser.SAFE, 0); }
		public TerminalNode INTERRUPTIBLE() { return getToken(HaskellParser.INTERRUPTIBLE, 0); }
		public TyvaridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyvarid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTyvarid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyvaridContext tyvarid() throws RecognitionException {
		TyvaridContext _localctx = new TyvaridContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_tyvarid);
		try {
			setState(2814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2809);
				varid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2810);
				special_id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2811);
				match(UNSAFE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2812);
				match(SAFE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2813);
				match(INTERRUPTIBLE);
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

	public static class TyclsContext extends ParserRuleContext {
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public TyclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tycls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTycls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyclsContext tycls() throws RecognitionException {
		TyclsContext _localctx = new TyclsContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_tycls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
			conid();
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

	public static class QtyclsContext extends ParserRuleContext {
		public TyclsContext tycls() {
			return getRuleContext(TyclsContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public QtyclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtycls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQtycls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QtyclsContext qtycls() throws RecognitionException {
		QtyclsContext _localctx = new QtyclsContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_qtycls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				{
				setState(2818);
				modid();
				setState(2819);
				match(Dot);
				}
				break;
			}
			setState(2823);
			tycls();
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

	public static class Var_Context extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public VarsymContext varsym() {
			return getRuleContext(VarsymContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public Var_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVar_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_Context var_() throws RecognitionException {
		Var_Context _localctx = new Var_Context(_ctx, getState());
		enterRule(_localctx, 458, RULE_var_);
		try {
			setState(2830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case HIDING:
			case QUALIFIED:
			case EXPORT:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case VARID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2825);
				varid();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2826);
				match(OpenRoundBracket);
				setState(2827);
				varsym();
				setState(2828);
				match(CloseRoundBracket);
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

	public static class QvarContext extends ParserRuleContext {
		public QvaridContext qvarid() {
			return getRuleContext(QvaridContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public QvarsymContext qvarsym() {
			return getRuleContext(QvarsymContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public QvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QvarContext qvar() throws RecognitionException {
		QvarContext _localctx = new QvarContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_qvar);
		try {
			setState(2837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case HIDING:
			case QUALIFIED:
			case EXPORT:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case STOCK:
			case ANYCLASS:
			case VIA:
			case VARID:
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2832);
				qvarid();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2833);
				match(OpenRoundBracket);
				setState(2834);
				qvarsym();
				setState(2835);
				match(CloseRoundBracket);
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

	public static class QvaridContext extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public QvaridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvarid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQvarid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QvaridContext qvarid() throws RecognitionException {
		QvaridContext _localctx = new QvaridContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_qvarid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONID) {
				{
				setState(2839);
				modid();
				setState(2840);
				match(Dot);
				}
			}

			setState(2844);
			varid();
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

	public static class VaridContext extends ParserRuleContext {
		public TerminalNode VARID() { return getToken(HaskellParser.VARID, 0); }
		public Special_idContext special_id() {
			return getRuleContext(Special_idContext.class,0);
		}
		public List<TerminalNode> Hash() { return getTokens(HaskellParser.Hash); }
		public TerminalNode Hash(int i) {
			return getToken(HaskellParser.Hash, i);
		}
		public VaridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVarid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaridContext varid() throws RecognitionException {
		VaridContext _localctx = new VaridContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_varid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARID:
				{
				setState(2846);
				match(VARID);
				}
				break;
			case AS:
			case HIDING:
			case QUALIFIED:
			case EXPORT:
			case STDCALL:
			case CCALL:
			case CAPI:
			case JSCALL:
			case STOCK:
			case ANYCLASS:
			case VIA:
				{
				setState(2847);
				special_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2853);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2850);
					match(Hash);
					}
					} 
				}
				setState(2855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
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

	public static class QvarsymContext extends ParserRuleContext {
		public VarsymContext varsym() {
			return getRuleContext(VarsymContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public QvarsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvarsym; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQvarsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QvarsymContext qvarsym() throws RecognitionException {
		QvarsymContext _localctx = new QvarsymContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_qvarsym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONID) {
				{
				setState(2856);
				modid();
				setState(2857);
				match(Dot);
				}
			}

			setState(2861);
			varsym();
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

	public static class Qvarsym_no_minusContext extends ParserRuleContext {
		public Varsym_no_minusContext varsym_no_minus() {
			return getRuleContext(Varsym_no_minusContext.class,0);
		}
		public QvarsymContext qvarsym() {
			return getRuleContext(QvarsymContext.class,0);
		}
		public Qvarsym_no_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvarsym_no_minus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQvarsym_no_minus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qvarsym_no_minusContext qvarsym_no_minus() throws RecognitionException {
		Qvarsym_no_minusContext _localctx = new Qvarsym_no_minusContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_qvarsym_no_minus);
		try {
			setState(2865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2863);
				varsym_no_minus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2864);
				qvarsym();
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

	public static class VarsymContext extends ParserRuleContext {
		public Varsym_no_minusContext varsym_no_minus() {
			return getRuleContext(Varsym_no_minusContext.class,0);
		}
		public TerminalNode Minus() { return getToken(HaskellParser.Minus, 0); }
		public VarsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsym; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVarsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsymContext varsym() throws RecognitionException {
		VarsymContext _localctx = new VarsymContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_varsym);
		try {
			setState(2869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Hash:
			case Less:
			case Greater:
			case Ampersand:
			case Pipe:
			case Bang:
			case Caret:
			case Plus:
			case Asterisk:
			case Percent:
			case Divide:
			case Tilde:
			case Atsign:
			case Dollar:
			case Dot:
			case QuestionMark:
			case Colon:
			case Eq:
			case Equal:
			case ReverseSlash:
				enterOuterAlt(_localctx, 1);
				{
				setState(2867);
				varsym_no_minus();
				}
				break;
			case Minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(2868);
				match(Minus);
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

	public static class Varsym_no_minusContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(HaskellParser.Equal, 0); }
		public List<AscSymbolContext> ascSymbol() {
			return getRuleContexts(AscSymbolContext.class);
		}
		public AscSymbolContext ascSymbol(int i) {
			return getRuleContext(AscSymbolContext.class,i);
		}
		public Varsym_no_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsym_no_minus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVarsym_no_minus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varsym_no_minusContext varsym_no_minus() throws RecognitionException {
		Varsym_no_minusContext _localctx = new Varsym_no_minusContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_varsym_no_minus);
		try {
			int _alt;
			setState(2877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				enterOuterAlt(_localctx, 1);
				{
				setState(2871);
				match(Equal);
				}
				break;
			case Hash:
			case Less:
			case Greater:
			case Ampersand:
			case Pipe:
			case Bang:
			case Caret:
			case Plus:
			case Asterisk:
			case Percent:
			case Divide:
			case Tilde:
			case Atsign:
			case Dollar:
			case Dot:
			case QuestionMark:
			case Colon:
			case Eq:
			case ReverseSlash:
				enterOuterAlt(_localctx, 2);
				{
				setState(2873); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2872);
						ascSymbol();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2875); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Special_idContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(HaskellParser.AS, 0); }
		public TerminalNode QUALIFIED() { return getToken(HaskellParser.QUALIFIED, 0); }
		public TerminalNode HIDING() { return getToken(HaskellParser.HIDING, 0); }
		public TerminalNode EXPORT() { return getToken(HaskellParser.EXPORT, 0); }
		public TerminalNode STDCALL() { return getToken(HaskellParser.STDCALL, 0); }
		public TerminalNode CCALL() { return getToken(HaskellParser.CCALL, 0); }
		public TerminalNode CAPI() { return getToken(HaskellParser.CAPI, 0); }
		public TerminalNode JSCALL() { return getToken(HaskellParser.JSCALL, 0); }
		public TerminalNode STOCK() { return getToken(HaskellParser.STOCK, 0); }
		public TerminalNode ANYCLASS() { return getToken(HaskellParser.ANYCLASS, 0); }
		public TerminalNode VIA() { return getToken(HaskellParser.VIA, 0); }
		public Special_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSpecial_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_idContext special_id() throws RecognitionException {
		Special_idContext _localctx = new Special_idContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_special_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2879);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << HIDING) | (1L << QUALIFIED) | (1L << EXPORT) | (1L << STDCALL) | (1L << CCALL) | (1L << CAPI) | (1L << JSCALL) | (1L << STOCK) | (1L << ANYCLASS) | (1L << VIA))) != 0)) ) {
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

	public static class QconidContext extends ParserRuleContext {
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public QconidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qconid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQconid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QconidContext qconid() throws RecognitionException {
		QconidContext _localctx = new QconidContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_qconid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				{
				setState(2881);
				modid();
				setState(2882);
				match(Dot);
				}
				break;
			}
			setState(2886);
			conid();
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

	public static class ConidContext extends ParserRuleContext {
		public TerminalNode CONID() { return getToken(HaskellParser.CONID, 0); }
		public List<TerminalNode> Hash() { return getTokens(HaskellParser.Hash); }
		public TerminalNode Hash(int i) {
			return getToken(HaskellParser.Hash, i);
		}
		public ConidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConidContext conid() throws RecognitionException {
		ConidContext _localctx = new ConidContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_conid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2888);
			match(CONID);
			setState(2892);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2889);
					match(Hash);
					}
					} 
				}
				setState(2894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
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

	public static class QconsymContext extends ParserRuleContext {
		public ConsymContext consym() {
			return getRuleContext(ConsymContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public QconsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qconsym; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQconsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QconsymContext qconsym() throws RecognitionException {
		QconsymContext _localctx = new QconsymContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_qconsym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONID) {
				{
				setState(2895);
				modid();
				setState(2896);
				match(Dot);
				}
			}

			setState(2900);
			consym();
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

	public static class ConsymContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(HaskellParser.Colon, 0); }
		public List<AscSymbolContext> ascSymbol() {
			return getRuleContexts(AscSymbolContext.class);
		}
		public AscSymbolContext ascSymbol(int i) {
			return getRuleContext(AscSymbolContext.class,i);
		}
		public ConsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consym; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsymContext consym() throws RecognitionException {
		ConsymContext _localctx = new ConsymContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_consym);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2902);
			match(Colon);
			setState(2906);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2903);
					ascSymbol();
					}
					} 
				}
				setState(2908);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PfloatContext pfloat() {
			return getRuleContext(PfloatContext.class,0);
		}
		public PcharContext pchar() {
			return getRuleContext(PcharContext.class,0);
		}
		public PstringContext pstring() {
			return getRuleContext(PstringContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_literal);
		try {
			setState(2913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
			case OCTAL:
			case HEXADECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2909);
				integer();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2910);
				pfloat();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(2911);
				pchar();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2912);
				pstring();
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

	public static class Open_Context extends ParserRuleContext {
		public TerminalNode VOCURLY() { return getToken(HaskellParser.VOCURLY, 0); }
		public TerminalNode OCURLY() { return getToken(HaskellParser.OCURLY, 0); }
		public Open_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOpen_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_Context open_() throws RecognitionException {
		Open_Context _localctx = new Open_Context(_ctx, getState());
		enterRule(_localctx, 486, RULE_open_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2915);
			_la = _input.LA(1);
			if ( !(_la==OCURLY || _la==VOCURLY) ) {
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

	public static class CloseContext extends ParserRuleContext {
		public TerminalNode VCCURLY() { return getToken(HaskellParser.VCCURLY, 0); }
		public TerminalNode CCURLY() { return getToken(HaskellParser.CCURLY, 0); }
		public CloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseContext close() throws RecognitionException {
		CloseContext _localctx = new CloseContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_close);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2917);
			_la = _input.LA(1);
			if ( !(_la==CCURLY || _la==VCCURLY) ) {
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

	public static class SemiContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(HaskellParser.Semi, 0); }
		public TerminalNode SEMI() { return getToken(HaskellParser.SEMI, 0); }
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_semi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2919);
			_la = _input.LA(1);
			if ( !(_la==Semi || _la==SEMI) ) {
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

	public static class ModidContext extends ParserRuleContext {
		public List<ConidContext> conid() {
			return getRuleContexts(ConidContext.class);
		}
		public ConidContext conid(int i) {
			return getRuleContext(ConidContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(HaskellParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(HaskellParser.Dot, i);
		}
		public ModidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitModid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModidContext modid() throws RecognitionException {
		ModidContext _localctx = new ModidContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_modid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2926);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2921);
					conid();
					setState(2922);
					match(Dot);
					}
					} 
				}
				setState(2928);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			}
			setState(2929);
			conid();
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

	public static class CommasContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(HaskellParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HaskellParser.Comma, i);
		}
		public CommasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCommas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommasContext commas() throws RecognitionException {
		CommasContext _localctx = new CommasContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_commas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2932); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2931);
				match(Comma);
				}
				}
				setState(2934); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class BarsContext extends ParserRuleContext {
		public List<TerminalNode> Pipe() { return getTokens(HaskellParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(HaskellParser.Pipe, i);
		}
		public BarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitBars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BarsContext bars() throws RecognitionException {
		BarsContext _localctx = new BarsContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_bars);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2937); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2936);
					match(Pipe);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2939); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
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

	public static class SpecialContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(HaskellParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(HaskellParser.CloseRoundBracket, 0); }
		public TerminalNode Comma() { return getToken(HaskellParser.Comma, 0); }
		public TerminalNode Semi() { return getToken(HaskellParser.Semi, 0); }
		public TerminalNode OpenSquareBracket() { return getToken(HaskellParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(HaskellParser.CloseSquareBracket, 0); }
		public TerminalNode BackQuote() { return getToken(HaskellParser.BackQuote, 0); }
		public TerminalNode OCURLY() { return getToken(HaskellParser.OCURLY, 0); }
		public TerminalNode CCURLY() { return getToken(HaskellParser.CCURLY, 0); }
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2941);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (Semi - 100)) | (1L << (Comma - 100)) | (1L << (BackQuote - 100)) | (1L << (OpenRoundBracket - 100)) | (1L << (CloseRoundBracket - 100)) | (1L << (OpenSquareBracket - 100)) | (1L << (CloseSquareBracket - 100)) | (1L << (OCURLY - 100)) | (1L << (CCURLY - 100)))) != 0)) ) {
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

	public static class SymbolContext extends ParserRuleContext {
		public AscSymbolContext ascSymbol() {
			return getRuleContext(AscSymbolContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2943);
			ascSymbol();
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

	public static class AscSymbolContext extends ParserRuleContext {
		public TerminalNode Bang() { return getToken(HaskellParser.Bang, 0); }
		public TerminalNode Hash() { return getToken(HaskellParser.Hash, 0); }
		public TerminalNode Dollar() { return getToken(HaskellParser.Dollar, 0); }
		public TerminalNode Percent() { return getToken(HaskellParser.Percent, 0); }
		public TerminalNode Ampersand() { return getToken(HaskellParser.Ampersand, 0); }
		public TerminalNode Asterisk() { return getToken(HaskellParser.Asterisk, 0); }
		public TerminalNode Plus() { return getToken(HaskellParser.Plus, 0); }
		public TerminalNode Dot() { return getToken(HaskellParser.Dot, 0); }
		public TerminalNode Divide() { return getToken(HaskellParser.Divide, 0); }
		public TerminalNode Less() { return getToken(HaskellParser.Less, 0); }
		public TerminalNode Eq() { return getToken(HaskellParser.Eq, 0); }
		public TerminalNode Greater() { return getToken(HaskellParser.Greater, 0); }
		public TerminalNode QuestionMark() { return getToken(HaskellParser.QuestionMark, 0); }
		public TerminalNode Atsign() { return getToken(HaskellParser.Atsign, 0); }
		public TerminalNode ReverseSlash() { return getToken(HaskellParser.ReverseSlash, 0); }
		public TerminalNode Caret() { return getToken(HaskellParser.Caret, 0); }
		public TerminalNode Pipe() { return getToken(HaskellParser.Pipe, 0); }
		public TerminalNode Tilde() { return getToken(HaskellParser.Tilde, 0); }
		public TerminalNode Colon() { return getToken(HaskellParser.Colon, 0); }
		public AscSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAscSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscSymbolContext ascSymbol() throws RecognitionException {
		AscSymbolContext _localctx = new AscSymbolContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_ascSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2945);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (Hash - 82)) | (1L << (Less - 82)) | (1L << (Greater - 82)) | (1L << (Ampersand - 82)) | (1L << (Pipe - 82)) | (1L << (Bang - 82)) | (1L << (Caret - 82)) | (1L << (Plus - 82)) | (1L << (Asterisk - 82)) | (1L << (Percent - 82)) | (1L << (Divide - 82)) | (1L << (Tilde - 82)) | (1L << (Atsign - 82)) | (1L << (Dollar - 82)) | (1L << (Dot - 82)) | (1L << (QuestionMark - 82)) | (1L << (Colon - 82)) | (1L << (Eq - 82)) | (1L << (ReverseSlash - 82)))) != 0)) ) {
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

	public static class NumContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FractionalContext fractional() {
			return getRuleContext(FractionalContext.class,0);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_num);
		try {
			setState(2949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
			case OCTAL:
			case HEXADECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2947);
				integer();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2948);
				fractional();
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

	public static class FractionalContext extends ParserRuleContext {
		public PfloatContext pfloat() {
			return getRuleContext(PfloatContext.class,0);
		}
		public FractionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fractional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFractional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionalContext fractional() throws RecognitionException {
		FractionalContext _localctx = new FractionalContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_fractional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2951);
			pfloat();
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(HaskellParser.DECIMAL, 0); }
		public TerminalNode OCTAL() { return getToken(HaskellParser.OCTAL, 0); }
		public TerminalNode HEXADECIMAL() { return getToken(HaskellParser.HEXADECIMAL, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2953);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (DECIMAL - 138)) | (1L << (OCTAL - 138)) | (1L << (HEXADECIMAL - 138)))) != 0)) ) {
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

	public static class PfloatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(HaskellParser.FLOAT, 0); }
		public PfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pfloat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPfloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PfloatContext pfloat() throws RecognitionException {
		PfloatContext _localctx = new PfloatContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_pfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2955);
			match(FLOAT);
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

	public static class PcharContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(HaskellParser.CHAR, 0); }
		public PcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pchar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPchar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PcharContext pchar() throws RecognitionException {
		PcharContext _localctx = new PcharContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_pchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2957);
			match(CHAR);
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

	public static class PstringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HaskellParser.STRING, 0); }
		public PstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pstring; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PstringContext pstring() throws RecognitionException {
		PstringContext _localctx = new PstringContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_pstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2959);
			match(STRING);
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

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0090\u0b94\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\3\2\5\2\u0208\n\2\3\2\7\2\u020b\n\2\f\2\16\2\u020e\13\2\3\2\5"+
		"\2\u0211\n\2\3\2\7\2\u0214\n\2\f\2\16\2\u0217\13\2\3\2\3\2\5\2\u021b\n"+
		"\2\3\2\5\2\u021e\n\2\3\2\5\2\u0221\n\2\3\2\3\2\3\3\3\3\3\3\5\3\u0228\n"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u0233\n\5\f\5\16\5\u0236\13"+
		"\5\3\6\6\6\u0239\n\6\r\6\16\6\u023a\3\7\3\7\3\7\5\7\u0240\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0247\n\b\f\b\16\b\u024a\13\b\3\b\3\b\5\b\u024e\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0255\n\t\7\t\u0257\n\t\f\t\16\t\u025a\13\t\3\t"+
		"\3\t\5\t\u025e\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0265\n\n\7\n\u0267\n\n\f\n"+
		"\16\n\u026a\13\n\3\n\3\n\5\n\u026e\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0277\n\f\3\r\3\r\3\r\6\r\u027c\n\r\r\r\16\r\u027d\3\16\3\16\3\16\3"+
		"\16\7\16\u0284\n\16\f\16\16\16\u0287\13\16\5\16\u0289\n\16\3\16\5\16\u028c"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0299"+
		"\n\17\f\17\16\17\u029c\13\17\5\17\u029e\n\17\3\17\5\17\u02a1\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u02ab\n\17\f\17\16\17\u02ae\13"+
		"\17\5\17\u02b0\n\17\3\17\5\17\u02b3\n\17\3\17\3\17\5\17\u02b7\n\17\3\20"+
		"\3\20\5\20\u02bb\n\20\3\20\3\20\3\20\5\20\u02c0\n\20\3\20\5\20\u02c3\n"+
		"\20\3\20\6\20\u02c6\n\20\r\20\16\20\u02c7\3\21\3\21\3\21\3\21\7\21\u02ce"+
		"\n\21\f\21\16\21\u02d1\13\21\3\21\5\21\u02d4\n\21\5\21\u02d6\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u02de\n\21\f\21\16\21\u02e1\13\21\3\21"+
		"\5\21\u02e4\n\21\5\21\u02e6\n\21\3\21\5\21\u02e9\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u02f4\n\22\f\22\16\22\u02f7\13\22\5"+
		"\22\u02f9\n\22\3\22\5\22\u02fc\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0304\n\22\3\22\5\22\u0307\n\22\5\22\u0309\n\22\3\23\3\23\5\23\u030d"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\7\25\u0314\n\25\f\25\16\25\u0317\13\25"+
		"\3\26\3\26\6\26\u031b\n\26\r\26\16\26\u031c\3\26\3\26\6\26\u0321\n\26"+
		"\r\26\16\26\u0322\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u032e"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0336\n\27\3\27\3\27\3\27\3\27"+
		"\5\27\u033c\n\27\3\27\3\27\3\27\3\27\5\27\u0342\n\27\3\27\3\27\3\27\3"+
		"\27\5\27\u0348\n\27\3\30\3\30\3\30\5\30\u034d\n\30\3\30\5\30\u0350\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u035b\n\31\3\31\5\31"+
		"\u035e\n\31\3\31\5\31\u0361\n\31\3\31\3\31\5\31\u0365\n\31\3\31\3\31\3"+
		"\31\5\31\u036a\n\31\3\31\3\31\5\31\u036e\n\31\3\31\3\31\3\31\5\31\u0373"+
		"\n\31\3\31\3\31\5\31\u0377\n\31\3\31\3\31\5\31\u037b\n\31\3\31\5\31\u037e"+
		"\n\31\3\31\5\31\u0381\n\31\3\31\3\31\5\31\u0385\n\31\3\31\3\31\5\31\u0389"+
		"\n\31\3\31\5\31\u038c\n\31\3\31\5\31\u038f\n\31\3\31\3\31\3\31\3\31\5"+
		"\31\u0395\n\31\5\31\u0397\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\7\33\u03a1\n\33\f\33\16\33\u03a4\13\33\3\34\3\34\5\34\u03a8\n\34\3\34"+
		"\3\34\5\34\u03ac\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u03b4\n\34\3"+
		"\34\3\34\5\34\u03b8\n\34\3\34\3\34\3\34\5\34\u03bd\n\34\3\34\3\34\5\34"+
		"\u03c1\n\34\3\34\3\34\3\34\5\34\u03c6\n\34\3\34\3\34\5\34\u03ca\n\34\3"+
		"\34\5\34\u03cd\n\34\3\34\5\34\u03d0\n\34\3\34\3\34\3\34\5\34\u03d5\n\34"+
		"\3\34\3\34\5\34\u03d9\n\34\3\34\5\34\u03dc\n\34\3\34\5\34\u03df\n\34\5"+
		"\34\u03e1\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u03ef\n\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \5 \u03fa\n"+
		" \3!\3!\3!\3\"\3\"\3\"\3\"\3#\6#\u0404\n#\r#\16#\u0405\3$\3$\3$\3%\3%"+
		"\5%\u040d\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0418\n%\3&\3&\6&\u041c\n&"+
		"\r&\16&\u041d\3&\3&\7&\u0422\n&\f&\16&\u0425\13&\3&\7&\u0428\n&\f&\16"+
		"&\u042b\13&\3\'\3\'\5\'\u042f\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u043a\n\'\3(\3(\5(\u043e\n(\3(\3(\5(\u0442\n(\3(\3(\5(\u0446\n(\3"+
		"(\3(\5(\u044a\n(\3(\3(\5(\u044e\n(\3(\5(\u0451\n(\3)\3)\5)\u0455\n)\3"+
		")\3)\3)\5)\u045a\n)\3)\5)\u045d\n)\3)\3)\3)\5)\u0462\n)\3)\3)\5)\u0466"+
		"\n)\3)\5)\u0469\n)\3)\3)\3)\5)\u046e\n)\3)\3)\5)\u0472\n)\3)\5)\u0475"+
		"\n)\3)\3)\5)\u0479\n)\3)\5)\u047c\n)\3)\5)\u047f\n)\3)\3)\5)\u0483\n)"+
		"\3)\5)\u0486\n)\3)\3)\5)\u048a\n)\3)\5)\u048d\n)\3)\5)\u0490\n)\5)\u0492"+
		"\n)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\5,\u049e\n,\3-\3-\3-\3-\3-\3-\3-\5-"+
		"\u04a7\n-\3.\3.\3.\3.\3.\5.\u04ae\n.\3/\3/\5/\u04b2\n/\3/\3/\3/\3/\3/"+
		"\3/\3/\5/\u04bb\n/\3/\3/\3/\3/\3/\3/\3/\5/\u04c4\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u04cf\n\60\3\61\3\61\5\61\u04d3\n\61\3"+
		"\61\3\61\5\61\u04d7\n\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u04df\n\62"+
		"\3\63\6\63\u04e2\n\63\r\63\16\63\u04e3\3\64\3\64\5\64\u04e8\n\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u04f4\n\65\5\65\u04f6"+
		"\n\65\3\66\3\66\5\66\u04fa\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u0505\n\66\3\67\6\67\u0508\n\67\r\67\16\67\u0509\38\38\38\7"+
		"8\u050f\n8\f8\168\u0512\138\39\39\39\59\u0517\n9\39\39\3:\3:\3:\3:\3:"+
		"\3;\3;\3;\3;\3;\3;\3;\5;\u0527\n;\3<\3<\6<\u052b\n<\r<\16<\u052c\3<\3"+
		"<\7<\u0531\n<\f<\16<\u0534\13<\3<\7<\u0537\n<\f<\16<\u053a\13<\3=\3=\5"+
		"=\u053e\n=\3=\3=\3>\3>\3>\3?\3?\5?\u0547\n?\3@\3@\6@\u054b\n@\r@\16@\u054c"+
		"\3@\3@\7@\u0551\n@\f@\16@\u0554\13@\3@\7@\u0557\n@\f@\16@\u055a\13@\3"+
		"A\3A\5A\u055e\nA\3A\3A\3B\3B\3B\3C\3C\6C\u0567\nC\rC\16C\u0568\3C\3C\7"+
		"C\u056d\nC\fC\16C\u0570\13C\3C\7C\u0573\nC\fC\16C\u0576\13C\3D\3D\5D\u057a"+
		"\nD\3D\3D\3E\3E\3E\5E\u0581\nE\3E\3E\5E\u0585\nE\3F\3F\3F\3G\3G\3G\3G"+
		"\7G\u058e\nG\fG\16G\u0591\13G\3G\5G\u0594\nG\3H\3H\5H\u0598\nH\3H\5H\u059b"+
		"\nH\3H\3H\3H\3H\3I\3I\5I\u05a3\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\5J\u05b2\nJ\3K\3K\5K\u05b6\nK\3K\3K\3K\5K\u05bb\nK\3K\5K\u05be\nK"+
		"\3L\6L\u05c1\nL\rL\16L\u05c2\3M\3M\3M\3M\3M\3M\3M\5M\u05cc\nM\3N\3N\3"+
		"N\3N\7N\u05d2\nN\fN\16N\u05d5\13N\3N\5N\u05d8\nN\3O\3O\3O\3P\3P\3P\3P"+
		"\7P\u05e1\nP\fP\16P\u05e4\13P\3P\5P\u05e7\nP\3Q\3Q\3Q\3R\3R\3R\5R\u05ef"+
		"\nR\3R\5R\u05f2\nR\3S\3S\3S\7S\u05f7\nS\fS\16S\u05fa\13S\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u060e\nT\3U\3U\3U\5U\u0613"+
		"\nU\3U\3U\3U\3U\3U\3U\5U\u061b\nU\3V\3V\3W\3W\3X\5X\u0622\nX\3X\3X\3X"+
		"\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3]\7]\u0635\n]\f]\16]\u0638"+
		"\13]\3^\3^\3^\7^\u063d\n^\f^\16^\u0640\13^\3_\3_\3_\3_\3_\3_\5_\u0648"+
		"\n_\3`\3`\3a\3a\3a\3a\3a\5a\u0651\na\3b\3b\3b\3b\3b\5b\u0658\nb\3c\3c"+
		"\5c\u065c\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u066a\nc\3d\3d\5d"+
		"\u066e\nd\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u067c\nd\3e\3e\3f\3f"+
		"\3g\3g\3g\3g\3g\5g\u0687\ng\3h\3h\3h\3h\3h\5h\u068e\nh\3i\3i\3j\6j\u0693"+
		"\nj\rj\16j\u0694\3k\3k\3l\3l\3m\6m\u069c\nm\rm\16m\u069d\3n\3n\3n\3n\3"+
		"n\3n\3n\3n\3n\3n\5n\u06aa\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u06b5\no\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u06e0\no\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u06ee\no\3p\3p\3q\3q\3q\7q\u06f5\n"+
		"q\fq\16q\u06f8\13q\3r\3r\3r\7r\u06fd\nr\fr\16r\u0700\13r\3s\3s\3s\3s\3"+
		"s\7s\u0707\ns\fs\16s\u070a\13s\3t\6t\u070d\nt\rt\16t\u070e\3u\3u\3u\3"+
		"u\3u\3u\3u\3u\3u\3u\3u\5u\u071c\nu\3v\3v\3v\3v\3v\3v\3v\5v\u0725\nv\3"+
		"w\3w\3w\3x\3x\3x\7x\u072d\nx\fx\16x\u0730\13x\3y\5y\u0733\ny\3y\3y\5y"+
		"\u0737\ny\3z\6z\u073a\nz\rz\16z\u073b\3{\3{\3|\3|\3|\5|\u0743\n|\3|\7"+
		"|\u0746\n|\f|\16|\u0749\13|\3|\3|\3}\3}\3}\3}\7}\u0751\n}\f}\16}\u0754"+
		"\13}\3~\3~\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\7\u0081\u0762\n\u0081\f\u0081\16\u0081\u0765\13\u0081\3\u0082"+
		"\5\u0082\u0768\n\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u076d\n\u0082\3"+
		"\u0082\3\u0082\3\u0083\3\u0083\5\u0083\u0773\n\u0083\3\u0083\3\u0083\3"+
		"\u0084\3\u0084\3\u0085\3\u0085\3\u0085\7\u0085\u077c\n\u0085\f\u0085\16"+
		"\u0085\u077f\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\6\u0087"+
		"\u0786\n\u0087\r\u0087\16\u0087\u0787\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0794\n\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u079d"+
		"\n\u0089\3\u008a\3\u008a\3\u008a\5\u008a\u07a2\n\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\6\u008a\u07a8\n\u008a\r\u008a\16\u008a\u07a9\5\u008a"+
		"\u07ac\n\u008a\3\u008b\3\u008b\3\u008b\6\u008b\u07b1\n\u008b\r\u008b\16"+
		"\u008b\u07b2\5\u008b\u07b5\n\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u07ba"+
		"\n\u008c\3\u008c\3\u008c\5\u008c\u07be\n\u008c\5\u008c\u07c0\n\u008c\3"+
		"\u008d\6\u008d\u07c3\n\u008d\r\u008d\16\u008d\u07c4\3\u008e\3\u008e\3"+
		"\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u07d8\n\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u07e1"+
		"\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u07e8\n\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u07f1"+
		"\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u07f8\n\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u0802\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u0813\n\u008f\3\u008f\3\u008f\6\u008f\u0817\n\u008f\r\u008f\16\u008f"+
		"\u0818\5\u008f\u081b\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0826\n\u0090\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\5\u0093"+
		"\u0832\n\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0849\n\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\7\u0095\u084f\n\u0095\f\u0095\16\u0095\u0852"+
		"\13\u0095\3\u0096\3\u0096\3\u0097\5\u0097\u0857\n\u0097\3\u0097\3\u0097"+
		"\3\u0098\6\u0098\u085c\n\u0098\r\u0098\16\u0098\u085d\3\u0098\3\u0098"+
		"\5\u0098\u0862\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u087b\n\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0880\n\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0891\n\u0099\3\u009a"+
		"\3\u009a\3\u009a\5\u009a\u0896\n\u009a\3\u009a\7\u009a\u0899\n\u009a\f"+
		"\u009a\16\u009a\u089c\13\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u08dd\n\u009b\3\u009b\3\u009b"+
		"\5\u009b\u08e1\n\u009b\3\u009c\3\u009c\5\u009c\u08e5\n\u009c\3\u009d\3"+
		"\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009f\6\u009f\u08ee\n\u009f\r"+
		"\u009f\16\u009f\u08ef\3\u00a0\3\u00a0\3\u00a1\3\u00a1\5\u00a1\u08f6\n"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\7\u00a2\u08fc\n\u00a2\f\u00a2\16"+
		"\u00a2\u08ff\13\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u090c\n\u00a3\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0916"+
		"\n\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u091b\n\u00a4\5\u00a4\u091d\n"+
		"\u00a4\3\u00a5\3\u00a5\5\u00a5\u0921\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3"+
		"\u00a6\5\u00a6\u0927\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\5\u00a7\u0941\n\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\7\u00a8\u0948\n\u00a8\f\u00a8\16\u00a8\u094b\13\u00a8\3\u00a9\3\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u0952\n\u00aa\f\u00aa\16\u00aa\u0955"+
		"\13\u00aa\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u095a\n\u00ab\f\u00ab\16\u00ab"+
		"\u095d\13\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0962\n\u00ab\f\u00ab"+
		"\16\u00ab\u0965\13\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u096a\n\u00ab"+
		"\f\u00ab\16\u00ab\u096d\13\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0972"+
		"\n\u00ab\f\u00ab\16\u00ab\u0975\13\u00ab\5\u00ab\u0977\n\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac"+
		"\u098b\n\u00ac\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0990\n\u00ad\f\u00ad\16"+
		"\u00ad\u0993\13\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\5\u00ae\u099c\n\u00ae\3\u00af\3\u00af\3\u00af\7\u00af\u09a1\n"+
		"\u00af\f\u00af\16\u00af\u09a4\13\u00af\6\u00af\u09a6\n\u00af\r\u00af\16"+
		"\u00af\u09a7\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u09af\n\u00af"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\5\u00b1\u09b6\n\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u09bb\n\u00b2\3\u00b3\6\u00b3\u09be\n\u00b3\r"+
		"\u00b3\16\u00b3\u09bf\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4"+
		"\u09c7\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\6\u00b9\u09d5\n\u00b9\r\u00b9"+
		"\16\u00b9\u09d6\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\5\u00bb"+
		"\u09df\n\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\6\u00bc\u09e5\n\u00bc\r"+
		"\u00bc\16\u00bc\u09e6\3\u00bc\3\u00bc\7\u00bc\u09eb\n\u00bc\f\u00bc\16"+
		"\u00bc\u09ee\13\u00bc\3\u00bc\7\u00bc\u09f1\n\u00bc\f\u00bc\16\u00bc\u09f4"+
		"\13\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\6\u00bd\u09fa\n\u00bd\r\u00bd"+
		"\16\u00bd\u09fb\5\u00bd\u09fe\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\5\u00be\u0a07\n\u00be\3\u00bf\3\u00bf\3\u00bf"+
		"\7\u00bf\u0a0c\n\u00bf\f\u00bf\16\u00bf\u0a0f\13\u00bf\3\u00bf\5\u00bf"+
		"\u0a12\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0a19\n"+
		"\u00c0\3\u00c1\3\u00c1\6\u00c1\u0a1d\n\u00c1\r\u00c1\16\u00c1\u0a1e\3"+
		"\u00c1\3\u00c1\3\u00c1\7\u00c1\u0a24\n\u00c1\f\u00c1\16\u00c1\u0a27\13"+
		"\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\7\u00c3"+
		"\u0a30\n\u00c3\f\u00c3\16\u00c3\u0a33\13\u00c3\3\u00c4\3\u00c4\3\u00c5"+
		"\3\u00c5\3\u00c5\7\u00c5\u0a3a\n\u00c5\f\u00c5\16\u00c5\u0a3d\13\u00c5"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0a44\n\u00c6\3\u00c7"+
		"\3\u00c7\3\u00c7\7\u00c7\u0a49\n\u00c7\f\u00c7\16\u00c7\u0a4c\13\u00c7"+
		"\3\u00c8\3\u00c8\5\u00c8\u0a50\n\u00c8\3\u00c9\3\u00c9\5\u00c9\u0a54\n"+
		"\u00c9\3\u00ca\3\u00ca\5\u00ca\u0a58\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\5\u00cb\u0a5f\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\5\u00cc\u0a67\n\u00cc\3\u00cd\3\u00cd\3\u00cd\7\u00cd\u0a6c"+
		"\n\u00cd\f\u00cd\16\u00cd\u0a6f\13\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce"+
		"\u0a7d\n\u00ce\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0a82\n\u00cf\3\u00d0\3"+
		"\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0a89\n\u00d0\3\u00d1\3\u00d1\3"+
		"\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a90\n\u00d1\3\u00d2\3\u00d2\5\u00d2\u0a94"+
		"\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a9b\n\u00d3"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0aab\n\u00d4\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0ab2\n\u00d5\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0ab9\n\u00d6\3\u00d7\3\u00d7\3\u00d7"+
		"\5\u00d7\u0abe\n\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d9\3\u00d9"+
		"\3\u00d9\5\u00d9\u0ac7\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\5\u00da\u0ace\n\u00da\3\u00db\3\u00db\5\u00db\u0ad2\n\u00db\3\u00dc\3"+
		"\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0ad9\n\u00dc\3\u00dd\3\u00dd\5"+
		"\u00dd\u0add\n\u00dd\3\u00de\3\u00de\3\u00de\5\u00de\u0ae2\n\u00de\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0"+
		"\u0aed\n\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0af4\n"+
		"\u00e1\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u0b01\n\u00e4\3\u00e5\3\u00e5\3\u00e6"+
		"\3\u00e6\3\u00e6\5\u00e6\u0b08\n\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b11\n\u00e7\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\5\u00e8\u0b18\n\u00e8\3\u00e9\3\u00e9\3\u00e9\5\u00e9"+
		"\u0b1d\n\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea\5\u00ea\u0b23\n\u00ea\3"+
		"\u00ea\7\u00ea\u0b26\n\u00ea\f\u00ea\16\u00ea\u0b29\13\u00ea\3\u00eb\3"+
		"\u00eb\3\u00eb\5\u00eb\u0b2e\n\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\5"+
		"\u00ec\u0b34\n\u00ec\3\u00ed\3\u00ed\5\u00ed\u0b38\n\u00ed\3\u00ee\3\u00ee"+
		"\6\u00ee\u0b3c\n\u00ee\r\u00ee\16\u00ee\u0b3d\5\u00ee\u0b40\n\u00ee\3"+
		"\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0b47\n\u00f0\3\u00f0\3"+
		"\u00f0\3\u00f1\3\u00f1\7\u00f1\u0b4d\n\u00f1\f\u00f1\16\u00f1\u0b50\13"+
		"\u00f1\3\u00f2\3\u00f2\3\u00f2\5\u00f2\u0b55\n\u00f2\3\u00f2\3\u00f2\3"+
		"\u00f3\3\u00f3\7\u00f3\u0b5b\n\u00f3\f\u00f3\16\u00f3\u0b5e\13\u00f3\3"+
		"\u00f4\3\u00f4\3\u00f4\3\u00f4\5\u00f4\u0b64\n\u00f4\3\u00f5\3\u00f5\3"+
		"\u00f6\3\u00f6\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8\7\u00f8\u0b6f\n"+
		"\u00f8\f\u00f8\16\u00f8\u0b72\13\u00f8\3\u00f8\3\u00f8\3\u00f9\6\u00f9"+
		"\u0b77\n\u00f9\r\u00f9\16\u00f9\u0b78\3\u00fa\6\u00fa\u0b7c\n\u00fa\r"+
		"\u00fa\16\u00fa\u0b7d\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fd\3\u00fd"+
		"\3\u00fe\3\u00fe\5\u00fe\u0b88\n\u00fe\3\u00ff\3\u00ff\3\u0100\3\u0100"+
		"\3\u0101\3\u0101\3\u0102\3\u0102\3\u0103\3\u0103\3\u0103\2\2\u0104\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de"+
		"\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6"+
		"\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204\2\16\3\2\22\24\4\2\30\30\62"+
		"\63\4\2()+,\3\2\"$\4\2NNee\t\2\6\6\16\16\32\32!!(*,,\62\64\4\2\u0087\u0087"+
		"\u0089\u0089\4\2\u0088\u0088\u008a\u008a\4\2ff\u008b\u008b\7\2ffhhoo{"+
		"~\u0087\u0088\t\2T[]acceeggijnn\3\2\u008c\u008e\2\u0c8f\2\u0207\3\2\2"+
		"\2\4\u0224\3\2\2\2\6\u022b\3\2\2\2\b\u022e\3\2\2\2\n\u0238\3\2\2\2\f\u023f"+
		"\3\2\2\2\16\u0241\3\2\2\2\20\u024f\3\2\2\2\22\u025f\3\2\2\2\24\u026f\3"+
		"\2\2\2\26\u0276\3\2\2\2\30\u027b\3\2\2\2\32\u027f\3\2\2\2\34\u02b6\3\2"+
		"\2\2\36\u02b8\3\2\2\2 \u02e8\3\2\2\2\"\u0308\3\2\2\2$\u030c\3\2\2\2&\u030e"+
		"\3\2\2\2(\u0310\3\2\2\2*\u0320\3\2\2\2,\u0347\3\2\2\2.\u0349\3\2\2\2\60"+
		"\u0396\3\2\2\2\62\u0398\3\2\2\2\64\u039d\3\2\2\2\66\u03e0\3\2\2\28\u03ee"+
		"\3\2\2\2:\u03f0\3\2\2\2<\u03f2\3\2\2\2>\u03f9\3\2\2\2@\u03fb\3\2\2\2B"+
		"\u03fe\3\2\2\2D\u0403\3\2\2\2F\u0407\3\2\2\2H\u0417\3\2\2\2J\u0419\3\2"+
		"\2\2L\u0439\3\2\2\2N\u0450\3\2\2\2P\u0491\3\2\2\2R\u0493\3\2\2\2T\u0496"+
		"\3\2\2\2V\u049d\3\2\2\2X\u04a6\3\2\2\2Z\u04ad\3\2\2\2\\\u04c3\3\2\2\2"+
		"^\u04ce\3\2\2\2`\u04d0\3\2\2\2b\u04da\3\2\2\2d\u04e1\3\2\2\2f\u04e7\3"+
		"\2\2\2h\u04f5\3\2\2\2j\u0504\3\2\2\2l\u0507\3\2\2\2n\u050b\3\2\2\2p\u0513"+
		"\3\2\2\2r\u051a\3\2\2\2t\u0526\3\2\2\2v\u0528\3\2\2\2x\u053b\3\2\2\2z"+
		"\u0541\3\2\2\2|\u0546\3\2\2\2~\u0548\3\2\2\2\u0080\u055b\3\2\2\2\u0082"+
		"\u0561\3\2\2\2\u0084\u0564\3\2\2\2\u0086\u0577\3\2\2\2\u0088\u0584\3\2"+
		"\2\2\u008a\u0586\3\2\2\2\u008c\u0589\3\2\2\2\u008e\u0595\3\2\2\2\u0090"+
		"\u05a2\3\2\2\2\u0092\u05b1\3\2\2\2\u0094\u05b3\3\2\2\2\u0096\u05c0\3\2"+
		"\2\2\u0098\u05cb\3\2\2\2\u009a\u05cd\3\2\2\2\u009c\u05d9\3\2\2\2\u009e"+
		"\u05dc\3\2\2\2\u00a0\u05e8\3\2\2\2\u00a2\u05f1\3\2\2\2\u00a4\u05f3\3\2"+
		"\2\2\u00a6\u060d\3\2\2\2\u00a8\u061a\3\2\2\2\u00aa\u061c\3\2\2\2\u00ac"+
		"\u061e\3\2\2\2\u00ae\u0621\3\2\2\2\u00b0\u0627\3\2\2\2\u00b2\u062a\3\2"+
		"\2\2\u00b4\u062d\3\2\2\2\u00b6\u062f\3\2\2\2\u00b8\u0631\3\2\2\2\u00ba"+
		"\u0639\3\2\2\2\u00bc\u0647\3\2\2\2\u00be\u0649\3\2\2\2\u00c0\u0650\3\2"+
		"\2\2\u00c2\u0657\3\2\2\2\u00c4\u0669\3\2\2\2\u00c6\u067b\3\2\2\2\u00c8"+
		"\u067d\3\2\2\2\u00ca\u067f\3\2\2\2\u00cc\u0686\3\2\2\2\u00ce\u068d\3\2"+
		"\2\2\u00d0\u068f\3\2\2\2\u00d2\u0692\3\2\2\2\u00d4\u0696\3\2\2\2\u00d6"+
		"\u0698\3\2\2\2\u00d8\u069b\3\2\2\2\u00da\u06a9\3\2\2\2\u00dc\u06ed\3\2"+
		"\2\2\u00de\u06ef\3\2\2\2\u00e0\u06f1\3\2\2\2\u00e2\u06f9\3\2\2\2\u00e4"+
		"\u0701\3\2\2\2\u00e6\u070c\3\2\2\2\u00e8\u071b\3\2\2\2\u00ea\u0724\3\2"+
		"\2\2\u00ec\u0726\3\2\2\2\u00ee\u0729\3\2\2\2\u00f0\u0732\3\2\2\2\u00f2"+
		"\u0739\3\2\2\2\u00f4\u073d\3\2\2\2\u00f6\u073f\3\2\2\2\u00f8\u074c\3\2"+
		"\2\2\u00fa\u0755\3\2\2\2\u00fc\u0757\3\2\2\2\u00fe\u075b\3\2\2\2\u0100"+
		"\u075e\3\2\2\2\u0102\u0767\3\2\2\2\u0104\u0770\3\2\2\2\u0106\u0776\3\2"+
		"\2\2\u0108\u0778\3\2\2\2\u010a\u0780\3\2\2\2\u010c\u0785\3\2\2\2\u010e"+
		"\u0793\3\2\2\2\u0110\u079c\3\2\2\2\u0112\u07ab\3\2\2\2\u0114\u07b4\3\2"+
		"\2\2\u0116\u07bf\3\2\2\2\u0118\u07c2\3\2\2\2\u011a\u07c6\3\2\2\2\u011c"+
		"\u081a\3\2\2\2\u011e\u0825\3\2\2\2\u0120\u0827\3\2\2\2\u0122\u082b\3\2"+
		"\2\2\u0124\u0831\3\2\2\2\u0126\u0848\3\2\2\2\u0128\u084a\3\2\2\2\u012a"+
		"\u0853\3\2\2\2\u012c\u0856\3\2\2\2\u012e\u085b\3\2\2\2\u0130\u0890\3\2"+
		"\2\2\u0132\u0892\3\2\2\2\u0134\u08e0\3\2\2\2\u0136\u08e4\3\2\2\2\u0138"+
		"\u08e6\3\2\2\2\u013a\u08e9\3\2\2\2\u013c\u08ed\3\2\2\2\u013e\u08f1\3\2"+
		"\2\2\u0140\u08f3\3\2\2\2\u0142\u08f9\3\2\2\2\u0144\u090b\3\2\2\2\u0146"+
		"\u091c\3\2\2\2\u0148\u091e\3\2\2\2\u014a\u0926\3\2\2\2\u014c\u0940\3\2"+
		"\2\2\u014e\u0942\3\2\2\2\u0150\u094c\3\2\2\2\u0152\u094e\3\2\2\2\u0154"+
		"\u0976\3\2\2\2\u0156\u098a\3\2\2\2\u0158\u098c\3\2\2\2\u015a\u099b\3\2"+
		"\2\2\u015c\u09ae\3\2\2\2\u015e\u09b0\3\2\2\2\u0160\u09b3\3\2\2\2\u0162"+
		"\u09ba\3\2\2\2\u0164\u09bd\3\2\2\2\u0166\u09c6\3\2\2\2\u0168\u09c8\3\2"+
		"\2\2\u016a\u09cd\3\2\2\2\u016c\u09cf\3\2\2\2\u016e\u09d1\3\2\2\2\u0170"+
		"\u09d4\3\2\2\2\u0172\u09d8\3\2\2\2\u0174\u09dc\3\2\2\2\u0176\u09e2\3\2"+
		"\2\2\u0178\u09fd\3\2\2\2\u017a\u0a06\3\2\2\2\u017c\u0a11\3\2\2\2\u017e"+
		"\u0a18\3\2\2\2\u0180\u0a1a\3\2\2\2\u0182\u0a28\3\2\2\2\u0184\u0a2c\3\2"+
		"\2\2\u0186\u0a34\3\2\2\2\u0188\u0a36\3\2\2\2\u018a\u0a43\3\2\2\2\u018c"+
		"\u0a45\3\2\2\2\u018e\u0a4f\3\2\2\2\u0190\u0a53\3\2\2\2\u0192\u0a57\3\2"+
		"\2\2\u0194\u0a5e\3\2\2\2\u0196\u0a66\3\2\2\2\u0198\u0a68\3\2\2\2\u019a"+
		"\u0a7c\3\2\2\2\u019c\u0a81\3\2\2\2\u019e\u0a88\3\2\2\2\u01a0\u0a8f\3\2"+
		"\2\2\u01a2\u0a93\3\2\2\2\u01a4\u0a9a\3\2\2\2\u01a6\u0aaa\3\2\2\2\u01a8"+
		"\u0ab1\3\2\2\2\u01aa\u0ab8\3\2\2\2\u01ac\u0abd\3\2\2\2\u01ae\u0ac1\3\2"+
		"\2\2\u01b0\u0ac6\3\2\2\2\u01b2\u0acd\3\2\2\2\u01b4\u0ad1\3\2\2\2\u01b6"+
		"\u0ad8\3\2\2\2\u01b8\u0adc\3\2\2\2\u01ba\u0ae1\3\2\2\2\u01bc\u0ae3\3\2"+
		"\2\2\u01be\u0aec\3\2\2\2\u01c0\u0af3\3\2\2\2\u01c2\u0af5\3\2\2\2\u01c4"+
		"\u0af7\3\2\2\2\u01c6\u0b00\3\2\2\2\u01c8\u0b02\3\2\2\2\u01ca\u0b07\3\2"+
		"\2\2\u01cc\u0b10\3\2\2\2\u01ce\u0b17\3\2\2\2\u01d0\u0b1c\3\2\2\2\u01d2"+
		"\u0b22\3\2\2\2\u01d4\u0b2d\3\2\2\2\u01d6\u0b33\3\2\2\2\u01d8\u0b37\3\2"+
		"\2\2\u01da\u0b3f\3\2\2\2\u01dc\u0b41\3\2\2\2\u01de\u0b46\3\2\2\2\u01e0"+
		"\u0b4a\3\2\2\2\u01e2\u0b54\3\2\2\2\u01e4\u0b58\3\2\2\2\u01e6\u0b63\3\2"+
		"\2\2\u01e8\u0b65\3\2\2\2\u01ea\u0b67\3\2\2\2\u01ec\u0b69\3\2\2\2\u01ee"+
		"\u0b70\3\2\2\2\u01f0\u0b76\3\2\2\2\u01f2\u0b7b\3\2\2\2\u01f4\u0b7f\3\2"+
		"\2\2\u01f6\u0b81\3\2\2\2\u01f8\u0b83\3\2\2\2\u01fa\u0b87\3\2\2\2\u01fc"+
		"\u0b89\3\2\2\2\u01fe\u0b8b\3\2\2\2\u0200\u0b8d\3\2\2\2\u0202\u0b8f\3\2"+
		"\2\2\u0204\u0b91\3\2\2\2\u0206\u0208\7\u0087\2\2\u0207\u0206\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u020c\3\2\2\2\u0209\u020b\5\u01ec\u00f7\2\u020a\u0209"+
		"\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\5\n\6\2\u0210\u020f\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0215\3\2\2\2\u0212\u0214\5\u01ec\u00f7"+
		"\2\u0213\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216"+
		"\3\2\2\2\u0216\u021a\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021b\5\4\3\2\u0219"+
		"\u021b\5\26\f\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u021d\3"+
		"\2\2\2\u021c\u021e\7\u0088\2\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2"+
		"\u021e\u0220\3\2\2\2\u021f\u0221\5\u01ec\u00f7\2\u0220\u021f\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\7\2\2\3\u0223\3\3\2\2\2"+
		"\u0224\u0225\7\27\2\2\u0225\u0227\5\u01ee\u00f8\2\u0226\u0228\5\32\16"+
		"\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a"+
		"\5\6\4\2\u022a\5\3\2\2\2\u022b\u022c\7\35\2\2\u022c\u022d\5\b\5\2\u022d"+
		"\7\3\2\2\2\u022e\u022f\5\u01e8\u00f5\2\u022f\u0230\5\26\f\2\u0230\u0234"+
		"\5\u01ea\u00f6\2\u0231\u0233\5\u01ec\u00f7\2\u0232\u0231\3\2\2\2\u0233"+
		"\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\t\3\2\2\2"+
		"\u0236\u0234\3\2\2\2\u0237\u0239\5\f\7\2\u0238\u0237\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\13\3\2\2\2\u023c"+
		"\u0240\5\16\b\2\u023d\u0240\5\20\t\2\u023e\u0240\5\22\n\2\u023f\u023c"+
		"\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240\r\3\2\2\2\u0241"+
		"\u0242\7\u0083\2\2\u0242\u0243\7\65\2\2\u0243\u0248\5\24\13\2\u0244\u0245"+
		"\7h\2\2\u0245\u0247\5\24\13\2\u0246\u0244\3\2\2\2\u0247\u024a\3\2\2\2"+
		"\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0248"+
		"\3\2\2\2\u024b\u024d\7\u0084\2\2\u024c\u024e\5\u01ec\u00f7\2\u024d\u024c"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e\17\3\2\2\2\u024f\u0250\7\u0083\2\2"+
		"\u0250\u0258\7\66\2\2\u0251\u0254\7\\\2\2\u0252\u0255\5\u01d2\u00ea\2"+
		"\u0253\u0255\5\u01e0\u00f1\2\u0254\u0252\3\2\2\2\u0254\u0253\3\2\2\2\u0255"+
		"\u0257\3\2\2\2\u0256\u0251\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2"+
		"\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u0258\3\2\2\2\u025b"+
		"\u025d\7\u0084\2\2\u025c\u025e\5\u01ec\u00f7\2\u025d\u025c\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\21\3\2\2\2\u025f\u0260\7\u0083\2\2\u0260\u0268\7"+
		"\67\2\2\u0261\u0264\7\\\2\2\u0262\u0265\5\u01d2\u00ea\2\u0263\u0265\5"+
		"\u01e0\u00f1\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2\2\2\u0265\u0267\3\2"+
		"\2\2\u0266\u0261\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026d\7\u0084"+
		"\2\2\u026c\u026e\5\u01ec\u00f7\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2"+
		"\2\u026e\23\3\2\2\2\u026f\u0270\7\u0082\2\2\u0270\25\3\2\2\2\u0271\u0272"+
		"\5\30\r\2\u0272\u0273\5*\26\2\u0273\u0277\3\2\2\2\u0274\u0277\5\30\r\2"+
		"\u0275\u0277\5*\26\2\u0276\u0271\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0275"+
		"\3\2\2\2\u0277\27\3\2\2\2\u0278\u027c\5\36\20\2\u0279\u027c\7\3\2\2\u027a"+
		"\u027c\5\u01ec\u00f7\2\u027b\u0278\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027a"+
		"\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\31\3\2\2\2\u027f\u0288\7{\2\2\u0280\u0285\5\34\17\2\u0281\u0282\7h\2"+
		"\2\u0282\u0284\5\34\17\2\u0283\u0281\3\2\2\2\u0284\u0287\3\2\2\2\u0285"+
		"\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2"+
		"\2\2\u0288\u0280\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b\3\2\2\2\u028a"+
		"\u028c\7h\2\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u028e\7|\2\2\u028e\33\3\2\2\2\u028f\u02b7\5\u01ce\u00e8\2\u0290"+
		"\u02a0\5\u01ac\u00d7\2\u0291\u0292\7{\2\2\u0292\u0293\7d\2\2\u0293\u02a1"+
		"\7|\2\2\u0294\u029d\7{\2\2\u0295\u029a\5$\23\2\u0296\u0297\7h\2\2\u0297"+
		"\u0299\5$\23\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2"+
		"\2\2\u029a\u029b\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029d"+
		"\u0295\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\7|"+
		"\2\2\u02a0\u0291\3\2\2\2\u02a0\u0294\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02b7\3\2\2\2\u02a2\u02b2\5\u01ca\u00e6\2\u02a3\u02a4\7{\2\2\u02a4\u02a5"+
		"\7d\2\2\u02a5\u02b3\7|\2\2\u02a6\u02af\7{\2\2\u02a7\u02ac\5\u01ce\u00e8"+
		"\2\u02a8\u02a9\7h\2\2\u02a9\u02ab\5\u01ce\u00e8\2\u02aa\u02a8\3\2\2\2"+
		"\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b0"+
		"\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02a7\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b3\7|\2\2\u02b2\u02a3\3\2\2\2\u02b2\u02a6\3\2"+
		"\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b7\3\2\2\2\u02b4\u02b5\7\27\2\2\u02b5"+
		"\u02b7\5\u01ee\u00f8\2\u02b6\u028f\3\2\2\2\u02b6\u0290\3\2\2\2\u02b6\u02a2"+
		"\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\35\3\2\2\2\u02b8\u02ba\7\20\2\2\u02b9"+
		"\u02bb\7\32\2\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3"+
		"\2\2\2\u02bc\u02bf\5\u01ee\u00f8\2\u02bd\u02be\7\6\2\2\u02be\u02c0\5\u01ee"+
		"\u00f8\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1"+
		"\u02c3\5 \21\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2"+
		"\2\2\u02c4\u02c6\5\u01ec\u00f7\2\u02c5\u02c4\3\2\2\2\u02c6\u02c7\3\2\2"+
		"\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\37\3\2\2\2\u02c9\u02d5"+
		"\7{\2\2\u02ca\u02cf\5\"\22\2\u02cb\u02cc\7h\2\2\u02cc\u02ce\5\"\22\2\u02cd"+
		"\u02cb\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2"+
		"\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d4\7h\2\2\u02d3"+
		"\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02ca\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02e9\7|\2\2\u02d8"+
		"\u02d9\7\16\2\2\u02d9\u02e5\7{\2\2\u02da\u02df\5\"\22\2\u02db\u02dc\7"+
		"h\2\2\u02dc\u02de\5\"\22\2\u02dd\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df"+
		"\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2"+
		"\2\2\u02e2\u02e4\7h\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e6\3\2\2\2\u02e5\u02da\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2"+
		"\2\2\u02e7\u02e9\7|\2\2\u02e8\u02c9\3\2\2\2\u02e8\u02d8\3\2\2\2\u02e9"+
		"!\3\2\2\2\u02ea\u0309\5\u01cc\u00e7\2\u02eb\u02fb\5\u01ae\u00d8\2\u02ec"+
		"\u02ed\7{\2\2\u02ed\u02ee\7d\2\2\u02ee\u02fc\7|\2\2\u02ef\u02f8\7{\2\2"+
		"\u02f0\u02f5\5$\23\2\u02f1\u02f2\7h\2\2\u02f2\u02f4\5$\23\2\u02f3\u02f1"+
		"\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f0\3\2\2\2\u02f8\u02f9\3\2"+
		"\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\7|\2\2\u02fb\u02ec\3\2\2\2\u02fb"+
		"\u02ef\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0309\3\2\2\2\u02fd\u0306\5\u01c8"+
		"\u00e5\2\u02fe\u02ff\7{\2\2\u02ff\u0300\7d\2\2\u0300\u0307\7|\2\2\u0301"+
		"\u0303\7{\2\2\u0302\u0304\5\u00b8]\2\u0303\u0302\3\2\2\2\u0303\u0304\3"+
		"\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\7|\2\2\u0306\u02fe\3\2\2\2\u0306"+
		"\u0301\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u02ea\3\2"+
		"\2\2\u0308\u02eb\3\2\2\2\u0308\u02fd\3\2\2\2\u0309#\3\2\2\2\u030a\u030d"+
		"\5\u01cc\u00e7\2\u030b\u030d\5\u0196\u00cc\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030b\3\2\2\2\u030d%\3\2\2\2\u030e\u030f\t\2\2\2\u030f\'\3\2\2\2\u0310"+
		"\u0315\5\u01b4\u00db\2\u0311\u0312\7h\2\2\u0312\u0314\5\u01b4\u00db\2"+
		"\u0313\u0311\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316)\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u031a\5,\27\2\u0319"+
		"\u031b\5\u01ec\u00f7\2\u031a\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031a"+
		"\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0321\3\2\2\2\u031e\u0321\7\3\2\2\u031f"+
		"\u0321\5\u01ec\u00f7\2\u0320\u0318\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u031f"+
		"\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"+\3\2\2\2\u0324\u0348\5.\30\2\u0325\u0348\5\60\31\2\u0326\u0348\5\62\32"+
		"\2\u0327\u0348\5\66\34\2\u0328\u0348\5`\61\2\u0329\u0348\5b\62\2\u032a"+
		"\u032b\7\n\2\2\u032b\u032d\7{\2\2\u032c\u032e\5\u00e2r\2\u032d\u032c\3"+
		"\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0348\7|\2\2\u0330"+
		"\u0331\7 \2\2\u0331\u0348\5\u00a8U\2\u0332\u0333\7\u0083\2\2\u0333\u0335"+
		"\7?\2\2\u0334\u0336\5\u009eP\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2"+
		"\u0336\u0337\3\2\2\2\u0337\u0348\7\u0084\2\2\u0338\u0339\7\u0083\2\2\u0339"+
		"\u033b\7@\2\2\u033a\u033c\5\u009aN\2\u033b\u033a\3\2\2\2\u033b\u033c\3"+
		"\2\2\2\u033c\u033d\3\2\2\2\u033d\u0348\7\u0084\2\2\u033e\u033f\7\u0083"+
		"\2\2\u033f\u0341\7=\2\2\u0340\u0342\5\u008cG\2\u0341\u0340\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0348\7\u0084\2\2\u0344\u0348"+
		"\5\u00a6T\2\u0345\u0348\5\u0112\u008a\2\u0346\u0348\5\u0128\u0095\2\u0347"+
		"\u0324\3\2\2\2\u0347\u0325\3\2\2\2\u0347\u0326\3\2\2\2\u0347\u0327\3\2"+
		"\2\2\u0347\u0328\3\2\2\2\u0347\u0329\3\2\2\2\u0347\u032a\3\2\2\2\u0347"+
		"\u0330\3\2\2\2\u0347\u0332\3\2\2\2\u0347\u0338\3\2\2\2\u0347\u033e\3\2"+
		"\2\2\u0347\u0344\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348"+
		"-\3\2\2\2\u0349\u034a\7\b\2\2\u034a\u034c\5Z.\2\u034b\u034d\5\u00ecw\2"+
		"\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u0350"+
		"\5z>\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350/\3\2\2\2\u0351\u0352"+
		"\7\34\2\2\u0352\u0353\5\u00ccg\2\u0353\u0354\7j\2\2\u0354\u0355\5\u00c2"+
		"b\2\u0355\u0397\3\2\2\2\u0356\u0357\7\34\2\2\u0357\u0358\7&\2\2\u0358"+
		"\u035a\5\u00ccg\2\u0359\u035b\5V,\2\u035a\u0359\3\2\2\2\u035a\u035b\3"+
		"\2\2\2\u035b\u035d\3\2\2\2\u035c\u035e\5@!\2\u035d\u035c\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u0361\5F$\2\u0360\u035f\3\2\2"+
		"\2\u0360\u0361\3\2\2\2\u0361\u0397\3\2\2\2\u0362\u0364\7\t\2\2\u0363\u0365"+
		"\5^\60\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0367\5Z.\2\u0367\u0369\5\u00fe\u0080\2\u0368\u036a\5\u010c\u0087\2\u0369"+
		"\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0397\3\2\2\2\u036b\u036d\7\30"+
		"\2\2\u036c\u036e\5^\60\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0370\5Z.\2\u0370\u0372\5\u00fe\u0080\2\u0371\u0373"+
		"\5\u010c\u0087\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0397\3"+
		"\2\2\2\u0374\u0376\7\t\2\2\u0375\u0377\5^\60\2\u0376\u0375\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a\5Z.\2\u0379\u037b\5R*\2"+
		"\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037d\3\2\2\2\u037c\u037e"+
		"\5\u00f6|\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0380\3\2\2"+
		"\2\u037f\u0381\5\u010c\u0087\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2"+
		"\u0381\u0397\3\2\2\2\u0382\u0384\7\30\2\2\u0383\u0385\5^\60\2\u0384\u0383"+
		"\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\5Z.\2\u0387"+
		"\u0389\5R*\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2"+
		"\2\u038a\u038c\5\u00f6|\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038e\3\2\2\2\u038d\u038f\5\u010c\u0087\2\u038e\u038d\3\2\2\2\u038e\u038f"+
		"\3\2\2\2\u038f\u0397\3\2\2\2\u0390\u0391\7\t\2\2\u0391\u0392\7&\2\2\u0392"+
		"\u0394\5\u00ccg\2\u0393\u0395\5T+\2\u0394\u0393\3\2\2\2\u0394\u0395\3"+
		"\2\2\2\u0395\u0397\3\2\2\2\u0396\u0351\3\2\2\2\u0396\u0356\3\2\2\2\u0396"+
		"\u0362\3\2\2\2\u0396\u036b\3\2\2\2\u0396\u0374\3\2\2\2\u0396\u0382\3\2"+
		"\2\2\u0396\u0390\3\2\2\2\u0397\61\3\2\2\2\u0398\u0399\7\34\2\2\u0399\u039a"+
		"\5\64\33\2\u039a\u039b\7M\2\2\u039b\u039c\5\u00c2b\2\u039c\63\3\2\2\2"+
		"\u039d\u03a2\5\u01a8\u00d5\2\u039e\u039f\7h\2\2\u039f\u03a1\5\u01a8\u00d5"+
		"\2\u03a0\u039e\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3"+
		"\3\2\2\2\u03a3\65\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a7\7\25\2\2\u03a6"+
		"\u03a8\58\35\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2"+
		"\2\2\u03a9\u03ab\5\u00dep\2\u03aa\u03ac\5\u0082B\2\u03ab\u03aa\3\2\2\2"+
		"\u03ab\u03ac\3\2\2\2\u03ac\u03e1\3\2\2\2\u03ad\u03ae\7\34\2\2\u03ae\u03af"+
		"\7\25\2\2\u03af\u03e1\5L\'\2\u03b0\u03b1\7\t\2\2\u03b1\u03b3\7\25\2\2"+
		"\u03b2\u03b4\5^\60\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5"+
		"\3\2\2\2\u03b5\u03b7\5\\/\2\u03b6\u03b8\5\u010c\u0087\2\u03b7\u03b6\3"+
		"\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03e1\3\2\2\2\u03b9\u03ba\7\30\2\2\u03ba"+
		"\u03bc\7\25\2\2\u03bb\u03bd\5^\60\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3"+
		"\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\5\\/\2\u03bf\u03c1\5\u010c\u0087"+
		"\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03e1\3\2\2\2\u03c2\u03c3"+
		"\7\t\2\2\u03c3\u03c5\7\25\2\2\u03c4\u03c6\5^\60\2\u03c5\u03c4\3\2\2\2"+
		"\u03c5\u03c6\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\5\\/\2\u03c8\u03ca"+
		"\5R*\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb"+
		"\u03cd\5\u00f6|\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cf"+
		"\3\2\2\2\u03ce\u03d0\5\u010c\u0087\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3"+
		"\2\2\2\u03d0\u03e1\3\2\2\2\u03d1\u03d2\7\30\2\2\u03d2\u03d4\7\25\2\2\u03d3"+
		"\u03d5\5^\60\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2"+
		"\2\2\u03d6\u03d8\5\\/\2\u03d7\u03d9\5R*\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9"+
		"\3\2\2\2\u03d9\u03db\3\2\2\2\u03da\u03dc\5\u00f6|\2\u03db\u03da\3\2\2"+
		"\2\u03db\u03dc\3\2\2\2\u03dc\u03de\3\2\2\2\u03dd\u03df\5\u010c\u0087\2"+
		"\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03a5"+
		"\3\2\2\2\u03e0\u03ad\3\2\2\2\u03e0\u03b0\3\2\2\2\u03e0\u03b9\3\2\2\2\u03e0"+
		"\u03c2\3\2\2\2\u03e0\u03d1\3\2\2\2\u03e1\67\3\2\2\2\u03e2\u03e3\7\u0083"+
		"\2\2\u03e3\u03e4\7G\2\2\u03e4\u03ef\7\u0084\2\2\u03e5\u03e6\7\u0083\2"+
		"\2\u03e6\u03e7\7F\2\2\u03e7\u03ef\7\u0084\2\2\u03e8\u03e9\7\u0083\2\2"+
		"\u03e9\u03ea\7H\2\2\u03ea\u03ef\7\u0084\2\2\u03eb\u03ec\7\u0083\2\2\u03ec"+
		"\u03ed\7I\2\2\u03ed\u03ef\7\u0084\2\2\u03ee\u03e2\3\2\2\2\u03ee\u03e5"+
		"\3\2\2\2\u03ee\u03e8\3\2\2\2\u03ee\u03eb\3\2\2\2\u03ef9\3\2\2\2\u03f0"+
		"\u03f1\t\3\2\2\u03f1;\3\2\2\2\u03f2\u03f3\7\64\2\2\u03f3\u03f4\5\u00c0"+
		"a\2\u03f4=\3\2\2\2\u03f5\u03fa\7\62\2\2\u03f6\u03fa\7\63\2\2\u03f7\u03fa"+
		"\7\30\2\2\u03f8\u03fa\5<\37\2\u03f9\u03f5\3\2\2\2\u03f9\u03f6\3\2\2\2"+
		"\u03f9\u03f7\3\2\2\2\u03f9\u03f8\3\2\2\2\u03fa?\3\2\2\2\u03fb\u03fc\7"+
		"X\2\2\u03fc\u03fd\5B\"\2\u03fdA\3\2\2\2\u03fe\u03ff\5\u01c6\u00e4\2\u03ff"+
		"\u0400\7N\2\2\u0400\u0401\5D#\2\u0401C\3\2\2\2\u0402\u0404\5\u01c6\u00e4"+
		"\2\u0403\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406"+
		"\3\2\2\2\u0406E\3\2\2\2\u0407\u0408\7\35\2\2\u0408\u0409\5H%\2\u0409G"+
		"\3\2\2\2\u040a\u040c\5\u01e8\u00f5\2\u040b\u040d\5J&\2\u040c\u040b\3\2"+
		"\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\5\u01ea\u00f6"+
		"\2\u040f\u0418\3\2\2\2\u0410\u0411\7\u0087\2\2\u0411\u0412\7d\2\2\u0412"+
		"\u0418\7\u0088\2\2\u0413\u0414\5\u01e8\u00f5\2\u0414\u0415\7d\2\2\u0415"+
		"\u0416\5\u01ea\u00f6\2\u0416\u0418\3\2\2\2\u0417\u040a\3\2\2\2\u0417\u0410"+
		"\3\2\2\2\u0417\u0413\3\2\2\2\u0418I\3\2\2\2\u0419\u0423\5L\'\2\u041a\u041c"+
		"\5\u01ec\u00f7\2\u041b\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041b\3"+
		"\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\5L\'\2\u0420"+
		"\u0422\3\2\2\2\u0421\u041b\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2"+
		"\2\2\u0423\u0424\3\2\2\2\u0424\u0429\3\2\2\2\u0425\u0423\3\2\2\2\u0426"+
		"\u0428\5\u01ec\u00f7\2\u0427\u0426\3\2\2\2\u0428\u042b\3\2\2\2\u0429\u0427"+
		"\3\2\2\2\u0429\u042a\3\2\2\2\u042aK\3\2\2\2\u042b\u0429\3\2\2\2\u042c"+
		"\u042e\7\37\2\2\u042d\u042f\5\u00e6t\2\u042e\u042d\3\2\2\2\u042e\u042f"+
		"\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\7e\2\2\u0431\u0432\5\u00ccg\2"+
		"\u0432\u0433\7j\2\2\u0433\u0434\5\u00c0a\2\u0434\u043a\3\2\2\2\u0435\u0436"+
		"\5\u00ccg\2\u0436\u0437\7j\2\2\u0437\u0438\5\u00c0a\2\u0438\u043a\3\2"+
		"\2\2\u0439\u042c\3\2\2\2\u0439\u0435\3\2\2\2\u043aM\3\2\2\2\u043b\u043d"+
		"\7\t\2\2\u043c\u043e\7&\2\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"\u043f\3\2\2\2\u043f\u0441\5\u00ccg\2\u0440\u0442\5T+\2\u0441\u0440\3"+
		"\2\2\2\u0441\u0442\3\2\2\2\u0442\u0451\3\2\2\2\u0443\u0445\7\34\2\2\u0444"+
		"\u0446\7&\2\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\3\2"+
		"\2\2\u0447\u0449\5\u00ccg\2\u0448\u044a\5X-\2\u0449\u0448\3\2\2\2\u0449"+
		"\u044a\3\2\2\2\u044a\u0451\3\2\2\2\u044b\u044d\7\34\2\2\u044c\u044e\7"+
		"\25\2\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\3\2\2\2\u044f"+
		"\u0451\5L\'\2\u0450\u043b\3\2\2\2\u0450\u0443\3\2\2\2\u0450\u044b\3\2"+
		"\2\2\u0451O\3\2\2\2\u0452\u0454\7\34\2\2\u0453\u0455\7\25\2\2\u0454\u0453"+
		"\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0492\5L\'\2\u0457"+
		"\u0459\7\t\2\2\u0458\u045a\7\25\2\2\u0459\u0458\3\2\2\2\u0459\u045a\3"+
		"\2\2\2\u045a\u045c\3\2\2\2\u045b\u045d\5^\60\2\u045c\u045b\3\2\2\2\u045c"+
		"\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045f\5\\/\2\u045f\u0461\5\u00fe"+
		"\u0080\2\u0460\u0462\5\u010c\u0087\2\u0461\u0460\3\2\2\2\u0461\u0462\3"+
		"\2\2\2\u0462\u0492\3\2\2\2\u0463\u0465\7\30\2\2\u0464\u0466\7\25\2\2\u0465"+
		"\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0468\3\2\2\2\u0467\u0469\5^"+
		"\60\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"\u046b\5\\/\2\u046b\u046d\5\u00fe\u0080\2\u046c\u046e\5\u010c\u0087\2"+
		"\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0492\3\2\2\2\u046f\u0471"+
		"\7\t\2\2\u0470\u0472\7\25\2\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2"+
		"\u0472\u0474\3\2\2\2\u0473\u0475\5^\60\2\u0474\u0473\3\2\2\2\u0474\u0475"+
		"\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0478\5\\/\2\u0477\u0479\5R*\2\u0478"+
		"\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u047c\5\u00f6"+
		"|\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e\3\2\2\2\u047d"+
		"\u047f\5\u010c\u0087\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0492"+
		"\3\2\2\2\u0480\u0482\7\30\2\2\u0481\u0483\7\25\2\2\u0482\u0481\3\2\2\2"+
		"\u0482\u0483\3\2\2\2\u0483\u0485\3\2\2\2\u0484\u0486\5^\60\2\u0485\u0484"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\5\\/\2\u0488"+
		"\u048a\5R*\2\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048c\3\2\2"+
		"\2\u048b\u048d\5\u00f6|\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u048f\3\2\2\2\u048e\u0490\5\u010c\u0087\2\u048f\u048e\3\2\2\2\u048f\u0490"+
		"\3\2\2\2\u0490\u0492\3\2\2\2\u0491\u0452\3\2\2\2\u0491\u0457\3\2\2\2\u0491"+
		"\u0463\3\2\2\2\u0491\u046f\3\2\2\2\u0491\u0480\3\2\2\2\u0492Q\3\2\2\2"+
		"\u0493\u0494\7M\2\2\u0494\u0495\5\u00f4{\2\u0495S\3\2\2\2\u0496\u0497"+
		"\7M\2\2\u0497\u0498\5\u00f4{\2\u0498U\3\2\2\2\u0499\u049a\7M\2\2\u049a"+
		"\u049e\5\u00f4{\2\u049b\u049c\7j\2\2\u049c\u049e\5\u00e8u\2\u049d\u0499"+
		"\3\2\2\2\u049d\u049b\3\2\2\2\u049eW\3\2\2\2\u049f\u04a0\7M\2\2\u04a0\u04a7"+
		"\5\u00f4{\2\u04a1\u04a2\7j\2\2\u04a2\u04a3\5\u00eav\2\u04a3\u04a4\7X\2"+
		"\2\u04a4\u04a5\5B\"\2\u04a5\u04a7\3\2\2\2\u04a6\u049f\3\2\2\2\u04a6\u04a1"+
		"\3\2\2\2\u04a7Y\3\2\2\2\u04a8\u04a9\5\u00c8e\2\u04a9\u04aa\7L\2\2\u04aa"+
		"\u04ab\5\u00ccg\2\u04ab\u04ae\3\2\2\2\u04ac\u04ae\5\u00ccg\2\u04ad\u04a8"+
		"\3\2\2\2\u04ad\u04ac\3\2\2\2\u04ae[\3\2\2\2\u04af\u04b1\7\37\2\2\u04b0"+
		"\u04b2\5\u00e6t\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3"+
		"\3\2\2\2\u04b3\u04b4\7e\2\2\u04b4\u04b5\5\u00c8e\2\u04b5\u04b6\7L\2\2"+
		"\u04b6\u04b7\5\u00ccg\2\u04b7\u04c4\3\2\2\2\u04b8\u04ba\7\37\2\2\u04b9"+
		"\u04bb\5\u00e6t\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc"+
		"\3\2\2\2\u04bc\u04bd\7e\2\2\u04bd\u04c4\5\u00ccg\2\u04be\u04bf\5\u00c8"+
		"e\2\u04bf\u04c0\7L\2\2\u04c0\u04c1\5\u00ccg\2\u04c1\u04c4\3\2\2\2\u04c2"+
		"\u04c4\5\u00ccg\2\u04c3\u04af\3\2\2\2\u04c3\u04b8\3\2\2\2\u04c3\u04be"+
		"\3\2\2\2\u04c3\u04c2\3\2\2\2\u04c4]\3\2\2\2\u04c5\u04c6\7\u0083\2\2\u04c6"+
		"\u04c7\7E\2\2\u04c7\u04c8\7\u0080\2\2\u04c8\u04c9\7\u0080\2\2\u04c9\u04cf"+
		"\7\u0084\2\2\u04ca\u04cb\7\u0083\2\2\u04cb\u04cc\7E\2\2\u04cc\u04cd\7"+
		"\u0080\2\2\u04cd\u04cf\7\u0084\2\2\u04ce\u04c5\3\2\2\2\u04ce\u04ca\3\2"+
		"\2\2\u04cf_\3\2\2\2\u04d0\u04d2\7\13\2\2\u04d1\u04d3\5> \2\u04d2\u04d1"+
		"\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\7\25\2\2"+
		"\u04d5\u04d7\58\35\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8"+
		"\3\2\2\2\u04d8\u04d9\5\u00dep\2\u04d9a\3\2\2\2\u04da\u04db\7\34\2\2\u04db"+
		"\u04dc\7\'\2\2\u04dc\u04de\5\u01a8\u00d5\2\u04dd\u04df\5d\63\2\u04de\u04dd"+
		"\3\2\2\2\u04de\u04df\3\2\2\2\u04dfc\3\2\2\2\u04e0\u04e2\5f\64\2\u04e1"+
		"\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2"+
		"\2\2\u04e4e\3\2\2\2\u04e5\u04e8\5\u01d2\u00ea\2\u04e6\u04e8\7\36\2\2\u04e7"+
		"\u04e5\3\2\2\2\u04e7\u04e6\3\2\2\2\u04e8g\3\2\2\2\u04e9\u04ea\7\61\2\2"+
		"\u04ea\u04eb\5j\66\2\u04eb\u04ec\7j\2\2\u04ec\u04ed\5\u016a\u00b6\2\u04ed"+
		"\u04f6\3\2\2\2\u04ee\u04ef\7\61\2\2\u04ef\u04f0\5j\66\2\u04f0\u04f1\7"+
		"O\2\2\u04f1\u04f3\5\u016a\u00b6\2\u04f2\u04f4\5p9\2\u04f3\u04f2\3\2\2"+
		"\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6\3\2\2\2\u04f5\u04e9\3\2\2\2\u04f5\u04ee"+
		"\3\2\2\2\u04f6i\3\2\2\2\u04f7\u04f9\5\u0196\u00cc\2\u04f8\u04fa\5l\67"+
		"\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u0505\3\2\2\2\u04fb\u04fc"+
		"\5\u01d2\u00ea\2\u04fc\u04fd\5\u019e\u00d0\2\u04fd\u04fe\5\u01d2\u00ea"+
		"\2\u04fe\u0505\3\2\2\2\u04ff\u0500\5\u0196\u00cc\2\u0500\u0501\7\u0087"+
		"\2\2\u0501\u0502\5n8\2\u0502\u0503\7\u0088\2\2\u0503\u0505\3\2\2\2\u0504"+
		"\u04f7\3\2\2\2\u0504\u04fb\3\2\2\2\u0504\u04ff\3\2\2\2\u0505k\3\2\2\2"+
		"\u0506\u0508\5\u01d2\u00ea\2\u0507\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050am\3\2\2\2\u050b\u0510\5\u01cc"+
		"\u00e7\2\u050c\u050d\7h\2\2\u050d\u050f\5\u01cc\u00e7\2\u050e\u050c\3"+
		"\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511"+
		"o\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u0514\7\35\2\2\u0514\u0516\5\u01e8"+
		"\u00f5\2\u0515\u0517\5\u0084C\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2"+
		"\2\u0517\u0518\3\2\2\2\u0518\u0519\5\u01ea\u00f6\2\u0519q\3\2\2\2\u051a"+
		"\u051b\7\61\2\2\u051b\u051c\5\u0198\u00cd\2\u051c\u051d\7M\2\2\u051d\u051e"+
		"\5\u00b6\\\2\u051es\3\2\2\2\u051f\u0527\5N(\2\u0520\u0527\5\u0114\u008b"+
		"\2\u0521\u0522\7\n\2\2\u0522\u0523\5\u0128\u0095\2\u0523\u0524\7M\2\2"+
		"\u0524\u0525\5\u00b6\\\2\u0525\u0527\3\2\2\2\u0526\u051f\3\2\2\2\u0526"+
		"\u0520\3\2\2\2\u0526\u0521\3\2\2\2\u0527u\3\2\2\2\u0528\u0532\5t;\2\u0529"+
		"\u052b\5\u01ec\u00f7\2\u052a\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052a"+
		"\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u052f\5t;\2\u052f"+
		"\u0531\3\2\2\2\u0530\u052a\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0530\3\2"+
		"\2\2\u0532\u0533\3\2\2\2\u0533\u0538\3\2\2\2\u0534\u0532\3\2\2\2\u0535"+
		"\u0537\5\u01ec\u00f7\2\u0536\u0535\3\2\2\2\u0537\u053a\3\2\2\2\u0538\u0536"+
		"\3\2\2\2\u0538\u0539\3\2\2\2\u0539w\3\2\2\2\u053a\u0538\3\2\2\2\u053b"+
		"\u053d\5\u01e8\u00f5\2\u053c\u053e\5v<\2\u053d\u053c\3\2\2\2\u053d\u053e"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\5\u01ea\u00f6\2\u0540y\3\2\2"+
		"\2\u0541\u0542\7\35\2\2\u0542\u0543\5x=\2\u0543{\3\2\2\2\u0544\u0547\5"+
		"P)\2\u0545\u0547\5\u0114\u008b\2\u0546\u0544\3\2\2\2\u0546\u0545\3\2\2"+
		"\2\u0547}\3\2\2\2\u0548\u0552\5|?\2\u0549\u054b\5\u01ec\u00f7\2\u054a"+
		"\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2"+
		"\2\2\u054d\u054e\3\2\2\2\u054e\u054f\5|?\2\u054f\u0551\3\2\2\2\u0550\u054a"+
		"\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2\2\2\u0553"+
		"\u0558\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u0557\5\u01ec\u00f7\2\u0556\u0555"+
		"\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559"+
		"\177\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u055d\5\u01e8\u00f5\2\u055c\u055e"+
		"\5~@\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f"+
		"\u0560\5\u01ea\u00f6\2\u0560\u0081\3\2\2\2\u0561\u0562\7\35\2\2\u0562"+
		"\u0563\5\u0080A\2\u0563\u0083\3\2\2\2\u0564\u056e\5\u0114\u008b\2\u0565"+
		"\u0567\5\u01ec\u00f7\2\u0566\u0565\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0566"+
		"\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\5\u0114\u008b"+
		"\2\u056b\u056d\3\2\2\2\u056c\u0566\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c"+
		"\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0574\3\2\2\2\u0570\u056e\3\2\2\2\u0571"+
		"\u0573\5\u01ec\u00f7\2\u0572\u0571\3\2\2\2\u0573\u0576\3\2\2\2\u0574\u0572"+
		"\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0085\3\2\2\2\u0576\u0574\3\2\2\2\u0577"+
		"\u0579\5\u01e8\u00f5\2\u0578\u057a\5\u0084C\2\u0579\u0578\3\2\2\2\u0579"+
		"\u057a\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\5\u01ea\u00f6\2\u057c\u0087"+
		"\3\2\2\2\u057d\u0585\5\u0086D\2\u057e\u0580\5\u01e8\u00f5\2\u057f\u0581"+
		"\5\u0180\u00c1\2\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\3"+
		"\2\2\2\u0582\u0583\5\u01ea\u00f6\2\u0583\u0585\3\2\2\2\u0584\u057d\3\2"+
		"\2\2\u0584\u057e\3\2\2\2\u0585\u0089\3\2\2\2\u0586\u0587\7\35\2\2\u0587"+
		"\u0588\5\u0088E\2\u0588\u008b\3\2\2\2\u0589\u058f\5\u008eH\2\u058a\u058b"+
		"\5\u01ec\u00f7\2\u058b\u058c\5\u008eH\2\u058c\u058e\3\2\2\2\u058d\u058a"+
		"\3\2\2\2\u058e\u0591\3\2\2\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590"+
		"\u0593\3\2\2\2\u0591\u058f\3\2\2\2\u0592\u0594\5\u01ec\u00f7\2\u0593\u0592"+
		"\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u008d\3\2\2\2\u0595\u0597\5\u0204\u0103"+
		"\2\u0596\u0598\5\u0092J\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598"+
		"\u059a\3\2\2\2\u0599\u059b\5\u0094K\2\u059a\u0599\3\2\2\2\u059a\u059b"+
		"\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059d\5\u0128\u0095\2\u059d\u059e\7"+
		"j\2\2\u059e\u059f\5\u0126\u0094\2\u059f\u008f\3\2\2\2\u05a0\u05a3\7`\2"+
		"\2\u05a1\u05a3\5\u01d8\u00ed\2\u05a2\u05a0\3\2\2\2\u05a2\u05a1\3\2\2\2"+
		"\u05a3\u0091\3\2\2\2\u05a4\u05a5\7}\2\2\u05a5\u05a6\5\u01fe\u0100\2\u05a6"+
		"\u05a7\7~\2\2\u05a7\u05b2\3\2\2\2\u05a8\u05a9\7}\2\2\u05a9\u05aa\5\u0090"+
		"I\2\u05aa\u05ab\5\u01fe\u0100\2\u05ab\u05ac\7~\2\2\u05ac\u05b2\3\2\2\2"+
		"\u05ad\u05ae\7}\2\2\u05ae\u05af\5\u0090I\2\u05af\u05b0\7~\2\2\u05b0\u05b2"+
		"\3\2\2\2\u05b1\u05a4\3\2\2\2\u05b1\u05a8\3\2\2\2\u05b1\u05ad\3\2\2\2\u05b2"+
		"\u0093\3\2\2\2\u05b3\u05b5\7\37\2\2\u05b4\u05b6\5\u0096L\2\u05b5\u05b4"+
		"\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05bd\7e\2\2\u05b8"+
		"\u05ba\7\37\2\2\u05b9\u05bb\5\u0096L\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb"+
		"\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05be\7e\2\2\u05bd\u05b8\3\2\2\2\u05bd"+
		"\u05be\3\2\2\2\u05be\u0095\3\2\2\2\u05bf\u05c1\5\u0098M\2\u05c0\u05bf"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3"+
		"\u0097\3\2\2\2\u05c4\u05cc\5\u01d2\u00ea\2\u05c5\u05c6\7{\2\2\u05c6\u05c7"+
		"\5\u01d2\u00ea\2\u05c7\u05c8\7M\2\2\u05c8\u05c9\5\u00c4c\2\u05c9\u05ca"+
		"\7|\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05c4\3\2\2\2\u05cb\u05c5\3\2\2\2\u05cc"+
		"\u0099\3\2\2\2\u05cd\u05d3\5\u009cO\2\u05ce\u05cf\5\u01ec\u00f7\2\u05cf"+
		"\u05d0\5\u009cO\2\u05d0\u05d2\3\2\2\2\u05d1\u05ce\3\2\2\2\u05d2\u05d5"+
		"\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d7\3\2\2\2\u05d5"+
		"\u05d3\3\2\2\2\u05d6\u05d8\5\u01ec\u00f7\2\u05d7\u05d6\3\2\2\2\u05d7\u05d8"+
		"\3\2\2\2\u05d8\u009b\3\2\2\2\u05d9\u05da\5\u018c\u00c7\2\u05da\u05db\5"+
		"\u00a2R\2\u05db\u009d\3\2\2\2\u05dc\u05e2\5\u00a0Q\2\u05dd\u05de\5\u01ec"+
		"\u00f7\2\u05de\u05df\5\u00a0Q\2\u05df\u05e1\3\2\2\2\u05e0\u05dd\3\2\2"+
		"\2\u05e1\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e6"+
		"\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e5\u05e7\5\u01ec\u00f7\2\u05e6\u05e5\3"+
		"\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u009f\3\2\2\2\u05e8\u05e9\5\u018c\u00c7"+
		"\2\u05e9\u05ea\5\u00a2R\2\u05ea\u00a1\3\2\2\2\u05eb\u05f2\5\u0204\u0103"+
		"\2\u05ec\u05ee\7}\2\2\u05ed\u05ef\5\u00a4S\2\u05ee\u05ed\3\2\2\2\u05ee"+
		"\u05ef\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f2\7~\2\2\u05f1\u05eb\3\2"+
		"\2\2\u05f1\u05ec\3\2\2\2\u05f2\u00a3\3\2\2\2\u05f3\u05f8\5\u0204\u0103"+
		"\2\u05f4\u05f5\7h\2\2\u05f5\u05f7\5\u0204\u0103\2\u05f6\u05f4\3\2\2\2"+
		"\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u00a5"+
		"\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05fc\7\u0083\2\2\u05fc\u05fd\7C\2"+
		"\2\u05fd\u05fe\5\u018e\u00c8\2\u05fe\u05ff\5\u0130\u0099\2\u05ff\u0600"+
		"\7\u0084\2\2\u0600\u060e\3\2\2\2\u0601\u0602\7\u0083\2\2\u0602\u0603\7"+
		"C\2\2\u0603\u0604\5\u01ae\u00d8\2\u0604\u0605\5\u0130\u0099\2\u0605\u0606"+
		"\7\u0084\2\2\u0606\u060e\3\2\2\2\u0607\u0608\7\u0083\2\2\u0608\u0609\7"+
		"C\2\2\u0609\u060a\7\27\2\2\u060a\u060b\5\u0130\u0099\2\u060b\u060c\7\u0084"+
		"\2\2\u060c\u060e\3\2\2\2\u060d\u05fb\3\2\2\2\u060d\u0601\3\2\2\2\u060d"+
		"\u0607\3\2\2\2\u060e\u00a7\3\2\2\2\u060f\u0610\7\20\2\2\u0610\u0612\5"+
		"\u00aaV\2\u0611\u0613\5\u00acW\2\u0612\u0611\3\2\2\2\u0612\u0613\3\2\2"+
		"\2\u0613\u0614\3\2\2\2\u0614\u0615\5\u00aeX\2\u0615\u061b\3\2\2\2\u0616"+
		"\u0617\7!\2\2\u0617\u0618\5\u00aaV\2\u0618\u0619\5\u00aeX\2\u0619\u061b"+
		"\3\2\2\2\u061a\u060f\3\2\2\2\u061a\u0616\3\2\2\2\u061b\u00a9\3\2\2\2\u061c"+
		"\u061d\t\4\2\2\u061d\u00ab\3\2\2\2\u061e\u061f\t\5\2\2\u061f\u00ad\3\2"+
		"\2\2\u0620\u0622\5\u0204\u0103\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2"+
		"\2\u0622\u0623\3\2\2\2\u0623\u0624\5\u01cc\u00e7\2\u0624\u0625\7M\2\2"+
		"\u0625\u0626\5\u00b6\\\2\u0626\u00af\3\2\2\2\u0627\u0628\7M\2\2\u0628"+
		"\u0629\5\u00b4[\2\u0629\u00b1\3\2\2\2\u062a\u062b\7M\2\2\u062b\u062c\5"+
		"\u01a4\u00d3\2\u062c\u00b3\3\2\2\2\u062d\u062e\5\u00c4c\2\u062e\u00b5"+
		"\3\2\2\2\u062f\u0630\5\u00c6d\2\u0630\u00b7\3\2\2\2\u0631\u0636\5\u01cc"+
		"\u00e7\2\u0632\u0633\7h\2\2\u0633\u0635\5\u01cc\u00e7\2\u0634\u0632\3"+
		"\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2\2\2\u0637"+
		"\u00b9\3\2\2\2\u0638\u0636\3\2\2\2\u0639\u063e\5\u00b4[\2\u063a\u063b"+
		"\7h\2\2\u063b\u063d\5\u00b4[\2\u063c\u063a\3\2\2\2\u063d\u0640\3\2\2\2"+
		"\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u00bb\3\2\2\2\u0640\u063e"+
		"\3\2\2\2\u0641\u0642\7\u0083\2\2\u0642\u0643\7A\2\2\u0643\u0648\7\u0084"+
		"\2\2\u0644\u0645\7\u0083\2\2\u0645\u0646\7B\2\2\u0646\u0648\7\u0084\2"+
		"\2\u0647\u0641\3\2\2\2\u0647\u0644\3\2\2\2\u0648\u00bd\3\2\2\2\u0649\u064a"+
		"\t\6\2\2\u064a\u00bf\3\2\2\2\u064b\u0651\5\u00c4c\2\u064c\u064d\5\u00c4"+
		"c\2\u064d\u064e\7M\2\2\u064e\u064f\5\u00f4{\2\u064f\u0651\3\2\2\2\u0650"+
		"\u064b\3\2\2\2\u0650\u064c\3\2\2\2\u0651\u00c1\3\2\2\2\u0652\u0658\5\u00c6"+
		"d\2\u0653\u0654\5\u00c6d\2\u0654\u0655\7M\2\2\u0655\u0656\5\u00f4{\2\u0656"+
		"\u0658\3\2\2\2\u0657\u0652\3\2\2\2\u0657\u0653\3\2\2\2\u0658\u00c3\3\2"+
		"\2\2\u0659\u065b\7\37\2\2\u065a\u065c\5\u00e6t\2\u065b\u065a\3\2\2\2\u065b"+
		"\u065c\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\5\u00be`\2\u065e\u065f"+
		"\5\u00c4c\2\u065f\u066a\3\2\2\2\u0660\u0661\5\u00d6l\2\u0661\u0662\7L"+
		"\2\2\u0662\u0663\5\u00c4c\2\u0663\u066a\3\2\2\2\u0664\u0665\5\u01cc\u00e7"+
		"\2\u0665\u0666\7M\2\2\u0666\u0667\5\u00ccg\2\u0667\u066a\3\2\2\2\u0668"+
		"\u066a\5\u00ccg\2\u0669\u0659\3\2\2\2\u0669\u0660\3\2\2\2\u0669\u0664"+
		"\3\2\2\2\u0669\u0668\3\2\2\2\u066a\u00c5\3\2\2\2\u066b\u066d\7\37\2\2"+
		"\u066c\u066e\5\u00e6t\2\u066d\u066c\3\2\2\2\u066d\u066e\3\2\2\2\u066e"+
		"\u066f\3\2\2\2\u066f\u0670\5\u00be`\2\u0670\u0671\5\u00c6d\2\u0671\u067c"+
		"\3\2\2\2\u0672\u0673\5\u00c8e\2\u0673\u0674\7L\2\2\u0674\u0675\5\u00c6"+
		"d\2\u0675\u067c\3\2\2\2\u0676\u0677\5\u01cc\u00e7\2\u0677\u0678\7M\2\2"+
		"\u0678\u0679\5\u00ccg\2\u0679\u067c\3\2\2\2\u067a\u067c\5\u00ceh\2\u067b"+
		"\u066b\3\2\2\2\u067b\u0672\3\2\2\2\u067b\u0676\3\2\2\2\u067b\u067a\3\2"+
		"\2\2\u067c\u00c7\3\2\2\2\u067d\u067e\5\u00d6l\2\u067e\u00c9\3\2\2\2\u067f"+
		"\u0680\5\u00d0i\2\u0680\u00cb\3\2\2\2\u0681\u0687\5\u00d6l\2\u0682\u0683"+
		"\5\u00d6l\2\u0683\u0684\7N\2\2\u0684\u0685\5\u00c4c\2\u0685\u0687\3\2"+
		"\2\2\u0686\u0681\3\2\2\2\u0686\u0682\3\2\2\2\u0687\u00cd\3\2\2\2\u0688"+
		"\u068e\5\u00d6l\2\u0689\u068a\5\u00d6l\2\u068a\u068b\7N\2\2\u068b\u068c"+
		"\5\u00c6d\2\u068c\u068e\3\2\2\2\u068d\u0688\3\2\2\2\u068d\u0689\3\2\2"+
		"\2\u068e\u00cf\3\2\2\2\u068f\u0690\5\u00d2j\2\u0690\u00d1\3\2\2\2\u0691"+
		"\u0693\5\u00d4k\2\u0692\u0691\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0692"+
		"\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u00d3\3\2\2\2\u0696\u0697\5\u00dan"+
		"\2\u0697\u00d5\3\2\2\2\u0698\u0699\5\u00d8m\2\u0699\u00d7\3\2\2\2\u069a"+
		"\u069c\5\u00dan\2\u069b\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069b"+
		"\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u00d9\3\2\2\2\u069f\u06aa\5\u00dco"+
		"\2\u06a0\u06a1\7a\2\2\u06a1\u06aa\5\u00dco\2\u06a2\u06aa\5\u01aa\u00d6"+
		"\2\u06a3\u06aa\5\u01c4\u00e3\2\u06a4\u06a5\7l\2\2\u06a5\u06aa\5\u01a0"+
		"\u00d1\2\u06a6\u06a7\7l\2\2\u06a7\u06aa\5\u01b6\u00dc\2\u06a8\u06aa\5"+
		"\u00bc_\2\u06a9\u069f\3\2\2\2\u06a9\u06a0\3\2\2\2\u06a9\u06a2\3\2\2\2"+
		"\u06a9\u06a3\3\2\2\2\u06a9\u06a4\3\2\2\2\u06a9\u06a6\3\2\2\2\u06a9\u06a8"+
		"\3\2\2\2\u06aa\u00db\3\2\2\2\u06ab\u06ee\5\u01a6\u00d4\2\u06ac\u06ee\5"+
		"\u01c2\u00e2\2\u06ad\u06ee\7]\2\2\u06ae\u06af\7`\2\2\u06af\u06ee\5\u00dc"+
		"o\2\u06b0\u06b1\7Y\2\2\u06b1\u06ee\5\u00dco\2\u06b2\u06b4\7\u0087\2\2"+
		"\u06b3\u06b5\5\u0108\u0085\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5"+
		"\u06b6\3\2\2\2\u06b6\u06ee\7\u0088\2\2\u06b7\u06b8\7{\2\2\u06b8\u06ee"+
		"\7|\2\2\u06b9\u06ba\7{\2\2\u06ba\u06bb\5\u00c0a\2\u06bb\u06bc\7h\2\2\u06bc"+
		"\u06bd\5\u00e2r\2\u06bd\u06be\7|\2\2\u06be\u06ee\3\2\2\2\u06bf\u06c0\7"+
		"y\2\2\u06c0\u06ee\7z\2\2\u06c1\u06c2\7y\2\2\u06c2\u06c3\5\u00e2r\2\u06c3"+
		"\u06c4\7z\2\2\u06c4\u06ee\3\2\2\2\u06c5\u06c6\7y\2\2\u06c6\u06c7\5\u00e4"+
		"s\2\u06c7\u06c8\7z\2\2\u06c8\u06ee\3\2\2\2\u06c9\u06ca\7}\2\2\u06ca\u06cb"+
		"\5\u00c0a\2\u06cb\u06cc\7~\2\2\u06cc\u06ee\3\2\2\2\u06cd\u06ce\7{\2\2"+
		"\u06ce\u06cf\5\u00c0a\2\u06cf\u06d0\7|\2\2\u06d0\u06ee\3\2\2\2\u06d1\u06ee"+
		"\5\u0124\u0093\2\u06d2\u06ee\5\u0138\u009d\2\u06d3\u06d4\7l\2\2\u06d4"+
		"\u06ee\5\u0190\u00c9\2\u06d5\u06d6\7l\2\2\u06d6\u06d7\7{\2\2\u06d7\u06d8"+
		"\5\u00c0a\2\u06d8\u06d9\7h\2\2\u06d9\u06da\5\u00e2r\2\u06da\u06db\7|\2"+
		"\2\u06db\u06ee\3\2\2\2\u06dc\u06dd\7l\2\2\u06dd\u06df\7}\2\2\u06de\u06e0"+
		"\5\u00e2r\2\u06df\u06de\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e1\3\2\2"+
		"\2\u06e1\u06ee\7~\2\2\u06e2\u06e3\7l\2\2\u06e3\u06ee\5\u01cc\u00e7\2\u06e4"+
		"\u06e5\7}\2\2\u06e5\u06e6\5\u00c0a\2\u06e6\u06e7\7h\2\2\u06e7\u06e8\5"+
		"\u00e2r\2\u06e8\u06e9\7~\2\2\u06e9\u06ee\3\2\2\2\u06ea\u06ee\5\u01fe\u0100"+
		"\2\u06eb\u06ee\5\u0204\u0103\2\u06ec\u06ee\7\36\2\2\u06ed\u06ab\3\2\2"+
		"\2\u06ed\u06ac\3\2\2\2\u06ed\u06ad\3\2\2\2\u06ed\u06ae\3\2\2\2\u06ed\u06b0"+
		"\3\2\2\2\u06ed\u06b2\3\2\2\2\u06ed\u06b7\3\2\2\2\u06ed\u06b9\3\2\2\2\u06ed"+
		"\u06bf\3\2\2\2\u06ed\u06c1\3\2\2\2\u06ed\u06c5\3\2\2\2\u06ed\u06c9\3\2"+
		"\2\2\u06ed\u06cd\3\2\2\2\u06ed\u06d1\3\2\2\2\u06ed\u06d2\3\2\2\2\u06ed"+
		"\u06d3\3\2\2\2\u06ed\u06d5\3\2\2\2\u06ed\u06dc\3\2\2\2\u06ed\u06e2\3\2"+
		"\2\2\u06ed\u06e4\3\2\2\2\u06ed\u06ea\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed"+
		"\u06ec\3\2\2\2\u06ee\u00dd\3\2\2\2\u06ef\u06f0\5\u00b4[\2\u06f0\u00df"+
		"\3\2\2\2\u06f1\u06f6\5\u00c2b\2\u06f2\u06f3\7h\2\2\u06f3\u06f5\5\u00c2"+
		"b\2\u06f4\u06f2\3\2\2\2\u06f5\u06f8\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f6"+
		"\u06f7\3\2\2\2\u06f7\u00e1\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f9\u06fe\5\u00c0"+
		"a\2\u06fa\u06fb\7h\2\2\u06fb\u06fd\5\u00c0a\2\u06fc\u06fa\3\2\2\2\u06fd"+
		"\u0700\3\2\2\2\u06fe\u06fc\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u00e3\3\2"+
		"\2\2\u0700\u06fe\3\2\2\2\u0701\u0702\5\u00c0a\2\u0702\u0703\7X\2\2\u0703"+
		"\u0708\5\u00c0a\2\u0704\u0705\7X\2\2\u0705\u0707\5\u00c0a\2\u0706\u0704"+
		"\3\2\2\2\u0707\u070a\3\2\2\2\u0708\u0706\3\2\2\2\u0708\u0709\3\2\2\2\u0709"+
		"\u00e5\3\2\2\2\u070a\u0708\3\2\2\2\u070b\u070d\5\u00e8u\2\u070c\u070b"+
		"\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070c\3\2\2\2\u070e\u070f\3\2\2\2\u070f"+
		"\u00e7\3\2\2\2\u0710\u071c\5\u00eav\2\u0711\u0712\7\u0087\2\2\u0712\u0713"+
		"\5\u01c2\u00e2\2\u0713\u0714\7\u0088\2\2\u0714\u071c\3\2\2\2\u0715\u0716"+
		"\7\u0087\2\2\u0716\u0717\5\u01c2\u00e2\2\u0717\u0718\7M\2\2\u0718\u0719"+
		"\5\u00f4{\2\u0719\u071a\7\u0088\2\2\u071a\u071c\3\2\2\2\u071b\u0710\3"+
		"\2\2\2\u071b\u0711\3\2\2\2\u071b\u0715\3\2\2\2\u071c\u00e9\3\2\2\2\u071d"+
		"\u0725\5\u01c2\u00e2\2\u071e\u071f\7{\2\2\u071f\u0720\5\u01c2\u00e2\2"+
		"\u0720\u0721\7M\2\2\u0721\u0722\5\u00f4{\2\u0722\u0723\7|\2\2\u0723\u0725"+
		"\3\2\2\2\u0724\u071d\3\2\2\2\u0724\u071e\3\2\2\2\u0725\u00eb\3\2\2\2\u0726"+
		"\u0727\7X\2\2\u0727\u0728\5\u00eex\2\u0728\u00ed\3\2\2\2\u0729\u072e\5"+
		"\u00f0y\2\u072a\u072b\7h\2\2\u072b\u072d\5\u00f0y\2\u072c\u072a\3\2\2"+
		"\2\u072d\u0730\3\2\2\2\u072e\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u00ef"+
		"\3\2\2\2\u0730\u072e\3\2\2\2\u0731\u0733\5\u00f2z\2\u0732\u0731\3\2\2"+
		"\2\u0732\u0733\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0736\7N\2\2\u0735\u0737"+
		"\5\u00f2z\2\u0736\u0735\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u00f1\3\2\2"+
		"\2\u0738\u073a\5\u01c2\u00e2\2\u0739\u0738\3\2\2\2\u073a\u073b\3\2\2\2"+
		"\u073b\u0739\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u00f3\3\2\2\2\u073d\u073e"+
		"\5\u00c4c\2\u073e\u00f5\3\2\2\2\u073f\u0740\7\35\2\2\u0740\u0742\5\u01e8"+
		"\u00f5\2\u0741\u0743\5\u00f8}\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2"+
		"\2\u0743\u0747\3\2\2\2\u0744\u0746\5\u01ec\u00f7\2\u0745\u0744\3\2\2\2"+
		"\u0746\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074a"+
		"\3\2\2\2\u0749\u0747\3\2\2\2\u074a\u074b\5\u01ea\u00f6\2\u074b\u00f7\3"+
		"\2\2\2\u074c\u0752\5\u00fa~\2\u074d\u074e\5\u01ec\u00f7\2\u074e\u074f"+
		"\5\u00fa~\2\u074f\u0751\3\2\2\2\u0750\u074d\3\2\2\2\u0751\u0754\3\2\2"+
		"\2\u0752\u0750\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u00f9\3\2\2\2\u0754\u0752"+
		"\3\2\2\2\u0755\u0756\5\u00fc\177\2\u0756\u00fb\3\2\2\2\u0757\u0758\5\u0198"+
		"\u00cd\2\u0758\u0759\7M\2\2\u0759\u075a\5\u00b6\\\2\u075a\u00fd\3\2\2"+
		"\2\u075b\u075c\7j\2\2\u075c\u075d\5\u0100\u0081\2\u075d\u00ff\3\2\2\2"+
		"\u075e\u0763\5\u0102\u0082\2\u075f\u0760\7X\2\2\u0760\u0762\5\u0102\u0082"+
		"\2\u0761\u075f\3\2\2\2\u0762\u0765\3\2\2\2\u0763\u0761\3\2\2\2\u0763\u0764"+
		"\3\2\2\2\u0764\u0101\3\2\2\2\u0765\u0763\3\2\2\2\u0766\u0768\5\u0104\u0083"+
		"\2\u0767\u0766\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076c\3\2\2\2\u0769\u076a"+
		"\5\u00caf\2\u076a\u076b\7L\2\2\u076b\u076d\3\2\2\2\u076c\u0769\3\2\2\2"+
		"\u076c\u076d\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u076f\5\u0106\u0084\2\u076f"+
		"\u0103\3\2\2\2\u0770\u0772\7\37\2\2\u0771\u0773\5\u00e6t\2\u0772\u0771"+
		"\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\7e\2\2\u0775"+
		"\u0105\3\2\2\2\u0776\u0777\5\u00d2j\2\u0777\u0107\3\2\2\2\u0778\u077d"+
		"\5\u010a\u0086\2\u0779\u077a\7h\2\2\u077a\u077c\5\u010a\u0086\2\u077b"+
		"\u0779\3\2\2\2\u077c\u077f\3\2\2\2\u077d\u077b\3\2\2\2\u077d\u077e\3\2"+
		"\2\2\u077e\u0109\3\2\2\2\u077f\u077d\3\2\2\2\u0780\u0781\5\u00b8]\2\u0781"+
		"\u0782\7M\2\2\u0782\u0783\5\u00c4c\2\u0783\u010b\3\2\2\2\u0784\u0786\5"+
		"\u010e\u0088\2\u0785\u0784\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0785\3\2"+
		"\2\2\u0787\u0788\3\2\2\2\u0788\u010d\3\2\2\2\u0789\u078a\7\13\2\2\u078a"+
		"\u0794\5\u0110\u0089\2\u078b\u078c\7\13\2\2\u078c\u078d\5:\36\2\u078d"+
		"\u078e\5\u0110\u0089\2\u078e\u0794\3\2\2\2\u078f\u0790\7\13\2\2\u0790"+
		"\u0791\5\u0110\u0089\2\u0791\u0792\5<\37\2\u0792\u0794\3\2\2\2\u0793\u0789"+
		"\3\2\2\2\u0793\u078b\3\2\2\2\u0793\u078f\3\2\2\2\u0794\u010f\3\2\2\2\u0795"+
		"\u079d\5\u01ac\u00d7\2\u0796\u0797\7{\2\2\u0797\u079d\7|\2\2\u0798\u0799"+
		"\7{\2\2\u0799\u079a\5\u00e0q\2\u079a\u079b\7|\2\2\u079b\u079d\3\2\2\2"+
		"\u079c\u0795\3\2\2\2\u079c\u0796\3\2\2\2\u079c\u0798\3\2\2\2\u079d\u0111"+
		"\3\2\2\2\u079e\u07ac\5\u011c\u008f\2\u079f\u07a1\5\u0128\u0095\2\u07a0"+
		"\u07a2\5\u00b0Y\2\u07a1\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a3"+
		"\3\2\2\2\u07a3\u07a4\5\u0116\u008c\2\u07a4\u07ac\3\2\2\2\u07a5\u07ac\5"+
		"h\65\2\u07a6\u07a8\5\u01ec\u00f7\2\u07a7\u07a6\3\2\2\2\u07a8\u07a9\3\2"+
		"\2\2\u07a9\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ac\3\2\2\2\u07ab"+
		"\u079e\3\2\2\2\u07ab\u079f\3\2\2\2\u07ab\u07a5\3\2\2\2\u07ab\u07a7\3\2"+
		"\2\2\u07ac\u0113\3\2\2\2\u07ad\u07b5\5\u0112\u008a\2\u07ae\u07b5\5\u0136"+
		"\u009c\2\u07af\u07b1\5\u01ec\u00f7\2\u07b0\u07af\3\2\2\2\u07b1\u07b2\3"+
		"\2\2\2\u07b2\u07b0\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b5\3\2\2\2\u07b4"+
		"\u07ad\3\2\2\2\u07b4\u07ae\3\2\2\2\u07b4\u07b0\3\2\2\2\u07b5\u0115\3\2"+
		"\2\2\u07b6\u07b7\7j\2\2\u07b7\u07b9\5\u0126\u0094\2\u07b8\u07ba\5\u008a"+
		"F\2\u07b9\u07b8\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07c0\3\2\2\2\u07bb"+
		"\u07bd\5\u0118\u008d\2\u07bc\u07be\5\u008aF\2\u07bd\u07bc\3\2\2\2\u07bd"+
		"\u07be\3\2\2\2\u07be\u07c0\3\2\2\2\u07bf\u07b6\3\2\2\2\u07bf\u07bb\3\2"+
		"\2\2\u07c0\u0117\3\2\2\2\u07c1\u07c3\5\u011a\u008e\2\u07c2\u07c1\3\2\2"+
		"\2\u07c3\u07c4\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u0119"+
		"\3\2\2\2\u07c6\u07c7\7X\2\2\u07c7\u07c8\5\u0158\u00ad\2\u07c8\u07c9\7"+
		"j\2\2\u07c9\u07ca\5\u0126\u0094\2\u07ca\u011b\3\2\2\2\u07cb\u07cc\5\u0128"+
		"\u0095\2\u07cc\u07cd\7M\2\2\u07cd\u07ce\5\u00b6\\\2\u07ce\u081b\3\2\2"+
		"\2\u07cf\u07d0\5\u01cc\u00e7\2\u07d0\u07d1\7h\2\2\u07d1\u07d2\5\u00b8"+
		"]\2\u07d2\u07d3\7M\2\2\u07d3\u07d4\5\u00b6\\\2\u07d4\u081b\3\2\2\2\u07d5"+
		"\u07d7\5&\24\2\u07d6\u07d8\5\u01fe\u0100\2\u07d7\u07d6\3\2\2\2\u07d7\u07d8"+
		"\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07da\5(\25\2\u07da\u081b\3\2\2\2\u07db"+
		"\u081b\5r:\2\u07dc\u07dd\7\u0083\2\2\u07dd\u07de\7J\2\2\u07de\u07e0\5"+
		"\u0198\u00cd\2\u07df\u07e1\5\u00b2Z\2\u07e0\u07df\3\2\2\2\u07e0\u07e1"+
		"\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e3\7\u0084\2\2\u07e3\u081b\3\2\2"+
		"\2\u07e4\u07e5\7\u0083\2\2\u07e5\u07e7\78\2\2\u07e6\u07e8\5\u011e\u0090"+
		"\2\u07e7\u07e6\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07ea"+
		"\5\u01ce\u00e8\2\u07ea\u07eb\7\u0084\2\2\u07eb\u081b\3\2\2\2\u07ec\u07ed"+
		"\7\u0083\2\2\u07ed\u07ee\7>\2\2\u07ee\u07f0\5\u01ce\u00e8\2\u07ef\u07f1"+
		"\5\u0204\u0103\2\u07f0\u07ef\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\3"+
		"\2\2\2\u07f2\u07f3\7\u0084\2\2\u07f3\u081b\3\2\2\2\u07f4\u07f5\7\u0083"+
		"\2\2\u07f5\u07f7\7:\2\2\u07f6\u07f8\5\u011e\u0090\2\u07f7\u07f6\3\2\2"+
		"\2\u07f7\u07f8\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fa\5\u01ce\u00e8\2"+
		"\u07fa\u07fb\7M\2\2\u07fb\u07fc\5\u00ba^\2\u07fc\u07fd\7\u0084\2\2\u07fd"+
		"\u081b\3\2\2\2\u07fe\u07ff\7\u0083\2\2\u07ff\u0801\7;\2\2\u0800\u0802"+
		"\5\u011e\u0090\2\u0801\u0800\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0803\3"+
		"\2\2\2\u0803\u0804\5\u01ce\u00e8\2\u0804\u0805\7M\2\2\u0805\u0806\5\u00ba"+
		"^\2\u0806\u0807\7\u0084\2\2\u0807\u081b\3\2\2\2\u0808\u0809\7\u0083\2"+
		"\2\u0809\u080a\7:\2\2\u080a\u080b\7\25\2\2\u080b\u080c\5\u00dep\2\u080c"+
		"\u080d\7\u0084\2\2\u080d\u081b\3\2\2\2\u080e\u080f\7\u0083\2\2\u080f\u0810"+
		"\7D\2\2\u0810\u0812\7\u0084\2\2\u0811\u0813\5\u0184\u00c3\2\u0812\u0811"+
		"\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u081b\7\u0084\2"+
		"\2\u0815\u0817\5\u01ec\u00f7\2\u0816\u0815\3\2\2\2\u0817\u0818\3\2\2\2"+
		"\u0818\u0816\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u081b\3\2\2\2\u081a\u07cb"+
		"\3\2\2\2\u081a\u07cf\3\2\2\2\u081a\u07d5\3\2\2\2\u081a\u07db\3\2\2\2\u081a"+
		"\u07dc\3\2\2\2\u081a\u07e4\3\2\2\2\u081a\u07ec\3\2\2\2\u081a\u07f4\3\2"+
		"\2\2\u081a\u07fe\3\2\2\2\u081a\u0808\3\2\2\2\u081a\u080e\3\2\2\2\u081a"+
		"\u0816\3\2\2\2\u081b\u011d\3\2\2\2\u081c\u081d\7}\2\2\u081d\u081e\5\u01fe"+
		"\u0100\2\u081e\u081f\7~\2\2\u081f\u0826\3\2\2\2\u0820\u0821\7}\2\2\u0821"+
		"\u0822\5\u0090I\2\u0822\u0823\5\u01fe\u0100\2\u0823\u0824\7~\2\2\u0824"+
		"\u0826\3\2\2\2\u0825\u081c\3\2\2\2\u0825\u0820\3\2\2\2\u0826\u011f\3\2"+
		"\2\2\u0827\u0828\7}\2\2\u0828\u0829\5\u01d2\u00ea\2\u0829\u082a\7X\2\2"+
		"\u082a\u0121\3\2\2\2\u082b\u082c\7}\2\2\u082c\u082d\5\u01d0\u00e9\2\u082d"+
		"\u082e\7X\2\2\u082e\u0123\3\2\2\2\u082f\u0832\5\u0120\u0091\2\u0830\u0832"+
		"\5\u0122\u0092\2\u0831\u082f\3\2\2\2\u0831\u0830\3\2\2\2\u0832\u0125\3"+
		"\2\2\2\u0833\u0834\5\u0128\u0095\2\u0834\u0835\7M\2\2\u0835\u0836\5\u00b4"+
		"[\2\u0836\u0849\3\2\2\2\u0837\u0838\5\u0128\u0095\2\u0838\u0839\7P\2\2"+
		"\u0839\u083a\5\u0126\u0094\2\u083a\u0849\3\2\2\2\u083b\u083c\5\u0128\u0095"+
		"\2\u083c\u083d\7Q\2\2\u083d\u083e\5\u0126\u0094\2\u083e\u0849\3\2\2\2"+
		"\u083f\u0840\5\u0128\u0095\2\u0840\u0841\7R\2\2\u0841\u0842\5\u0126\u0094"+
		"\2\u0842\u0849\3\2\2\2\u0843\u0844\5\u0128\u0095\2\u0844\u0845\7S\2\2"+
		"\u0845\u0846\5\u0126\u0094\2\u0846\u0849\3\2\2\2\u0847\u0849\5\u0128\u0095"+
		"\2\u0848\u0833\3\2\2\2\u0848\u0837\3\2\2\2\u0848\u083b\3\2\2\2\u0848\u083f"+
		"\3\2\2\2\u0848\u0843\3\2\2\2\u0848\u0847\3\2\2\2\u0849\u0127\3\2\2\2\u084a"+
		"\u0850\5\u012c\u0097\2\u084b\u084c\5\u01b8\u00dd\2\u084c\u084d\5\u012a"+
		"\u0096\2\u084d\u084f\3\2\2\2\u084e\u084b\3\2\2\2\u084f\u0852\3\2\2\2\u0850"+
		"\u084e\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0129\3\2\2\2\u0852\u0850\3\2"+
		"\2\2\u0853\u0854\5\u012c\u0097\2\u0854\u012b\3\2\2\2\u0855\u0857\7\\\2"+
		"\2\u0856\u0855\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u0859"+
		"\5\u012e\u0098\2\u0859\u012d\3\2\2\2\u085a\u085c\5\u0130\u0099\2\u085b"+
		"\u085a\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085b\3\2\2\2\u085d\u085e\3\2"+
		"\2\2\u085e\u0861\3\2\2\2\u085f\u0860\7a\2\2\u0860\u0862\5\u00dco\2\u0861"+
		"\u085f\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u012f\3\2\2\2\u0863\u0864\5\u01ce"+
		"\u00e8\2\u0864\u0865\7a\2\2\u0865\u0866\5\u0130\u0099\2\u0866\u0891\3"+
		"\2\2\2\u0867\u0868\7`\2\2\u0868\u0891\5\u0130\u0099\2\u0869\u086a\7Y\2"+
		"\2\u086a\u0891\5\u0130\u0099\2\u086b\u086c\7n\2\2\u086c\u086d\5\u0170"+
		"\u00b9\2\u086d\u086e\7N\2\2\u086e\u086f\5\u0126\u0094\2\u086f\u0891\3"+
		"\2\2\2\u0870\u0871\7\26\2\2\u0871\u0872\5\u0086D\2\u0872\u0873\7\21\2"+
		"\2\u0873\u0874\5\u0126\u0094\2\u0874\u0891\3\2\2\2\u0875\u0876\7K\2\2"+
		"\u0876\u0891\5\u015c\u00af\2\u0877\u0878\7\17\2\2\u0878\u087a\5\u0126"+
		"\u0094\2\u0879\u087b\5\u01ec\u00f7\2\u087a\u0879\3\2\2\2\u087a\u087b\3"+
		"\2\2\2\u087b\u087c\3\2\2\2\u087c\u087d\7\33\2\2\u087d\u087f\5\u0126\u0094"+
		"\2\u087e\u0880\5\u01ec\u00f7\2\u087f\u087e\3\2\2\2\u087f\u0880\3\2\2\2"+
		"\u0880\u0881\3\2\2\2\u0881\u0882\7\r\2\2\u0882\u0883\5\u0126\u0094\2\u0883"+
		"\u0891\3\2\2\2\u0884\u0885\7\17\2\2\u0885\u0891\5\u0166\u00b4\2\u0886"+
		"\u0887\7\7\2\2\u0887\u0888\5\u0126\u0094\2\u0888\u0889\7\31\2\2\u0889"+
		"\u088a\5\u015c\u00af\2\u088a\u0891\3\2\2\2\u088b\u088c\7\f\2\2\u088c\u0891"+
		"\5\u0174\u00bb\2\u088d\u088e\7%\2\2\u088e\u0891\5\u0174\u00bb\2\u088f"+
		"\u0891\5\u0132\u009a\2\u0890\u0863\3\2\2\2\u0890\u0867\3\2\2\2\u0890\u0869"+
		"\3\2\2\2\u0890\u086b\3\2\2\2\u0890\u0870\3\2\2\2\u0890\u0875\3\2\2\2\u0890"+
		"\u0877\3\2\2\2\u0890\u0884\3\2\2\2\u0890\u0886\3\2\2\2\u0890\u088b\3\2"+
		"\2\2\u0890\u088d\3\2\2\2\u0890\u088f\3\2\2\2\u0891\u0131\3\2\2\2\u0892"+
		"\u089a\5\u0134\u009b\2\u0893\u0895\7\u0087\2\2\u0894\u0896\5\u017c\u00bf"+
		"\2\u0895\u0894\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0899"+
		"\7\u0088\2\2\u0898\u0893\3\2\2\2\u0899\u089c\3\2\2\2\u089a\u0898\3\2\2"+
		"\2\u089a\u089b\3\2\2\2\u089b\u0133\3\2\2\2\u089c\u089a\3\2\2\2\u089d\u08e1"+
		"\5\u01ce\u00e8\2\u089e\u08e1\5\u0192\u00ca\2\u089f\u08e1\5\u01d2\u00ea"+
		"\2\u08a0\u08e1\5\u01e6\u00f4\2\u08a1\u08e1\5\u0204\u0103\2\u08a2\u08e1"+
		"\5\u01fe\u0100\2\u08a3\u08e1\5\u0200\u0101\2\u08a4\u08a5\7{\2\2\u08a5"+
		"\u08a6\5\u0144\u00a3\2\u08a6\u08a7\7|\2\2\u08a7\u08e1\3\2\2\2\u08a8\u08a9"+
		"\7{\2\2\u08a9\u08aa\5\u0146\u00a4\2\u08aa\u08ab\7|\2\2\u08ab\u08e1\3\2"+
		"\2\2\u08ac\u08ad\7y\2\2\u08ad\u08ae\5\u0144\u00a3\2\u08ae\u08af\7z\2\2"+
		"\u08af\u08e1\3\2\2\2\u08b0\u08b1\7y\2\2\u08b1\u08b2\5\u0146\u00a4\2\u08b2"+
		"\u08b3\7z\2\2\u08b3\u08e1\3\2\2\2\u08b4\u08b5\7}\2\2\u08b5\u08b6\5\u014c"+
		"\u00a7\2\u08b6\u08b7\7~\2\2\u08b7\u08e1\3\2\2\2\u08b8\u08e1\7\36\2\2\u08b9"+
		"\u08e1\5\u0138\u009d\2\u08ba\u08e1\5\u013a\u009e\2\u08bb\u08bc\7l\2\2"+
		"\u08bc\u08e1\5\u01ce\u00e8\2\u08bd\u08be\7l\2\2\u08be\u08e1\5\u0192\u00ca"+
		"\2\u08bf\u08c0\7m\2\2\u08c0\u08e1\5\u01c2\u00e2\2\u08c1\u08c2\7m\2\2\u08c2"+
		"\u08e1\5\u01a4\u00d3\2\u08c3\u08e1\7m\2\2\u08c4\u08c5\7t\2\2\u08c5\u08c6"+
		"\5\u0126\u0094\2\u08c6\u08c7\7x\2\2\u08c7\u08e1\3\2\2\2\u08c8\u08c9\7"+
		"r\2\2\u08c9\u08ca\5\u0126\u0094\2\u08ca\u08cb\7s\2\2\u08cb\u08e1\3\2\2"+
		"\2\u08cc\u08cd\7v\2\2\u08cd\u08ce\5\u00c0a\2\u08ce\u08cf\7x\2\2\u08cf"+
		"\u08e1\3\2\2\2\u08d0\u08d1\7u\2\2\u08d1\u08d2\5\u0128\u0095\2\u08d2\u08d3"+
		"\7x\2\2\u08d3\u08e1\3\2\2\2\u08d4\u08d5\7w\2\2\u08d5\u08d6\5\u0140\u00a1"+
		"\2\u08d6\u08d7\7x\2\2\u08d7\u08e1\3\2\2\2\u08d8\u08e1\5\u0124\u0093\2"+
		"\u08d9\u08da\7p\2\2\u08da\u08dc\5\u0130\u0099\2\u08db\u08dd\5\u013c\u009f"+
		"\2\u08dc\u08db\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08df"+
		"\7p\2\2\u08df\u08e1\3\2\2\2\u08e0\u089d\3\2\2\2\u08e0\u089e\3\2\2\2\u08e0"+
		"\u089f\3\2\2\2\u08e0\u08a0\3\2\2\2\u08e0\u08a1\3\2\2\2\u08e0\u08a2\3\2"+
		"\2\2\u08e0\u08a3\3\2\2\2\u08e0\u08a4\3\2\2\2\u08e0\u08a8\3\2\2\2\u08e0"+
		"\u08ac\3\2\2\2\u08e0\u08b0\3\2\2\2\u08e0\u08b4\3\2\2\2\u08e0\u08b8\3\2"+
		"\2\2\u08e0\u08b9\3\2\2\2\u08e0\u08ba\3\2\2\2\u08e0\u08bb\3\2\2\2\u08e0"+
		"\u08bd\3\2\2\2\u08e0\u08bf\3\2\2\2\u08e0\u08c1\3\2\2\2\u08e0\u08c3\3\2"+
		"\2\2\u08e0\u08c4\3\2\2\2\u08e0\u08c8\3\2\2\2\u08e0\u08cc\3\2\2\2\u08e0"+
		"\u08d0\3\2\2\2\u08e0\u08d4\3\2\2\2\u08e0\u08d8\3\2\2\2\u08e0\u08d9\3\2"+
		"\2\2\u08e1\u0135\3\2\2\2\u08e2\u08e5\5\u013a\u009e\2\u08e3\u08e5\5\u0138"+
		"\u009d\2\u08e4\u08e2\3\2\2\2\u08e4\u08e3\3\2\2\2\u08e5\u0137\3\2\2\2\u08e6"+
		"\u08e7\7c\2\2\u08e7\u08e8\5\u0130\u0099\2\u08e8\u0139\3\2\2\2\u08e9\u08ea"+
		"\7b\2\2\u08ea\u08eb\5\u0130\u0099\2\u08eb\u013b\3\2\2\2\u08ec\u08ee\5"+
		"\u013e\u00a0\2\u08ed\u08ec\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08ed\3\2"+
		"\2\2\u08ef\u08f0\3\2\2\2\u08f0\u013d\3\2\2\2\u08f1\u08f2\5\u0130\u0099"+
		"\2\u08f2\u013f\3\2\2\2\u08f3\u08f5\5\u01e8\u00f5\2\u08f4\u08f6\5\u0142"+
		"\u00a2\2\u08f5\u08f4\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7"+
		"\u08f8\5\u01ea\u00f6\2\u08f8\u0141\3\2\2\2\u08f9\u08fd\5*\26\2\u08fa\u08fc"+
		"\5\u01ec\u00f7\2\u08fb\u08fa\3\2\2\2\u08fc\u08ff\3\2\2\2\u08fd\u08fb\3"+
		"\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0143\3\2\2\2\u08ff\u08fd\3\2\2\2\u0900"+
		"\u090c\5\u0126\u0094\2\u0901\u0902\5\u0128\u0095\2\u0902\u0903\5\u01b8"+
		"\u00dd\2\u0903\u090c\3\2\2\2\u0904\u0905\5\u01ba\u00de\2\u0905\u0906\5"+
		"\u0128\u0095\2\u0906\u090c\3\2\2\2\u0907\u0908\5\u0126\u0094\2\u0908\u0909"+
		"\7N\2\2\u0909\u090a\5\u0144\u00a3\2\u090a\u090c\3\2\2\2\u090b\u0900\3"+
		"\2\2\2\u090b\u0901\3\2\2\2\u090b\u0904\3\2\2\2\u090b\u0907\3\2\2\2\u090c"+
		"\u0145\3\2\2\2\u090d\u090e\5\u0144\u00a3\2\u090e\u090f\5\u0148\u00a5\2"+
		"\u090f\u091d\3\2\2\2\u0910\u0911\5\u0144\u00a3\2\u0911\u0912\5\u01f2\u00fa"+
		"\2\u0912\u091d\3\2\2\2\u0913\u0915\5\u01f0\u00f9\2\u0914\u0916\5\u014a"+
		"\u00a6\2\u0915\u0914\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u091d\3\2\2\2\u0917"+
		"\u0918\5\u01f2\u00fa\2\u0918\u091a\5\u0144\u00a3\2\u0919\u091b\5\u01f2"+
		"\u00fa\2\u091a\u0919\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091d\3\2\2\2\u091c"+
		"\u090d\3\2\2\2\u091c\u0910\3\2\2\2\u091c\u0913\3\2\2\2\u091c\u0917\3\2"+
		"\2\2\u091d\u0147\3\2\2\2\u091e\u0920\5\u01f0\u00f9\2\u091f\u0921\5\u014a"+
		"\u00a6\2\u0920\u091f\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0149\3\2\2\2\u0922"+
		"\u0923\5\u0144\u00a3\2\u0923\u0924\5\u0148\u00a5\2\u0924\u0927\3\2\2\2"+
		"\u0925\u0927\5\u0144\u00a3\2\u0926\u0922\3\2\2\2\u0926\u0925\3\2\2\2\u0927"+
		"\u014b\3\2\2\2\u0928\u0941\5\u0144\u00a3\2\u0929\u0941\5\u014e\u00a8\2"+
		"\u092a\u092b\5\u0144\u00a3\2\u092b\u092c\7d\2\2\u092c\u0941\3\2\2\2\u092d"+
		"\u092e\5\u0144\u00a3\2\u092e\u092f\7h\2\2\u092f\u0930\5\u0126\u0094\2"+
		"\u0930\u0931\7d\2\2\u0931\u0941\3\2\2\2\u0932\u0933\5\u0144\u00a3\2\u0933"+
		"\u0934\7d\2\2\u0934\u0935\5\u0126\u0094\2\u0935\u0941\3\2\2\2\u0936\u0937"+
		"\5\u0144\u00a3\2\u0937\u0938\7h\2\2\u0938\u0939\5\u0126\u0094\2\u0939"+
		"\u093a\7d\2\2\u093a\u093b\5\u0126\u0094\2\u093b\u0941\3\2\2\2\u093c\u093d"+
		"\5\u0144\u00a3\2\u093d\u093e\7X\2\2\u093e\u093f\5\u0150\u00a9\2\u093f"+
		"\u0941\3\2\2\2\u0940\u0928\3\2\2\2\u0940\u0929\3\2\2\2\u0940\u092a\3\2"+
		"\2\2\u0940\u092d\3\2\2\2\u0940\u0932\3\2\2\2\u0940\u0936\3\2\2\2\u0940"+
		"\u093c\3\2\2\2\u0941\u014d\3\2\2\2\u0942\u0943\5\u0144\u00a3\2\u0943\u0944"+
		"\7h\2\2\u0944\u0949";
	private static final String _serializedATNSegment1 =
		"\5\u0144\u00a3\2\u0945\u0946\7h\2\2\u0946\u0948\5\u0144\u00a3\2\u0947"+
		"\u0945\3\2\2\2\u0948\u094b\3\2\2\2\u0949\u0947\3\2\2\2\u0949\u094a\3\2"+
		"\2\2\u094a\u014f\3\2\2\2\u094b\u0949\3\2\2\2\u094c\u094d\5\u0152\u00aa"+
		"\2\u094d\u0151\3\2\2\2\u094e\u0953\5\u0154\u00ab\2\u094f\u0950\7X\2\2"+
		"\u0950\u0952\5\u0154\u00ab\2\u0951\u094f\3\2\2\2\u0952\u0955\3\2\2\2\u0953"+
		"\u0951\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0153\3\2\2\2\u0955\u0953\3\2"+
		"\2\2\u0956\u095b\5\u0156\u00ac\2\u0957\u0958\7h\2\2\u0958\u095a\5\u0156"+
		"\u00ac\2\u0959\u0957\3\2\2\2\u095a\u095d\3\2\2\2\u095b\u0959\3\2\2\2\u095b"+
		"\u095c\3\2\2\2\u095c\u0977\3\2\2\2\u095d\u095b\3\2\2\2\u095e\u0963\5\u0156"+
		"\u00ac\2\u095f\u0960\7h\2\2\u0960\u0962\5\u017a\u00be\2\u0961\u095f\3"+
		"\2\2\2\u0962\u0965\3\2\2\2\u0963\u0961\3\2\2\2\u0963\u0964\3\2\2\2\u0964"+
		"\u0977\3\2\2\2\u0965\u0963\3\2\2\2\u0966\u096b\5\u017a\u00be\2\u0967\u0968"+
		"\7h\2\2\u0968\u096a\5\u0156\u00ac\2\u0969\u0967\3\2\2\2\u096a\u096d\3"+
		"\2\2\2\u096b\u0969\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u0977\3\2\2\2\u096d"+
		"\u096b\3\2\2\2\u096e\u0973\5\u017a\u00be\2\u096f\u0970\7h\2\2\u0970\u0972"+
		"\5\u017a\u00be\2\u0971\u096f\3\2\2\2\u0972\u0975\3\2\2\2\u0973\u0971\3"+
		"\2\2\2\u0973\u0974\3\2\2\2\u0974\u0977\3\2\2\2\u0975\u0973\3\2\2\2\u0976"+
		"\u0956\3\2\2\2\u0976\u095e\3\2\2\2\u0976\u0966\3\2\2\2\u0976\u096e\3\2"+
		"\2\2\u0977\u0155\3\2\2\2\u0978\u0979\7\33\2\2\u0979\u098b\5\u0126\u0094"+
		"\2\u097a\u097b\7\33\2\2\u097b\u097c\5\u0126\u0094\2\u097c\u097d\7/\2\2"+
		"\u097d\u097e\5\u0126\u0094\2\u097e\u098b\3\2\2\2\u097f\u0980\7\33\2\2"+
		"\u0980\u0981\7.\2\2\u0981\u0982\7\60\2\2\u0982\u098b\5\u0126\u0094\2\u0983"+
		"\u0984\7\33\2\2\u0984\u0985\7.\2\2\u0985\u0986\7/\2\2\u0986\u0987\5\u0126"+
		"\u0094\2\u0987\u0988\7\60\2\2\u0988\u0989\5\u0126\u0094\2\u0989\u098b"+
		"\3\2\2\2\u098a\u0978\3\2\2\2\u098a\u097a\3\2\2\2\u098a\u097f\3\2\2\2\u098a"+
		"\u0983\3\2\2\2\u098b\u0157\3\2\2\2\u098c\u0991\5\u015a\u00ae\2\u098d\u098e"+
		"\7h\2\2\u098e\u0990\5\u015a\u00ae\2\u098f\u098d\3\2\2\2\u0990\u0993\3"+
		"\2\2\2\u0991\u098f\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0159\3\2\2\2\u0993"+
		"\u0991\3\2\2\2\u0994\u0995\5\u016a\u00b6\2\u0995\u0996\7O\2\2\u0996\u0997"+
		"\5\u0128\u0095\2\u0997\u099c\3\2\2\2\u0998\u0999\7\26\2\2\u0999\u099c"+
		"\5\u0086D\2\u099a\u099c\5\u0128\u0095\2\u099b\u0994\3\2\2\2\u099b\u0998"+
		"\3\2\2\2\u099b\u099a\3\2\2\2\u099c\u015b\3\2\2\2\u099d\u09a5\5\u01e8\u00f5"+
		"\2\u099e\u09a2\5\u015e\u00b0\2\u099f\u09a1\5\u01ec\u00f7\2\u09a0\u099f"+
		"\3\2\2\2\u09a1\u09a4\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3"+
		"\u09a6\3\2\2\2\u09a4\u09a2\3\2\2\2\u09a5\u099e\3\2\2\2\u09a6\u09a7\3\2"+
		"\2\2\u09a7\u09a5\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9"+
		"\u09aa\5\u01ea\u00f6\2\u09aa\u09af\3\2\2\2\u09ab\u09ac\5\u01e8\u00f5\2"+
		"\u09ac\u09ad\5\u01ea\u00f6\2\u09ad\u09af\3\2\2\2\u09ae\u099d\3\2\2\2\u09ae"+
		"\u09ab\3\2\2\2\u09af\u015d\3\2\2\2\u09b0\u09b1\5\u016a\u00b6\2\u09b1\u09b2"+
		"\5\u0160\u00b1\2\u09b2\u015f\3\2\2\2\u09b3\u09b5\5\u0162\u00b2\2\u09b4"+
		"\u09b6\5\u008aF\2\u09b5\u09b4\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u0161"+
		"\3\2\2\2\u09b7\u09b8\7N\2\2\u09b8\u09bb\5\u0126\u0094\2\u09b9\u09bb\5"+
		"\u0164\u00b3\2\u09ba\u09b7\3\2\2\2\u09ba\u09b9\3\2\2\2\u09bb\u0163\3\2"+
		"\2\2\u09bc\u09be\5\u0168\u00b5\2\u09bd\u09bc\3\2\2\2\u09be\u09bf\3\2\2"+
		"\2\u09bf\u09bd\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u0165\3\2\2\2\u09c1\u09c2"+
		"\7\u0087\2\2\u09c2\u09c3\5\u0164\u00b3\2\u09c3\u09c4\7\u0088\2\2\u09c4"+
		"\u09c7\3\2\2\2\u09c5\u09c7\5\u0164\u00b3\2\u09c6\u09c1\3\2\2\2\u09c6\u09c5"+
		"\3\2\2\2\u09c7\u0167\3\2\2\2\u09c8\u09c9\7X\2\2\u09c9\u09ca\5\u0158\u00ad"+
		"\2\u09ca\u09cb\7N\2\2\u09cb\u09cc\5\u0126\u0094\2\u09cc\u0169\3\2\2\2"+
		"\u09cd\u09ce\5\u0126\u0094\2\u09ce\u016b\3\2\2\2\u09cf\u09d0\5\u0126\u0094"+
		"\2\u09d0\u016d\3\2\2\2\u09d1\u09d2\5\u0130\u0099\2\u09d2\u016f\3\2\2\2"+
		"\u09d3\u09d5\5\u016e\u00b8\2\u09d4\u09d3\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6"+
		"\u09d4\3\2\2\2\u09d6\u09d7\3\2\2\2\u09d7\u0171\3\2\2\2\u09d8\u09d9\5\u01ce"+
		"\u00e8\2\u09d9\u09da\7j\2\2\u09da\u09db\5\u016a\u00b6\2\u09db\u0173\3"+
		"\2\2\2\u09dc\u09de\5\u01e8\u00f5\2\u09dd\u09df\5\u0176\u00bc\2\u09de\u09dd"+
		"\3\2\2\2\u09de\u09df\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1\5\u01ea\u00f6"+
		"\2\u09e1\u0175\3\2\2\2\u09e2\u09ec\5\u0178\u00bd\2\u09e3\u09e5\5\u01ec"+
		"\u00f7\2\u09e4\u09e3\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e4\3\2\2\2\u09e6"+
		"\u09e7\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e9\5\u0178\u00bd\2\u09e9\u09eb"+
		"\3\2\2\2\u09ea\u09e4\3\2\2\2\u09eb\u09ee\3\2\2\2\u09ec\u09ea\3\2\2\2\u09ec"+
		"\u09ed\3\2\2\2\u09ed\u09f2\3\2\2\2\u09ee\u09ec\3\2\2\2\u09ef\u09f1\5\u01ec"+
		"\u00f7\2\u09f0\u09ef\3\2\2\2\u09f1\u09f4\3\2\2\2\u09f2\u09f0\3\2\2\2\u09f2"+
		"\u09f3\3\2\2\2\u09f3\u0177\3\2\2\2\u09f4\u09f2\3\2\2\2\u09f5\u09fe\5\u017a"+
		"\u00be\2\u09f6\u09f7\7-\2\2\u09f7\u09fe\5\u0174\u00bb\2\u09f8\u09fa\5"+
		"\u01ec\u00f7\2\u09f9\u09f8\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u09f9\3\2"+
		"\2\2\u09fb\u09fc\3\2\2\2\u09fc\u09fe\3\2\2\2\u09fd\u09f5\3\2\2\2\u09fd"+
		"\u09f6\3\2\2\2\u09fd\u09f9\3\2\2\2\u09fe\u0179\3\2\2\2\u09ff\u0a00\5\u016c"+
		"\u00b7\2\u0a00\u0a01\7O\2\2\u0a01\u0a02\5\u0126\u0094\2\u0a02\u0a07\3"+
		"\2\2\2\u0a03\u0a07\5\u0126\u0094\2\u0a04\u0a05\7\26\2\2\u0a05\u0a07\5"+
		"\u0088E\2\u0a06\u09ff\3\2\2\2\u0a06\u0a03\3\2\2\2\u0a06\u0a04\3\2\2\2"+
		"\u0a07\u017b\3\2\2\2\u0a08\u0a0d\5\u017e\u00c0\2\u0a09\u0a0a\7h\2\2\u0a0a"+
		"\u0a0c\5\u017e\u00c0\2\u0a0b\u0a09\3\2\2\2\u0a0c\u0a0f\3\2\2\2\u0a0d\u0a0b"+
		"\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a12\3\2\2\2\u0a0f\u0a0d\3\2\2\2\u0a10"+
		"\u0a12\7d\2\2\u0a11\u0a08\3\2\2\2\u0a11\u0a10\3\2\2\2\u0a12\u017d\3\2"+
		"\2\2\u0a13\u0a14\5\u01ce\u00e8\2\u0a14\u0a15\7j\2\2\u0a15\u0a16\5\u0126"+
		"\u0094\2\u0a16\u0a19\3\2\2\2\u0a17\u0a19\5\u01ce\u00e8\2\u0a18\u0a13\3"+
		"\2\2\2\u0a18\u0a17\3\2\2\2\u0a19\u017f\3\2\2\2\u0a1a\u0a1c\5\u0182\u00c2"+
		"\2\u0a1b\u0a1d\5\u01ec\u00f7\2\u0a1c\u0a1b\3\2\2\2\u0a1d\u0a1e\3\2\2\2"+
		"\u0a1e\u0a1c\3\2\2\2\u0a1e\u0a1f\3\2\2\2\u0a1f\u0a20\3\2\2\2\u0a20\u0a21"+
		"\5\u0182\u00c2\2\u0a21\u0a25\3\2\2\2\u0a22\u0a24\5\u01ec\u00f7\2\u0a23"+
		"\u0a22\3\2\2\2\u0a24\u0a27\3\2\2\2\u0a25\u0a23\3\2\2\2\u0a25\u0a26\3\2"+
		"\2\2\u0a26\u0181\3\2\2\2\u0a27\u0a25\3\2\2\2\u0a28\u0a29\5\u01d2\u00ea"+
		"\2\u0a29\u0a2a\7j\2\2\u0a2a\u0a2b\5\u0126\u0094\2\u0a2b\u0183\3\2\2\2"+
		"\u0a2c\u0a31\5\u0186\u00c4\2\u0a2d\u0a2e\7X\2\2\u0a2e\u0a30\5\u0186\u00c4"+
		"\2\u0a2f\u0a2d\3\2\2\2\u0a30\u0a33\3\2\2\2\u0a31\u0a2f\3\2\2\2\u0a31\u0a32"+
		"\3\2\2\2\u0a32\u0185\3\2\2\2\u0a33\u0a31\3\2\2\2\u0a34\u0a35\5\u0188\u00c5"+
		"\2\u0a35\u0187\3\2\2\2\u0a36\u0a3b\5\u018a\u00c6\2\u0a37\u0a38\7h\2\2"+
		"\u0a38\u0a3a\5\u018a\u00c6\2\u0a39\u0a37\3\2\2\2\u0a3a\u0a3d\3\2\2\2\u0a3b"+
		"\u0a39\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0189\3\2\2\2\u0a3d\u0a3b\3\2"+
		"\2\2\u0a3e\u0a3f\7{\2\2\u0a3f\u0a40\5\u0184\u00c3\2\u0a40\u0a41\7|\2\2"+
		"\u0a41\u0a44\3\2\2\2\u0a42\u0a44\5\u018e\u00c8\2\u0a43\u0a3e\3\2\2\2\u0a43"+
		"\u0a42\3\2\2\2\u0a44\u018b\3\2\2\2\u0a45\u0a4a\5\u018e\u00c8\2\u0a46\u0a47"+
		"\7h\2\2\u0a47\u0a49\5\u018e\u00c8\2\u0a48\u0a46\3\2\2\2\u0a49\u0a4c\3"+
		"\2\2\2\u0a4a\u0a48\3\2\2\2\u0a4a\u0a4b\3\2\2\2\u0a4b\u018d\3\2\2\2\u0a4c"+
		"\u0a4a\3\2\2\2\u0a4d\u0a50\5\u01cc\u00e7\2\u0a4e\u0a50\5\u0196\u00cc\2"+
		"\u0a4f\u0a4d\3\2\2\2\u0a4f\u0a4e\3\2\2\2\u0a50\u018f\3\2\2\2\u0a51\u0a54"+
		"\5\u0194\u00cb\2\u0a52\u0a54\5\u019a\u00ce\2\u0a53\u0a51\3\2\2\2\u0a53"+
		"\u0a52\3\2\2\2\u0a54\u0191\3\2\2\2\u0a55\u0a58\5\u0194\u00cb\2\u0a56\u0a58"+
		"\5\u019c\u00cf\2\u0a57\u0a55\3\2\2\2\u0a57\u0a56\3\2\2\2\u0a58\u0193\3"+
		"\2\2\2\u0a59\u0a5f\5\u01de\u00f0\2\u0a5a\u0a5b\7{\2\2\u0a5b\u0a5c\5\u01e2"+
		"\u00f2\2\u0a5c\u0a5d\7|\2\2\u0a5d\u0a5f\3\2\2\2\u0a5e\u0a59\3\2\2\2\u0a5e"+
		"\u0a5a\3\2\2\2\u0a5f\u0195\3\2\2\2\u0a60\u0a67\5\u01e0\u00f1\2\u0a61\u0a62"+
		"\7{\2\2\u0a62\u0a63\5\u01e4\u00f3\2\u0a63\u0a64\7|\2\2\u0a64\u0a67\3\2"+
		"\2\2\u0a65\u0a67\5\u019c\u00cf\2\u0a66\u0a60\3\2\2\2\u0a66\u0a61\3\2\2"+
		"\2\u0a66\u0a65\3\2\2\2\u0a67\u0197\3\2\2\2\u0a68\u0a6d\5\u0196\u00cc\2"+
		"\u0a69\u0a6a\7h\2\2\u0a6a\u0a6c\5\u0196\u00cc\2\u0a6b\u0a69\3\2\2\2\u0a6c"+
		"\u0a6f\3\2\2\2\u0a6d\u0a6b\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u0199\3\2"+
		"\2\2\u0a6f\u0a6d\3\2\2\2\u0a70\u0a71\7{\2\2\u0a71\u0a7d\7|\2\2\u0a72\u0a73"+
		"\7{\2\2\u0a73\u0a74\5\u01f0\u00f9\2\u0a74\u0a75\7|\2\2\u0a75\u0a7d\3\2"+
		"\2\2\u0a76\u0a77\7y\2\2\u0a77\u0a7d\7z\2\2\u0a78\u0a79\7y\2\2\u0a79\u0a7a"+
		"\5\u01f0\u00f9\2\u0a7a\u0a7b\7z\2\2\u0a7b\u0a7d\3\2\2\2\u0a7c\u0a70\3"+
		"\2\2\2\u0a7c\u0a72\3\2\2\2\u0a7c\u0a76\3\2\2\2\u0a7c\u0a78\3\2\2\2\u0a7d"+
		"\u019b\3\2\2\2\u0a7e\u0a82\5\u019a\u00ce\2\u0a7f\u0a80\7}\2\2\u0a80\u0a82"+
		"\7~\2\2\u0a81\u0a7e\3\2\2\2\u0a81\u0a7f\3\2\2\2\u0a82\u019d\3\2\2\2\u0a83"+
		"\u0a89\5\u01e4\u00f3\2\u0a84\u0a85\7o\2\2\u0a85\u0a86\5\u01e0\u00f1\2"+
		"\u0a86\u0a87\7o\2\2\u0a87\u0a89\3\2\2\2\u0a88\u0a83\3\2\2\2\u0a88\u0a84"+
		"\3\2\2\2\u0a89\u019f\3\2\2\2\u0a8a\u0a90\5\u01a2\u00d2\2\u0a8b\u0a8c\7"+
		"o\2\2\u0a8c\u0a8d\5\u01de\u00f0\2\u0a8d\u0a8e\7o\2\2\u0a8e\u0a90\3\2\2"+
		"\2\u0a8f\u0a8a\3\2\2\2\u0a8f\u0a8b\3\2\2\2\u0a90\u01a1\3\2\2\2\u0a91\u0a94"+
		"\7i\2\2\u0a92\u0a94\5\u01e2\u00f2\2\u0a93\u0a91\3\2\2\2\u0a93\u0a92\3"+
		"\2\2\2\u0a94\u01a3\3\2\2\2\u0a95\u0a9b\5\u01a6\u00d4\2\u0a96\u0a97\7{"+
		"\2\2\u0a97\u0a9b\7|\2\2\u0a98\u0a99\7y\2\2\u0a99\u0a9b\7z\2\2\u0a9a\u0a95"+
		"\3\2\2\2\u0a9a\u0a96\3\2\2\2\u0a9a\u0a98\3\2\2\2\u0a9b\u01a5\3\2\2\2\u0a9c"+
		"\u0aab\5\u01a8\u00d5\2\u0a9d\u0a9e\7{\2\2\u0a9e\u0a9f\5\u01f0\u00f9\2"+
		"\u0a9f\u0aa0\7|\2\2\u0aa0\u0aab\3\2\2\2\u0aa1\u0aa2\7y\2\2\u0aa2\u0aa3"+
		"\5\u01f0\u00f9\2\u0aa3\u0aa4\7z\2\2\u0aa4\u0aab\3\2\2\2\u0aa5\u0aa6\7"+
		"{\2\2\u0aa6\u0aa7\7N\2\2\u0aa7\u0aab\7|\2\2\u0aa8\u0aa9\7}\2\2\u0aa9\u0aab"+
		"\7~\2\2\u0aaa\u0a9c\3\2\2\2\u0aaa\u0a9d\3\2\2\2\u0aaa\u0aa1\3\2\2\2\u0aaa"+
		"\u0aa5\3\2\2\2\u0aaa\u0aa8\3\2\2\2\u0aab\u01a7\3\2\2\2\u0aac\u0ab2\5\u01ac"+
		"\u00d7\2\u0aad\u0aae\7{\2\2\u0aae\u0aaf\5\u01b0\u00d9\2\u0aaf\u0ab0\7"+
		"|\2\2\u0ab0\u0ab2\3\2\2\2\u0ab1\u0aac\3\2\2\2\u0ab1\u0aad\3\2\2\2\u0ab2"+
		"\u01a9\3\2\2\2\u0ab3\u0ab9\5\u01b0\u00d9\2\u0ab4\u0ab5\7o\2\2\u0ab5\u0ab6"+
		"\5\u01ac\u00d7\2\u0ab6\u0ab7\7o\2\2\u0ab7\u0ab9\3\2\2\2\u0ab8\u0ab3\3"+
		"\2\2\2\u0ab8\u0ab4\3\2\2\2\u0ab9\u01ab\3\2\2\2\u0aba\u0abb\5\u01ee\u00f8"+
		"\2\u0abb\u0abc\7e\2\2\u0abc\u0abe\3\2\2\2\u0abd\u0aba\3\2\2\2\u0abd\u0abe"+
		"\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf\u0ac0\5\u01ae\u00d8\2\u0ac0\u01ad\3"+
		"\2\2\2\u0ac1\u0ac2\5\u01e0\u00f1\2\u0ac2\u01af\3\2\2\2\u0ac3\u0ac7\5\u01e2"+
		"\u00f2\2\u0ac4\u0ac7\5\u01d4\u00eb\2\u0ac5\u0ac7\5\u01b2\u00da\2\u0ac6"+
		"\u0ac3\3\2\2\2\u0ac6\u0ac4\3\2\2\2\u0ac6\u0ac5\3\2\2\2\u0ac7\u01b1\3\2"+
		"\2\2\u0ac8\u0ace\5\u01e4\u00f3\2\u0ac9\u0ace\5\u01d8\u00ed\2\u0aca\u0ace"+
		"\7i\2\2\u0acb\u0ace\7\\\2\2\u0acc\u0ace\7e\2\2\u0acd\u0ac8\3\2\2\2\u0acd"+
		"\u0ac9\3\2\2\2\u0acd\u0aca\3\2\2\2\u0acd\u0acb\3\2\2\2\u0acd\u0acc\3\2"+
		"\2\2\u0ace\u01b3\3\2\2\2\u0acf\u0ad2\5\u01b6\u00dc\2\u0ad0\u0ad2\5\u019e"+
		"\u00d0\2\u0ad1\u0acf\3\2\2\2\u0ad1\u0ad0\3\2\2\2\u0ad2\u01b5\3\2\2\2\u0ad3"+
		"\u0ad9\5\u01d8\u00ed\2\u0ad4\u0ad5\7o\2\2\u0ad5\u0ad6\5\u01d2\u00ea\2"+
		"\u0ad6\u0ad7\7o\2\2\u0ad7\u0ad9\3\2\2\2\u0ad8\u0ad3\3\2\2\2\u0ad8\u0ad4"+
		"\3\2\2\2\u0ad9\u01b7\3\2\2\2\u0ada\u0add\5\u01be\u00e0\2\u0adb\u0add\5"+
		"\u01a0\u00d1\2\u0adc\u0ada\3\2\2\2\u0adc\u0adb\3\2\2\2\u0add\u01b9\3\2"+
		"\2\2\u0ade\u0ae2\5\u01c0\u00e1\2\u0adf\u0ae2\5\u01a0\u00d1\2\u0ae0\u0ae2"+
		"\5\u01bc\u00df\2\u0ae1\u0ade\3\2\2\2\u0ae1\u0adf\3\2\2\2\u0ae1\u0ae0\3"+
		"\2\2\2\u0ae2\u01bb\3\2\2\2\u0ae3\u0ae4\7o\2\2\u0ae4\u0ae5\7\36\2\2\u0ae5"+
		"\u0ae6\7o\2\2\u0ae6\u01bd\3\2\2\2\u0ae7\u0aed\5\u01d4\u00eb\2\u0ae8\u0ae9"+
		"\7o\2\2\u0ae9\u0aea\5\u01d0\u00e9\2\u0aea\u0aeb\7o\2\2\u0aeb\u0aed\3\2"+
		"\2\2\u0aec\u0ae7\3\2\2\2\u0aec\u0ae8\3\2\2\2\u0aed\u01bf\3\2\2\2\u0aee"+
		"\u0af4\5\u01d6\u00ec\2\u0aef\u0af0\7o\2\2\u0af0\u0af1\5\u01d0\u00e9\2"+
		"\u0af1\u0af2\7o\2\2\u0af2\u0af4\3\2\2\2\u0af3\u0aee\3\2\2\2\u0af3\u0aef"+
		"\3\2\2\2\u0af4\u01c1\3\2\2\2\u0af5\u0af6\5\u01d2\u00ea\2\u0af6\u01c3\3"+
		"\2\2\2\u0af7\u0af8\7o\2\2\u0af8\u0af9\5\u01c6\u00e4\2\u0af9\u0afa\7o\2"+
		"\2\u0afa\u01c5\3\2\2\2\u0afb\u0b01\5\u01d2\u00ea\2\u0afc\u0b01\5\u01dc"+
		"\u00ef\2\u0afd\u0b01\7$\2\2\u0afe\u0b01\7\"\2\2\u0aff\u0b01\7#\2\2\u0b00"+
		"\u0afb\3\2\2\2\u0b00\u0afc\3\2\2\2\u0b00\u0afd\3\2\2\2\u0b00\u0afe\3\2"+
		"\2\2\u0b00\u0aff\3\2\2\2\u0b01\u01c7\3\2\2\2\u0b02\u0b03\5\u01e0\u00f1"+
		"\2\u0b03\u01c9\3\2\2\2\u0b04\u0b05\5\u01ee\u00f8\2\u0b05\u0b06\7e\2\2"+
		"\u0b06\u0b08\3\2\2\2\u0b07\u0b04\3\2\2\2\u0b07\u0b08\3\2\2\2\u0b08\u0b09"+
		"\3\2\2\2\u0b09\u0b0a\5\u01c8\u00e5\2\u0b0a\u01cb\3\2\2\2\u0b0b\u0b11\5"+
		"\u01d2\u00ea\2\u0b0c\u0b0d\7{\2\2\u0b0d\u0b0e\5\u01d8\u00ed\2\u0b0e\u0b0f"+
		"\7|\2\2\u0b0f\u0b11\3\2\2\2\u0b10\u0b0b\3\2\2\2\u0b10\u0b0c\3\2\2\2\u0b11"+
		"\u01cd\3\2\2\2\u0b12\u0b18\5\u01d0\u00e9\2\u0b13\u0b14\7{\2\2\u0b14\u0b15"+
		"\5\u01d4\u00eb\2\u0b15\u0b16\7|\2\2\u0b16\u0b18\3\2\2\2\u0b17\u0b12\3"+
		"\2\2\2\u0b17\u0b13\3\2\2\2\u0b18\u01cf\3\2\2\2\u0b19\u0b1a\5\u01ee\u00f8"+
		"\2\u0b1a\u0b1b\7e\2\2\u0b1b\u0b1d\3\2\2\2\u0b1c\u0b19\3\2\2\2\u0b1c\u0b1d"+
		"\3\2\2\2\u0b1d\u0b1e\3\2\2\2\u0b1e\u0b1f\5\u01d2\u00ea\2\u0b1f\u01d1\3"+
		"\2\2\2\u0b20\u0b23\7\u0081\2\2\u0b21\u0b23\5\u01dc\u00ef\2\u0b22\u0b20"+
		"\3\2\2\2\u0b22\u0b21\3\2\2\2\u0b23\u0b27\3\2\2\2\u0b24\u0b26\7T\2\2\u0b25"+
		"\u0b24\3\2\2\2\u0b26\u0b29\3\2\2\2\u0b27\u0b25\3\2\2\2\u0b27\u0b28\3\2"+
		"\2\2\u0b28\u01d3\3\2\2\2\u0b29\u0b27\3\2\2\2\u0b2a\u0b2b\5\u01ee\u00f8"+
		"\2\u0b2b\u0b2c\7e\2\2\u0b2c\u0b2e\3\2\2\2\u0b2d\u0b2a\3\2\2\2\u0b2d\u0b2e"+
		"\3\2\2\2\u0b2e\u0b2f\3\2\2\2\u0b2f\u0b30\5\u01d8\u00ed\2\u0b30\u01d5\3"+
		"\2\2\2\u0b31\u0b34\5\u01da\u00ee\2\u0b32\u0b34\5\u01d4\u00eb\2\u0b33\u0b31"+
		"\3\2\2\2\u0b33\u0b32\3\2\2\2\u0b34\u01d7\3\2\2\2\u0b35\u0b38\5\u01da\u00ee"+
		"\2\u0b36\u0b38\7\\\2\2\u0b37\u0b35\3\2\2\2\u0b37\u0b36\3\2\2\2\u0b38\u01d9"+
		"\3\2\2\2\u0b39\u0b40\7k\2\2\u0b3a\u0b3c\5\u01f8\u00fd\2\u0b3b\u0b3a\3"+
		"\2\2\2\u0b3c\u0b3d\3\2\2\2\u0b3d\u0b3b\3\2\2\2\u0b3d\u0b3e\3\2\2\2\u0b3e"+
		"\u0b40\3\2\2\2\u0b3f\u0b39\3\2\2\2\u0b3f\u0b3b\3\2\2\2\u0b40\u01db\3\2"+
		"\2\2\u0b41\u0b42\t\7\2\2\u0b42\u01dd\3\2\2\2\u0b43\u0b44\5\u01ee\u00f8"+
		"\2\u0b44\u0b45\7e\2\2\u0b45\u0b47\3\2\2\2\u0b46\u0b43\3\2\2\2\u0b46\u0b47"+
		"\3\2\2\2\u0b47\u0b48\3\2\2\2\u0b48\u0b49\5\u01e0\u00f1\2\u0b49\u01df\3"+
		"\2\2\2\u0b4a\u0b4e\7\u0082\2\2\u0b4b\u0b4d\7T\2\2\u0b4c\u0b4b\3\2\2\2"+
		"\u0b4d\u0b50\3\2\2\2\u0b4e\u0b4c\3\2\2\2\u0b4e\u0b4f\3\2\2\2\u0b4f\u01e1"+
		"\3\2\2\2\u0b50\u0b4e\3\2\2\2\u0b51\u0b52\5\u01ee\u00f8\2\u0b52\u0b53\7"+
		"e\2\2\u0b53\u0b55\3\2\2\2\u0b54\u0b51\3\2\2\2\u0b54\u0b55\3\2\2\2\u0b55"+
		"\u0b56\3\2\2\2\u0b56\u0b57\5\u01e4\u00f3\2\u0b57\u01e3\3\2\2\2\u0b58\u0b5c"+
		"\7i\2\2\u0b59\u0b5b\5\u01f8\u00fd\2\u0b5a\u0b59\3\2\2\2\u0b5b\u0b5e\3"+
		"\2\2\2\u0b5c\u0b5a\3\2\2\2\u0b5c\u0b5d\3\2\2\2\u0b5d\u01e5\3\2\2\2\u0b5e"+
		"\u0b5c\3\2\2\2\u0b5f\u0b64\5\u01fe\u0100\2\u0b60\u0b64\5\u0200\u0101\2"+
		"\u0b61\u0b64\5\u0202\u0102\2\u0b62\u0b64\5\u0204\u0103\2\u0b63\u0b5f\3"+
		"\2\2\2\u0b63\u0b60\3\2\2\2\u0b63\u0b61\3\2\2\2\u0b63\u0b62\3\2\2\2\u0b64"+
		"\u01e7\3\2\2\2\u0b65\u0b66\t\b\2\2\u0b66\u01e9\3\2\2\2\u0b67\u0b68\t\t"+
		"\2\2\u0b68\u01eb\3\2\2\2\u0b69\u0b6a\t\n\2\2\u0b6a\u01ed\3\2\2\2\u0b6b"+
		"\u0b6c\5\u01e0\u00f1\2\u0b6c\u0b6d\7e\2\2\u0b6d\u0b6f\3\2\2\2\u0b6e\u0b6b"+
		"\3\2\2\2\u0b6f\u0b72\3\2\2\2\u0b70\u0b6e\3\2\2\2\u0b70\u0b71\3\2\2\2\u0b71"+
		"\u0b73\3\2\2\2\u0b72\u0b70\3\2\2\2\u0b73\u0b74\5\u01e0\u00f1\2\u0b74\u01ef"+
		"\3\2\2\2\u0b75\u0b77\7h\2\2\u0b76\u0b75\3\2\2\2\u0b77\u0b78\3\2\2\2\u0b78"+
		"\u0b76\3\2\2\2\u0b78\u0b79\3\2\2\2\u0b79\u01f1\3\2\2\2\u0b7a\u0b7c\7X"+
		"\2\2\u0b7b\u0b7a\3\2\2\2\u0b7c\u0b7d\3\2\2\2\u0b7d\u0b7b\3\2\2\2\u0b7d"+
		"\u0b7e\3\2\2\2\u0b7e\u01f3\3\2\2\2\u0b7f\u0b80\t\13\2\2\u0b80\u01f5\3"+
		"\2\2\2\u0b81\u0b82\5\u01f8\u00fd\2\u0b82\u01f7\3\2\2\2\u0b83\u0b84\t\f"+
		"\2\2\u0b84\u01f9\3\2\2\2\u0b85\u0b88\5\u01fe\u0100\2\u0b86\u0b88\5\u01fc"+
		"\u00ff\2\u0b87\u0b85\3\2\2\2\u0b87\u0b86\3\2\2\2\u0b88\u01fb\3\2\2\2\u0b89"+
		"\u0b8a\5\u0200\u0101\2\u0b8a\u01fd\3\2\2\2\u0b8b\u0b8c\t\r\2\2\u0b8c\u01ff"+
		"\3\2\2\2\u0b8d\u0b8e\7\u008f\2\2\u0b8e\u0201\3\2\2\2\u0b8f\u0b90\7\177"+
		"\2\2\u0b90\u0203\3\2\2\2\u0b91\u0b92\7\u0080\2\2\u0b92\u0205\3\2\2\2\u015b"+
		"\u0207\u020c\u0210\u0215\u021a\u021d\u0220\u0227\u0234\u023a\u023f\u0248"+
		"\u024d\u0254\u0258\u025d\u0264\u0268\u026d\u0276\u027b\u027d\u0285\u0288"+
		"\u028b\u029a\u029d\u02a0\u02ac\u02af\u02b2\u02b6\u02ba\u02bf\u02c2\u02c7"+
		"\u02cf\u02d3\u02d5\u02df\u02e3\u02e5\u02e8\u02f5\u02f8\u02fb\u0303\u0306"+
		"\u0308\u030c\u0315\u031c\u0320\u0322\u032d\u0335\u033b\u0341\u0347\u034c"+
		"\u034f\u035a\u035d\u0360\u0364\u0369\u036d\u0372\u0376\u037a\u037d\u0380"+
		"\u0384\u0388\u038b\u038e\u0394\u0396\u03a2\u03a7\u03ab\u03b3\u03b7\u03bc"+
		"\u03c0\u03c5\u03c9\u03cc\u03cf\u03d4\u03d8\u03db\u03de\u03e0\u03ee\u03f9"+
		"\u0405\u040c\u0417\u041d\u0423\u0429\u042e\u0439\u043d\u0441\u0445\u0449"+
		"\u044d\u0450\u0454\u0459\u045c\u0461\u0465\u0468\u046d\u0471\u0474\u0478"+
		"\u047b\u047e\u0482\u0485\u0489\u048c\u048f\u0491\u049d\u04a6\u04ad\u04b1"+
		"\u04ba\u04c3\u04ce\u04d2\u04d6\u04de\u04e3\u04e7\u04f3\u04f5\u04f9\u0504"+
		"\u0509\u0510\u0516\u0526\u052c\u0532\u0538\u053d\u0546\u054c\u0552\u0558"+
		"\u055d\u0568\u056e\u0574\u0579\u0580\u0584\u058f\u0593\u0597\u059a\u05a2"+
		"\u05b1\u05b5\u05ba\u05bd\u05c2\u05cb\u05d3\u05d7\u05e2\u05e6\u05ee\u05f1"+
		"\u05f8\u060d\u0612\u061a\u0621\u0636\u063e\u0647\u0650\u0657\u065b\u0669"+
		"\u066d\u067b\u0686\u068d\u0694\u069d\u06a9\u06b4\u06df\u06ed\u06f6\u06fe"+
		"\u0708\u070e\u071b\u0724\u072e\u0732\u0736\u073b\u0742\u0747\u0752\u0763"+
		"\u0767\u076c\u0772\u077d\u0787\u0793\u079c\u07a1\u07a9\u07ab\u07b2\u07b4"+
		"\u07b9\u07bd\u07bf\u07c4\u07d7\u07e0\u07e7\u07f0\u07f7\u0801\u0812\u0818"+
		"\u081a\u0825\u0831\u0848\u0850\u0856\u085d\u0861\u087a\u087f\u0890\u0895"+
		"\u089a\u08dc\u08e0\u08e4\u08ef\u08f5\u08fd\u090b\u0915\u091a\u091c\u0920"+
		"\u0926\u0940\u0949\u0953\u095b\u0963\u096b\u0973\u0976\u098a\u0991\u099b"+
		"\u09a2\u09a7\u09ae\u09b5\u09ba\u09bf\u09c6\u09d6\u09de\u09e6\u09ec\u09f2"+
		"\u09fb\u09fd\u0a06\u0a0d\u0a11\u0a18\u0a1e\u0a25\u0a31\u0a3b\u0a43\u0a4a"+
		"\u0a4f\u0a53\u0a57\u0a5e\u0a66\u0a6d\u0a7c\u0a81\u0a88\u0a8f\u0a93\u0a9a"+
		"\u0aaa\u0ab1\u0ab8\u0abd\u0ac6\u0acd\u0ad1\u0ad8\u0adc\u0ae1\u0aec\u0af3"+
		"\u0b00\u0b07\u0b10\u0b17\u0b1c\u0b22\u0b27\u0b2d\u0b33\u0b37\u0b3d\u0b3f"+
		"\u0b46\u0b4e\u0b54\u0b5c\u0b63\u0b70\u0b78\u0b7d\u0b87";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}