package hello.exception.super_extends;

public class Child extends Parent{

    public Child() {
        System.out.println("Child() 생성자 호출");
    }

    public void goo(){
        foo();
        System.out.println(" Child 에서 Child.goo()");
    }
}
