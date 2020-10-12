package com.shape;

public class Square implements Polygon {
	float side = 0;

	public void calArea() {
		System.out.println("Area of Square: " + side * side);
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	public void calPeri() {
		System.out.println("Perimeter of Square :" + (4 * side));
	}
}
