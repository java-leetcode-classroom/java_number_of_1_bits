import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  private final Solution sol = new Solution();

  @Test
  void hammingWeightExample1() {
    assertEquals(3, sol.hammingWeight(
        0b00000000000000000000000000001011
    ));
  }
  @Test
  void hammingWeightExample2() {
    assertEquals(1, sol.hammingWeight(
        0b00000000000000000000000010000000
    ));
  }
  @Test
  void hammingWeightExample3() {
    assertEquals(31, sol.hammingWeight(
        0b11111111111111111111111111111101
    ));
  }

  @Test
  void hammingWeightV2Example1() {
    assertEquals(3, sol.hammingWeightV2(
        0b00000000000000000000000000001011
    ));
  }
  @Test
  void hammingWeightV2Example2() {
    assertEquals(1, sol.hammingWeightV2(
        0b00000000000000000000000010000000
    ));
  }
  @Test
  void hammingWeightV2Example3() {
    assertEquals(31, sol.hammingWeightV2(
        0b11111111111111111111111111111101
    ));
  }
}