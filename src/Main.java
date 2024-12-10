import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Пример для массива
        int[] numbers = {1, 2, 3, 4, 5};
        int result = MyArrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + result); // Output: Index of 3: 2

        // Пример для списка
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        int resultList = MyCollections.binarySearch(names, "Bob");
        System.out.println("Index of Bob: " + resultList); // Output: Index of Bob: 1
    }
}

