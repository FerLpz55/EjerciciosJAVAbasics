
public class SumaNumeros {
    public static void main(String[] args) {
       
        // arreglos

        int[] miArreglo = new int[5];
        miArreglo[0] = 10;
        miArreglo[1] = 20;
        miArreglo[2] = 30;
        miArreglo[3] = 40;
        miArreglo[4] = 50;

        // ahora si quiero imprimir todos los elementos del arreglo

        System.out.println("el elemento en la posicion 2: " + miArreglo [2]);

        for (int i = 0; i < miArreglo.length; i++) {
            System.out.println("Elemento " + i + ": " + miArreglo[i]);
        }

        System.out.println("");

        // arreglo de tipo string
        String [] nombres = new String[5];

        // o podria ser asi String[] nombres = {"mairen", "juan", "lucia", "pedro"}; //
        nombres[0] = "mairen";
        nombres[1] = "juan";
        nombres[2] = "lucia";
        nombres[3] = "pedro";
        nombres[4] = "mario dom";

        // imprimimos los elementos del elemento array string
        for (int i = 0; i < nombres.length; i++){
          System.out.println("elemento" + i + ":" + nombres[i]);  
        }
        
        System.out.println("");
        
        int[] numerosNaturales = new int[3];

        numerosNaturales[0] = 50;
        numerosNaturales[1]= 20;
        numerosNaturales[2] = 30;

        for (int i = 0 ; i < numerosNaturales.length; i++ ){
            System.out.println("elemento"+i+ ":" + numerosNaturales[i]);
        }
        
        
    }
}