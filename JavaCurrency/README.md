# Java Currency Formatting challenge

## Instructions

Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows: 


US: formattedPayment <br>
India: formattedPayment <br>
China: formattedPayment <br>
France: formattedPayment <br>


where is formattedPayment is formatted according to the appropriate Locale's currency. <br>

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English). <br>


## Input format 


A single double-precision number denoting payment.


# Constraints


0 <= payment <= pow(10, 9) <br>

## Output format


On the first line, print US: u where u is payment  formatted for US currency.
On the second line, print India: i where i is payment formatted for Indian currency.
On the third line, print China: c where c is payment formatted for Chinese currency.
On the fourth line, print France: f, where f is payment formatted for French currency.

## Sample Input


12324.134

## Sample output

US: $12,324.13 <br>
India: Rs.12,324.13 <br>
China: ￥12,324.13 <br>
France: 12 324,13  <br>


