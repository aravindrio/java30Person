public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("Fullname= " + person.getFullName());
        System.out.println("Teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(19);
        System.out.println("Fullname= " + person.getFullName());
        System.out.println("Teen= " + person.isTeen());
        person.setLastName("Ambraska");
        System.out.println("Fullname= " + person.getFullName());

    }
}
