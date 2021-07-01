
package calcularSalario;

//Importo la clase Scanner
import java.util.Scanner;

public class CalcularSalario {

    //Declaro mis variables
    static int horasTrabajadas;
    static int tarifaPorHora;
    static int salario;
    
    public static void main(String[] args) {
        //Instancio Scanner para poder ller los datos ingresados
        Scanner sc= new Scanner(System.in);
        //Pido por consola que ingrese las horas trabajadas
        System.out.println("Ingrese las horas trabajadas : ");
        //Leo la informacion y asigno a la varaible horasTrabajadas
        horasTrabajadas = sc.nextInt();
        //Pido ingrese la tarifa por hora
        System.out.println("Ingrese la tarifa por hora : ");
        //Leo la informacion y la asigno a la variable horasTrabajadas
        tarifaPorHora = sc.nextInt();
        //Calculo el salario
        salario = horasTrabajadas * tarifaPorHora;
        //Muestro por pantalla el salario calculado
        System.out.println("El salario es : " + salario);
    }
    
}
