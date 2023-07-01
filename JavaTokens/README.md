## challenge no 3: String tokens

Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Sample Input

He is a very very good boy, isn't he?


Input Format

A single string, s ,

.

Constraints
1 <= lenght s <= 4.pow(10,5)

s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).

Output Format

On the first line, print an integer,n
, denoting the number of tokens in string s (they do not need to be unique). Next, print each of the n tokens on a new line in the same order as they appear in input string s

.

Sample Input
String split_str[] = s.split("[\\s!,?._'@]+");
He is a very very good boy, isn't he?
           YES      leading spaces        are valid,    problemsetters are         evillllll

Sample Output

10
He
is
a
very
very
good
boy
isn
t
he

Explanation

We consider a token to be a contiguous segment of alphabetic characters. There are a total of
such tokens in string , and each token is printed in the same order in which it appears in string .