package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;

/** 
 * AgeSystem Class to manage users age classification.
 * */
public class AgeSystem {

  /**
   * Age record method.
   **/
  public static ArrayList<Short> register(ArrayList<Short> list, short newAge) {
    list.add(newAge);
    
    return list;
  }

  /**
   * ageValidator method to determine classification of user.
   */
  public static short ageValidator(short age) {
    if (age < 18) {
      Messages.childeMessage();
      return 0;
    } else if (age >= 18 && age < 50) {
      Messages.adultMessage();
      return 1;
    } else {
      Messages.seniorMessage();
      return 2;
    }
  }
  
  /**
   * Method that returns total value of three array lists.
   */
  public static int calcTotal(ArrayList<Short> childe,
       ArrayList<Short> adult, ArrayList<Short> senior) {
    int total = childe.size() + adult.size() + senior.size();

    return total;
  }
  
  /**
   * Method that returns the percentage of an ArrayList in relation to the total.
   */
  public static int calcPercentages(ArrayList<Short> list, int total) {
    return total;
  }


}
