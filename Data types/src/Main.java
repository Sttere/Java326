
public class Main {
    public static void main(String[] args) {
        final String delimiter = "\n------------------------------------\n";

        String ba = "byte";
        byte bb = Byte.BYTES;
        byte bc = Byte.SIZE;
        byte bd = Byte.MIN_VALUE;
        byte be = Byte.MAX_VALUE;

        String sbyte = String.format("\nПеременная типа %s занимает %s Байт памяти (%s бит памяти), и принимает значения в диапазоне от %d до %d", ba,bb,bc,bd,be);
        System.out.println(sbyte);

        String sa = "short";
        short sb = Short.BYTES;
        short sc = Short.SIZE;
        short sd = Short.MIN_VALUE;
        short se = Short.MAX_VALUE;

        String sshort = String.format("\nПеременная типа %s занимает %s Байта памяти (%s бит памяти), и принимает значения в диапазоне от %d до %d", sa,sb,sc,sd,se);
        System.out.println(sshort);

        String ia = "integer";
        int ib = Integer.BYTES;
        int ic = Integer.SIZE;
        int id = Integer.MIN_VALUE;
        int ie = Integer.MAX_VALUE;

        String sinteger = String.format("\nПеременная типа %s занимает %s Байта памяти (%s бит памяти), и принимает значения в диапазоне от %d до %d", ia,ib,ic,id,ie);
        System.out.println(sinteger);

        String la = "long";
        long lb = Long.BYTES;
        long lc = Long.SIZE;
        long ld = Long.MIN_VALUE;
        long le = Long.MAX_VALUE;

        String slong = String.format("\nПеременная типа %s занимает %s Байт памяти (%s бит памяти), и принимает значения в диапазоне от %d до %d", la,lb,lc,ld,le);
        System.out.println(slong);

        String fa = "float";
        float fb = Float.BYTES;
        float fc = Float.SIZE;
        float fd = Float.MIN_VALUE;
        float fe = Float.MAX_VALUE;

        String sfloat = String.format("\nПеременная типа %s занимает %s Байт памяти (%s бит памяти), и принимает значения в диапазоне от %e до %e", fa,fb,fc,fd,fe);
        System.out.println(sfloat);

        String da = "double";
        double db = Double.BYTES;
        double dc = Double.SIZE;
        double dd = Double.MIN_VALUE;
        double de = Double.MAX_VALUE;

        String sdouble = String.format("\nПеременная типа %s занимает %s Байт памяти (%d бит памяти), и принимает значения в диапазоне от %e до %e", da,db,dc,dd,de);
        System.out.println(sdouble);
    }
}