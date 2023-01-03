/*Faça um programa que calcule o fatorial de um 
número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120 */

package exercicio6;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        System.out.print(fatorial + "!=");
        for(int i = fatorial; i >= 1; i--){
            multiplicacao *= i; 
            if( i == 1) System.out.print(i);
            else System.out.print(i + ".");           
        }
        
        System.out.println("=" + multiplicacao);
    }
    
}
