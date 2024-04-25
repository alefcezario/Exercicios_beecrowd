import java.util.ArrayList;
import java.util.Scanner;

public class bitsTrocados5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> entradas = new ArrayList<Integer>();
        int v;

        do {
        v = scanner.nextInt();
        if (v == 0) {
            break; 
        }
        if (v > 0 && v <= 10000) {
        entradas.add(v);
        }
        } while (v > 0 && v <= 10000);

        for (int i = 0; i < entradas.size(); i++ ){
            int valor = entradas.get(i);
            System.out.println("Teste " + (i+1));

            int cedulas50 = valor / 50;
            valor %= 50;

            int cedulas10 = valor / 10;
            valor %= 10; 

            int cedulas5 = valor / 5;
            valor %= 5; 

            int cedulas1 = valor; 

            System.out.println(cedulas50 + " " + cedulas10 + " " + cedulas5 + " " + cedulas1 + "\n");

        }


        scanner.close();
    }
}