package cuadradoDeUnNumero;
//Importo mi clase Scanner para poder leer los valore singresados y asignarlos a variables
import java.util.Scanner; 

public class CuadradoDeUnNumero {
    //declaro mis variables
    static double numero;
    static double cuadrado;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número, para calcular su cuadrado : ");
        //Asigno el numero ingresado a mo variables
        numero= sc.nextDouble();
        //Calculo el cuadrado y redondeo a dos decimales
        cuadrado = Math.round( (numero * numero) * 100.0)/100.0;
        //Muestro el resultado
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
    }
    
}
