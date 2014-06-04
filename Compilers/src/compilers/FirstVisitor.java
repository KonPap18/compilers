package compilers;

import minipython.analysis.*;
import minipython.node.*;

import java.util.*;

public class FirstVisitor extends DepthFirstAdapter 
{
	private int errors=0;
	private SympolTable symtable;
	private LinkedList<AAnotherArgument> moreargs;	
	private HashMap allocatedargs=new HashMap();

	FirstVisitor(SympolTable symtable) 
	{
		this.symtable = symtable;
	}
	
	public void outAProgramme(AProgramme node)
	   {
	        System.out.println("Total Errors: " + errors);
	   }
		@Override
		public void inAArgumentAllocation(AArgumentAllocation node){
			
		}
		
	    @Override
		public void inAFunctionCallStatement(AFunctionCallStatement node)
		{
			String fName = node.getId().toString().trim();
			int line = ((TId) node.getId()).getLine();
			int number_of_args = 0;
			
			LinkedList arguments = node.getArgumentsList();
			if(arguments.size()>0){
				number_of_args += arguments.size();
				AArgumentsList arg=(AArgumentsList) arguments.getFirst();
				LinkedList moreargs = arg.getAnotherExpression();
				if(moreargs.size()>0){
					number_of_args += moreargs.size();
				}
			}
			String function_key = fName + number_of_args;
			System.out.println(allocatedargs.get(fName));
			
			if (allocatedargs.get(fName)!=null) {
				if (!((int)(allocatedargs.get(fName))<=number_of_args)) {
					if (!symtable.functions.containsKey(function_key)) {
						errors++;
						System.out.println("Line " + line + ": " +" Function " + fName +" is not defined");
					}
				}
			}
		}
			
	
	@Override
	public void inAFunctionDeclarationFunction(AFunctionDeclarationFunction node) 
	{
		int allocated=0;
		
		String fName = node.getId().toString().trim();
		int line = ((TId) node.getId()).getLine();
		int number_of_args = 0;
		LinkedList arguments = node.getArgument();
		if(arguments.size()>0){
			number_of_args += arguments.size();
			AArgument args = (AArgument) arguments.getFirst();
			moreargs = args.getAnotherArgument();
			if(!symtable.variables.containsKey(args.getId().toString().trim())){
				
				if(!args.getArgumentAllocation().isEmpty()){
					allocated++;
				}
				Variable v=new Variable();
				v.name=args.getId().toString().trim();
				symtable.variables.put(v.name, v);
			}		
			
			if(moreargs.size()>0){
				number_of_args += moreargs.size();
				for(int i=0; i<moreargs.size();i++){
					
					String id=moreargs.get(i).getId().toString().trim();
					if(!moreargs.get(i).getArgumentAllocation().isEmpty()){
						allocated++;
					}
					if(!symtable.variables.containsKey(id)){
						Variable v=new Variable();
						v.name=id;
						symtable.variables.put(v.name, v);
					}		
				}
			}
			
		}
		Function func = new Function();
		func.name = fName;
		func.number_of_args = number_of_args;
		String function_key = fName + number_of_args;
		if (symtable.functions.containsKey(function_key))
		{
			System.out.println("Line " + line + ": " +" Function " + fName +" is already defined with the same number of arguments");
			errors++;
		}else{	
			
			symtable.functions.put(function_key, func);
			
		}
		System.out.println(func.number_of_args-allocated);
		System.out.println(func.name);
		allocatedargs.put(func.name, (func.number_of_args-allocated));
	}
	public void inAAllocation1Statement(AAllocation1Statement node) {
		String fName = node.getId().toString().trim();
		int line = ((TId) node.getId()).getLine();
		if (!symtable.variables.containsKey(fName)) {
			Variable var = new Variable();
			var.name = fName;
			symtable.variables.put(fName,var);
		}
	}
	
	public void inAIdentifierExpression(AIdentifierExpression node) {
		String fName = node.getId().toString().trim();
		int line = ((TId) node.getId()).getLine();
		if (!symtable.variables.containsKey(fName)) {
			errors++;
			System.out.println("Line " + line + ": " +" Variable " + fName +" is not defined");
		}
	}
}
