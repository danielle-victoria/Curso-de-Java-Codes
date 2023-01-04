/*Elabore um programa que simule uma fila de atendimento
 bancário. O programa deve ler o nome de 3 pessoas 
 (clientes do banco), armazenando-os em uma fila. */

import java.util.Scanner;
public class Desafio3 {

    public static void main(String[] args) { 
 
        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);
        
        
        for(int i = 0; i < 3; i++){
      
        nomesFila[i] = nome.next();
        }
        
        for(int i = 0; i < 3; i++){
          System.out.println(nomesFila[i] + " -" + " esta na posicao: " + (i+1));
        }
    }
}
