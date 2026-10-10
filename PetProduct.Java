
public class PetProduct {

  // Instance variables shared by all products
  private String name;
  private String type;
  private double price;

  // No-argument constructor
  public PetProduct() {
    this("no name", "unknown", 0.0);
  }

  // Parameterized constructor
  public PetProduct(String name, String type, double price) {
    this.name = name;
    this.type = type;
    this.price = price;
  }

  // Parameterized constructor that sets the name and type
  public PetProduct(String name, String type) {
    this(name, type, 0.0);
  }

  // Accessor method for name
  public String getName() {
    return name;
  }

  // Mutator method for name
  public void setName(String name) {
    this.name = name;
  }

  // Accessor method for type
  public String getType() {
    return type;
  }

  // Mutator method for type
  public void setType(String type) {
    this.type = type;
  }

  // Accessor method for price
  public double getPrice() {
    return price;
  }

  // Mutator method for price
  public void setPrice(double price) {
    this.price = price;
  }

  // Returns the product name and type
  public String toString() {
    return name + " (" + type + ")";
  }
}