package dsa;

public class Stack {

    private int count;
    private String[] element = new String[3];

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String element) {
        this.element[count++] = element;
    }

    public String pop() {
        return element[--count];
    }
}
