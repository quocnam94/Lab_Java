import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Path path = FileSystems.getDefault().getPath("C:\\Users\\A315-57G\\IdeaProjects\\Lab 16");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path file : stream) {
                if (!Files.isDirectory(file)) {
                    System.out.println(file.getFileName());
                }
            }
        }
    }
}