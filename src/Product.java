public class Product {

    // instance field declarations
    private int itemId;
    private String itemName;
    private int numberOfUnitsInStock;
    private double priceOfEachUnit;

    public Product() {

    }

    // constructor without parameters
    public void Product() {

    }

    // constructor with parameter to initialize all instance fields
    public Product(int number, String name, int qty, double price) {
        this.itemId = number;
        this.itemName = name;
        this.numberOfUnitsInStock = qty;
        this.priceOfEachUnit = price;
    }

// getter and setter for itemId
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

// getter and setter for itemName
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

// getter and setter for numberOfUnitsInStock
    public int getNumberOfUnitsInStock() {
        return numberOfUnitsInStock;
    }

    public void setNumberOfItemsInStock(int numberOfItemsInStock) {
        this.numberOfUnitsInStock = numberOfUnitsInStock;

    }

// getter and setter for priceOfEachUnit
    public double getPriceOfEachUnit() {
        return priceOfEachUnit;
    }

    public void setPriceOfEachUnit(double priceOfEachUnit) {
        this.priceOfEachUnit = priceOfEachUnit;
    }

// overriding the toString method
    @Override
    public String toString() {
        return "Item number: " + itemId + "\n" +
                "Name: " + itemName + "\n" +
                "Quantity in stock: " + numberOfUnitsInStock + "\n" +
                "Price: " + priceOfEachUnit;
    }
}


