import java.util.*;
class Task1{
	public static void main(String[] args){
		if(args.length>0){
			int t = Integer.valueOf(args[0]);
			double g = 9.806;
			String s = "Strange happens something here";
			int aaa = 1000;
			int bbbb = 100004;
			int cccc = aaa + bbbb;
			int arr[] = new int[10];
			for (int i = 0; i < 10; i++) {
				arr[i] = (int)(Math.random()*1000);
			}
			System.out.println(Arrays.toString(arr));
			double answer = g*t*t/2;
			System.out.println("The deep is " + answer + " meters");
		}
		else{System.out.println("You do not write a time in seconds");}
	}
}