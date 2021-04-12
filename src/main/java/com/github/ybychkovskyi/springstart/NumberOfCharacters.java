package com.github.ybychkovskyi.springstart;

import java.util.LinkedList;
import java.util.List;

public class NumberOfCharacters {
  public static void main(String[] args) {
    String s = "AAAaaBBbCCc";
    char[] res = s.toCharArray();
    List<String> strings = new LinkedList<>();

    strings.add(String.valueOf(res[0]));

    for (int i = 0; i < s.length(); i++) {

      if (!strings.contains(String.valueOf(res[i]))) {
        strings.add(String.valueOf(res[i]));

      }
    }

    System.out.println(strings);
  }
}
