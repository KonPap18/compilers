package compilers;


import java.io.FileReader;
import java.io.PushbackReader;

import org.sablecc.sablecc.lexer.Lexer;
import org.sablecc.sablecc.node.Token;

public class LexerTest1
{
  public static void main(String[] args)
  {
    try
    {
      Lexer lexer =
        new Lexer(
        new PushbackReader(
        new FileReader(args[0].toString()), 1024));

      Token token = lexer.next();
      while ( ! token.getText().equals("") )
      { 
        System.out.print(token);
        token = lexer.next(); 
      }
    }
    catch (Exception e)
    {
      System.err.println(e);
    }
  }
}
