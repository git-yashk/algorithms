package algorithms.search;

public class BinarySearch {

    /**
     * Searches for the index of a target element in an array sorted in
     * non-decreasing order using
     * <a href="https://en.wikipedia.org/wiki/Binary_search">binary search</a>
     * algorithm.
     * 
     * @param array  The array of integers sorted in non-decreasing order.
     * @param target The value to search for in the {@code array}.
     * @return The index of the {@code target} element if found, {@code -1}
     *         otherwise.
     */

    public static int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (array[mid] == target) {
                return mid;
            }
            if (target < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9 };
        int target = 3;
        int index = search(array, target);
        System.out.println(index);
    }

}
