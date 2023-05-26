package refactoring_guru.behavioral.memento.example.shapes;

import java.awt.*;
import java.util.Base64;

public class BaseShape implements Shape{
    int x,y;
    private int dx=0,dy=0;
    private Color color;
    private boolean selected=false;
    BaseShape(int x,int y,Color color){
        this.x=x;
        this.y=y;
        this.color=color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
    public int getWidth(){
        return 0;
    }
    public int getHeight(){
        return 0;
    }
    public void drag(){
        dx=x;
        dy=y;
    }
    public void moveTo(int x,int y){
        this.x=dx+x;
        this.y=dy+y;
    }
    public void moveBy(int x,int y){
        this.x+=x;
        this.y+=y;
    }
    public void drop(){
        this.x=dx;
        this.y=dy;
    }
    public boolean isInsideBounds(int x,int y){
        return x>getX() && x<(getX()+getWidth())&&
                y>getY()&& y<(getY()+getHeight());
    }
    public Color getColor(){
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
    public void select(){
        selected=true;
    }
    public void unSelect(){
        selected=false;
    }
    public boolean isSelected(){
        return selected;
    }
    void enableSelectionStyle(Graphics graphics){
        graphics.setColor(Color.LIGHT_GRAY);
        Graphics2D g2=(Graphics2D) graphics;
        float[] dash1={2.0f};
        g2.setStroke(new BasicStroke(1.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,2.0f,dash1,0.0f));
    }
    void disableSelectionStyle(Graphics graphics){
        graphics.setColor(color);
        Graphics2D g2=(Graphics2D) graphics;
        g2.setStroke(new BasicStroke());
    }
    public void paint(Graphics graphics){
        if (isSelected()){
            enableSelectionStyle(graphics);
        }
        else {
            disableSelectionStyle(graphics);
        }
    }
}
