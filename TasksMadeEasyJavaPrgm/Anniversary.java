
public class Anniversary extends Event
{
	private List<Gifts> gifts = new Arraylist<Gifts>();
	private int people;
	public Anniversary (String nameOfEvent, Date dateOfEvent, int m, int d, int y, int att)
	{
		super(nameOfEvent, dateOfEvent, m, d, y);
		people = att;
	}


	public void addGift (String name, double cost)
	{
		Gift thing = new Gift(name, cost);
		gifts.add(thing);
	}
	public Date getDate()
	{
		super.getDateToNotify();
	}
	public int getAttendees()
	{
		return people;
	}
}