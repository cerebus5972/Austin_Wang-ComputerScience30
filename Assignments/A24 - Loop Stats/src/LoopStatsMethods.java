import java.util.Scanner;
public class LoopStatsMethods {
    private int smallestn, largestn, sum, evencount, oddcount;
    Scanner sc = new Scanner(System.in);
    

    public void getnumbers() {
        System.out.print("Please enter your smallest and largest numbers in the form \"a b,\" where a is the smallest number you want in the list and b is the largest. ");
        smallestn = sc.nextInt();
        largestn = sc.nextInt();
    }

    public void count() {
        for (int s = smallestn; s <= largestn; s++) {
            sum = sum + s;
            if (s%2 == 0) evencount++;
            else oddcount++;
        }
    }

    public void returnanswers() {
        System.out.println("The sum of the numbers in your list is " + sum + ". ");
        System.out.println("There are " + evencount + " even numbers in your list. ");
        System.out.println("There are " + oddcount + " odd numbers in your list. ");
    }
}