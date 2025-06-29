package proje;
public class Node<Student> {

    private Student data;
    private Node<Student> previous;
    private Node<Student> next;

    public Node() {
        data = null;
        previous = null;
        next = null;
    }

    public Node(Student newData, Node<Student> newPrevious, Node<Student> newNext) {
        data = newData;
        previous = newPrevious;
        next = newNext;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student student) {
        this.data = student;
    }

    public Node<Student> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<Student> previous) {
        this.previous = previous;
    }

    public Node<Student> getNext() {
        return next;
    }

    public void setNext(Node<Student> next) {
        this.next = next;
    }
}