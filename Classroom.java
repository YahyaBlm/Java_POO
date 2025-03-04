
public class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Teddy", true);
        Wilder wilder2 = new Wilder("Charles", false);
        Wilder wilder3 = new Wilder("Yaya", true);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
    }
}
