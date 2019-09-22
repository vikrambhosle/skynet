import com.mongodb.client.MongoCollection;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.TokenStreamRewriter;
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
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import com.mongodb.DB;
import com.mongodb.MongoCredential;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.BasicDBObjectBuilder;
import org.bson.Document;


public class SasCustomListener extends SASBaseListener {
     //List<HashMap<String, String>> codeDag = new ArrayList<HashMap<String, String>>();
    // Data step global variables
     String dsSource ;
     String dsTarget;
     Integer prevDF;
     Integer currDf = 0;
     Integer stmtNum = 0;
    //TODO :  target will be combination of target name and associated options
    MongoClient mongos = new MongoClient();
    MongoDatabase database = mongos.getDatabase("test");
    MongoCollection collection = database.getCollection("customers");
    List process = new ArrayList();
    List processStep = new ArrayList();
    Document document = new Document();
    @Override
    public void enterParse(SASParser.ParseContext ctx) {
        collection.deleteMany(new BasicDBObject());
          }

    public void enterData_stmt_block(SASParser.Data_stmt_blockContext ctx) {
        //CharStream a = ctx.start.getInputStream();
        String description =" New Data process "      ;
        document.put("index", String.valueOf(stmtNum));
        document.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        document.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        document.put("description", description);
        process.add(document);

        /*HashMap<String, String> row = new HashMap<String, String>();
        row.put("index", String.valueOf(stmtNum));
        row.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        row.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        row.put("description", description);
        codeDag.add(row);*/
        stmtNum = stmtNum+1;

    }

    @Override
    public void enterInfile_stmt(SASParser.Infile_stmtContext ctx) {
        String description =" Read a source file " ;
        System.out.println(ctx.file_specification().getText());
        //CommonTokenStream tokenStream= new CommonTokenStream();
                   // Py code
        // Populate mandatory first and then handle optionals
        String Pycode = "df"+currDf.toString()+"="+ "pandas.read_csv("+ ctx.file_specification().getText() + ")" ;
        prevDF=currDf;
        currDf=currDf+1;

        //TODO seperator and firstobs
        Document documentDetail = new Document();

        documentDetail.put("description", description);
        documentDetail.put("sasCode",ctx.getText());
        documentDetail.put("pythonSyntax", Pycode);
        documentDetail.put("pythonCode", Pycode);
        documentDetail.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        documentDetail.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        processStep.add(documentDetail);

                    }

    public void enterInput_stmt(SASParser.Input_stmtContext ctx) {
        String description =" Select input columns , format and pointers" ;
        // Py code
        String columnList ;
        columnList="";
        ctx.input_specification().clear();
        for (int i = 0; i < ctx.input_specification().size(); i++) {
             if (i==ctx.input_specification().size()-1) {
                 columnList = columnList + ctx.input_specification(i).getText() ;
             }else {
                 columnList = columnList  + ctx.input_specification(i).getText()+ ",";
                     }
                    }
        //TODO pointer and format
        String Pycode = "df"+currDf.toString()+"="+ "df"+ prevDF.toString()+"[[" + columnList+ "]]" ;
        prevDF=currDf;
        currDf=currDf+1;
        System.out.println(ctx.getRuleIndex());
        Document documentDetail = new Document();
        documentDetail.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        documentDetail.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        documentDetail.put("description", description);
        documentDetail.put("sasCode",ctx.getText());
        documentDetail.put("pythonCode", Pycode);
        processStep.add(documentDetail);


    }

    public void exitData_stmt_block(SASParser.Data_stmt_blockContext ctx) {

    document.put("processSteps", processStep);
        collection.insertOne(document);
        document.clear();
        processStep.clear();
        System.out.println(document.toString());
    }

    public void exitSas_stmt_block(SASParser.Sas_stmt_blockContext ctx) {


        /*for (int i = 0; i < codeDag.size(); i++) {
            Document document = new Document();
            Document documentDetail = new Document();
            Document documentDetailan = new Document();
            document.put("fileName", " vb" );
            List list = new ArrayList();
            documentDetail.put("fileName", " vb" );
            documentDetailan.put("fileName2", " vb2" );
            list.add(documentDetail);
            list.add(documentDetailan);
            document.put("detail", list );
            // list.clear();
            collection.insertOne(document);


            System.out.println(codeDag.get(i));
        }*/
    }


}



