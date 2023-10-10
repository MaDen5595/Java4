package Practika4;

public class ComputerProcessor {
    private String brand;
    private String model;
    private int cores;
    private double frec;
    private int temp;
    public ComputerProcessor(String brand, String model, int cores, double frec, int temp){
        this.brand = brand;
        this.model = model;
        this.cores = cores;
        this.frec = frec;
        this.temp = temp;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCores() {
        return cores;
    }

    public int getTemp() {
        return temp;
    }
    public double getFrec() {
        return frec;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setFrec(double frec) {
        this.frec = frec;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    public String toString() {
        return "Процессор - бренд: "+brand
                +", модель: "+model
                +", количество ядер: "+cores
                +", частота: "+frec
                +" ГГц, энергопотребление: "+temp
                +" Вт";
    }
}
