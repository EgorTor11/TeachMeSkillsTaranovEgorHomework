package Lesson_8_tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void freqWord() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите фразу");
        String str=scanner.nextLine();
      char ch[]= str.toCharArray();
        Map<String,Integer> map=new HashMap<>();
        for (char c:ch){
            Integer frequency=map.get(String.valueOf(c));
            map.put(String.valueOf(c),frequency==null? 1:frequency+1);
        }
        System.out.println(map);
    }
}
