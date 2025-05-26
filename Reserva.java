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

    public void mostrarDetalle() {
        System.out.println("Reserva creada:");
        cliente.mostrarInfo();
        System.out.println("Habitación: " + habitacion.getNumero());
        System.out.println("Del " + fechaInicio + " al " + fechaFin);
    }
}
