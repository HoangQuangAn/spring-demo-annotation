package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] data= {
			"Hoang Quang An",
			"Hoang Manh Tan",
			"Nguyen Hoai Nam"
	};
	// Create a random number generator 
	private Random myRandom=new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index=myRandom.nextInt(3);
		System.out.println(data[index]);
		return "random service";
	}

}
