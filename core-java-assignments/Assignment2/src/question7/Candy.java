package question7;

public class Candy extends DessertItem{
    public double doller;
    public Candy(double doller,double tax)
    {
        super(tax);
        this.doller = doller;
    }
    @Override
    public void getCost(){
        double price =0;
        double rupees = 60;
        double x = doller/rupees;
        System.out.println("Price of Candy is " + (price=x+tax) + "$" );
    }
}
