import java.util.*;

class FindingNemo {
    public static void subarray(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            for (int j = i; j < marks.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(marks[k] + " ");
                }
                System.out.println(); // move to the next line after printing subarray
            }
        }
    }

    public static void main(String[] args) {
        int marks[] = {55, 67, 99};
        subarray(marks);
    }
}
