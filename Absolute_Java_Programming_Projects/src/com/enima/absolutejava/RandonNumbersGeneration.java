package com.enima.absolutejava;

import java.util.Random;
public class RandonNumbersGeneration {

	public static void main(String[] args) {
	Random RandomNum = new Random();
	int randomInt = RandomNum.nextInt(3)+4;
	System.out.println(randomInt);
	
	
	}
	}