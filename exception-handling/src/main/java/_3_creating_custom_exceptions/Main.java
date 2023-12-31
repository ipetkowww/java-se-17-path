package _3_creating_custom_exceptions;

import common.Calculator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            processFile(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + args[0]);
        } catch (IOException ex) {
            System.out.println("Error - " + ex.getMessage());
        } catch (InvalidStatementException ex) {
            System.out.println("Error invalid statement - " + ex.getMessage());
            if (ex.getCause() != null) {
                System.out.println("  caused by " + ex.getCause());
            }
        } catch (Exception ex) {
            System.out.println("Error processing file - " + ex.getMessage());
        }
    }

    private static void processFile(BufferedReader reader) throws IOException, InvalidStatementException {
        String inputLine;
        while ((inputLine = reader.readLine()) != null) {
            Calculator.performOperation(inputLine);
        }
    }

}

