public class Castingproblem {
    public static void main(String[] args) {
        int largeNumber = 130;
        byte smallNumber =(byte)largeNumber; // Explicit casting from int to byte
        System.out.println("Original integer value: " + largeNumber);
        System.out.println("Casted byte value: " + smallNumber);
    }
}

