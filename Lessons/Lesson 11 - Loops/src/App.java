public class App {
    public static void main(String[] args) throws Exception {
        int num = 2;
        while (num>0) {
            System.out.println(num);
            num--;
        }

        boolean game = true;
        while (game && num == 0) {
            System.out.println("Playing Game");
            game = false;
        }

        for ( int i = 10; i>0; i--) {
            System.out.println(i);
        }
    }
}
