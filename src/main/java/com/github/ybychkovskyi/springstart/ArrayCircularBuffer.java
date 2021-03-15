package com.github.ybychkovskyi.springstart;

import java.util.Comparator;
import java.util.List;

public class ArrayCircularBuffer<T> implements CircularBuffer<T> {

  private Object[] buffer;

  public ArrayCircularBuffer(int size) {
    buffer = new Object[size];

  }

  int i = 0;

  @Override
  public void put(T t) {
    buffer[i] = t;
    i++;

  }

  @Override
  public T get() {
    return (T) buffer[i];
  }

  @Override
  public Object[] toObjectArray() {
    return new Object[0];
  }

  @Override
  public T[] toArray() {
    return null;
  }

  @Override
  public List<T> asList() {
    return null;
  }

  @Override
  public void addAll(List<? extends T> toAdd) {

  }

  @Override
  public void sort(Comparator<? super T> comparator) {

  }

  @Override
  public boolean isEmpty() {
    return false;
  }
}
