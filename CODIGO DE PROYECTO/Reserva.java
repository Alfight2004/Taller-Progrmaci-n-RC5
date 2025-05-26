public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private String fechaInicio;
    private String fechaFin;

    public Reserva(Cliente cliente, Habitacion habitacion, String fechaInicio, String fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void mostrarReserva() {
        System.out.println("Reserva creada:");
        System.out.println("Cliente registrado:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Cédula: " + cliente.getCedula());
        System.out.println("Habitación: " + habitacion.getNumero());
        System.out.println("Del " + fechaInicio + " al " + fechaFin);
    }
}
