package rextends;

public class Son extends Father{
    private boolean isStudent;

    public Son(){

    }

    public Son(String name,int age,boolean isStudent){
        super(name, age);
        this.isStudent=isStudent;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isStudent=" + isStudent +
                '}';
    }
}
