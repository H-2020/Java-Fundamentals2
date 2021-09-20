package logo;

public class DrawingApp {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(100, 200, 1080, 1920);
        Circle circle1 = new Circle(128, 65, 144);

        Logo logo1 = new Logo();
        logo1.setRectangle(rectangle1);
        logo1.setCircle(circle1);
        double areaOfLogo1 = logo1.getArea();
        System.out.println(areaOfLogo1);

        Logo logo2 = new Logo(rectangle1, circle1);

        // area = (rectangle.getArea() + circle.getArea())
        // 2073600 + 65144.065264838
        double areaOfLogo2 = logo2.getArea();
        System.out.println(areaOfLogo2);

        Rectangle rectangle2 = new Rectangle(50, 99, 1080, 1080);
        logo2.setRectangle(rectangle2);

        // area = (rectangle.getArea() + circle.getArea())
        areaOfLogo2 = logo2.getArea();
        System.out.println(areaOfLogo2);

    }
}
