package shape;

public class Circle extends Shape implements Drawable{

	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw(){
		System.out.println("원을 그립니다.");
	}

	@Override
	public double shapeArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public void visible(boolean visible) {
		if (visible) {
			System.out.println("안보인다!");
		}else{
			System.out.println("보인다!");
		}
	}
}
