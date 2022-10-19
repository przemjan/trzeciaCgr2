public class StringiDemo {
    public static void main(String[] args) {

        String name = "Franek";

        int dlugosc = name.length();

        System.out.println(dlugosc);

        char inicjal = name.charAt(3);

        System.out.println(inicjal);

        String male, duze;

        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println(name + ", " + duze);

    }
}
