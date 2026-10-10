public class PetBed extends PetProduct {

  // Instance variable unique to pet beds
  private String size;

  // No-argument constructor
  public PetBed() {
    super("no name", "Pet Bed", 15.00);
    size = "small";
  }

  // Parameterized constructor
  public PetBed(String name, String size) {
    super(name, "Pet Bed", 15.00);
    this.size = size;

    // Set the price based on the bed size
    if (size.equalsIgnoreCase("medium")) {
      setPrice(25.00);
    } else if (size.equalsIgnoreCase("large")) {
      setPrice(40.00);
    }
  }

  // Parameterized constructor that sets just the name
  public PetBed(String name) {
    super(name, "Pet Bed", 15.00);
    size = "small";
  }

  // Accessor method for size
  public String getSize() {
    return size;
  }

  // Mutator method for size
  public void setSize(String size) {
    this.size = size;
  }

  // Returns the pet bed information and price
  public String toString() {
    return super.toString() + " (" + size + ")"
        + "\nPrice: $" + getPrice();
  }
}