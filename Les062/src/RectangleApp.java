public class RectangleApp {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        rect1.x = 10;
        rect1.y = 20;
        rect1.width = 1080;
        rect1.height = 1080;

        // SQUARE INSTA POSTS -> 1080px x 1080px

        System.out.println("Height:   " + rect1.height);
        System.out.println("Width:    " + rect1.width);

        System.out.println("Position: " + "x: " + rect1.x + ",y:" + rect1.y + " w: " + rect1.width + ",h: " + rect1.height );

        String SEPARATOR = "-------------------------------------------------";
        System.out.println(SEPARATOR);

        rect1.setPosition(77, 88);

        System.out.println("Position: " + "x: " + rect1.x + ",y:" + rect1.y + " w: " + rect1.width + ",h: " + rect1.height );

        System.out.println(SEPARATOR);

        rect1.setX(999);

        System.out.println("Position: " + "x: " + rect1.x + ",y:" + rect1.y + " w: " + rect1.width + ",h: " + rect1.height );

        System.out.println(SEPARATOR);

        rect1.grow(100);

        System.out.println("Position: " + "x: " + rect1.x + ",y:" + rect1.y + " w: " + rect1.width + ",h: " + rect1.height );

        Rectangle rect2 = new Rectangle();
        rect2.x = 30;
        rect2.y = 40;
        rect2.width = 1920;
        rect2.height = 1080;

        // FULL HD RESOLUTION -> 1920px x 1080px

        System.out.println("Height:   " + rect2.height);
        System.out.println("Width:    " + rect2.width);

        System.out.println("Position: " + rect2.x + "," + rect2.y);

    }

}
