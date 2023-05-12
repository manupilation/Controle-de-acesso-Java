package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Método principal.
 */
public class Principal {

  /**
   * Método main to register and generate a report.
   */
  public static void main(String[] args) {
    boolean reportMode = false;
    ArrayList<Short> childe = new ArrayList<Short>();
    ArrayList<Short> adult = new ArrayList<Short>();
    ArrayList<Short> senior = new ArrayList<Short>();

    do {
      Scanner scanner = new Scanner(System.in);
      Messages.entryMessage();

      short option = scanner.nextShort();

      if (option == 1) {
        Messages.ageRequest();
        short age = scanner.nextShort();
        short ageRating = AgeSystem.ageValidator(age);
        
        if (ageRating == 0) {
          AgeSystem.register(childe, age);
        } else if (ageRating == 1) {
          AgeSystem.register(adult, age);
        } else {
          AgeSystem.register(senior, age);
        }

      } else if (option == 2) {
        reportMode = true;
        scanner.close();  
  
      } else {
        Messages.invalidMessage();
      }

    } while (!reportMode);
    
    int total = AgeSystem.calcTotal(childe, adult, senior);
    Messages.headQuantity();
    Messages.quantityBody(childe.size(), adult.size(), senior.size());   
    
    Messages.headPercentual();
    Messages.percentageBody(childe.size(), adult.size(), senior.size(), total);
    
    Messages.total(total);  
  }
}
