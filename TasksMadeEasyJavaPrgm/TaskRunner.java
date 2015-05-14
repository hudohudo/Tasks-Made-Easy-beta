import java.util.Date;
import java.util.Scanner;
public class TaskRunner{
	public static void main(String[] args){
	    System.out.println("Enter in the name of the task");
		TasksMadeEasy mainTasks = new TasksMadeEasy();
		Date theDate = new Date (2015, 12, 4);
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		mainTasks.addNewTask(new Task(name, theDate));
		mainTasks.myTasks.get(0).setPriority(3);
		mainTasks.sortByPriority();
		System.out.println("Success!");
	}
}