import java.awt.Color;

import javax.swing.JButton;


public class Case extends JButton {

	int x,y;
	Color bg;
	int r=255,v=0,b=0;
	String name;
	
	/* constructeur */
	public Case(){
		bg = new Color(r,v,b);	
	}
	
	void SetIdCase(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	
	int GetCaseX(){
		return x;
	}
	
	int GetCaseY(){
		return y;
	}
	
	/* colorer la case */
	void SetColor(int a , int b, int c){
		r=a;
		v=b;
		b=c;
		bg = new Color(r,v,b);
		this.setBackground(bg);
	}
	
	
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new Case();
//	}
//	
	
}
