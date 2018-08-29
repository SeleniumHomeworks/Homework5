package Strings;

public class StringM {
    public static void main(String[] args) {
        String x = "its me";
        String y = "is not me";
        System.out.println(x.indexOf("e"));
        System.out.println(y.compareTo(x));
        System.out.println(x.concat(y));
        System.out.println(y.equalsIgnoreCase(x));
        System.out.println(x.endsWith("m"));
        System.out.println(y.startsWith("i"));
        System.out.println(x.compareToIgnoreCase(y));
        System.out.println(y.codePointAt(3));
        System.out.println(x.codePoints());
        System.out.println(y.codePointCount(4,7));
    }
}
