package org.usfirst.frc.team5700.robot.utils;

import java.util.ArrayList;

public class LinePairTest {
	
	private double [] coordinates = {10,12,20,22,30};
	//private LinePair [] linePairs = new LinePair[4];
	private LinePair linePair;
	private ArrayList<LinePair> linePairs = new ArrayList<LinePair>();
	
	public void findPairs() {
	
		
		for(int i = 1; i < coordinates.length - 1; i++) {
			
			double currentItem = (double)coordinates[i];
			double priorItem = (double)coordinates[i-1];
			double nextItem = (double)coordinates[i+1];
			
			if(Math.abs(currentItem - priorItem) < Math.abs(currentItem - nextItem)) {				
				linePair = new LinePair(priorItem, currentItem);				
				
				if(!linePairs.contains(linePair)) {
					linePairs.add(linePair);
				}
	
			} else if (Math.abs(currentItem - nextItem) < Math.abs(currentItem - priorItem)) {
				linePair = new LinePair(currentItem, nextItem);		
	
				if(!linePairs.contains(linePair)) {
					linePairs.add(linePair);
					}
	
			} else {
				System.out.println("The line with the x coordinate " + coordinates[i] + " does not have a pair"); 
			}
		}
		
	}
	
	//TODO switch to native contains when I figure this out
	public boolean myContains(ArrayList<LinePair> linePair) {
		boolean check = false;
		for(LinePair myLine : linePairs) {
			if(myLine.equals(linePairs)) {
				check = true;
			}
		}
		return check;
	}
	
	public void printLinePairs() {
		for(LinePair myLine : linePairs) {
			myLine.writeOutput();
		}
		
		System.out.println("Done!");
	}

}
