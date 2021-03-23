package com.github.ybychkovskyi.springstart.lists;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {

  static class LinList<T> {
    LinList<T> next;
    T t;

    public LinList(T t) {
      this.t = t;
    }
  }

  LinList<T> last;
  LinList<T> first;

  @Override
  public void add(T t) {

    LinList<T> a = new LinList<>(t);

    if (last != null) {
      last.next = a;
    }

    last = a;


    if (first == null) {
      first = a;
    }
  }

  @Override
  public T get(int index) {
    LinList<T> i;
    i = first;
    if (i == null) {
      throw new ArrayIndexOutOfBoundsException(index);
    }
    int result = 0;
    while (i != null) {
      if (result == index) {
        return i.t;
      }

      result++;
      i = i.next;

    }
    return null;
  }

  @Override
  public void remove(int index) {



  }

  @Override
  public boolean contains(T t) {
    LinList<T> c;
    c = first;
    while (c != null){
      if(t.equals(c.t)){
        return true;
      }


      c = c.next;
    }

    return false;
  }

  @Override
  public java.util.List<T> toList() {
    return null;
  }

  @Override
  public int size() {
    int s = 0;
    LinList<T> j;
    j = first;

    if (first == null) {
      return 0;
    }
    while (j != null) {
      s++;
      j = j.next;;
    }
    return s;

  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public Iterator<T> iterator() {
    return new LinkedListIterator<>();
  }
}
