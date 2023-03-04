package cv_builder_package;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class TxtCVPrinter {
    public static void printCV(String filePath, String cvContent){

        Path path = Paths.get(filePath); 
 
        try {
            Files.writeString(path, cvContent,StandardCharsets.UTF_8);
        }catch (IOException ex) {
            System.out.print("Invalid Path! CV hasn't been saved.");
        }

    }
}
