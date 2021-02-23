package day6;

import java.util.Scanner;
public class Fan {
	public static void main(String[] args) throws Exception {
		
		FanState state=Switch.getState(args[0]);
		state.changeState();		
	}
}

class Switch{
	public static FanState getState(String paintClass) throws Exception{
		FanState state=new FanState();
		SwitchState switch_state=(SwitchState)Class.forName(paintClass).newInstance();
		//dependency injection
		state.switch_state=switch_state;
		return state;
	}
}
 
 class FanState{
	 SwitchState switch_state;
		public void changeState() {
			System.out.println(switch_state);
		} 
 }

 abstract class SwitchState{}
 
class On extends SwitchState{}

class MediumSpeed extends SwitchState{}

class HighSpeed extends SwitchState{}

class Off extends SwitchState{}

