package HashMap;

public class Node<K, V> {
    private K keys;
    private V value;
    Node<K, V> nextNode;

    public Node(K keys, V value, Node<K, V> nextNode) {
        this.keys = keys;
        this.value = value;
        this.nextNode = nextNode;
    }

    public K getKeys() {
        return keys;
    }

    public void setKeys(K keys) {
        this.keys = keys;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<K, V> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<K, V> nextNode) {
        this.nextNode = nextNode;
    }
}
