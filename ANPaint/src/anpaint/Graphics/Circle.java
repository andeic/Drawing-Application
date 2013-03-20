package anpaint.Graphics;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

/*
* the Circle class is a leaf that describes a circle
* the Circle class needs a radius to know how to draw
* the containing point in its _pointSet is the centroid
*/
public class Circle extends Shapes{

    private int _radius;

    public Circle() {
        this(new Point(),0,new Color(0),false,0);
    }
    
    public Circle(Point p1, int radius, Color colour, boolean style, int weight) {
        _pointSet = new Point[] {p1};
        _radius = radius;
        _colour = colour;
        _style = style;
        _weight = weight;
    }

    @Override
    void addGraphic(Shapes g) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    void removeGraphic(Shapes g) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    ArrayList<Shapes> getChildren() {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    void draw() {
        //unfinished implementation
    }

    @Override
    void move(int dx, int dy) {
        for (int i = 0; i < _pointSet.length; i++) {
            _pointSet[i].translate(dx, dy);
        }

        draw();
    }

    @Override
    void resize() {
        //unfinished implementation
        draw();
    }
}