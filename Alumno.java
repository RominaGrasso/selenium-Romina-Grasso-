package Clase6;

public class Alumno extends Persona {

    //ATRIBUTOS
    private String curso;
    private int nroEstudiante;
    private static int CONTADOR_ALUMNOS = 5001;

    //CONSTRUCTOR CON INFO EN PARÁMETROS
    public Alumno(String unNombre, int unDni,String unCurso){
        super(unNombre, unDni);
        this.curso = unCurso;
        this.nroEstudiante = CONTADOR_ALUMNOS;
        CONTADOR_ALUMNOS++;
    }


    //SETTERS Y GETTERS DE ATRIBUTOS

    public void setCurso(String unCurso){
        this.curso = unCurso;
    }

    public String getCurso(){
        return this.curso;
    }

    public int getNroEstudiante(){
        return this.nroEstudiante;
    }

    public String toString(){
        return super.toString() +". Alumno " +this.nroEstudiante+ " cursa " +this.curso;
    }




















}
