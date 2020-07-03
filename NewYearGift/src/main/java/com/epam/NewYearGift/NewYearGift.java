package com.epam.NewYearGift;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
interface sweets{
	public void numberOfSweets();		
}

interface chocolates{
	public void numberOfChocolates();	
}



class NewYearGift implements sweets,chocolates {

	
	public int number1,number2,weight;
	Map<String, Integer> dict = new HashMap<String, Integer>(); 
	
	
	
	public void numberOfChocolates() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nenter the number of chocolates");
	
		number1 = input.nextInt();
		System.out.println("\nnumber of chocolates recieved in gift " + number1);
		
	
	}

	

	public void numberOfSweets() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nenter the number of sweets");
	    number2 = input.nextInt();
		System.out.println("\nnumber of Sweets recieved in gift " + number2);

		
	}
	public void totalWeight() {
		
		weight=number1*200+number2*300;
		System.out.println("\nthe total Weight of gifts is(200 gm for each chocolates and 300 gm for each sweet) "+weight+" gms \n");
	}
	
	public void Chocolates() {
        
		 Scanner int1 = new Scanner(System.in);
		 Scanner sc = new Scanner(System.in); 
		     
		for(int i=1;i<=number1;i++) {
			System.out.println("enter the name of the  chocolate"+i);
			String name = sc.nextLine();  
			System.out.println("enter the price of the  chocolate"+i);
			int a = int1.nextInt(); 
			dict.put(name,a); 	
		}
		System.out.println(dict);
		
		Map<String,Integer> sortedMap = new TreeMap<String,Integer>(dict);
        System.out.println("THe Alphabetical order of the chocolates in the gift are    : " + sortedMap);
	}
	public void Sweets() {
		 Scanner int2 = new Scanner(System.in);
		 Scanner sc1 = new Scanner(System.in); 
		     
		for(int i=1;i<=number1;i++) {
			System.out.println("enter the name of the  sweet"+i);
			String name1 = sc1.nextLine();  
			System.out.println("enter the price of the  sweet"+i);
			int a1 = int2.nextInt(); 
			dict.put(name1,a1); 	
		}
		System.out.println(dict);
		
		Map<String,Integer> sortedMap1 = new TreeMap<String,Integer>(dict);
        System.out.println("THe Alphabetical order of the chocolates and Sweets in the gift are    : " + sortedMap1);
		
	}
	public void calcRange()
	{
		int l,h;
		Scanner int3=new Scanner(System.in);
		Scanner int4=new Scanner(System.in);
		System.out.println("enter the lowerlimit of price:");
		l=int3.nextInt();
		System.out.println("enter the higherlimit of price:");
		h=int4.nextInt();
		Set<Map.Entry<String,Integer>> ChocolatesSet=dict.entrySet();
		Iterator<Map.Entry<String,Integer>> ChocolatesIterator=ChocolatesSet.iterator();
		while(ChocolatesIterator.hasNext())
		{
			Map.Entry ChocolatesElement=(Map.Entry)ChocolatesIterator.next();
			int currentprice=(int)ChocolatesElement.getValue();
			if(currentprice >= l && currentprice <= h)
				System.out.println(ChocolatesElement.getKey());
		}

	}

}
