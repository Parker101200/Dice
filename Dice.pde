void setup()
{
	size(400, 400);
	noLoop();
}
void draw()
{
	background(255,255,255);
	int total = 0;
	for (int y = 1; y < 350; y+=150)
	{
		for (int x = 1; x < 350; x+=150)
		{
			Die dice = new Die(x, y);
			dice.roll();
			dice.show();
			total = total + dice.r;
		}
	}
	fill(0);
	textSize(20);
	text("Total: " + total, 165, 295);
	text("Click to roll!", 150, 145);
}
void mousePressed()
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
	void roll()
	{
		r = (int)(Math.random()*6)+1;//your code here
	}
	void show()
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
