/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_josealvarez;

import java.util.Scanner;

public class Examen1_JoseAlvarez {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        boolean continuar = true;
        String historial = "";

        while (continuar) {
            System.out.println("1. Ejercicios String");
            System.out.println("2. Respuestas a preguntas");
            System.out.println("3. Mostrar el historial del menu");
            System.out.println("4. Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    historial += "Ejercicios String, ";

                    System.out.println("Ingrese una cadena debe tener al menos 3 caracteres: ");
                    String cadena = string.nextLine();

                    while (cadena.length() < 3) {
                        System.out.println("La cadena ingresada debe tener al menos 3 caracteres.");
                        cadena = string.nextLine();
                    }

                    if (cadena.length() % 2 == 1) {
                        System.out.println("Ingrese una nueva cadena: ");
                        String cadenaNueva = string.nextLine();
                        String cadenaRespuesta = cadena + cadenaNueva;// concatena las dos cadenas y este es el resultado
                        System.out.println("Cadena resultante: " + cadenaRespuesta);// aqui lo imprime
                        System.out.println("Tamaño de la nueva cadena: " + cadenaRespuesta.length());
                    } else {
                        int mitad = cadena.length() / 2;
                        String primeraMitad = cadena.substring(0, mitad);
                        String segundaMitad = cadena.substring(mitad);

                        String cadenaResultante = "";
                        for (int i = 0; i < primeraMitad.length(); i++) {
                            cadenaResultante += primeraMitad.charAt(i);
                            if (i != primeraMitad.length() - 1) {
                                cadenaResultante += "-";
                            }
                        }
                        cadenaResultante += "/";
                        for (int i = 0; i < segundaMitad.length(); i++) {
                            cadenaResultante += segundaMitad.charAt(i);
                            if (i != segundaMitad.length() - 1) {
                                cadenaResultante += "/";
                            }
                        }

                        System.out.println("Primera mitad de la cadena: " + primeraMitad);
                        System.out.println("Segunda mitad de la cadena: " + segundaMitad);
                        System.out.println("Cadena resultante: " + cadenaResultante);
                    }

                    break;

                case 2:
                    historial += "Respuestas a preguntas, ";

                    System.out.println("");
                    System.out.println("Describa el funcionamiento y diferencias del if y del switch case");
                    System.out.println("El funcionamiento del if funciona para que el programa tome una serie de decisiones en base a lo que se le ha pedido.");
                    System.out.println("El funcionamiento del switch practicamente es similar al del if solo que este se utiliza cuando hay bastantes opciones por decidir; un ejemplo es un menu.");
                    System.out.println("Las diferencias entre uno y el otro son varias pero por ejemplo en mi opinion yo los difiero porque en el if puedo usar and o or y en el switch no puedo.");
                    System.out.println(".Describa el funcionamiento de .substring(), equalsIgNoreCase() y .equals()");
                    System.out.println("El funcionamiento de substring funciona para reemplazar caracteres dentro de una cadena y substituirlos por otros");
                    System.out.println("El funcionamiento de equalsIgNoreCase funciona para que cuando se llame este metodo en una cadena, ignore si una palabra es mayuscula o miniscula");
                    System.out.println("El funcionamiento del equals funciona para verificar si una cadena es la misma que la otra.");
                    System.out.println("Defina a que se refiere la concatenación. ");
                    System.out.println("");
                    System.out.println("La concatenacion se refiere a la union de cadenas, por ejempo si una cadena es Jose y quiero concatenarla con un Apellido seria por ejemplo");
                    String cadenaNombre = "Jose";
                    System.out.println("Ingrese Apellido: ");
                    String apellido = string.nextLine();
                    System.out.println("El ejemplo de Concatenacion seria: " + cadenaNombre + apellido);
                    break;

                case 3:
                    System.out.println("");
                    historial += "Mostrar el historial del menu, ";
                    System.out.println("Historial del menú: " + historial);
                    break;

                case 4:
                    System.out.println("");
                    historial += "Salir";
                    System.out.println("");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Ingrese un número del 1 al 4.");
            }// fin switch

        }// fin while

    }

}
