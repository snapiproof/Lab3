package com.metanit;
public interface ActionWithClothes {
	public void dressClothes(Clothes cloth);
	public void dressClothesSomebody(Person person, Clothes cloth);
	public void removeClothes(Clothes cloth);
	public void removeClothesSomebody(Person person, Clothes cloth);

	public void removeClothesBySomebody(Person person1, Person person2, Clothes cloth);
	public void dressClothesBySomebody(Person person1, Person person2, Clothes cloth);


	public String checkClothes();
}	