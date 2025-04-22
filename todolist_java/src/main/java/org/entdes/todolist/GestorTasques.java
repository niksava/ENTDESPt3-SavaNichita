package org.entdes.todolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorTasques {
    private final List<Tasca> llista = new ArrayList<>();

    public void crearTasca(String descripcio) {
        if (descripcio == null || descripcio.isEmpty()) {
            throw new IllegalArgumentException("La descripció no pot ser nul·la o buida.");
        }
        Tasca tasca = new Tasca(descripcio);
        llista.add(tasca);
    }

    public void eliminarTasca(String descripcio) {
        if (descripcio == null || descripcio.isEmpty()) {
            throw new IllegalArgumentException("La descripció no pot ser nul·la o buida.");
        }
        llista.removeIf(tasca -> tasca.getDescripcio().equals(descripcio));
    }

    public void marcarCompletada(String descripcio) {
        if (descripcio == null || descripcio.isEmpty()) {
            throw new IllegalArgumentException("La descripció no pot ser nul·la o buida.");
        }
        for (Tasca tasca : llista) {
            if (tasca.getDescripcio().equals(descripcio)) {
                tasca.setCompletada(true);
                break;
            }
        }
    }

    public List<Tasca> obtenirTasques() {
        return Collections.unmodifiableList(llista);
    }
}