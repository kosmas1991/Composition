public class Main {
    public static void main(String[] args) {
        Hair midasHair = new Hair(4000000, "black");
        People midas = new People("Kosmas", "male", midasHair);
        Lamp lampa = new Lamp(30, "white");
        Room room = new Room(1, "pink", 4, midas, lampa);
        room.getPeople().peopleMethod();
        room.getLamp().lampMethod();
        room.getPeople().peopleMethod();

    }
}
