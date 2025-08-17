public class Test {

    public static void main(String... args){

        ShoppingCart shoppingCart = new ShoppingCart(150);
        /*
        * here below in processPayment method
        * - would need a class object which implements Payment interface
        * - therefore created CreditCard class
        * */

        CreditCard creditCard = new CreditCard("3234");

        /*
        * here - I want to make a payment
        * therefore I created a creditCard object
        * therefore to make it I need to create a CreditCard class
        *
        * Now,
        * Instead of creating seperate class, On The Fly -> If I could create the CreditCard class object
        * here it comes Anonymous Inner Class
        *
        *
        * */
        shoppingCart.processPayment(creditCard);

        //Anonymous Inner Class

        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount){
                System.out.println("Paid "+amount+" using Credit Card.");
            }
        });



    }

}