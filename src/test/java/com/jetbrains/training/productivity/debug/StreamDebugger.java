package com.jetbrains.training.productivity.debug;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamDebugger {
  @Test
  void shouldShowTheStreamDebugger() {
    // given
    List<String> result = Stream.of(1, 2, 3, 5, 6, 7, 8, 9)
                                .filter(it -> it % 2 == 0)
                                .map(it -> "item: " + it)
                                .toList();
    System.out.println("result = " + result);
  }
}
