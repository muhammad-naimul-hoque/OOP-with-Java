package ClassObject;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1; // object declaration
        teacher1 = new Teacher(); // create
        teacher1.name = "Naimul Hoque";
        teacher1.gender = "male";
        teacher1.phone = 1234567890;
        /*
         * System.out.println("Name: " + teacher1.name);
         * System.out.println("Phone: " + teacher1.phone);
         * System.out.println("Gender: " + teacher1.gender);
         */
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher(); // object create and declaration.
        teacher2.name = "Sumi Akter";
        teacher2.gender = "female";
        teacher2.phone = 1234561190;
        teacher2.displayInformation();
    }
}
