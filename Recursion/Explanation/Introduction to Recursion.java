/*Recursion - Is  a way to write a program in which function calls itself.

Java program :
*/
class Test{
static void fun1(){
  System.out.println("fun1");
}
static void fun2(){
  System.out.println("before fun1");
  fun1();
  System.out.println("After fun1");
}
public static void main(string []args){
  System.out.println("Before fun2");
  fun2();
  System.out.println("After fun2");
}
}

/*
Output :
Before fun2
Before fun1
fun1
after fun1
after fun2
*/

/**
*execution flow :
*execution begins from main first line 
*Before fun2(o/p to screen)
*(main stops)
*(calls fun2)
******execution begins from fun2 first line
*****Before fun1(o/p to screen)
****(fun2 stops)
***(calls fun1)
**fun1(o/p to screen)(once fun1 finishes its execution and reaches last line fun1 given control to fun2)
*fun2 resumes execution
*After fun1(o/p to screen)(once fun2 finishes its execution and reaches last line fun2 given control to main)
*main resumes execution
*after fun2(o/p to screen)
*/

/**
*Recursion - A function calls recursive if it calls itself directly or indeirectly
*Direct recursion:
*void fun(){
*  ---------
*  ------
*  fun();
*  ------
*  ------
*}
*
*
*Indirect recursion:
* void fun(){
    -------
    -------
    fun2();
    -----
    -----
  }
  void fun2(){
    ------
    -----
    fun1();
    ----
    -----
  }
*/
/*direct function is very common comparatively on indirect function*/

//Example program:
class Test{
  static void fun(){
    System.out.prinln("GFG");
    fun();
  }
  public static void main(string []args)
  {
    fun();
  }
}
/*output:
GFG
GFG
GFG
'
'
'
'
'
'
GFG
stackoverflow
*/

//Example 2:
class Test {
  ststic void fun(int n){
    if(n==0)//base case(point where termination happens)
      return;
    System.out.println("GFG");
    fun(n-1);
  }
  public static void main(string []args)
  {
    fun();
  }
}
//Typical structures of Recursive Functions
fun(___)
{
   Base cases
     -----
     Recursive call(i.e call to fun())
     with at lease one change in parameter.
     --------
}
