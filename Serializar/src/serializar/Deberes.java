package serializar;

import java.io.IOException;

public interface Deberes {
    void guardarEnArchivo(String nombreArchivo) throws IOException;
    void leerDesdeArchivo(String nombreArchivo) throws IOException, ClassNotFoundException;
}