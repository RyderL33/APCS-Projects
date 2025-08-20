class Main {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!

    System.out.println("hello");
    System.out.print("hello");
    System.out.println();


    //ANSWER: 

    //system.out.println creates a new line after printing the string, while system.out.print doesn't create a new line and prints on the existing line

    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): 1,2,3,-1,-2,-3
    //double: -10.2, 10.2, 5.4, 1.1, 1.23, 1.39491
    //boolean: true, false

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES

  

  int var1 = 1;
  double var2 = 0.1;
  boolean var3 = true;

  double time = 11.20;
  int year = 2025;
  double day = 8.18;
  boolean sunny = true;

  int ballA, ballB, ballC = 1;
  boolean sleepy = true; 



    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!

    System.out.print("what is the day" + 19);
    System.out.println("what is the day" + 19);
    System.out.println();


    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?

    System.out.println(10-5);
    System.out.println(5/1);
    System.out.println(2.5*2);
    System.out.println(15/3);
    System.out.println();

    
    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both
  
    for (int i = 1; i <= 100; i= i + 2)
    {
      System.out.println(i);
    }

    System.out.println();

    //All multiples of 3 from 1 to 100

    for (int n = 3; n <= 99; n = n + 3)
    {
      System.out.println(n);
    }

    System.out.println();

    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0

    for (int w = 1000; w >= 0; w = w - 10)
    {
      System.out.print("-" + w);
    }

    System.out.println();

  }
}
