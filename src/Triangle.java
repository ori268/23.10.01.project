
public class Triangle implements Shape {

	private double Base;
	private double height;
	
	public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
	
	@Override
	public double getArea() {
		return Base*height*1/2;
	}
	
	public String toString() {
		return "삼각형 넓이 계산 :" + getArea();
	}
	
}
