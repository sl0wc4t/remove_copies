import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int[] array = new int[20];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * array.length / 2);
        }
        System.out.println("Random array");
        for (int j : array) {
            System.out.println(j);
        }
        System.out.println("Введите число для удаления его из массива");
        Scanner input = new Scanner(System.in);
        int copy = input.nextInt();
        int c = 0;
        for (int j : array) {
            if (j == copy) {
                c++;
            }
        }
        int[] tempArray = new int[array.length - c];
        int i = 0;
        for (int j : array) {
            if (j != copy) {
                tempArray[i] = j;
                i++;
            }
        }
        array = tempArray;
        System.out.println("Array with deleted number " + copy);
        for (int j : array) {
            System.out.println(j);
        }
    }
}
