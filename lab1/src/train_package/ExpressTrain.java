package train_package;

public class ExpressTrain extends train {
    private String DepartureTime;

    public ExpressTrain(String Destination, int TrainNumber, int ShippingTime, int NumberOfSeatsGeneral, int NumberOfSeatsCompartment, int NumberOfSeatsPlaceCard, int NumberOfSeatsSuite, String DepartureTime) {
        super(Destination, TrainNumber, ShippingTime, NumberOfSeatsGeneral, NumberOfSeatsCompartment, NumberOfSeatsPlaceCard, NumberOfSeatsSuite);
        this.DepartureTime = DepartureTime;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }
}
