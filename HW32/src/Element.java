public class Element {
    int Data;
    Element Next;

    public int getData() {
        return Data;
    }

    public Element getNext() {
        return Next;
    }

    public void setData(int data) {
        Data = data;
    }

    public void setNext(Element next) {
        Next = next;
    }

    public Element(int Data)
    {
        setData(Data);
        setNext(null);
        System.out.println("EConstructor:\t" + Integer.toHexString(this.hashCode()));
    }

    public Element(int Data, Element Next) {
        setNext(Next);
        setData(Data);
    }
}