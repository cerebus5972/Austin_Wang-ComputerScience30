import java.util.Scanner;
public class BoxWordMethods {
    private String magicword;
    Scanner sc = new Scanner(System.in);

    public void getstring() {
        System.out.print("What word do you want to use? ");
        magicword = sc.nextLine();
    }

    public void returnbox() {
        System.out.println("Here is your word box: \n");
        for (int x = 1; x<=magicword.length(); x++) {
            System.out.println(magicword);
        }
        System.out.println("");
    }
}
