// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args)
	{
		int currentvalue = Integer.parseInt(args[0]);
		double rate= Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double futurevalue= (Math.pow(((rate/100.0)+1),years)*currentvalue);
		System.out.println("After "+years+" years, a $"+currentvalue+" saved at "+rate+"% will yield $"+(int)futurevalue);
    }
}