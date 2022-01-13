public class Main {
    public static void main(String[] args) {
        House mainHouse = new House();
        addData(mainHouse);

        Game game = new Game(mainHouse);
        game.startgame();
    }


    // Добавляем данные
    public static void addData(House house) {

        // Создание типовых комнат
        Room small = new Room(300.0, 186.12, 230.4);
        Room average = new Room(300.0, 560.0, 420.5);
        Room big = new Room(300.0, 1540.9, 2456.56);

        // Добавляем в квартиру разные комнаты
        Apartment apartmentVip = new Apartment();
        apartmentVip.setRooms(big, TypeRoom.LIVING_ROOM);
        apartmentVip.setRooms(small, TypeRoom.BEDROOM1);
        apartmentVip.setRooms(small, TypeRoom.BEDROOM2);
        apartmentVip.setRooms(average, TypeRoom.CANTEEN);
        apartmentVip.setRooms(average, TypeRoom.TOILET);
        apartmentVip.setRooms(average, TypeRoom.KITCHEN);

        // Добавляем в этаж типовые квартиры
        Floor floorVip = new Floor();
        for (int i = 0; i < 4; i++) {
            floorVip.setApartments(apartmentVip);
        }

        // Добавляем в дом, типовые этажи
        for (int i = 0; i < 4; i++) {
            house.setFloors(floorVip);
        }
    }
}
