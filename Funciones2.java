package funciones;

public class Funciones2 {
    public static void main(String[] args){
        int resultadosumadel1al10 = devuelva1al10();
        System.out.println(resultadosumadel1al10);
        
    }//Cierra main
    
    public static int devuelva1al10(){
        int numero = 0;
        for (int i = 0; i <= 10; i++) {
            numero = numero + i;   
        }
        return numero;
    }//Cierra funcion devuelva1al10
    
}
