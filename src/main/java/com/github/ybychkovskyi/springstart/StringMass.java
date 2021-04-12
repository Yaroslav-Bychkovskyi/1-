package com.github.ybychkovskyi.springstart;


public class StringMass {
  public static void main(String[] args) {
    String stringList = "string mas";
    char[] result = stringList.toCharArray();

    for (int i = 0; i < stringList.length(); i++) {
      System.out.print(result[i]);
    }
    System.out.println();
    for (int j = stringList.length() - 1; j > -1; j--) {
      System.out.print(result[j]);
    }
    System.out.println("------");

    if (stringList.length() > 0) {
      strmas(stringList, stringList.length() - 1);
    }


  }

  public static String strmas(String s, int index) {

    if (index == 0) {
      System.out.println(s.charAt(index));

      return s;
    }

    System.out.print(s.charAt(index));

    strmas(s, index - 1);
    return s;

  }
}
