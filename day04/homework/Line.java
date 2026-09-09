package homework;

public class Line {
	int length;
	
	public Line(int length) {
		this.length = length;
	}
	
	public boolean isSameLine(Line l) {
		if(length == l.length) {
			return true;
		}else {
			return false;
		}
	}
}
