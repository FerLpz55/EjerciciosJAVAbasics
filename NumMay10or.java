
import java.util.Scanner;

// Clase principal para encontrar el número mayor y menor entre tres números ingresados por el usuario
public class NumMay10or {
    // Método principal de la clase, donde se ejecuta el programa
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese tres números enteros
        System.out.println("Ingrese tres números enteros");
        int[] numeros = new int[3]; // Declarar un arreglo de enteros de tamaño 3
        for (int i = 0; i < 3; i++) { // Ciclo para leer los tres números
            System.out.print("Ingrese el número " + (i + 1) + ": "); // Imprimir mensaje para cada número
            numeros[i] = sc.nextInt(); // Leer el número ingresado por el usuario
        }

        // Encontrar el número mayor y menor utilizando un ciclo
        int mayor = numeros[0]; // Inicializar el número mayor con el primer elemento
        int menor = numeros[0]; // Inicializar el número menor con el primer elemento
        for (int i = 1; i < 3; i++) { // Ciclo para comparar los números
            if (numeros[i] > mayor) { // Verificar si el número actual es mayor que el actual mayor
                mayor = numeros[i]; // Actualizar el número mayor
            }
            if (numeros[i] < menor) { // Verificar si el número actual es menor que el actual menor
                menor = numeros[i]; // Actualizar el número menor
            }
        }

        // Mostrar el resultado al usuario
        System.out.println("El número mayor es " + mayor); // Imprimir el número mayor
        System.out.println("El número menor es " + menor); // Imprimir el número menor
        System.out.println("La suma de los números es " + (numeros[0] + numeros[1] + numeros[2])); 
        System.out.println("El promedio de los números es " + ((numeros[0] + numeros[1] + numeros[2]) / 3.0));
        
    }
}


