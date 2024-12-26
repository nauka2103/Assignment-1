package transport;

public class Passenger {
    private String name;
    private int age;
    private String ticketNumber;

    public Passenger(String name, int age, String ticketNumber) {
        this.name = name;
        this.age = age;
        this.ticketNumber = ticketNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ticketNumber='" + ticketNumber + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Passenger passenger = (Passenger) obj;
        return age == passenger.age &&
                name.equals(passenger.name) &&
                ticketNumber.equals(passenger.ticketNumber);
    }
}
