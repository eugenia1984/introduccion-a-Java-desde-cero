package sumaDosNumeros;

public class SumaDosNumeros {
    //Declaro mis variables
    static int numeroA;
    static int numeroB;
    static int resultado;
        
    public static void main(String[] args) {
        //Asigno valores a mis variables numeroA y numeroB
        numeroA = 20;
        numeroB = 25;
        //Mi variable resultado es la suma de los dos números
        resultado = numeroA + numeroB;
        //Muestro por pantalla el resultado
        System.out.println("El resultado de la suma de: " + numeroA + " y " + numeroB + " es: " + resultado);
    }
    
}
