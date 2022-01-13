import java.util.ArrayList;

public class Floor {
    ArrayList<Apartment> apartments = new ArrayList<>();

    public Apartment getApartment(int numberApartment) {
        return apartments.get(numberApartment - 1);
    }

    public void setApartments(Apartment apartment) {
        this.apartments.add(apartment);
    }

    public int countApartments() {
        return apartments.size();
    }
}
