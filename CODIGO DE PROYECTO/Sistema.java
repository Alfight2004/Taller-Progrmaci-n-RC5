import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(5); // 5 habitaciones

        int opcion;

        do {
            hotel.mostrarDisponibilidad();

            System.out.print("\n¿Desea hacer una reserva? (1 = Sí, 0 = No): ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            if (opcion == 1) {
                System.out.print("Ingrese nombre del cliente: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese cédula del cliente: ");
                String cedula = scanner.nextLine();

                System.out.print("Ingrese número de habitación (1-5): ");
                int habitacion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer

                System.out.print("Ingrese fecha de inicio (YYYY-MM-DD): ");
                String inicio = scanner.nextLine();

                System.out.print("Ingrese fecha de fin (YYYY-MM-DD): ");
                String fin = scanner.nextLine();

                hotel.hacerReserva(nombre, cedula, habitacion, inicio, fin);
            }

        } while (opcion != 0);

        System.out.println("Operación finalizada.");
    }
}
