import java.awt.*;
import javax.swing.*;
public class Tasks
{
    public static void main (String [] args)
    {
        JFrame runner = new JFrame ("TasksMadeEasy First-Release");
        Container cp =runner.getContentPane();
        cp.setBackground(new Color (53, 72, 82));
        
        runner.setResizable(false);
        
        runner.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        runner.setLayout(new FlowLayout());
        runner.getContentPane().add(new GUI_project());
        runner.getContentPane().add(new MyPanel());

        runner.pack();
        runner.setVisible(true);
    }
}
