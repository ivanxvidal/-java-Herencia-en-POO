package herencia;

import herencia_2.ExtClass;

public class Herencia {

    public static void main(String[] args) {
        SubClass subclass = new SubClass("Ivan", "Vidal", 23, "Hombre");
        subclass.mostrarDatos();
        //Clase que exterior que no hereda de nada
        ExtClass extClass = new ExtClass();

    }

}
