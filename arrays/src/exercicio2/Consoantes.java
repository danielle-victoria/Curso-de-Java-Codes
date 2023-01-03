/*Faça um Programa que leia um vetor de 6 caracteres,
 e diga quantas consoantes foram lidas. Imprima as consoantes. */

package exercicio2;
import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;


        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if(! (letra.equalsIgnoreCase("a") ||
               letra.equalsIgnoreCase("e") ||
               letra.equalsIgnoreCase("i") ||
               letra.equalsIgnoreCase("o") ||
               letra.equalsIgnoreCase("u"))){
                
                
                consoantes[count] = letra;
                quantidadeConsoantes++;

               }

               count++;

        }while(count < consoantes.length);

        System.out.print("Consoantes: ");
        //Para cada elemento dentro do array consoantes, imprima esse elemento
        for(String consoante: consoantes){ //for-each
            if(consoante != null)
                System.out.print(consoante + " ");

        }

        System.out.println("\nQuantidade de consoantes lidas: " + quantidadeConsoantes);
    }
    
}
