/*O gerente de uma loja resolveu aplicar descontos em todos os 
seus produtos! A tarefa é calcular a Porcentagem de Desconto 
aplicada a esses produtos.  */

import java.util.*;
public class Desafio4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
            
        double M = input.nextDouble();
        double D = input.nextDouble();
        
        double desconto = 100 - ((D/M)*100);
        
        
        System.out.println("O desconto foi de " + (int)desconto + "%");
        
        //TODO:  Retorne o percentual de desconto que foi aplicado no produto
          
       
      
    }
    
}
