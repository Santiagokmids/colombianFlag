package ui;

import model.Flag;

public class ColombianFlag {
	
	private Flag flag;
	
	public ColombianFlag(Flag flag) {
		this.flag = flag;
	}

	public synchronized void showColors() {
		System.out.print(flag.getFlagColors());
	}

}
