public class Task{
	private String taskName;	
	private String taskDetails;
	private Date taskDate;
	private int priority;

	public Task(String nameOfTask, Date dateOfTask){
		taskName = nameOfTask;
		taskDetails = dateOfTask;
	}

	public void setTaskName(String val){
		taskName = val;
	}

	public void setTaskDetails(String str){
		taskDetails = str;
	}

	public void setDate(Date d){
		taskDate = d;
	}

	public void setPriority(int val){
		priority = val;
	}

	public String getTaskName(){
		return taskName;
	}

	public String getTaskDetails(){
		return taskDetails;
	}

	public Date setTaskDate(){
		return taskDate;
	}

	public int getPriority(){
		return priority;
	}

}