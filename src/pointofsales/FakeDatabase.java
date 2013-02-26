/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

/* 
	 * Here's a class that acts like a fake database, using arrays to store
	 * customer and product information in memory. We will use this only temporarily.
	 * Later in the course we'll switch to storing the data in a file and in a database.
	 */
	public class FakeDatabase {
	    private Customer[] customers = {
	        new Customer("100", "John", "Smith"),
	        new Customer("200", "Sally", "Jones"),
	        new Customer("300", "Bob", "Clementi")
	    };

        // Notice we assign a default discount strategy component object to each product
	    Product[] products = {
	        new Product("A101", "Baseball Hat", 19.95, new SaleDiscount(0.15)),
	        new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10,5)),
	        new Product("C222", "Women's Socks", 9.50, new NoDiscount())
	    };

        // Just call this method to find a customer in the array by its id.
        // Returns null if not found.
	    public final Customer findCustomer(final String custId) {
	        // validation is needed
	        Customer customer = null;
	        for(Customer c : customers) {
	            if(custId.equals(c.getCustomerId())) {
	                customer = c;
	                break;
	            }
	        }

	        return customer;
	    }

        // Just call this method to find a product in the array by its id.
        // Returns null if not found.
	    public final Product findProduct(final String prodId) {
	        // validation is needed
	        Product product = null;
	        for(Product p : products) {
	            if(prodId.equals(p.getProductId())) {
	                product = p;
	                break;
	            }
	        }

	        return product;
	    }
	} // end of class

