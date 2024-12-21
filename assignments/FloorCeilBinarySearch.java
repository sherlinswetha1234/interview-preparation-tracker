import java.util.Arrays;

public class FloorCeilBinarySearch {

    public static int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int floor = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }

    public static int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ceil = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ceil;
    }

    public static int[] findFloorAndCeil(int[] arr, int x) {
        Arrays.sort(arr);
        int floor = findFloor(arr, x);
        int ceil = findCeil(arr, x);
        return new int[] { floor, ceil };
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 9, 6, 5, 5, 6 };
        int x = 7;
        int[] result = findFloorAndCeil(arr, x);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
    }
}
