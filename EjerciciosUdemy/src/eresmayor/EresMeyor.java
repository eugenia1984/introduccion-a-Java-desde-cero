
package eresmayor;

import java.util.Scanner; 
    
public class EresMeyor {
    //Declaro mi variable edad
    static int edad;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad - en numeros - : ");
        edad = sc.nextInt();
        
        if(edad < 0) { //Primero descarto que no ingreso una edad invalida - menor a 0-
            System.out.println("La edad no puede ser menor a cero :( ");
        }
        else if (edad >= 18) { //caso que sea mayor o tenga 18 - es mayor
            System.out.println("Eres mayor de edad.");
        } else { //Caso que es menor de edad, es menor de 18
            System.out.println("Eres menor de edad.");       
        }
    }
}
