package working_with_files;

import java.nio.file.Path;

public class GetCurrentDirectory {

    public static void main(String[] args) {

        // you have to know base directory and from there construct your path
        System.out.println(System.getProperty("user.dir"));
        System.out.println(Path.of("").toAbsolutePath());
    }
}
