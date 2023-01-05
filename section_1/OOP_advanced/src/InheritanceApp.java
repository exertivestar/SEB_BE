class Cal{ // 수정할 수 없는 클래스가 되었다고 가정
    int v1, v2;
    Cal(int v1, int v2){
        System.out.println("Cal init!!");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum(){return this.v1+v2;}
}
class Cal3 extends Cal {
    //생성자가 있는 부모클래스를 상속받았다면, 반드시 부모클래스의 생성자를 실행시켜야한다.
    Cal3(int v1, int v2) {
        super(v1, v2);//부모클래스의 생성자를 실행시킨다.
        System.out.println("Cal3 init!!");
    }
    public int minus(){return this.v1-v2;}
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal(2, 1);
        Cal3 c3 = new Cal3(2,1);
        System.out.println(c3.sum()); // 3
        System.out.println(c3.minus()); // 1
    }
}

