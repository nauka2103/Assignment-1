package transport;

public class TransportService {
    private Bus bus;
    private Passenger passenger;

    public TransportService(Bus bus, Passenger passenger) {
        this.bus = bus;
        this.passenger = passenger;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String toString() {
        return "TransportService{" +
                "bus=" + bus +
                ", passenger=" + passenger +
                '}';
    }
}
