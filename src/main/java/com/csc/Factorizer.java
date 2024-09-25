package com.csc;

public class Factorizer {

  Boolean isItPrime = false;

  // You should implement your solution here.
  // Feel free to delete this example method when you implement your solution.
  public String exampleMethod(int someArgument) {
    
    String output = "";
    String finalOutput = "";
    


    if (someArgument == 0 || someArgument == 1) {
      return null;
    }

    for(int i = 2; i < someArgument; i++)
    {

        
        while(someArgument % i == 0)
        {
        
            output += i + ", ";
            someArgument = someArgument/i;
        }
    }

    if (someArgument > 2) {
      output += someArgument;
      
    }

    
    
    finalOutput = output.trim();
    finalOutput = finalOutput.replaceAll(",$", "");


    
    return finalOutput;
    
  }

  public Boolean isPrime(int input)
  {
   
    // exampleMethod(input);  
    if (input <= 1) {
      return false;
    }

    for(int i = 2; i < input; i++)
    {

      if (input % i == 0) {
        return false;
      }

      return true;
    }

    return false;
  }

  public Boolean isComposite(int input)
  {
    if (input != 1 && isPrime(input) == false && input != 0) {
      return true;
    }

    return false;
  }
}

