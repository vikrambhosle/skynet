// Generated from C:/Users/VIKRAMBHOSLE/IdeaProjects/skynet/src/main/antlr4\FreeSAS.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FreeSASParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FreeSASVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(FreeSASParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#sas_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSas_stmt_list(FreeSASParser.Sas_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(FreeSASParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#if_then_else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_stmt(FreeSASParser.If_then_else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(FreeSASParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FreeSASParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(FreeSASParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(FreeSASParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(FreeSASParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(FreeSASParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(FreeSASParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FreeSASParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(FreeSASParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#abort_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_main(FreeSASParser.Abort_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#abort_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_stmt(FreeSASParser.Abort_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_spec(FreeSASParser.File_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#proc_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_main(FreeSASParser.Proc_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#proc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_stmt(FreeSASParser.Proc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#proc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_name(FreeSASParser.Proc_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#array_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_main(FreeSASParser.Array_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#array_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_stmt(FreeSASParser.Array_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#array_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_name(FreeSASParser.Array_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#array_subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_subscript(FreeSASParser.Array_subscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#array_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_elements(FreeSASParser.Array_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#initial_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_value_list(FreeSASParser.Initial_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#initial_value_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_value_list_item(FreeSASParser.Initial_value_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#initial_value_list_bk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_value_list_bk(FreeSASParser.Initial_value_list_bkContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#constant_iter_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_iter_value(FreeSASParser.Constant_iter_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#constant_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_value(FreeSASParser.Constant_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#assign_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_main(FreeSASParser.Assign_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(FreeSASParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#by_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_main(FreeSASParser.By_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#by_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_stmt(FreeSASParser.By_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#call_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_main(FreeSASParser.Call_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(FreeSASParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#data_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_main(FreeSASParser.Data_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#data_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_stmt(FreeSASParser.Data_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#dataset_name_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_name_opt(FreeSASParser.Dataset_name_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#datastmt_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatastmt_cmd(FreeSASParser.Datastmt_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#view_dsname_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_dsname_opt(FreeSASParser.View_dsname_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(FreeSASParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#dataset_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_name(FreeSASParser.Dataset_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#program_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_name(FreeSASParser.Program_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#passwd_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswd_opt(FreeSASParser.Passwd_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#source_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_opt(FreeSASParser.Source_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#datalines_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatalines_main(FreeSASParser.Datalines_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#datalines_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatalines_stmt(FreeSASParser.Datalines_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#datalines4_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatalines4_stmt(FreeSASParser.Datalines4_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#drop_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_main(FreeSASParser.Drop_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(FreeSASParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#infile_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfile_main(FreeSASParser.Infile_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#infile_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfile_stmt(FreeSASParser.Infile_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(FreeSASParser.File_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#device_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevice_type(FreeSASParser.Device_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#infile_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfile_options(FreeSASParser.Infile_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#input_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_main(FreeSASParser.Input_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#input_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_stmt(FreeSASParser.Input_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#put_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_stmt(FreeSASParser.Put_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#input_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_specification(FreeSASParser.Input_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#put_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_specification(FreeSASParser.Put_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#pointer_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_control(FreeSASParser.Pointer_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#informat_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformat_list(FreeSASParser.Informat_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#input_variable_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_variable_format(FreeSASParser.Input_variable_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#input_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_variable(FreeSASParser.Input_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#put_variable_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_variable_format(FreeSASParser.Put_variable_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#put_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_variable(FreeSASParser.Put_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#column_point_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_point_control(FreeSASParser.Column_point_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#line_point_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_point_control(FreeSASParser.Line_point_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#format_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_modifier(FreeSASParser.Format_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#column_specifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_specifications(FreeSASParser.Column_specificationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#means_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeans_main(FreeSASParser.Means_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#means_proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeans_proc(FreeSASParser.Means_procContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#run_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun_main(FreeSASParser.Run_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreeSASParser#run_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun_stmt(FreeSASParser.Run_stmtContext ctx);
}