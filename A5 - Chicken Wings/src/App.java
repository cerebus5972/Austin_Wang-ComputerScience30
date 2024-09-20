//Chicken Wings
//Austin Wang
//September 20
//Takes the total money you have as well as a cost of a chicken wing, then returns how many whole chicken wings you can buy with that money. 
public class App {
    public static void main(String[] args) throws Exception {
        double totalmoney = 4.75;
        double chickencost = 0.75;
        System.out.println("\n You can buy "+ (int)(totalmoney/chickencost) +" chicken wings with "+ totalmoney +"$. \n");
    }
}
