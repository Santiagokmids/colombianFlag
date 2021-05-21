package model;

public class Flag {

	public final static String ESC   = "\u001b[";

	private String color;
	private String space;
	private int min;
	private int max;
	private String flagColors;
	private int sleep;

	public Flag(String space, String color, int min, int max, int sleep) {
		this.space = space;
		this.color = color;
		this.min = min;
		this.max = max;
		this.setSleep(sleep);
		setFlagColors("");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpace() {
		return space;
	}

	public void setSpace(String space) {
		this.space = space;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public String getFlagColors() {
		return flagColors;
	}

	public void setFlagColors(String flagColors) {
		this.flagColors = flagColors;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

}
