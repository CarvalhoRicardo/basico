public class Ternario {
    public static void main(String[] args) {

    int a = 6;
    int b = 7;

        String resultado = a==b ?"Verdadeiro" : "Falso";

            System.out.println("A é igual a B? " + resultado);

        String resultado1 = a>=b ?"Verdadeiro" : "Falso";
        
            System.out.println("A é igual ou maior que B? " + resultado1);

        String resultado2 = a<=b ?"Verdadeiro" : "Falso";

            System.out.println("A é menor ou igual a B? " + resultado2);

        String resultado3 = a!=b ?"Verdadeiro" : "Falso";

            System.out.println("A é diferente de B? " + resultado3);

        String resultado4 = a>b ?"Verdadeiro" : "Falso";
        
            System.out.println("A é maior que B? " + resultado4);

        String resultado5 = a<b ?"Verdadeiro" : "Falso";

            System.out.println("A é menor que B? " + resultado5);
     }
    
}
