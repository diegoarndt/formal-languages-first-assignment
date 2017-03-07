package utils;

import java.util.List;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextFilesHelper {

    private String text;

    public String getFileContent(String fileName) {
        try {
            text = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return text;
    }

    public String[] getFileNames() {
        Path folder = Paths.get("test");
        List<String> fileNames = new ArrayList<>();
        
        try (DirectoryStream<Path> files = Files.newDirectoryStream(folder, "*.txt")) {
            fileNames.add("None");
            files.forEach(file -> {
                fileNames.add(file.getFileName().toString().replace(".txt", ""));
            });
        }
        catch (IOException ex) {
            Logger.getLogger(TextFilesHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileNames.toArray(new String[fileNames.size()]);
    }
}
