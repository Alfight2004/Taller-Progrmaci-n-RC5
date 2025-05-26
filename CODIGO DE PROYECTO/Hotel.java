import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel(int cantidadHabitaciones) {
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();
        for (int i = 1; i <= cantidadHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("\nDisponibilidad de habitaciones:");
        for (Habitacion h : habitaciones) {
            System.out.println("Habitación " + h.getNumero() + ": " + (h.estaDisponible() ? "Disponible" : "Ocupada"));
        }
    }

    public boolean hacerReserva(String nombre, String cedula, int numHabitacion, String fechaInicio, String fechaFin) {
        if (numHabitacion < 1 || numHabitacion > habitaciones.size()) {
            System.out.println("Número de habitación inválido.");
            return false;
        }

        Habitacion h = habitaciones.get(numHabitacion - 1);

        if (!h.estaDisponible()) {
            System.out.println("Habitación no disponible.");
            return false;
        }

        Cliente cliente = new Cliente(nombre, cedula);
        Reserva reserva = new Reserva(cliente, h, fechaInicio, fechaFin);
        h.ocupar();
        reservas.add(reserva);
        reserva.mostrarReserva();
        return true;
    }
}
