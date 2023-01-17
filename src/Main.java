import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        tasks();
    }

    public static void tasks() {
        System.out.println("task1 + task2:");
        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = {"one", "two", "three", "four"};

        for (int i = 0; i < array1.length; i++) {
            System.out.print((i == 2) ? array1[i] : array1[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print((i == 2) ? array2[i] : array2[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print((i == 3) ? array3[i] : (array3[i] + ", "));
        }
        System.out.println();
        System.out.println();
        System.out.println("task3:");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print((i == 0) ? array1[i] : array1[i] + ", ");
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print((i == 0) ? array2[i] : array2[i] + ", ");
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print((i == 0) ? array3[i] : array3[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("task4:");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
        }
        System.out.print(Arrays.toString(array1));
    }
}