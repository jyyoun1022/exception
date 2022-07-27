package hello.exception.super_extends;

public class ExampleExtends {
    public static void main(String[] args) {

        //  1) 부모의 생성자부터 호춯한다.(부모 객체를 제일 먼저 생성)
        //  2) 자식의 생성자를 호출한다.(부모 객체가 만들어 진 다음 그 객체를 포함하는 형태로 자식 객체가 만들어진다.)
        Child child = new Child();
        System.out.println("new Child() 해쉬코드 : "+child.hashCode());//    new Child() 시 발생하는 메모리 주소값

        child.foo();    //부모에 정의된 foo() 함수
        child.goo();    //자식에 정의된 goo() 함수

        Parent parent = new Parent();   //부모의 생성자만 호출
        parent.foo();   //부모가 가지고 있는 foo() 호출가능

    }
}
