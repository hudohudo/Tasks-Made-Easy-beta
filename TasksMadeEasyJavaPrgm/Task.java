import java.util.Date;
public class Task{
	private String taskName;	
	private String taskDetails;
	private Date taskDate;


	public Task(String nameOfTask, Date dateOfTask){
		taskName = nameOfTask;
		taskDate = dateOfTask;
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



	public String getTaskName(){
		return taskName;
	}

	public String getTaskDetails(){
		return taskDetails;
	}

	public Date getTaskDate(){
		return taskDate;
	}



}