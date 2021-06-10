package Clase6;

public class Profesor extends Persona {

    private String materia;

    public Profesor(String unNombre, int unDni,String unaMateria){
        super(unNombre,unDni);
        this.materia = unaMateria;
    }

    public void setMateria(String unaMateria){
        this.materia = unaMateria;
    }

    public String getMateria(){
        return this.materia;
    }

    public String toString(){
        return "El nombre del profesor es " +this.nombre+", su DNI es " +this.dni+ " y dicta "+this.materia;

    }







}
