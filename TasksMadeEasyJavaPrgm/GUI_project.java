import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.*;
import java.util.*;

public class GUI_project extends JPanel
{

    private String[] listOfEventsArr = {"Std. Event",
            "Reminder",
            "Birthday",
            "Anniversary",
            "Chore"};
    private JLabel header;
    private JLabel nameYourTaskHeader;
    private JTextField nameYourTask;
    private JLabel dateOfEventHeader;
    private JLabel DOfMonth;
    private JLabel DOfDay;
    private JLabel DOfYear;
    private JTextField DOfMonthText;
    private JTextField DOfDayText;
    private JTextField DOfYearText;
    private JButton createTask;
    private JTextField TaskDescribe;
    private JLabel TaskDescribeHeader;
    
    private Task createdTask;

    //50,109,255 - blue
    //217,217,217 - gray

    //Constructor 
    public GUI_project()
    {

        //pane with null layout
        setBackground(new Color(29,152,136));
        setPreferredSize(new Dimension(300,500));
        setLayout(null);
        
        //Header label
        header = new JLabel();
        header.setBounds(25,20,180,35);
        header.setBackground(new Color(50,109,255));
        header.setForeground(new Color(0,0,0));
        header.setEnabled(true);
        header.setFont(new Font("Arial",0,22));
        header.setText("TasksMadeEasy");
        header.setVisible(true);
        add(header);

        //Describe the Task
        TaskDescribeHeader = new JLabel();
        TaskDescribeHeader.setBounds(25,145,140,35);
        TaskDescribeHeader.setBackground(new Color(50,109,255));
        TaskDescribeHeader.setForeground(new Color(0,0,0));
        TaskDescribeHeader.setEnabled(true);
        TaskDescribeHeader.setFont(new Font("Arial",0,12));
        TaskDescribeHeader.setText("Description of Task");
        TaskDescribeHeader.setVisible(true);
        add(TaskDescribeHeader);
        
        TaskDescribe = new JTextField(20);
        TaskDescribe.setBounds(25,165,140,35);
        TaskDescribe.setEnabled(true);
        TaskDescribe.setFont(new Font("Arial",0,12));
        TaskDescribe.setVisible(true);
        add(TaskDescribe);
        
        //Name Your task
        nameYourTask = new JTextField(20);
        nameYourTask.setBounds(25,90,140,35);
        nameYourTask.setEnabled(true);
        nameYourTask.setFont(new Font("Arial",0,12));
        nameYourTask.setVisible(true);
        add(nameYourTask);

        nameYourTaskHeader = new JLabel();
        nameYourTaskHeader.setBounds(25,70,140,35);
        nameYourTaskHeader.setBackground(new Color(50,109,255));
        nameYourTaskHeader.setForeground(new Color(0,0,0));
        nameYourTaskHeader.setEnabled(true);
        nameYourTaskHeader.setFont(new Font("Arial",0,12));
        nameYourTaskHeader.setText("Name Your Task");
        nameYourTaskHeader.setVisible(true);
        add(nameYourTaskHeader);

        //Date of Event
        dateOfEventHeader = new JLabel();
        dateOfEventHeader.setBounds(25,220,140,35);
        dateOfEventHeader.setBackground(new Color(50,109,255));
        dateOfEventHeader.setForeground(new Color(0,0,0));
        dateOfEventHeader.setEnabled(true);
        dateOfEventHeader.setFont(new Font("Arial",0,12));
        dateOfEventHeader.setText("Date of Event");
        dateOfEventHeader.setVisible(true);
        add(dateOfEventHeader);

        DOfMonth = new JLabel();
        DOfMonth.setBounds(25,230,140,35);
        DOfMonth.setBackground(new Color(50,109,255));
        DOfMonth.setForeground(new Color(0,0,0));
        DOfMonth.setEnabled(true);
        DOfMonth.setFont(new Font("Arial",0,9));
        DOfMonth.setText("Month     Day     Year");
        DOfMonth.setVisible(true);
        add(DOfMonth);

        DOfMonthText = new JTextField(2);
        DOfMonthText.setBounds(25,240,30,28);
        DOfMonthText.setEnabled(true);
        DOfMonthText.setFont(new Font("Arial",0,10));
        DOfMonthText.setVisible(true);
        add(DOfMonthText);

        DOfDayText = new JTextField(2);
        DOfDayText.setBounds(40,240,30,28);
        DOfDayText.setEnabled(true);
        DOfDayText.setFont(new Font("Arial",0,10));
        DOfDayText.setVisible(true);
        add(DOfDayText);

        DOfYearText = new JTextField(4);
        DOfYearText.setBounds(75,240,40,28);
        DOfYearText.setEnabled(true);
        DOfYearText.setFont(new Font("Arial",0,10));
        add(DOfYearText);

        //Create Button
        createTask = new JButton();
        createTask.addActionListener(new CreateAction());
        createTask.setBounds(5,400,140,35);
        createTask.setBackground(new Color(50,109,255));
        createTask.setForeground(new Color(0,0,0));
        createTask.setEnabled(true);
        createTask.setFont(new Font("Arial",0,12));
        createTask.setText("Create");
        createTask.setVisible(true);
        add(createTask);

    }
    private class CreateAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println(nameYourTask.getText());
             createdTask = new Task(nameYourTask.getText(),
                                    Integer.parseInt(DOfMonthText.getText()),
                                    Integer.parseInt(DOfDayText.getText()),
                                    Integer.parseInt(DOfYearText.getText()),
                                    TaskDescribe.getText());
                                   
        }
    }
}