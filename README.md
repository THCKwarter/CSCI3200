# CSCI3200
# Chapter 1 Assignments
1.1 - Write a program to solve the selection problem. Let k=N/2. Draw a table showing the running time of your program for various values of N (10, 100, 1000, 10000). Make sure you submit a working java program and the runtime in seconds to 5 decimal places for at least the 4 problem sizes above.

1.5 - Write a recursive method that returns the number of 1's in the binary representation of N. Use the fact that this is equal to the number of 1's in the representation of N/2, plus 1, if N is odd. For example, starting at 5, 5 is odd, so ones++, 5/2 = 2, 2 is even, 2/2 = 1, 1 is odd, so ones++, so 5 should produce an answer of 2 (101 in binary). DO NOT use the built in method for converting an integer into a binary string. Make sure you are prompting the user for a number, then outputting how many 1's are in it's binary representation.

1.15 - Define a Rectangle class that provides getLength and getWidth methods. Using the findMax routines in Figure 1.18, write a main that creates an array of Rectangle (5+) and finds the largest Rectangle, first on the basis of area, and then on the basis of perimeter. Note, you should create 2 Comparator classes, one for area, and one for perimeter, to use with the findMax method provided by the textbook. You shouldn't need to modify the findMax method.

# Chapter 2 Assignments
2.7 Implement programs 1-6, calculate run times in seconds for each using the values of N (10,100,1000,10000)

2.8 Write 3 separate programs (1 for each algorithm. 2.8.1, 2.8.2, 2.8.3), calculate the run time in seconds of each for the 10 values of N provided

2.27 - Provide a program that asks a user for the value N, creates an N x N matrix of unique values that follow the rules for the problem, then prompt the user for a number, and determine if the number exists in the matrix in O(N) run time or better.

# Chapter 3 Assignments
3.2 - Add a swap method to the two linked list classes we wrote in class. Make sure you are only changing the pointers of the nodes, do not touch the actual values. Make sure to account for all special swap cases.

3.6 - Write a program for the Josephus problem (similar to hot potato), calculate the Big-Oh of your solution. Prompt the user for the value of N.

3.20 - Lazy deletion (mark items deleted instead of actually removing them), a: pro/con of lazy deletion, b: implement lazy deletion on the doubly linked list class we wrote in class (make sure the remove() method performs lazy deletion, and that all other methods honor the deleted nodes correctly, include the process for actually deleting items after half the items in the structure are considered deleted)

MyQueue - Create your own MyQueue class, be sure to use generic data types like we did with MyStack, store first/last node, make sure all methods execute in constant time, create a test class to show the Queue works correctly

# Chapter 3 Bonus
3.22,3.23 - Write a program that asks the user for 2 inputs, first the keyword infix/postfix, then a formula in that given format

# Chapter 4 Assignments
BinaryTreeFormula - Create methods for reading postfix and prefix formulas and storing them in the tree. DO NOT convert prefix/postfix to infix before storing in the tree. Make the methods as efficient as possible. Include a tester class and make sure the tree is printed in all 3 formats after being populated from any of the three. Include Big-Oh notation for all 3 populate methods, and all 3 print methods.
