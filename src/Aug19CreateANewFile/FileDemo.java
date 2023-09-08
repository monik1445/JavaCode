package Aug19CreateANewFile;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {

        File file = new File("Pragra.txt");

        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
