package edu.danielle.segundasemana;

public class MinhaClasse {
    
    public static void main(String []args){
        //System.out.print ("Olá turma, sejam bem-vindos!");

        //Variável ano pode sofrer alteração
        int ano = 2022;
        ano = 2023;

        //Variável toda maiúscula sinaliza que ela é
        //final e não pode ser alterada
        final String BR = "Brasil";

        //BR = "Brazil"; Erro

        String primeiroNome = "Danielle";
        String segundoNome = "Victória";      
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
}
    //Declarando métodos
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " +  primeiroNome.concat(" ").concat(segundoNome);
    }
}
