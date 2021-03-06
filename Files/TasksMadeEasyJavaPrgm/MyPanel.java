import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.*;
import java.util.*;
public class MyPanel extends JPanel
{
    String temp;
    public MyPanel()
    {
        setPreferredSize(new Dimension(320,500));
    }
    public void paintComponent (Graphics g)
    {
       //super.paintComponent(g);
       g.setColor(new Color(140,140,140));
       g.fillRect(0,0,320,500);
       
       g.setColor(Color.BLACK);
       int yval = 50;
       for(int ctr = 0; ctr<TasksMadeEasy.getTaskLists().size(); ctr++)
       {
           temp = TasksMadeEasy.getOneTask(ctr).toString();
           //g.drawString(temp.substring(0,TasksMadeEasy.getOneTask(ctr).getName().length() + 10 + TasksMadeEasy.getOneTask(ctr).getDescription().length()), 25, yval);
           g.drawString(TasksMadeEasy.getOneTask(ctr).toString(), 25, yval);
           g.drawString(TasksMadeEasy.getOneTask(ctr).getTaskDate().toString().substring(0,10), 25, yval+13);
           yval+=yval;
       }
       repaint();
    }
}
