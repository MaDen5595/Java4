package Practika4;

enum Wremena {
    SUMMER(19.4){
        @Override        public void getDescription(){
            System.out.println("Тёплое время года");        }
    },
    WINTER(-56.9),
    AUTUMN(30.3),
    SPRING(-123.5);
    private double tem;
    Wremena(double tem){
        this.tem = tem;
    }

    public void myFavSeason(Wremena a){
        switch(a){
            case AUTUMN -> System.out.println("Люблю осень");
            case SPRING -> System.out.println("Люблю весну");
            case SUMMER -> System.out.println("Люблю лето");
            case WINTER -> System.out.println("Люблю зиму");
        }
    }
    public void getDescription(){
        System.out.println("Холодное время года");
    }

    public double getTem() {return tem;}
}
