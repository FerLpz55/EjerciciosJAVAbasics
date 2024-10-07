import java.util.Scanner;

public class calculadoranumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú principal:");
            System.out.println("1. Múltiplos");
            System.out.println("2. Impares");
            System.out.println("3. Fibonacci");
            System.out.println("4. Factorial");
            System.out.println("5. A Español");
            System.out.println("6. A Romanos");
            System.out.println("7. A Inglés");
            System.out.println("8. Primos");
            System.out.println("9. Pares");
            System.out.println("10. Salir");
            System.out.print("Ingrese una opción (1-10): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entre 1 y 20: ");
                    int numeroMultiplo = scanner.nextInt();
                    int sumaMultiplo = 0;
                    System.out.println("Los múltiplos de " + numeroMultiplo + " hasta 200 son: ");
                    for (int i = numeroMultiplo; i <= 200; i += numeroMultiplo) {
                        System.out.print(i + " ");
                        sumaMultiplo += i;
                    }
                    System.out.println("\nLa suma de los múltiplos de " + numeroMultiplo + " hasta 200 es: " + sumaMultiplo);
                    break;
                case 2:
                    int sumaImpar = 0;
                    System.out.println("Los números impares del 1 al 199 son: ");
                    for (int i = 1; i <= 199; i += 2) {
                        System.out.print(i + " ");
                        sumaImpar += i;
                    }
                    System.out.println("\nLa suma de los números impares del 1 al 199 es: " + sumaImpar);
                    break;
                case 3:
                    int a = 0, b = 1;
                    System.out.print("La secuencia de Fibonacci es: ");
                    for (int i = 0; i < 15; i++) {
                        System.out.print(a + " ");
                        int suma = a + b;
                        a = b;
                        b = suma;
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Ingrese un número no negativo: ");
                    int numeroFactorial = scanner.nextInt();
                    long factorial = 1;
                    System.out.println("El factorial de " + numeroFactorial + " es: ");
                    for (int i = 1; i <= numeroFactorial; i++) {
                        factorial *= i;
                        System.out.print(i + " * ");
                    }
                    System.out.println("= " + factorial);
                    break;
                case 5:
                    System.out.print("Ingrese un número entre 1 y 9999: ");
                    int numeroEspanol = scanner.nextInt();
                    String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
                    String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
                    String[] centenas = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
                    String textoEspanol = "";
                    if (numeroEspanol < 10) {
                        textoEspanol = unidades[numeroEspanol];
                    } else if (numeroEspanol < 100) {
                        textoEspanol = decenas[numeroEspanol / 10];
                        if (numeroEspanol % 10 != 0) {
                            textoEspanol += " y " + unidades[numeroEspanol % 10];
                        }
                    } else if (numeroEspanol < 1000) {
                        textoEspanol = centenas[numeroEspanol / 100];
                        if (numeroEspanol % 100 != 0) {
                            textoEspanol += " ";
                            if (numeroEspanol % 100 < 10) {
                                textoEspanol += unidades[numeroEspanol % 100];
                            } else if (numeroEspanol % 100 < 100) {
                                textoEspanol += decenas[(numeroEspanol % 100) / 10];
                                if (numeroEspanol % 10 != 0) {
                                    textoEspanol += " y " + unidades[numeroEspanol % 10];
                                }
                            }
                        }
                    }
                    System.out.println("El número " + numeroEspanol + " en español es: " + textoEspanol);
                    break;
                case 6:
                    System.out.print("Ingrese un número entre 1 y 3999: ");
                    int numeroRomano = scanner.nextInt();
                    String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
                    int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
                    String textoRomano = "";
                    for (int i = 0; i < romanos.length; i++) {
                        while (numeroRomano >= valores[i]) {
                            textoRomano += romanos[i];
                            numeroRomano -= valores[i];
                        }
                    }
                    System.out.println("El número " + numeroRomano + " en romano es: " + textoRomano);
                    break;
                case 7:
                    System.out.print("Ingrese un número entre 1 y 9999: ");
                    int numeroIngles = scanner.nextInt();
                    String[] unidadesIngles = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
                    String[] decenasIngles = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
                    String[] centenasIngles = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
                    String textoIngles = "";
                    if (numeroIngles < 10) {
                        textoIngles = unidadesIngles[numeroIngles];
                    } else if (numeroIngles < 100) {
                        textoIngles = decenasIngles[numeroIngles / 10];
                        if (numeroIngles % 10 != 0) {
                            textoIngles += " " + unidadesIngles[numeroIngles % 10];
                        }
                    } else if (numeroIngles < 1000) {
                        textoIngles = centenasIngles[numeroIngles / 100];
                        if (numeroIngles % 100 != 0) {
                            textoIngles += " ";
                            if (numeroIngles % 100 < 10) {
                                textoIngles += unidadesIngles[numeroIngles % 100];
                            } else if (numeroIngles % 100 < 100) {
                                textoIngles += decenasIngles[(numeroIngles % 100) / 10];
                                if (numeroIngles % 10 != 0) {
                                    textoIngles += " " + unidadesIngles[numeroIngles % 10];
                                }
                            }
                        }
                    }
                    System.out.println("El número " + numeroIngles + " en inglés es: " + textoIngles);
                    break;
                case 8:
                    int sumaPrimo = 0;
                    System.out.println("Los números primos del 1 al 199 son: ");
                    for (int i = 1; i <= 199; i++) {
                        boolean esPrimo = true;
                        for (int j = 2; j <= Math.sqrt(i); j++) {
                            if (i % j == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                        if (esPrimo) {
                            System.out.print(i + " ");
                            sumaPrimo += i;
                        }
                    }
                    System.out.println("\nLa suma de los números primos del 1 al 199 es: " + sumaPrimo);
                    break;
                case 9:
                    int sumaPar = 0;
                    System.out.println("Los números pares del 1 al 199 son: ");
                    for (int i = 1; i <= 199; i += 2) {
                        System.out.print(i + " ");
                        sumaPar += i;
                    }
                    System.out.println("\nLa suma de los números pares del 1 al 199 es: " + sumaPar);
                    break;
                case 10:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 10.");
            }
        } while (opcion != 10);
    }
}