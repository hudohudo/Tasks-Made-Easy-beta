import java.util.Date;
import java.util.Scanner;
public class TaskRunner{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter in the name of the task");
	    String name = scan.nextLine();
	    System.out.println("Enter in the month of the task (1-12 only)");
		int month = scan.nextInt();
		System.out.println("Enter in the day of the task (Must be a valid day for the given month)");
		int day = scan.nextInt();
		if(((month==1||month==3||month==5||month==6||month==7||month==8||month==10||month==12)&&day>31)||((month==4||month==6||month==9||month==11)&&day>30)||(month==2&&day>28&&year%4!=0)||(month==2&&day>29&&year%4==0))
		{
			System.out.println("Not a valid date");
		}
		else
		{
			System.out.println("Enter in the year of the task")
			Date theDate = new Date (year, month, day);
		}
		TasksMadeEasy mainTasks = new TasksMadeEasy();
		
		
		
		mainTasks.addNewTask(new Task(name, theDate));
		mainTasks.myTasks.get(0).setPriority(3);
		mainTasks.sortByPriority();
		System.out.println("Success!");
	}
}