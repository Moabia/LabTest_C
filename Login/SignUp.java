import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame{
	
		private JLabel title,namelabel,passlabel, img;
		private JTextField textfield;
		private JPasswordField passfield;
		private JButton btn1, btn2,btn3;
		private ImageIcon image1;
		private Font font1,font2,font3;
		private ImageIcon icon;
	
	SignUp(){

	
	
		ImageIcon icon=new ImageIcon(getClass().getResource("icon.png"));
		this.setIconImage(icon.getImage());
		
		
	
		
		
		title =new JLabel("Welcome to Online Ordering!!");
		namelabel = new JLabel("Enter UserName:");
		passlabel = new JLabel("Enter Password:");
		
		textfield=new JTextField();
		passfield=new JPasswordField();
		
		btn1 =new JButton("Log in");
		btn2 =new JButton("Clear");
		btn3=new JButton("Sign Up");
		
		 image1 = new ImageIcon("user.jpg");
		 img =new JLabel(image1);		 
		 img.setBounds(0,0,image1.getIconWidth(),image1.getIconHeight());
		
		font1 =  new Font("Ariel",Font.BOLD,27);
		font2 =  new Font("Ariel",Font.BOLD,22);
		font3=  new Font("Ariel",Font.BOLD,23);
		
		textfield.setBounds(870,329,180,30);
		passfield.setBounds(870,365,180,30);
		
		btn1.setBounds(760,430,110,30);
		btn2.setBounds(890,430,110,30);
		btn3.setBounds(820,480,140,30);
		
		namelabel.setBounds(670,323,190,45);
		passlabel.setBounds(670,355,190,45);
		
		title.setBounds(670,250,400,50);
		
		add(title);
		
		add(namelabel);
		add(passlabel);
		add(textfield);
		add(passfield);
		add(btn1);
		add(btn2);
		add(img);
		add(btn3);
		

		btn2.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent ae){
					textfield.setText("");
					passfield.setText("");
				}
		});
		
		btn1.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent ae){
					
						String username = textfield.getText();
						String password = passfield.getText();
					if(username.equals("abc") || username.equals("abc") || username.equals("Abc") && password.equals("1234")){
						JOptionPane.showMessageDialog(null,"Successfully Logged In");
					}else{
						JOptionPane.showMessageDialog(null,"Invalid Username or Password");
					}	
				}
		});

		title.setFont(font1);
		title.setForeground(Color.WHITE);
		namelabel.setForeground(Color.WHITE);
		passlabel.setForeground(Color.WHITE);
		namelabel.setFont(font2);
		passlabel.setFont(font2);
		btn1.setFont(font3);
		btn2.setFont(font3);
		btn3.setFont(font3);
		
	setBounds(50,50,1300,675);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
		
			}
	
	
	public static void main(String[] args){
		SignUp frame =new SignUp();
		
		

		
		
	}
}