package compiler;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.*;

public class Main {

	/*
	 * args[0] := file to compile
	*/
	public static void main(String[] args) {
		String file;
		if( args.length != 1){
			 file = "EXAMPLE";
		}
		else {
			file = args[0];
		}
		
		try {
			ANTLRFileStream filestream = new ANTLRFileStream( file );
			ToolLexer lexer = new ToolLexer(filestream);
			TokenStream tokens = new CommonTokenStream(lexer);
			ToolParser parser = new ToolParser(tokens);
			ParseTree tree = parser.start();
			
			ToolCompilationVisitor tcv = new ToolCompilationVisitor(tokens);
			String compiled = tcv.visit(tree);
			String nice = makeReadable(compiled);
			System.out.print(nice);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static String makeReadable(String pWhat){
		StringBuffer buffer = new StringBuffer();
		String lines[] = pWhat.replaceAll("(?m)^[ \t]*\r?\n", "").split("\n");
		int indent = 0;
		for(String line : lines){
			if(line.contains(".end method")){
				indent -= 1;
				line += "\n";
			}
			for(int i=0; i<indent; ++i){
				line = "\t" + line;
			}
			if(line.contains(".method")){
				indent += 1;
			}
			buffer.append(line).append("\n");
		}
		return buffer.toString();
	}
	
}
