/* Faça um Programa que leia um vetor de 6 números
 inteiros e mostre-os na ordem inversa. */

package exercicio1;

public class OrdemInversa {
    public static void main(String[] args) throws Exception {

        
        int[] numeros = {-5, -6, 15, 50, 8, 4};
        int count = 0;

        //System.out.println(numeros.length); // tamanho do vetor
        System.out.println("Vetor: ");
        while(count < (numeros.length)){
            System.out.print(numeros[count] + " ");
            count++;
            
        }
        
        //Ordem Inversa
        System.out.println("\nOrdem Inversa: ");
        for(int i = numeros.length-1; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
        
    }
}
