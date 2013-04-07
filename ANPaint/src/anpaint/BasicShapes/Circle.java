package anpaint.BasicShapes;

import anpaint.DrawMethods.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/*
* the Circle class is a leaf that describes a circle
* the Circle class needs a radius to know how to paint
* the containing point in its _pointSet is the top left corner (of a containing square)
*/
public class Circle extends BasicShape{

    public int _radius;

    public Circle() {
        this(new Point(),0,new Color(0),false,0);
    }

    public Circle(Point p1, int radius, Color colour, boolean style, int weight) {
        _pointSet = new Point[] {p1};
        _radius = radius;
        _colour = colour;
        _style = style;
        _weight = weight;
        _selected = false;
    }

    @Override
    public void add(BasicShape shape) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    public void remove(BasicShape shape) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    public ArrayList<BasicShape> getChildren() {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    public void draw(Graphics g) {
        DrawTemplate draw = new DrawCircle(this, g);
    }

    @Override
    public void moveShape(int dx, int dy) {
        _pointSet[0].translate(dx, dy);
    }

    @Override
    public void resize() {
        //unfinished implementation
    }

    @Override
    public void toggleSelected() {
        _selected = !_selected;
    }
}