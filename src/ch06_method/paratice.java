package ch06_method;

public class Factorial {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number + "의 팩토리얼: " + factorial(number));
    }
}



