public class Operadores {

    public static void main(String[] args){
        /*Aula 1 de Operadores
        //Ocorre uma concatenação
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);  //Saída: LINGUAGEMJAVA
    
        String concatenacao ="?";  
        System.out.println(concatenacao); //Saída: ?

        concatenacao = 1+1+1+"1"; 
        System.out.println(concatenacao); //Saída: 31

        concatenacao = 1+"1"+1+1; 
        System.out.println(concatenacao); //Saída: 1111

        concatenacao = 1+"1"+1+"1"; 
        System.out.println(concatenacao); //Saída:1111

        concatenacao = "1"+1+1+1; 
        System.out.println(concatenacao); //Saída:1111

        concatenacao = "1"+(1+1+1); 
        System.out.println(concatenacao); //Saída:13*/




        /*Aula 2 de Operadores

        int numero = 5;
        System.out.println(-numero); //-5
        System.out.println(numero); //5

        //Declarando um número negativo

        numero = - numero;
        System.out.println(numero); //-5

        //Deixando um número positivo novamente

        //numero = + numero; //Errado numero = -5
        numero = numero * -1; // Resolve o problema acima
        System.out.println(numero);*/


        
        
        /*Aula 3 de Operadores

        int numero = 5;

        //Incremento

        //x repetição
        numero = numero + 2;

        System.out.println(numero);

        //somar sempre 1

        numero++; //numero = numero + 1;

        System.out.println(numero);


        System.out.println(numero++); //8
        System.out.println(numero); //9
        System.out.println(++numero); //10


        //Decremento 
        System.out.println(numero--); //10
        System.out.println(numero); //9
        System.out.println(--numero); //8



        //Booleanos

        boolean variavel = true;
        System.out.println(!variavel); // ! -> negação da variavel //false
        System.out.println(variavel); //true

        variavel = !variavel;
        System.out.println(variavel); //false */




        //Aula 4 de Operadores
        
        //int a, b;

        //a = 5;
        //a = 6;
        //b = 6;

        //String resultado = "";

        /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso"; */
        
        
        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        //String resultado = (a==b) ? "verdadeiro" : "false";

        //System.out.println(resultado); // verdadeiro 

        //int resultado = (a==b) ? 1 : 0;
        //System.out.println(resultado); // 1 




        /*Aula 5 de Operadores

        //Operadores Relacionais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("NúmeroUm é igual a NúmeroDois ? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("NúmeroUm é igual a NúmeroDois ? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("NúmeroUm é maior que NúmeroDois ? " + simNao);

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira.");
        }


        String nomeUm = "DANIELLE";
        String nomeDois = "DANIELLE";

        System.out.println(nomeUm == nomeDois);

        String nomeTres = new String("DANIELLE");
        //System.out.println(nomeTres == nomeDois); //Forma errada de comparar um objeto
        System.out.println(nomeTres.equals(nomeDois)); //Forma certa de comparar um objeto -> método equals*/





        //Aula 6 de Operadores

        //Operadores Lógicos

        boolean condicao1=true;

        //boolean condicao2=false;

        boolean condicao2=true;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
            System.out.println("fim");


        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeiras");
        }
            System.out.println("fim");


        if (condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");

        }

    
    }
    
}
