package com.abu.pattern.factory.simple;

import java.util.ArrayList;

public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare(){
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding topping:");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("	"+toppings.get(i));
		}
	}
	
	public void bake(){
		System.out.println("Bake for 25 minutes");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName(){
		return this.name;
	}
}
