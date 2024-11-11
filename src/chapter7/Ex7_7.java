package chapter7;

public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (car) fe;에서 형변환이 생략됨 조상인 Car 타입으로 형변환은 생략이 가능하다.
        fe2 = (FireEngine) car; // 자손인 FireEngine 타입으로 형변환이 가능하지만 생략이 불가능하다.
        fe2.water();
    }
}

    class Car{
        String color;
        int door;

        void drive() {
            System.out.println("drive, Brrr~");
        }

        void stop() {
            System.out.println("stop!!");
        }
    }

    class FireEngine extends Car {
        void water() {
            System.out.println("water!!");
        }
    }



