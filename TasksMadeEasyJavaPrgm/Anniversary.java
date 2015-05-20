import java.util.List;
import java.util.ArrayList;
import java.util.Date;
public class Anniversary extends Event
{
	private List<Gift> gifts = new ArrayList<Gift>();
	private int people;
	public Anniversary (String nameOfTask, int m, int d, int y, int m1, int d1, int y1, int att)
	{
		super(nameOfTask, m, d, y, m1, d1, y1);
		people = att;
	}
	public void addGift (String name, double cost)
	{
		Gift thing = new Gift(name, cost);
		gifts.add(thing);
	}
	public Date getDate()
	{
		return super.getDate();
	}
	public int getAttendees()
	{
		return people;
	}
}