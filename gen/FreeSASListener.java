// Generated from C:/Users/VIKRAMBHOSLE/IdeaProjects/skynet/src/main/antlr4\FreeSAS.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FreeSASParser}.
 */
public interface FreeSASListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(FreeSASParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(FreeSASParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#sas_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSas_stmt_list(FreeSASParser.Sas_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#sas_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSas_stmt_list(FreeSASParser.Sas_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(FreeSASParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(FreeSASParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#if_then_else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else_stmt(FreeSASParser.If_then_else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#if_then_else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else_stmt(FreeSASParser.If_then_else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(FreeSASParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(FreeSASParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FreeSASParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FreeSASParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(FreeSASParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(FreeSASParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(FreeSASParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(FreeSASParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(FreeSASParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(FreeSASParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(FreeSASParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(FreeSASParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(FreeSASParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(FreeSASParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FreeSASParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FreeSASParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(FreeSASParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(FreeSASParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#abort_main}.
	 * @param ctx the parse tree
	 */
	void enterAbort_main(FreeSASParser.Abort_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#abort_main}.
	 * @param ctx the parse tree
	 */
	void exitAbort_main(FreeSASParser.Abort_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#abort_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAbort_stmt(FreeSASParser.Abort_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#abort_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAbort_stmt(FreeSASParser.Abort_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec(FreeSASParser.File_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec(FreeSASParser.File_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#proc_main}.
	 * @param ctx the parse tree
	 */
	void enterProc_main(FreeSASParser.Proc_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#proc_main}.
	 * @param ctx the parse tree
	 */
	void exitProc_main(FreeSASParser.Proc_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#proc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterProc_stmt(FreeSASParser.Proc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#proc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitProc_stmt(FreeSASParser.Proc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#proc_name}.
	 * @param ctx the parse tree
	 */
	void enterProc_name(FreeSASParser.Proc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#proc_name}.
	 * @param ctx the parse tree
	 */
	void exitProc_name(FreeSASParser.Proc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#array_main}.
	 * @param ctx the parse tree
	 */
	void enterArray_main(FreeSASParser.Array_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#array_main}.
	 * @param ctx the parse tree
	 */
	void exitArray_main(FreeSASParser.Array_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#array_stmt}.
	 * @param ctx the parse tree
	 */
	void enterArray_stmt(FreeSASParser.Array_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#array_stmt}.
	 * @param ctx the parse tree
	 */
	void exitArray_stmt(FreeSASParser.Array_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#array_name}.
	 * @param ctx the parse tree
	 */
	void enterArray_name(FreeSASParser.Array_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#array_name}.
	 * @param ctx the parse tree
	 */
	void exitArray_name(FreeSASParser.Array_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#array_subscript}.
	 * @param ctx the parse tree
	 */
	void enterArray_subscript(FreeSASParser.Array_subscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#array_subscript}.
	 * @param ctx the parse tree
	 */
	void exitArray_subscript(FreeSASParser.Array_subscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_elements(FreeSASParser.Array_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_elements(FreeSASParser.Array_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#initial_value_list}.
	 * @param ctx the parse tree
	 */
	void enterInitial_value_list(FreeSASParser.Initial_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#initial_value_list}.
	 * @param ctx the parse tree
	 */
	void exitInitial_value_list(FreeSASParser.Initial_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#initial_value_list_item}.
	 * @param ctx the parse tree
	 */
	void enterInitial_value_list_item(FreeSASParser.Initial_value_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#initial_value_list_item}.
	 * @param ctx the parse tree
	 */
	void exitInitial_value_list_item(FreeSASParser.Initial_value_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#initial_value_list_bk}.
	 * @param ctx the parse tree
	 */
	void enterInitial_value_list_bk(FreeSASParser.Initial_value_list_bkContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#initial_value_list_bk}.
	 * @param ctx the parse tree
	 */
	void exitInitial_value_list_bk(FreeSASParser.Initial_value_list_bkContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#constant_iter_value}.
	 * @param ctx the parse tree
	 */
	void enterConstant_iter_value(FreeSASParser.Constant_iter_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#constant_iter_value}.
	 * @param ctx the parse tree
	 */
	void exitConstant_iter_value(FreeSASParser.Constant_iter_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void enterConstant_value(FreeSASParser.Constant_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void exitConstant_value(FreeSASParser.Constant_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#assign_main}.
	 * @param ctx the parse tree
	 */
	void enterAssign_main(FreeSASParser.Assign_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#assign_main}.
	 * @param ctx the parse tree
	 */
	void exitAssign_main(FreeSASParser.Assign_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(FreeSASParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(FreeSASParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#by_main}.
	 * @param ctx the parse tree
	 */
	void enterBy_main(FreeSASParser.By_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#by_main}.
	 * @param ctx the parse tree
	 */
	void exitBy_main(FreeSASParser.By_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#by_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBy_stmt(FreeSASParser.By_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#by_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBy_stmt(FreeSASParser.By_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#call_main}.
	 * @param ctx the parse tree
	 */
	void enterCall_main(FreeSASParser.Call_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#call_main}.
	 * @param ctx the parse tree
	 */
	void exitCall_main(FreeSASParser.Call_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(FreeSASParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(FreeSASParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#data_main}.
	 * @param ctx the parse tree
	 */
	void enterData_main(FreeSASParser.Data_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#data_main}.
	 * @param ctx the parse tree
	 */
	void exitData_main(FreeSASParser.Data_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#data_stmt}.
	 * @param ctx the parse tree
	 */
	void enterData_stmt(FreeSASParser.Data_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#data_stmt}.
	 * @param ctx the parse tree
	 */
	void exitData_stmt(FreeSASParser.Data_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#dataset_name_opt}.
	 * @param ctx the parse tree
	 */
	void enterDataset_name_opt(FreeSASParser.Dataset_name_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#dataset_name_opt}.
	 * @param ctx the parse tree
	 */
	void exitDataset_name_opt(FreeSASParser.Dataset_name_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#datastmt_cmd}.
	 * @param ctx the parse tree
	 */
	void enterDatastmt_cmd(FreeSASParser.Datastmt_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#datastmt_cmd}.
	 * @param ctx the parse tree
	 */
	void exitDatastmt_cmd(FreeSASParser.Datastmt_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#view_dsname_opt}.
	 * @param ctx the parse tree
	 */
	void enterView_dsname_opt(FreeSASParser.View_dsname_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#view_dsname_opt}.
	 * @param ctx the parse tree
	 */
	void exitView_dsname_opt(FreeSASParser.View_dsname_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(FreeSASParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(FreeSASParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#dataset_name}.
	 * @param ctx the parse tree
	 */
	void enterDataset_name(FreeSASParser.Dataset_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#dataset_name}.
	 * @param ctx the parse tree
	 */
	void exitDataset_name(FreeSASParser.Dataset_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#program_name}.
	 * @param ctx the parse tree
	 */
	void enterProgram_name(FreeSASParser.Program_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#program_name}.
	 * @param ctx the parse tree
	 */
	void exitProgram_name(FreeSASParser.Program_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#passwd_opt}.
	 * @param ctx the parse tree
	 */
	void enterPasswd_opt(FreeSASParser.Passwd_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#passwd_opt}.
	 * @param ctx the parse tree
	 */
	void exitPasswd_opt(FreeSASParser.Passwd_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#source_opt}.
	 * @param ctx the parse tree
	 */
	void enterSource_opt(FreeSASParser.Source_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#source_opt}.
	 * @param ctx the parse tree
	 */
	void exitSource_opt(FreeSASParser.Source_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#datalines_main}.
	 * @param ctx the parse tree
	 */
	void enterDatalines_main(FreeSASParser.Datalines_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#datalines_main}.
	 * @param ctx the parse tree
	 */
	void exitDatalines_main(FreeSASParser.Datalines_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#datalines_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDatalines_stmt(FreeSASParser.Datalines_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#datalines_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDatalines_stmt(FreeSASParser.Datalines_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#datalines4_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDatalines4_stmt(FreeSASParser.Datalines4_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#datalines4_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDatalines4_stmt(FreeSASParser.Datalines4_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#drop_main}.
	 * @param ctx the parse tree
	 */
	void enterDrop_main(FreeSASParser.Drop_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#drop_main}.
	 * @param ctx the parse tree
	 */
	void exitDrop_main(FreeSASParser.Drop_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(FreeSASParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(FreeSASParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#infile_main}.
	 * @param ctx the parse tree
	 */
	void enterInfile_main(FreeSASParser.Infile_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#infile_main}.
	 * @param ctx the parse tree
	 */
	void exitInfile_main(FreeSASParser.Infile_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#infile_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInfile_stmt(FreeSASParser.Infile_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#infile_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInfile_stmt(FreeSASParser.Infile_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(FreeSASParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(FreeSASParser.File_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#device_type}.
	 * @param ctx the parse tree
	 */
	void enterDevice_type(FreeSASParser.Device_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#device_type}.
	 * @param ctx the parse tree
	 */
	void exitDevice_type(FreeSASParser.Device_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#infile_options}.
	 * @param ctx the parse tree
	 */
	void enterInfile_options(FreeSASParser.Infile_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#infile_options}.
	 * @param ctx the parse tree
	 */
	void exitInfile_options(FreeSASParser.Infile_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#input_main}.
	 * @param ctx the parse tree
	 */
	void enterInput_main(FreeSASParser.Input_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#input_main}.
	 * @param ctx the parse tree
	 */
	void exitInput_main(FreeSASParser.Input_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(FreeSASParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(FreeSASParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#put_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPut_stmt(FreeSASParser.Put_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#put_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPut_stmt(FreeSASParser.Put_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#input_specification}.
	 * @param ctx the parse tree
	 */
	void enterInput_specification(FreeSASParser.Input_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#input_specification}.
	 * @param ctx the parse tree
	 */
	void exitInput_specification(FreeSASParser.Input_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#put_specification}.
	 * @param ctx the parse tree
	 */
	void enterPut_specification(FreeSASParser.Put_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#put_specification}.
	 * @param ctx the parse tree
	 */
	void exitPut_specification(FreeSASParser.Put_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#pointer_control}.
	 * @param ctx the parse tree
	 */
	void enterPointer_control(FreeSASParser.Pointer_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#pointer_control}.
	 * @param ctx the parse tree
	 */
	void exitPointer_control(FreeSASParser.Pointer_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#informat_list}.
	 * @param ctx the parse tree
	 */
	void enterInformat_list(FreeSASParser.Informat_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#informat_list}.
	 * @param ctx the parse tree
	 */
	void exitInformat_list(FreeSASParser.Informat_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#input_variable_format}.
	 * @param ctx the parse tree
	 */
	void enterInput_variable_format(FreeSASParser.Input_variable_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#input_variable_format}.
	 * @param ctx the parse tree
	 */
	void exitInput_variable_format(FreeSASParser.Input_variable_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#input_variable}.
	 * @param ctx the parse tree
	 */
	void enterInput_variable(FreeSASParser.Input_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#input_variable}.
	 * @param ctx the parse tree
	 */
	void exitInput_variable(FreeSASParser.Input_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#put_variable_format}.
	 * @param ctx the parse tree
	 */
	void enterPut_variable_format(FreeSASParser.Put_variable_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#put_variable_format}.
	 * @param ctx the parse tree
	 */
	void exitPut_variable_format(FreeSASParser.Put_variable_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#put_variable}.
	 * @param ctx the parse tree
	 */
	void enterPut_variable(FreeSASParser.Put_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#put_variable}.
	 * @param ctx the parse tree
	 */
	void exitPut_variable(FreeSASParser.Put_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#column_point_control}.
	 * @param ctx the parse tree
	 */
	void enterColumn_point_control(FreeSASParser.Column_point_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#column_point_control}.
	 * @param ctx the parse tree
	 */
	void exitColumn_point_control(FreeSASParser.Column_point_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#line_point_control}.
	 * @param ctx the parse tree
	 */
	void enterLine_point_control(FreeSASParser.Line_point_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#line_point_control}.
	 * @param ctx the parse tree
	 */
	void exitLine_point_control(FreeSASParser.Line_point_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#format_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFormat_modifier(FreeSASParser.Format_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#format_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFormat_modifier(FreeSASParser.Format_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#column_specifications}.
	 * @param ctx the parse tree
	 */
	void enterColumn_specifications(FreeSASParser.Column_specificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#column_specifications}.
	 * @param ctx the parse tree
	 */
	void exitColumn_specifications(FreeSASParser.Column_specificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#means_main}.
	 * @param ctx the parse tree
	 */
	void enterMeans_main(FreeSASParser.Means_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#means_main}.
	 * @param ctx the parse tree
	 */
	void exitMeans_main(FreeSASParser.Means_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#means_proc}.
	 * @param ctx the parse tree
	 */
	void enterMeans_proc(FreeSASParser.Means_procContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#means_proc}.
	 * @param ctx the parse tree
	 */
	void exitMeans_proc(FreeSASParser.Means_procContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#run_main}.
	 * @param ctx the parse tree
	 */
	void enterRun_main(FreeSASParser.Run_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#run_main}.
	 * @param ctx the parse tree
	 */
	void exitRun_main(FreeSASParser.Run_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreeSASParser#run_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRun_stmt(FreeSASParser.Run_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreeSASParser#run_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRun_stmt(FreeSASParser.Run_stmtContext ctx);
}