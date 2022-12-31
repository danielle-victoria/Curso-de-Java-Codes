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


    }
}
