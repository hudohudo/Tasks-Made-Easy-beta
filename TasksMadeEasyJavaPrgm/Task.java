import java.util.Date;
public class Task
{
    private String taskName;    
    private Date taskDate;
    private Date  remindDate;
    private String taskDescription;

    public Task(String nameOfTask, int m, int d, int y, int m1, int d1, int y1, String description)
    {
        taskName = nameOfTask;
        taskDescription = description;
        taskDate = new Date(y, m, d);
        remindDate = new Date(y1, m1, d1);
    }

    public void setName(String val)
    {
        taskName = val;
    }

    public String getName()
    {
        return taskName;
    }
    
    public void setDate(int m, int d, int y)
    {
        taskDate = new Date(y, m, d);
    }

    public String getTaskDate()
    {
        return taskDate.toString();
    }

    public void setReminder(int m, int d, int y)
    {
        remindDate = new Date(y, m, d);
    }

    public String getReminder()
    {
        return remindDate.toString();
    }

    public void setDescription(String desp)
    {
        taskDescription = desp;
    }
    
    public String getDescription()
    {
        return taskDescription;
    }
}