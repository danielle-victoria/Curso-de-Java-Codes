/*Faça um programa que peça N números inteiros. 
Calcule e mostre a quantidade de números pares e
a quantidade de números impares. */


package exercicio4;
import java.util.Scanner;

public class ParImpar {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int count = 0;
        int quantidadePares = 0, quantidadeImpares = 0;


        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;

            if(numero % 2 == 0){ //Verifica se o número é par
                quantidadePares++;
            }else{
                quantidadeImpares++;
            }

        }while(count < quantidadeNumeros);

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);


    }
    
}
