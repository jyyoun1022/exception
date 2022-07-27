package hello.exception.super_extends;

public class Parent2 {
    protected int num1;//protected
    protected int num2;//다른패키지x,다른 패키지의 자식O,같은 패키지 O
    public Parent2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Parent2() 생성자 호출");
    }
    public void showParentInfo(){
        System.out.println("num1 = " + this.num1);
        System.out.println("num2 = " + this.num2);
        System.out.println("========parent=======");
    }


}
