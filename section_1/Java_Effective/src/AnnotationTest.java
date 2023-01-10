//public interface ExampleInterface {
//    void example();
//}
//
//public class ExampleClass implements ExampleInterface {
//    @Override
//    public void example() {
//
//    }
//}

class SuperClass {
    public void example() {
        System.out.println("example() of SuperClass");
    }
}

class SubClass extends SuperClass {
    @Override
    public void example() {
        System.out.println("example() of SubClass");
    }
}

public class AnnotationTest {
    public static void main(String[] args){

    }
}
