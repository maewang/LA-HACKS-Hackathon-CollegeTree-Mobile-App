package hack;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Stack;

//This class will represent a button. It will have the name, and the Jbutton for GUI purposes
public class button implements ActionListener {
	String classname;
	JButton jbutton;
	String prereq;
	String courseDesc;
	int x;
	int y;
	int itemNumber;
	Stack<button> stackA = new Stack<button>(); 
	Color[] colors = {Color.red, Color.CYAN, Color.yellow, Color.green, Color.blue, Color.MAGENTA, Color.black};
	
	//Tree app = new Tree();

	
	//ArrayList<button> prereq;
	
	public button(String name, String pre, String course, int index ) {
		
		this.classname = name;
		this.itemNumber = index;

		//Button Initialization
		this.jbutton = new JButton(name);
	    this.jbutton.setBackground(Color.white);
	    this.jbutton.setSize(150,100);
		this.jbutton.addActionListener(this);
	    
		this.prereq = pre;
		this.courseDesc = course;

	}
	
	public String getName(){
		return classname;
	}
	
	public JButton getButton() {
		return jbutton;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		//Tree a = new Tree();
		String rawPreReq;
		String des;
		Tree.clearAllColors();
		button b;
		int x = 0;

		this.jbutton.setBackground(this.colors[x]);
		des = Tree.getCourseDesc(this.itemNumber);
		System.out.println(des);
		String html_line;
		
		int numLines = ( (int) (des.length()/135) ) + 1;

		//Tree.getJLabel().setText("<html>");
		html_line = "<html>";
		String [] desArray = des.split(" ");
		int lineSize = 0;
		int lineLimit = 135;
		String line = "";
		for (int i = 0; i < desArray.length; i++) {
			if ((lineSize + desArray[i].length() + 1) > lineLimit) {
				html_line = html_line + line + "<br>";
				line = desArray[i] + " ";
				lineSize = desArray[i].length();
			}
			else {
				line = line + desArray[i] + " ";
				lineSize = lineSize + desArray[i].length();
			}
		}
 
		html_line = html_line + line + "</html>";
		Tree.getJLabel().setText(html_line);
		
		/*
		 int j = 0;
		for ( j = 1; j < numLines; j++) {
			html_line = html_line + des.substring((j-1)*135, (j)*135) + "<br>";
			System.out.println(html_line);
		}
		html_line = html_line + des.substring((j-1)*135,des.length() );
		html_line = html_line + "</html>";
		Tree.getJLabel().setText(html_line);*/
		
		
		//Tree.getJLabel().setText(des.substring(i*135, des.length())+ "</html>");
		
		//Tree.getJLabel().setText("<html>" + des.substring(0, 134) + "<br>" +des.substring(135,270) + "<br>" +des.substring(271,des.length()) + "</html>");
		
		x = 1;
		stackA.push(this);

		while(!stackA.isEmpty()) {
			b = stackA.pop();
			if (b.prereq.toString() == ""){
				break;
			}
			rawPreReq = b.prereq;
			System.out.println("Hello! x is: " + x + "and pre req is: " + rawPreReq);
			//This pushes the prereq buttons to the stack
	
			if (rawPreReq.contains(",")) {
				System.out.println("Hello1");
				String[] preReqArray = rawPreReq.split(",");
				
				System.out.println("Hello2");
				for (int i = 0; i < preReqArray.length; i++){
					System.out.println(preReqArray[i]);
					Tree.getButtonJnode(preReqArray[i]).getButton().setBackground(this.colors[x]);
					//Tree.getButtonJnode("CS33").getButton().setBackground(this.colors[x]);
					System.out.println("Hello3");
					stackA.push(Tree.getButtonJnode(preReqArray[i]));
				}
			}
			else {
				Tree.getButtonJnode(rawPreReq).getButton().setBackground(this.colors[x]);
				stackA.push(Tree.getButtonJnode(rawPreReq));
			}
			x++;
		}
		
		
		
		/*if(){
			this.jbutton.setBackground(Color.Red);
		} else if(){
			this.jbutton.setBackground(Color.Orange);
		} else if(){
			this.jbutton.setBackground(Color.Yellow);
		} else if(){
			this.jbutton.setBackground(Color.Green);
		} else if(){
			this.jbutton.setBackground(Color.B);
		} else if(){
			this.jbutton.setBackground(Color.Yellow);*/
	}
	
	
		
}

