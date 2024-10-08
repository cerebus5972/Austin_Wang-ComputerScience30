public class PrintSubmethods {

    private double ans = 0;

    public void output() {
        System.out.println(ans);
        System.out.printf("%8.2f", ans);
    }

    public void calculate(int a, int b) {
        ans = a*b/1.36846785;

    }
}

/*
%f: real/decimal value
%d: integer value 
%c: character value
%s: string value
 */
