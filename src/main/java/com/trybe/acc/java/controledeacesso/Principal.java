package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Short;

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
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");

      short option = scanner.nextShort();

      if (option == 1) {
        System.out.println("Entre com a sua idade:");
        short age = scanner.nextShort();
        
        if (age < 18) {
          childe.add(age);
          System.out.println("Pessoa cliente menor de idade, catraca liberada!");
        } else if (age >= 18 && age < 50) {
          adult.add(age);
          System.out.println("Pessoa adulta, catraca liberada!");
        } else {
          senior.add(age);
          System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
        }

      } else if (option == 2) {
        reportMode = true;
  
      } else {
        System.out.println("Entre com uma opção válida");
      }

    } while (!reportMode);
    
    scanner.close();
    int total = childe.size() + adult.size() + senior.size();
    int childeSize = childe.size();
    int adultSize = adult.size();
    int seniorSize = senior.size();
    
    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + childeSize);
    System.out.println("adultas: " + adultSize);
    System.out.println("a partir de 50: " + seniorSize + "\n ");
    
    System.out.println("----- Percentual -----");
    DecimalFormat decimalFormat = new DecimalFormat("0.0#");

    String menoresPercentage = decimalFormat.format((double) childeSize * 100 / total);
    String adultosPercentage = decimalFormat.format((double) adultSize * 100 / total);
    String seniorsPercentage = decimalFormat.format((double) seniorSize * 100 / total);

    System.out.println("menores: " + menoresPercentage + "%");
    System.out.println("adultas: " + adultosPercentage + "%");
    System.out.println("a partir de 50: " + seniorsPercentage + "%" + "\n ");
    
    System.out.println("TOTAL: " + total);
  }
}
