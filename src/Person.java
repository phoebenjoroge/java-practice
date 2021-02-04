public class Person {
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello " + firstName);
    }

    public static void main(String[] args) {
        Person phoebe = new Person("Phoebe", "N",21);
        System.out.println(phoebe.firstName);
        phoebe.sayHello();
    }

}
