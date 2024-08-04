public class Home_Task_5 {
    public static String checkAge(int age){
        return age >= 18 ? "Ви доросла особа" : "Ви не є дорослою особою";
    }

    public static boolean isPerfectSquare(int n) {
        return n >= 0 && Math.sqrt(n) % 1 == 0;
    }

    public static String calculateSumUpToN(int N) {
        if (N < 1) return "Хибні вхідні параметри";

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return String.valueOf(sum);
    }

    public static String getGrade(int grade) {
        return switch (grade) {
            case 5 -> "Відмінно";
            case 4 -> "Добре";
            case 3 -> "Задовільно";
            case 2 -> "Погано";
            case 1 -> "Дуже погано";
            default -> "Неправильна оцінка";
        };
    }

    public static boolean isPrime(int N) {
        if (N <= 1) return false;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkAge(18));
        System.out.println(checkAge(0));
        System.out.println(checkAge(99));

        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(20));
        System.out.println(isPerfectSquare(9));

        System.out.println(calculateSumUpToN(1));
        System.out.println(calculateSumUpToN(3));
        System.out.println(calculateSumUpToN(0));

        System.out.println(getGrade(5));
        System.out.println(getGrade(1));
        System.out.println(getGrade(-3));

        System.out.println(isPrime(0));
        System.out.println(isPrime(8));
        System.out.println(isPrime(7));
    }
}
