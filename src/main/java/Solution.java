public class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    int count = 0;
    while( n != 0) {
      n = n & (n-1);
      count++;
    }
    return count;
  }
  public int hammingWeightV2(int n) {
    int count = 0;
    while ( n != 0) {
      if ((n & 1) == 1) {
        count++;
      }
      // unsigned shift
      n >>>= 1;
    }
    return count;
  }
}
