package gb.HW3;

public class Freelancer extends BaseEmployee{

    public static Freelancer create(String firstName, int age, int perHour){
        if (firstName == null || firstName.length() < 3) {
            throw new RuntimeException("Некорректное имя человека");
        }
        if (age < 18) {
            throw new RuntimeException("Некорректное возраст человека");
        }
        if (perHour <= 0) {
            throw new RuntimeException("Человек не может зарабатывать меньше 0");
        }
        return new Freelancer(firstName, age, perHour);
    }
    @Override
    protected double averageEarnings() {
        double monthSalary = 20.8 * 8 * perHour;
        return monthSalary;
    }

    @Override
    public String toString() {
        return String.format("%s - %d - %f руб \n", firstName, age, averageEarnings());
    }

    public Freelancer( String firstName, int age, int perHour) {
        super(firstName, age);
        this.perHour = perHour;
    }

    private int perHour;
}
