package homework16;

public class Stack<T> {
    private Node top;

    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    public void push(T value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) {
            throw new IllegalStateException("Стек пуст"); // Проверка на пустой стек
        }

        T result = top.value;
        top = top.next;

        return result;
    }
}
