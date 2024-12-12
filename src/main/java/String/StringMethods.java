package String;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //String s = "welcome"; to create normal variable
        String s = new String("welcome"); // to create using object

        //methods available for string
        //1) length() returns the length of the string
        System.out.println(s.length());

        //2) Concat() - join two strings, we can do concatination using + symbol
        String s1 = "welcome";
        String s2 = " to Java";
        String s3 = " automation";
        System.out.println(s1.concat(s2).concat(s3));

        //3) trim() - remove space right and left side of the string
        String s4 = "    nanda   ";
        System.out.println(s4.length());
        System.out.println(s4.trim().length());

        //charAt() - returns character of string based on index
        String s5 = "kumar";
        System.out.println(s5.charAt(3));

        //contains() - to check if the particular string contains the string which we search returns boolean value
        String s6 = "Greatest of all time";
        System.out.println(s6.contains("time"));

        //equals(), equalIgnoreCase - to compare two strings
        String s7 = "Vijay";
        System.out.println(s7.equals("Vijay"));
        System.out.println(s7.equalsIgnoreCase("vijay"));

        // replace - to replace single/ multiple characters in a string

        String s8 = "welcome to selenium java and python";
        System.out.println(s8.replace('e', 'a'));
        System.out.println(s8.replace("python","javascript"));

        //substring() - extarct the values based on index
        //toUpperCase()
        //toLowerCase()

        //split() - split the string into multiple parts based on delimeter

        String s9 = "ajkumar@gmail.com";
        String[] splitEmail = s9.split("@");
        System.out.println(Arrays.toString(splitEmail));
        System.out.println(splitEmail[1]);



    }
}
