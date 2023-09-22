package working_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFile {

    static String resources = "java-17-playbook/src/main/resources/";
    static Path filePath = Path.of(resources + "modules.txt");
    static Path filepath2 = Path.of(resources + "modules_copied.txt");

    public static void main(String[] args) throws IOException {

        if (!Files.exists(filepath2)) {
            Files.copy(filePath, filepath2);
        }

        //if you want to replace content in file use
        Files.copy(filePath, filepath2, StandardCopyOption.REPLACE_EXISTING);

    }
}
