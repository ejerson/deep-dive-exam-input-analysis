## deep-dive-exam-input-analysis ##

* carylstuart77

* Cyeff

* Itajan

* EJerson

## Summary of the Problem ##

Our goal is to find the largest product that can be obtained by multiplying four numbers that are neighbors (horizontally, vertically, or
diagonally).  We will have to iterate through four numbers (products), multiplying them and in order to find the largest product.

## Summary of the Solution ##

1) Open text file and return contents of that file.
2) Build contents of file into a grid Array using toString.
3) Using the nested for loops, iterate through outer array building indexes i and j.
   Check right
   Check down
   Check diagonal right down
   Check diagonal right up		
4) Check for largest product.

# Pseudo Code #
 
Given a 20 * 20 matrix 
  Read and iterate through Array 
  For Array of row
    int product = 0
    int largest product = 0
          
    for i 
        check for right
    for i
        check for down
    for i
        check diagonal right down
    for i
        Check diagonal right up
    Int current product 0;
        if (current product value < new product) {
          return new product and store.
        }
     Once iteration is complete we should have the greatest product of the array from four numbers.
     
# Questions to be considered #

We got stuck on parsing the array of strings into integers.  
How do you cast a array of strings into integers?


     
 
     
