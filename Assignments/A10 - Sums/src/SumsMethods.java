public class SumsMethods {
    private int num1, num2, answer;

    public void SetNums(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public void FindSum() {
        answer = num1+num2;
    }

    public void PrintSum() {
        System.out.println("The sum of your integers is "+ answer + ". ");
    }
}
