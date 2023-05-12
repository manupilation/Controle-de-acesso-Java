package com.trybe.acc.java.controledeacesso;

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
    System.out.println("Entre com uma opção válida!");
  }

  /**
   * Age request message.
   */
  public static void ageRequest() {
    System.out.println("Entre com a sua idade:");
  }
  
  public static void adultMessage() {
    System.out.println("Pessoa adulta, catraca liberada!");
  }
  
  public static void childeMessage() {
    System.out.println("Pessoa cliente menor de idade, catraca liberada!");
  }
  
  public static void seniorMessage() {
    System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
  }
}
