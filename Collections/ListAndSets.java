import java.util.*;

public class ListAndSets {

  // Given a List<String> with duplicate names, write code to remove duplicates
  // while preserving insertion order.

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob", "David");

    Set<String> set = new LinkedHashSet<>(names);

    List<String> uniqueNames = new ArrayList<>(set);

    System.out.println(names);
    System.out.println(uniqueNames);

  }
}
