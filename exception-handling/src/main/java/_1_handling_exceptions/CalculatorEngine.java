package _1_handling_exceptions;

import common.Calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculatorEngine {

    public static void main(String[] args) {
        String file = "demo-calculations.txt";

        try (BufferedReader reader = new BufferedReader(
                new FileReader("exception-handling/src/main/resources/" + file))) {
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                Calculator.performOperation(inputLine);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
