import java.util.Scanner;

public class Home_Task_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість елементів масиву: ");
        int size = scanner.nextInt();

        System.out.println("Введіть елементи масиву: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        double average = calculateAverage(array);
        System.out.println("Середнє значення: " + average);

        int[] valueMinMax = findMinAndMaxValue(array);
        System.out.println("Мінімальне значення: " + valueMinMax[0]);
        System.out.println("Максимальне значення: " + valueMinMax[1]);

        System.out.println("Елементи масиву в зворотному порядку: ");
        printArrayInReverse(array);

        System.out.println("Введіть значення для перевірки наявності в масиві: ");
        int valueToCheck = scanner.nextInt();
        boolean isPresent = isValueInArray(array, valueToCheck);
        System.out.println("Значення " + valueToCheck + " " + (isPresent ? "присутнє" : "не присутнє" ) + " у масиві");
        scanner.close();
    }

    public static double calculateAverage(int[] array){
        if(array.length == 0) return 0;
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static int[] findMinAndMaxValue(int[] array){
        if (array.length == 0) return new int[]{0,0};

        int minValue = array[0];
        int maxValue = array[0];

        for (int num : array){
            if (num < minValue) {
                minValue = num;
            }
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return new int[]{minValue,maxValue};
    }

    public static void printArrayInReverse(int[] array) {
        for (int i = array.length -1; i >= 0; i--){
            System.out.println(array[i] + " ");
        }
    }

    public static boolean isValueInArray(int[] array, int value){
        for (int num : array) {
            if (num ==value) return true;
        }
        return false;
    }
}
