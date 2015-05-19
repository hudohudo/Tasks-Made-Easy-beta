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
    
    private String[] listOfEventsArr = {"Reminder",
                                        "Birthday",
                                        "Anniversary",
                                        "Standard Event",
                                        "Chore"};
    private JComboBox listOfEvents;
    
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
        
        listOfEvents = new JComboBox(listOfEventsArr);
        listOfEvents.setSelectedIndex(3);
        

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