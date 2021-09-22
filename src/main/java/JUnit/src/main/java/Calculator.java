public class Calculator {

    public double add(int a, int b) {
        return a + b;
    }

    public double add(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return num1 + num2;
    }
}
