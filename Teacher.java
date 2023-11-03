public class Teacher extends Person {
    private String specialization;
    boolean parent_permision=true;

    public Teacher(String name, String age, boolean parent_permision,String specialization) {
        super(name, age, parent_permision);
        this.specialization=specialization;
    }
    public boolean can_use_services(){
        return true;
    }
}
