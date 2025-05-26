public class Cliente extends Persona {
    public Cliente(String nombre, String cedula) {
        super(nombre, cedula);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cliente registrado:");
        super.mostrarInfo();
    }
}
