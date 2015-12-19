package me.prince.junit.test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class FibonacciNumbersTests1 {
	
	@Rule
    public Timeout globalTimeout = Timeout.seconds(2);
	
    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    public double fibTest(int size){
    	long[] a = new long[size + 1];
    	a[0] = 0;
    	a[1] = 1;
    	
    	for(int i = 2; i<=size; i++){
    		a[i] = a[i-1] + a[i-2];
    	}
    	
    	return a[size];
    }
    
    @Test
    public void fibTes(){
    	System.out.println(fib(50));
    }
    
    @Test
    public void fibTest_new(){
    	double a = fibTest(4000) / fibTest(4001);
    	System.out.println(fibTest(4000));
    	System.out.println(fibTest(4001));
    	
    	System.out.println(a);
    }
}
