package gb.HW3;

public abstract class BaseEmployee {

    protected abstract double averageEarnings();

    public BaseEmployee(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() < 3){
            throw new RuntimeException("Некорректное имя человека");
        }
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    protected String firstName;

    protected int age;
}
