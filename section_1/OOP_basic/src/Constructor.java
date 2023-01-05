class Calculator {
    int left, right;

    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
class Car {
    String modelName;
    String color;
    int maxSpeed;

    public Car(String modelName, String color, int maxSpeed) {
        this.modelName = modelName;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }
}
class ThisExample {
    public ThisExample (){
        System.out.println("This Example의 기본 생성자 호출!");
    }

    public ThisExample (int x) {
        this();
        System.out.println("This Example의 두 번째 생성자 호출!");
    }
}

public class Constructor {

    public static void main(String[] args) {
        //************Canculator 예제*********************//
        System.out.println("***********Canculator 예제***********");

        Calculator c1 = new Calculator(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();


        //**************Car 예제*********************//
        System.out.println("\n***********Car 예제***********");

        Car c = new Car("Model X", "빨간색", 250);
        System.out.println("제 차는 " + c.modelName + "이고, 컬러는 " + c.color + "입니다.");


        //******************ThisExample 예제*********************//
        System.out.println("\n************ThisExample 예제***********");

        ThisExample example = new ThisExample();
        ThisExample example2 = new ThisExample(5);
    }

}