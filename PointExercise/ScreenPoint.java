package PointExercise;

public class ScreenPoint extends Point {
    ScreenPoint(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isValidX (int x) {
        return (x >=0 && x <= 300);
    }

    @Override
    public boolean isValidY (int y) {
        return (y >=0 && y <= 300);
    }

}
