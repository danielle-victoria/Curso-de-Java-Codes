public class Operadores {

    public static void main(String[] args){
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
        System.out.println(concatenacao); //Saída:13
    
    }
    
}
