//Опис ДЗ
//Завдання1 - Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
//Завдання2 - Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра.
//Виведіть об'єм циліндра на екран.
//Завдання3 - Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).

public class Home_Task_4 {
    //Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
    public static void printSquare(int value){
        int square = value * value;
        System.out.println("Квадрат числа " + value + " - " + square);
    }
    //Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра.
    // Виведіть об'єм циліндра на екран.
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    //Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    //Метод для виводу результату на екран
    public static void main(String[] args) {
        //Завдання1
        int value = 5;
        printSquare(value);
        //Завдання2
        double radius = 1.5;
        double height = 1.2;
        double volume = cylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " - " + volume);
        //Завдання3
        int number = 3;
        int power = 3;
        int result = power(number, power);
        System.out.println(number + " підняте до степеня " + power + " - " + result);
    }
}
