package dd;

public class DeliveryCompany {
	private DeliveryService ds;
	
	public DeliveryCompany( DeliveryService ds) {
		this.ds = ds;
	}
	public void sendProduct(Product product) {
		//Reference to interface
		this.ds.deliveryProduct(product);
	}
}
