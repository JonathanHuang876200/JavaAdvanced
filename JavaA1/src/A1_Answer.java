import java.lang.reflect.Array;
import java.util.*;


public class A1_Answer {

    public static void main(String[] args) {
        String sentance = "    This is a book. That is a pencil.This is good, and that is bad.";
        String sentanceTrimed = sentance.trim();
        String[] array = sentanceTrimed.split("\\W+"); /*出現一個或多個*/
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String str : array) {
            String word = str.substring(0, 1).toUpperCase() + str.substring(1);
            int count = 1;
            if (map.containsKey(word)) {
                count = map.get(word) + 1;
            }
            map.put(word, count);
        }
        /*Map.Entry集合的類型*/
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        System.out.println(map.entrySet());                             /*entrySet()的回傳值是一個Set集合*/
        /*收到1*/
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> arg0, Map.Entry<String, Integer> arg1) {
                return arg1.getValue().compareTo(arg0.getValue());  /*>回傳1 =回傳0 <回傳-1*/
            }
        });
        System.out.println(list);
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ":  " + entry.getValue() + "次");
//            System.out.println(entry);
        }

//        System.out.println("排序後的List:" + list);
//        for (int i = 0; i < list.size(); i++) {
//            String str = list.get(i).toString();
//            System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1).replaceAll("=", ": ") + "次");
//        }


    }


}