package javaapis.collection.map;

import java.util.HashMap;

public class HashMapSample {

    public static void main(String[] args) {
    HashMap< String,String > hm = new HashMap < String, String > ();

    hm.put("GK","川島");
    hm.put("DF","吉田");
    hm.put("MF", "久保");
    hm.put("FW", "浅野");
    
    String member = hm.get("FW");
    System.out.println(member);
    
    int size = hm.size();
    System.out.println(size);
    
    for (String key : hm.keySet()) {
        System.out.println(key + "：" + hm.get(key));
    }
    }

}
