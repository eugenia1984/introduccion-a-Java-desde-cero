package variables;

public class Variables {

    public static void main(String[] args) {
        // Dato: BOOLEAN: true , false
        //declaro una variable y la inicializo
        // es mejor inciializar con valor por defecto
        boolean valorLogico = false; 
        //Para mostrarla por consola
        System.out.println("Variable valor logico: " + valorLogico);
        //declaro una variable sin inicializar
        boolean valorLogico2; 
        //Se usan para programar con banderas
        //Para saber si pasamos por una parte del codigo
        
        //Dato CHAR: guardo un unico caracter
        char valorCaracter = 'A';
        //Concetanecion de cadena y varaible
        System.out.println("Variable valorCaracter: " + valorCaracter);
        
        //Dato STRING
        String cadena = "Hola Mundo";
        System.out.println("Variable cadena: " + cadena );
        //inicializo una string vacia con comillas dobles
        String cadenaVacia = "";
        //Puedo inciializar una String vacia con NULL
        String cadenaVaciaDos= null;
        
        //Dato ENTERO: BYTE; SHORT; INT; LONG
        
        byte numeroUno = 0;
        short numeroDos = 0;
        int numeroTres = 0;
        //LONG,  siempre con l o L, sino el compilador lo pone como int
        long numeroCuatro = 0L; 
        
        //Real: FLOAT, al final siempre f o F
        float numeroCinco = 0.0F;
        
        //real: DOUBLE
        double numeroSeis = 0.0;
        
        //CONSTANTES
        final int VALOR = 0;
        
        //paso de CADENA a ENTERO
        int numero = Integer.parseInt("10");  
        //paso de ENTERO a CADENA
        String cadenas = Integer.toString(10);  
        
    } 
    
}
