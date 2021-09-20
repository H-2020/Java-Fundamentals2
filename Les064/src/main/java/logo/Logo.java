package logo;

public class Logo {
    private Rectangle rectangle;
    private Circle circle;
    private String text;

    public Logo() {
    }

    public Logo(Rectangle rectangle, Circle circle) {
        this.rectangle = rectangle;
        this.circle = circle;
    }

    public Logo(Rectangle rectangle, Circle circle, String text) {
        this.rectangle = rectangle;
        this.circle = circle;
        this.text = text;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getArea(){
        return (rectangle.getArea() + circle.getArea());
    }
}
