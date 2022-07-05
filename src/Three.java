import java.util.function.BiFunction;

public class Three {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> average = (x, y) -> {
            return (x + y) / 2;
        };
        System.out.println(average.apply(3,7));
    }
}
