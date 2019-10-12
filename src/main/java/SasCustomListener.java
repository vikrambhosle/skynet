import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import com.mongodb.BasicDBObjectBuilder;
import org.bson.Document;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SasCustomListener extends SASBaseListener {
     //List<HashMap<String, String>> codeDag = new ArrayList<HashMap<String, String>>();
    // Data step global variables
     String dsSource ;
     String dsTarget;
     Integer prevDF;
     Integer currDf = 0;
     Integer stmtNum = 0;
    //TODO :  target will be combination of target name and associated options
    MongoClientURI uri ;//= new MongoClientURI("mongodb://admin:ibm123@54.171.91.63/saspy" );
    MongoClient mongos ;//= new MongoClient(uri);
    MongoDatabase database ;
    MongoCollection collection ;
    List process = new ArrayList();
    List processStep = new ArrayList();
    Document document = new Document();

    static{

        try(InputStream input = new FileInputStream("C:\\Users\\VIKRAMBHOSLE\\IdeaProjects\\skynet\\src\\main\\java\\config.properties"))
    {
        Properties prop = new Properties();
       // load a properties file
        prop.load(input);

            }
         catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void enterParse(SASParser.ParseContext ctx) {
       //Deleting the earlier collection

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

    public void enterMerge_stmt (SASParser.Merge_stmtContext ctx) {
        // yet  to becompleted

        String description ="  Merge nad Join Data Sets - Conditional Statements" ;
        // Py code
        String columnList ;
        columnList="";
        //ctx.input_specification().clear();
        for (int i = 0; i < ctx.dataset_name_opt().size(); i++) {
            if (i==ctx.dataset_name_opt().size()-1) {
                columnList = columnList + ctx.dataset_name_opt(i).getText() ;
            }else {
                columnList = columnList  + ctx.dataset_name_opt(i).getText()+ ",";
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

    public void enterBoxplot_stmt(SASParser.Boxplot_stmtContext ctx) {
        // yet  to becompleted
        System.out.println(ctx.boxplot_stmt_list(0).getText());
        System.out.println(ctx.boxplot_stmt_list(1).getText());
        System.out.println(ctx.boxplot_stmt_list(2).getText());
       /* String description ="  Merge nad Join Data Sets - Conditional Statements" ;
        // Py code
        String columnList ;
        columnList="";
        //ctx.input_specification().clear();
        for (int i = 0; i < ctx.dataset_name_opt().size(); i++) {
            if (i==ctx.dataset_name_opt().size()-1) {
                columnList = columnList + ctx.dataset_name_opt(i).getText() ;
            }else {
                columnList = columnList  + ctx.dataset_name_opt(i).getText()+ ",";
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
        processStep.add(documentDetail); */
    }









    public void exitData_stmt_block(SASParser.Data_stmt_blockContext ctx) {
       // populating  the collection
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



