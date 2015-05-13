public class TasksMadeEasy {
	
	//This may not stay public, idk yet
	public List<Task> myTasks;

	public TasksMadeEasy(){
			myTasks = new ArrayList<Task>();
	}

	public ArrayList<Task> getTaskLists(){
		return myTasks;
	}

	public ArrayList<Task> sortByPriority(){
		ArrayList<Task> temp = myTasks;
		for(int ind = 1;ind<temp.size();ind++){
			if(temp.get(ind - 1).getPriority() > temp.get(ind).getPriority()){
				Task tempTask = temp.get(ind);
				temp.get(ind) = temp.get(ind - 1);
				temp.get(ind - 1) = tempTask;
			}
		}
	}

}