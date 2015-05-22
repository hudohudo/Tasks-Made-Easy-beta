import java.util.Date;
public class Task
{
    private String taskName;    
    private Date taskDate;
    private Date  previous;

    public Task(String nameOfTask, int m, int d, int y, int m1, int d1, int y1)
    {
        taskName = nameOfTask;
        taskDate = new Date(y, m, d);
        previous = new Date(y1, m1, d1);
    }

    public void setTaskName(String val)
    {
        taskName = val;
    }


    public void setDate(int m, int d, int y)
    {
        taskDate = new Date(y, m, d);
    }



    public String getTaskName()
    {
        return taskName;
    }


    public Date getTaskDate()
    {
        return taskDate;
    }



}