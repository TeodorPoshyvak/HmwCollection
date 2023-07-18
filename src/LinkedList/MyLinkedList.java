package LinkedList;

public class MyLinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;

    private int size;

    public void add(T val){
        if(firstNode == null){
            firstNode = new Node<>(null,null, val);
            size++;
        }else if(lastNode == null){
            lastNode = new Node<>(firstNode, null, val);
            firstNode.setNextNode(lastNode);
            size++;
        }else{
            Node<T> node = new Node<>(lastNode, null, val);
            lastNode.setNextNode(node);
            lastNode = node;
            size++;
        }
    }

    public T get(int index){
        Node<T> currentNode = firstNode;
        for(int i =0; i < index; i++){
            currentNode = currentNode.getNextNode();
        }
        System.out.println(currentNode.getValue());
        return currentNode.getValue();
    }

    public void remove(int index){
        Node<T> currentNode = firstNode;
        for(int i = 0; i <= index; i++){
            if(i == index){
                currentNode.setValue(null);
                break;
            }
          currentNode = currentNode.getNextNode();
        }
    }

    public void clear(){
        Node<T> currentNode = firstNode;
        currentNode.setValue(null);
        for(int i = 0; i <= size; i++) {
           currentNode = lastNode;
           currentNode.setValue(null);
           size--;
        }
    }

    public void size(){
        System.out.println(size);
    }

}