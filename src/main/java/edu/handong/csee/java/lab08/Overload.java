package edu.handong.csee.java.lab08; //package name


public class Overload 
{
	public static void main(String [] args)
	{
		double average1 = Overload.getAverage(40.0, 50.0); //Declare a double variable and initialize the average of 40 and 50. 
		double average2 = Overload.getAverage(1.0, 2.0, 3.0); //Declare a double variable and initialize the average of 1.0, 2.0 and 3.0 
		char average3 = Overload.getAverage('a', 'c'); //Declare a char variable and initialize the average of 'a' and 'c'. 
		System.out.println("average1 = " + average1); //print out the value of average1
		System.out.println("average2 = " + average2);  //print out the value of average2
		System.out.println("average3 = " + average3);  //print out the value of average3
	}
	
	public static double getAverage(double first, double second)
	{
		return (first + second)/2.0; //average of two numbers
	}
	
	public static double getAverage(double first, double second, double third)
	{
		return (first + second + third) /3.0; //average of three numbers
	}
	
	public static char getAverage(char first, char second)
	{
		return (char)(((int)first + (int)second)/2); //average of two character
	}
}
