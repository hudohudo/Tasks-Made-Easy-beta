/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

	private JButton button1;
	private JComboBox combobox1;
	private JLabel label1;
	private JPanel panel2;
	
	//50,109,255 - blue
	//217,217,217 - gray

	//Constructor 
	public GUI_project(){

		this.setTitle("Task Manager pre-alpha");
		this.setSize(500,500);
		//menu generate method
		//generateMenu();
		//this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,500));
		contentPane.setBackground(new Color(50,109,255));


		button1 = new JButton();
		button1.setBounds(8,89,50,50);
		button1.setBackground(new Color(217,217,217));
		button1.setForeground(new Color(0,0,0));
		button1.setEnabled(true);
		button1.setFont(new Font("Arial",0,12));
		button1.setText("OK");
		button1.setVisible(true);

		combobox1 = new JComboBox();
		combobox1.setBounds(5,42,90,35);
		combobox1.setBackground(new Color(214,217,223));
		combobox1.setForeground(new Color(0,0,0));
		combobox1.setEnabled(true);
		combobox1.setFont(new Font("Arial",0,12));
		combobox1.setVisible(true);

		label1 = new JLabel();
		label1.setBounds(5,10,140,35);
		label1.setBackground(new Color(50,109,255));
		label1.setForeground(new Color(0,0,0));
		label1.setEnabled(true);
		label1.setFont(new Font("Arial",0,18));
		label1.setText("Event Type");
		label1.setVisible(true);

		panel2 = new JPanel(null);
		panel2.setBounds(0,0,500,500);
		panel2.setBackground(new Color(50, 109, 255));
		panel2.setForeground(new Color(0,0,0));
		panel2.setEnabled(true);
		panel2.setFont(new Font("Arial",0,12));
		panel2.setVisible(true);

		//adding components to contentPane panel
		panel2.add(button1);
		panel2.add(combobox1);
		panel2.add(label1);
		contentPane.add(panel2);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//method for generate menu
	//public void generateMenu(){
		//menuBar = new JMenuBar();
	//}



	 public static void main(String[] args){
		//System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI_project();
			}
		});
	}

}