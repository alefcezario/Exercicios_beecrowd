import java.util.Scanner;

public class Errou6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int x = 0, y = 0, resultadoDigitado = 0, resultadoOperacao = 0, quantidadeR = 0;
        char op, igual;
        int[] repeticoesR = new int[c];

        for (int i = 0; i < c; i++) {
        x = scanner.nextInt();
        op = scanner.next().charAt(0);
        y = scanner.nextInt();
        igual = scanner.next().charAt(0);
        resultadoDigitado = scanner.nextInt();

        switch (op) {
            case '+':
            resultadoOperacao = x + y;
                break;
            
            case '-':
            resultadoOperacao = x - y;
                break;
             
            case 'x':
            resultadoOperacao = x * y;
                break;

            default:
                break;
        }

        if (resultadoDigitado < resultadoOperacao){
            quantidadeR = resultadoOperacao - resultadoDigitado;
        } else {
            quantidadeR = resultadoDigitado - resultadoOperacao;
        }
       
        repeticoesR[i] = quantidadeR;
        }  

        for (int i = 0; i < c; i++ ){
        System.out.print("E");
        for (int j = 0; j < repeticoesR[i]; j++) {
            System.out.print("r");
        }
        System.out.println("ou!");
        }

        scanner.close();
    }
}