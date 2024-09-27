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
        public static void main(String[] args) {
            Point p = new Point(10, 10);
            System.out.println("Posição inicial: (" + p.getX() + ", " + p.getY() + ")");

            p.moveBy(50, 100);
            System.out.println("Posição após moveBy(50, 100): (" + p.getX() + ", " + p.getY() + ")");

            try {
                p.setX(500); // Deve lançar exceção
            } catch (IllegalArgumentException e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            }
        }
    }

}
