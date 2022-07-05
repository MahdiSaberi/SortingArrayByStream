import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class SortProject {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList(Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza","Mohsen"));
        System.out.println(names.stream().sorted((a, b) -> a.length() - b.length()).collect(Collectors.groupingBy(String::length)));

        System.out.println(names.stream().sorted((a, b) -> a.length() - b.length()).collect(Collectors.groupingBy(String::length,counting())));
    }
}