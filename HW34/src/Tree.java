public class Tree {
    class Element {
        private int Data;
        private Element Left;
        private Element Right;

        public Element(int data) {
            Data = data;
            Left = null;
            Right = null;
            System.out.println("EConstructor: \t" + Integer.toHexString(hashCode()));
        }

        protected void finalize() {
            System.out.println("EDestructor:\t" + Integer.toHexString(hashCode()));
        }
    }

    private Element Root;

    public Tree() {
        Root = null;
        System.out.println("TConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public void insert(int Data) {
        Root = insert(Data, Root);
    }

    private Element insert(int Data, Element Root) {
        if (Root == null) {
            Root = new Element(Data);
        } else if (Data < Root.Data) {
            Root.Left = insert(Data, Root.Left);
        } else if (Data > Root.Data) {
            Root.Right = insert(Data, Root.Right);
        }
        return Root;
    }

    public int minValue() {
        return minValue(Root);
    }

    private int minValue(Element Root) {
        return Root.Left == null ? Root.Data : minValue(Root.Left);
    }

    public int maxValue() {
        return maxValue(Root);
    }

    private int maxValue(Element Root) {
        return Root.Right == null ? Root.Data : maxValue(Root.Right);
    }

    public int sum() {
        return sum(Root);
    }

    private int sum(Element Root) {
        return Root == null ? 0 : sum(Root.Left) + sum(Root.Right) + Root.Data;
    }

    public void print() {
        print(Root);
    }

    private void print(Element Root) {
        if (Root != null) {
            print(Root.Left);
            System.out.print(Root.Data + "\t");
            print(Root.Right);
        }
    }

    public int count() {
        return count(Root);
    }

    private int count(Element Root) {
        return Root == null ? 0 : 1 + count(Root.Left) + count(Root.Right);
    }

    public void clear() {
        Root = null;
    }

    public void erase(int Data) {
        erase(Root, Data);
    }

    private Element erase(Element Root, int Data) {
        if (Root == null) {
            return Root;
        }
        if (Data < Root.Data) {
            Root.Left = erase(Root.Left, Data);
        } else if (Data > Root.Data) {
            Root.Right = erase(Root.Right, Data);
        } else {
            if (Root.Left == null) {
                return Root.Right;
            } else if (Root.Right == null) {
                return Root.Left;
            }
            Root.Data = minValue(Root.Right);
            Root.Right = erase(Root.Right, Root.Data);
        }
        return Root;
    }
}