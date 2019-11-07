import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Properties;

public class start {
    public static void main(String[] args) {
        // Reading the File path
        // Reading the File
        String javaClassContent = "";
        Properties prop = new Properties();
            try (InputStream input = new FileInputStream("C:\\temp\\config.properties"))
            {
                  // load a properties file
                prop.load(input);

        javaClassContent = new String ( Files.readAllBytes( Paths.get(prop.getProperty("filePath")) ) );
        System.out.println(javaClassContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        SASLexer lexer = new SASLexer(CharStreams.fromString(javaClassContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SASParser parser = new SASParser(tokens);
        ParseTree tree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();
        SasCustomListener listener= new SasCustomListener();
        listener.uri = new MongoClientURI(prop.getProperty("mongouri"));
        listener.mongos = new MongoClient(listener.uri);
        listener.database =listener.mongos.getDatabase(prop.getProperty("mongodatabase"));
        listener.collection =listener.mongos.getDatabase(prop.getProperty("mongodatabase")).getCollection(prop.getProperty("mongocollection"));
        walker.walk(listener,tree);
        System.out.println(tree.toStringTree(parser));

        // do something here...
    }
}

