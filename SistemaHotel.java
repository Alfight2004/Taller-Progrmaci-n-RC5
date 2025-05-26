public class SistemaHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Cliente cliente1 = new Cliente("Ana Torres", "0102030405");
        Cliente cliente2 = new Cliente("Carlos Díaz", "0607080910");

        hotel.mostrarDisponibilidad();

        // Crear reservas
        hotel.crearReserva(cliente1, "2025-06-01", "2025-06-05");
        hotel.crearReserva(cliente2, "2025-06-10", "2025-06-15");

        hotel.mostrarDisponibilidad();
    }
}
