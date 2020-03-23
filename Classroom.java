public class Classroom{


    public static void main(String[] args){
        Wilder jc = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);
        Wilder morgan = new Wilder("Morgan", true);
        Wilder pierre = new Wilder("Pierre", false);

        System.out.println(jc.whoAmI());
        System.out.println(henri.whoAmI());
        System.out.println(morgan.whoAmI());
        System.out.println(pierre.whoAmI());
    }
}