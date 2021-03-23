package com.github.ybychkovskyi.springstart.lists;

import java.util.Iterator;

public interface List<T> {

  void add(T t);

  T get(int index);

  void remove(int index);

  boolean contains(T t);

  java.util.List<T> toList();

  int size();

  boolean isEmpty();

  Iterator<T> iterator();
}


