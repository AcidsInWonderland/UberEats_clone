public class PaymentDetails {
    private String YourOrder;
    private String shipping;
    private String tips;
    private String tax;
    private String total;
  //  private Object productName;
 
    public PaymentDetails(String YourOrder,
        String shipping, String tips, String tax, String total) {
        this.YourOrder = YourOrder;
        this.shipping = shipping;
        this.tips = tips;
        this.tax = tax;
        this.total = total;
    }
 
    public String getYourOrder() {
        return YourOrder;
    }
 
 
    public String getShipping() {
        return shipping;
    }

    public String getTips() {
        return tips;
    }
 
    public String getTax() {
        return tax;
    }
     
    public String getTotal() {
        return total;
    }
}
