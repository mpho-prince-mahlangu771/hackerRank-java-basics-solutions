# introduction

You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

## nput Format

The first line of input contains an integer N, representing the total number of students. The next N

lines contains a list of student information in the following structure:

ID Name CGPA

## Constraints
2 <= N <= 1000 <br>
0 < ID <= 100 000 <br>
5 <= | Name | <= 30 <br>
0 <= CGPA <= 4.00 <br>

The name contains only (lowercase) English letters. The ID contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.

## Output Format

After rearranging the students according to the above rules, print the first name of each student on a separate line.


## Sample Input

5 <br>
33 Rumpa 3.68 <br>
85 Ashis 3.85 <br>
56 Samiha 3.75 <br>
19 Samara 3.75 <br>
22 Fahim 3.76 <br>

## Sample Output

Ashis <br>
Fahim <br>
Samara <br>
Samiha <br>
Rumpa <br>
