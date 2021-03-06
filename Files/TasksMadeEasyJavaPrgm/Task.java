import java.util.Date;
public class Task
{
    private String taskName;    
    private Date taskDate;
    private String taskDescription;

    public Task(String nameOfTask, int m, int d, int y, String description)
    {
        taskName = nameOfTask;
        taskDescription = description;
        taskDate = new Date(y, m, d);
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

    public void setDescription(String desp)
    {
        taskDescription = desp;
    }
    
    public String getDescription()
    {
        return taskDescription;
    }
    
    public String toString()
    {
        return "New task: " + taskName + " - " + taskDescription;
    }
}