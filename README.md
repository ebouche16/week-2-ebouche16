[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3041885&assignment_repo_type=AssignmentRepo)
# Week 2

In this weeks lab we will get to practice using two-dimensional arrays. 
We will also be using loops for doing linear searches over those same arrays and working with booleans. 

## Your tasks
### Complete the methods in `searchAndPrint.java`
#### `gridOfMultiples`
This method takes as input a two-dimensional integer array. 
For this assignment you can assume that all rows of the array are the same length. 
The output will be a second two-dimensional array of the same size, this time the type will be booleans. 
The values of the output will correspond to the value existing in the array multiple times. 
This method should utlize the `searchForMultiples` method described below. 

Here is an example: 
if `inputArray` is 
```
[[ 4, 7, 9],
 [ 8, 9, 3]]
 ```
 the output of the method would be the following boolean array:
```
[[false, false, true],
 [false, true, false]]
 ```
 
Since `9` is in the input twice, both positions in the output that correspond to those two instances are `true`,
all of the other values only occur once, so thier values are `false`. 

#### `printGrid`
This method takes as input a two-dimensional boolean array and prints it to the screen and stop (there is no return). 
The main perpose is to visualize the data for examination. 
Each value in the array will be printed as a `_` (`false`) or `X` (`true`).
Each row will be on its own line with no spaces between characters. 

Here is an example: 
if `inputGrid` is 
```
[[false, false, true, false],
 [false, true, false, true],
 [true, false, false, true]]
 ```
 the method will print:
 ```
 __X_
 _X_X
 X__X
 ```
 
#### `searchForMutliples`
This method takes as input a two-dimensional integer array, and a second scalar search integer. 
The output will be a single boolean that is  `true` if the search is in the array **two or more times**, and `false` if it is in the array 0 or 1 times. 

Here is an example:
if `search` is `12` and `inputArray` is 
```
[[ 12, 17, 90,  1],
 [ 12, 12, 15, 90],
 [ 16, 13, 15, 22]]
 ```
 then the method would return `true`. 
 
 If `inputArray` stayed the same, but `search` were `17` it would return `false`.
 
 
### Create unit tests in `tester.java` using Junit
You will need to create 5 unit tests for each of the methods `gridOfMultiples` and `searchForMutliples`. 
(Note: while you're not required to produce unit tests for `printGrid`, you should test it throughly.)
These tests should be accompanied by pre-amble comments that describe what the test is confirming and why it is needed. 
The tests should be distinct from the examples provided. 

## Grading
100 points total

### `searchAndPrint.java`
* 20 points for `gridOfMultiples`
* 10 points for `printGrid`
* 30 points for `searchForMutliples`

### `tester.java`
* 40 points 
  * 4 points for each of the 10 unit tests
    * 2 point for the test implementation
    * 2 points for the justification
