package ForTests;
import java.util.Scanner;

public class Media {

    public static void CalculadoraMedia(){

        // A calculadora irá receber 5 valores do usuário e tirar uma média disso.
        double totalvalue = 0;
        double media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números a serem inseridos: ");
        int cont = sc.nextInt();


        for (int i = 1; i <= cont; i++) {
            System.out.println("Digite um valor: ");
            double value = sc.nextDouble();
            totalvalue += value;
        }
        media = totalvalue / cont;
        System.out.println(media);
    }





}
