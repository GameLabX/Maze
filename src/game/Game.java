package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import engine.Program;

public class Game 
{
	public void tick()
	{
		
	}
	
	public void render(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Program.WIDTH, Program.HEIGHT);
		
		g.setColor(Color.white);
		g.setFont(new Font("Arial black", 1, 32));
		g.drawString("Radi coece", 50, 50);
	}
}
