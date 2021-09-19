public class Rectangle {

    public int x;
    public int y;
    // package
    public int height;
    public int width;

    // x = 100, y = 200 -> x = 77; y = 88;
    void setPosition(int paramX, int paramY){
        x = paramX;
        y = paramY;
    }

    void setX(int paramX){
        x = paramX;
    }

    int getWidth(){
        return width;
    }

    int getHeight(){
        return height;
    }

    double getArea(){
        // area = width * height
        double area = width * height;
        return area;
    }

    double getPerimeter(){
        // perimeter = 2 (width + height)
        double perimeter = 2 * (width + height);
        return perimeter;
    }

    int getX(){
        return x;
    }

    void setY(int paramY){
        y = paramY;
    }

    int getY(){
        return y;
    }

    void grow(int d){
        // x = 10, y = 20, width = 1080, height = 1920
        // x = 10, y = 20, d = 100, width = 1180, height = 2020

        height = height + d;
        width = width + d;
    }

}
