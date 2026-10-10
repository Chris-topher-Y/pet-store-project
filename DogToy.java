public class DogToy extends PetProduct {

  // Instance variable unique to dog toys
  private String material;

  // No-argument constructor
  public DogToy() {
    super("no name", "Dog Toy", 5.00);
    material = "unknown";
  }

  // Parameterized constructor
  public DogToy(String name, String material) {
    super(name, "Dog Toy", 5.00);
    this.material = material;

    // Set the price based on the material
    if (material.equalsIgnoreCase("rope")) {
      setPrice(7.00);
    } else if (material.equalsIgnoreCase("rubber")) {
      setPrice(5.00);
    }
  }

  // Parameterized constructor that sets just the name
  public DogToy(String name) {
    super(name, "Dog Toy", 5.00);
    material = "unknown";
  }

  // Accessor method for material
  public String getMaterial() {
    return material;
  }

  // Mutator method for material
  public void setMaterial(String material) {
    this.material = material;
  }

  // Returns the dog toy information and price
  public String toString() {
    return super.toString() + " made of " + material
        + "\nPrice: $" + getPrice();
  }
}