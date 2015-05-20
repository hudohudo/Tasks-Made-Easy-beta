import java.util.Date;
public class Chore extends Task
{
    public Chore (String nameOfTask, int m, int d, int y, int m1, int d1, int y1)
    {
        super(nameOfTask, m, d, y, m1, d1, y1);
    }
    	public Date getDate()
	{
		return super.getTaskDate();
	}
}