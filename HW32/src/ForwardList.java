public class ForwardList {
    Element Head;
    int size;

    public ForwardList() {
        this.Head = null;
        size = 0;
        System.out.println("LConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public void push_front(int Data) {
        Element New = new Element(Data);
        New.setNext(Head);
        Head = New;
        size++;
    }

    public void push_back(int Data)
    {
        if (Head == null) {
            push_front(Data);
            return;
        }

        Element Temp = Head;
        while (Temp.getNext() != null) {
            Temp = Temp.getNext();
        }

        Temp.setNext(new Element(Data));
        size++;
    }


    public void pop_front() {
        Head = Head.getNext();
        size--;
    }


    public void pop_back() {
        Element Temp = Head;
        while (Temp.getNext().getNext() != null) Temp = Temp.getNext();
        Temp.setNext(null);
        size--;
    }


    public void insert(int Data, int Index) {
        if (Index == 0) {
            push_front(Data);
            return;
        }
        if (Index > size) return;
        Element Temp = Head;
        for (int i = 0; i < Index - 1; i++) {
            Temp = Temp.getNext();
        }
        Temp.setNext(new Element (Data, Temp.getNext()));
    }

    public void erase(int Data, int Index) {
    }

    public void print() {
        Element Temp = Head;
        while (Temp != null) {
            System.out.print(Temp.getData() + "\t");
            Temp = Temp.getNext();
        }
        System.out.println();
    }
    public void erase(int Index) {
        if (Index < 0 || Index >= size) return;
        if (Index == 0) {
            pop_front();
            return;
        }
        Element Temp = Head;
        for (int i = 0; i < Index - 1; i++) {
            Temp = Temp.getNext();
        }
        Temp.setNext(Temp.getNext().getNext());
        size--;
    }
}