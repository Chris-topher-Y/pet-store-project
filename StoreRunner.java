import java.util.Scanner; // Used for user input

public class StoreRunner {
  public static void main(String[] args) {

    // Create the Scanner object for user input
    Scanner input = new Scanner(System.in);

    boolean didBuyProduct = false;

    System.out.println("Welcome to the Pet Store!");
    System.out.println("What would you like to purchase today?");
    System.out.println("1. Dog Toy");
    System.out.println("2. Pet Food");
    System.out.println("3. Pet Bed");
    System.out.print("> ");

    int userSelection = input.nextInt();
    input.nextLine();

    // User wants to purchase a dog toy
    if (userSelection == 1) {
      System.out.println("What's the name of the dog toy?");
      System.out.print("> ");
      String toyName = input.nextLine();

      System.out.println("What material is it made of? (Rope or Rubber)");
      System.out.print("> ");
      String toyMaterial = input.nextLine();

      // Create the dog toy
      DogToy newToy = new DogToy(toyName, toyMaterial);

      System.out.println();
      System.out.println("Here's your dog toy:");
      System.out.println();
      System.out.println(newToy);

      didBuyProduct = true;
    }

    // User wants to purchase pet food
    if (userSelection == 2) {
      System.out.println("What's the name of the pet food?");
      System.out.print("> ");
      String foodName = input.nextLine();

      System.out.println("What's the flavor?");
      System.out.print("> ");
      String foodFlavor = input.nextLine();

      System.out.println("How many pounds is the bag?");
      System.out.print("> ");
      int foodWeight = input.nextInt();

      // Create the pet food
      PetFood newFood = new PetFood(
          foodName, foodFlavor, foodWeight);

      System.out.println();
      System.out.println("Here's your pet food:");
      System.out.println();
      System.out.println(newFood);

      didBuyProduct = true;
    }

    // User wants to purchase a pet bed
    if (userSelection == 3) {
      System.out.println("What's the name of the pet bed?");
      System.out.print("> ");
      String bedName = input.nextLine();

      System.out.println("What size is it? (Small, Medium, or Large)");
      System.out.print("> ");
      String bedSize = input.nextLine();

      // Create the pet bed
      PetBed newBed = new PetBed(bedName, bedSize);

      System.out.println();
      System.out.println("Here's your pet bed:");
      System.out.println();
      System.out.println(newBed);

      didBuyProduct = true;
    }

    System.out.println();

    // Display a goodbye message
    if (didBuyProduct) {
      System.out.println("Thank you for shopping at our Pet Store!");
    } else {
      System.out.println("Invalid choice. Come visit us again!");
    }

    // Close the Scanner
    input.close();
  }
}
