package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");

        for(String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for(String s : result) {
            System.out.println(s);
        }

        System.out.println("-------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
