public class Date{
	private int month;
	private int day;
	private int year;

	public Date(int m, int d, int y){
		month = m;
		day = d;
		year = y;
	}

	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public void setDay(int val){
		day = val;
	}

	public void setMonth(int val){
		month = val;
	}

	public void setYear(int val){
		year = val;
	}
}