/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 del estudiante rené
Calificación 7 del estudiante rolando

Promedio de calificaciones: 8,50
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaFinal;
        int nota;
        int salida = -111;
        String nombre; // *
        double promedio;
        boolean bandera = true;
        int suma = 0;
        int contador_calificaciones = 0;
        
        cadenaFinal = "Calificacion del estudiante";
        
        do {
            
            // agrego valor al acumulador
            
            // agrego una unidad al contador para luego sacar el promedio
            contador_calificaciones = contador_calificaciones + 1;
            
            System.out.println("Ingrese el nombre del estudiante");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese la nota del estudiante");
            nota = entrada.nextInt();
            suma = suma + nota;
            
            
           
            if (salida == -111) {
                bandera = false;
            }
            // atención
            entrada.nextLine(); // se limpia el buffer, pues el primer valor
                               // que se solicita al inicio del ciclo es una
                               // cadena

        } while (bandera); // (bandera==true)
        
        // promedio = suma / contador_calificaciones;
        promedio = (double)suma / contador_calificaciones;
        cadenaFinal = String.format("Calificacion %s del estudiante %s"
                            , nota, nombre, cadenaFinal);
        
        cadenaFinal = String.format("Calificacion %s del estudiante %s"
                            , nota, nombre, cadenaFinal);
        
        cadenaFinal = String.format("%s\nPromedio de calificaciones: %.2f",
                cadenaFinal,
                promedio);
        
        System.out.printf("%s\n%s\n", cadenaFinal, cadenaFinal);
    }
}
