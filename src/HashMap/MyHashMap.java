package HashMap;

import java.util.HashMap;
import java.util.Objects;

public class MyHashMap<K,V> {
    private Node<K, V> headNode;
    private int size;

    public void put(K key, V value) {
        Node<K, V> currentNode = headNode;
        if (headNode == null) {
            headNode = new Node<>(key, value, null);
            size++;
        } else {
            while (currentNode.getNextNode() != null) {
                if (Objects.equals(currentNode.getKeys(), key)) {
                    currentNode.setValue(value);
                    return;
                }
                currentNode = currentNode.getNextNode();
            }

            Node<K, V> newNode = new Node<>(key, value, null);
            currentNode.setNextNode(newNode);
            size++;
        }
    }

    public V get(Object key) {
        Node<K, V> currentNode = headNode;
        while (currentNode != null) {
            if (currentNode.getKeys() != null && currentNode.getKeys().equals(key)) {
                System.out.println(currentNode.getValue());
                return currentNode.getValue();
            }
            currentNode = currentNode.getNextNode();
        }


        return null;
    }

    public int size(){
        System.out.println(size);
        return size;
    }

    public void clear(){
        Node<K,V> currentNode = headNode;
        currentNode.setKeys(null);
        currentNode.setKeys(null);
        for(int i = 0; i <= size; i++){
            currentNode = currentNode.getNextNode();
            currentNode.setValue(null);
            currentNode.setKeys(null);
            size--;
        }
    }

    public void remove(Object key){
        Node<K,V> currentNode = headNode;
        while (currentNode != null){
            if(currentNode.getKeys().equals(key)) {
                currentNode.setKeys(null);
                currentNode.setValue(null);
                size--;
                break;
            }
            currentNode = currentNode.getNextNode();
        }
    }
}
