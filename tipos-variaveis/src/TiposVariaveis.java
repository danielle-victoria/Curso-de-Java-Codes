public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        double salarioMinimo = 2500.33;  
        float pi = 3.14F;  //sempre colocar o F no fim para a variável ser entendida como float e não double
        long cpf = 98765432109L; //tipo long precisa ser encerrado com um "L" no final
    
        //Java é fortemente tipado.

        //Exemplo
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal; //Erro
        short numeroCurto2 = (short) numeroNormal; //Solução para o problema acima
        String meuNome = "Danielle"; 

       
       
       
       
        //Variáveis x Constantes

        //Variável - Exemplo

        int numero = 5;
        numero  = 10;

        System.out.println(numero);

        
        //Definição de um valor que nunca irá mudar - Constante
        //Exemplo
        /*double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 10.75;*/ //Ação permitida, pois a variável estando apenas em caixa alta não significa que ela é uma constante

        final double VALOR_DE_PI = 3.14; //declaração de uma constante -> Usar "final" e o nome da variável precisa está em caixa alta
        //VALOR_DE_PI = 10.75;  //Erro -> Ação não permitida, pois a variável é imutável

    }   
}
