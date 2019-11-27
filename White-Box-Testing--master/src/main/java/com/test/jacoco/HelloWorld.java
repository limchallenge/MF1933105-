package com.test.jacoco;

import javax.imageio.event.IIOReadWarningListener;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	System.out.println("Condition 3");
    	return 0;
    }

    public int Method4(int a, int b, int c, int d, float e) {
    	if(a == 0) {
    		return 0;
    	}
    	int x = 0;
    	if((a == b) || ((c == d) && (bug(a)))) {
    		 x = 1; 
    	}
    	e = 1/x;
    	return 0;
    }

    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    public boolean isTriangle(int a, int b, int c) {
    	if((a>0) && (b>0) && (c>0) && (a+b>c) && (a+c>b) && (b+c>a))
    	                return true;
                return false;
    }

    public boolean isBirthday(int year, int month, int day) {
                if((year<1990) || (year>2019) || (month<1) || (month>12) || (day<1) || (day>31))
    	                return false;
                if(((month==4) || (month==6) || (month==9) || (month==11)) && (day==31))
    	                return false;
                if(((year%4==0) && (month==2) && (day>29)) || ((year%4!=0) && (month==2) && (day>28)))
    	                return false;
                if((year==2019) && ((month>10) || ((month==10) && (day>1))))
    	                return false;
    	return true;

    }

    public Double miniCalculator(double a, double b, char op) {
    	double result = 0.0;
                if(op=='+') result=a+b;
                if(op=='-') result=a-b;
                if(op=='*') result=a*b;
                if(op=='/') result=a/b;
    	return result;
    }
    
}
