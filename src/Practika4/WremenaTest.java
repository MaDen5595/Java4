package Practika4;

public class WremenaTest {
    public static void main(String[] args) {
        Wremena fav = Wremena.AUTUMN;
        fav.myFavSeason(fav);
        fav.getDescription();
        Wremena fav1 = Wremena.SUMMER;
        fav1.getDescription();
        for(Wremena w : Wremena.values()){
            System.out.print(w+" "+w.getTem()+" ");
            w.getDescription();
        }
    }
}
