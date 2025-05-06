package TallerJava8Colecciones;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class TallerJava8Colecciones {
    //! ------------------- Lista de tareas ----------------------------
    public static void listaTareas() {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String tarea;

        do {
            System.out.println("Que deseas hacer? / 1. Agregar tarea / 2. Completar tarea / 3. Mostrar tareas / 4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion >= 1 && opcion <= 3) {
                switch (opcion) {
                    case 1:
                        System.out.println("Escribe tu tarea");
                        tarea = scanner.nextLine().toLowerCase();
                        lista.add(tarea);
                        System.out.println("Tarea agregada");
                        break;
                    case 2:
                        System.out.println("Marcar tarea como completa");
                        tarea = scanner.nextLine().toLowerCase();
                        if (lista.contains(tarea)) {
                            lista.remove(tarea);
                            System.out.println("Tarea completada");
                        } else {
                            System.out.println("No se encontró tarea");
                        }
                        break;
                    case 3:
                        System.out.println("Lista de tareas");
                        if (lista.isEmpty()) {
                            System.out.println("No hay tareas pendientes");
                        } else {
                            for (String l : lista) {
                                System.out.println("Tarea: " + l);
                            }
                            System.out.println("Total tareas pendientes: " + lista.size());
                            break;
                        }
                }
            } else if (opcion == 4) {
                System.out.println("Nos vemos pronto!");
            } else {
                System.out.println("Opcion invalida");
            }
        } while (opcion != 4);
        scanner.close();
    }

    //! ------------------- Lista de libros ----------------------------
    public static void listaLibros() {
        Set<String> libros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String libro;

        System.out.println("Bienvenido a la Biblioteca");
        do {
            System.out.println("Que deseas hacer? / 1. Agregar libro / 2. Verificar disponibilidad / 3. Mostrar todos los libros / 4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion >= 1 && opcion <= 3) {
                switch (opcion) {
                    case 1:
                        System.out.println("Agrega el libro");
                        libro = scanner.nextLine().toLowerCase();
                        libros.add(libro);
                        System.out.println("Libro agregado");
                        break;
                    case 2:
                        System.out.println("Escribe el nombre del libro para ver su estado");
                        libro = scanner.nextLine().toLowerCase();
                        if (libros.contains(libro)) {
                            System.out.println("Libro disponible");
                        } else {
                            System.out.println("No se encontró el libro");
                        }
                        break;
                    case 3:
                        System.out.println("Libros disponibles");
                        if (libros.isEmpty()) {
                            System.out.println("No hay libros disponibles");
                        } else {
                            for (String d : libros) {
                                System.out.println("libro: " + d);
                            }
                            System.out.println("Total libros disponibles: " + libros.size());
                            break;
                        }
                }
            } else if (opcion == 4) {
                System.out.println("Que vuelvas pronto! Te esperamos con un nuevo libro!");
            } else {
                System.out.println("Opcion invalida");
            }
        } while (opcion != 4);
        scanner.close();
    }

    //! ------------------- Directorio de trabajadores ----------------------------
    public static void ListaTrabajadores() {
        Map<String, Double> trabajadores = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String nombre;
        int sueldo;

        System.out.println("Nomina");
        do {
            System.out.println("Que deseas hacer? / 1. Agregar trabajador / 2. Actualizar salario / 3. Mostrar todos los trabajadores / 4. Calcular promedio de salarios / 5. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion >= 1 && opcion <= 4) {
                switch (opcion) {
                    case 1:
                        System.out.println("Escribe el nombre del trabajador");
                        nombre = scanner.nextLine().toLowerCase();
                        System.out.println("Escribe el salario del trabajador");
                        sueldo = scanner.nextInt();
                        scanner.nextLine();
                        trabajadores.put(nombre, (double) sueldo);
                        System.out.println("Trabajador agregado a la nomina");
                        break;
                    case 2:
                        System.out.println("Escribe el nombre del trabajador para actualizar su salario");
                        nombre = scanner.nextLine().toLowerCase();
                        if (trabajadores.containsKey(nombre)) {
                            System.out.println("Escribe el salario para actualizar");
                            sueldo = scanner.nextInt();
                            scanner.nextLine();
                            trabajadores.replace(nombre, (double) sueldo);
                            System.out.println("Trabajador con sueldo actualizado");
                        } else {
                            System.out.println("Trabajador no encontrado");
                        }
                        break;
                    case 3:
                        System.out.println("Nomina de trabajadores");
                        if (trabajadores.isEmpty()){
                            System.out.println("No existen trabajadores actualmente");
                        } else {
                            for (String t : trabajadores.keySet()){
                                System.out.println("Trabajador: " + t + " - Salario: $" + trabajadores.get(t));
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Promedio de salarios");
                        double salarios = 0;
                        for (String p : trabajadores.keySet()){
                            salarios += trabajadores.get(p);
                        }
                        double promedioTotal = salarios / trabajadores.size();
                        System.out.println("Promedio total: $" + promedioTotal);
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo de la nomina de trabajadores");
            } else {
                System.out.println("Opcion invalida");
            }
        } while (opcion != 5);
        scanner.close();
    }
    //! ------------------- Fin TALLER 8 JAVA COLECCIONES ----------------------------
}
