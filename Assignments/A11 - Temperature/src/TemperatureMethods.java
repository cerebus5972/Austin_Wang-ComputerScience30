public class TemperatureMethods {
    public int answer, current;
    public void C2F(int t){
        current = t;
        answer = t*9/5+32;
    }

    public void endC2F(){
        System.out.println("If the temperature outside is " + current + " degrees celcius, then it is " + answer + " degrees fahrenheit.");
    }

    public void F2C(int t){
        current = t;
        answer = (t-32)*5/9;
    }

    public void endF2C(){
        System.out.println("If the temperature outside is " + current + " degrees fahrenheit, then it is " + answer + " degrees celcius.");
    }
}
