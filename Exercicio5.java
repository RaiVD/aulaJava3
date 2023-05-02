
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);

        int numero=0;
        int X = 0;

        for (int i = 1; i<=5; i++){
            System.out.println("Digite o " + i + "numero:");
            numero= lerNumero.nextInt();

            if (numero>=0 & numero<=100){
                X= X+1;

            }

            System.out.println("-------------------");
            System.out.println("Foi digitado" + X + "entre 0 e 100");
        }


    }


}
