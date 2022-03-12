//import utility
import java.util.Scanner;

public class Objective4Lab1{
    public static void main(String[] args){

// declare scanner
      Scanner keyboard = new Scanner(System.in);

//declare and initialize variables without distinct information
      String fname = "";
      String firstname = "";
      String lname = "";
      String lastname = "";
      String favoriteAnimal = "";
      String favoriteFood = "";
      String favoriteSong = "";

//output for question
      System.out.println("What is your first name?");
//input from keyboard scanner to add information to variables
      fname = keyboard.nextLine();

      System.out.println("Trammel");
      firstname = keyboard.nextLine();

      System.out.println("What is your last name?");
      lname = keyboard.nextLine();

      System.out.println("Clark");
      lastname = keyboard.nextLine();

      System.out.println("What is your favorite animal?");
      favoriteAnimal = keyboard.nextLine();

      System.out.println("Tiger");
      BigCat = keyboard.nextLine();

      System.out.println("What is your favorite food?");
      favoriteFood = keyboard.nextLine();

      System.out.println("Hot Wings");
      Chicken = keyboard.nextLine();

      System.out.println("What is your favorite song?");
      favoriteSong = keyboard.nextLine();

      System.out.println("Thats Hard");
      Tough = keyboard.nextLine();

//final output
      System.out.println("My name is Trammel Clark" + fname + " " + lname);
      System.out.println("My favorite animal is the Tiger" + favoriteAnimal);
      System.out.println("My favorite food is Hot Wings" + favoriteFood);
      System.out.println("Such a difficult question" + favoriteSong);

    }
}
