package com.metanit;
public class Main {
	public static void main(String[] args){
		Person Neznayka = new Person("Neznayka");
		Bed bed1 = new Bed("bed1");
		Neznayka.breathe();
		Neznayka.tired();
		Person Fooksia = new Person("Fooksia");
		Person Seledochka = new Person("Seledochka");
		Seledochka.see(Neznayka);
		Fooksia.see(Neznayka);
		Seledochka.carry(Neznayka, bed1);
		Fooksia.carry(Neznayka, bed1);
		Seledochka.toBedSomebody(bed1, Neznayka);
		Fooksia.toBedSomebody(bed1, Neznayka);
		Clothes pants = new Clothes("pants", Color.CANARY);
		Clothes shirt = new Clothes("shirt", Color.ORANGE);
		Clothes stockings = new Clothes("stockings");
		Clothes boots = new Clothes("boots");
		Clothes tie = new Clothes("tie", Color.GREEN);
		Clothes hat = new Clothes("hat", Color.BLUE);
		Neznayka.dressClothesBySomebody(Seledochka, Fooksia, pants);
		Neznayka.dressClothesBySomebody(Seledochka, Fooksia, shirt);
		Neznayka.dressClothesBySomebody(Seledochka, Fooksia, stockings);
		Neznayka.dressClothesBySomebody(Seledochka, Fooksia, boots);
		Neznayka.dressClothesBySomebody(Seledochka, Fooksia, tie);
		Neznayka.dressClothesBySomebody(Seledochka, Fooksia, hat);
		

		System.out.println(Neznayka.checkClothes());
	}
}