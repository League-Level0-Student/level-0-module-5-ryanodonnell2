import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
Robot rob = new Robot();
		//2. Set the speed to 100
rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello, what color?", "Color", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"RED","GREEN", "BLUE"}, 0);
		System.out.println(colorChoice);
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		if (colorChoice==0) {
			rob.setPenColor(255,0,0);
		}
		else if (colorChoice==1) {
			rob.setPenColor(0,255,0);
		} else {
			rob.setPenColor(0,0,255);
		}
		//4. Ask the use how many polygons they want to be drawn.
		rob.penDown();
String angles=JOptionPane.showInputDialog("How many angle do you want on the object");
		//5. Use the robot to draw the number of polygons the user requested.
		int a=Integer.parseInt(angles);
		//6. Make it so your shapes do not overlap
		for (int i = 0; i < a; i++) {
			rob.move(10);
			rob.turn(a/360);
		}
		//7. Challenge: add more colors to the Option Dialog.
	}
}

