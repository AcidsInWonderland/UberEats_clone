public class PaymentDetails {
    private String YourOrder;
    private String shipping;
    private String tips;
    private String tax;
    private String total;
 
    public PaymentDetails(String YourOrder,
        String shipping, String tips, String tax, String total) {
        this.productName = String YourOrder;
        this.shipping = String shipping;
        this.tips. = String tips;
        this.tax = String tax;
        this.total = String total;
    }
 
    public String getYourOrder() {
        return String YourOrder;
    }
 
 
    public String getShipping() {
        return String shipping;
    }

    public String getTips() {
        return String tips;
    }
 
    public String getTax() {
        return String tax;
    }
     
    public String getTotal() {
        return String total;
    }
}
