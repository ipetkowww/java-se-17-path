package working_with_files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileToPathConversion {

    static String filePath = "java-17-playbook/src/main/resources/modules.txt";

    public static void main(String[] args) {
        File file = new File(filePath);
        System.out.println(file.exists());

        Path path = Path.of(filePath);
        System.out.println(Files.exists(path));

        //convert file to a path
        Path path2 = file.toPath();
        System.out.println(Files.exists(path2));
    }
}
