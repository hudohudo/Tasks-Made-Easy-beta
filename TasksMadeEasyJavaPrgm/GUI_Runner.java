import javax.swing.*;
public class GUI_Runner
{
    public static void main (String [] args)
    {
        JFrame runner = new JFrame ("TasksMadeEasy BETA FTW");
        runner.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        runner.getContentPane().add(new GUI_project());
        runner.pack();
        runner.setVisible(true);
    }
}
