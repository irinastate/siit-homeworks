package ro.siitproject.homeworks.homework_9_10;

public abstract class Apple extends Brands {
    private String phoneColor;
    private String phoneMaterial;
    private String imei;

    public Apple() {
    }

    public Apple(String phoneColor, String phoneMaterial, String imei) {
        this.phoneColor = phoneColor;
        this.phoneMaterial = phoneMaterial;
        this.imei = imei;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }

    public String getPhoneMaterial() {
        return phoneMaterial;
    }

    public void setPhoneMaterial(String phoneMaterial) {
        this.phoneMaterial = phoneMaterial;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
