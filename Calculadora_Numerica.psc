Proceso Calculadora_Numerica
	// Autor del programa: Leonel Cano
	// Versión: 2.2
	// Descripción: Este programa ofrece varias operaciones numéricas y conversiones
	
	// Declaración de variables
	Definir opcion_menu, numero_entrada, contador, suma, termino_anterior, termino_actual, valor, digito_unidad, digito_decena, digito_centena, digito_millar, cantidad_primos, primos_mostrados, i, numero_actual Como Entero;
	Definir factorial Como Real;
	Definir continuar Como Caracter;
	Definir es_primo Como Logico;
	
	// Mensaje de ayuda
	Escribir "Bienvenido a la Calculadora Numérica";
	Escribir "Este programa ofrece las siguientes funciones:";
	Escribir "1. Múltiplos: Calcula múltiplos hasta 200 y su suma.";
	Escribir "2. Impares: Muestra números impares hasta 200 y su suma.";
	Escribir "3. Fibonacci: Muestra los primeros 15 términos de la secuencia.";
	Escribir "4. Factorial: Calcula el factorial de un número.";
	Escribir "5. Arábigos a texto (Español): Convierte números a palabras en español.";
	Escribir "6. Arábigos a romanos: Convierte números a numerales romanos.";
	Escribir "7. Arábigos a texto (Inglés): Convierte números a palabras en inglés.";
	Escribir "8. Números primos: Muestra una cantidad especificada de números primos.";
	Escribir "9. Pares: Muestra números pares hasta 200 y su suma.";
	Escribir "";
	Escribir "Presione Enter para continuar...";
	Esperar Tecla;
	
	Repetir
		Limpiar Pantalla;
		
		// Menú principal
		Escribir "***********";
		Escribir "*        Calculadora Numérica        *";
		Escribir "* 1. Múltiplos   2. Impares   3. Fibonacci *";
		Escribir "* 4. Factorial   5. A Español 6. A Romanos *";
		Escribir "* 7. A Inglés    8. Primos    9. Pares     *";
		Escribir "***********";
		Escribir "Seleccione una opción (1-9): ";
		Leer opcion_menu;
		
		Segun opcion_menu Hacer
			1: // Múltiplos hasta 200 y sumatoria
				Escribir "Ingrese un número entre 1 y 20:";
				Leer numero_entrada;
				Mientras numero_entrada < 1 O numero_entrada > 20 Hacer
					Escribir "Error. Ingrese un número entre 1 y 20:";
					Leer numero_entrada;
				FinMientras;
				
				contador <- 0;
				suma <- 0;
				Mientras contador < 200 Hacer
					contador <- contador + numero_entrada;
					Escribir contador;
					suma <- suma + contador;
				FinMientras;
				Escribir "La suma de los múltiplos es: ", suma;
				
			2: // Impares hasta 200
				contador <- 1;
				suma <- 0;
				Mientras contador <= 199 Hacer
					Escribir contador;
					suma <- suma + contador;
					contador <- contador + 2;
				FinMientras;
				Escribir "La suma de los números impares es: ", suma;
				
			3: // Fibonacci (primeros 15 términos)
				termino_anterior <- 0;
				termino_actual <- 1;
				Para contador <- 1 Hasta 15 Con Paso 1 Hacer
					Escribir termino_anterior;
					valor <- termino_anterior + termino_actual;
					termino_anterior <- termino_actual;
					termino_actual <- valor;
				FinPara;
				
			4: // Factorial
				Escribir "Ingrese un número no negativo:";
				Leer numero_entrada;
				Si numero_entrada >= 0 Entonces
					factorial <- 1;
					Para contador <- 1 Hasta numero_entrada Con Paso 1 Hacer
						factorial <- factorial * contador;
					FinPara;
					Escribir "El factorial de ", numero_entrada, " es: ", factorial;
				SiNo
					Escribir "Error: El número debe ser no negativo.";
				FinSi;
				
			5: // Números arábigos a texto (español)
				Escribir "Ingrese un número entre 1 y 9999:";
				Leer numero_entrada;
				Si numero_entrada >= 1 Y numero_entrada <= 9999 Entonces
					digito_millar <- trunc(numero_entrada / 1000);
					digito_centena <- trunc((numero_entrada - digito_millar * 1000) / 100);
					valor <- numero_entrada - digito_centena * 100 - digito_millar * 1000;
					digito_decena <- trunc(valor / 10);
					digito_unidad <- valor - digito_decena * 10;
					
					// Convertir a texto (código existente)
					// ...
				SiNo
					Escribir "Por favor, ingrese un número entre 1 y 9999.";
				FinSi;
				
			6: // Números arábigos a romanos
				Escribir "Ingrese un número entre 1 y 3999:";
				Leer numero_entrada;
				Si numero_entrada >= 1 Y numero_entrada <= 3999 Entonces
					digito_millar <- trunc(numero_entrada / 1000);
					digito_centena <- trunc((numero_entrada - digito_millar * 1000) / 100);
					valor <- numero_entrada - digito_centena * 100 - digito_millar * 1000;
					digito_decena <- trunc(valor / 10);
					digito_unidad <- valor - digito_decena * 10;
					
					// Convertir a números romanos (código existente)
					// ...
				SiNo
					Escribir "Por favor, ingrese un número entre 1 y 3999.";
				FinSi;
				
			7: // Números arábigos a texto (inglés)
				Escribir "Enter a number between 1 and 9999:";
				Leer numero_entrada;
				Si numero_entrada >= 1 Y numero_entrada <= 9999 Entonces
					digito_millar <- trunc(numero_entrada / 1000);
					digito_centena <- trunc((numero_entrada - digito_millar * 1000) / 100);
					valor <- numero_entrada - digito_centena * 100 - digito_millar * 1000;
					digito_decena <- trunc(valor / 10);
					digito_unidad <- valor - digito_decena * 10;
					
					// Convertir a texto en inglés (código existente)
					// ...
				SiNo
					Escribir "Please enter a number between 1 and 9999.";
				FinSi;
				
			8: // Números primos
				Escribir "Ingrese la cantidad de números primos a mostrar:";
				Leer cantidad_primos;
				
				Escribir "1: 2";
				primos_mostrados <- 1;
				numero_actual <- 3;
				Mientras primos_mostrados < cantidad_primos Hacer
					es_primo <- Verdadero;
					Para i <- 3 Hasta rc(numero_actual) Con Paso 2 Hacer
						Si numero_actual MOD i = 0 Entonces
							es_primo <- Falso;
							i <- numero_actual;  // Salir del bucle
						FinSi;
					FinPara;
					
					Si es_primo Entonces
						primos_mostrados <- primos_mostrados + 1;
						Escribir primos_mostrados, ": ", numero_actual;
					FinSi;
					
					numero_actual <- numero_actual + 2;
				FinMientras;
				
			9: // Pares hasta 200
				contador <- 2;
				suma <- 0;
				Mientras contador <= 200 Hacer
					Escribir contador;
					suma <- suma + contador;
					contador <- contador + 2;
				FinMientras;
				Escribir "La suma de los números pares es: ", suma;
				
			De Otro Modo:
				Escribir "Opción no válida. Por favor, elija una opción del 1 al 9.";
		FinSegun;
		
		Escribir "¿Desea realizar otra operación? (S/N)";
		Leer continuar;
	Hasta Que Mayusculas(continuar) <> 'S';
	
	Escribir "Gracias por usar la Calculadora Numérica. ¡Hasta pronto!";
FinProceso