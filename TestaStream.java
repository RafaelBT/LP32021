import java.io.*;
import java.util.*;

public class TestaStream {

   public static void main(String[] args) {

	    PrintStream arquivo;
	    int i;

	    try {
  	        arquivo = new PrintStream("números.txt");
	        for (i = 1; i <= 100; i++) {
		    arquivo.println(i);
	        }
	        Scanner entrada = new Scanner(new FileInputStream("números.txt"));

	        while (entrada.hasNextInt()) {
		    System.out.println(entrada.nextInt());
	        }
	    } catch (FileNotFoundException e)
	    {}



    }
}
