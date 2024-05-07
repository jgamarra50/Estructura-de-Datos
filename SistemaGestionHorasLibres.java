/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemaGestionHorasLibres;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SistemaGestionHorasLibres {

     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Bienvenido al Sistema de Gestión de Horas Libres UNAB");

       System.out.print("Ingrese su nombre: ");
       String nombre = scanner.nextLine();

       System.out.print("Ingrese su carrera: ");
       String carrera = scanner.nextLine();

       Estudiante estudiante = new Estudiante(nombre, carrera);

       int opcion;
       do {
           mostrarMenu();
           opcion = scanner.nextInt();
           scanner.nextLine(); // Consumir salto de línea

           switch (opcion) {
               case 1:
                   agregarHoraLibre(estudiante, scanner);
                   break;
               case 2:
                   eliminarHoraLibre(estudiante, scanner);
                   break;
               case 3:
                   agregarEvento(estudiante, scanner);
                   break;
               case 4:
                   eliminarEvento(estudiante, scanner);
                   break;
               case 5:
                   consultarHorasLibresDisponibles(estudiante);
                   break;
               case 6:
                   visualizarEventos(estudiante);
                    break;
               case 7:
                   calcularPromedioHorasLibres(estudiante);
                    break;
               case 0:
                   System.out.println("Saliendo del sistema...");
                   break;
               default:
                   System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú Principal");
        System.out.println("1. Agregar Hora Libre");
        System.out.println("2. Eliminar Hora Libre");
        System.out.println("3. Agregar Evento");
        System.out.println("4. Eliminar Evento");
        System.out.println("5. Consultar Horas Libres Disponibles");
        System.out.println("6. Visualizar Eventos");
        System.out.println("7. Calcular Promedio Horas Libres");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private static void agregarHoraLibre(Estudiante estudiante, Scanner scanner) {
        System.out.print("Ingrese la duración de la hora libre (en minutos): ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Ingrese el tipo de hora libre (ludica, deportiva, recreacion): ");
        String tipo = scanner.nextLine();

        System.out.print("Ingrese la fecha (yyyy-mm-dd): ");
        String fechaString = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(fechaString);

        System.out.print("Ingrese la hora (hh:mm): ");
        String horaString = scanner.nextLine();
        LocalTime hora = LocalTime.parse(horaString);

        HoraLibre horaLibre = new HoraLibre(duracion, tipo, fecha, hora);
        estudiante.agregarHoraLibre(horaLibre);
        System.out.println("Hora libre agregada correctamente.");
    }
}