
import java.util.Scanner;

public class UsuarioNumImpoPar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ingresa el numero");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("el numero es par");

        }else{
            System.out.println("el numero es impar");
        }
    }
}
