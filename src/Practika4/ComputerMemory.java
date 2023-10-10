package Practika4;

public class ComputerMemory {
    private String brand;
    private String model;
    private int gb;
    private double frec;
    private boolean rgb;
    public ComputerMemory(String brand, String model, int gb, double frec, boolean rgb){
        this.brand = brand;
        this.model = model;
        this.gb = gb;
        this.frec = frec;
        this.rgb = rgb;
    }
    public ComputerMemory(String brand, String model, int gb, double frec){
        this.brand = brand;
        this.model = model;
        this.gb = gb;
        this.frec = frec;
        this.rgb = false;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getFrec() {
        return frec;
    }

    public int getGb() {
        return gb;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFrec(double frec) {
        this.frec = frec;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
    public String toString() {

        return "Память - бренд: " + brand
                + ", модель: " + model
                + ", частота: " + frec
                + " ГГц, память: " + gb
                + " Гб, начиличе подстветки: " + rgb;
    }
}
