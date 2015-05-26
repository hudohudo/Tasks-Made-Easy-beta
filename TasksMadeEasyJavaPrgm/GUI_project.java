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
    private JComboBox listOfEvents;
    private JLabel headForListOfEvents;
    private JLabel header;
    private JLabel nameYourTaskHeader;
    private JTextField nameYourTask;
    private JLabel dateToNotifyHeader;
    private JLabel DTNMonth;
    private JLabel DTNDay;
    private JLabel DTNYear;
    private JTextField DTNMonthText;
    private JTextField DTNDayText;
    private JTextField DTNYearText;
    private JLabel dateOfEventHeader;
    private JLabel DOfMonth;
    private JLabel DOfDay;
    private JLabel DOfYear;
    private JTextField DOfMonthText;
    private JTextField DOfDayText;
    private JTextField DOfYearText;
    private JButton createTask;

    //50,109,255 - blue
    //217,217,217 - gray

    //Constructor 
    public GUI_project()
    {

        //pane with null layout
        setBackground(new Color(50,109,255));
        setPreferredSize(new Dimension(500,500));
        setLayout(null);
        //New listOfEvents comboBox
        listOfEvents = new JComboBox(listOfEventsArr);
        listOfEvents.setSelectedIndex(0);
        listOfEvents.setBounds(5,100,120,35);
        listOfEvents.setEnabled(true);
        listOfEvents.setFont(new Font("Arial",0,12));
        listOfEvents.setVisible(true);
        add(listOfEvents);

        headForListOfEvents = new JLabel();
        headForListOfEvents.setBounds(5,65,140,35);
        headForListOfEvents.setBackground(new Color(50,109,255));
        headForListOfEvents.setForeground(new Color(0,0,0));
        headForListOfEvents.setEnabled(true);
        headForListOfEvents.setFont(new Font("Arial",0,12));
        headForListOfEvents.setText("Select Your Task");
        headForListOfEvents.setVisible(true);
        add(headForListOfEvents);

        //Header label
        header = new JLabel();
        header.setBounds(180,10,140,35);
        header.setBackground(new Color(50,109,255));
        header.setForeground(new Color(0,0,0));
        header.setEnabled(true);
        header.setFont(new Font("Arial",0,18));
        header.setText("TasksMadeEasy");
        header.setVisible(true);
        add(header);

        //Name Your task
        nameYourTask = new JTextField(20);
        nameYourTask.setBounds(5,180,140,35);
        nameYourTask.setEnabled(true);
        nameYourTask.setFont(new Font("Arial",0,12));
        nameYourTask.setVisible(true);
        add(nameYourTask);

        nameYourTaskHeader = new JLabel();
        nameYourTaskHeader.setBounds(5,155,140,35);
        nameYourTaskHeader.setBackground(new Color(50,109,255));
        nameYourTaskHeader.setForeground(new Color(0,0,0));
        nameYourTaskHeader.setEnabled(true);
        nameYourTaskHeader.setFont(new Font("Arial",0,12));
        nameYourTaskHeader.setText("Name Your Task");
        nameYourTaskHeader.setVisible(true);
        add(nameYourTaskHeader);

        //Date to Notify
        dateToNotifyHeader = new JLabel();
        dateToNotifyHeader.setBounds(5,220,140,35);
        dateToNotifyHeader.setBackground(new Color(50,109,255));
        dateToNotifyHeader.setForeground(new Color(0,0,0));
        dateToNotifyHeader.setEnabled(true);
        dateToNotifyHeader.setFont(new Font("Arial",0,12));
        dateToNotifyHeader.setText("Date to Notify");
        dateToNotifyHeader.setVisible(true);
        add(dateToNotifyHeader);

        DTNMonth = new JLabel();
        DTNMonth.setBounds(5,232,140,35);
        DTNMonth.setBackground(new Color(50,109,255));
        DTNMonth.setForeground(new Color(0,0,0));
        DTNMonth.setEnabled(true);
        DTNMonth.setFont(new Font("Arial",0,9));
        DTNMonth.setText("Month     Day     Year");
        DTNMonth.setVisible(true);
        add(DTNMonth);

        DTNMonthText = new JTextField(2);
        DTNMonthText.setBounds(5,250,30,28);
        DTNMonthText.setEnabled(true);
        DTNMonthText.setFont(new Font("Arial",0,10));
        DTNMonthText.setVisible(true);
        add(DTNMonthText);

        DTNDayText = new JTextField(2);
        DTNDayText.setBounds(40,250,30,28);
        DTNDayText.setEnabled(true);
        DTNDayText.setFont(new Font("Arial",0,10));
        DTNDayText.setVisible(true);
        add(DTNDayText);

        DTNYearText = new JTextField(4);
        DTNYearText.setBounds(75,250,40,28);
        DTNYearText.setEnabled(true);
        DTNYearText.setFont(new Font("Arial",0,10));
        add(DTNYearText);

        //Date of Event
        dateOfEventHeader = new JLabel();
        dateOfEventHeader.setBounds(5,285,140,35);
        dateOfEventHeader.setBackground(new Color(50,109,255));
        dateOfEventHeader.setForeground(new Color(0,0,0));
        dateOfEventHeader.setEnabled(true);
        dateOfEventHeader.setFont(new Font("Arial",0,12));
        dateOfEventHeader.setText("Date of Event");
        dateOfEventHeader.setVisible(true);
        add(dateOfEventHeader);

        DOfMonth = new JLabel();
        DOfMonth.setBounds(5,297,140,35);
        DOfMonth.setBackground(new Color(50,109,255));
        DOfMonth.setForeground(new Color(0,0,0));
        DOfMonth.setEnabled(true);
        DOfMonth.setFont(new Font("Arial",0,9));
        DOfMonth.setText("Month     Day     Year");
        DOfMonth.setVisible(true);
        add(DOfMonth);

        DOfMonthText = new JTextField(2);
        DOfMonthText.setBounds(5,315,30,28);
        DOfMonthText.setEnabled(true);
        DOfMonthText.setFont(new Font("Arial",0,10));
        DOfMonthText.setVisible(true);
        add(DOfMonthText);

        DOfDayText = new JTextField(2);
        DOfDayText.setBounds(40,315,30,28);
        DOfDayText.setEnabled(true);
        DOfDayText.setFont(new Font("Arial",0,10));
        DOfDayText.setVisible(true);
        add(DOfDayText);

        DOfYearText = new JTextField(4);
        DOfYearText.setBounds(75,315,40,28);
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

        //adding panel to JFrame and seting of window position and close operation
        //         this.add(contentPane);
        //         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //         this.setLocationRelativeTo(null);
        //         this.pack();
        //         this.setVisible(true);

    }
    private class CreateAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println(nameYourTask.getText());
        }
    }
}