//ini adalah program yang melanggar //

package OPEN_CLOSED_PRINCIPLE;

public class melanggar {
    public void draw(String shapeType) {
        if (shapeType.equals("circle")) {
            drawCircle();
        } else if (shapeType.equals("square")) {
            drawSquare();
        }
    }

    private void drawCircle() {
        // logic untuk menggambar lingkaran
    }

    private void drawSquare() {
        // logic untuk menggambar persegi
    }
}
