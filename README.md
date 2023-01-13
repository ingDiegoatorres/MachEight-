# MachEight
TestExcercise

## Compiling project

Please compile and run this project in **Java 17** or newer.  
Created in eclipse. 


**Contains 3 clases:**  

**Launcher** -> The main class (Parse command line arguments, launch solution)  
**Numbers**  -> Record to store each pair of numbers that apply.  
**Solution** -> Implementation of algorithm.  



Assuming your code is on this folder:  

'''C:\macheight\MachEight-\'''  

and your commandd line is on that folder, please run this command (inside the proyect structure folder)  

javac -d ./class/ ./src/macheight/test/Launcher.java ./src/macheight/test/Solution.java ./src/macheight/test/Numbers.java  

This will compile the java files and will create the class files.  

## Running project

Inside the new class folder created:  

C:\macheight\MachEight-\class\  

Please execute the command:   
java macheight.test.Launcher **LIST TARGET**  

Where **LIST** is an integer list of numbers, separated by comma. (For example 1,3,5,6,4)  

And **TARGET** is an integer, indicating the number you want to obtain adding two.  (For example 3)

**IMPORTANT:** Do not use spaces between numbers or commas in the **LIST** section. Use a space character to separate the list and the target number.
The excercise could be solved in only one file, but for OOP principles, I decided to organize it in three files.
