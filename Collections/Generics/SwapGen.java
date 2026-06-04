
import java.util.*;

public class SwapGen {

  public static <T> void swap(T[] array, int i, int j) {
    if (array == null || i < 0 || j < 0 || i >= array.length || j >= array.length) {
      throw new IllegalArgumentException("Invalid array or indices");
    }

    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void main(String[] args) {

    // test with integer[]
    Integer[] intArray = { 10, 20, 30, 40, 50 };
    System.out.println("Before swap (Integer):" + Arrays.toString(intArray));
    swap(intArray, 1, 3);
    System.out.println("After swap" + Arrays.toString(intArray));

    // test with string[]
    String[] strArray = { "apple", "banana", "cherry", "date" };
    System.out.println("Before swap (String):" + Arrays.toString(strArray));
    swap(strArray, 1, 3);
    System.out.println("After swap" + Arrays.toString(strArray));

  }
}
