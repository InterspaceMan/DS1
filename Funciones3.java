package funciones;

public class Funciones3 {

    public static void main(String[] args) {
        //Versatil. Reusable
        String salu2 = regresaSaludo2("Tilin");
        System.out.println(salu2);
        
        //Uso constante
        System.out.println(regresaSaludo2("Tilin"));
    
    }
    public static String regresaSaludo(String nombre) {
        String saludo = "";
        saludo = "Hola " + nombre + "!";
        return saludo;
    }
    public static String regresaSaludo2(String nombre){
        return "Hola " + nombre + "!";
    }
}
