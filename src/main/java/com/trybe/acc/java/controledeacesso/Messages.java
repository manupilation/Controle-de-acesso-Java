package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;

/** 
 * Messages class to manage system messages.
 * */
public class Messages {
  /**
   * Entry Message, when you start the system.
   */
  public static void entryMessage() {
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Acessar o estabelecimento");
    System.out.println("2 - Finalizar sistema e mostrar relatório");
  }

  /**
   * Invalid Message, when the user selects an invalid option.
   */
  public static void invalidMessage() {
    System.out.println("Entre com uma opção válida");
  }

  /**
   * Age request message.
   */
  public static void ageRequest() {
    System.out.println("Entre com a sua idade:");
  }
  
  /**
   * adult message.
   */
  public static void adultMessage() {
    System.out.println("Pessoa adulta, catraca liberada!");
  }
  
  /**
   * Childe message.
   */
  public static void childeMessage() {
    System.out.println("Pessoa cliente menor de idade, catraca liberada!");
  }
  
  /**
   * Senior message.
   */
  public static void seniorMessage() {
    System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
  }

  /**
   * Head Quantity message.
   */
  public static void headQuantity() {
    System.out.println("----- Quantidade -----");
  }

  /**
   * Head percentual message.
   */
  public static void headPercentual() {
    System.out.println("----- Percentual -----");
  }
  
  /**
   * Quantity body message.
   */
  public static void quantityBody(int menores, int adultos, int seniors) {
    System.out.println("menores: " + menores);
    System.out.println("adultas: " + adultos);
    System.out.println("a partir de 50: " + seniors + "\n ");
  }
  
  /**
   * Percentage body message.
   */
  public static void percentageBody(int menores, int adultos, int seniors, int total) {
    DecimalFormat decimalFormat = new DecimalFormat("0.0#");

    String menoresPercentage = decimalFormat.format(menores * 100 / total);
    String adultosPercentage = decimalFormat.format(adultos * 100 / total);
    String seniorsPercentage = decimalFormat.format(seniors * 100 / total);

    System.out.println("menores: " + menoresPercentage + "%");
    System.out.println("adultas: " + adultosPercentage + "%");
    System.out.println("a partir de 50: " + seniorsPercentage + "%" + "\n ");
  }
  
  public static void total(int total) {
    System.out.println("TOTAL: " + total);

  }
}
