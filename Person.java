//person class
public class Person {
   private String id;
    private String name;
    private int age;
private boolean parent_permision;
    public Person(String id, String name, boolean parent_permision) {
        this.id=id;
        this.parent_permision=true;
        this.name = name;
        this.age = age;
    }

    public String getId()
    {

        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private boolean of_age(){
        if (age>=18)
            return true;
        else
            return false;
    }
    public boolean can_use_services(){
        return (of_age()||parent_permision);
    }

}