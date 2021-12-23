package question7;

public abstract class DessertItem {
    public double tax;
    public DessertItem (double tax)
    {
        this.tax = tax;
    }
    public abstract void getCost();
}
