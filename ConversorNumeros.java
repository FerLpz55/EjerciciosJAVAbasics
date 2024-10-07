import java.util.Scanner;

public class ConversorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número para convertir:");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println("Número en inglés: " + numeroEnIngles(numero));
        System.out.println("Número en romano: " + numeroEnRomano(numero));
        System.out.println("Número en árabe: " + numeroEnArabe(numero));

        System.out.println("Primeros 200 números primos:");
        mostrarPrimeros200Primos();
    }

    public static String numeroEnIngles(int numero) {
        if (numero < 10) {
            switch (numero) {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
                default:
                    return "";
            }
        } else if (numero < 20) {
            switch (numero) {
                case 10:
                    return "ten";
                case 11:
                    return "eleven";
                case 12:
                    return "twelve";
                case 13:
                    return "thirteen";
                case 14:
                    return "fourteen";
                case 15:
                    return "fifteen";
                case 16:
                    return "sixteen";
                case 17:
                    return "seventeen";
                case 18:
                    return "eighteen";
                case 19:
                    return "nineteen";
                default:
                    return "";
            }
        } else if (numero < 100) {
            int decena = numero / 10;
            int unidad = numero % 10;
            switch (decena) {
                case 2:
                    return "twenty" + (unidad != 0 ? " " + numeroEnIngles(unidad) : "");
                case 3:
                    return "thirty" + (unidad != 0 ? " " + numeroEnIngles(unidad) : "");
                case 4:
                    return "forty" + (unidad != 0 ? " " + numeroEnIngles(unidad) : "");
                case 5:
                    return "fifty" + (unidad != 0 ? " " + numeroEnIngles(unidad) : "");
                case 6:
                    return "sixty" + (unidad != 0 ? " " + numeroEnIngles(unidad) : "");
                case 7:
                    return "seventy" + (unidad != 0 ? " " + numeroEnIngles(unidad) : "");
                case 8:
                    return "eighty" + (unidad != 0 ? " " + numeroEnIngles(unidad) : "");
                case 9:
                    return "ninety" + (unidad != 0 ? " " + numeroEnIngles(unidad) : "");
                default:
                    return "";
            }
        } else {
            return "Número no soportado";
        }
    }

    public static String numeroEnRomano(int numero) {
        StringBuilder resultado = new StringBuilder();
        while (numero >= 1000) {
            resultado.append("M");
            numero -= 1000;
        }
        while (numero >= 900) {
            resultado.append("CM");
            numero -= 900;
        }
        while (numero >= 500) {
            resultado.append("D");
            numero -= 500;
        }
        while (numero >= 400) {
            resultado.append("CD");
            numero -= 400;
        }
        while (numero >= 100) {
            resultado.append("C");
            numero -= 100;
        }
        while (numero >= 90) {
            resultado.append("XC");
            numero -= 90;
        }
        while (numero >= 50) {
            resultado.append("L");
            numero -= 50;
        }
        while (numero >= 40) {
            resultado.append("XL");
            numero -= 40;
        }
        while (numero >= 10) {
            resultado.append("X");
            numero -= 10;
        }
        while (numero >= 9) {
            resultado.append("IX");
            numero -= 9;
        }
        while (numero >= 5) {
            resultado.append("V");
            numero -= 5;
        }
        while (numero >= 4) {
            resultado.append("IV");
            numero -= 4;
        }
        while (numero >= 1) {
            resultado.append("I ");
            numero -= 1;
        }
        return resultado.toString();
    }

    public static String numeroEnArabe(int numero) {
        String arabicDigits = "٠١٢٣٤٥٦٧٨٩";
        String decimalDigits = "0123456789";
        String numeroStr = String.valueOf(numero);
        StringBuilder arabicStr = new StringBuilder();

        for (char c : numeroStr.toCharArray()) {
            int index = decimalDigits.indexOf(c);
            if (index != -1) {
                arabicStr.append(arabicDigits.charAt(index));
            }
        }

        return arabicStr.toString();
    }

    public static void mostrarPrimeros200Primos() {
        int contador = 0;
        int numero = 2;
        while (contador < 200) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}