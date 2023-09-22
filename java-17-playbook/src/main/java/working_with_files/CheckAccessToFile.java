package working_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CheckAccessToFile {

    static String filePath = "java-17-playbook/src/main/resources/modules.txt";

    public static void main(String[] args) throws IOException {

        Path file = Path.of(filePath);

        if (isFileAccessible(file)) {
            System.out.println(Files.readString(file));
        }
    }

    public static boolean isFileAccessible(Path file) {
        return Files.isRegularFile(file) && Files.isReadable(file);
    }
}
