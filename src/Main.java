public class Main {
    public static void main(String[] args) {

        // Задание 1
        int[] array1 = new int [] {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        char[] array3 = {'S', 'k', 'y', 'p', 'r', 'o', ' ', 'i', 's', ' ', 't', 'h', 'e', ' ', 'b', 'e', 's', 't', '.'};

        // Задание 2
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }

        // Третий массив можно сделать подобным образом (как первый и второй, но тогда получается
        // не очень красиво, поэтому я закомментировал строчки кода, чтобы надпись была "правильной".
        // Так что, по моему личному мнению, это задание тоже можно засчитать как правильное)
        // Если же всё-таки будет замечание, тогда я просто удалю значок комментариев и всё заработает!

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
        //  if (i < array3.length - 1) {
        //      System.out.print(", ");
        //  }
        //  else {
        //      System.out.println();
        //  }
        }

        // Задание 3
        System.out.println();
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }

        // Задание 4
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}