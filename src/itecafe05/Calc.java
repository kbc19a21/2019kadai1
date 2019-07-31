package itecafe05;

public class Calc {

    private static final double TAX = 1.08;

    public static int calculation(Food f, int c) {
        return (int) (f.getPrice() * c * TAX);
    }
}
