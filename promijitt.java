import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class promijitt extends JFrame{
	
		private JLabel nmlbl1,nmlbl2,nmlbl3,nmlbl4,nmlbl5,nmlbl6,nmlbl7,nmlbl8,passlabel;
		private JTextField txtfld1,txtfld2,txtfld3,txtfld4,txtfld5,txtfld6,txtfld7;
		private JPasswordField passfield;
		private JButton btn1, btn2;
		//private JRadioButton p1,p2;
	
	promijitt(){

		nmlbl1 = new JLabel("User id:");
		nmlbl2 = new JLabel("Name:");
		nmlbl3 = new JLabel("Email:");
		nmlbl4 = new JLabel("Phone No:");
		nmlbl5 = new JLabel("Age:");
		nmlbl6 = new JLabel("Address:");
		nmlbl7 = new JLabel("Secuirty Ans:");
		passlabel = new JLabel("Password:");
		
		txtfld1=new JTextField();
		txtfld2=new JTextField();
		txtfld3=new JTextField();
		txtfld4=new JTextField();
		txtfld5=new JTextField();
		txtfld6=new JTextField();
		txtfld7=new JTextField();
		passfield=new JPasswordField();
		
		btn1 =new JButton("Submit");
		btn2 =new JButton("Back");
		
	 //  p1=new JRadioButton("male");
	 //  p2=new JRadioButton("female");
		
		nmlbl1.setBounds(100,50,100,75);
		nmlbl2.setBounds(100,100,100,75);
		nmlbl3.setBounds(100,150,100,75);
		nmlbl4.setBounds(100,200,100,75);
		nmlbl5.setBounds(100,400,100,75);
		nmlbl6.setBounds(400,50,100,75);
		nmlbl7.setBounds(400,150,100,75);
		nmlbl8.setBounds(100,300,100,75);
		//p1.setBounds(150,300,50,40);
		//p2.setBounds(200,300,50,40);
		passlabel.setBounds(400,200,100,75);
		
		
		txtfld1.setBounds(200,75,100,30);
		txtfld2.setBounds(200,125,100,30);
		txtfld3.setBounds(200,170,100,30);
		txtfld4.setBounds(200,225,100,30);
		txtfld5.setBounds(200,425,100,30);
		txtfld6.setBounds(200,75,100,30);
		txtfld7.setBounds(200,75,100,30);
		passfield.setBounds(500,225,180,30);
		
		btn1.setBounds(100,530,80,30);
		btn2.setBounds(200,530,80,30);
		
		add(nmlbl1);
		add(nmlbl2);
		add(nmlbl3);
		add(nmlbl4);
		add(nmlbl5);
		add(nmlbl6);
		add(nmlbl7);
		add(nmlbl8);
		//add(p1);
		//add(p2);
		add(passlabel);
		
		add(txtfld1);
		add(txtfld2);
		add(txtfld3);
		add(txtfld4);
		add(txtfld5);
		add(txtfld6);
		add(txtfld7);
		add(passfield);
		add(btn1);
		add(btn2);
		
		
	setBounds(50,50,1300,675);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
		
			}
	
	
	public static void main(String[] args){
		
		promijitt promi =new promijitt();
			
	}
}