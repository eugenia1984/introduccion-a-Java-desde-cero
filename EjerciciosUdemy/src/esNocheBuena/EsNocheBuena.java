
package esNocheBuena;

import java.util.Scanner;

public class EsNocheBuena {

    //declaro variables
    static int dia;
    static String mes;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el día de hoy - en numeros - : ");
        //leo el dia y lo asigno a la variable dia
        dia = sc.nextInt();
       
        System.out.println("Ingrese el mes - en letras - : ");
        //leo le mes y lo asigno a la variable mes
        mes = sc.next().toLowerCase();
        //condicion con operador logico Y, deben cumplirse ambas
        if ( dia == 24 && mes == "diciembre") {
            System.out.println("Hoy es Noche Buena.");
        } else {
            System.out.println("Hoy no es Noche Buena.");
        }
    }
    
}
