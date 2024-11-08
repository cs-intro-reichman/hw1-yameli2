// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int x = Integer.parseInt(args[0]);
		int hundreds = x/100;
		int tens = ((x-(100*hundreds))/10);
		int ones = (x-((100*hundreds)+(10*tens))/1);
		System.out.println(hundreds+" hundreds, "+tens+" tens, and "+ones+" ones.");

	}
}
