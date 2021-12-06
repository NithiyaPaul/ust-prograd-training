import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> memberNames = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        memberNames.add("Don");
        memberNames.add("Nirmal");
        memberNames.add("Arun");
        memberNames.add("Rahul");
        memberNames.add("Nimmy");
        memberNames.add("Nikitha");
        memberNames.add("Paulji");
        memberNames.add("Nimisha");
        marks.addAll(List.of(90,67,45,70,77,80,50,99));
        System.out.println("Names in the list :" +memberNames);
        System.out.println(" =========filter elements =========");
        memberNames.stream().filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);
        System.out.println("==============Sorting Elements============");
        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("==========Element start with A and prints boolean value if present");
        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);
        System.out.println("======number of elements in the stream with 'A'=====");
        long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();
        System.out.println(totalMatched);
        System.out.println("======Elements after limit operation===========");

        memberNames.stream()
                .limit(5)
                .forEach(System.out::println);
        System.out.println("====================Elements after skip function=========================");
        memberNames.stream()
                .skip(5)
                .forEach(System.out::println);

        System.out.println("=================================== Operations with Maximum============================");

        marks.stream().mapToInt(i->i)
                .max()
                .ifPresent(System.out::println);
        System.out.println("=================================== Operations with Minimum============================");
        //minimum
        marks.stream()
                .mapToInt(i->i)
                .min().ifPresent(System.out::println);
        System.out.println("================================contains operation=======================================");

        if (marks.stream().anyMatch(n -> marks.contains(90))){
            System.out.println(marks.get(0));
        }
        System.out.println("======================filtering==========================================================");
        marks.stream()
                .filter(x -> x>60)
                .sorted()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("==============================Summary Statistics===============================");

        IntStream stream = IntStream.range(70, 90);

        // Using IntStream summaryStatistics()
        IntSummaryStatistics summary_data =
                stream.summaryStatistics();

        System.out.println(summary_data);
    }
}
