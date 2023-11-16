public class ForwardList {
    Element Head; //голова списка
    int size;

    public ForwardList() {
        this.Head = null;
        size = 0;
        System.out.println("LConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public void push_front(int Data) {
        Element New = new Element(Data); //создаем новый элемент с заданным значением
        New.setNext(Head); //устанавливаем следующий элемент как текущий головной
        Head = New; //перемещаем голову к новому элементу
        /* или можно так сократить три кода выше Head = new Element(Data, Head); */
        size++;
    }

    public void push_back(int Data)  //push_back не умеет рабоать с пустым списком
    {
        if (Head == null) {
            push_front(Data);
            return;
        }
        //Доходим до конца списка
        Element Temp = Head;
        while (Temp.getNext() != null) {
            Temp = Temp.getNext();
        }
        //Добавляем элемент в конец списка
        Temp.setNext(new Element(Data));
        size++;
    }

    //удаляет начальный элемент списка
    public void pop_front() {
        Head = Head.getNext();
        size--;
    }

    //удаляет последний элемент списка
    public void pop_back() {
        Element Temp = Head;
        while (Temp.getNext().getNext() != null) Temp = Temp.getNext();
        Temp.setNext(null);
        size--;
    }

    //добавляет значение по заданному индексу
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
       /* Element New = new Element(Data);
        New.setNext(Temp.getNext());
        Temp.setNext(New); */
        Temp.setNext(new Element (Data, Temp.getNext()));
    }

    //удаляет значение по заданному индексу
    public void erase(int Data, int Index) {
    }

    public void print() {
        Element Temp = Head; //Temp - это итератор
        //Итератор - это указатель при помощи которого может получить доступ к элементам структуры данных
        while (Temp != null) {
            System.out.print(Temp.getData() + "\t");
            Temp = Temp.getNext();
        }
        System.out.println();
    }
    public void erase(int Index) { //удаляет значение по заданному индексу
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