public class RectangleAppV2 {
    public static void main(String[] args) {


        Rectangle rect1 = new Rectangle();
        rect1.x = 10;
        rect1.y = 20;
        rect1.width = 1080;
        rect1.height = 1080;

        System.out.println("Position: " + "x: " + rect1.x + ",y:" + rect1.y + " w: " + rect1.width + ",h: " + rect1.height );
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println("Area: " + rect1.getArea());

    }
}
