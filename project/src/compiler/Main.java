package compiler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.*;

public class Main {

	/*
	 * args[0] := executed program (obviously)
	 * args[1] := file to compile
	*/
	public static void main(String[] args) {
		if( args.length != 2){
			System.exit(1);
		}
		
		try {
			ANTLRFileStream filestream = new ANTLRFileStream( Arrays.deepToString(Files.readAllLines( Paths.get( args[1] ), StandardCharsets.UTF_8).toArray()));
			ToolLexer lexer = new ToolLexer(filestream);
			TokenStream tokens = new CommonTokenStream(lexer);
			ToolParser parser = new ToolParser(tokens);
			ParseTree tree = parser.start();
			
			ToolCompilationVisitor tcv = new ToolCompilationVisitor();
			String compiled = tcv.visit(tree);
			System.out.print(compiled);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
