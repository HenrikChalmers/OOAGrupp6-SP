/**
 * Represents one week with seven days
 * 
 * @author Simon Planhage
 * @version 2014-02-27
 */

package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Week implements Serializable {


	private static final long serialVersionUID = -8613882887180242145L;

	//Variabler h�r har inga modifiers (private etc.) s� att de kan anropas fr�n samma paket utan att beh�va skicka
	//getters och setters-metoder i varje week objekt till servern.

	//Vecka som schemat representerar
	int weekNr;
	
	//Lista med veckodagarna som h�r till
	ArrayList<Day> days = new ArrayList<Day>();

}