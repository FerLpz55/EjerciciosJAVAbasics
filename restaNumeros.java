
import java.util.Scanner;

public class restaNumeros {
    public static void main(String[] args) {
        
        int []arregloA = new int[10];
        int []arregloB = new int[10];

        Scanner scanner = new Scanner(System.in);

        for ( int i = 0; i<10; i++){
            System.out.println("ingrese el valor arreglo a");

            arregloA [i] = scanner.nextInt();
        }

        for ( int i = 0; i<10; i++){
            System.out.println("ingrese el valor arreglo B");

            arregloB [i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int resta = arregloA[i] - arregloB[i];
            System.out.println("La resta del elemento " + (i+1) + " es: " + resta);

            if (resta > 0) {
                System.out.println("El resultado es positivo");
            } else if (resta < 0) {
                System.out.println("El resultado es negativo");
            } else {
                System.out.println("El resultado es cero");
            }
    }
 }
}