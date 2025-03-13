
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int number1 = sc.nextInt();

        System.out.println("Digite segundo numero: ");
        int number2 = sc.nextInt();

        try{
            contar(number1, number2);
        }catch (ParametrosInvalidosException e ){
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }
    }


    static void contar(int number1, int number2 ) throws  ParametrosInvalidosException {

        if (number1 >= number2 ){
            throw new ParametrosInvalidosException(" O segundo numero tem que ser maior que o primeiro");
        }

        int contagem = number2 - number1;
        for (int number = 1; number <= contagem; number++){
            System.out.println("Imprimindo o número: " + number);
        }


    }


}

