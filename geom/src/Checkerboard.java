import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public static void main(String[]args){


public class Checkerboard {

    private static final int SIZE = 8;

    private final int squareSize = 50;

    public void draw(Graphics2D g2) {
        for (int pos = 0; pos < SIZE * SIZE; pos++) {
            int x = calculateX(pos);
            int y = calculateY(pos);
            Color color = calculateColor(pos);

            Rectangle tile = new Rectangle(x, y, squareSize, squareSize);

            g2.setColor(color);
            g2.fill(tile);
        }
    }

    private int calculateX(int pos) {
        return (pos % 8) * squareSize;
    }

    private int calculateY(int pos) {
        return (pos / 8) * squareSize;
    }

    private Color calculateColor(int pos) {
        int offset = (pos % 16) < 8 ? 0 : 1;
        return (pos + offset) % 2 == 0 ? Color.WHITE : Color.BLACK;
    }
}
}