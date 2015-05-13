public class Calendar{

	private List<Month> theYear;

	public Calendar(){
		theYear = new ArrayList<Month>();
	}

	public buildTheYear(){
		theYear.add(new Month("January", 31));
		theYear.add(new Month("Febuary", 28));
		theYear.add(new Month("March", 31));
		theYear.add(new Month("April", 30));
		theYear.add(new Month("May", 31));
		theYear.add(new Month("June", 30));
		theYear.add(new Month("July", 31));
		theYear.add(new Month("August", 31));
		theYear.add(new Month("September", 30));
		theYear.add(new Month("October", 31));
		theYear.add(new Month("November", 30));
		theYear.add(new Month("December", 31));
	}
}