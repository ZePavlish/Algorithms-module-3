import java.util.Comparator;

public class MyArrays {

    public static int binarySearch(byte[] a, byte key) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int left = fromIndex;
        int right = toIndex - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(char[] a, char key) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int left = fromIndex;
        int right = toIndex - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(double[] a, double key) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int left = fromIndex;
        int right = toIndex - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(float[] a, float key) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int left = fromIndex;
        int right = toIndex - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int key) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int left = fromIndex;
        int right = toIndex - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(long[] a, long key) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int left = fromIndex;
        int right = toIndex - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(short[] a, short key) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int left = fromIndex;
        int right = toIndex - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Реализация бинарного поиска для объектов с использованием Comparator
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = c.compare(a[mid], key);
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

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        int left = fromIndex;
        int right = toIndex - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = c.compare(a[mid], key);
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

