
import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String t;
	    int somaCaracteres;
		
		do {
		t = entrada.nextLine();
		somaCaracteres = t.length();
		
		} while (somaCaracteres < 1 || somaCaracteres > 500);
		
		
		if (somaCaracteres <= 140) {
		    System.out.println("TWEET");
		} else {
		    System.out.println("MUTE");
		    
		} 
		
		entrada.close();
	}
}
