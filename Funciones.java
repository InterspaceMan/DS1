package funciones;

public class Funciones {

    public static void main(String[] args) {
        System.out.println("Funciones");
        despliegaTexto();
        despliegaNumsdel1al10();
        
        //
        int r = multiplicación(7, 5);
        System.out.println("Multi. 1: " + r);
        
        int r2 = multiplicación(3, 8);
        System.out.println("Multi. 2: " + r2);
        
        int suma = suma(r, r2);
        System.out.println("Suma de multis. es: " + suma);
    }//Cierra función Main
    
    //Funciones de ejemplo (public, private, package)
    private static void despliegaTexto(){
        System.out.println("Hola");
    }//Cierra funcion despliegaTexto
    
    static void despliegaNumsdel1al10(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);         
    }
    }//Cierra función despliegaNumsdel1al10
    public static int multiplicación(int num1, int num2){
        int resultado;
        resultado = num1 * num2;
        return resultado;        
    }
    public static int suma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    //Caso 1: Detallado
    public static boolean esPar(int numero){
        if(numero % 2 == 0){
            return true;
        }
        return false;
    }
    //Caso 2: Compacto y eficiente
    public static boolean esPar2(int numero){
        return numero % 2 == 0;      
    }
    
}//Cierra clase Funciones
