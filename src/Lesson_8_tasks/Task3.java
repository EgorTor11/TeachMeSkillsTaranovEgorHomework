package Lesson_8_tasks;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

        public static void mapCopy() {
            HashMap<Integer, String> hash = new HashMap<Integer,String>();
            hash.put(3,"Value1");
            hash.put(35,"Value2");
            for (Map.Entry entry : hash.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            for (Map.Entry<Integer, String> entry: hash.entrySet()){
                map.put(entry.getValue(), entry.getKey());
            }
            for (Map.Entry<String, Integer>entry :map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

