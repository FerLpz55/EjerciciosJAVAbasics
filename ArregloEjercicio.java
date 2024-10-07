import java.util.Scanner;

public class ArregloEjercicio {
    public static void main(String[] args) {
        // Declarar arreglos para nombre completo, edad y número de teléfono
        String[] nombres = new String[15];
        int[] edades = new int[15];
        String[] telefonos = new String[15];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer los 15 nombres, edades y números de teléfono
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el nombre completo del invitado " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese la edad del invitado " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Ingrese el número de teléfono del invitado " + (i + 1) + ": ");
            telefonos[i] = scanner.nextLine();
        }

        // Imprimir invitaciones
        for (int i = 0; i < 15; i++) {
            System.out.println("Invitación para " + nombres[i]);
            System.out.println("Edad: " + edades[i]);
            System.out.println("Teléfono: " + telefonos[i]);

            if (edades[i] < 18) {
                System.out.println("Debe ir acompañado.");
            }

            System.out.println(); // Salto de línea para separar invitaciones
        }
    }
}