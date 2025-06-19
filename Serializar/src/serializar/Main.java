package serializar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Deberes> lista = new ArrayList<>();

        lista.add(new Estudiante("Ana", 20, "Ingeniería"));
        lista.add(new Profesor("Carlos", 45, "Matemáticas"));
        lista.add(new Persona("Lucía", 30));

        int contador = 1;
        for (Deberes d : lista) {
            String archivo = "objeto" + contador + ".ser";
            try {
                d.guardarEnArchivo(archivo);
                d.leerDesdeArchivo(archivo);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error con el objeto " + contador);
            }
            contador++;
        }
    }
}