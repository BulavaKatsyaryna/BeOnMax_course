import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class CarLinkedList implements CarList{

    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public Car get(int index) {
        return null;
    }

    @Override
    public void add(Car car) {
        if (size == 0) {
            Node node = new Node(null, car, null);
            first = node;
            last = node;
        } else {
            Node secondLast = last;
            last = new Node(secondLast, car, null);
            secondLast.next = last;
        }
        size++;
    }

    @Override
    public void add(Car car, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(car);
            return;
        }
        Node nodeNext = getNode(index);
        Node nodePrevious = nodeNext.previous;
        Node newNode = new Node(nodePrevious, car, nodeNext);
        nodeNext.previous = newNode;
        if (nodePrevious != null) {
            nodePrevious.next = newNode;
        } else {
            first = newNode;
        }
        nodePrevious.next = newNode;
    }

    @Override
    public boolean remove(Car car) {
        Node node = first;
        for (int i = 0; i < size; i++) {
            if (node.value.equals(car)) {
                return removeAt(i);
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        Node node = getNode(index);
        Node nodeNext = node.next;
        Node nodePrevious = node.previous;
        if (nodeNext != null) {
            nodeNext.previous = nodePrevious;
        } else {
            last = nodePrevious;
        }
        if (nodePrevious != null) {
            nodePrevious.next = nodeNext;
        } else {
            first = nodeNext;
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    private Node getNode(int index) {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

@Data
@NoArgsConstructor
@AllArgsConstructor
    private static class Node {
        private Node previous;
        private Car value;
        private Node next;
    }
}