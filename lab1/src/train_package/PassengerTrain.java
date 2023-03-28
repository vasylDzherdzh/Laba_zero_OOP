package train_package;



public class PassengerTrain extends train {
    private int NumberOfSeatsEconomy;
    private int NumberOfSeatsFirstClass;

    public PassengerTrain(String Destination, int TrainNumber, int ShippingTime, int NumberOfSeatsGeneral, int NumberOfSeatsCompartment, int NumberOfSeatsPlaceCard, int NumberOfSeatsSuite, int NumberOfSeatsEconomy, int NumberOfSeatsFirstClass) {
        super(Destination, TrainNumber, ShippingTime, NumberOfSeatsGeneral, NumberOfSeatsCompartment, NumberOfSeatsPlaceCard, NumberOfSeatsSuite);
        this.NumberOfSeatsEconomy = NumberOfSeatsEconomy;
        this.NumberOfSeatsFirstClass = NumberOfSeatsFirstClass;
    }

    public int getNumberOfSeatsEconomy() {
        return NumberOfSeatsEconomy;
    }

    public void setNumberOfSeatsEconomy(int NumberOfSeatsEconomy) {
        this.NumberOfSeatsEconomy = NumberOfSeatsEconomy;
    }

    public int getNumberOfSeatsFirstClass() {
        return NumberOfSeatsFirstClass;
    }

    public void setNumberOfSeatsFirstClass(int NumberOfSeatsFirstClass) {
        this.NumberOfSeatsFirstClass = NumberOfSeatsFirstClass;
    }
}
