public class Greeting{
    public static void main (String args[]){
        System.out.println(greeting());
        System.out.println(mygreeting("arpana kumari"));
    }
    public static String greeting(){
        return "hello arpana";
    }
    public static String mygreeting(String message){
        String mes="hello "+message;
        return mes;
    }
}