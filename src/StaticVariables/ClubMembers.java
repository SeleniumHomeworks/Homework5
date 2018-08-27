package StaticVariables;

public class ClubMembers {

    String first;
    String last;
    static int members;

    public ClubMembers(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.println(fn +" " + ln+ " "+  "member number: " + members);
    }





}
