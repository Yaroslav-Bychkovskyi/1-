package com.github.ybychkovskyi.springstart;

import java.util.List;

public interface LinkedList<T> {

  void add(T t);

  T get(int index);

  T getLast();

  T getFirst();

  List<T> toList();

  int size();
}


