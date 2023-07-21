package HashMap;

public class MyHashMap<K, V> {

    private Node<K, V>[] table = new Node[10];
    private int size;

    public void put(K key, V value) {
        if (size == table.length) {
            rebalance();
        }
        if (key == null)
            return;

        int hash = hash(key);
        putLogic(hash, key, value);
        size++;
    }


    public V get(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return null;
        } else {
            Node<K, V> queq = table[hash];
            while (queq != null) {
                if (queq.getKeys().equals(key))
                    return queq.getValue();
                queq = queq.nextNode;
            }
            return null;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        table = new Node[table.length];
        size = 0;
    }

    public void remove(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return;
        } else {
            Node<K, V> previous = null;
            Node<K, V> current = table[hash];

            while (current != null) {
                if (current.getKeys() == key) {
                    if (previous == null) {
                        table[hash] = table[hash].nextNode;
                    }
                } else {
                    previous.nextNode = current.nextNode;
                }
                previous = current;
                current = current.nextNode;
            }
            size--;
        }
    }

    private void rebalance() {
        Node[] rebTable = new Node[table.length * 2];
        for (Node<K, V> node : table) {
            while (node != null) {
                int hash = hash(node.getKeys());
                putLogic(hash, node.getKeys(), node.getValue());
                node = node.nextNode;
            }
        }
        table = rebTable;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }


    private void putLogic(int hash, K key, V value) {
        Node<K, V> newNode = new Node<>(key, value, null);
        if (table[hash] == null) {
            table[hash] = newNode;
            size++;
        } else {
            Node<K, V> previous = null;
            Node<K, V> current = table[hash];

            while (current != null) {
                if (current.getKeys().equals(key)) {
                    if (previous == null) {
                        newNode.nextNode = current.nextNode;
                        table[hash] = newNode;
                        return;
                    } else {
                        newNode.nextNode = current.nextNode;
                        previous.nextNode = newNode;
                        return;
                    }
                }
                previous = current;
                current = current.nextNode;
                size++;
            }
            previous.nextNode = newNode;
        }
    }
}
