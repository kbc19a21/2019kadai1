package itecafe05;

public abstract class Food implements Item {

    private int no;
    private String name;
    private int price;
    private int sumItem;//数量

    Food(int no, String name, int price) {
        this.no = no;
        this.name = name;
        this.price = price;
        sumItem = 0;
    }

    public void setSumItem(int sumItem) {
        this.sumItem = sumItem;
    }

    public int getSumItem() {
        return sumItem;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
