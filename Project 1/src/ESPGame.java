/*
 * Class: CMSC203
 * Instructor:
 * Description: ESP Game
 * Due: 06/16/2025
 * Platform/compiler:
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alexander Parris
 */

import java.util.*;
import java.io.*;
public class ESPGame {
    public static void main(String[] args) {
        int option;
        String fname;
        String name;
        String description;
        String Date;
        String filePath = "C:\\Users\\alexa\\IdeaProjects\\Project 1\\EspGameResults.txt";
        String cont = "Yes";
        Scanner input = new Scanner(System.in);
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        System.out.println("Welcome to ESP - extrasensory perception!");
        while(Objects.equals(cont,"Yes")){
            System.out.println("Would you please choose one of the 4 options from the menu:");
            System.out.println(" ");
            System.out.println("1- read and display on the screen first 16 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("2- read and display on the screen first 10 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("3- read and display on the screen first 5 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("4- Exit form a program");
            System.out.println("Enter the option: ");
            option = Integer.parseInt(input.nextLine());
            System.out.println("Enter the filename: ");
            fname = input.nextLine();
            String fileName = fname;
            // initial statements
            // option 1
            if (option == 1) {
                System.out.println("There are sixteen colors from a file: ");
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    int count = 0;
                    int right = 0;
                    String color = " ";
                    String color2 = " ";
                    String color3 = " ";
                    Random random = new Random();
                    int re = random.nextInt(16);
                    int ra = random.nextInt(16);
                    int rb = random.nextInt(16);
                    while ((line = reader.readLine()) != null && count < 16) {
                        System.out.println(line);
                        if (count == re) {
                            color = line;//First random color
                        }
                        if (count == ra) {
                            color2 = line;//Second random color
                        }
                        if (count == rb) {
                            color3 = line;//Third random color
                        }
                        count++;
                    }
                    count = 0;
                    //Resets count to 0
                    System.out.println("\nRound 1");
                    System.out.println("\nI am thinking of a color");
                    System.out.println("Is it one of the list of colors above?");
                    System.out.println("Enter your guess: ");
                    String guess = input.nextLine();
                    System.out.println("\nI was thinking of "+ color);
                    if(color.equals(guess)){
                        right++;
                        //Adds right guesses to score
                    }
                    System.out.println("Round 2");
                    System.out.println("\nI am thinking of a color");
                    System.out.println("Is it one of the list of colors above?");
                    System.out.println("Enter your guess: ");
                    guess = input.nextLine();
                    System.out.println("\nI was thinking of "+ color2);
                    if(color2.equals(guess)){
                        right++;
                        //Adds right guesses to score
                    }
                    System.out.println("Round 3");
                    System.out.println("\nI am thinking of a color");
                    System.out.println("Is it one of the list of colors above?");
                    System.out.println("Enter your guess: ");
                    guess = input.nextLine();
                    System.out.println("\nI was thinking of "+ color3);
                    if(color3.equals(guess)){
                        right++;
                        //Adds right guesses to score
                    }
                    System.out.println("Game Over");
                    System.out.println("\nyou Guessed "+right+" out of 3 colors correctly.");
                    //Writes game results to file
                    try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
                        writer.write("Game Over" + "\n");
                        writer.write("\nyou Guessed "+right+" out of 3 colors correctly.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }
            }
            // above for option 1
            // option 2
            if (option == 2) {
                System.out.println("There are sixteen colors from a file: ");
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    int count = 0;
                    int right = 0;
                    String color = " ";
                    String color2 = " ";
                    String color3 = " ";
                    Random random = new Random();
                    int re = random.nextInt(10);
                    int ra = random.nextInt(10);
                    int rb = random.nextInt(10);
                    while ((line = reader.readLine()) != null && count < 10) {
                        System.out.println(line);
                        if (count == re) {
                            color = line;//First random color
                        }
                        if (count == ra) {
                            color2 = line;//Second random color
                        }
                        if (count == rb) {
                            color3 = line;//Third random color
                        }
                        count++;
                    }
                    count = 0;
                    //Resets count to 0
                    System.out.println("\nRound 1");
                    System.out.println("\nI am thinking of a color");
                    System.out.println("Is it one of the list of colors above?");
                    System.out.println("Enter your guess: ");
                    String guess = input.nextLine();
                    System.out.println("\nI was thinking of "+ color);
                    if(color.equals(guess)){
                        right++;
                        //Adds right guesses to score
                    }
                    System.out.println("Round 2");
                    System.out.println("\nI am thinking of a color");
                    System.out.println("Is it one of the list of colors above?");
                    System.out.println("Enter your guess: ");
                    guess = input.nextLine();
                    System.out.println("\nI was thinking of "+ color2);
                    if(color2.equals(guess)){
                        right++;
                        //Adds right guesses to score
                    }
                    System.out.println("Round 3");
                    System.out.println("\nI am thinking of a color");
                    System.out.println("Is it one of the list of colors above?");
                    System.out.println("Enter your guess: ");
                    guess = input.nextLine();
                    System.out.println("\nI was thinking of "+ color3);
                    if(color3.equals(guess)){
                        right++;
                        //Adds right guesses to score
                    }
                    System.out.println("Game Over");
                    System.out.println("\nyou Guessed "+right+" out of 3 colors correctly.");
                    //Writes game results to file
                    try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
                        writer.write("Game Over" + "\n");
                        writer.write("\nyou Guessed "+right+" out of 3 colors correctly.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }
            }
            //Above for option 2
            //option 3
            if (option == 3) {
                System.out.println("There are sixteen colors from a file: ");
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    int count = 0;
                    int right = 0;
                    String color = " ";
                    String color2 = " ";
                    String color3 = " ";
                    Random random = new Random();
                    int re = random.nextInt(5);
                    int ra = random.nextInt(5);
                    int rb = random.nextInt(5);
                    while ((line = reader.readLine()) != null && count < 5) {
                        System.out.println(line);
                        if (count == re) {
                            color = line;//First random color
                        }
                        if (count == ra) {
                            color2 = line;//Second random color
                        }
                        if (count == rb) {
                            color3 = line;//Third random color
                        }
                        count++;
                    }
                    count = 0;
                    //Resets count to 0
                    System.out.println("\nRound 1");
                    System.out.println("\nI am thinking of a color");
                    System.out.println("Is it one of the list of colors above?");
                    System.out.println("Enter your guess: ");
                    String guess = input.nextLine();
                    System.out.println("\nI was thinking of "+ color);
                    if(color.equals(guess)){
                        right++;
                        //Adds right guesses to score
                    }
                    System.out.println("Round 2");
                    System.out.println("\nI am thinking of a color");
                    System.out.println("Is it one of the list of colors above?");
                    System.out.println("Enter your guess: ");
                    guess = input.nextLine();
                    System.out.println("\nI was thinking of "+ color2);
                    if(color2.equals(guess)){
                        right++;
                        //Adds right guesses to score
                    }
                    System.out.println("Round 3");
                    System.out.println("\nI am thinking of a color");
                    System.out.println("Is it one of the list of colors above?");
                    System.out.println("Enter your guess: ");
                    guess = input.nextLine();
                    System.out.println("\nI was thinking of "+ color3);
                    if(color3.equals(guess)){
                        right++;
                        //Adds right guesses to score
                    }
                    System.out.println("Game Over");
                    System.out.println("\nyou Guessed "+right+" out of 3 colors correctly.");
                    //Writes game results to file
                    try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
                        writer.write("Game Over" + "\n");
                        writer.write("You Guessed "+right+" out of 3 colors correctly."+"\n");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }
            }
            //Above for option 3
            if (option == 4) {
                return;
            }
            //Above for option 4
            System.out.println("\nWould you like to continue a Game? Type Yes/No");
            cont = input.nextLine(); //Continues or Exits Game
        }
        System.out.println("\nEnter your name: ");
        name = input.nextLine();
        System.out.println("Describe yourself: ");
        description = input.nextLine();
        System.out.println("Due Date: ");
        Date = input.nextLine();
        //Writes game results to file
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                writer.write("Due Date: " +Date+ "\n");
                writer.write("Username: "+name+ "\n");
                writer.write("Description: "+description+"\n");
                writer.write("Due Date: " +Date+ "\n");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        System.out.println("Username: "+name);
        System.out.println("User Description: "+description);
        System.out.println("Date: "+Date);

    }
}