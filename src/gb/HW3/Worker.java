package gb.HW3;

public class Worker extends BaseEmployee{

    public static Worker create(String firstName, int age, int perMonth){
        if (firstName == null || firstName.length() < 3) {
            throw new RuntimeException("Некорректное имя человека");
        }
        if (age < 18) {
            throw new RuntimeException("Некорректное возраст человека");
        }
        if (perMonth <= 0) {
            throw new RuntimeException("Человек не может зарабатывать меньше 0");
        }
        return new Worker(firstName, age, perMonth);
    }

    @Override
    protected double averageEarnings() {
        return perMonth;
    }

    public String toString() {
        return String.format("%s - %d - %f руб \n", firstName, age, averageEarnings());
    }

    public Worker(String firstName, int age, int perMonth) {
        super(firstName, age);
        this.perMonth = perMonth;
    }
    private int perMonth;
}
