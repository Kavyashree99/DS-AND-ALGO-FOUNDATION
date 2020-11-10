Recursion - Is  a way to write a program in which function calls itself.

Java program :
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
