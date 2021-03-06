
/**
 * Controls all ActionEvents 
 * 
 * @author Henrik Johansson
 * @version 2013-02-12
 */


package controller;

import javax.swing.JOptionPane;

import model.CommRecieve;

/**
 * Controller of what to happen when a button is pressed
 * 
 * @author Henrik
 * @version 2014-02-21
 */
public class ActionHandler { 						
	private static ActionHandler instance = null;	//Singleton
	
	Boolean logicThreadEnd;
	Boolean haltFlag;
	CommRecieve comm;
	
	private ActionHandler(){
		
	}
	
	/**
	 * @return instance of ActionHandler
	 */
	public static ActionHandler getInstance(){ 		//Singleton method
		if(instance == null){
			instance = new ActionHandler();
		}
		return instance;
	}
	
	public void startButton(final int SERVER_PORT){	//Executes when click on start button
		comm = new CommRecieve(SERVER_PORT);
		System.out.println("Server start");
	}
	
	public void stopButton(){						//Executes when click on stop button
		comm.close();
		comm = null;
		System.out.println("Server stop");
	}
	
	public void about(){							//Executes when click on menu item about
		String aboutText = "MarximumWorker 9001 (Server)"
				+ "\n\n"
				+ "Version 1.0\n"
				+ "Source: https://github.com/Stromner/OOAGrupp6-SP\n";
		
		JOptionPane.showMessageDialog(null, aboutText, "about", JOptionPane.INFORMATION_MESSAGE);
	}

}
