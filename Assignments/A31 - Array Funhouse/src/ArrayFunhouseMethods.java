import java.util.Scanner;
public class ArrayFunhouseMethods {
    Scanner sc = new Scanner(System.in);

    public void getlist() {
        System.out.print("Please input the first item in your list. If you have finished inputting numbers, please input \"done\". ");
        String responsestr = sc.nextLine();
        System.out.println(responsestr);
        if (responsestr == "done"){
            System.out.println("done");
        }}}
 /*        if (responsestr != "done") {
            int responseint = Integer.valueOf(responsestr);
            System.out.println(responseint);
        }
        else System.out.println("done");
    }
}
*/
