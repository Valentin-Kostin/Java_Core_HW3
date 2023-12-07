package gb.HW3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BaseEmployee Woker1 = Worker.create("Ivan", 21, 60000);
        BaseEmployee Woker2 = Worker.create("Sergey", 34, 45000);
        BaseEmployee Woker3 = Worker.create("Anton", 25, 62000);
        BaseEmployee Woker4 = Worker.create("Denis", 43, 53200);

        BaseEmployee Freelancer1 = Freelancer.create("Alexander", 21, 600);
        BaseEmployee Freelancer2 = Freelancer.create("Ilia", 34, 450);
        BaseEmployee Freelancer3 = Freelancer.create("Maxim", 25, 620);
        BaseEmployee Freelancer4 = Freelancer.create("Boris", 43, 532);

        Collection<BaseEmployee> collection = new ArrayList<>();

        collection.add(Woker1);
        collection.add(Woker2);
        collection.add(Woker3);
        collection.add(Woker4);
        collection.add(Freelancer1);
        collection.add(Freelancer2);
        collection.add(Freelancer3);
        collection.add(Freelancer4);

        System.out.println(Woker1);
        System.out.println(Freelancer4);
        System.out.println(collection);

    }
}