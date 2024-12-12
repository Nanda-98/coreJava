package String;

public class MutableImmutable {
    public static void main(String[] args) {
        String name = "welcome";
        System.out.println(name);
        System.out.println(name.concat("To Java")); // even if we concatinate a string to name the name is not modified
        System.out.println(name);

        StringBuilder name1 = new StringBuilder("welcome");
        System.out.println(name1);
        name1.append("To Java");
        System.out.println(name1);// the stringBuffer and string builder allow us to modify the string name1 so it is mutable
    }

}
