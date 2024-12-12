package String;

public class ReverseString {
    public static void main(String[] args) {
        String correct = "Welcome";
        String reverse = "";
        for(int i = correct.length()-1;i>=0;i--){
            reverse += correct.charAt(i);
        }
        System.out.println(reverse);
    }
}
