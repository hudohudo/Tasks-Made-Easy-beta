import java.awt.*;
import javax.swing.*;
public class GUI_Runner
{
    public static void main (String [] args)
    {
        JFrame runner = new JFrame ("TasksMadeEasy BETA FTW");
       Container cp =runner.getContentPane();
       cp.setBackground(Color.pink);
        
        runner.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        runner.setLayout(new FlowLayout());
        runner.getContentPane().add(new MyPanel());
        runner.getContentPane().add(new GUI_project());
        
        runner.pack();
        runner.setVisible(true);
    }
}
