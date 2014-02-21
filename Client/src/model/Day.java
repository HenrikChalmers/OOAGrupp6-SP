/**
 * Write a description of class Day here.
 * 
 * @author David Stromner
 * @version 2013-02-06
 */

/*
 Schema uppbyggnad

 Object f�r varje dag, h�ller reda p� n�dv�ndig information.

 Object lagras i n�ngon form av lista eller tree set.

 */


package model;


import java.io.Serializable;

import org.joda.time.*;

public class Day implements Serializable {
	
	private static final long serialVersionUID = -7092684252961129250L;

	//Dagens nummer i veckan, b�rjar p� 0
	private int dayNr;
	
	public DateTime checkInTime;
	public DateTime checkOutTime;
	
	public DateTime scheduledInTime;
	public DateTime scheduledOutTime;

	public Day() {

	}
	
	public int getDayNr() {
		return dayNr;
	}

	public void setDayNr(int dayNr) {
		this.dayNr = dayNr;
	}
	

}
