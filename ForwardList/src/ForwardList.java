public class ForwardList {
    Element Head; //голова списка

    public ForwardList() {
        this.Head = null;
        System.out.println("LConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public void push_front(int Data) {
        Element New = new Element(Data); //создаем новый элемент с заданным значением
        New.setNext(Head); //устанавливаем следующий элемент как текущий головной
        Head = New; //перемещаем голову к новому элементу
    }

    public void push_back(int Data) {
        Element Temp = Head;
        while (Temp.getNext() != null) {
            Temp = Temp.getNext();
        }
        Temp.setNext(new Element(Data));
    }

    public void pop_front() {
        Element Temp = Head;
        Head = Head.getNext();
        Temp.setNext(null);
    }

    public void pop_back() {
        Element Temp = Head;
        while (Temp.getNext().getNext() != null) {
            Temp = Temp.getNext();
        }
        Temp.setNext(null);
    }

    public void print() {
        Element Temp = Head;
        while (Temp != null) {
            System.out.print(Temp.getData() + "\t");
            Temp = Temp.getNext();
        }
        System.out.println();
    }
}