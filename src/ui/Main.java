package ui;

import model.Flag;
import thread.FlagShape;

public class Main {
	
	public static final String SPACE = " \r\n";
	public static final String YELLOW_BACKGROUND = "\u001B[43m";
	public static final String BLUE_BACKGROUND = "\u001B[44m";
	public static final String RED_BACKGROUND = "\u001B[41m";
	
	private static Flag flag1;
	private static Flag flag2;
	private static Flag flag3;

	public static void main(String[] args) throws InterruptedException {
		
		flag1 = new Flag(SPACE,YELLOW_BACKGROUND, 0,9,6);
		flag2 = new Flag(SPACE,BLUE_BACKGROUND, 9,15,14);
		flag3 = new Flag(SPACE,RED_BACKGROUND, 15,20,28);
		FlagShape moveFlag1 = new FlagShape(flag1); 
		FlagShape moveFlag2 = new FlagShape(flag2); 
		FlagShape moveFlag3 = new FlagShape(flag3); 
		System.out.print("\u001b[2J");
		moveFlag1.start();
		moveFlag2.start();
		moveFlag3.start();
		
	}
	
}
