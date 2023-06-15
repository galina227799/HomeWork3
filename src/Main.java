import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        double sum=0;
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));
            sum += list.get(i);
        }
        double sred = sum/10;
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println("Минимальное значение "+list.get(0));
        System.out.println("Максимальное значение "+list.get(9));
        System.out.println("Среднее значение "+sred);
    }
}