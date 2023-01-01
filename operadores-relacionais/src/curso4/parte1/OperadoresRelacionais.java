package curso4.parte1;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;


        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;


        System.out.println("i1 == i2 " + (i1 == i2)); //false
        System.out.println("i1 != i2 " + (i1 != i2)); //true
        System.out.println("i1 > i2 " + (i1 > i2)); //false
        System.out.println("i1 <= i2 " + (i1 <= i2)); //true


        System.out.println("f1 == f2 " + (f1 == f2)); //false
        System.out.println("f1 != f2 " + (f1 != f2)); //true
        System.out.println("f1 >= f2 " + (f1 >= f2)); //true
        System.out.println("f1 < f2 " + (f1 < f2)); //false

        System.out.println("c1 == c2 " + (c1 == c2)); //false
        System.out.println("c1 != c2 " + (c1 != c2)); //true
        //System.out.println("c1 >= c2" + c1 >= c2); //Erro //Comparação sem sentido
        //System.out.println("c1 < c2" + c1 < c2); //Erro //Comparação sem sentido

        System.out.println("s1 == s2 " + (s1 == s2)); //true
        System.out.println("s1 == s3 " + (s1 == s3)); //false
        System.out.println("s1 != s2 " + (s1 != s2)); //false
        //System.out.println(s1 >= s2); //Erro //Comparação sem sentido
        //System.out.println(s1 < s2); //Erro //Comparação sem sentido

        System.out.println("b1 == b2 " + (b1 == b2)); //false
        System.out.println("b1 != b2 " + (b1 != b2)); //true
        //System.out.println(b1 > b2); //Erro //Comparação sem sentido
        //System.out.println(b1 <= i1); // Erro //Comparação sem sentido

        System.out.println("i2 > f1 " + (i2 > f1)); //true
        System.out.println("d1 == h1 " + (d1 == h1)); //false
        //System.out.println(s2 != c1); //Erro //Comparação sem sentido
        //System.out.println(s3 != i1); //Erro //Comparação sem sentido

        System.out.println("l1 == l2 " + (l1 == l2)); //false
        System.out.println("l2 >= i1 " + (l2 >= i1)); //true
        System.out.println("y1 != h1 " + (y1 != h1)); //true


        
        
        
    }
    
}
