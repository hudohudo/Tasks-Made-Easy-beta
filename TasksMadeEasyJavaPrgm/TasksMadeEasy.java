import java.util.List;
import java.util.ArrayList;
public class TasksMadeEasy {
	
	//This will not stay public, just need it for testing purposes
	public ArrayList<Task> myTasks;

	public TasksMadeEasy(){
			myTasks = new ArrayList<Task>();
	}

	public ArrayList<Task> getTaskLists(){
		return myTasks;
	}

	public ArrayList<Task> sortByPriority(){
	    if(myTasks.size() == 0) return myTasks;
		for(int ind = 1;ind<myTasks.size();ind++){
			if(myTasks.get(ind - 1).getPriority() > myTasks.get(ind).getPriority()){
				Task tempTask = myTasks.get(ind);
				myTasks.set(ind, myTasks.get(ind - 1));
				myTasks.set(ind - 1, tempTask);
			}
		}
		return myTasks;
	}
	
	public void addNewTask(Task t){
	    myTasks.add(t);
	   }

}