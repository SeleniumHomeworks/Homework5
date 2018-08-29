package Strings;

public class StringMethods {
    public static void main(String[] args) {

     String Goal = "Finish Selenium course on A";
     String Goal2 = "Be a Great Selenium tester";

        System.out.println(Goal.charAt(3));
        System.out.println(Goal.toLowerCase());
        System.out.println(Goal.toUpperCase());
        System.out.println(Goal2.length());
        System.out.println(Goal2.compareToIgnoreCase(Goal2));
        System.out.println(Goal2.isEmpty());
        System.out.println(Goal.codePointBefore(3));
        System.out.println(Goal2.toString());
        System.out.println(Goal2.substring(6));
        System.out.println(Goal.codePointBefore(4));
        System.out.println(Goal.getBytes());
        System.out.println(Goal.codePoints());
        System.out.println(Goal.endsWith("r"));
        System.out.println(Goal2.chars());
        System.out.println(Goal.hashCode());
        System.out.println(Goal.toCharArray());
        System.out.println(Goal2.replace("r", "a"));
        System.out.println(Goal.intern());
        System.out.println(Goal.matches("A"));
        System.out.println(Goal2.contains("M"));
        System.out.println(Goal2.trim());

    }


}
