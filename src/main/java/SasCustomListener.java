import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


 import org.antlr.v4.runtime.misc.Interval;



public class SasCustomListener extends InfileStmtBaseListener {
    List<HashMap<String, String>> codeDag = new ArrayList<HashMap<String, String>>();

    @Override

    public void enterData_stmt_block(InfileStmtParser.Data_stmt_blockContext ctx) {
        CharStream a = ctx.start.getInputStream();

        System.out.println(a);
        System.out.println(ctx.Identifier().getText());

        HashMap<String, String> row = new HashMap<String, String>();
        row.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        row.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        row.put("description", String.valueOf(ctx.getParent().getRuleIndex()));

        codeDag.add(row);


    }

    @Override
    public void enterInfile_stmt(InfileStmtParser.Infile_stmtContext ctx) {
        String b = ctx.file_specification().getText();
        /* int b = ctx.stop.getStopIndex();
            Interval interval = new Interval(a,b);
        ingetText(interval); */
        System.out.println(b);
        // System.out.println(a);
        HashMap<String, String> row = new HashMap<String, String>();
        row.put("test", "2");
        codeDag.add(row);
        for (int i = 0; i < codeDag.size(); i++) {
            System.out.println(codeDag.get(i));

        }
    }}
   /* public void  enterData_stmt_block(InfileStmtParser.Data_stmt_blockContext ctx){
        //System.out.println(ctx.DATA().toString());
        System.out.println("Method %s is data!");
*/



    /*public void enterProc_stmt_block_list(SASParser.Proc_stmt_block_listContext vtx){


        System.out.println("Method %s is proc!");
    }
    public List<String> getErrors(){
        return Collections.unmodifiableList(errors);
    }*/


