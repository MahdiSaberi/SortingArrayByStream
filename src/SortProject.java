import java.util.*;
import java.util.stream.Collectors;

public class SortProject {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList(Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza","Mohsen"));
        System.out.println(names.stream().sorted((a, b) -> a.length() - b.length()).collect(Collectors.groupingBy(String::length)));

    }
}