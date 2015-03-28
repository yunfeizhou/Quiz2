import java.util.Scanner;
public class TotalTuition{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of the rate of your tuition increasing:");
		float rate = input.nextFloat();
		
		final double quize = 12342;
		
		double totaltuition =quize + quize*(1+rate)+ (quize*(1+rate))*(1+rate)+(quize*(1+rate))*(1+rate)*(1+rate);
		System.out.println("your total tuition is" + totaltuition);
	}
}