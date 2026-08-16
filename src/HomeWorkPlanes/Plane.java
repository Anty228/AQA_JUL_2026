package HomeWorkPlanes;

public class Plane {
    public String seats = "220";
    int SeatsNumber = 220;

    public void boardPassengers(int passengers) {

        if (passengers > SeatsNumber) {
            System.out.println("Too many passengers");
        } else {
            SeatsNumber = SeatsNumber - passengers;

            System.out.println("boarded passengers" + passengers + SeatsNumber + "more seats left");
        }

    }
}
