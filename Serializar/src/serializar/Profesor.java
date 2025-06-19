package serializar;

public class Profesor extends Persona {
    private final String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", asignatura='" + asignatura + '\'' +
                '}';
    }
}