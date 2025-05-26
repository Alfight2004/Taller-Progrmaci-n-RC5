public class Habitacion {
    private int numero;
    private boolean disponible;

    public Habitacion(int numero) {
        this.numero = numero;
        this.disponible = true; // por defecto disponible
    }

    public int getNumero() {
        return numero;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void ocupar() {
        disponible = false;
    }

    public void liberar() {
        disponible = true;
    }
}

