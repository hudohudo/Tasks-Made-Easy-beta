public class TaskRunner{\
	public static void main(String[] args){
		TasksMadeEasy mainTasks = new TasksMadeEasy();
		Date theDate = new Date (5, 12, 2015)
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		mainTasks.addTasks(new Task(name, theDate));
		mainTasks.myTasks.get(0).setPriority(3);
	}
}