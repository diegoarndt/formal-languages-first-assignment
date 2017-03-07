package Controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextReader {

    private String text;
    
    public String getFileContent(String filename){
        try {
            text = new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return text;
    }
}