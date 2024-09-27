package OOP_Construtor_encapsulamento_Invariante;

public class Exercicio_oop_construtor {
    class Point {
        private int x = 0, y = 0;

        public Point(int x, int y) {
            setX(x);
            setY(y);
        }

        public int getX() { return x; }
        public int getY() { return y; }

        public void setX(int x) {
            if (x >= 0 && x <= 400) {
                this.x = x;
            } else {
                throw new IllegalArgumentException("O valor de x deve estar entre 0 e 400.");
            }
        }

        public void setY(int y) {
            if (y >= 0 && y <= 400) {
                this.y = y;
            } else {
                throw new IllegalArgumentException("O valor de y deve estar entre 0 e 400.");
            }
        }

        public void moveBy(int dx, int dy) {
            setX(getX() + dx);
            setY(getY() + dy);
        }
    }

    public class Main {
        public void main(String[] args) {
            Point p1 = new Point(10, 20);
            Point p2 = new Point(10, 20);

            System.out.println(p1.equals(p2));
            System.out.println(p1.toString());

            ScreenPoint sp1 = new ScreenPoint(150, 150);
            System.out.println(sp1.toString());

            try {
                ScreenPoint sp2 = new ScreenPoint(350, 150);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
