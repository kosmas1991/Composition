public class Room {
    private int doors;
    private String wall_colors;
    private int walls;
    private People people;
    private Lamp lamp;

    public int getDoors() {
        return doors;
    }

    public String getWall_colors() {
        return wall_colors;
    }

    public int getWalls() {
        return walls;
    }

    public People getPeople() {
        return people;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Room(int doors, String wall_colors, int walls, People people, Lamp lamp) {
        this.doors = doors;
        this.wall_colors = wall_colors;
        this.walls = walls;
        this.people = people;
        this.lamp = lamp;
    }

    public void roomMethod() {
        System.out.println("To dwmatio methodos");
    }
}
