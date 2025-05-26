import java.util.*;

public class TypesOfMap {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Mango",1);
        map.put("Apple",5);
        map.put("Grapes",10);

        System.out.println("HashMap "+map);

        LinkedHashMap<String,Integer> map1=new LinkedHashMap<>();

        map1.put("Mango",1);
        map1.put("Apple",5);
        map1.put("Grapes",10);
        System.out.println("LinkedHashMap "+map1);

        TreeMap<String,Integer> map2=new TreeMap<>();
        map2.put("Mango",1);
        map2.put("Apple",5);
        map2.put("Grapes",10);
        System.out.println("TreeMap "+map2);
    }
}
