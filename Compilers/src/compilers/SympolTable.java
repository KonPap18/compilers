package compilers;

import java.util.*;

public class SympolTable{
	public Hashtable functions;//the functions of the program
	public Hashtable variables;
	public SympolTable(){
		functions =  new Hashtable();
		variables=new Hashtable();
	}
}
