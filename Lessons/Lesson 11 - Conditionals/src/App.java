public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;
        int y = 5;

        if (x<0) {
            System.out.println("x is negative");
            if (x>y) {
                System.out.println("x is negative and bigger than y.");
            }
        }

        else if (x==0 && y == 0) {
            System.out.println("x is zero and y is 0");
        }

        else if (x>0) {
            System.out.println("x is positive");
        }

        else if (x <0 || x > 5) {
            System.out.println("x is outside of the range [0,5].");
        }
    }
}
