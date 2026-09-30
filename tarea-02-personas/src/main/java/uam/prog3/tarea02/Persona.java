package uam.prog3.tarea02;

public abstract class Persona 
{
    private String nombre;
    private String cedula;

    public Persona(String nombre, String cedula) 
    {
    this.nombre = nombre;
    this.cedula = cedula;
    }

    public String getnombre()
    {
        return nombre;
    }

    public String getcedula()
    {
        return cedula;
    }

    public abstract String describirRol();

}