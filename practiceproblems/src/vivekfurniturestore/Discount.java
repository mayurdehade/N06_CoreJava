package vivekfurniturestore;

public class Discount{
	
	public double calculateDiscount(Bero obj) {
		if(obj instanceof SteelBero) {
			return (obj.getPrice()*10)/100;
		}
		else if(obj instanceof WoodenBero) {
			return (obj.getPrice()*15)/100;
		}
		return 0;
	}
	
}
