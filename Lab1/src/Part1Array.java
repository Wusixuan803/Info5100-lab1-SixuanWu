public class Part1Array {
    public static void main(String[] args) {
        int[] x = {12, 432, 7, 867, 245};
        int[] y = {754, 643, 544, 3, 67};
        int[] z = new int[5];

        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.print("Array x = { ");
        printArray(x);
        System.out.println("}");

        System.out.print("Array y = { ");
        printArray(y);
        System.out.println("}");

        System.out.print("Array z = x + y = { ");
        printArray(z);
        System.out.println("}");
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

