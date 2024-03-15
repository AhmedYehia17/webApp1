//public class revision {
//    public static void main(String[] args){
//
//    }
//}

//OUTPUT
//System.out.println()
//System.out.printf()
//System.out.print()


//COMMENTS
//single line comment >>> //comment.....
//Multiline Comment >>> /*Comment...*/

//VARIABLES
//variables are like containers to store values in memory
//Declaration >>> Data-type Var-name = value
//Types of variables >>> int, String, bool, float, char
//ex: int number= 10;
//variable names must be unique
//variables can not start with numbers
//variables can start with lower case letters
//you can not have white space in the variable name
//you can use under score , numbers , letters and dollar sign($)

//TYPE-CASTING
//It is changing the data type of a variable
//types: widening casting , narrowing casting
//widening casting: is an automatic casting when you convert the variable to a larger data type
//ex: int >>> double
//Narrowing casting: is casting from large data type to smaller one
//syntax:
// double x= 135.48;
// int y=  (int) x;
//Here we have changed the data type of variable x to int


//OPERATORS
//They are used to perform operations on variables and values
//Arithmetic operators: used top perform mathematical operators
/////////////// + , - , *, /, %, ++, --
//Assignment operators: used to assign values to variables
////////////// =, +=, -=, *=, /=, %=, &=, |=
//Comparison Operators: used to compare two variables or two values
//////////// ==, !=, >, <, <=, >=
//logical operators: used to determine the logic between variables and values
/////////// &&, ||, !


//STRINGS
//It is the data type used to store text
//strings are collection of characters surrounded by double qoutes
//String methods:
//.length >>> used to return the length of a string
// .indexOf() >>> used to return the index of the first occurrence of a specific word or character in the string
// .toUpperCase() , .toLowerCase() >>> used to change the string characters to upper case or lower case
// .concat() >>> used to combine two strings with each other ('+' is used also to concatenate strings with each other)
//Ex:
// String x= "Ahmed";
// String y= "Yehia";
// String z= x.concat(y);

//MATH CLASS
//it is a class, that has many methods to perform mathematical operations on numbers
//Math.max(x,y) >>> used to find the highest value between x and Y
//Math.min(x,y) >>> used to find the lowest value between x and y
//Math.sqrt(x) >>> used to find the square root of x
//Math.abs(-10) >>> used to return the absolute value of the passed number
//Math.random() >>> used to return random value between 0 and 1
//Math.random * 101 >>> will return random values between 0 and 100






//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//DATASTRUCTURES

//STACK
//it is one of the ways of storing data in memory
//It is called LIFO (last in first out) data structure
//DECLARATION >>> Stack <data type> stack-name = new Stack <data type> ();
//STACK METHODS:
//push() : used to add objects to the stack
//pop() : used to remove the top most object in the stack
//peek() : used to return the top most object in the stack
//empty() : used to return true or false based on if the stack is empty or not
//search() : used to search for objects in the stack and return the position of it



/////////////////////////////////////////

//QUEUE
//It is another way for storing data in memory
//It is called FIFO (First in First out) data structure
//Declaration >>> Queue <data type> queue-name = new LinkedList <data type>();
//QUEUE METHODS:
//offer(): used to add objects to the queue
//poll(): used to remove objects from the head of the queue
//peek(): used to return the object at the head of the queue
//isEmpty(): return true or false based on if the queue is empty or not
//size(): return the number of objects in the queue
//contains(): used to search for a specific object in the queue, if found it returns true , if else it returns false

