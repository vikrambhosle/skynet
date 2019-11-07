import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import org.antlr.v4.runtime.misc.Interval;
import java.io.*;
import java.util.*;
import org.apache.ecs.rtf.BackGroundColor;
import org.apache.ecs.xhtml.li;
import org.apache.ecs.xhtml.link;
import org.apache.ecs.xhtml.ul;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.Properties;
import org.apache.ecs.html.*;
import org.apache.ecs.HtmlColor;


public class SasCustomListener extends SASBaseListener {
     //List<HashMap<String, String>> codeDag = new ArrayList<HashMap<String, String>>();
    // Data step global variables
     String dsSource ;
     String dsTarget;
     Integer prevDF;
     Integer currDf = 0;
     Integer stmtNum = 1;
    //TODO :  target will be combination of target name and associated options
    MongoClientURI uri ;//= new MongoClientURI("mongodb://admin:ibm123@54.171.91.63/saspy" );
    MongoClient mongos ;//= new MongoClient(uri);
    MongoDatabase database ;
    MongoCollection collection ;
    List process = new ArrayList();
    List processStep = new ArrayList();
    Document document = new Document();
    Html html = new Html();

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
        // TEMPORARY COMMENTforakash1
        //collection.deleteMany(new BasicDBObject());
        // HTML Setup
        html.addElement(new link().setRel("stylesheet").setHref("Synonym.css"));
        html.addElement(new H4("IBM SYNONYM - SAS 2 PYTHON HELPER"));
        html.addElement(new Font().setSize("+1").setColor(HtmlColor.blue).setFace("Arial").addElement( " File Name:sascode.txt" ));


        System.out.println(html.toString());
   }

    public void enterData_stmt_block(SASParser.Data_stmt_blockContext ctx) {
        //CharStream a = ctx.start.getInputStream();
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        String description =" Data process "      ;
                document.put("index", String.valueOf(stmtNum));
        document.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        document.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        document.put("description", description);
        process.add(document); // redundant?
        dsTarget = ctx.data_stmt().dataset_name_opt(0).dataset_name().getText();

        //HTML Creation
        html.addElement(new H4(stmtNum + ".Data Step: Modify existing data sets or create  data sets from raw data files"));
        //html.addElement(new H6("Rule ID" + String.valueOf(ctx.getRuleIndex())+ "Parent Rule ID" + String.valueOf(ctx.getParent().getRuleIndex())));

        System.out.println(html.toString());
        stmtNum = stmtNum+1;

    }





    @Override
    public void enterInfile_stmt(SASParser.Infile_stmtContext ctx) {
        String description =" Read a source file " + ctx.file_specification().getText() ;
        String sasguidance = "<a href ="+ "https://documentation.sas.com/?docsetId=lestmtsref&docsetTarget=n1rill4udj0tfun1fvce3j401plo.htm&docsetVersion=9.4&locale=en>SAS Syntax Reference</a>";
        String pyguidance = "<a href =" + "https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.read_csv.html>Python Syntax Reference</a>";

        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        String Pycode = "df"+currDf.toString()+"="+ "pandas.read_csv("+ ctx.file_specification().getText() + ","+ "skiprows:" +ctx.infile_options(1).INT()+ "," + ctx.infile_options(0).getText()+  ")" ;
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
        // HTML Creation
        html.addElement(new ul().addElement(new li(description).addElement(new ul()
                .addElement(new li("Source SAS Code : " + ctx.start.getInputStream().getText(interval)))
                        .addElement(new li(sasguidance))
                        .addElement(new li("Matching Python Code : " + Pycode))
                        .addElement(new li(pyguidance))
                        //.addElement(new li(" Rule ID :" + String.valueOf(ctx.getRuleIndex())))
                        //.addElement(new li(" Parent Rule ID :" +String.valueOf(ctx.getParent().getRuleIndex())))
        )));

        processStep.add(documentDetail);

                    }

    public void enterInput_stmt(SASParser.Input_stmtContext ctx) {
        String description =" Select input columns , format and pointers" ;
        String sasguidance = "<a href =" + "http://support.sas.com/documentation/cdl/en/lrdict/64316/HTML/default/viewer.htm#a000146292.htm>SAS Syntax Reference</a>";
        String pyguidance = "<a href =" +"https://pandas.pydata.org/pandas-docs/stable/user_guide/indexing.html#selection-by-positionl>Python Syntax Reference</a>";

        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
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
        String Pycode = dsTarget+"="+ "df"+ prevDF.toString()+"[[" + columnList+ "]]" ;
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

        //HTML Creation
        html.addElement(new ul().addElement(new li(description).addElement(new ul()
                .addElement(new li("Source SAS Code : " + ctx.start.getInputStream().getText(interval)))
                .addElement(new li(sasguidance))
                .addElement(new li("Matching Python Code :" + Pycode))
                .addElement(new li(pyguidance))
               // .addElement(new li(" Rule ID :" + String.valueOf(ctx.getRuleIndex())))
                //.addElement(new li(" Parent Rule ID :" +String.valueOf(ctx.getParent().getRuleIndex())))
        )));


    }

    public void enterMerge_join_stmt (SASParser.Merge_join_stmtContext ctx) {

       /* System.out.println(ctx.ds_name(0).Identifier().getText());
        System.out.println(ctx.ds_name(1).Identifier().getText());
        System.out.println(ctx.by_stmt().Identifier(0).getText());
        System.out.println(ctx.if_stmt().expression().getText());
        System.out.println(ctx.if_stmt().expression().expression().size());*/

        if (ctx.if_stmt().expression().expression().size() == 2) {

            String description =" Inner Join of Data Sets " + "of " + ctx.ds_name(0).Identifier().getText() + " and " +ctx.ds_name(1).Identifier().getText() ;
            String sasguidance ="<a href =" +"http://support.sas.com/documentation/cdl/en/basess/58133/HTML/default/viewer.htm#a001318494.htm>SAS Syntax Reference</a>";
            String pyguidance ="<a href =" +"https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.DataFrame.merge.html>Python Syntax Reference</a>";
            String Pycode= dsTarget+"="+ "pd.merge(" + ctx.ds_name(0).Identifier().getText() + "," + ctx.ds_name(1).Identifier().getText()+"," +"on='"+ctx.by_stmt().Identifier(0).getText() +"'," + "how='inner'"+","+"sort=True"+")"                ;
            int a = ctx.start.getStartIndex();
            int b = ctx.stop.getStopIndex();
            Interval interval = new Interval(a,b);
            Document documentDetail = new Document();
            documentDetail.put("ruleId", String.valueOf(ctx.getRuleIndex()));
            documentDetail.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
            documentDetail.put("description", description);
            documentDetail.put("sasGuidance", sasguidance);
            documentDetail.put("sasCode",ctx.start.getInputStream().getText(interval));
            documentDetail.put("pythonSyntax",pyguidance);
            documentDetail.put("pythonCode", Pycode);
            processStep.add(documentDetail);

            //HTML Creation
            html.addElement(new ul().addElement(new li(description).addElement(new ul()
                    .addElement(new li("Source SAS Code : " + ctx.start.getInputStream().getText(interval)))
                    .addElement(new li(sasguidance))
                    .addElement(new li("Matching Python Code :" + Pycode))
                    .addElement(new li( pyguidance))
                  //  .addElement(new li(" Rule ID :" + String.valueOf(ctx.getRuleIndex())))
                   // .addElement(new li(" Parent Rule ID :" +String.valueOf(ctx.getParent().getRuleIndex())))
            )));

        }
 //// need to put logic to decide (left or right) based on opt valu
        if (ctx.if_stmt().expression().expression().size() == 0) {

            String description ="Left Outer Join of Data Sets " + "of " + ctx.ds_name(0).Identifier().getText() + " and " + ctx.ds_name(1).Identifier().getText();
            String sasguidance ="<a href =" +"http://support.sas.com/documentation/cdl/en/proc/61895/HTML/default/viewer.htm#sort-overview.htm>SAS Syntax Reference</a>";
            String pyguidance ="<a href ="+ "https://pandas.pydata.org/pandas-docs/version/0.18/generated/pandas.DataFrame.sort.html>Python Syntax Reference</a>";
            String Pycode= dsTarget+"="+ "pd.merge(" + ctx.ds_name(0).Identifier().getText() + "," + ctx.ds_name(1).Identifier().getText()+"," +"on='"+ctx.by_stmt().Identifier(0).getText() +"'," + "how='left'"+","+"sort=True"+")";
            System.out.println(Pycode);
            int a = ctx.start.getStartIndex();
            int b = ctx.stop.getStopIndex();
            Interval interval = new Interval(a,b);
            System.out.println(Pycode) ;
            System.out.println(ctx.getRuleIndex());
            Document documentDetail = new Document();
            documentDetail.put("ruleId", String.valueOf(ctx.getRuleIndex()));
            documentDetail.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
            documentDetail.put("description", description);
            documentDetail.put("sasGuidance", sasguidance);
            documentDetail.put("sasCode",ctx.start.getInputStream().getText(interval));
            documentDetail.put("pythonSyntax",pyguidance);
            documentDetail.put("pythonCode", Pycode);
            processStep.add(documentDetail);
            html.addElement(new ul().addElement(new li(description).addElement(new ul()
                    .addElement(new li("Source SAS Code : " + ctx.start.getInputStream().getText(interval)))
                    .addElement(new li("SAS Syntax Reference :" + sasguidance))
                    .addElement(new li("Matching Python Code :" + Pycode))
                    .addElement(new li("Python Syntax Reference :" + pyguidance))
                    //.addElement(new li(" Rule ID :" + String.valueOf(ctx.getRuleIndex())))
                    //.addElement(new li(" Parent Rule ID :" +String.valueOf(ctx.getParent().getRuleIndex())))
            )));
        }


    }

    public void enterProc_stmt(SASParser.Proc_stmtContext ctx) {


        String description =" Data process "      ;
        document.put("index", String.valueOf(stmtNum));
        document.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        document.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        document.put("description", description);
        process.add(document); // redundant?


        //HTML Creation
        html.addElement(new H4(stmtNum + ".Proc Step: Statements to analyze the data in a data set, produce formatted reports , or provide ways to manage SAS files."));
        //html.addElement(new H6("Rule ID" + String.valueOf(ctx.getRuleIndex())+ "Parent Rule ID" + String.valueOf(ctx.getParent().getRuleIndex())));

        System.out.println(html.toString());
        stmtNum = stmtNum+1;

    }


    public void enterProc_sort(SASParser.Proc_sortContext ctx) {
        // yet  to be completed
        String description =" Ordering data set observations by the values of one or more variables.Either replaces the original data set or creates a new data set." ;
        String sasguidance ="<a href="+"http://support.sas.com/documentation/cdl/en/proc/61895/HTML/default/viewer.htm#sort-overview.htm>SAS Syntax Reference</a>";
        String pyguidance ="<a href="+"https://pandas.pydata.org/pandas-docs/version/0.18/generated/pandas.DataFrame.sort.html>Python Syntax Reference</a>";

        String Pycode = ctx.collating_seq_opt().Identifier().getText().toString()+"="+ ctx.collating_seq_opt().Identifier().getText().toString()+".sort"+ "([" + ctx.by_stmt().Identifier().toString() + "])" ;
        prevDF=currDf;
        currDf=currDf+1;

        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        System.out.println(Pycode) ;
        System.out.println(ctx.getRuleIndex());
        Document documentDetail = new Document();
        documentDetail.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        documentDetail.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        documentDetail.put("description", description);
        documentDetail.put("sasGuidance", sasguidance);
        documentDetail.put("sasCode",ctx.start.getInputStream().getText(interval));
        documentDetail.put("pythonSyntax",pyguidance);
        documentDetail.put("pythonCode", Pycode);
        processStep.add(documentDetail);
        //HTML Creation
        html.addElement(new ul().addElement(new li(description).addElement(new ul()
                .addElement(new li("Source SAS Code : " + ctx.start.getInputStream().getText(interval)))
                .addElement(new li(sasguidance))
                .addElement(new li("Matching Python Code :" + Pycode))
                .addElement(new li(pyguidance))
               // .addElement(new li(" Rule ID :" + String.valueOf(ctx.getRuleIndex())))
               // .addElement(new li(" Parent Rule ID :" +String.valueOf(ctx.getParent().getRuleIndex())))
        )));
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
    public void exitData_stmt(SASParser.Data_stmtContext ctx) {
        // populating  the collection

        String description =" Write Output Dataset " + dsTarget + " as below:";
        String sasguidance = "<a href ="+ "https://documentation.sas.com/?docsetId=lestmtsref&docsetTarget=n1rill4udj0tfun1fvce3j401plo.htm&docsetVersion=9.4&locale=en>SAS Syntax Reference</a>";
        String pyguidance = "<a href =" + "https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.read_csv.html>Python Syntax Reference</a>";

        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        String Pycode = dsTarget+"="+ prevDF + ","+ "[]" +")" ;

        //Note required in exit
        //prevDF=currDf;
        //currDf=currDf+1;

        //TODO seperator and firstobs
        Document documentDetail = new Document();

        documentDetail.put("description", description);
       // documentDetail.put("ruleId", String.valueOf(ctx.getRuleIndex()));
        //documentDetail.put("parentRuleID", String.valueOf(ctx.getParent().getRuleIndex()));
        // HTML Creation
        html.addElement(new ul().addElement(new li(description)
        ));



    }

    public void exitData_stmt_block(SASParser.Data_stmt_blockContext ctx) {
       // populating  the collection

    document.put("processSteps", processStep);

    // TEMPORARY REMOVAL

    //collection.insertOne(document);
        System.out.println(document.toString());
        document.clear();
        processStep.clear();

    }

    public void exitSas_stmt_block(SASParser.Sas_stmt_blockContext ctx){

        try {
            FileWriter writer= new FileWriter("C:\\Synonym\\Synonym_output.htm");
     PrintWriter out;
     out = new PrintWriter(writer);
     html.output(writer);

 } catch (FileNotFoundException e) {
     e.printStackTrace();
 } catch (IOException e) {
            e.printStackTrace();
        }
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



