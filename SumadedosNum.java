
import java.util.Scanner;

public class SumadedosNum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("ingresa el primer num");
        int num1 = sc.nextInt();

        System.out.println("ingresa el segundo num");
        int num2 = sc.nextInt();

        int suma = num1 + num2;

        System.out.println("la suma es :"  + suma);

    }

}
