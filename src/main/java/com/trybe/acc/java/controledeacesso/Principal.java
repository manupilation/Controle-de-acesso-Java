package com.trybe.acc.java.controledeacesso;

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

    do {
      Scanner scanner = new Scanner(System.in);
      Messages.entryMessage();

      short option = scanner.nextShort();
      System.out.println(option);

      if (option == 1) {
        Messages.ageRequest();
        short age = scanner.nextShort();
        AgeSystem.ageValidator(age);
        
      } else if (option == 2) {
        reportMode = true;
        scanner.close();
  
      } else {
        Messages.invalidMessage();
 
      }

    } while (!reportMode);

  }
}
