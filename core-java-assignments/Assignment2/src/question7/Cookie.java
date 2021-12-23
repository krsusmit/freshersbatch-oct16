package question7;

public class Cookie extends DessertItem{
    public double euro;
    public Cookie(double euro,double tax)
    {
        super(tax);
        this.euro = euro;
    }
    @Override
    public void getCost(){
        double price;
        double rupees = 70;
        double x = euro/rupees;
        System.out.println("Price of Cookie is " + (price=x+tax) + " Euro");
    }
}
