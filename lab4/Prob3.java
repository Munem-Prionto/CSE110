class Fraction {
    private int numerator;
    private int denominator;
    int result;

    /* contrustor */
    public Fraction(int num, int deno) {
        numerator = num;
        denominator = deno;
    }

    /* setters */
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /* setters */
    public void setNumerator(int num) {
        numerator = num;
    }

    public void setDenominator(int deno) {
        denominator = deno;
    }

    public String toString() {
        return numerator + "/" + denominator;

    }

    public void add(Fraction fraction) {
        setNumerator(this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator());
        setDenominator(this.getDenominator() * fraction.getDenominator());

    }

    public void sub(Fraction fraction) {
        setNumerator(this.getNumerator() * fraction.getDenominator() - fraction.getNumerator() * this.getDenominator());
        setDenominator(this.getDenominator() * fraction.getDenominator());

    }

    public void multiplication(Fraction fraction) {
        setNumerator(this.getNumerator() * fraction.getNumerator());
        setDenominator(this.getDenominator() * fraction.getDenominator());
    }

    public void division(Fraction fraction) {
        setNumerator(this.getNumerator() * fraction.getDenominator());
        setDenominator(this.getDenominator() * fraction.getNumerator());
    }

}

public class Prob3 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(3, 5);
        System.out.print(f1.toString() + " + " + f2.toString() + " = ");
        f1.add(f2);
        System.out.println(f1.toString());

        f1.setNumerator(4);
        f1.setDenominator(7);
        System.out.print(f1.toString() + " - " + f2.toString() + " = ");
        f1.sub(f2);
        System.out.println(f1.toString());

        f1.setNumerator(1);
        f1.setDenominator(3);
        System.out.print(f1.toString() + " * " + f2.toString() + " = ");
        f1.multiplication(f2);
        System.out.println(f1.toString());

        f1.setNumerator(1);
        f1.setDenominator(3);
        System.out.print(f1.toString() + " / " + f2.toString() + " = ");
        f1.division(f2);
        System.out.println(f1.toString());
    }
}
