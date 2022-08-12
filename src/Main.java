public class Main {
    public static void main(String[] args) {

        // Задание 1
        int[] arrayInt = new int [3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        double[] arrayDouble = {1.57, 7.654, 9.986};
        char[] arrayChar = {'S', 'k', 'y', 'p', 'r', 'o', ' ', 'i', 's', ' ', 't', 'h', 'e', ' ', 'b', 'e', 's', 't', '.'};

        // Задание 2
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i]);
            if (i < arrayInt.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i]);
            if (i < arrayDouble.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i]);
            if (i < arrayChar.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        // Задание 3
        System.out.println();
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            System.out.print(arrayInt[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            System.out.print(arrayDouble[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            System.out.print(arrayChar[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        // Задание 4
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i]++;
            }
                System.out.print(arrayInt[i] + " ");
            }
        }
    }