class Main {
  public static void main(String[] args) {
    //#1 Write code for the maxNumber function
    // maxNumber(3, 4);

    //#2 Write the code for the doubleNumber function
    // doubleNumber(33);

    //#3 Write code for the printEvenNumbers()
    //function

    
    int[] numArray = {1, 44, 5, 66, 34, 12};
    //#4 print largest number in the array
    printLargest(numArray);
  }

  public static void maxNumber(int num1, int num2) {
    //#1 Use an if statement to print the larger 
    //number of num1 and num2

  }

  public static void doubleNumber(int x) {
    //#2 Write code below this line to muliply x by 2 
    //and print it to the console
  }

  public static void  printEvenNumbers() {
    for (int i = 0; i <= 10; i++) {
      //Add code here to print each even number
      //Hint: use the printIfEven function
    }
  }

  public static void printIfEven(int x) {
      if (x % 2 == 0) {
        System.out.print(x + " ");
      }    
  }

  public static void printLargest(int[] numbers) {
    int largest = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > largest) {
        largest = numbers[i];
      }
    }
    System.out.println(largest);
  }
}
