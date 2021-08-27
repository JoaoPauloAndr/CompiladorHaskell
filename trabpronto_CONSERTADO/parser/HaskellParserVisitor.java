// Generated from HaskellParser.g4 by ANTLR 4.9.2

    package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HaskellParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HaskellParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HaskellParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(HaskellParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#module_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_content(HaskellParser.Module_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#where_module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_module(HaskellParser.Where_moduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#module_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_body(HaskellParser.Module_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pragmas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmas(HaskellParser.PragmasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(HaskellParser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#language_pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage_pragma(HaskellParser.Language_pragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#options_ghc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptions_ghc(HaskellParser.Options_ghcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#simple_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_options(HaskellParser.Simple_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#extension_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_(HaskellParser.Extension_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(HaskellParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#impdecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpdecls(HaskellParser.ImpdeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#exports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExports(HaskellParser.ExportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#exprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprt(HaskellParser.ExprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#impdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpdecl(HaskellParser.ImpdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#impspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpspec(HaskellParser.ImpspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#himport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHimport(HaskellParser.HimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#cname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCname(HaskellParser.CnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fixity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixity(HaskellParser.FixityContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOps(HaskellParser.OpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#topdecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopdecls(HaskellParser.TopdeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#topdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopdecl(HaskellParser.TopdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#cl_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCl_decl(HaskellParser.Cl_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ty_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTy_decl(HaskellParser.Ty_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#standalone_kind_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone_kind_sig(HaskellParser.Standalone_kind_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#sks_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSks_vars(HaskellParser.Sks_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#inst_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_decl(HaskellParser.Inst_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#overlap_pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlap_pragma(HaskellParser.Overlap_pragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#deriv_strategy_no_via}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriv_strategy_no_via(HaskellParser.Deriv_strategy_no_viaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#deriv_strategy_via}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriv_strategy_via(HaskellParser.Deriv_strategy_viaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#deriv_standalone_strategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriv_standalone_strategy(HaskellParser.Deriv_standalone_strategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#opt_injective_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_injective_info(HaskellParser.Opt_injective_infoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#injectivity_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectivity_cond(HaskellParser.Injectivity_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#inj_varids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInj_varids(HaskellParser.Inj_varidsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#where_type_family}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_type_family(HaskellParser.Where_type_familyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ty_fam_inst_eqn_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTy_fam_inst_eqn_list(HaskellParser.Ty_fam_inst_eqn_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ty_fam_inst_eqns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTy_fam_inst_eqns(HaskellParser.Ty_fam_inst_eqnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ty_fam_inst_eqn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTy_fam_inst_eqn(HaskellParser.Ty_fam_inst_eqnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#at_decl_cls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt_decl_cls(HaskellParser.At_decl_clsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#at_decl_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt_decl_inst(HaskellParser.At_decl_instContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#opt_kind_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_kind_sig(HaskellParser.Opt_kind_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#opt_datafam_kind_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_datafam_kind_sig(HaskellParser.Opt_datafam_kind_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#opt_tyfam_kind_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_tyfam_kind_sig(HaskellParser.Opt_tyfam_kind_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#opt_at_kind_inj_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_at_kind_inj_sig(HaskellParser.Opt_at_kind_inj_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tycl_hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTycl_hdr(HaskellParser.Tycl_hdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tycl_hdr_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTycl_hdr_inst(HaskellParser.Tycl_hdr_instContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#capi_ctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapi_ctype(HaskellParser.Capi_ctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#standalone_deriving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone_deriving(HaskellParser.Standalone_derivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#role_annot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_annot(HaskellParser.Role_annotContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#roles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoles(HaskellParser.RolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole(HaskellParser.RoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pattern_synonym_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_synonym_decl(HaskellParser.Pattern_synonym_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pattern_synonym_lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_synonym_lhs(HaskellParser.Pattern_synonym_lhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#vars_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars_(HaskellParser.Vars_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#cvars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvars(HaskellParser.CvarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#where_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_decls(HaskellParser.Where_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pattern_synonym_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_synonym_sig(HaskellParser.Pattern_synonym_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decl_cls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cls(HaskellParser.Decl_clsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decls_cls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls_cls(HaskellParser.Decls_clsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decllist_cls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecllist_cls(HaskellParser.Decllist_clsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#where_cls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_cls(HaskellParser.Where_clsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decl_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_inst(HaskellParser.Decl_instContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decls_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls_inst(HaskellParser.Decls_instContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decllist_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecllist_inst(HaskellParser.Decllist_instContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#where_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_inst(HaskellParser.Where_instContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(HaskellParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecllist(HaskellParser.DecllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#binds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinds(HaskellParser.BindsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#wherebinds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWherebinds(HaskellParser.WherebindsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(HaskellParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pragma_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_rule(HaskellParser.Pragma_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#rule_activation_marker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_activation_marker(HaskellParser.Rule_activation_markerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#rule_activation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_activation(HaskellParser.Rule_activationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#rule_foralls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_foralls(HaskellParser.Rule_forallsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#rule_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_vars(HaskellParser.Rule_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#rule_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_var(HaskellParser.Rule_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#warnings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWarnings(HaskellParser.WarningsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pragma_warning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_warning(HaskellParser.Pragma_warningContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#deprecations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeprecations(HaskellParser.DeprecationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pragma_deprecation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_deprecation(HaskellParser.Pragma_deprecationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(HaskellParser.StringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#stringlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringlist(HaskellParser.StringlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(HaskellParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdecl(HaskellParser.FdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#callconv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallconv(HaskellParser.CallconvContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#safety}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafety(HaskellParser.SafetyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFspec(HaskellParser.FspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#opt_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_sig(HaskellParser.Opt_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#opt_tyconsig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_tyconsig(HaskellParser.Opt_tyconsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#sigtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigtype(HaskellParser.SigtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#sigtypedoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigtypedoc(HaskellParser.SigtypedocContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#sig_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSig_vars(HaskellParser.Sig_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#sigtypes1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigtypes1(HaskellParser.Sigtypes1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#unpackedness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedness(HaskellParser.UnpackednessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#forall_vis_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_vis_flag(HaskellParser.Forall_vis_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ktype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKtype(HaskellParser.KtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ktypedoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKtypedoc(HaskellParser.KtypedocContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtype(HaskellParser.CtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ctypedoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtypedoc(HaskellParser.CtypedocContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tycl_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTycl_context(HaskellParser.Tycl_contextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#constr_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_context(HaskellParser.Constr_contextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(HaskellParser.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#typedoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedoc(HaskellParser.TypedocContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#constr_btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_btype(HaskellParser.Constr_btypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#constr_tyapps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_tyapps(HaskellParser.Constr_tyappsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#constr_tyapp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_tyapp(HaskellParser.Constr_tyappContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBtype(HaskellParser.BtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tyapps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyapps(HaskellParser.TyappsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tyapp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyapp(HaskellParser.TyappContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#atype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtype(HaskellParser.AtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#inst_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_type(HaskellParser.Inst_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#deriv_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriv_types(HaskellParser.Deriv_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#comma_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_types(HaskellParser.Comma_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#bar_types2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBar_types2(HaskellParser.Bar_types2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tv_bndrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTv_bndrs(HaskellParser.Tv_bndrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tv_bndr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTv_bndr(HaskellParser.Tv_bndrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tv_bndr_no_braces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTv_bndr_no_braces(HaskellParser.Tv_bndr_no_bracesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFds(HaskellParser.FdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fds1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFds1(HaskellParser.Fds1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFd(HaskellParser.FdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#varids0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarids0(HaskellParser.Varids0Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKind(HaskellParser.KindContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gadt_constrlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGadt_constrlist(HaskellParser.Gadt_constrlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gadt_constrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGadt_constrs(HaskellParser.Gadt_constrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gadt_constr_with_doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGadt_constr_with_doc(HaskellParser.Gadt_constr_with_docContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gadt_constr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGadt_constr(HaskellParser.Gadt_constrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#constrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrs(HaskellParser.ConstrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#constrs1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrs1(HaskellParser.Constrs1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#constr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr(HaskellParser.ConstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#forall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall(HaskellParser.ForallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#constr_stuff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_stuff(HaskellParser.Constr_stuffContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fielddecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFielddecls(HaskellParser.FielddeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fielddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFielddecl(HaskellParser.FielddeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#derivings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivings(HaskellParser.DerivingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#deriving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriving(HaskellParser.DerivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#deriv_clause_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriv_clause_types(HaskellParser.Deriv_clause_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decl_no_th}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_no_th(HaskellParser.Decl_no_thContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(HaskellParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(HaskellParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gdrhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdrhs(HaskellParser.GdrhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gdrh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdrh(HaskellParser.GdrhContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#sigdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigdecl(HaskellParser.SigdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#activation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivation(HaskellParser.ActivationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#th_quasiquote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTh_quasiquote(HaskellParser.Th_quasiquoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#th_qquasiquote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTh_qquasiquote(HaskellParser.Th_qquasiquoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#quasiquote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuasiquote(HaskellParser.QuasiquoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(HaskellParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#infixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixexp(HaskellParser.InfixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#exp10p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp10p(HaskellParser.Exp10pContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#exp10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp10(HaskellParser.Exp10Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFexp(HaskellParser.FexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexp(HaskellParser.AexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#aexp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexp1(HaskellParser.Aexp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#aexp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexp2(HaskellParser.Aexp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#splice_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplice_exp(HaskellParser.Splice_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#splice_untyped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplice_untyped(HaskellParser.Splice_untypedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#splice_typed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplice_typed(HaskellParser.Splice_typedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#cmdargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdargs(HaskellParser.CmdargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#acmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcmd(HaskellParser.AcmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#cvtopbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvtopbody(HaskellParser.CvtopbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#cvtopdecls0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvtopdecls0(HaskellParser.Cvtopdecls0Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#texp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexp(HaskellParser.TexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tup_exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTup_exprs(HaskellParser.Tup_exprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#commas_tup_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommas_tup_tail(HaskellParser.Commas_tup_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tup_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTup_tail(HaskellParser.Tup_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#list_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_(HaskellParser.List_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#lexps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexps(HaskellParser.LexpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#flattenedpquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlattenedpquals(HaskellParser.FlattenedpqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPquals(HaskellParser.PqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#squals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquals(HaskellParser.SqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#transformqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformqual(HaskellParser.TransformqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#guards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuards(HaskellParser.GuardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#guard_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_(HaskellParser.Guard_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#alts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlts(HaskellParser.AltsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#alt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlt(HaskellParser.AltContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#alt_rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlt_rhs(HaskellParser.Alt_rhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ralt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRalt(HaskellParser.RaltContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gdpats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdpats(HaskellParser.GdpatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ifgdpats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfgdpats(HaskellParser.IfgdpatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gdpat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdpat(HaskellParser.GdpatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPat(HaskellParser.PatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#bindpat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindpat(HaskellParser.BindpatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#apat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApat(HaskellParser.ApatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#apats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApats(HaskellParser.ApatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fpat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFpat(HaskellParser.FpatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#stmtlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtlist(HaskellParser.StmtlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(HaskellParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HaskellParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual(HaskellParser.QualContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fbinds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbinds(HaskellParser.FbindsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbind(HaskellParser.FbindContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#dbinds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbinds(HaskellParser.DbindsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#dbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbind(HaskellParser.DbindContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#name_boolformula_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_boolformula_opt(HaskellParser.Name_boolformula_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#name_boolformula_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_boolformula_and(HaskellParser.Name_boolformula_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#name_boolformula_and_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_boolformula_and_list(HaskellParser.Name_boolformula_and_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#name_boolformula_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_boolformula_atom(HaskellParser.Name_boolformula_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(HaskellParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#name_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_var(HaskellParser.Name_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qcon_nowiredlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQcon_nowiredlist(HaskellParser.Qcon_nowiredlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qcon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQcon(HaskellParser.QconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gen_qcon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen_qcon(HaskellParser.Gen_qconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon(HaskellParser.ConContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#con_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon_list(HaskellParser.Con_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#sysdcon_nolist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSysdcon_nolist(HaskellParser.Sysdcon_nolistContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#sysdcon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSysdcon(HaskellParser.SysdconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#conop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConop(HaskellParser.ConopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qconop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQconop(HaskellParser.QconopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gconsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGconsym(HaskellParser.GconsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gtycon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtycon(HaskellParser.GtyconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ntgtycon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNtgtycon(HaskellParser.NtgtyconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#oqtycon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOqtycon(HaskellParser.OqtyconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qtyconop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtyconop(HaskellParser.QtyconopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qtycon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtycon(HaskellParser.QtyconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tycon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTycon(HaskellParser.TyconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qtyconsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtyconsym(HaskellParser.QtyconsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tyconsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyconsym(HaskellParser.TyconsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(HaskellParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#varop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarop(HaskellParser.VaropContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQop(HaskellParser.QopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qopm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQopm(HaskellParser.QopmContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#hole_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHole_op(HaskellParser.Hole_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvarop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvarop(HaskellParser.QvaropContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvaropm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvaropm(HaskellParser.QvaropmContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tyvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyvar(HaskellParser.TyvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tyvarop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyvarop(HaskellParser.TyvaropContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tyvarid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyvarid(HaskellParser.TyvaridContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tycls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTycls(HaskellParser.TyclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qtycls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtycls(HaskellParser.QtyclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#var_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_(HaskellParser.Var_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvar(HaskellParser.QvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvarid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvarid(HaskellParser.QvaridContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#varid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarid(HaskellParser.VaridContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvarsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvarsym(HaskellParser.QvarsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvarsym_no_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvarsym_no_minus(HaskellParser.Qvarsym_no_minusContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#varsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsym(HaskellParser.VarsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#varsym_no_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsym_no_minus(HaskellParser.Varsym_no_minusContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#special_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_id(HaskellParser.Special_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qconid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQconid(HaskellParser.QconidContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#conid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConid(HaskellParser.ConidContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qconsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQconsym(HaskellParser.QconsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#consym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsym(HaskellParser.ConsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HaskellParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#open_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_(HaskellParser.Open_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose(HaskellParser.CloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(HaskellParser.SemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#modid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModid(HaskellParser.ModidContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#commas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommas(HaskellParser.CommasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#bars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBars(HaskellParser.BarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(HaskellParser.SpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(HaskellParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ascSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscSymbol(HaskellParser.AscSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(HaskellParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fractional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFractional(HaskellParser.FractionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(HaskellParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pfloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPfloat(HaskellParser.PfloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPchar(HaskellParser.PcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPstring(HaskellParser.PstringContext ctx);
}