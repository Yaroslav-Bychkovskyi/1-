package com.github.ybychkovskyi.springstart.lists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayListTest {

  @Test
  void testArrayList() {
    testList(new ArrayList<>());
  }

  @Test
  void testLinkedList() {
    testList(new LinkedList<>());
  }

  private void testList(List<String> list) {
    list.add("A");
    list.add("B");

    assertEquals("A", list.get(0));
    assertEquals("B", list.get(1));
    assertEquals(2, list.size());
    assertFalse(list.isEmpty());


    assertTrue(list.contains("A"));
    assertTrue(list.contains("B"));
    assertFalse(list.contains("C"));

    list.remove(0);

    assertEquals("B", list.get(0));
    assertEquals(1, list.size());

    list.remove(0);

    assertEquals(0, list.size());
    assertTrue(list.isEmpty());
  }
}