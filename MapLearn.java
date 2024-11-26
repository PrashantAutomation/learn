
import java.sql.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapLearn {
    public static void main(String[] args)
    {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1","Prashant");
        map1.put("2","Nishant");
        map1.put("3","Aman");
        map1.put("4","Prisha");
        map1.put("5","Tom");
        //SynchronizedMap
        java.util.Map<String,String> map2 = Collections.synchronizedMap(map1);
        System.out.println();
        System.out.println(map2);
        System.out.println("Size of Map1 : " + map2.size());
        Iterator it = map1.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println("Key : " + pair.getKey() +" values : " + pair.getValue());
        }
        // Print using lambda function post jdk 8
        map1.forEach((k,v) -> System.out.println("Key using lambda "+k+" value "+ v ));
        // Convert hashMap key to arrayList
        List<String> keyList = new ArrayList<String>(map1.keySet());
        for(String s : keyList)
        {
            System.out.println(s);
        }
        // Convert hashMap value to arrayList
        List<String> valueList = new ArrayList<String>(map1.values());
        for(String v : valueList)
        {
            System.out.println(v);
        }
        // ConcurrentHashMap we do not get concurrentHashMap exception
        // No null keys null value null pointer exception will be thrown
        ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("1","rosy");
        concurrentMap.put("2","joly");
        System.out.println(concurrentMap.get("Key value for 2nd" + "2"));
    }
}
