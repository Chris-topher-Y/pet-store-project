public class PetFood extends PetProduct {

  // Instance variables unique to pet food
  private String flavor;
  private int weight;

  // No-argument constructor
  public PetFood() {
    super("no name", "Pet Food", 5.00);
    flavor = "unknown";
    weight = 1;
  }

  // Parameterized constructor
  public PetFood(String name, String flavor, int weight) {
    super(name, "Pet Food", 5.00 + weight * 2.00);
    this.flavor = flavor;
    this.weight = weight;
  }

  // Parameterized constructor that sets just the name
  public PetFood(String name) {
    super(name, "Pet Food", 5.00);
    flavor = "unknown";
    weight = 1;
  }

  // Accessor method for flavor
  public String getFlavor() {
    return flavor;
  }

  // Mutator method for flavor
  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  // Accessor method for weight
  public int getWeight() {
    return weight;
  }

  // Mutator method for weight
  public void setWeight(int weight) {
    this.weight = weight;
  }

  // Returns the pet food information and price
  public String toString() {
    return super.toString() + " (" + flavor + ", "
        + weight + " pounds)"
        + "\nPrice: $" + getPrice();
  }
}