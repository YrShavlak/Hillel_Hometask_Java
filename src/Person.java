public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getProfession(){
        return profession;
    }

    public void changeProfession(String newProfession){
        this.profession = newProfession;
    }

    public void displayInfo(){
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Професія: " + profession);
        System.out.println();
    }

    public static void main(String[] args){
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");
        Person person4 = new Person("Alice", 28, "Архітектор");

        System.out.println("Інформація про осіб: ");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        person4.displayInfo();

        person4.changeProfession("Дизайнер");
        System.out.println("Оновлена інформація про Alice: " );
        person4.displayInfo();
    }
}
