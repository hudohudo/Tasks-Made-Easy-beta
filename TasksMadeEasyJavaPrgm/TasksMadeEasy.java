public abstract class TasksMadeEasy {
	
	//This may not stay public, idk yet
	public List<Task> myTasks = new ArrayList<Task>();

	public TasksMadeEasy(){

	}

	public addTasks(Task newTask){
		myTasks.add(newTask);
	}

	public ArrayList<Task> getTaskLists(){
		return myTasks;
	}

}