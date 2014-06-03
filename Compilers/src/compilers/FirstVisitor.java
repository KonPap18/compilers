package compilers;

import minipython.analysis.*;
import minipython.node.*;

import java.util.*;

public class FirstVisitor extends DepthFirstAdapter 
{
	private SympolTable symtable;	

	FirstVisitor(SympolTable symtable) 
	{
		this.symtable = symtable;
	}

	public void inASfuncStatement(AFunctionDeclarationFunction node) 
	{
		String fName = node.getId().toString().trim();
		int line = ((TId) node.getId()).getLine();
		int number_of_args = 0;
		LinkedList arguments = node.getArgument();
		if(arguments.size()>0){
			number_of_args += arguments.size();
			AArgument args = (AArgument) arguments.getFirst();
			LinkedList moreargs = args.getAnotherArgument();
			if(moreargs.size()>0){
				number_of_args += moreargs.size();
			}
		}
		String function_key = fName + number_of_args;
		if (symtable.functions.containsKey(function_key))
		{
			System.out.println("Line " + line + ": " +" Function " + fName +" is already defined with the same number of arguments");
		}
		else
		{	
			Functions func = new Functions();
			func.name = fName;
			func.number_of_args = number_of_args;
			symtable.functions.put(function_key, func);
			
		}
	}
}