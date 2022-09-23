package herencia;
//Super Class ó Clase Padre

public class SuperClass {

    //MODIFICADORES DE ACCESO
    //default-No se requiere palabra clave; pueden acceder subClases y la propia clase
    static String name;
    //private-unicamente accede la propica clase, si queremos acceder sera con metodo get
    static private String apellido;
    //protected- accede la propia clase, subclases heredadas y los que pertenecen al mismo paquete
    static protected int edad;
    //public- acceden todos 
    static public String sexo;

    //Constructor
    public SuperClass(String nombre_r, String apellido_r, int edad_r, String sexo_r) {
        System.out.println("Constructor SuperClass");
        this.name = nombre_r.toUpperCase();
        this.apellido = apellido_r.toUpperCase();
        this.edad = edad_r;
        this.sexo = sexo_r.toUpperCase();
    }

    //metodo get para acceder a una variable private
    public String getApellido() {
        return apellido;
    }

}
