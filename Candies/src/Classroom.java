public class Classroom {
    public static void main(String[] args) {
        Wilder jean = new Wilder("Jean", true);
        Wilder henri = new Wilder("Henri", false);
        System.out.println(jean.whoAmI());
        System.out.println(henri.whoAmI());
    }
}
