public class variables{
    public static void main(String[] args){

        String x="Ahmed Yehia";
        String y="Karim Yehia";

        String temp;

        temp=x;
        x=y;
        y=temp;


        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}