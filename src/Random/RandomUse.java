package Random;

import java.util.Random;

public class RandomUse {
    public static void main(String[] args) {
        Random rd = new Random();

        int value;
        for(int x=1; x<20; x++){
            value = rd.nextInt(25);
            System.out.println(value + " this program is generating random numbers");
        }


    }

}
