package herencia;

public class SubClass extends SuperClass {

    public SubClass(String nombre, String apellido, int edad, String sexo) {
        super(nombre, apellido, edad, sexo);
        System.out.println("Constructor SubClass");
    }

    void mostrarDatos() {
        System.out.println("\n---Mostrar Datos---");
        System.out.println("Nombre: " + name);//default
        System.out.println("Apellido: " + getApellido());//private
        System.out.println("Edad: " + edad);//protected
        System.out.println("Sexo: " + sexo);//public
        System.out.println("-------------------");
    }
}
