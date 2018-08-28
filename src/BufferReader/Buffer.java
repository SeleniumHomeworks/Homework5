package BufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {

    public static void main(String[] args) throws IOException {
        FileReader fr = null;

        BufferedReader br = null;
        String path = "";
        try {

            fr = new FileReader("/Users/luiscabrera/Documents/myfirstfile.txt");

        } catch (Exception ex) {
            System.out.println("file is not found");

        }
        try {
            br = new BufferedReader(fr);
            String value = "";
            while ((value = br.readLine()) != null) {
                System.out.println("value");
            }
        } catch (Exception ex) {

            System.out.println("Document could not be written");


        }
        finally{
            if(fr != null){
                fr.close();
            }
            if(br != null){
                br.close();
            }
        }

    }

}





