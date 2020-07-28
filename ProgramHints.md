** To count number of odd numbers between low to high range.
*** odd nos from 1 to low-1 = (low/2)
*** odd nos from 1 to high = (high-1)/2
*** odd nos low to high =(high-1)/2 - (low/2)
--------------------------------------------------------------
** In array good pair is (nums[i],nums[j]) where i<j and nums[i]=nums[j].. to count good pairs find out how many times each no i.e. nums[i] appears e.g. n times. Then there can be n*(n-1)/2 pairs can be created for nums[i]
--------------------------------------------------------------
**ArrayNesting by taking values as next index to visit
A zero-indexed array A of length N contains all integers from 0 to N-1. Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... } subjected to the rule below.

Suppose the first element in S starts with the selection of element A[i] of index = i, the next element in S should be A[A[i]], and then A[A[A[i]]]… By that analogy, we stop adding right before a duplicate element occurs in S.

 Here, Take visited boolean array which is set to true if element is once visited. If element was part of already visited set, then no need to visit it again.
 Check Leetcode 565.
--------------------------------------------------------------

