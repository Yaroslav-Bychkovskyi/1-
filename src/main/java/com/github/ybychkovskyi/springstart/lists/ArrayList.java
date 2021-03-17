package com.github.ybychkovskyi.springstart.lists;

public class ArrayList<T> implements List<T> {

  Object[] array;
  int i = 0;

  public ArrayList() {
    array = new Object[10];
  }

  public ArrayList(int size) {
    array = new Object[size];
  }


  @Override
  public void add(T t) {

    array[i] = t;
    i++;

  }

  @Override
  public T get(int index) {

    Object o = array[index];
    return (T) o;
  }

  @Override
  public void remove(int index) {

    for (int i = index; i < array.length; i++) {
      if (i == array.length - 1) {
        array[i] = null;

      } else {
        array[i] = array[i + 1];
      }
    }
    i--;

  }

  @Override
  public boolean contains(T t) {
    for (int i = 0; i < array.length; i++) {
      if (t.equals(array[i])) {
        return true;
      }

    }

    return false;
  }

  @Override
  public java.util.List<T> toList() {
    return null;
  }

  @Override
  public int size() {
    return i;
  }

  @Override
  public boolean isEmpty() {
    return i == 0;
  }
}
