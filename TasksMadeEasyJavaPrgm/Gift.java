public class Gift
{
	private double cost;
	private String name;
	public Gift (String giftname, double giftcost)
	{
		cost = giftcost;
		name = giftname;

	}
	public double getCost()
	{
		return cost;
	}
	public String getName()
	{
		return name;
	}

}