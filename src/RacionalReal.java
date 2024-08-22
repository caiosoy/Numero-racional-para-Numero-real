import java.util.Scanner;

public class RacionalReal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numerador: ");
        int numerador = sc.nextInt();


        System.out.println("Insira o denominador: ");
        int denominador = sc.nextInt();


// irá verificar se o denominador é zero
        if (denominador == 0) {


            System.out.println("denominador não pode ser zero");
        } else {


            // realiza a divisão para obter o resultado
            double  div = (double) numerador / denominador;
            System.out.println("Resultado = " + div);
        }
        sc.close();

    }
}
