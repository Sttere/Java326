public class Element {
    int Data;
    Element Next;

    public int getData() {
        return Data;
    }

    public Element getNext() { //брать элемент
        return Next;
    }

    public void setData(int data) { //задавать элемент
        Data = data;
    }

    public void setNext(Element next) {
        Next = next;
    }

    public Element(int Data)  //принимает значение добавляемого элемента
    {
        setData(Data);//загоняет дату в элемент
        setNext(null);//элемент указывает в 0 (в никуда)
        System.out.println("EConstructor:\t" + Integer.toHexString(this.hashCode()));
    }

    public Element(int Data, Element Next) {
        setNext(Next);
        setData(Data);
    }
}