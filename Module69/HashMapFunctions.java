import java.util.HashMap;
import java.util.Map;

public class HashMapFunctions {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        // Functionality of put() method 
        hashMap.put(1, "Priya");
        hashMap.put(2, "Rima");
        hashMap.put(3, "Navin");
        hashMap.put(5, "Karan");

        System.out.println("Hashmap data is "+hashMap);

        // Funcitonality of get() method
        String name=hashMap.get(1);
        System.out.println("Value at key 1 "+name);
    
        // Functionality of containsKey() method
        System.out.println(hashMap.containsKey(4234));
        System.out.println(hashMap.containsValue("Karan"));

        // Functionality of remove() method
        System.out.println(hashMap.remove(1));
        System.out.println("Updated HashMap "+hashMap);
        

        // Functionality of entrySet() method

        for(Map.Entry<Integer,String> e: hashMap.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }


    }
}
