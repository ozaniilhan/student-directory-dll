package proje;

public class DoublyLinkedList {
    private Node<Student> head;
    private Node<Student> tail;

    public DoublyLinkedList() { // Head ve tail düğümleri için oluşturulan metod.
        head = new Node<>(null, null, tail);
        tail = new Node<>(null, head, null);
        head.setNext(tail);
    }

    public void addData (Student data) {
        if (head.getNext() == tail){
            head.setNext(new Node<>(data, head, tail));
        } else {
            Node<Student> iter = head.getNext();
            while (iter != tail) {
                if (data.getOgrNo() > iter.getData().getOgrNo()) {
                    if (iter.getNext() == tail) {
                        Node newItem = new Node(data, iter, iter.getNext());
                        iter.getNext().setPrevious(newItem);
                        iter.setNext(newItem);
                        break;
                    } else {
                        iter = iter.getNext();
                    }

                } else if (data.getOgrNo() < iter.getData().getOgrNo()) {
                    Node newItem = new Node<>(data, iter.getPrevious(), iter);
                    iter.getPrevious().setNext(newItem);
                    iter.setPrevious(newItem);
                    break;

                }
            }
        }
    }

    public void showName(String isim) {
        Node<Student> current = head.getNext();
        while (current != tail) {
            if (isim.equals(current.getData().getIsim())) {
                System.out.print(current.getData().getOgrNo() + ", " + current.getData().getIsim() + ", ");
                System.out.println(current.getData().getPhoneNumbers());
            }
            current = current.getNext();
        }
    }

    public void remove(int ogrNo){
        Node<Student> iter = head.getNext();
        while (iter != tail) {
            if (ogrNo == iter.getData().getOgrNo()) {
                iter.getNext().setPrevious(iter.getPrevious());
                iter.getPrevious().setNext(iter.getNext());
                System.out.println("Öğrenci silindi.");
                break;
            } else {
                iter = iter.getNext();
            }
        }
    }

    public void writeBack() {
        Node<Student> iter = tail.getPrevious();
        while (iter != head) {
            System.out.println(iter.getData().getOgrNo() + ", " + iter.getData().getIsim() + ", " + iter.getData().getPhoneNumbers());
            iter = iter.getPrevious();
        }
    }

    public void print() {
        Node<Student> iter = head.getNext();
        while (iter != tail) {
            System.out.println(iter.getData().getOgrNo() + ", " + iter.getData().getIsim() + ", " + iter.getData().getPhoneNumbers());
            iter = iter.getNext();
        }
    }
}
