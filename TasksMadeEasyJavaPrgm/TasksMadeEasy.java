import java.util.List;
import java.util.ArrayList;
public class TasksMadeEasy 
{
	
	//This will not stay public, just need it for testing purposes
	public ArrayList<Task> myTasks;

	public TasksMadeEasy()
	{
			myTasks = new ArrayList<Task>();
	}

	public ArrayList<Task> getTaskLists()
	{
		return myTasks;
	}

	public void sortByPriority()
	{
	    if(myTasks.size() == 0) return myTasks;
		{
			Collections.sort(myTasks);
		}
		return myTasks;
	}
	
	public void addNewTask(Task t)
	{
	    myTasks.add(t);
	}

}