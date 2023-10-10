package Practika4;

public class ComputerMonitor {
    private double size;
    private int fps;
    private String format;
    public ComputerMonitor(double size, int fps, String format){
        this.fps = fps;
        this.format = format;
        this.size = size;
    }
    public ComputerMonitor(double size, int fps){
        this.fps = fps;
        this.format = "full hd";
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public int getFps() {
        return fps;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public String toString() {
        return "Монитор - диагональ: "+size+
                ", Герцовка: "+fps+
                " Гц, Разрешение: "+format;
    }
}
