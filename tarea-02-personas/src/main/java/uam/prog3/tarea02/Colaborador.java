package uam.prog3.tarea02;

public class Colaborador extends Persona implements Evaluable
{
    private String Puesto;
    private int desempeno;
    
    public Colaborador(String nombre, String cedula, String Puesto, int desempeno)
    {
        super(nombre,cedula);
        this.Puesto = Puesto;
        this.desempeno = desempeno;
    }

    @Override
    public String describirRol()
    {
        return "Colaborador: " + Puesto + ".";
    }

    @Override
    public String getEvaluacion()
    {
        return desempeno >= 3 ? "Bueno" : "Bajo";
    }

}