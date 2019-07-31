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



public class SasCustomListener extends SASBaseListener {
    List<HashMap<String, String>> codeDag = new ArrayList<HashMap<String, String>>();
    // Data step global variables
     String dsSource ;
     String dsTarget;



    //TODO :  target will be combination of target name and associated options


    @Override

    public void enterData_stmt_block(SASParser.Data_stmt_blockContext ctx) {

        CharStream a = ctx.start.getInputStream();

        System.out.println(a);
        System.out.println();
        String description =" Data process "      ;
        HashMap<String, String> row = new HashMap<String, String>();
        row.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        row.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        row.put("description", description);
        codeDag.add(row);
        dsTarget=ctx.Identifier().getText();
    }

    @Override
    public void enterInfile_stmt(SASParser.Infile_stmtContext ctx) {
        CharStream sasCode = ctx.start.getInputStream();
        String description =" Read a source file " ;

        // Py code

        String Pycode = "pandas.read_csv("+ ctx.file_specification().getText() + ")" ;

        //TODO seperator and firstobs

        HashMap<String, String> row = new HashMap<String, String>();
        row.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        row.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        row.put("description", description);
        row.put("sasCode",String.valueOf(sasCode));
        row.put("pythonCode", Pycode);

        codeDag.add(row);

        for (int i = 0; i < codeDag.size(); i++) {
            System.out.println(codeDag.get(i));
        }
        }
    }
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


