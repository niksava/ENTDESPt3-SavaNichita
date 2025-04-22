package org.entdes.todolist;

public class Tasca {
    private boolean completada = false;
    private final String descripcio;

    public Tasca(String descripcio) {
        if (descripcio == null || descripcio.isEmpty()) {
            throw new IllegalArgumentException("La descripció no pot ser nul·la o buida.");
        }
        this.descripcio = descripcio;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getDescripcio() {
        return descripcio;
    }

    @Override
    public String toString() {
        return descripcio + ": " + (completada ? "Completada" : "Pendent");
    }
}