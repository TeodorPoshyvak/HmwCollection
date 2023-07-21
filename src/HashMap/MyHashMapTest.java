package HashMap;

import java.util.HashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Object, Object> hashMap = new MyHashMap<>();
        hashMap.put("Teodor", 13800);
        hashMap.put("Oleg", 20000);
        hashMap.put("Sasha", 10000);
        hashMap.put("Teodor", 12000);
        System.out.println("hashMap.get(\"Teodor\") = " + hashMap.get("Teodor"));
        System.out.println("hashMap.get(\"Sasha\") = " + hashMap.get("Sasha"));
        for (int i = 0; i <= 1000000; i++) {
            hashMap.put(String.valueOf(i), i);
        }

        System.out.println("hashMap.get(100000) = " + hashMap.get("1000000"));
    }
}
