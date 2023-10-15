package Practika4;
import java.util.Objects;
import java.util.Scanner;
public class ComputerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите компьютер из следующих(напишите его название) - HP, Asus, MSI, Lenovo, Acer");
        String c = scan.nextLine();
        Computer mine = Computer.HP;
        switch(c){
            case("HP") -> mine = Computer.HP;
            case("Asus") -> mine = Computer.ASUS;
            case("MSI") -> mine = Computer.MSI;
            case("Lenovo") -> mine = Computer.LENOVO;
            case("Acer") -> mine = Computer.ACER;
        }
        System.out.println("Хороший выбор, вот память вашего компьютера");
        System.out.println(mine.getMemory().toString());
        System.out.println("Память хорошая, но мы её заменим на следующую:");
        ComputerMemory mem = new ComputerMemory("Custom", "Custom", 12,3.5,true);
        mine.setMemory(mem);
        System.out.println(mine.getMemory().toString());
    }
}
