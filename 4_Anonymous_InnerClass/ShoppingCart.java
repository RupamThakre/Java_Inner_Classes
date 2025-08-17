public class ShoppingCart {
    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    //we could not create Instance object - but could take as reference

    public void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }
}