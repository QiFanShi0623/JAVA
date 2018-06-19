package com.polymorphism;

public class TestPoly {

	public static void main(String[] args) {
		
		TestPoly test = new TestPoly();
		
		System.out.println("This is what a Cat can do");
		Cat garfield = new Cat();
		garfield.setName("garfield");
		test.train(garfield);
	//	System.out.println(garfield.toString());
		System.out.println();
		
		System.out.println("This is what a Lion can do");
		Lion Simba = new Lion();
		Simba.setName("Simba");
		test.train(Simba);
	//	System.out.println(Simba.toString());
		System.out.println();
		
		System.out.println("This is what Leopard can do");
		Leopard baghira = new Leopard();
		baghira.setName("baghira");
		test.train(baghira);
	//	System.out.println(baghira.toString());
	//	baghira.toString(baghira);
		
	
		
				
	}
	
	public void train (Cat aCat){
		
		aCat.speak();
		aCat.eat();
		aCat.run();
		if(aCat instanceof Lion){
			((Lion) aCat).soitonbench();
		
		}
		if(aCat instanceof Leopard){
			((Leopard) aCat).climb();
		}
		
		
	}

}
