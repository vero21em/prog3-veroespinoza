package uam.prog3.tarea02;

/**
 * Hello world!
 */
public class Main 
{
    public static void main(String[] args) 
    {
        /*System.out.println("Hello World!");*/
        Persona[] personas = 
        {
            new Estudiante("Mariana Solís Obando", "1-1111-1111", "Ingeniería en Sistemas", 85),
            new Colaborador("Jorge Vargas Zarate", "2-2222-2222", "Analista de TI", 4),
            new Docente("Martín Casanova Garro", "3-3333-3333", "Matématica", 11),
            new Estudiante("Pablo Salazar Guevara", "4-4444-4444", "Enseñanza de Informática", 63),
            new Colaborador("Jorge Vargas Peña", "5-5555-5555", "Recursos Humanos", 1),
            new Docente("María José Solís Obando", "6-6666-6666", "Informática", 5),
            new Estudiante("Samuel Solano Machado", "7-7777-7777", "Turismo", 90),
            new Colaborador("Sofía López Arnaez", "8-8888-8888", "Contadora", 3),
            new Docente("Ingrid Mora Espinoza", "9-9999-9999", "Informática", 1)
        };
        for (Persona p : personas) 
            {
                System.out.println(p.getnombre() + ": " + p.describirRol());
                if (p instanceof Evaluable) 
                    {
                        Evaluable ev = (Evaluable) p;
                        System.out.println(" Evaluación: " + ev.getEvaluacion());
                    }
            }
    }
}
