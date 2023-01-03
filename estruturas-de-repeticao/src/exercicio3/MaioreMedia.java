/* Faça um programa que leia 5 números e informe 
o maior número e a média desses números. */

package exercicio3;
import java.util.Scanner;

public class MaioreMedia {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        double media = 0d;


        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma += numero;

            if(numero > maior)
                maior = numero;
                
            count += 1;

        } while(count < 5);

        media = soma / count;

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + media);

        
    }
    
}
