package example4;

public class People {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", 33);
        Person person2 = new Person("Kasia", 22);

        // dla pól statycznych notacja
        // wykorzystująca referencje jest niepoprawna,
        // mimo, że działa
        person1.peopleNumber = 1;
        // poprawna jest tylko notacja z użyciem nazwy klasy
        System.out.println(Person.peopleNumber);
        person2.peopleNumber = 2;
        System.out.println(Person.peopleNumber);
        System.out.println(person1.peopleNumber);
    }
}
