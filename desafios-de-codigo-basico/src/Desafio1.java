/*Faça um programa que peça para 3 pessoas a sua idade, ao final
 o programa deverá verificar se a média de idade da turma varia 
 entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma 
 é jovem, adulta ou idosa, conforme a média calculada. */

import java.util.Scanner;
public class Desafio1 {
    public static void main(String[] args) throws Exception {
        
      

        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();
        
        double media;
        
        media = (idade1 + idade2 + idade3) / 3;
        System.out.println(media);
        
        
        if(media >= 0 && media <= 25){
          System.out.println("Jovem!");
        }else if(media > 25 && media <= 60){
          System.out.println("Adulta!");
        }else{
          System.out.println("Idosa!");
    }
    }
}
