import java.util.Scanner;
import java.util.Random;

public class TargetActivity 
{

	public static void main(String[] args)
	{
		Scanner cookie = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please enter a dice number from 1-6 that you want to roll: ");
		int target = cookie.nextInt();
		cookie.nextLine();
		int dice = rand.nextInt(6)+1;
		int count = 0;
		
		while (target<1 || target>6)
		{
			System.out.println("Invalid number. Please enter another number: ");
			target = cookie.nextInt();
			cookie.nextLine();
		}
		
		while (target != dice)
		{
			count +=1;
			System.out.println("The number rolled was " + dice + ". Press enter to roll again: ");
			cookie.nextLine();
			dice = rand.nextInt(6) + 1;
			
		}
		System.out.println("WOOHOO! You rolled a " + target + " after only " + count + " roll(s).");
	}			
	
}
