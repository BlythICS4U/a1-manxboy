# a1 Assignment 1

A separate NetBeans project has been provided for each assignment question.  Before you start your work, ensure that you have cloned this repository and created a develop branch.  When you have completed the assignment, commit to your develop branch and create a pull request.

(1) Help! My program does not compile! Use the information provided by the NetBeans editor to fix the syntax errors in this program.  A working program should ask the user for 2 double values and output the sum and average of these 2 numbers.

(2) Write a program that allows the user to enter a sequence of five marks in the range from 50 to 99. You can assume that the user enters only integer values in this range. As each mark is entered, your program responds with the corresponding letter grade that is equivalent to the mark according to the following chart:

Mark Range | Letter Grade
--- | ---
50 - 53 | D-
54 - 57 | D
58 - 61 | D+
62 - 65 | C-
66 - 69 | C
70 - 73 | C+
74 - 77 | B-
78 - 81 | B
82 - 85 | B+
86 - 89 | A-
90 - 94 | A
95 - 99 | A+

(3) To determine the fuel efficiency of a vehicle, you perform the following calculation:

        fuel efficiency     =     100*(litres used)
                                  -----------------
                                  kilometres driven

For example, if a car is driven 350 kilometres and uses 25 litres of fuel, the efficiency would be:

        fuel efficiency     =     100 * 25     =      7.14 litres per 100 km
                                  --------
                                     350

Write a program that uses a loop to allow the user to type two numbers: kilometres and litres.
You need to declare all the numbers for this program as *double*, and use *keyboard.nextDouble()* to accept the input from the user. The loop ends if the value for kilometres is negative. Calculate and output the fuel efficiency for the number the user has entered. Use 2 decimals of accuracy. Allow the user to repeat this process for another set of numbers as many times as they want, entering a negative to signal the program is to end.  Format your output as shown in the example.

```
Type the Kilometres: 350
Type the Litres: 25
Fuel Efficiency = 7.14

Type the Kilometres: 600
Type the Litres: 50
Fuel Efficiency = 8.33

Type the Kilometres: 425
Type the Litres: 16
Fuel Efficiency = 3.76

Type the Kilometres: -4
```
