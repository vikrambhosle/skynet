import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class start {
    public static void main(String[] args) {

        String javaClassContent = "INFILE datalines DSD delimiter='ab';"       ;
        InfileStmtLexer lexer = new InfileStmtLexer(CharStreams.fromString(javaClassContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InfileStmtParser parser = new InfileStmtParser(tokens);
        ParseTree tree = parser.infile_main();
        ParseTreeWalker walker = new ParseTreeWalker();
        SasCustomListener listener= new SasCustomListener();
        walker.walk(listener,tree);
        System.out.println(tree.toStringTree(parser));


        // do something here...
    }
}

