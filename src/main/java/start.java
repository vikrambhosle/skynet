import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class start {
    public static void main(String[] args) {

        String javaClassContent = "data crime ;\n" +
                "  infile \"crime.csv\" delimiter=\",\" firstobs=2;\n" +
                "  input sid  $ crime murder pctmetro pctwhite pcths poverty single;\n" +
        "run; " +
                "data crime ;\n" +
                "  infile \"crime.csv\" delimiter=\",\" firstobs=2;\n" +
                "  input sid  $ crime murder pctmetro pctwhite pcths poverty single;\n" +
                "run;  "       ;
        SASLexer lexer = new SASLexer(CharStreams.fromString(javaClassContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SASParser parser = new SASParser(tokens);
        ParseTree tree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();
        SasCustomListener listener= new SasCustomListener();
        walker.walk(listener,tree);

        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);

        System.out.println(tree.toStringTree(parser));

        // do something here...
    }
}

