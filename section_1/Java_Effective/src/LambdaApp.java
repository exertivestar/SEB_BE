public class LambdaApp {
    public static void main(String[] args) {
        ExampleFunction exampleFunction = (num1, num2) -> num1 + num2;
        System.out.println(exampleFunction.sum(10,15));

//        example = (x) -> System.out.println(x * 5);
    }
}
@FunctionalInterface
interface ExampleFunction {
    int sum(int num1, int num2);
}
@FunctionalInterface
interface MyFunctionalInterface {
    void accept(int x);
}
/*
 * 람다식
 * -> 메서드를 하나의 식으로 표현한 것
 *
 * */
