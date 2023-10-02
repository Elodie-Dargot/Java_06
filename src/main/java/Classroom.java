public class Classroom {

    public static void main(String[] args) {

        Wilder elodie = new Wilder("Elodie", true);

        Wilder sauron = new Wilder("Sauron", false);

        elodie.setAware(true);
        System.out.println( elodie.whoAmI());

        System.out.println( sauron.whoAmI());
    }
}