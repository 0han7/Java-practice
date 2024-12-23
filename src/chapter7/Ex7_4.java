package chapter7;

public class Ex7_4 {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println("x = " + point3D.x + " y = " + point3D.y + " z = " + point3D.z);
    }
}

class Point {
    int x;
    int y;

    // 생성자
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;

    // 자식 생성자
    Point3D(int x, int y, int z) {
        super(x, y); // Point(int x, int y) 호출
        this.z = z;
    }
}


