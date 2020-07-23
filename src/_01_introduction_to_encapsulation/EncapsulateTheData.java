package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


//import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private  int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private static float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private static String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private static Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();


	
@Test
public void tests(){
	setItems(4);
	assertEquals(4, getItems());
	setItems(-5);
	assertEquals(0, getItems());
	setDegrees(20);
	assertEquals(20, getDegrees());
	setDegrees(400);
	assertEquals(20, getDegrees());
	setNomen("hi");
	assertEquals("hi", getNomen());
	setNomen("");
	assertEquals(" ", getNomen());
	setMember(4);
	assertEquals(4, getMember());
	setMember("String");
	System.out.println(getMember());
}
	public  int getItems() {
		return itemsReceived;
	}

	public  void setItems(int x) {
		if (x >= 0) {
			itemsReceived = x;
		} else {
			itemsReceived = 0;
		}
	}

	public float getDegrees() {
		return degreesTurned;
	}

	public void setDegrees(float x) {
		if (x >= 0.0 && x <= 360.0) {
			degreesTurned = x;
		}
	}

	public String getNomen() {
		return nomenclature;
	}

	public void setNomen(String s) {
		if (s != "") {
			nomenclature = s;
		} else {
			nomenclature = " ";
		}
	}

	public Object getMember() {
		return memberObj;
	}

	public void setMember(Object x) {
		if (x instanceof String) {
			memberObj = new Object();
		} else {
			memberObj = x;
		}
	}
}

