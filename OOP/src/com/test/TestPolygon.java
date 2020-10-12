package com.test;

import com.shape.Rectangle;
import com.shape.Square;

public class TestPolygon {

	public static void main(String[] args) {
		Square square = new Square();
		Rectangle rect = new Rectangle();
		square.setSide(10);
		rect.setBreadth(5);
		rect.setLength(6);

		square.calArea();
		square.calPeri();

		rect.calArea();
		rect.calPeri();

	}

}
