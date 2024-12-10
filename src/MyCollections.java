import java.util.List;
import java.util.Comparator;

public class MyCollections {

    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = list.get(mid).compareTo(key);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = c.compare(list.get(mid), key);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

