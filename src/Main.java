public class Main {
    public static void main(String[] args) {
        System.out.print("For 10, expected 1010, is: ");
        Converter converter = new Converter(10);

        System.out.print("For 2137, expected 100001011001, is: ");
        new Converter(2137);

        System.out.print("For 2, expected 10, is: ");
        new Converter(2);

        System.out.print("For 1, expected 1, is: ");
        new Converter(1);

        System.out.print("For 54, expected 110110, is: ");
        new Converter(54);

        System.out.print("For 55, expected 110111, is: ");
        new Converter(55);

        System.out.print("For 71830, expected 10001100010010110, is: ");
        new Converter(71830);

    }
}