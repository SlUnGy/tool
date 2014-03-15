package compiler;

import org.antlr.v4.runtime.tree.ParseTree;

import generated.*;

public class ToolCompilationVisitor extends ToolBaseVisitor<String> {

	public String visit( ParseTree pAST ){
		return pAST.toStringTree();
	}
}
