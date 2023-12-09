package dd;

public class DeliveryDriver implements DeliveryService{

	@Override
	public void deliveryProduct(Product product) {
		System.out.println("product delivered successfully");
		
	}
	
	
}
