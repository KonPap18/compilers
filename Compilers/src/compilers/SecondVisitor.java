package compilers;

import minipython.analysis.*;
import minipython.node.*;
import java.util.*;
import minipython.*;

public class SecondVisitor extends DepthFirstAdapter 
{
	private SympolTable symtable;	
	private int errors = 0;
	SecondVisitor(SympolTable symtable) 
	{
		this.symtable = symtable;
	}
	
	public void outAProgramme(AProgramme node)
   {
        System.out.println("Total Errors: " + errors);
   }
    
	public void inAFunctionCall(AFunctionCallExpression node)
	{
		String fName = node.getId().toString().trim();
		int line = ((TId) node.getId()).getLine();
		int number_of_args = 0;
		LinkedList arguments = node.getArgumentsList();
		if(arguments.size()>0){
			number_of_args += arguments.size();
			AArgument args = (AArgument)arguments.getFirst();
			LinkedList moreargs = args.getAnotherArgument();
			if(moreargs.size()>0){
				number_of_args += moreargs.size();
			}
		}
		String function_key = fName + number_of_args;
		if (!symtable.functions.containsKey(function_key))
		{
			errors++;
			System.out.println("Line " + line + ": " +" Function " + fName +" is not defined");
		}
	}

}