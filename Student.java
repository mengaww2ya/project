public class Student extends Person {
    private String classroom;

    public Student(String name, String age, boolean parent_permision, String classroom) {
        super(name, age, parent_permision);
        this.classroom=classroom;
    }
}
