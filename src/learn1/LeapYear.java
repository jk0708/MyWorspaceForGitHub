package learn1;

public class LeapYear {
   public static void main(String args[]){
	   boolean b=leap(2007);
	   if(b){
		   System.out.println("2007 is LeapYear!");
	   }else  System.out.println("Sorry,2007 is not LeapYear");
   }
   public static boolean leap(int year){
	   if(year%4==0&&year%100!=0||year%400==0)
	   return true;
	   else {
	   return false;
	}
   }
}
