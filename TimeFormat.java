// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
	String time = args[0];
	int x = 0;
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" +time.charAt(0) + time.charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" +time.charAt(3) + time.charAt(4));
        // Replace this comment with the rest of your code
	if(hours<12)
	{
		System.out.print(hours+":"+time.charAt(3)+time.charAt(4)+" AM");
	}	
	else
	{
	if(hours==12)
	{
		System.out.print(hours+":"+time.charAt(3)+time.charAt(4)+" PM");
    }
	else
	{
	 x=hours-12;
	 System.out.print(x+":"+time.charAt(3)+time.charAt(4)+" PM");
	}
	}
	}
}
