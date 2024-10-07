import java.util.Scanner;

class Arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[3];
        for (int i = 0; i < 3; i++) nums[i] = sc.nextDouble();

        double mul = 1, add = 0;
        for (double num : nums) {
            mul *= num;
            add += num;
        }
        double div = nums[0] / nums[1] / nums[2];

        System.out.println("Resultado de la multiplicación: " + mul);
        System.out.println("Resultado de la adición: " + add);
        System.out.println("Resultado de la división: " + div);
    }
}
