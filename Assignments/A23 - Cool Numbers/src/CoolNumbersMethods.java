import java.util.Scanner;
public class CoolNumbersMethods {
    private int highest, count;
    Scanner sc = new Scanner(System.in);

    public void getnumber() {
        System.out.print("What is the biggest number you would like us to check? ");
        highest = sc.nextInt();
    }

    public void checknumbers() {
        count = 0;
        for (int h = highest; h > 6; h--) {
            int div6int = h/6;
            double div6dbl = (double)h/6;
            int div5int = h/5;
            double div5dbl = (double)h/5;
            int div4int = h/4;
            double div4dbl = (double)h/4;
            int div3int = h/3;
            double div3dbl = h/3;

            if (div6int == div6dbl && div5int == div5dbl && div4int == div4dbl && div3int == div3dbl) {
                count = count + 1;
            }
        }
}

    public void returnnumbers() {
        System.out.println("There are " + count + " cool numbers that are less than or equal to " + highest + ". ");
    }
}
