public class Birthday extends Event
{
	private List<Gifts> gifts = new Arraylist<Gifts>;
	public Birthday (String nameOfEvent, Date dateOfEvent, int m, int d, int y)
	{
		super(nameOfEvent, dateOfEvent, m, d, y);
	}
	public void addGift (String name, double cost)
	{
		Gift thing = new Gift(name, cost);
		gifts.add(thing)
	}
	public getDate()
	{
		super.getDateToNotify();
	}
}