package PointExercise;

public class main {
    public static void main(String[] args) {
        Point p = new Point(10,10);
        System.out.println("Ponto p " + p.toString());

        p.setX(20);
        p.setY(30);

        System.out.println("Ponto p " + p.toString());

        try {
            p.setX(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            p.setY(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Point p2 = new Point(40,40);

        System.out.println("p equals p2 " + p.equals(p2));

        p.setX(40);
        p.setY(40);

        System.out.println("p equals p2 " + p.equals(p2));


        ScreenPoint sp = new ScreenPoint(50,50);
        System.out.println("ScreenPoint sp " + sp.toString());

        sp.setX(200);
        sp.setY(300);
        System.out.println("ScreenPoint sp " + sp.toString());

        try {
            sp.setX(400);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sp.setY(305);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("p equals sp " + p.equals(sp));

        
    }
}
