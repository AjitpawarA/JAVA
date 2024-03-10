package Relationships.HAS_A.Aggregation;


class Sim{
    String simcompany;
    long simno;

    Sim(String simcompany, long simno){
        this.simcompany=simcompany;
        this.simno=simno;
    }
}

class Mobile{
    String MobComp;
    int mobprice;
    Sim s1;

    Mobile(String MobComp, int mobprice){
        this.mobprice=mobprice;
        this.MobComp=MobComp;
    }

    public void toprint(Sim s1){
        this.s1=s1;
        System.out.println("Sim Company : "+s1.simcompany);
        System.out.println("Sim No - "+ s1.simno);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("VIVO", 10000);
        System.out.println("Company ="+m1.MobComp);
        System.out.println("Price ="+m1.mobprice);
        m1.toprint(new Sim("JIO", 15875545));
    }
}
