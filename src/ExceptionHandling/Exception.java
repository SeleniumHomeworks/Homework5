package ExceptionHandling;

public class Exception {
    public static void main(String[] args) {

        try {
            int x = 23;
            int y = x / 0;

        } catch (java.lang.Exception ex) {

            System.out.println("error");
        }
    }}