import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Maps{


    public abstract class AbstractMapClass extends Maps {
    }

    public static void main(String[] args) {
    long start = System.nanoTime();
    Map<String,Integer> map1 = new HashMap<>();
    map1.put("8",1);
    map1.put("5",4);
    map1.put("2",6);
    map1.put("6",5);
    long end = System.nanoTime();

    long time = end - start;
    System.out.println("Hashmap : " + time + " ns");
    System.out.println(map1);

    start = System.nanoTime();
    Map<String,Integer> map2 = new TreeMap<>();
    map2.put("8",1);
    map2.put("5",4);
    map2.put("2",6);
    map2.put("6",5);
    end = System.nanoTime();
    long time2 = end - start;
    System.out.println("Treemap : " + time2 + " ns");
    System.out.println(map2);

    start = System.nanoTime();
    Map<String,Integer> map3 = new TreeMap<>();
    map3.put("8",1);
    map3.put("5",4);
    map3.put("2",6);
    map3.put("6",5);
    map3.put("1",1);
    map3.put("4",4);
    map3.put("3",6);
    map3.put("7",5);
    map3.put("0",4);
    map3.put("9",6);
    end = System.nanoTime();
    long time3 = end - start;
    System.out.println("Treemap 2: " + time3 + " ns");
    System.out.println(map3);

    }


}