package com.shape;

public class Rectangle implements Polygon {
	float length;
	float breadth;

	public void calArea() {
		System.out.println("Area of Rectangle: " + length * breadth);
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public void calPeri() {
		System.out.println("Perimeter of Rectangle :" + (2 * (length + breadth)));
	}
}
