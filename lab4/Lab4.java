class IcecreamA {
    String icecreamType;
    String icecreamCompany;
    double icecreamPrice;

    IcecreamA() {
    };

    IcecreamA(String iType, String iCompany, double iPrince) {
        icecreamType = iType;
        icecreamCompany = iCompany;
        icecreamPrice = iPrince;
    };

    public String toString() {
        return "Icecream Type: " + icecreamType + "\n" + "Icecream Company: " + icecreamCompany + "\n"
                + "Icecream Price: " + icecreamPrice + " Tk.";
    }

}

class Icecream {
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    Icecream() {
        icecreamPrice = 0;
    };

    void setIcecreamType(String iType) {
        icecreamType = iType;
    }

    void setIcecreamCompany(String iCompany) {
        icecreamCompany = iCompany;
    }

    void setIcecreamPrice(double iPrice) {
        icecreamPrice = iPrice;
    }

    String getIcecreamType() {
        return icecreamType;
    }

    String getIcecreamCompany() {
        return icecreamCompany;
    }

    double getIcecreamPrice() {
        return icecreamPrice;
    }

    boolean equals(Icecream I) {
        if (this.getIcecreamPrice() == I.getIcecreamPrice()) {
            return true;
        } else {
            return false;
        }

    }

    int compareTo(Icecream I) {
        if (this.getIcecreamPrice() > I.getIcecreamPrice()) {
            return 1;
        } else if (this.getIcecreamPrice() == I.getIcecreamPrice()) {
            return 0;
        } else {
            return -1;
        }
    }

}

public class Lab4 {
    public static void main(String[] args) {
        /* A & B */
        IcecreamA i1 = new IcecreamA();
        IcecreamA i2 = new IcecreamA("Cone", "Polar", 70);

        System.out.println("Icecream 1");
        System.out.println(i1.toString());
        System.out.println();
        System.out.println("Icecream 2");
        System.out.println(i2.toString());

        /* C */

        Icecream i3 = new Icecream();
        i3.setIcecreamCompany("Igloo");
        i3.setIcecreamType("Chocbar");
        i3.setIcecreamPrice(50);
        System.out.println();
        System.out.println("Icecream 3");
        System.out.println("Iceream type : " + i3.getIcecreamType());
        System.out.println("Iceream company : " + i3.getIcecreamCompany());
        System.out.println("Iceream price : " + i3.getIcecreamPrice() + "Tk.");

        /* D */

        Icecream i4 = new Icecream();
        i4.setIcecreamType("Cup");
        i4.setIcecreamCompany("Savoy");
        i4.setIcecreamPrice(50);

        System.out.println();
        System.out.println("Icecream 4");
        System.out.println("Iceream type : " + i4.getIcecreamType());
        System.out.println("Iceream company : " + i4.getIcecreamCompany());
        System.out.println("Iceream price : " + i4.getIcecreamPrice() + "Tk.");

        Icecream i5 = new Icecream();
        i5.setIcecreamType("Cone");
        i5.setIcecreamCompany("Bloop");
        i5.setIcecreamPrice(60);

        System.out.println();
        System.out.println("Icecream 5");
        System.out.println("Iceream type : " + i5.getIcecreamType());
        System.out.println("Iceream company : " + i5.getIcecreamCompany());
        System.out.println("Iceream price : " + i5.getIcecreamPrice() + "Tk.");

        System.out.println();

        System.out.println("Icecream 4 and 5 are equal in terms of price : " + i4.equals(i5));
        System.out.println("Comparing price of Icecream 4 and 5  : " + i4.compareTo(i5));

    }

}
