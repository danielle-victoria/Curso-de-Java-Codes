//pacote criado automaticamente - dentro de src criar pasta edu, dá enter, 
//cria pasta danielle, dá enter, cria pasta primeirasemana e move 
//o arquivo .java para primeira semana
package edu.danielle.primeirasemana;  
public class BoletimEstudantil {
    public static void main (String[] args){


        //Sem indentação
        /*int mediaFinal = 6;
        if(mediaFinal<6)	
        System.out.println("REPROVADO"); 
        else if(mediaFinal==6)
        System.out.println("PROVA MINERVA"); 
        else
        System.out.println("APROVADO"); */

        //Com indentação
        int mediaFinal = 7;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO"); 

    }
}
