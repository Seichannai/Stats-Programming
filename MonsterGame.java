/**
 * 
 */
package Prgrams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
/**
 * @author seich
 *
 */
public class MonsterGame {

	/**
	 * @param args
	 */
	static double winNotSwitch=0 ;
	static double winSwitch = 0 ;
	
	public void GamePlay()
	{
		// TODO Auto-generated method stub
		
		
		int doorPick;
		int prize;
		int doorOpen;
		
		int gameRepeat = 10000;
		
	
for (int i =1; i <= gameRepeat; i++)
{
	
		
		 Random rand = new Random();
		 prize = 1+ rand.nextInt(3);
		 
		 System.out.println("The prize is at door: " + prize);
		 
		  
		 System.out.println("which door would you like to choose?");
		 System.out.println("1, 2, or 3?  ");
		 
		doorPick = 1+ rand.nextInt(3);
		
		int doorSwitch = doorPick;
		
		System.out.println(doorPick);
		 
		 //chose a door to open
		
		doorOpen = 1+ rand.nextInt(3);
		System.out.println("the host will open a door");
		
		 
		while (doorOpen == doorPick || doorOpen == prize)
		{
			doorOpen = 1+ rand.nextInt(3);
		}
	
		System.out.print("the door #:  " + doorOpen + " is now opened");
		
		System.out.print(" \n");
		 
		 System.out.println("would you like to switch? \n");
		 
		 System.out.println("choose 'Y' for yes, 'N' for no! \n");
		 
	//	 System.out.println("Probability of winning by switching");
		 
		
	/*		 while (doorSwitch == doorPick || doorSwitch == doorOpen)
				{
					doorSwitch = 1+ rand.nextInt(3);
					System.out.println("your door now switch to door #  " + doorSwitch);
					
				}
	*/			
			 
			//condition to win if a player choose to switch door 
			 
			 if (SwitchDoor(doorPick, doorOpen,doorSwitch) == prize)
			 {
				 winSwitch = winSwitch +1;
				 
				 System.out.println("you win when switch door: " + winSwitch);
				 System.out.println("probability of winning when switch door " + i + " times is :"  + (winSwitch/i));
				 
			 } else
				 {
				 System.out.println("you lose when switch door! ");
				 System.out.println("probability of winning when switch door " + i + " times is :"  + (winSwitch/i));
				 
				 }
			
			
			
			 
}
		 

		 
		 }
		 
		
		
		
		public static int SwitchDoor(int a, int b, int doorSwitch)
		{
			Random rand = new Random();
			
			while (doorSwitch == a || doorSwitch == b)
			{
				doorSwitch = 1+ rand.nextInt(3);
				
				
			}
			System.out.println("your door now switch to door #  " + doorSwitch);
			
			return doorSwitch;
		}
		
}

	


