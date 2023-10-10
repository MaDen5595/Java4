package Practika4;

public class ComputerTest {
    public static void main(String[] args) {
        Computer mine = Computer.ASUS;
        System.out.println(mine.getMemory().toString());
        ComputerMemory mem = new ComputerMemory("Custom", "Custom", 12,3.5,true);
        mine.setMemory(mem);
        System.out.println(mine.getMemory().toString());
        for(Computer c: Computer.values()){
            System.out.println(c);
            System.out.println(c.getProcessor().toString());
            System.out.println(c.getMemory().toString());
            System.out.println(c.getMonitor().toString());
        }
    }
}
