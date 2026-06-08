import java.util.*;
import java.util.stream.Stream;

public class Basic {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(10, 15, 6, 7, 8, 9);

    Stream<Integer> data = nums.stream();

    // Stream<Integer> sortedData = data.sorted();

    // sortedData.forEach(n -> System.out.println(n));
    // // data.forEach(n -> System.out.println(n));

    // double the values
    Stream<Integer> doubleData = data.map(n -> n * 2);

    doubleData.forEach(n -> System.out.println(n));

  }
}
