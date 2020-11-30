public class People {
    private String name;
    private String sex;
    private Hair hair;

    private String getName() {
        return name;
    }

    private String getSex() {
        return sex;
    }

    private Hair getHair() {
        return hair;
    }

    public People(String name, String sex, Hair hair) {
        this.name = name;
        this.sex = sex;
        this.hair = hair;
    }

    public void peopleMethod() {
        System.out.println("People method calling etc ...");
        System.out.printf("ton antrwpo ton lene %s kai einai %s\n", name, sex);
    }
}
