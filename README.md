# More-exercises-of-Fundamental-course-in-SOFTUNI
Courses from my education Java fundamental  in @SoftUni

Problems for exercises with Arrays
1.	Train
Given a count of wagons in a train n. On the next n lines will receive how many people will get on that wagon. In the end print the whole train and the sum of the people on the train.
2.	Common Elements
Program prints common elements in two arrays. Compare the elements of the second array to the elements of the first.
3.	Zig-Zag Arrays
Program creates 2 arrays. Given an integer n. On the next n lines, you get 2 integers.
4.	Array Rotation
Program receives an array and the number of rotations  (the first element goes at the end).

5.	Top Integers
Program to find all the top integers in an array. A top integer is an integer that is bigger than all the elements to its right
6.	Equal Sums
Program that determines if an element exists in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, their sum is considered to be 0.
7.	Max Sequence of Equal Elements
Program that finds the longest sequence of equal elements in an array of integers. If several longest sequences exist, print the leftmost one.
8.	Magic Sum
Program that prints all unique pairs in an array of integers whose sum is equal to a given number. 
9.	Array Modifier
•	Given an array with integers. Write a program to modify the elements after receiving the following commands:
•	"swap {index1} {index2}" takes two elements and swap their places.
•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
•	"decrease" decreases all elements in the array with 1.

10.	Treasure Hunt
Create a program that manages the state of the treasure chest along the way. On the first line, you will receive the initial loot of the treasure chest, a string of items separated by a "|".
"{loot1}|{loot2}|{loot3} … {lootn}"
The following lines represent commands until "Yohoho!" which ends the treasure hunt:
•	"Loot {item1} {item2}…{itemn}":
o	Pick up treasure loot along the way. Insert the items at the beginning of the chest. 
o	If an item is already contained, don't insert it.
•	"Drop {index}":
o	Remove the loot at the given position and add it to the end of the treasure chest. 
o	If the index is invalid, skip the command.
•	"Steal {count}":
o	Someone steals the last count loot items. If there are fewer items than the given count, remove as many as there are. 
o	Print the stolen items separated by ", ":
"{item1}, {item2}, {item3} … {itemn}"
In the end, output the average treasure gain, which is the sum of all treasure items length divided by the count of all items inside the chest formatted to the second decimal point:
"Average treasure gain: {averageGain} pirate credits."
If the chest is empty, print the following message:
"Failed treasure hunt."




