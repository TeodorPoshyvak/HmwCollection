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
        System.out.println("hashMap.get(\"Oleg\") = " + hashMap.get("Oleg"));
        System.out.println("hashMap.get(\"Sasha\") = " + hashMap.get("Sasha"));

        System.out.println("hashMap.size() = " + hashMap.size());
        hashMap.remove("Oleg");
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap.get(\"Teodor\") = " + hashMap.get("Teodor"));
        System.out.println("hashMap.get(\"Sasha\") = " + hashMap.get("Sasha"));
        hashMap.clear();
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap.get(\"Sasha\") = " + hashMap.get("Sasha"));
        System.out.println("hashMap.get(\"Teodor\") = " + hashMap.get("Teodor"));


    }
}
