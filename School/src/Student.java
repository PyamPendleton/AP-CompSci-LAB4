public class Student {
    private String name;
    private int grade;
    private double balance;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, int grade, double balance) {
        this.name = name;
        this.grade = grade;
        this.balance = balance;
    }
    public Student() {
        this("", 0, 0.00);
    }


}
