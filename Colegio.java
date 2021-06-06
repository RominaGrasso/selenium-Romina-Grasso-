package Clase6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colegio {

    public static void main(String[] args) {

        List<Alumno> listaAlumnos = new ArrayList<>();
        List<Profesor> listaProfesores = new ArrayList<>();


        System.out.println("*********   BIENVENIDO   *********");

        Alumno a1 = new Alumno("Facundo", 50000, "Biología");
        Alumno a2 = new Alumno("Daniela", 60000, "Inglés");

        listaAlumnos.add(a1);
        listaAlumnos.add(a2);

        Profesor prof1 = new Profesor("Alberto", 80000, "Química");
        Profesor prof2 = new Profesor("Alicia", 850000, "Sociología");

        listaProfesores.add(prof1);
        listaProfesores.add(prof2);

       /* System.out.println("PROFESORES:");
        System.out.println(prof1);
        System.out.println(prof2);

        System.out.println("ALUMNOS:");
        System.out.println(a1);
        System.out.println(a2);*/

        mostrarListaAlumnos(listaAlumnos);

        mostrarListaProfesores(listaProfesores);

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos a agregar al Sistema: ");
        int cantidadAlumnos = input.nextInt();


        for (int i = 0; i < cantidadAlumnos; i++) {

            Alumno alumno = crearAlumno();
            listaAlumnos.add(alumno);

            System.out.println("Alumno ingresado correctamente al sistema.");
            System.out.println("");

        }

     mostrarListaAlumnos(listaAlumnos);

        System.out.println("Desea eliminar un alumno? (SI/NO)");
        String respuesta = input.next();

        if (respuesta.toUpperCase().equals("SI")) {
            System.out.println("Ingrese el número del estudiante a eliminar: ");
        }
        else{
            System.out.println("No se eliminará ningún estudiante.");
        }

        int nroEstudiante = input.nextInt();

        int posicion = 0;
        int posicionAlumno = -1;

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNroEstudiante() == nroEstudiante) {
                posicionAlumno = posicion;
            } else {
                posicion++;
            }
        }
        if (posicionAlumno != -1){
            listaAlumnos.remove(posicionAlumno);
            System.out.println("Se eliminó el alumno de la posición: " + posicion);
        }
        mostrarListaAlumnos(listaAlumnos);

        System.out.println("El programa ha finalizado.");

        }
        public static void mostrarListaAlumnos (List < Alumno > listaAlumnos) {
        System.out.println("*** LISTA DE ALUMNOS ***");

        for (Alumno alumn : listaAlumnos) {
            System.out.println(alumn);
        }
    }
        public static void mostrarListaProfesores( List <Profesor> listaProfes){
            System.out.println("*** LISTA PROFESORES ***");

            for (Profesor prof : listaProfes) {
                System.out.println(prof);
            }
        }

        public static Alumno crearAlumno(){
            Scanner input = new Scanner(System.in);

            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = input.next();

            System.out.println("Ingrese el dni del alumno: ");
            int dni = input.nextInt();

            System.out.println("Ingrese el curso del alumno: ");
            String curso = input.next();

            Alumno alumno = new Alumno(nombre, dni, curso);
            return alumno;

        }
    }
