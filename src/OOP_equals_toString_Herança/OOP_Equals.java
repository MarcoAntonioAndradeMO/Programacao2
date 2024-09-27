package OOP_equals_toString_Herança;

public class OOP_Equals {
    public class Point {
        private int x = 0, y = 0;

        public Point(int x, int y) {
            if (isValid(x, y)) {
                this.x = x;
                this.y = y;
            } else {
                throw new IllegalArgumentException("Valores de x e y devem estar no intervalo permitido.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }

        public String toString() {
            return "Point(" + "x=" + x + ", y=" + y + ')';
        }

        public int getX() { return x; }
        public int getY() { return y; }

        public void setX(int x) {
            if (isValid(x, y)) {
                this.x = x;
            } else {
                throw new IllegalArgumentException("Valor de x fora do intervalo permitido.");
            }
        }

        public void setY(int y) {
            if (isValid(x, y)) {
                this.y = y;
            } else {
                throw new IllegalArgumentException("Valor de y fora do intervalo permitido.");
            }
        }

        public void moveBy(int dx, int dy) {
            int newX = getX() + dx;
            int newY = getY() + dy;
            if (isValid(newX, newY)) {
                setX(newX);
                setY(newY);
            } else {
                throw new IllegalArgumentException("Movimento resultaria em valores fora do intervalo permitido.");
            }
        }

        protected boolean isValid(int x, int y) {
            return x >= 0 && x <= 400 && y >= 0 && y <= 400;
        }
    }

    class ScreenPoint extends Point {

        public ScreenPoint(int x, int y) {
            super(x, y);
            if (!isValid(x, y)) {
                throw new IllegalArgumentException("Valores de x e y devem estar no intervalo de 0 a 300.");
            }
        }

        public boolean isValid(int x, int y) {
            return x >= 0 && x <= 300 && y >= 0 && y <= 300;
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
