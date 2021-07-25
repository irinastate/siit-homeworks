package ro.siitproject.homeworks.homework_9_10;

public class Models extends Brands {
    private String imei;
    private String color;
    private String material;

    public Models() {
    }

    public Models(String imei, String color, String material) {
        this.imei = imei;
        this.color = color;
        this.material = material;
    }
}
