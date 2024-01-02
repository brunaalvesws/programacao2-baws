package PointExercise;

public class Point {
    private int x = 0, y = 0;

    Point (int coord_x, int coord_y) {
        this.x = coord_x;
        this.y = coord_y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { 
        if (isValidX(x)) {
            this.x = x; 
        } else {
            throw new IllegalArgumentException("Invalid coordinate x for point");
        }
    }
    public void setY(int y) { 
        if (isValidY(y)) {
            this.y = y; 
        } else {
            throw new IllegalArgumentException("Invalid coordinate y for point");
        }
    }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    public boolean isValidX (int x) {
        return (x >=0 && x <= 400);
    }

    public boolean isValidY (int y) {
        return (y >=0 && y <= 400);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return (this.x == point.x && this.y == point.y);
    }
}
