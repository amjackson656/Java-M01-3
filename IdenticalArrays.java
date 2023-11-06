import java.util.Scanner;

public class IdenticalArrays { // no validation for list length added but included tip in prompt

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];

        // Prompt the user to enter the first list
        System.out.print("Enter 9 items for List 1: ");
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                list1[i][j] = input.nextInt();
            }
        }

        // Prompt the user to enter the second list
        System.out.print("Enter 9 items for List 2: ");
        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2[i].length; j++) {
                list2[i][j] = input.nextInt();
            }
        }

        // Display the result if identical or not
        System.out.println("The two arrays are " + (equals(list1, list2) ? "" : "not ") + "identical");
    }

    /** Check if the two arrays are identical */
    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
