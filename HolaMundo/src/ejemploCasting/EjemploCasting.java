package ejemploCasting;

public class EjemploCasting {

    public static void main(String[] args) {
        //Declaro una variable de tipo ENTERO denominada ALFA con valor 20
        int alfa = 20;
        //Declaro uan variable de tipo FLOAT denominada BETA con valor 23.5
        float beta= 23.5F;
        //Quiero poner en BETA lo que contenga ALFA
        beta = alfa;
        //Paso FLOAT a INT, porque sino no entra por su espacio de memoria
        alfa = (int) beta;
        //Paso de INT a CHAR
        alfa = (char) 'b'; 
        
        char caraceter = (char) alfa;
    } 
    
}
