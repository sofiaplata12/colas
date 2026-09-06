public class Queue implements QueueInterface {

    private QueueNode front;
    private QueueNode rear;
    private int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    /*
    essential operations
    */
    @Override
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public Object extract() {
        if (isEmpty()) {
            return null;
        }
        Object data = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    @Override
    public boolean insert(Object object) {
        QueueNode newNode = new QueueNode(object);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean search(Object object) {
        QueueNode current = front;
        while (current != null) {
            if (current.getData().equals(object)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue [front -> rear]: [");
        QueueNode current = front;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}