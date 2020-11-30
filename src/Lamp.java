public class Lamp {
    private int watt;
    private String lightColor;

    public int getWatt() {
        return watt;
    }

    public String getLightColor() {
        return lightColor;
    }

    public Lamp(int watt, String lightColor) {
        this.watt = watt;
        this.lightColor = lightColor;
    }

    public void lampMethod() {
        System.out.println("Lampater method");
    }
}
