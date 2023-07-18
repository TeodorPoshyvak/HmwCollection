package HashMap;

import java.util.HashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Object, Object> hashMap = new MyHashMap<>();
        hashMap.put("Teodor", 13800);
        hashMap.put("Oleg",   20000);
        hashMap.put("Sasha",  10000);
        hashMap.put("Teodor", 12000);

        hashMap.get("Teodor");
        hashMap.get("Oleg");
        hashMap.get("Sasha");

        hashMap.size();
        hashMap.remove("Oleg");
        hashMap.size();
        hashMap.get("Teodor");
        hashMap.get("Sasha");
        hashMap.clear();
        hashMap.size();
        hashMap.get("Sasha");
        hashMap.get("Teodor");





    }
}
