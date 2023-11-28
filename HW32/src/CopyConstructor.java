public class CopyConstructor {
    Element Head;
    int size;

    public CopyConstructor() {
        this.Head = null;
        size = 0;
        System.out.println("CopyConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public void push_front(int Data) {
        Element New = new Element(Data);
        New.setNext(Head);
        Head = New;
        size++;
    }

    public void pop_front() {
        if (size == 0) return;
        Head = Head.getNext();
        size--;
    }

    public void print() {
        Element Temp = Head;
        while (Temp != null) {
            System.out.print(Temp.getData() + "\t");
            Temp = Temp.getNext();
        }
        System.out.println();
    }

    public void reverse() {

        if (size <= 1) {
            return;
        }
        Element prev = null;
        Element curr = Head;
        Element next = null;
        while (curr != null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        Head = prev;
    }

    public void clear() {
        while (size > 0) {
            pop_front();
        }
    }
}