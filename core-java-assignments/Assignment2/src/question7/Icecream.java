package question7;

public class Icecream extends DessertItem{
    public double rupees;
    public Icecream(double rupees,double tax)
    {
        super(tax);
        this.rupees = rupees;
    }
    @Override
    public void getCost(){
        double price;
        System.out.println("Price of Icecream is " + (price=rupees+tax) + " rupees");
    }
}