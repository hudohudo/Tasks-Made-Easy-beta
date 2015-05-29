import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class TasksMadeEasy
{

    //This will not stay public, just need it for testing purposes
    private static ArrayList<Task> myTasks = new ArrayList<Task>();
    public TasksMadeEasy()
    {
        myTasks = new ArrayList<Task>();
    }

    public static ArrayList<Task> getTaskLists()
    {
        return myTasks;
    }
    
    public static Task getOneTask(int ind)
    {
        return myTasks.get(ind);
    }

    // 	public void sortByPriority()
    // 	{
    // 	    if(myTasks.size() == 0) return;
    // 		{
    // 			Collections.sort(myTasks);
    // 		}
    // 		return myTasks;
    // 	}

    public static void addNewTask(Task t)
    {
        myTasks.add(t);
    }

}