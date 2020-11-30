public class Hair {
    public int getNoOfTrixes() {
        return noOfTrixes;
    }

    public String getColor() {
        return color;
    }

    public Hair(int noOfTrixes, String color) {
        this.noOfTrixes = noOfTrixes;
        this.color = color;
    }

    private int noOfTrixes;
    private String color;

    public void hairMethod(){
        System.out.println("Hair method");
    }
}
