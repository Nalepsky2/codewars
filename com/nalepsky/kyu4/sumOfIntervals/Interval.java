package com.nalepsky.kyu4.sumOfIntervals;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Interval {
    //https://www.codewars.com/kata/52b7ed099cdc285c300001cd/java
    public static int sumIntervals(int[][] intervals){
        class Range implements Comparable<Range>{
            private Integer min;
            private Integer max;

            public Range(Integer min, Integer max) {
                this.min = min;
                this.max = max;
            }

            private boolean isNumberWithinRange(Integer x){
                return x >= min && x <= max;
            }

            public void mergeRanges(Range r){
                if(isNumberWithinRange(r.min) || isNumberWithinRange(r.max)){
                    r.min = this.min = Math.min(this.min, r.min);
                    r.max = this.max = Math.max(this.max, r.max);
                }
            }

            public Integer getInterval(){
                return max - min;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Range range = (Range) o;
                return Objects.equals(min, range.min) &&
                        Objects.equals(max, range.max);
            }

            @Override
            public int hashCode() {
                return Objects.hash(min, max);
            }

            @Override
            public int compareTo(Range o) {
                if(this.min < o.min && this.max < o.max){
                    return -1;
                }

                if(this.min > o.min && this.max > o.max){
                    return 1;
                }

                return 0;
            }
        }

        if(intervals == null){
            return 0;
        }

        for (int[] interval : intervals) {
            if (interval == null) {
                return 0;
            }
        }

        final List<Range> ranges = Arrays.stream(intervals)
                .map(row -> new Range(row[0], row[1])).sorted()
                .collect(Collectors.toList());

        for(Range r: ranges ){
            ranges.forEach(r::mergeRanges);
        }

        return ranges.stream()
                .distinct()
                .map(Range::getInterval)
                .reduce(0, Integer::sum);
    }
}
