public class Month(){

	private List<Task> days;
	private String name;

	public Month(String monthName, int days){
		days = new ArrayList<Integer>();
		for(int q = 0;q<days;q++){
			days.add(null);
		}
		name = monthName;
	}

	public String getMonthName(){
		return name;
	}

	public void addNewTask(int day, Task t){
		
	}
}