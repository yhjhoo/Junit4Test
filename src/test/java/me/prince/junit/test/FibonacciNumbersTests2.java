package me.prince.junit.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.prince.junit.ObjParameterized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FibonacciNumbersTests2 {

	@Parameterized.Parameters
	public static List<User> data() {
		List<User> listUser = new ArrayList<User>();
		{
			User userData = new User();
			userData.setName("Test name1");
			listUser.add(userData );
		}
		
		{
			User userData = new User();
			userData.setName("Test name1");
			listUser.add(userData );
			listUser.add(userData );
		}
		
//		List<String> list = new ArrayList<String>();
//		list.add("fd");
		return listUser;
	}

	private User user;
	private String userstr;

	public FibonacciNumbersTests2(User user) {
		this.user = user;
		
//		this.userstr = user;
	}

	@Test
	public void fibonacciNumberCalc() {
		System.out.println("test");
		
		System.out.println("user: " + user.hashCode());
	}
}
