package hack;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;




public class Window extends JFrame implements ActionListener{
	
/*	private static Dimension getBounds;
	private ImageIcon classes_imagesa;
	private ImageIcon classes_imagesb;
	private ImageIcon classes_imagesc;
	private ImageIcon classes_imagesd;
	private JLabel classes_imageslbla = new JLabel();
	private JLabel classes_imageslblb = new JLabel();
	private JLabel classes_imageslblc = new JLabel();
	private JLabel classes_imageslbld = new JLabel(); */
	private JButton ok_button; 
	private ImageIcon image;
	private JLabel Title;
	private boolean once_only = false;
	private int height;
	private int width;
	private JLabel label;
	private JButton button;
	private boolean is_clicked = false;
	private String classes_tab[] = {"Select the major you want","Computer science", "Math", "Food Sciences"};
	private JComboBox combo = new JComboBox(classes_tab);
	private ItemHandler handler = new ItemHandler();
	private JLabel classes = new JLabel();
	private String choice = new String();
	private Font font;
	private JPanel pan = new JPanel() {
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			
			super.paint(g);
			if(is_clicked && !once_only){
				once_only = true;
				this.remove(label);
				this.remove(button);
				g.setColor(Color.BLACK);
				g.drawString(choice,50,200);
				Font font = new Font("Arial", Font.BOLD, 40);
				g.setFont(font);
				g.drawString("Your way",width/2 - 100,30);
				g.drawLine(0, 800, 10000, 800);
				
				System.out.println("I'm drawing");
				panel_setup();
			}
			
		}
	};	
	public Window(){
	
		this.setTitle("College Tree");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(10024,7500);  ===> IMPORTANT DE REMETTRE CETTE LIGNE ET DE SUPR CELLE DU BAS <!!!>
		this.setSize(width,height);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(false);
		System.out.println("exe");
		this.setVisible(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setIconImage(new ImageIcon("images/icon.png").getImage());
		
		if( ! is_clicked ){
			setup_register();
		}
	}
	
	private void panel_setup() {
		System.out.println(is_clicked);
		SwingUtilities.updateComponentTreeUI(pan);
		
		Titleset();
		ok_button();
		combobox();
	}

/*	private void show_Image() {
		
		SwingUtilities.updateComponentTreeUI(pan);
		
		switch(choice){
		
			case("Computer science"): this.classes_imagesa = new ImageIcon("images/Title.jpg");
				this.classes_imageslbla.setBounds(200,300,classes_imagesa.getIconWidth(),classes_imagesa.getIconHeight());
				this.classes_imageslbla.setIcon(classes_imagesa);		
				this.add(classes_imageslbla);
				
			case("class 1"):this.classes_imagesb = new ImageIcon("images/icon.jpg");
				this.classes_imageslblb.setBounds(200,300,classes_imagesb.getIconWidth(),classes_imagesb.getIconHeight());
				this.classes_imageslblb.setIcon(classes_imagesb);		
				this.add(classes_imageslblb);
							
			case("class 2"):this.classes_imagesc = new ImageIcon("images/image.jpg");
				this.classes_imageslblc.setBounds(200,300,classes_imagesc.getIconWidth(),classes_imagesc.getIconHeight());
				this.classes_imageslblc.setIcon(classes_imagesc);		
				this.add(classes_imageslblc);
				
			case("class 3"):this.classes_imagesd = new ImageIcon("images/Sans titre-2.jpg");
				this.classes_imageslbld.setBounds(200,300,classes_imagesd.getIconWidth(),classes_imagesd.getIconHeight());
				this.classes_imageslbld.setIcon(classes_imagesd);		
				this.add(classes_imageslbld);
		}

	}*/

	private void ok_button() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		ok_button = new JButton();
		ok_button.setText("OK");
		ok_button.setBounds(width/2-50,height/2-25,100,50);
		pan.add(ok_button);
		ok_button.addActionListener(this);
	}

	private void Titleset() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		this.Title = new JLabel();
		this.image = new ImageIcon("images/Title.jpg");
		this.Title.setBounds(width/2-150,10,334,64);
		this.Title.setIcon(image);
		this.add(Title);
	}

	private void setup_register() {
		proprietepanneau();
	}

	public void proprietepanneau(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		this.setContentPane(pan);
		this.setLayout(null);
		this.proprietepanel();
		this.proprietebutton();
		pan.setBackground(Color.WHITE);
		System.out.println("width = "+width);		
		System.out.println("height = "+height);	
		pan.setSize(new Dimension(width,height));
	}
	
	public void proprietepanel(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		label = new JLabel();
		label.setBounds(width/2 - 40,height/2 - 80,200,40);
		Font font = new Font("Arial",Font.PLAIN,40);
		label.setText("Connection :");
		pan.add(label);
	}
	
	public void proprietebutton(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		button = new JButton();
		button.setText("Connect");
		button.setBounds(width/2-50,height/2-25,100,50);
		System.out.println(button.getBounds());
		pan.add(button);
		button.addActionListener(this);
		System.out.println("potatoe");
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button){
			this.label.setText("Connected !");
			is_clicked = true;
			pan.invalidate();
		}else if(e.getSource() == ok_button){
			if(!(choice == null || choice == "Select the major you want")){
				System.out.println("choice : " + choice);
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
				Tree web = new Tree(choice);
			}
		}
	}
	
	private void combobox() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		combo.setBounds(width/10, height/10, width-width/5, 30);
		choice = "Select the major you want";
		pan.add(combo);
		combo.addItemListener(handler);
		combo.grabFocus();
		
	}
	
	private class ItemHandler implements ItemListener{
		
	/*	switch(choice){
		case("Computer science"):this.remove(classes_imagesa);
			this.remove(classes_imageslbla);
		case("Class 1"):this.remove(classes_imagesb);
			this.remove(classes_imageslblb);
		case("Class 2"):this.remove(classes_imagesc);
			this.remove(classes_imageslblc);
		case("Class 3"):this.remove(classes_imagesd);
			this.remove(classes_imageslbld);
		}*/
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() == combo){
				choice = (String) combo.getSelectedItem();
				//show_Image();
			}
			
		}
		
	}

}