interface Calculable {
    double PI = 3.14; // 인터페이스의 변수에는 값이 들어감
    int sum(int v1, int v2); // 인터페이스의 메서드에는 실제 구현이 들어가지 않음
}
interface Printable {
    void print(); // 인터페이스의 메서드에는 실제 구현이 들어가지 않음
}

/*하나의 클래스는 여러개의 인터페이스를 가질 수 있음*/
class RealCal implements Calculable, Printable{
    public int sum(int v1, int v2) {
        return v1 + v2;
    }
    public void print() {
        System.out.println("This is RealCal!!");
    }
}
class AdvancedPrint implements Printable{
    public void print() {
        System.out.println("This is RealCal!!");
    }
}
public class InterfaceApp {
    public static void main(String[] args){
        Printable c = new AdvancedPrint();
        c.print();
    }
}
