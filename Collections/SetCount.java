import java.util.*;

public class SetCount {
  public static void main(String[] args) {
    String str = "Hello World";
    Set<Character> set = new LinkedHashSet<>();

    for (char c : str.toCharArray()) {
      if (c != ' ') {
        set.add(c);
      }
    }

    System.out.println(set);
  }
}
