

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class Test {
    public static void main(String[] args)
    {
        Map<String, String> map1 = new HashMap<>();
        map1.put("1","Prashant");
        map1.put("2","Nishant");
        map1.put("3","Aman");
        map1.put("4","Prisha");
        map1.put("5","Tom");
        //SynchronizedMap
        Map<String,String> map2 = Collections.synchronizedMap(map1);
        System.out.println(map2);

    }
}
