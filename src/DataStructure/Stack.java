package DataStructure;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<String> fl = new java.util.Stack<>();

        fl.push("miami");
        fl.push("Broward");
        fl.push("west palm");
        fl.push("tampa");

        for(String Counties : fl){

            System.out.println(Counties);
        }
    }

}
