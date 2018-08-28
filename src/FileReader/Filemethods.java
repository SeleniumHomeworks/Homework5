package FileReader;

import java.io.File;
import java.util.Scanner;

public class Filemethods {

    private Scanner x;

    public void OpenFile() {

        try {
            x = new Scanner(new File("/Users/luiscabrera/Documents/myfirstfile.txt"));
        } catch (Exception e) {

            System.out.println("could not find doc");
        }
    }
        public void ReadFile(){

        while(x.hasNext()){

            String a = x.next();

            System.out.println(a);
        }
    }

    public void CloseFile (){
        x.close();
    }




}
