package chapter14;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));


        // iterator 획득
        Iterator<Student> it = list.iterator();
        /* Iterator는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화한 것
         */

        while (it.hasNext()) { // hasNext(): 읽어올 요소가 남아있는지 확인하는 메서드, 요소가 있으면 true , 없으면 false
            // Student s = (Student) it.next();  // 지네릭스를 사용하지 않으면 형변환 필요.
            Student s = it.next(); // next(): 다음 데이터를 반환
            System.out.println(s.name);
        }
    } // main
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}