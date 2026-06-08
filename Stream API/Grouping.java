import java.util.*;
import java.util.stream.Collectors;

public class Grouping {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("Cat", "house", "dog", "tree", "bird");
    Map<Integer, List<String>> groupByLength = words.stream()
        .collect(Collectors.groupingBy(String::length));

    groupByLength.forEach((length, wordList) -> System.out.println(length + " ->" + wordList));
  }
}
