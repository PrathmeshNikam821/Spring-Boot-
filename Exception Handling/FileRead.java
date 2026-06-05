import java.util.*;
import java.io.*;

public class FileRead {
  public static List<Integer> readIntegerFromFile(String fileName) {
    List<Integer> numbers = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = reader.readLine()) != null) {
        try {
          int value = Integer.parseInt(line.trim());
          numbers.add(value);
        } catch (NumberFormatException e) {
          System.out.println("Skipping invalid integer line " + line);
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found ");
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }

    return numbers;

  }

  public static void main(String[] args) {
    List<Integer> result = readIntegerFromFile("data.txt");
    System.out.println(result);
  }
}
