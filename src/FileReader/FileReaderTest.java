package FileReader;

public class FileReaderTest {

    public static void main(String[] args) {

        Filemethods read = new Filemethods();
        read.OpenFile();
        read.ReadFile();
        read.CloseFile();
    }
}
