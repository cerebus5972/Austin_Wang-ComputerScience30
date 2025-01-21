import java.util.Scanner;
import java.util.ArrayList;


public class ArrayFunhouseMethods {
    Scanner sc = new Scanner(System.in);
    public int length, count;
    int[] funhouse = null;
    int[] nothrees = null;

    public void create_array() {
        System.out.print("Please input the length of your array: ");
        length = sc.nextInt();
        funhouse = new int[length];
    }

    public void input_numbers() {
        for (int i=0; i<length; i++){
            System.out.print("What number would you like to add to the array? ");
            int num = sc.nextInt();
            funhouse[i] = num;
        }
    }

    public void countmultiples() {
        ArrayList<Integer> nothrees = new ArrayList<Integer>();

        for (int j=0; j<length; j++){
            if (funhouse[j]%3==0) {
                count++;
            }
            else {
                nothrees.add(funhouse[j]);
            }
        }
        System.out.println("\nThere are " + count + " multiples of three in your array. ");
        System.out.println("Your array without any multiples of three is " + nothrees);
        System.out.println("There are now no threes in your array. ");
        
    }



}