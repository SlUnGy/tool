package tool_project;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;

public class Main {

	public static void main(String[] args) {
		if( args.length != 2){
			System.exit(1);
		}
		
		try {
			ANTLRFileStream filestream = new ANTLRFileStream( 
										Arrays.deepToString(Files.readAllLines( Paths.get( args[1] ), StandardCharsets.UTF_8).toArray()));
			toolLexer lexer = new toolLexer(filestream);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
