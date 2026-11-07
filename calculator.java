public class Calculator{
    public static void main(String args[])
{
    int a = 25;
    int b = 4;
    int age = 21;
    boolean isStudent = true;
    int result = 10 + 5 * 2;
    //Arithmetic operators
    System.out.println("first number: " + a);
    System.out.println("second number: " + b);
    System.out.println("addition: " + (a+b));
    System.out.println("substraction: " + (a-b));
    System.out.println("multiplication: " + (a*b));
    System.out.println("devision: " + (a/b));
    System.out.println("addition: " + (a%b));
    //Relational operators
    System.out.println("equal: " + (a==b));
    System.out.println("not equal: " + (a!=b)); 
    System.out.println("greater: " + (a>b));
    System.out.println("lesser: " + (a<b));
    System.out.println("greater or equal: " + (a>=b));
    System.out.println("lesser or equal: " + (a<=b));
    //Logical operators
    System.out.println("and: " + (age>18 && age<25));
    System.out.println("or : " + (age>18 || age<25));
    System.out.println("not : " + (!isStudent));
    //Assignment operator
    System.out.println("assign : " + (a=10));
    System.out.println("add and assign : " + (a+=5));
    System.out.println("substract and assign : " + (a-=3));
    System.out.println("multiplie and assign : " + (a*=2));
    System.out.println("divide and assign  : " + (a/=4));
    System.out.println("remainder and assign : " + (a%=3));
    //unary operators
    System.out.println("original : " + a);
    System.out.println("post-increment : " + (a++));
    System.out.println("post-decrement : " + (a--));
    System.out.println("pre-increment : " + (++a));
    System.out.println("pre-decrement : " +(--a));
    System.out.println("final : " + a);
    System.out.println("positive : " + (+a));
    System.out.println("negative : " + (-a));
    //Bitwise operators
    System.out.println("B-AND : " + (a & b)); 
    System.out.println("B-OR : " + (a | b));
    System.out.println("B-NOT : " + (a ^ b));
    System.out.println("B-left shift : " + (a<<1));
    System.out.println("B-right shift : " + (a>>1));
    System.out.println("B- unsigned right shift : " + (a>>>1));
    //Ternary operator
    String category = (age >= 18) ? "Adult" : "Minor";
    System.out.println(category);
    //Presedence operator
    System.out.println(result);
}
}