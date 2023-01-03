/*Faça um Programa que leia 20 números inteiros aleatórios 
(entre 0 e 100) armazene-os num vetor. Ao final, mostre os
 números e seus sucessores. */

package exercicio3;
import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        
        //Classe para gerar números aleatórios
        Random random = new Random(); 

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < (numerosAleatorios.length-1); i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        //for-each -> Recomendado para imprimir os dados
        for(int numero: numerosAleatorios){
            System.out.print(numero + " ");
        }


        System.out.print("\nSucessores dos Números Aleatórios: ");
        //for-each -> Recomendado para imprimir os dados
        for(int numero: numerosAleatorios){
            System.out.print((numero + 1) + " ");
        }
    }
    
}
