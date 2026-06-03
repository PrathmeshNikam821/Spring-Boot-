import java.util.*;

public class MapFreq {
  public static void main(String[] args) {
    String sentence = "Java Spring Java Boot Spring Data";
    String[] words = sentence.split(" ");

    Map<String, Integer> map = new HashMap<>();

    for (String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);

    }

    System.out.println(map);

  }

}
