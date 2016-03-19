package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import compilador.lexer.Lexer;
import compilador.lexer.LexerException;
import compilador.node.*;
import compilador.parser.Parser;
import compilador.parser.ParserException;

import java.io.* ; 
  
public class Main { 
	public void AnaliseLexica(String arquivo, Lexer lexer)
			throws IOException {
		

		Token token = null;
		boolean flag = false;
		do {
			try {
				while (!((token = lexer.next()) instanceof EOF)) {
					if (!(token instanceof TBlank)) {
						System.out.print(token.getClass().getSimpleName());
					} else {
						System.out.print(token.getText());
					}
				}
				flag = true;
			} catch(LexerException e) {
				System.out.print(e.getMessage().substring(0, e.getMessage().length() - 1) + " ");
			}
		} while(!(flag));
	
	}
	public static void main (String[] args) throws LexerException, IOException, ParserException{
		//String arquivo = "/src/tester.sa";
		Lexer lexer = new Lexer (new PushbackReader( 
	               new FileReader(args[0]), 1024)); 
		Main main = new Main();
		
		//main.AnaliseLexica(args[0], lexer);
		
		Parser p = new Parser(lexer);
		Start ast = p.parse();
        System.out.println("Análise sintática bem sucedida !");
	}
}