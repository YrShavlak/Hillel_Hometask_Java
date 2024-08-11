import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Home_Task_10 {
    public static void main(String[] args){
        String[] array1 = {"a", "bb", "a", "bb"};
        String[] array2 = {"this", "and", "that", "and"};
        String[] array3 = {"code", "code", "code", "bug"};
        System.out.println("Довжина рядків для масиву 1 - " + getLengthOfStrings(array1));
        System.out.println("Довжина рядків для масиву 2 - " + getLengthOfStrings(array2));
        System.out.println("Довжина рядків для масиву 3 - " + getLengthOfStrings(array3));
        System.out.println();

        String[] array4 = {"code", "bug"};
        String[] array5 = {"man", "moon", "main"};
        String[] array6 = {"man", "moon", "good", "night"};
        System.out.println("Перший та останній символи рядка для масиву 4 - " + createMap(array4));
        System.out.println("Перший та останній символи рядка для масиву 5 - " + createMap(array5));
        System.out.println("Перший та останній символи рядка для масиву 6 - " + createMap(array6));
        System.out.println();

        String[] array7 = {"a", "b", "a", "c", "b"};
        String[] array8 = {"c", "b", "a"};
        String[] array9 = {"c", "c", "c", "c"};
        System.out.println("Кількіть посторювань симолів в рядку для масиву 7 - " + countWords(array7));
        System.out.println("Кількіть посторювань симолів в рядку для масиву 8 - " + countWords(array8));
        System.out.println("Кількіть посторювань симолів в рядку для масиву 9 - " + countWords(array9));
        System.out.println();

        String[] array10 = {"salt", "tea", "soda", "toast"};
        String[] array11 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[] array12 = {};
        System.out.println("Завдання 10.4 для масиву 10 - " + mergeStringsByFirstChar(array10));
        System.out.println("Завдання 10.4 для масиву 11 - " + mergeStringsByFirstChar(array11));
        System.out.println("Завдання 10.4 для масиву 12 - " + mergeStringsByFirstChar(array12));
        System.out.println();

        String[] array13 = {"a", "b", "a"};
        String[] array14 = {"a", "b", "a", "c", "a", "d", "a"};
        String[] array15 = {"a", "", "a"};
        String[] array16 = {"a", "b", "c"};
        System.out.println("Завдання 10.5 для масиву 13 - " + buildResultString(array13));
        System.out.println("Завдання 10.5 для масиву 14 - " + buildResultString(array14));
        System.out.println("Завдання 10.5 для масиву 15 - " + buildResultString(array15));
        System.out.println("Завдання 10.5 для масиву 16 - " + buildResultString(array16));
        System.out.println();

        int[] array17 = {3, 1, 2, 2, 1, 2, 3, 3, 3};
        int[] array18 = {1, 2, 3};
        System.out.println("Елемент який повторюється найчастіше у списку - " + findMostFrequentElement(array17));
        System.out.println("Елемент який повторюється найчастіше у списку - " + findMostFrequentElement(array18));
        System.out.println();

        LinkedHashSet<Integer> setA = new LinkedHashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        LinkedHashSet<Integer> setB = new LinkedHashSet<>();
        setB.add(3);
        setB.add(5);
        setB.add(6);
        boolean hasIntersection = hasIntersection(setA, setB);
        System.out.println("Наявність перетину: " + hasIntersection);
        System.out.println();

        TreeSet<Integer> setC = new TreeSet<>();
        setC.add(1);
        setC.add(2);
        setC.add(3);
        TreeSet<Integer> setD = new TreeSet<>();
        setD.add(3);
        setD.add(4);
        setD.add(5);
        TreeSet<Integer> mergedSet = mergeTreeSets(setC, setD);
        System.out.println("Об'єднаний TreeSet: " + mergedSet);
    }

    public static Map<String, Integer> getLengthOfStrings(String[] strings){
        Map<String, Integer> result = new HashMap<>();
        for (String string : strings){
            result.put(string, string.length());
        }
        return result;
    }

    public static Map<String, String> createMap(String[] strings){
        Map<String, String> result = new HashMap<>();
        for (String string : strings){
            String firstSymbol = string.substring(0,1);
            String lastSymbol = string.substring(string.length()-1);
            result.put(firstSymbol, lastSymbol);
        }
        return result;
    }

    public static Map<String, Integer> countWords(String[] strings){
        Map<String, Integer> result = new HashMap<>();
        for(String string : strings){
            if(result.containsKey(string)){
                result.put(string, result.get(string) + 1);
            } else {
                result.put(string, 1);
            }
        }
        return result;
    }

    public static Map<String, String> mergeStringsByFirstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String string : strings) {
            String firstSymbol = string.substring(0, 1);
            result.put(firstSymbol, result.getOrDefault(firstSymbol, "") + string);
        }
        return result;
    }

    public static String buildResultString(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            int count = countMap.getOrDefault(string, 0) + 1;
            countMap.put(string, count);
            if (count == 2) {
                result.append(string);
            }
        }
        return !result.isEmpty() ? result.toString() : "";
    }

    public static String findMostFrequentElement(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int count : array) {
            countMap.put(count, countMap.getOrDefault(count, 0) + 1);
        }
        int mostFrequent = array[0];
        int maxCount = 0;
        boolean allSingle = true;
        for (Map.Entry<Integer, Integer> counter : countMap.entrySet()) {
            int count =counter.getValue();
            if (counter.getValue() > maxCount) {
                mostFrequent = counter.getKey();
                maxCount = count;
            }
            if (count > 1){
                allSingle = false;
            }
        }
        if (allSingle){
            return "Повторювані елементи відсутні";
        }
        return Integer.toString(mostFrequent);
    }

    public static boolean hasIntersection(LinkedHashSet<Integer> setA, LinkedHashSet<Integer> setB) {
        LinkedHashSet<Integer> copyOfSetA = new LinkedHashSet<>(setA);
        copyOfSetA.retainAll(setB);
        return !copyOfSetA.isEmpty();
    }

    public static TreeSet<Integer> mergeTreeSets(TreeSet<Integer> setC, TreeSet<Integer> setD) {
        TreeSet<Integer> mergedSet = new TreeSet<>(setC);
        mergedSet.addAll(setD);
        return mergedSet;
    }
}
