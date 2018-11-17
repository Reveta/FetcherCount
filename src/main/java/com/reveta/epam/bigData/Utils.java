package com.reveta.epam.bigData;

import java.util.Scanner;

public class Utils {

    //TODO find correct static Scanner
//  private static Scanner scanner;

  public static String scanString() {
    return new Scanner(System.in).next();
  }

  public static int scanInt() {
    int i;
    try {
      i = new Scanner(System.in).nextInt();
      // TODO correct Exeption
    } catch (Exception e) {
      System.out.println("Enter correct numbers, like 123456");
      return scanInt();
    }
    return i;
  }
}
