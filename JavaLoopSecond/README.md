## Introduction


You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a,b ,n and values as a single line of space-separated integers.

 We use the integers a,b , and , n to create the following series:
 (a + (Math.pow(2,0) *b)), (a + (Math.pow(2,0) *b) + (Math.pow(2,1) * b)),  (a + (Math.pow(2,0) *b) + (Math.pow(2,1) * b) + Math.pow(2,2) *b) <br>


## Input Format

The first line contains an integer, q, denoting the number of queries.
Each line of the subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.

## Constraints

0 <= q <= 500
0 <= a, b <= 50
1 <= n <= 15


## Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of space-separated integers.

## Sample Input

2<br>
0 2 10<br>
5 3 5<br>


## Sample Output

2 6 14 30 62 126 254 510 1022 2046<br>
8 14 26 50 98<br>

## Explanation

We have two queries:
1. a=0, b=2, n= 10, to produce some series:<br>
We use pow(2, i) <br>
s0 = (0 + pow(2, 0) * 2) = 2<br>
s1 = s0 + pow(2, 1) * b = 6<br>
s2 = s1 + pow(2, 2) * b = 14<br>
s3 = s2 + pow(2, 3) * b = 30<br>
... and so on, until we reach s9 = 2046 <br>
This means once we hit n = 10 , we print the first ten terms as a single line of space-separated integers.<br>

2. a=5, b=3, n=5<br>
we do the same as 1.