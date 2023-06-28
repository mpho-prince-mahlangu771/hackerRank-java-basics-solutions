# ANAGRAMS


# Introduction 

Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

## Function Description

Complete the isAnagram function : isAnagram(String a, String b).

isAnagram has the following parameters:

    string a: the first string
    string b: the second string

Returns boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

## Input Format

The first line contains a string. The second line contains a string


## Constraints

1 <= length(a), length(b) <= 50

Strings a and b consist of English alphabetic characters. The comparison should NOT be case sensitive.

## Sample Input 0

anagram
margana

## Sample Output 0

Anagrams

Explanation 0

We count the number of times a character appears in each string(frequency) and if both strings 
have the same frequency of characters then they are considered anagrams

Character |	Frequency: anagram |	Frequency: margana <br>
A or a |	3 | 3 <br>
G or g 	| 1  |	1 <br>
N or n 	| 1 |	1 <br>
M or m 	| 1 |	1 <br>
R or r 	| 1 |1 <br>

The two strings contain all the same letters in the same frequencies, so we print "Anagrams". <br>
the string=anagram has 3 a's and the string=margana also has 3 a's <br>
the string=anagram has 1 G's and the string=margana also has 1 G's

## Sample Input 1

anagramm
marganaa

Sample Output 1

Not Anagrams

Explanation 1
Character 	| Frequency: anagram |  	Frequency: marganaa <br>
A or a 	3 	4 <br>
G or g 	1 	1 <br>
N or n 	1 	1 <br>
M or m 	2 	1 <br>
R or r 	1 	1 <br>

The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

## Sample Input 2

Hello
hello

Sample Output 2

Anagrams

Explanation 2


Character 	| Frequency: Hello|  	Frequency: hello <br>
E or e 	1 	1 <br>
H or h 	1 	1 <br>
L or l 	2 	2 <br>
O or o 	1 	1 <br>

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

## My own algorithm 1

1. convert each string into an array of characters <br>
2. declare two count variables(count1 and count2) and set them  to zero 
3. Loop through each array <br>
3. While iterating, get the ASCII character value(e.g. a=65) of each element in the array <br>
4. add the value to the count variable <br>
5. after iterating throuhh each array compare the count from both arrays <br>
6. if the values are equal then the strings are anagrams <br>

## problems with algorithm 1

The algorithm returns the correct results for most of the inpu. But for some inputs, such as: <br>
a= bbcc and b = dabc
a = xyzw=(482) and b = xyxy=482 are not anagrams but the algorithm says they are <br>
a = Abul=(388) and b = bulA=(356) are anagrams but the algorithm says they are not <br>
the algorithm produces incorrect results.

## My own algorithm 2

1. convert each string into an array <br>
2. Sort each array in ascending order <br>
3. Convert the array back into a string <br>
4. Use compareToIgnorecase() method, if <br>
    4.1. it returns a 0 then the two strings are anagrams <br>
    4.2. else they are not