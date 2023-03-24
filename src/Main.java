public class Main {
    public static long currentWorldPopulation = 7811080815L;
    public static int carsProducedThisYear = 2023;
    public static char firstLetterInAlphabet = 'A';
    public static boolean javaIsAmazing = true;
    public static float pi = 3.14159F;

    public static void main(String[] args) {

        double price = 50.5;
        double tax = 10.5;
        int quantity = 250;
        double total;

        String message = "I want to buy " + quantity + " shirt!";
        total = price * tax * quantity;


        System.out.println("Hello Java World!");

        System.out.println("_______________________________________________");
        System.out.println("Nr total al Populatiei de pe glob = " + currentWorldPopulation);
        System.out.println("Anul Producerii Masinii este: " + carsProducedThisYear);
        System.out.println("Prima Litera din Alfabet este: " + firstLetterInAlphabet);
        System.out.println("Java is Amazing - " + javaIsAmazing);
        System.out.println("Valoarea lui Pi este: " + pi);

        System.out.println("_______________________________________________");
        System.out.println(message);
        System.out.println("Total cost is: " + total);

        System.out.println("_______________________________________________");
        System.out.println("Multumesc mult!");
    }
}