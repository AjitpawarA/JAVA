package Relationships.HAS_A.Composition;

class Battery{
    int battwt;
    String Battrycomp;

    Battery(int battwt, String Battrycomp){
        this.battwt=battwt;
        this.Battrycomp=Battrycomp;
    }
}

class Mobile{
    String Mcomp;
    int Mprice;
    Battery b;

    Mobile(String Mcomp, int Mprice, Battery b){
        this.Mcomp=Mcomp;
        this.Mprice=Mprice;
        this.b=b;
    }
}

public class Composition {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 50000, new Battery(5000, "tata"));
        System.out.println(m1.Mcomp);
        System.out.println(m1.Mprice);
        System.out.println(m1.b.Battrycomp);
        System.out.println(m1.b.battwt);
    }
}
