package question2;

public class Orders {
    private long price;
    private String status;

    public Orders(long price,String status) {
        this.price = price;
        this.status = status;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
