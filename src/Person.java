public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }

    public int compareTo(Person person) {
        //return this.firstName.compareTo(person.firstName);
        //return -1;
        return firstNameCompare(person);
    }

    private int firstNameCompare(Person person) {
        return firstNameCompare(person, 1);
    }

    private int firstNameCompare(Person person, int i) {
        int masterCodePoint = this.firstName.codePointAt(i);
        int slaveCodePoint = person.firstName.codePointAt(i);

        int difCodePoint = masterCodePoint - slaveCodePoint;

        if (difCodePoint == 0){
            return firstNameCompare(person, i+1);
        }

        return difCodePoint;
    }
}
