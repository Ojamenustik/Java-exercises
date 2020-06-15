package com.ania;

import java.util.ArrayList;
import java.util.Scanner;

interface IFigure {
    Rectangle getBoundingRectangle();
}

class Rectangle implements IFigure{

    public Rectangle(Point p1, Point p2, Point p3, Point p4){
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
    }

    private Point[] points = new Point[4];

    public Point[] getPoints() {
        return points;
    }

    @Override
    public Rectangle getBoundingRectangle() {
        return new Rectangle(this.points[0], this.points[1], this.points[2], this.points[4]);
    }
}

class Point implements IFigure{

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("%d %d", x, y);
    }

    @Override
    public Rectangle getBoundingRectangle() {
        return new Rectangle(new Point(x,y), new Point(x,y),new Point(x,y),new Point(x,y));
    }
}

class Circle implements IFigure{

    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }
    private Point center;
    private int radius;

    @Override
    public Rectangle getBoundingRectangle() {
      return new Rectangle(new Point(center.getX() - radius, center.getY() -radius),
                new Point(center.getX() - radius, center.getY() + radius),
                new Point(center.getX() + radius, center.getY() - radius),
                new Point(center.getX() + radius, center.getY() + radius));
    }
}

class Vector implements IFigure{

    public Vector(Point start, Point end){
        this.end = end;
        this.start = start;
    }
    private Point start;
    private Point end;

    @Override
    public Rectangle getBoundingRectangle() {
       return new Rectangle(start, end, start, end);
    }
}


public class Main {

    static Rectangle minimumBoundingRectangle(ArrayList<IFigure> figuresList){
        int maxX = -10000;
        int maxY = -10000;
        int minX = 10000;
        int minY = 10000;

        for (IFigure figure : figuresList) {
           Rectangle rectangle = figure.getBoundingRectangle();
          for (Point point : rectangle.getPoints()) {
              int x = point.getX();
              maxX = x > maxX ? x : maxX;
              minX = x < minX ? x : minX;

              int y = point.getY();
              maxY = y > maxY ? y : maxY;
              minY = y < minY ? y : minY;
          }
        }

        return new Rectangle(new Point(minX, minY), new Point(maxX, minY), new Point(minX, maxY), new Point(maxX, maxY));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; ++i) {
            ArrayList<IFigure> figuresList = new ArrayList<IFigure>();
            int figuresNum = sc.nextInt();
            for (int j = 0; j < figuresNum; ++j) {
                String type = sc.next();
                if (type.equalsIgnoreCase("p")) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    figuresList.add(new Point(x, y));
                }
                else if (type.equalsIgnoreCase("c")) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int r = sc.nextInt();
                    figuresList.add(new Circle(new Point(x, y), r));
                }
                else if (type.equalsIgnoreCase("l")) {
                    int x1 = sc.nextInt();
                    int y1 = sc.nextInt();
                    int x2 = sc.nextInt();
                    int y2 = sc.nextInt();
                    figuresList.add(new Vector(new Point(x1, y1), new Point(x2, y2)));
                }
            }
            Rectangle minRec = minimumBoundingRectangle(figuresList);

            System.out.print(minRec.getPoints()[0].toString() + " " + minRec.getPoints()[3].toString() + "\n");
        }
    }
}
