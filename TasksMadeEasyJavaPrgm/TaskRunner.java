public class TaskRunner{
	public static void main(String[] args){
		TasksMadeEasy mainTasks = new TasksMadeEasy();
		Date theDate = new Date (2015, 12, 4)
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		mainTasks.addTasks(new Task(name, theDate));
		mainTasks.myTasks.get(0).setPriority(3);
		mainTasks.myTasks.add("Stuff", new Date(2012, 2, 23));
		mainTasks.myTasks.get(1).setPriority(2);
		mainTasks.sortByPriority();
	}
}