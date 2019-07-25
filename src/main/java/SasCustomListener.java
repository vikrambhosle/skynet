import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class SasCustomListener extends InfileStmtBaseListener {

    private List<String> errors = new ArrayList<String>();

    @Override

    public void  enterInfile_stmt (InfileStmtParser.Infile_stmtContext ctx){
        System.out.println(ctx.file_specification().getText());

    }
    /*public void  enterData_stmt_block(SASParser.Data_stmt_blockContext ctx){
        System.out.println(ctx.DATA().toString());
        System.out.println("Method %s is data!");

    }
    public void enterProc_stmt_block_list(SASParser.Proc_stmt_block_listContext vtx){


        System.out.println("Method %s is proc!");
    }
    public List<String> getErrors(){
        return Collections.unmodifiableList(errors);
    }*/


}