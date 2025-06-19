package serializar;


import java.io.*;

public class Persona implements Serializable, Deberes {
    private static final long serialVersionUID = 1L;

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void guardarEnArchivo(String nombreArchivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(this);
            System.out.println("Objeto guardado: " + this);
        }
    }

    @Override
    public void leerDesdeArchivo(String nombreArchivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            Persona persona = (Persona) ois.readObject();
            this.nombre = persona.nombre;
            this.edad = persona.edad;
            System.out.println("Objeto leído: " + this);
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}