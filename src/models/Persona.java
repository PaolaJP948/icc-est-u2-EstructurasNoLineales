package models;

public class Persona implements Comparable<Persona> {//implements sirve para hacer la comparacion en la linea 31
    public String nombre;
    public int edad;

    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

    //comparacion por edad
    @Override
    public int compareTo(Persona otra) {
        int compEdad = Integer.compare(this.edad, otra.getEdad());
        //return compEdad;

        if(compEdad != 0) 
            return compEdad;
        int comNombre = this.nombre.compareTo(otra.getNombre());
        return comNombre;

        
    }
    
    

}
