import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i<arraySize;i++) {
            System.out.printf("Введите %d-е число: ",(i+1));
            int enteredNumber = scan.nextInt();
            array[i] = enteredNumber;
        }
        for (int j = 0 ; j < arraySize ; j++) {
            System.out.printf("%d-е число в массиве: %d * 2 = %d \n", (j+1),array[j], (array[j]*2));
        }
        scan.close();
    }
}