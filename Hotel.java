import java.util.ArrayList;

public class Hotel {
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reserva> reservas;

    public Hotel() {
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();
        inicializarHabitaciones();
    }

    private void inicializarHabitaciones() {
        // Crea 5 habitaciones numeradas del 1 al 5
        for (int i = 1; i <= 5; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public Habitacion buscarHabitacionDisponible() {
        for (Habitacion h : habitaciones) {
            if (h.estaDisponible()) {
                return h;
            }
        }
        return null; // No hay habitaciones disponibles
    }

    public void crearReserva(Cliente cliente, String fechaInicio, String fechaFin) {
        Habitacion disponible = buscarHabitacionDisponible();
        if (disponible != null) {
            disponible.ocupar();
            Reserva reserva = new Reserva(cliente, disponible, fechaInicio, fechaFin);
            reservas.add(reserva);
            reserva.mostrarDetalle();
        } else {
            System.out.println("No hay habitaciones disponibles para reservar.");
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("\nDisponibilidad de habitaciones:");
        for (Habitacion h : habitaciones) {
            System.out.println("Habitación " + h.getNumero() + ": " + (h.estaDisponible() ? "Disponible" : "Ocupada"));
        }
    }
}
