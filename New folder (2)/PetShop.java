import java.util.Scanner;

public class PetShop {
    private static Pet pet = new Pet(4);

    public static void main(String[] args) {
        char command;
        int pid = 0;
        printMenu();
        do {
            Scanner input = new Scanner(System.in);
            // ask a user to choose a command
            System.out.println("\nPlease enter letter of command or type ?");
            command = input.nextLine().toLowerCase().charAt(0);

            switch (command) {
                case 'a': //
                    System.out.print("Enter animal name: ");
                    String name = input.nextLine();
                    Animal CA;
                    char option1 = ' ';
                    while (((option1 < 'A') || (option1 > 'B'))){
                        System.out.print("Enter A for Dog, B for Cat:");
                        option1 = input.nextLine().charAt(0);
                    }
                    if (option1 == 'A') {
                        System.out.print("Enter Dog Breed:");
                        String DogBreed = input.nextLine();
                        System.out.print("Enter Dog fur color:");
                        String furColor = input.nextLine();
                        CA = new Dog(name, DogBreed, furColor);
                    } else {
                        System.out.print("Enter Cat Breed:");
                        String CatBreed = input.nextLine();
                        System.out.print("Enter Cat fur color:");
                        String furColor = input.nextLine();
                        CA = new Cat(name, CatBreed, furColor);

                    }

                    if (pet.add(CA)) System.out.print("\nAnimal successfully added.\n");

                    else System.out.print("Animal not added\n");
                    break;
                case 'b': // adopt an animal
                    System.out.print("\nEnter  Pet ID : ");
                    pid = Integer.parseInt(input.nextLine());

                    // write code to complete this menu option
                    // display a confirmation of successful deletion or
                    // of an unsuccessful attempt.
                    if (pet.remove(pet.find(pid)))
                        System.out.println("Animal successfully adopted");
                    else
                        System.out.println("Animal unsuccessfully adopted");
                    break;


                case 'c': // display the Animals

                    System.out.println(pet.toString());
                    break;
                case 'd': // count the animals
                    System.out.println("\nThere are " + pet.getCount() + " Animal(s) in the shop");
                    break;
                case 'e': // sort the animals
                    pet.sort();
                    System.out.println("Animals sorted.");
                    break;
                case 'f': // update animal info
                    System.out.print("\nEnter Pet ID: ");
                    pid = Integer.parseInt(input.nextLine());
                    Animal b = pet.find(pid);
                    if (b == null) {
                        System.out.print("Animal ID not found. Cannot update.\n");
                        break;
                    }

                case '?':
                    printMenu();
                    break;
                case 'q':
                    System.out.println("GOOD BYE!");
                    break;
                default:
                    System.out.println("Invalid Input");

            }

        } while (command != 'q');

    }

    public static void printMenu() {
        System.out.print("\nPet Shop Options\n" + "-----------------------------------\n"
                + "a: add an animal to the shop\n" + "b: adopt an animal from the shop\n"
                + "c: display the animals in the shop\n" + "d: count the animals in the shop\n"
                + "e: sort the animals in the shop\n" + "f: update animal info\n"
                +  "?: display the menu again\n"
                + "q: quit this program\n\n");

        // end of the printMenu method
    }
}



