import java.util.Random;
public abstract class GameSystem {
	private String platform;
	private int serialNo;
	public GameSystem() {
		this.platform = "";
		this.serialNo = (int)(Math.random()*1000000);
	}
	public GameSystem(String p) {
		this.platform = p;
		this.serialNo = (int)(Math.random()*1000000);
	}
	public String getPlatform() {
		return platform;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public String toString()
	{
		return "\nPlatform: " + platform + "\nSerial #: " + serialNo;
	}
}