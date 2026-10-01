package circle;

public class Ball inmplements CircleTemplate{
	
	private double raidus;
	
	public Ball(double radius) {
		this.radius = radius
	}
	
	@Override
	public double getArea() {
		return 0;
	}

	public double getRaidus() {
		return raidus;
	}

	public void setRaidus(double raidus) {
		this.raidus = raidus;
	}
	
	
	
}
