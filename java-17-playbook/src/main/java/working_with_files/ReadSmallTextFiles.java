package working_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadSmallTextFiles {

    static String filePath = "java-17-playbook/src/main/resources/modules.txt";

    public static void main(String[] args) throws IOException {
        System.out.println(readSmallFile(filePath));
        System.out.println(readLineByLine(filePath));
    }

    public static String readSmallFile(String pathToFile) throws IOException {
        return Files.readString(Path.of(pathToFile));
    }

    public static List<String> readLineByLine(String pathToFile) throws IOException {
        return Files.readAllLines(Path.of(pathToFile));
    }
 }
