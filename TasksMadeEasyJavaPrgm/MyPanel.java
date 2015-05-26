import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.*;
import java.util.*;
/**
 * Write a description of class MyPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyPanel extends JPanel
{ 
    public void paintComponent (Graphics g)
    {
       super.paintComponent(g);
       
       g.setColor(new Color(140,140,140));
       g.fillRect(180,20,320,480);

    }
}
