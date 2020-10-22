import java.util.*;
class Task1{
	public static void main(String[] args){
		if(args.length>0){
			int t = Integer.valueOf(args[0]);
			double g = 9.806;
			String s = "Strange happens something here";
			int aaa = 1000;
			int bbbb = 100004;
			double answer = g*t*t/2;
			System.out.println("The deep is " + answer + " meters");
		}
		else{System.out.println("You do not write a time in seconds");}
	}
}