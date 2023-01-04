import parte1.Calculadora;
import parte1.Emprestimo;
import parte1.Mensagem;
import parte2.Quadrilatero;
import parte3.QuadrilateroRetorno;

public class Main {

    public static void main(String[] args) {
        
        //Exercícios da Aula 1 sobre métodos - Criação
        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("\nExercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("\nExercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);



        //Exercício da Aula 2 sobre métodos - Sobrecarga
        //Quadrilátero
        System.out.println("\nExercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);


        //Exercício da Aula 3 sobre métodos - Retornos
        System.out.println("\nExercício retornos");
        double areaQuadrado = QuadrilateroRetorno.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroRetorno.area(5, 5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio =   QuadrilateroRetorno.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
    
}
