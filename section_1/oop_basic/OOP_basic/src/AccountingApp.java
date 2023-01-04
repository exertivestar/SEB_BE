class Accounting{
    public double valueOfSupply;
    public static double vatRate = 0.1; // 부가가치세는 어느 인스턴스에서든 동일하기 때문에 클래스의 소속인 static으로 냅두는게 더 좋을 수 있다.
    public Accounting(double valueOfSupply) {
        this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
    public static void main(String[] args) {
        Accounting a1 = new Accounting(10000.0);

        Accounting a2 = new Accounting(20000.0);

        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);

        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());

        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());

    }
}