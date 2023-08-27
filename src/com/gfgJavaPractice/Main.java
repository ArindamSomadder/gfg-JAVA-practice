package com.gfgJavaPractice;

/*
class ComplexNumber{
    private int real=0, img=0;
    public ComplexNumber(int real, int img){
        this.real= real;
        this.img= img;
    }
    public void printNumber(){
        System.out.println("Number: "+real+" + "+img+"i ");
    }
    public static ComplexNumber addNumber(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber c3= new ComplexNumber(0, 0);
        c3.real= c1.real+c2.real;
        c3.img= c1.img+c2.img;

        return c3;
    }
}
public class Main{
    public static void main(String args[]){
        ComplexNumber c1= new ComplexNumber(1, 6);
        ComplexNumber c2= new ComplexNumber(2, 7);
        c1.printNumber();
        c2.printNumber();
        ComplexNumber result= ComplexNumber.addNumber(c1, c2);
        System.out.println("Addition::::");
        result.printNumber();
    }
}
*/

/*
class Main {
    // Gcd of x and y using recursive function
    static int GCD(int x, int y)
    {
        // Everything is divisible by 0
        if (x == 0)
            return y;
        if (y == 0)
            return x;

        // Both the numbers are equal
        if (x == y)
            return y;

        // x is greater
        if (x > y)
            return GCD(x - y, y);
        return GCD(x, y - x);
    }

    // The Driver method
    public static void main(String[] args)
    {
        int x = 20, y = 40;
        int gcd= GCD(x, y);
        System.out.println(gcd);
        int lcm= x*y/gcd;
        System.out.println(lcm);
    }
}
*/

/*
class Main {
    public static int findGCD(int a, int b){
        if(b == 0)
            return a;
        return findGCD(b, a%b);
    }
    public static void main(String[] args) {
        int array[] = {20, 40, 80};
        int gcd = array[0];
        int lcm= array[0];

        //Loop through the array and find GCD
        //by combining the GCD of previous numbers
        for(int i=1; i<array.length; i++){
            gcd = findGCD(array[i], gcd);
            lcm= (array[i]*lcm)/gcd;
        }
        System.out.print("GCD: "+gcd);
        System.out.print("LCM: "+lcm);
    }
}
*/

/*
class Main {
    public static void main(String[] args) {
        int array[] = {20, 40, 80};

        //initialize LCM and GCD with the first element
        int lcm = array[0];
        int gcd = array[0];

        //loop through the array to find GCD
        //use GCD to find the LCM
        for(int i=1; i<array.length; i++){
            gcd = findGCD(array[i], gcd);
            lcm = (lcm*array[i])/gcd;
        }

        System.out.println("GCD: "+gcd);
        System.out.println("LCM: "+lcm);
    }

    //recursive function to find GCD of two numbers
    public static int findGCD(int a, int b){
        //base condition
        if(b == 0)
            return a;

        return findGCD(b, a%b);
    }
}
*/

/*
public class Main{
    public static void prime(int num){

        for(int i=2; i<=num; i++){
            int flag=1;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    flag= 0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args){
        int n=20;
        prime(n);
    }
}
 */

/*
public class Main{
    public static boolean checkLeapYear(int year){
        if(year%100==0){
            //century year
            if(year%4==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            //non century year
            if(year%4==0){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main(String[] args){
        int year=2007;
        boolean result= checkLeapYear(year);
        if(result== true){
            System.out.println(year+" is leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
*/

/*
public class Main{
    public static void neonCheck(int num){
        int square= num*num;
        int squareCopy= square, digit=0, sumOfDigit=0;
        while(squareCopy!=0){
            digit= squareCopy%10;
            sumOfDigit= sumOfDigit+digit;
            squareCopy= squareCopy/10;
        }

        if(sumOfDigit==num){
            System.out.println("Neon ");
        }
        else{
            System.out.println("Not neon");
        }

    }
    public static void main(String[] args){
        neonCheck(10);
    }
}
 */

/*
public class Main{
    public static void fibonacci(int first, int second, int n, int sum){
        if(n==0){
            System.out.println("Sum is: "+sum);
            return;
        }
        int third= first+second;

        if(third%2==0){
            sum= sum+third;

        }
        fibonacci(second, third, n-1, sum);
    }
    public static void main(String[] args){
        int first=0, second=1, n=11;
        fibonacci(first, second, n-2, 0);
    }
}
 */

/*
public class Main{

    public static void evenIndexSumFibonacci(int n){
        int first=0, second=1, third, sum=0, count=-1, var=0;
        while(var<=n){
            System.out.println(first);
            count= count+1;
            if(count%2==0){
                var= var+1;
                sum= sum+first;
            }
            third= first+second;
            first= second;
            second= third;
        }
        System.out.println("Sum: "+sum);
    }
    public static void main(String[] args){
        evenIndexSumFibonacci(0);
    }
}
 */

/*
public class Main{

    public static void binToDec(long n){
        int digit, i=0;
        int decimal=0;
        while(n>0){
            digit= (int)(n%10);
            decimal= (int) (decimal+digit*Math.pow(2, i));
            i= i+1;
            n= n/10;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args){
       long n= 110;
       binToDec(n);

    }
}
*/

/*
class Main {

    // method to convert binary to decimal
    public static int binaryToDecimal(long binary)
    {
        // variable to store the decimal number
        int decimalNumber = 0, i = 0;

        // loop to extract the digits of the
        // binary number
        while (binary >0) {

            // multiplying each digit of binary
            // with increasing powers of 2 towards
            // left
            decimalNumber
                    += Math.pow(2, i++) * (binary % 10);

            // dividing the binary by 10
            // to remove the last digit
            binary /= 10;
        }

        // returning the converted decimal number
        return decimalNumber;
    }

    // function to convert decimal to octal
//    int decimalToOctal(long binary)
//    {
//
//        // variable to store the decimal number
//        // returned by the binaryToDecimal()
//        int decimalNumber = binaryToDecimal(binary);
//
//        // using the toOctalString() to convert
//        // Integer to String of Octal Number
//        String octalString
//                = Integer.toOctalString(decimalNumber);
//
//        // converting the String of octal number
//        // to an Integer
//        int octalNumber = Integer.parseInt(octalString);
//
//        // returning the octal number
//        return octalNumber;
//    }

    public static void main(String[] args)
    {
        System.out.println(binaryToDecimal(011));
    }
}
*/

/*
class Number{
    private int n;
    public Number(int n){
        this.n= n;
    }

    public void setValue(int n){
        this.n =n;
    }
    public int getValue(){
        return n;
    }
}
public class Main {

    public static void main(String[] args){
        Number n1= new Number(100);
        Number n2= new Number(n1.getValue());
        System.out.println(n2);
        System.out.println(n1);
    }
}
*/

/*
public class Main {

    public static void main(String[] args){
        boolean val= true;
        String s1= Boolean.toString(val);
        System.out.println(s1.getClass());
        System.out.println(val);
    }
}
*/

/*
public class Main {

    public static void main(String[] args){
        double d1= 15.63;
        String str1= String.valueOf(d1);
        System.out.println(str1.getClass());
    }
}
*/

/*
public class Main {

    public static void main(String[] args){
        String str1= "125989";
        long l1= Long.valueOf(str1);
        char c='A';
        double d1= 236.54;
        int var1= (int)l1;

        System.out.println(((Object)l1).getClass().getSimpleName());
        System.out.println(((Object)c).getClass().getSimpleName());
        System.out.println(((Object)d1).getClass().getSimpleName());
        System.out.println(((Object)var1).getClass().getSimpleName());
    }
}
 */

/*
public class Main {

    public static void main(String[] args){
        int i1= 64;
        char ch= (char)(i1+'1');
        System.out.println(ch);
        char c2= 'a';
        int a= c2-'0';
        System.out.println(a);

    }
}
*/

/*
public class Main {
    public static void printChar(String str1){
        int len= str1.length();
        for(int i=0; i<=len-1; i++){
            switch (str1.charAt(i)){
                case '1':
                    System.out.print("one"+ " ");
                    break;
                case '2':
                    System.out.print("two"+ " ");
                    break;

                case '3':
                    System.out.print("three"+ " ");
                    break;

                case '4':
                    System.out.print("four"+ " ");
                    break;

                case '5':
                    System.out.print("five"+ " ");
                    break;

                case '6':
                    System.out.print("six"+ " ");
                    break;

                case '7':
                    System.out.print("seven"+ " ");
                    break;

                case '8':
                    System.out.print("eight"+ " ");
                    break;

                case '9':
                    System.out.print("nine"+ " ");
                    break;

                case '0':
                    System.out.print("zero"+ " ");
                    break;
            }
        }
    }
    public static void main(String[] args){
        String str1= "12365";
        printChar(str1);
    }
}
*/

/*
class Singleton{
    private String s;
    private static Singleton var=null;
    private Singleton(){
        s="hello in Singleton";
    }
    public static Singleton getInstance(){
        if(var==null){
            var= new Singleton();
        }
        return var;
    }

}
public class Main {
    public static void main(String args[])
    {
        Singleton obj1= Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
    }
}
*/

/*
import java.io.*;
interface Vehicle{
    public void speedUp(int val);
    public void applyBreak(int val);
    public void changeGear(int val);
}

class Bike implements Vehicle{
    private int speed=10, gear=1;
    @Override
    public void speedUp(int increment){
        speed= speed+increment;
    }
    @Override
    public void applyBreak(int decrement){
        speed= speed-decrement;
    }

    @Override
    public void changeGear(int gear){
        this.gear= gear;
    }

    public void printDetail(){
        System.out.println("Speed: "+speed+ " Gear: "+gear);
    }
}

public class Main {
    public static void main(String args[])
    {
        Bike r15= new Bike();
        r15.speedUp(20);
        r15.changeGear(2);
        r15.printDetail();
        r15.speedUp(80);
        r15.changeGear(5);
        r15.printDetail();
    }
}
 */

/*
abstract class Shape{
    private String color;
    public Shape(String color){
        System.out.println("Shape constructor called");
        this.color= color;
    }

    public String getColor(){
        return color;
    }
    public abstract int area();
}

class Rectangle extends Shape{
    private int width, height, areaVar;
    public Rectangle(String color, int width, int height){
        super(color);
        this.width= width;
        this.height= height;
    }

    @Override
    public int area(){
        areaVar=width*height;
        return areaVar;
    }

   public String toString(){
        return "Area: "+area()+" with color: "+getColor();
    }
}
public class Main {
    public static void main(String args[]){
        Shape s1= new Rectangle("white", 58, 8);
        System.out.println(s1);
    }
}
 */

/*
class Demo {
    public void show(int x)
    {
        System.out.println("In int" + x);
    }
    public void show(String s)
    {
        System.out.println("In String" + s);
    }
    public void show(byte b)
    {
        System.out.println("In byte" + b);
    }
    public void show(double b)
    {
        System.out.println("In double" + b);
    }
}
class Main {
    public static void main(String[] args)
    {
        byte a = 25;
        Demo obj = new Demo();
        obj.show(a); // it will go to
        // byte argument
        obj.show("hello"); // String
        obj.show(250); // Int
        obj.show('A'); // Since char is
        // not available, so the datatype
        // higher than char in terms of
        // range is int.
        obj.show("A"); // String
        obj.show(7.5f); // since float datatype

    }
}
*/

/*
//caps problem

import java.util.Scanner;

public class Main{
    public static void capDirectionSet(String[] s1){

        int count=0;
        for(int i=0; i<s1.length; i++){
            if(s1[i].equals("1")){
                s1[i]= "0";
                count= count+1;
            }
        }
        for(int i=0; i<s1.length; i++){
            System.out.print(s1[i]+" ");
        }
        System.out.println("\nDifferent direction: "+count);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String[] s1= new String[6];
        System.out.println("Enter 6 elements: ");
        //"0" is for hats towards right direction
        //"1" is for hats towards left direction
        for(int i=0; i<s1.length; i++){
            s1[i]= sc.nextLine();
        }
        capDirectionSet(s1);
    }
}
*/

/*
//Hashmap hashset map implementation

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Main{

    public static void main(String args[]){
//        HashSet<Integer> h1= new HashSet<>();
//        h1.add(25);
//        h1.add(60);
//        h1.add(50);
//        h1.add(100);
//        h1.add(80);
//        h1.add(20);
//        Iterator i1= h1.iterator();
//        while(i1.hasNext()){
//            System.out.println(i1.next());
//        }
        HashMap<String, Integer> map1= new HashMap<>();
        map1.put("India", 120);
        map1.put("China", 150);
        map1.put("Usa", 50);
        System.out.println(map1);
        if(map1.containsKey("India")){
            System.out.println("present");
        }
        else{
            System.out.println("Not present");
        }

        for(Map.Entry<String, Integer> e: map1.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
 */

/*
//Singleton class implementation

class Singleton{
    private static Singleton var=null;
    public String s1;
    private Singleton(){
        s1="Normal constructor";
    }

    public static Singleton getInstance(){
        if(var==null){
            var= new Singleton();
        }
        return var;
    }
}
public class Main {
    public static void main(String[] args)
    {
        Singleton obj1= Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj1.s1);
        obj2.s1= obj2.s1.toUpperCase();
        System.out.println(obj1.s1);
    }
}
*/

/*
//overriding

abstract class Shape{
    private String color;
    public Shape(String color){
        this.color= color;
        System.out.println("Shape Constructor called ");
    }

    public String getColor(){
        return color;
    }
    abstract public double volume();
}

class Circle extends Shape{
    private int width;
    private double volume;
    private String color;
    public Circle(String color, int width){
        super(color);
        System.out.println("Circle Constructor called ");
        this.width= width;
    }
    @Override
    public double volume() {
        volume= Math.PI*width*width;
        return volume;
    }

    @Override
    public String toString(){
        return "Volume will: "+this.volume()+" color: "+super.getColor();
    }
}
public class Main {
    public static void main(String[] args)
    {
        Circle c1= new Circle("white",2);
        System.out.println(c1);
    }
}
*/


//class Main {
//    private static Hashtable<Object, Object> ArrayUtils;
//
//    public static void largest(int[] arr){
//        int length= arr.length;
//        int max= arr[0];
//        int min= arr[0];
//        for(int i=1; i<=length-1; i++){
//            if(arr[i]>max){
//                max= i+1;
//            }
//            if(arr[i]<min){
//                min= i+1;
//            }
//        }
//        System.out.println("Max: "+ max);
//        System.out.println("Min: "+min);
//        ArrayUtils.remove(arr, max);
//        System.out.println("new arr: "+arr);
//
//    }
//    public static void main(String[] args)
//    {
//        int arr[]= {12, 1, 36, 2, 100, 200};
//       largest(arr);
//    }
//}

/*
class Main {

    public static void main(String[] args)
    {
        for(int i=0; i<=999; i++){
            if(checkArmstrong(i)){
                System.out.println(i+ " is Armstrong");
            }
        }
    }

    public static boolean checkArmstrong(int num){
        int alias=num;
        int order=0;
        int result=0;

        while(alias>0){
            order= order+1;
            alias= alias/10;
        }

        alias=num;
        while(alias>0){
            result= (int) (result+Math.pow(alias%10, order));
            alias= alias/10;
        }

        if(result==num){
            return true;
        }
        else{
            return false;
        }
    }
}
*/

/*
//EVEN NUMBERS SUM TILL N

class Main {

    public static void main(String[] args)
    {
        int f=0, s=1, n=10, sum=0, t;

        while(f<=n){
            System.out.print(f+" ");
            if(f%2==0){
                sum= sum+f;
            }
            t=f+s;
            f=s;
            s=t;
        }
        System.out.println("\nsum:"+sum);
    }
}
 */

/*
//calculate nCr

import java.util.Scanner;
class Main {

    public static void main(String[] args)
    {
       int n, r, nCr;
       Scanner sc= new Scanner(System.in);
        System.out.println("n:");
        n= sc.nextInt();
        System.out.println("r:");
        r= sc.nextInt();

        nCr= calculateFactorial(n)/ (calculateFactorial(n-r) * calculateFactorial(r));
        System.out.println(nCr);

    }
    public static int calculateFactorial(int number){
        int fact=1;
        for(int i=1; i<=number; i++){
            fact= fact*i;
        }
        return fact;
    }
}
 */

/*
class Main {
    public static void main(String[] args)
    {
        int n1=5;
        System.out.println(cF(n1));
    }
    public static int cF(int n1){
        if(n1==1){
            return 1;
        }
        return n1*cF(n1-1);
    }
}
 */

/*
//fibonacci (efficient)

class Main {
    public static void main(String[] args)
    {
        int n1=5;
        fibo(n1);
    }
    public static void fibo(int n){
        int n1=0, n2=1, n3;
        for(int i=1; i<=n; i++){
            System.out.println(n1+" ");
            n3= n1+n2;
            n1= n2;
            n2= n3;
        }
    }
}
*/

/*
class Main {
    public static void main(String[] args)
    {
        int n1=5;
        fibo(n1);
    }
    public static void fibo(int n){
        int n1=0, n2=1, n3;
        if(n==1){
            System.out.println(n1);
        }
        else if(n==2){
            System.out.print(n1+" "+n2);
        }
        else{
            for(int i=1; i<=n; i++){
                System.out.print(n1);
                n3= n1+n2;
                n1= n2;
                n2= n3;
            }
        }
    }
}
*/

/*
//palindrome check

class Main {
    public static void main(String[] args)
    {
        int n1=515;
        checkPal(n1);
    }
    static void checkPal(int n1){
        int rev=0, rem, n= n1;
        while(n>0){
            rem=n%10;
            rev= rem+ 10*rev;
            n= n/10;
        }
       if(rev==n1){
           System.out.println("palindrome");
       }
       else{
           System.out.println("Not");
       }
    }
}
 */

/*
//Armstrong check within a range

class Main {
    public static void main(String[] args)
    {
        int range1=50, range2=500;
        for(int i=range1; i<=range2; i++){
            if(checkArm(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean checkArm(int n){
        int digit=0,n1=n, rem;
        double sum=0;

        while(n1!=0){
                digit= digit+1;
                n1= n1/10;
        }
        n1=n;
        while(n1!=0){
            rem= n1%10;
            sum= sum+Math.pow(rem, digit);
            n1= n1/10;
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
}
*/

/*
//shallow copy

class Rectangle{
    private int length, width;
    public Rectangle(int length, int width){
        this.length= length;
        this.width= width;
    }
    public void setLength(int length){
        this.length= length;
    }
    public int getLength(){
        return this.length;
    }
    public void setWidth(int width){
        this.width= width;
    }
    public int getWidth(){
        return this.width;
    }
    public void getDetail(){
        System.out.println("length: "+length+" Width: "+width);
    }
}
public class Main{
    public static void main(String[] args){
        Rectangle r1= new Rectangle(50, 21);
        r1.getDetail();
        Rectangle r2= r1;
        r2.getDetail();
        System.out.println(r1);
        System.out.println(r2);
    }
}
 */

/*
//deep copy

class Rectangle{
    private int length, width;
    public Rectangle(int length, int width){
        this.length= length;
        this.width= width;
    }
    public void setLength(int length){
        this.length= length;
    }
    public int getLength(){
        return this.length;
    }
    public void setWidth(int width){
        this.width= width;
    }
    public int getWidth(){
        return this.width;
    }
    public void getDetail(){
        System.out.println("length: "+length+" Width: "+width);
    }

}
public class Main{
    public static void main(String[] args){
        Rectangle r1= new Rectangle(50, 21);
        Rectangle r2= new Rectangle(r1.getLength(), r1.getWidth());
        r1.getDetail();
        r2.getDetail();
        System.out.println(r1);
        System.out.println(r2);
    }
}
 */

/*
//fibonacci using two variables

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int f=0, s=1,t,n;
        System.out.println("n: ");
        n=sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print(f+" ");
            f=s-f;
            s= f+s;
        }
    }
}
 */

/*
//nth term in fibonacci series

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int f=0, s=1, t, n;
        System.out.println("n: ");
        n = sc.nextInt();

        for(int i=1; i<n; i++){
            t= f+s;
            f= s;
            s= t;
        }
        System.out.println("nth term: "+f);
    }
}
 */

/*
//whether a term is fibonacci or not

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int f=0, s=1, t, n;
        System.out.println("n: ");
        n = sc.nextInt();

        for(; f<n;){
           t= f+s;
           f= s;
           s= t;
        }
//        while(f<n){
//            t= f+s;
//            f= s;
//            s= t;
//        }

        if(f==n){
            System.out.println(f+" is fibo");
        }
        else{
            System.out.println("not");
        }
    }
}
*/

/*
//n terms that are not in the fibonacci series
// example: 4 6 7 9 10 11 12

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int f=3, s=5, t= f+1, n;
        System.out.println("n: ");
        n = sc.nextInt();

        for(int i=1; i<=n;){
            if(t<s){
                System.out.println(t);
                t= t+1;
                i= i+1;
            }
            else{
                s= s+f;
                f= s-f;
                t= t+1;
            }
        }
    }
}
 */

/*
//2+4+6+8+...upto nth terms

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int sum=0, n,t=2;
        System.out.println("n: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
           sum= sum+t;
           t= t+2;
        }

        System.out.println(sum);
    }
}
 */

/*
//1+1/2+1/3+1/4... upto nth terms

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double sum=0;
        int n;
        System.out.println("n: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            sum= sum+1.0/i;
        }

        System.out.println(sum);
        sc.close();
    }
}
 */

/*
//1-1/2+1/3-1/4+...upto nth terms

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double sum=0;
        int n;
        System.out.println("n: ");
        n = sc.nextInt();

       for(int i=1; i<=n; i++){
           if(i%2==0){
               sum= sum-1.0/i;
           }
           else{
               sum = sum+1.0/i;
           }
       }
        System.out.println(sum);
    }
}
 */

/*
//reverse a string

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s1;
        System.out.println("s1: ");
        s1 = sc.nextLine();
        StringBuilder sb= new StringBuilder(s1);
        int l= sb.length();

        for(int i=0; i<(l/2); i++){
            char lastChar= sb.charAt(l-i-1);
            char fChar= sb.charAt(i);

            sb.setCharAt(i, lastChar);
            sb.setCharAt(l-i-1, fChar);
        }
        System.out.println(sb);
    }
}
 */

/*
//prime check

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n, flag=0;
        n= sc.nextInt();

        for(int i=2; i<n; i++){
            if(n%i==0){
                flag= 1;
                break;
            }
        }

        if(flag==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
 */

/*
// Min and Max in an array

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size, i, min, max;
        System.out.println("Enter size");
        size= sc.nextInt();
        int[] arr1= new int[size];
        System.out.println("Enter numbers");
//        max= Integer.MIN_VALUE;
//        min= Integer.MAX_VALUE;
        max= min= arr1[0];

        for(i=0; i<size; i++){
            arr1[i]= sc.nextInt();
        }

        for(i=0; i<size; i++){
            if(arr1[i]>max){
                max= arr1[i];
            }
            if(arr1[i]<min){
                min = arr1[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
 */

/*
//Maximum occuring character within a string

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n, flag=0;
        String str;
        System.out.println("str: ");
        str= sc.nextLine();
        System.out.println(maxOcChar(str));
    }

    public static char maxOcChar(String str){
        int n= str.length(), max= -1;
        int[] count= new int[256];
        char result=' ';

        for(int i=0; i<n; i++){
            count[str.charAt(i)]++;
        }

        for(int i=0; i<n; i++){
            if(max < count[str.charAt(i)]){
                max= count[str.charAt(i)];
                result= str.charAt(i);
            }
        }

        return result;
    }

}
*/

//remove duplicates from a string

//solution 1
//import java.util.Scanner; //bad solution
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n, flag = 0;
//        String str;
//        System.out.println("str: ");
//        str = sc.nextLine();
//
//        int arr[] = new int[6];
//        int len= arr.length;
//        System.out.println(removeDuplicates(str));
//    }
//
//    public static String removeDuplicates(String str){
//        int len= str.length();
//        String result= "";
//        int i=0, j=0;
//
//        for(; i<len; i++){
//            for(; j<i; j++){
//                if(str.charAt(i) == str.charAt(j)){
//                    break;
//                }
//            }
//
//            if(i==j){
//                result= result+str.charAt(i);
//            }
//        }
//
//        return result;
//    }
//
//}

//solution 2
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n, flag = 0;
//        String str;
//        System.out.println("str: ");
//        str = sc.nextLine();
//        int len= str.length();
//        System.out.println(rDup(str, len));
//    }
//
//    public static String rDup(String str, int len){
//        String result= "";
//
//        for(int i=0; i<len; i++){
//            if(result.indexOf(str.charAt(i)) < 0){
//                result= result+str.charAt(i);
//            }
//        }
//
//        return result;
//    }
//}

/*
//practice

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("n: ");
        n= sc.nextInt();

       checkArm(n);
    }

    public static void checkArm(int n){
        boolean val= false;
        int order= 0;
        int num= n, rem;
        double sum=0;

        while(num!=0){

            num = num/10;
            order= order+1;
        }

        num =n;
        while(num!=0){
            rem= num%10;
            sum= sum+Math.pow(rem, order);
            num = num/10;
        }

        if(n== sum){
            System.out.println(" arm");
        }
        else{
            System.out.println("Not");
        }

    }
}
 */

/*
//prove java does not support pass by reference

class A{
    private int val;
    public void setValue(int val){
        this.val =val;
    }
    public int getValue(){
        return val;
    }
}
public class Main {
    public static void main(String[] args) {
        A objA= new A();
        objA.setValue(25);
        A objB= new A();
        objB.setValue(30);

        System.out.println("Before: "+objA.getValue()+ " "+objB.getValue());
        swap(objA, objB);
        System.out.println("After: "+objA.getValue()+ " "+objB.getValue());
    }

    public static void swap(A ob, A ob1){
        A temp= ob;
        ob = ob1;
        ob1= temp;

    }
}
 */

/*
//max length word
public class Main {
    public static void main(String[] args){
        String s= "I am a good boy";
        mLW(s);
    }

    public static void mLW(String s){
        String[] sA= s.split(" ");
        int mL= 0;
        String max= "";
        for(int i=0; i<sA.length; i++){
            if(sA[i].length()>mL){
                mL= sA[i].length();
                max=sA[i];
            }
        }
        System.out.println("Max: " +max);
    }
}
 */

/*
//Hashset implementation with iterator

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> h= new HashSet<>();
        h.add(25);
        h.add(63);
        h.add(20);

//        System.out.println(h);
        Iterator<Integer> i= h.iterator();
        while (i.hasNext()) {

            System.out.println(i.next());
        }
    }
}
 */

/*
//HashMap implementation

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       HashMap<Integer, String> h= new HashMap<>();
       h.put(1, "Arindam");
       h.put(2, " Suman");
       h.put(3, "Anirudh");

//        System.out.println(h);

        for(Map.Entry<Integer, String> m: h.entrySet()){
            System.out.println(m.getValue());
        }

    }
}
*/

/*
//sum of n natural numbers by recursion

public class Main {
    public static void main(String[] args) {
       int n=5;
       ps(n, 0);
    }

    public static void ps(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }

        sum= sum+n;
        ps(n-1, sum);
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fact(n));
    }
    public static int fact(int n) {
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
*/

/*
//fibonacci series by recursion

public class Main {
    public static void main(String[] args) {
        int n=6;
        System.out.print(0+ " "+1+ " ");
        fib(0, 1, n-2);
    }
    public static void fib(int f, int s, int n) {
        int t= f+s;
        if(n==0){
            return;
        }
        System.out.print(t+" ");
        fib(s, t, n-1);
    }
}
*/

/*
// calculate x^n( height=n ) by recursion

public class Main {
    public static void main(String[] args) {
        int x= 5,n=3;
        System.out.println(xtn(x, n));
    }

    public static int xtn(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        return x*xtn(x, n-1);
    }
}
 */

/*
// calculate x^n( height=log(n) ) by recursion
public class Main {
    public static void main(String[] args) {
        int x= 4,n=3;
        System.out.println(xtn(x, n));
    }

    public static int xtn(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return xtn(x, n / 2) * xtn(x, n / 2);
        }
        else{
            return xtn(x, n/2)* xtn(x, n/2)* x;
        }
    }
}
 */

/*
//Linked list
class Main{
    Node head;
    class Node{
        String data;
        Node next;

        public Node(String data){
            this.data= data;
            this.next= null;
        }
    }

    public void addF(String data){
        Node nn= new Node(data);
        if(head==null){
            head= nn;
            return;
        }
        nn.next= head;
        head= nn;
    }

    public void addL(String data){
        Node nn= new Node(data);
        if(head == null){
            head= nn;
            return;
        }

        Node cuN= head;
        while(cuN.next != null){
            cuN = cuN.next;
        }
        cuN.next = nn;
    }

    public void df(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        head= head.next;
    }

    public void delL(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        if(head.next==null){
            head= null;
            return;
        }
        Node secLast= head;
        Node lastNode= head.next;
        while(lastNode.next != null){
            lastNode= lastNode.next;
            secLast= secLast.next;
        }
        secLast.next= null;
    }
    public void print(){
        if(head == null){
            System.out.println("Empty");
            return;
        }

        Node cuN= head;
        while(cuN != null){
            System.out.print(cuN.data+ " -> ");
            cuN= cuN.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        Main obj1= new Main();
        obj1.addF("Somadder");
        obj1.addF("Arindam");

        obj1.addL("is");
        obj1.addL("now");
        obj1.addL("pursuing");
        obj1.addL("MCA");
        obj1.df();
        obj1.delL();
        obj1.print();
    }
}
 */

/*
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Elements");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        missingArr(arr, size);

    }

    public static void missingArr(int[] arr, int size){
        int[] missArr= new int[arr[size-1]];
        int count=0, flag=1;

        for(int k=arr[0]; k<=arr[size-1]; k++){
            for(int var=0; var<size;){
                if(k == arr[var]){
                    flag= 0;
                    break;

                }
                else{

                    flag= 1;
                    var++;
                }
            }

            if(flag==1){
                missArr[count]= k;
                count++;
            }
        }

        for(int j=0; j<missArr.length; j++){
            System.out.println(missArr[j]);
        }
    }
}
*/

/*
// Java program to move every character
// K times ahead in a given string
// character selection range:
// Within a to z and A to Z

import java.util.*;
class Main {
    //Driver code
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("String: ");
        String str= sc.next();
        int size= str.length();
        System.out.println("k: ");
        int k= sc.nextInt();
        moveChar(str, size, k);
    }
    //function to move character
    public static void moveChar(String str, int size, int k){
        int ascii, dup;
        //to create the string with new characters
        String nstr= "";

        //Iterating over all characters
        for(int i=0; i<size; ++i){
            //ASCII value
            ascii= str.charAt(i);
            dup = k;

            //check for the character between a to z
            if(ascii>=97 && ascii<=122){
                //if the (k+ascii)th character exceed z
                if((k+ascii) >122){
                    k= k- (122-ascii);
                    k= k%26;
                    nstr= nstr+(char)(96+k);
                }
                //else just add k with the ascii value
                else{
                    nstr= nstr+(char)(ascii+k);
                }
            }

            //check for the character between A to Z
            if(ascii>=65 && ascii<=90){
                //if the (k+ascii)th character exceed Z
                if((k+ascii) >90){
                    k= k- (90-ascii);
                    k= k%26;
                    nstr= nstr+(char)(64+k);
                }
                //else just add k with the ascii value
                else{
                    nstr= nstr+(char)(ascii+k);
                }
            }
            //reinitialize k to it's original value
            k = dup;
        }

        System.out.println(nstr);
    }
}


/*
//update Bit mask

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int bn= 11111;
        String sn= Integer.toString(bn);
        int dn= Integer.parseInt(sn, 2);
        System.out.println("update 1 or 0: ");
        int choice= sc.nextInt();
        int pos= 1;
        int bitMask= 1<<pos;
        int nBitM= ~bitMask;
        int nn;
        while(choice == 0 || choice == 1 ){
            if(choice==0){
                nn= nBitM & dn;
                System.out.println(nn);
                System.out.println("Binary: "+Integer.toBinaryString(nn));
                break;
            }
            if(choice==1){
                nn= bitMask | dn;
                System.out.println(nn);
                System.out.println("Binary: "+Integer.toBinaryString(nn));
                break;
            }

        }



    }
}
 */

/*
//tower of hanoi by recursion
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 3;
        toh(n, "s", "h", "d");
    }
    public static void toh(int n, String source, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+ " from "+source+" to "+dest);
            return;
        }

        toh(n-1, source, dest, helper);
        System.out.println("Transfer disk "+n+ " from "+source+" to "+dest);
        toh(n-1, helper, source, dest);
    }
}
 */

/*
//first and last occurence of a character within a string
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String str= sc.next();
        int len= str.length();

        flo(str,len);
    }

    public static void flo(String stri, int len){
        String str= stri.toLowerCase();
        int fo= -1, lo= -1;

        for(int i=0; i<len; i++){
            char cc= str.charAt(i);
            if(cc == 'a'){
                if(fo == -1){
                    fo = i;
                }
                else{
                    lo = i;
                }
            }
        }
        System.out.println("First: "+fo+ " last: "+lo);
    }
}
 */

/*
//first and last occurence of a character within a string by recursion
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int fo = -1;
    public static int lo = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String stri= sc.next();
        String str= stri.toLowerCase();
        int len= str.length();

        flo(str,0, len);
    }

    public static void flo(String str, int idx, int len){
        if(idx== len){
            System.out.println("First: "+fo+ " last: "+lo);
            return;
        }

        char cc= str.charAt(idx);
        if(cc == 'a'){
            if(fo == -1){
                fo = idx;
            }
            else{
                lo = idx;
            }
        }
        flo(str, idx+1, len);
    }
}
*/

/*
//find all subsequences of a string
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String str= sc.next();
         sos(str, 0, "");
    }
    public static void sos(String str, int idx, String ns){
        if (idx == str.length()) {
            System.out.println(ns);
            return;
        }

        char cc= str.charAt(idx);
        sos(str, idx+1, ns+cc);
        sos(str, idx+1, ns);
    }
}
*/

/*
//find all unique subsequences of a string
import java.util.Scanner;
import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String str= sc.next();
        HashSet<String> set= new HashSet<>();
        aus(str, 0, "", set);
    }

    public static void aus(String str, int idx, String ns, HashSet<String> set){

        if (idx == str.length()) {
            if(set.contains(ns)){
                return;
            }
            else{
                System.out.println(ns);
                set.add(ns);
                return;
            }
        }

        char cch= str.charAt(idx);
        aus(str, idx+1, ns+cch, set);
        aus(str, idx+1, ns, set);
    }
}
*/

/*
//print a string in reverse
import java.util.Scanner;
import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String str= sc.nextLine();

        prev(str, "", str.length()-1);
    }

    public static void prev(String str, String ns, int idx){
        if(idx == 0){
            char cch= str.charAt(idx);
            System.out.println(ns+cch);
            return;
        }

        char cch= str.charAt(idx);
        ns= ns+cch;
        prev(str, ns, idx-1);
    }

}
*/

/*
//reverse a string
import java.util.Scanner;
import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String str= sc.nextLine();
        rs(str);
    }

    public static void rs(String str){
        StringBuffer sb= new StringBuffer(str);

        for(int i=0; i<str.length()/2; i++){
            sb.setCharAt(i, str.charAt(str.length()-1-i));
            sb.setCharAt(str.length()-1-i, str.charAt(i));
        }

        System.out.println(sb);
    }

}
*/


/*
//check if the string is in strict increasing order or not
import java.util.Scanner;
public class Main{
    public static boolean val= false;
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Elements: ");
        int len= sc.nextInt();
        int[] arr= new int[len];
        System.out.println("Enter");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(roc( arr, len));
    }

    public static boolean roc(int[] arr, int len){
        try {
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    val = true;
                } else {
                    val = false;
                    break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }

        return val;

    }
}
*/

/*
//check if the string is in strict increasing order or not by recursion
import java.util.Scanner;
public class Main{
    public static boolean val= false;
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Elements: ");
        int len= sc.nextInt();
        int[] arr= new int[len];
        System.out.println("Enter");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(roc( arr, 0));
    }

    public static boolean roc(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            return roc(arr, idx+1);
        }
        else{
            return false;
        }
    }
}
*/
