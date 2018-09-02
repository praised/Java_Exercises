public class reference{

public static String giveMeAString (String y)
{
    y = "This is a string";
   // System.out.println (y);
    return y;
}
public static void main(String[] args){
String x = null;
giveMeAString (x);
String r = giveMeAString(x);
System.out.println ("actual parameter:"+x);
System.out.print ("formal parameter:"+r);


}
}