package gui.screencomp;

import java.awt.GridBagConstraints;
import java.awt.Point;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class StartButton extends JButton {
	private GridBagConstraints c = new GridBagConstraints();
	
	public StartButton(){
		super("Access	");
	}
	
	public GridBagConstraints getGBagC(){
		return c;
	}
	public void setGBagC(int x, int y, int height, int length){
		c.gridx = x;
		c.gridy = y;
		c.gridheight = height;
		c.gridwidth = length;
	}
	public void setGBagC(Point p, int height, int length){
		int x = p.x;
		int y = p.y;
		setGBagC(x, y, height, length);
	}
	public void setGBagC(int x, int y){
		c.gridx = x;
		c.gridy = y;
	}
	public void setGBagC(Point p){
		setGBagC(p.x, p.y);
	}
	public void setGBagC(GridBagConstraints c){
		this.c = c;
	}
}