import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(400, 400);
	noLoop();
}
public void draw()
{
	background(255,255,255);
	Die dice = new Die(250, 150);
	Die dice1 = new Die(50, 150);
	dice.roll();
	dice.show();//your code here
	dice1.roll();
	dice1.show();//your code here
	int total = dice.r + dice1.r;
	fill(0);
	textSize(20);
	text("Total: " + total, 165, 350);
	text("Click to roll!", 250, 30);
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX, myY;//variable declarations here
	Die(int x, int y) //constructor
	{
		myX = x;
		myY = y;//variable initializations here
	}
	int r;
	public void roll()
	{
		r = (int)(Math.random()*6)+1;//your code here
	}
	public void show()
	{
		fill(0);
		rect(myX,myY,100,100,10);
		if (r == 1)
		{
			fill(255,255,255);
			ellipse(myX+50,myY+50,18,18);
		}
		else if (r == 2)
		{
			fill(255,255,255);
			ellipse(myX+80,myY+20,18,18);
			ellipse(myX+20,myY+80,18,18);
		}
		else if (r == 3)
		{
			fill(255,255,255);
			ellipse(myX+80,myY+20,20,18);
			ellipse(myX+20,myY+80,18,18);
			ellipse(myX+50,myY+50,18,18);
		}
		else if (r == 4)
		{
			fill(255,255,255);
			ellipse(myX+20,myY+20,18,18);
			ellipse(myX+20,myY+80,18,18);
			ellipse(myX+80,myY+80,18,18);
			ellipse(myX+80,myY+20,18,18);
		}
		else if (r == 5)
		{
			fill(255,255,255);
			ellipse(myX+20,myY+20,18,18);
			ellipse(myX+20,myY+80,18,18);
			ellipse(myX+80,myY+80,18,18);
			ellipse(myX+80,myY+20,18,18);
			ellipse(myX+50,myY+50,18,18);
		}
		else if (r == 6)
		{
			fill(255,255,255);
			ellipse(myX+20,myY+20,18,18);
			ellipse(myX+20,myY+80,18,18);
			ellipse(myX+80,myY+80,18,18);
			ellipse(myX+80,myY+20,18,18);
			ellipse(myX+80,myY+20,18,18);
			ellipse(myX+20,myY+50,18,18);
			ellipse(myX+80,myY+50,18,18);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
