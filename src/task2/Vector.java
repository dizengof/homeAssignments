package task2;

public class Vector {

    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double[] getVector() {
        double[] h = {this.x, this.y, this.z};
        return h;
    }

    public void printVector() {
        System.out.println("(" + this.x + ", " + this.y + ", " + this.z + ")");
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double scalar(Vector h) {
        return (this.x * h.x + this.y * h.y + this.z * h.z);
    }

    public Vector vector(Vector h) {
        Vector result = new Vector(this.y * h.z - this.z * h.y, this.z * h.x - this.x * h.z,
                                   this.x * h.y - this.y * h.x);
        return result;
    }

    public double cos(Vector h) {
        return this.scalar(h) / (this.length() * h.length());
    }

    public Vector sum(Vector h) {
        Vector result = new Vector(this.x + h.x, this.y + h.y, this.z + h.z);
        return result;
    }

    public Vector sub(Vector h) {
        Vector result = new Vector(this.x - h.x, this.y - h.y, this.z - h.z);
        return result;
    }

    static Vector[] generate(int N) {
        double max = 1_000, min = -1_000;
        Vector[] result = new Vector[N];
        for (int i = 0; i < N; i++) {
            Vector h = new Vector(min + (Math.random() * (max - min)),
                                  min + (Math.random() * (max - min)),
                                  min + (Math.random() * (max - min)));
            result[i] = h;
        }
        return result;
    }
}
