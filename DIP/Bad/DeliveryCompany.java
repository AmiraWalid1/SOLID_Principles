package dd;

public class DeliveryCompany {

	public void sendProduct(Product product) {
		//depends on DeliveryDriver class
		DeliveryDriver deliver = new DeliveryDriver();
		
		deliver.deliverProdect(product);
			
	}
}
