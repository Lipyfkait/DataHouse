import java.util.ArrayList;

public class House {
    ArrayList<Floor> floors = new ArrayList<>();

    public Floor getFloors(int numberFloor) {
        return floors.get(numberFloor - 1);
    }

    public void setFloors(Floor floor) {
        this.floors.add(floor);
    }

    public int countFloor(){
        return floors.size();
    }
}
