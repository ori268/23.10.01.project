
public class Rectangle implements Shape {

	private double length;
	private double width;
	
	public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
	
	@Override
	public double getArea() {
		return length*width;
	}
	
	public String toString() {
		return "직사각형의 넓이 계산 :" + getArea();
	}
	
	
	
}
