import java.util.Scanner;

public class Game {

    House house;

// Начало игры
    public void startgame(){
        System.out.println("Эта программа выводит данные дома");
        System.out.println("Введите данные чего вы хотите увидеть (дом - 1, этаж - 2, квартира - 3, комната - 4, выход - любое число)");

        int answer = checkAnswer();
        if (answer < 6 & answer > 0){
            menu(answer);
        }

    }

// Выбор данных
    public void menu(int answer) {
        Object count;
        switch (answer){
            case 1:
                System.out.println("В этом доме колличество этажей = " + this.house.countFloor());
                startgame();
            case 2:
                count = checkFloor().countApartments();
                System.out.println("На этом этаже колличество квартир = " + count);
                startgame();
            case 3:
                count = checkApartment().countRooms();
                System.out.println("В этой квартире коллиество комнат = " + count);
                startgame();
            case 4:
                System.out.println(checkRoom().toString());
                startgame();
        }
    }

// Общая проверка на дурака
    public int checkAnswer(){
        int num;
        Scanner in = new Scanner(System.in);
        try {
            num = in.nextInt();
            return num;
        } catch (Exception e) {
            System.out.println("Вы ввели неправильные данные");
            startgame();
        }
        return 0;
    }

// Проверка и возвращение определенного этажа
    public Floor checkFloor(){
        System.out.println("Какой этаж вас интересует?");
        try {
            return this.house.getFloors(checkAnswer());
        } catch (Exception e) {
            System.out.println("Такого этажа в этом доме нет");
            startgame();
        }
        return null;
    }

// Проверка и возвращение определенной квартиры
    public Apartment checkApartment(){
        Floor floor = checkFloor();
        System.out.println("Какая квартира на данном этаже вас интересует?");
        try {
            return floor.getApartment(checkAnswer());
        } catch (Exception e) {
            System.out.println("Такой комнаты в этом доме нет");
            startgame();
        }
        return null;
    }

// Проверка и возвращение определенной комнаты
    public Room checkRoom(){
        Apartment apartment = checkApartment();
        System.out.println("Какая комната в данной квартире вас интересует?(выберете номер) ( KITCHEN, CANTEEN, TOILET, LIVING_ROOM, BEDROOM1, BEDROOM2, BEDROOM3 )");
        return checkTypeRoom(checkAnswer(), apartment);

    }

// Определенный запрос к нужной комнате (не хватила сил на поиск другого способа)
    public Room checkTypeRoom(int answer, Apartment apartment){
        switch (answer){
            case 1:
                return apartment.getRooms(TypeRoom.KITCHEN);
            case 2:
                return apartment.getRooms(TypeRoom.CANTEEN);
            case 3:
                return apartment.getRooms(TypeRoom.TOILET);
            case 4:
                return apartment.getRooms(TypeRoom.LIVING_ROOM);
            case 5:
                return apartment.getRooms(TypeRoom.BEDROOM1);
            case 6:
                return apartment.getRooms(TypeRoom.BEDROOM2);
            case 7:
                return apartment.getRooms(TypeRoom.BEDROOM3);
            default:
                System.out.println("Такой комнаты здесь нет");
                startgame();
                break;
        }
        return null;
    }

    public Game(House house) {
        this.house = house;
    }
}
