import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Home_Task_9 {
    public static void main(String[] args){
        ArrayList<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(14);
        values.add(15);
        values.add(92);
        values.add(6);

        System.out.println("Колекція чисел: ");
        for (Integer value : values){
            System.out.println(value);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Ярослав");
        names.add("Юрійович");
        names.add("Шавлак");

        System.out.println("\nКолекція імен: ");
        for (String name : names) {
            System.out.println(name);
        }

        HashSet<String> uniqueElements= new HashSet<>();
        uniqueElements.add("A");
        uniqueElements.add("Б");
        uniqueElements.add("В");
        uniqueElements.add("A");

        System.out.println("\nСет з унікальними іменами");
        for (String element : uniqueElements) {
            System.out.println(element);
        }

        HashMap<String, String> cityCodes = new HashMap<>();
        cityCodes.put("Київ", "044");
        cityCodes.put("Харків", "057");
        cityCodes.put("Львів", "032");

        System.out.println("\nМіста України та їх телефонні коди:");
        for (HashMap.Entry<String, String> entry : cityCodes.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
