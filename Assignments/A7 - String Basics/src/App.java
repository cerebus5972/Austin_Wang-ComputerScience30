//String Basics
//Austin Wang
//24 September 2024
//Returns the first string without "very" and the second with "lol" replaced with "laugh out loud"
public class App {
    public static void main(String[] args) throws Exception {
        String message1 = new String("I am very happy! ");
        String message2 = new String("That was great - lol");

        String remove = new String("very ");
        String replace = new String("lol");

        int removeloco = message1.indexOf(remove);
        int replaceloco = message2.indexOf(replace);

        int removelength = remove.length();
        int replacelength = replace.length();

        String output1 = message1.substring(0, removeloco) + message1.substring(removeloco + removelength);
        String output2 = message2.substring(0, replaceloco) + "laugh out loud" + message2.substring(replaceloco + replacelength);

        System.out.println(output1);
        System.out.println(output2);
    }
}
