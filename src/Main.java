import transport.Bus;
import transport.Passenger;
import transport.TransportService;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter Bus Details:");
        System.out.print("Bus Number: ");
        String busNumber = System.console().readLine();
        System.out.print("Driver Name: ");
        String driverName = System.console().readLine();
        System.out.print("Capacity: ");
        int capacity = Integer.parseInt(System.console().readLine());

        Bus bus = new Bus(busNumber, driverName, capacity);

        System.out.println("Enter Passenger Details:");
        System.out.print("Name: ");
        String name = System.console().readLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(System.console().readLine());
        System.out.print("Ticket Number: ");
        String ticketNumber = System.console().readLine();

        Passenger passenger = new Passenger(name, age, ticketNumber);

        TransportService service = new TransportService(bus, passenger);

        System.out.println("\nTransport Service Details:");
        System.out.println(service);
    }
}
