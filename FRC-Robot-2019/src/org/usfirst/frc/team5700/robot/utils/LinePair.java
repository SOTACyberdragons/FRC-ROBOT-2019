package org.usfirst.frc.team5700.robot.utils;
import java.util.Objects;

public class LinePair {
	
	private double leftx, rightx; 
	
	public LinePair(double leftx, double rightx) {
		this.leftx = leftx;
		this.rightx = rightx;
	}
	
	public void setPair(double leftx, double rightx) {
		this.leftx = leftx;
		this.rightx = rightx;
	}
	
	public void writeOutput() {
		System.out.print("leftx: " + leftx);
		System.out.println(" rightx: " +rightx);
	}

	 @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinePair other = (LinePair) obj;
		if (Double.doubleToLongBits(leftx) != Double.doubleToLongBits(other.leftx))
			return false;
		if (Double.doubleToLongBits(rightx) != Double.doubleToLongBits(other.rightx))
			return false;
		return true;
	}

	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(leftx);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rightx);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	  
	 
	   

}
