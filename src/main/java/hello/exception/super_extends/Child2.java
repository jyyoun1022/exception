package hello.exception.super_extends;

public class Child2 extends Parent2{

    private int num3;
    private int num4;

    public Child2(int num1, int num2, int num3, int num4) {
        super(num1, num2);//부모 클래스 객체를 만들기 위한 매개변수 전달
                            //자식 클래스에서 부모 클래스를 만들기 위한 매개변수를 모두 받는다.
        this.num3 = num3;
        this.num4 = num4;
    }

    public void showChildInfo(){
        System.out.println("num3 = " + this.num3);
        System.out.println("num4 = " + this.num4);
        System.out.println("======child=======");
    }
}
