class Cal{ // 수정할 수 없는 클래스가 되었다고 가정
    int v1, v2;
    Cal(int v1, int v2){
        this.v1 = v1;
    }
}
class Cal3 extends Cal {
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal(2, 1);
        Cal3 c3 = new Cal3();
    }
}

