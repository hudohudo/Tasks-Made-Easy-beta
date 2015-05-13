public class Event extends Task
{

	private Date dateToNotify;

	public Event(String nameOfEvent, Date dateOfEvent, int m, int d, int y)
	{
			super(nameOfEvent, dateOfEvent);
			dateToNotify = new Date(m, d, y);

	}
}