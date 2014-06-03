package compilers;

import java.io.*;
import minipython.lexer.Lexer;
import minipython.parser.Parser;
import minipython.node.*;
import java.util.*;

public class ParserTest
{
  public static void main(String[] args)
  {
    try
    {
    	 System.out.println("in");
      Parser parser =
        new Parser(
        new Lexer(
        new PushbackReader(
        new FileReader(args[0].toString()), 1024)));

     SympolTable symtable =  new SympolTable();
     Start ast = parser.parse();
     ast.apply(new FirstVisitor(symtable));    
     System.out.println(args[0]);     
    ast.apply(new SecondVisitor(symtable));
    }
    catch (Exception e)
    {
      System.err.println(e);
    }
  }
}

