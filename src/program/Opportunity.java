package program;

public class Opportunity implements Comparable<Opportunity>{
	Listing buy;
	Listing sell;
	double profit;
	public Opportunity(Listing b, Listing s, double p){
		buy = b;
		sell = s;
		profit = p;
	}
	@Override
	public int compareTo(Opportunity o) {
		// TODO Auto-generated method stub
		return (int)((double)(o.profit - this.profit)*100.0);
	}
}
