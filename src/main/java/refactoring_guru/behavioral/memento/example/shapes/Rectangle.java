package refactoring_guru.behavioral.memento.example.shapes;

import java.awt.*;

public class Rectangle extends BaseShape{
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height,Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.drawRect(x,y,getWidth()-1,getHeight()-1);
    }
}
