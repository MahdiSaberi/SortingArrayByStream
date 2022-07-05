import java.util.function.Predicate;

public class Four {
    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.startsWith(s.substring(s.length()-1));
        System.out.println(predicate.test("ada"));
    }
}
