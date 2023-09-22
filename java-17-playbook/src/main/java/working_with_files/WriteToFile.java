package working_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteToFile {

    static String filePath = "java-17-playbook/src/main/resources/write_to_me.txt";

    public static void main(String[] args) throws IOException {
        Files.writeString(Path.of(filePath), "some str\n");

//        Files.writeString(Path.of(filePath), "another str\n", StandardOpenOption.CREATE_NEW);
        Files.writeString(Path.of(filePath), "another str\n", StandardOpenOption.APPEND);

    }

}
