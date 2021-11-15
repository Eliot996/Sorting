import java.util.Arrays;

public class PersonSorter {

    public static void main(String[] args) {
        PersonSorter app = new PersonSorter();

        app.start();
    }

    private void start() {
        Person[] arr = new Person[5];

        arr[0] = new Person("Harry", "Potter");
        arr[1] = new Person("Ron", "Weasly");
        arr[2] = new Person("Hermione", "Granger");
        arr[3] = new Person("aab", "bbb");
        arr[4] = new Person("aaa", "aaa");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        QuickSortPerson.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));
    }
}
