package curso4.parte2;

public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        //Conjunção
        System.out.println("b1 && b2 " + (b1 && b2)); //false
        System.out.println("b1 && b3 " + (b1 && b3)); //true

        //Disjunção
        System.out.println("b2 || b3 " + (b2 || b3)); //true
        System.out.println("b2 || b4 " + (b2 || b4)); //false

        //Disjunção Exclusiva
        System.out.println("b1 ^ b3 " + (b1 ^ b3)); //false
        System.out.println("b4 ^ b1 " + (b4 ^ b1)); //true

        //Negação
        System.out.println(!b1); //false
        System.out.println(!b2); //true

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true)); //true
        System.out.println("(i1 > i2) || (f2 < f1)" + ((i1 > i2) || (f2 < f1))); //false


        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        //Simplificações intermediárias
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)); //false

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes)); //false

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes); //false
        System.out.println("recebeAuxilio " + recebeAuxilio);
        
    }
    
}
