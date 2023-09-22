package working_with_files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ReadBigTextFile {

    static String filePath = "java-17-playbook/src/main/resources/modules.txt";

    public static void main(String[] args) {
        printWithBufferedReader(filePath);
        System.out.println("======");
        printWithStream(filePath);
    }

    public static void printWithBufferedReader(String path) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static void printWithStream(String path) {
        try (Stream<String> lines = Files.lines(Path.of(path))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
