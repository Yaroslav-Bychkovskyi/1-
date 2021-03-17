package com.github.ybychkovskyi.springstart.lists;

public interface List<T> {

  void add(T t);

  T get(int index);

  void remove(int index);

  boolean contains(T t);

  java.util.List<T> toList();

  int size();

  boolean isEmpty();
}


