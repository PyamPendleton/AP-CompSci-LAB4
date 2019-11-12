public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John Doe", 12, 0.00);
        Student student2 = new Student();
        System.out.println(student1.getName());

        School school1 = new School();
        School school2 = new School();
        School school3 = new School("SMS", "Public", 200);
        System.out.println(school3.getName());

        House house1 = new House("123 Anywhere lane, Anytown, Anystate, 00000", 15000, 250000, 3);
        System.out.println(house1.getAddress() + ", " + house1.getSize() + "sq ft, $" + house1.getPrice() + ", with " + house1.getBedrooms() + "bedrooms.");

    }
}
