package working_with_files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSeparatorDemo {

    static String filePath = "java-17-playbook/src/main/resources/modules.txt"; // USE this separator always
    static String filePath2 = "java-17-playbook\\src\\main\\resources\\modules.txt";

    public static void main(String[] args) {

        String separator = File.separator;
        String path = "resources" + separator + "modules.txt";
        System.out.println(path);

        System.out.println(Files.exists(Path.of(filePath)));
        System.out.println(Files.exists(Path.of(filePath2)));
    }

}
