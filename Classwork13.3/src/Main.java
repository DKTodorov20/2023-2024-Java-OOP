import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();

        names.add("Trani");
        names.add("Anton");
        names.add("Yusmen");

        names.forEach (e -> System.out.println(e));

        // System.out.println(names.get(2));

        Map<String, Double> grades = new LinkedHashMap<>();

        grades.put("Trani", 5.50);
        grades.put("Anton", 4.50);

        Set<String> keys = grades.keySet();

        for(String key : keys){
            System.out.println(key + " - " + grades.get(key));
        }

        Collection<Double> value = grades.values();
    }
}
 