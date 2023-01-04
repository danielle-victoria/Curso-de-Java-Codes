/* Calcule as 4 operações básicas: soma, subtração, multiplicação
 * e divisão. Sempre 2 valores devem ser passados.
 */

package parte1;


public class Calculadora {

    //visibilidade = public
    //Modificador = static
    //Retorno = void
    //Nome = soma
    //Parâmetros = double numero1, double numero2
    public static void soma(double numero1, double numero2){
        
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " + " +
                            numero2 + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2){

        double resultado = numero1 - numero2;
        System.out.println("A subtração de " + numero1 + " - " +
                            numero2 + " = " + resultado);

    }

    public static void multiplicacao(double numero1, double numero2){
        
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação " + numero1 + " * "+
                            numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2){

        double resultado = numero1 / numero2;
        System.out.println("A divisão " + numero1 + " / " +
                            numero2 + " = " + resultado);

    }
    
}
