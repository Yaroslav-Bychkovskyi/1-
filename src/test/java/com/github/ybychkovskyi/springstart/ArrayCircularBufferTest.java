package com.github.ybychkovskyi.springstart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCircularBufferTest {

  @Test
  void put() {
    ArrayCircularBuffer<String> arrayCircularBuffer = new ArrayCircularBuffer<String>(3);

    arrayCircularBuffer.put("s");
    arrayCircularBuffer.put("432");
    arrayCircularBuffer.put("sgdf");
  //  arrayCircularBuffer.put("vff32");
  }

  @Test
  void get(){

  }

}