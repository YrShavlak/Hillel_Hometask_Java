public class Home_Task_8 {
    public static void main(String[] args){

        System.out.println("8.1 - Чи зустрічаються обидва підрядки однакову кількість разів \"catdog\": " + catDog("catdog"));
        System.out.println("8.1 - Чи зустрічаються обидва підрядки однакову кількість разів \"catcat\": " + catDog("catcat"));
        System.out.println("8.1 - Чи зустрічаються обидва підрядки однакову кількість разів \"1cat1cadodog\": " + catDog("1cat1cadodog"));

        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};
        System.out.println("8.1.1 - Кількість цілих парних чисел в масиві 1: " + countEvenInts(array1));
        System.out.println("8.1.1 - Кількість цілих парних чисел в масиві 2: " + countEvenInts(array2));
        System.out.println("8.1.1 - Кількість цілих парних чисел в масиві 3: " + countEvenInts(array3));

        int[] array4 = {1, 2, 3, 4, 100};
        int[] array5 = {1, 1, 5, 5, 10, 8, 7};
        int[] array6 = {-10, -4, -2, -4, -2, 0};
        System.out.println("8.2 - \"Центроване\" середнє значення масиву цілих чисел 1: " + centeredAverage(array4));
        System.out.println("8.2 - \"Центроване\" середнє значення масиву цілих чисел 2: " + centeredAverage(array5));
        System.out.println("8.2 - \"Центроване\" середнє значення масиву цілих чисел 3: " + centeredAverage(array6));

        int[] array7 = {1, 2, 2};
        int[] array8 = {1, 2, 2, 6, 99, 99, 7};
        int[] array9 = {1, 1, 6, 7, 2};
        System.out.println("8.3 - Сума чисел у масиві 1: " + sumIgnoreSections(array7));
        System.out.println("8.3 - Сума чисел у масиві 2: " + sumIgnoreSections(array8));
        System.out.println("8.3 - Сума чисел у масиві 3: " + sumIgnoreSections(array9));

        int[] array10 = {1, 2, 2, 1};
        int[] array11 = {1, 1};
        int[] array12 = {1, 2, 2, 1, 13};
        System.out.println("8.4 - Сума чисел у масиві 1: " + sumWithoutUnlucky13(array10));
        System.out.println("8.4 - Сума чисел у масиві 2: " + sumWithoutUnlucky13(array11));
        System.out.println("8.4 - Сума чисел у масиві 3: " + sumWithoutUnlucky13(array12));

        int[] array13 = {10, 3, 5, 6};
        int[] array14= {7, 2, 10, 9};
        int[] array15 = {2, 10, 7, 2};

        System.out.println("8.5 - Різниця між найбільшим і найменшим значенням у масиві 1: " + differenceLargestSmallest(array13));
        System.out.println("8.5 - Різниця між найбільшим і найменшим значенням у масиві 2: " + differenceLargestSmallest(array14));
        System.out.println("8.5 - Різниця між найбільшим і найменшим значенням у масиві 3: " + differenceLargestSmallest(array15));

        System.out.println("8.6 - Подвоєння символів в рядку \"The\": " + doubleChars("The"));
        System.out.println("8.6 - Подвоєння символів в рядку \"AAbb\": " + doubleChars("AAbb"));
        System.out.println("8.6 - Подвоєння символів в рядку \"Hi-There\": " + doubleChars("Hi-There"));

        System.out.println("8.7 - Кількість 'Hi' в рядку \"abc hi ho\": " + countHi("abc hi ho"));
        System.out.println("8.7 - Кількість 'Hi' в рядку \"ABChi hi\": " + countHi("ABChi hi"));
        System.out.println("8.7 - Кількість 'Hi' в рядку \"hihi\": " + countHi("hihi"));

        System.out.println("8.8 - Кількість 'co*e' в рядку \"aaacodebbb\": " + countCode("aaacodebbb"));
        System.out.println("8.8 - Кількість 'co*e' в рядку \"codexxcode\": " + countCode("codexxcode"));
        System.out.println("8.8 - Кількість 'co*e' в рядку \"cozexxcope\": " + countCode("cozexxcope"));

        System.out.println("8.9 - Чи є один з рядків закінченням іншого рядка \"AbC\", \"HiaBc\": " + endsWith("AbC", "HiaBc"));
        System.out.println("8.9 - Чи є один з рядків закінченням іншого рядка \"abc\", \"abXabc\": " + endsWith("abc", "abXabc"));
        System.out.println("8.9 - Чи є один з рядків закінченням іншого рядка \"Hiabc\", \"abc\": " + endsWith("Hiabc", "abc"));
    }

    public static boolean catDog(String str){
        int catCount = 0;
        int index = 0;
        while ((index = str.indexOf("cat", index)) != -1){
            catCount++;
            index += "cat".length();
        }
        int dogCount = 0;
        index = 0;
        while ((index = str.indexOf("dog", index)) != -1){
            dogCount++;
            index += "dog".length();
        }
        return catCount == dogCount;
    }

    public static int countEvenInts(int[] array){
        int count = 0;
        for (int num : array){
            if (num % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int centeredAverage(int[] values){
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int value : values){
            if (value < minValue){
                minValue = value;
            }
            if (value > maxValue){
                maxValue = value;
            }
            sum += value;
        }
        sum -= minValue;
        sum -= maxValue;
        int count = values.length -2;
        return sum/count;
    }

    public static int sumIgnoreSections(int[] values){
        if(values.length == 0){
            return 0;
        }
        int sum = 0;
        boolean ignoreSection = false;

        for (int value : values) {
            if (value == 6) {
                ignoreSection = true;
            }
            if (!ignoreSection) {
                sum += value;
            }
            if (ignoreSection && value == 7) {
                ignoreSection = false;
            }
        }
            return sum;
    }

    public static int sumWithoutUnlucky13(int[] values){
        if(values.length == 0){
            return 0;
        }
        int sum = 0;
        boolean ignoreSection = false;

        for (int value : values) {
            if (ignoreSection) {
                ignoreSection = false;
                continue;
            }
            if (value == 13) {
                ignoreSection = true;
                continue;
            }
            sum += value;
        }
        return sum;
    }

    public static int differenceLargestSmallest(int[] values){
        int minValue = values[0];
        int maxValue = values[0];

        for (int value : values){
            minValue = Math.min(minValue, value);
            maxValue = Math.max(maxValue, value);
        }
        return maxValue - minValue;
    }

    public static String doubleChars(String string) {
        StringBuilder result = new StringBuilder();
        for (char symbol : string.toCharArray()) {
            result.append(symbol).append(symbol);
        }
        return result.toString();
    }

    public static int countHi(String string) {
        int count = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static int countCode(String string) {
        int count = 0;
        for (int i = 0; i < string.length() - 3; i++) {
            if (string.substring(i, i + 2).equals("co") && string.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static boolean endsWith(String first, String second) {
        String lowerFirst = first.toLowerCase();
        String lowerSecond = second.toLowerCase();
        return lowerFirst.endsWith(lowerSecond) || lowerSecond.endsWith(lowerFirst);
    }
}
