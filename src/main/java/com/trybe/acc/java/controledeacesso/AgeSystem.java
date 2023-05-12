package com.trybe.acc.java.controledeacesso;

/** 
 * AgeSystem Class to manage users age classification.
 * */
public class AgeSystem {

  /**
   * ageValidator method to determine classification of user.
   */
  public static void ageValidator(short age) {
    if (age < 18) {
      Messages.childeMessage();
    } else if (age > 18 && age < 49) {
      Messages.adultMessage();
    } else {
      Messages.seniorMessage();
    }
  }
}
