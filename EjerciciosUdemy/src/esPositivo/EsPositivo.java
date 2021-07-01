
package esPositivo;

import java.util.Scanner;

public class EsPositivo {

    static double number;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pido ingrese un numero
        System.out.println("Ingresa un número, para decir si es positivo o negativo : ");
        //lo leo y asigno a la variable
        number = sc.nextDouble();
        //Si es mayor a cero es positivo, sino es negativo
        if (number > 0 ) {
            System.out.println("El número es positivo.");
        } 
        else if (number == 0 ){
            System.out.println("El número es 0 .");
        } else {
            System.out.println("El número es negativo.");
        }
    }
    
}
