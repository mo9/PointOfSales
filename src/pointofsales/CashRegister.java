package pointofsales;

public class CashRegister {
    private Receipt receipt;
    private FakeDatabase db;
    
    public CashRegister(FakeDatabase db){
        this.db = db;
    }

    public void startNewSale(String customerId) {
        receipt = new Receipt(customerId, db);
    }

    public void addItemToSale(String productId, int qty) {
	receipt.addLineItem(productId, qty);
    }
    
    public String finalizeSale() {
        return receipt.printReceipt();
    }
    
}
