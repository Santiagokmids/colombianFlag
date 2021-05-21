package thread;

import model.Flag;
import ui.ColombianFlag;

public class FlagShape extends Thread{
	private ColombianFlag cf;
	private Flag flag;

	public FlagShape(Flag flag) {
		cf = new ColombianFlag(flag);
		this.flag = flag;
	}

	public void run() {
		String flagColors = "";
		synchronized (this) {

			for (int i = 0; i < 100 ; i++) {
				synchronized (this) {
					for (int j = flag.getMin(); j < flag.getMax();j++) {
						flagColors += "\u001b["+i+"G"+"\u001b["+j+"d";
						flagColors += flag.getSpace()+flag.getColor();
						flag.setFlagColors(flagColors);
						cf.showColors();
						try {
							Thread.sleep(flag.getSleep());
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			} 
		}

	}


}
