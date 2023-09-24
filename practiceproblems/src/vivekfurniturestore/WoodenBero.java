package vivekfurniturestore;

public class WoodenBero extends Bero {
	private String woodType;

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType = woodType;
	}

	@Override
	public void calculatePrice() {
		if(woodType.equals("Ply Wood"))
			super.setPrice(15000);
		else if(woodType.equals("Teak Wood"))
			super.setPrice(12000);
		else if(woodType.equals("Engineered Wood"))
			super.setPrice(10000);
	}
	
	
}
