import java.util.Scanner;


public class Questao1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n, xDigitado;


    do {
        n = scanner.nextInt();
        } while (n < 1 || n > 100);


    int[] x = new int[n];


    for (int i = 0 ; i < n; i++) {
        do {
            xDigitado = scanner.nextInt();
        } while (xDigitado < 1 || xDigitado > 10000000);
        x[i] = xDigitado;
        }  

    for (int i = 0; i < n; i++ ){
        if (verificaPrimo(x[i])) {
            System.out.println(x[i] + " eh primo");

        } else {
            System.out.println(x[i] + " nao eh primo");

        }

}
    scanner.close();
}

public static boolean verificaPrimo(int numero){
    if (numero <= 1) {
        return false;
    }
    if (numero <= 3) {
        return true;
    }
    if (numero % 2 == 0 || numero % 3 == 0) {
        return false;
    }

    for (int i = 5; i * i <= numero; i += 6) {
        if (numero % i == 0 || numero % (i + 2) == 0) {
            return false;
        }
    }
    return true;


}


}