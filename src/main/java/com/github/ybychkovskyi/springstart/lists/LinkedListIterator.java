package com.github.ybychkovskyi.springstart.lists;

import java.util.Iterator;

public class LinkedListIterator<E> implements Iterator<E> {

  LinkedList.LinList linList;

  public LinkedListIterator(LinkedList.LinList linList) {
    this.linList = linList;
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public E next() {
    return null;
  }
}
