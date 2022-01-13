import java.util.HashMap;
import java.util.Map;

public class Apartment {
    Map<TypeRoom, Room> rooms = new HashMap<>();

    public Room getRooms(TypeRoom typeRoom) {
        return (rooms.get(typeRoom));
    }

    public void setRooms(Room room, TypeRoom typeRoom) {
        this.rooms.put(typeRoom, room);
    }

    public int countRooms() {
        return rooms.size();
    }
}
