public class Alumno {

    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;
    private int longitudNombre;
    private int longitudMatricula;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        longitudNombre = nombre.length();
        longitudMatricula = numeroMatricula.length();
        if(longitudNombre < 3) {
            System.out.println("Es necesario introducir al menos 3 caracteres en el campo 'nombre'"); 
        }
        if(longitudMatricula < 4) {
            System.out.println("Es necesario introducir al menos 4 caracteres en el campo 'matricula'"); 
        }    
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }

    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        return nombre.substring(0, longitudNombre) + numeroMatricula.substring(0, longitudMatricula);
    }
}
