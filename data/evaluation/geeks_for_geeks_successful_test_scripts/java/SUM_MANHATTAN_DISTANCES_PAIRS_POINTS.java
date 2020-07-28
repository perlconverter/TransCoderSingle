// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class SUM_MANHATTAN_DISTANCES_PAIRS_POINTS{
static int f_gold ( int x [ ] , int y [ ] , int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) sum += ( Math . abs ( x [ i ] - x [ j ] ) + Math . abs ( y [ i ] - y [ j ] ) ) ;
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,4,6,6,8,11,12,13,14,19,20,22,24,28,29,30,32,35,37,44,48,49,51,51,56,59,59,62,65,68,68,68,72,75,77,78,89,89,91,93,95,99});
    param0.add(new int[]{16,76,2,42,-24,-82,68,-2,98,-42,-72,28,-22,-52,28,-38,36,66,84,64,-28,86,52,84,-98,-30});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{61,37,57,99,22,72,38,85,23,85,15,4,49,9,15,25,7,63,79,6,85,30,12,34,38,6,59,62,59,34,72,97,70,44,95,58,99});
    param0.add(new int[]{-96,-86,-82,-72,-72,-64,-62,-60,-56,-56,-56,-54,-52,-40,-36,-30,-10,10,18,26,28,56,56,56,64,90,92,94});
    param0.add(new int[]{1,0,1,1,1,0,1});
    param0.add(new int[]{6,10,24,25,31,41,43,45,47,65,67,90});
    param0.add(new int[]{-74,92,34,56,-54,-98,-76,-34,16,32,-4,-16,22,90,-52,-90,-60,70,-40,78,96,-68,78,-56,-94});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{20,32});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{6,19,19,22,25,27,31,33,34,35,37,38,38,44,46,50,51,55,58,58,64,64,64,64,65,66,66,66,67,70,75,78,79,81,81,81,82,84,84,86,94,96});
    param1.add(new int[]{-34,92,-24,-62,28,72,-10,10,8,90,-72,-24,50,-46,52,58,68,-62,-64,-78,-12,24,62,-30,62,-60});
    param1.add(new int[]{0,0,0,0,1,1,1,1,1,1});
    param1.add(new int[]{72,41,77,62,78,36,75,28,91,39,32,56,60,64,21,15,80,85,28,22,53,58,69,62,60,48,66,91,38,66,54,5,24,1,49,71,49});
    param1.add(new int[]{-98,-98,-96,-96,-82,-80,-80,-68,-62,-60,-46,-38,-26,-26,-20,-18,16,22,24,26,34,46,52,52,74,76,90,92});
    param1.add(new int[]{1,0,1,0,0,1,1});
    param1.add(new int[]{4,7,11,19,21,39,57,80,84,93,94,97});
    param1.add(new int[]{14,20,24,-92,58,12,78,78,-90,96,-44,36,30,-46,-30,-80,26,-2,26,28,-16,-50,-2,-36,-8});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{23,50});
    List<Integer> param2 = new ArrayList<>();
    param2.add(37);
    param2.add(24);
    param2.add(5);
    param2.add(26);
    param2.add(26);
    param2.add(3);
    param2.add(10);
    param2.add(21);
    param2.add(23);
    param2.add(1);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}