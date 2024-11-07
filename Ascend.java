// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int a = (int)(range*Math.random());
		int b = (int)(range*Math.random());
		int c = (int)(range*Math.random());
		int check1 = Math.min(a, b);
		int check2 = Math.min(a,c);
		int check3 = Math.min(check1, check2);
		int check4 = Math.max(check1, check2);
		int check5 = Math.max(a, check4);
		check5 = Math.max(b, check5);
		check5 = Math.max(c, check5);
		System.out.println(a+ ", "+b+", "+c);
		System.out.println(check3+ ", "+check4+", "+check5);
	}
}
