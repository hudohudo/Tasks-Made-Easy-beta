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
    
    private String[] listOfEventsArr = {"Std. Event",
                                        "Reminder",
                                        "Birthday",
                                        "Anniversary",
                                        "Chore"};
    private JComboBox listOfEvents;
    private JLabel headForListOfEvents;
    private JLabel header;
    private JLabel nameYourTaskHeader;
    private JTextField nameYourTask;
    
    //50,109,255 - blue
    //217,217,217 - gray

    //Constructor 
    public GUI_project(){

        this.setTitle("Task Manager pre-alpha");
        this.setSize(500,500);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,500));
        contentPane.setBackground(new Color(50,109,255));
        
        //New listOfEvents comboBox
        listOfEvents = new JComboBox(listOfEventsArr);
        listOfEvents.setSelectedIndex(0);
        listOfEvents.setBounds(5,100,120,35);
        listOfEvents.setEnabled(true);
        listOfEvents.setFont(new Font("Arial",0,12));
        listOfEvents.setVisible(true);
        contentPane.add(listOfEvents);
        
        headForListOfEvents = new JLabel();
		headForListOfEvents.setBounds(5,65,140,35);
		headForListOfEvents.setBackground(new Color(50,109,255));
		headForListOfEvents.setForeground(new Color(0,0,0));
		headForListOfEvents.setEnabled(true);
		headForListOfEvents.setFont(new Font("Arial",0,12));
		headForListOfEvents.setText("Select Your Task");
		headForListOfEvents.setVisible(true);
		contentPane.add(headForListOfEvents);
        
        //Header label
        header = new JLabel();
		header.setBounds(180,10,140,35);
		header.setBackground(new Color(50,109,255));
		header.setForeground(new Color(0,0,0));
		header.setEnabled(true);
		header.setFont(new Font("Arial",0,18));
		header.setText("TasksMadeEasy");
		header.setVisible(true);
		contentPane.add(header);
		
		//Name Your task
		nameYourTask = new JTextField(20);
		nameYourTask.setBounds(5,175,140,35);
		nameYourTask.setEnabled(true);
		nameYourTask.setFont(new Font("Arial",0,12));
		nameYourTask.setVisible(true);
		contentPane.add(nameYourTask);
		
		nameYourTaskHeader = new JLabel();
		nameYourTaskHeader.setBounds(5,155,140,35);
		nameYourTaskHeader.setBackground(new Color(50,109,255));
		nameYourTaskHeader.setForeground(new Color(0,0,0));
		nameYourTaskHeader.setEnabled(true);
		nameYourTaskHeader.setFont(new Font("Arial",0,12));
		nameYourTaskHeader.setText("Name Your Task");
		nameYourTaskHeader.setVisible(true);
		contentPane.add(nameYourTaskHeader);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

     public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI_project();
            }
        });
    }

}