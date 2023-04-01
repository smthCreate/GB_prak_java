package sem_6;

public class Laptop {
    private double price;
    private int processor_count;
    private double hard_drive_size;
    private double weight;

    public Laptop(double price, int processor_count, double hard_drive_size, double weight) {
        this.price = price;
        this.processor_count = processor_count;
        this.hard_drive_size = hard_drive_size;
        this.weight = weight;
    }
    public Laptop(){
    }



    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", processor_count=" + processor_count +
                ", hard_drive_size=" + hard_drive_size +
                ", weight=" + weight +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProcessor_count() {
        return processor_count;
    }

    public void setProcessor_count(int processor_count) {
        this.processor_count = processor_count;
    }

    public double getHard_drive_size() {
        return hard_drive_size;
    }

    public void setHard_drive_size(double hard_drive_size) {
        this.hard_drive_size = hard_drive_size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
