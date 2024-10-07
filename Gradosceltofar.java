
import java.util.Scanner;

public class Gradosceltofar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celsius: ");

        double celsius = sc.nextDouble();
    
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados");

        System.out.println( "*** hasta luego ***");

    }
}
