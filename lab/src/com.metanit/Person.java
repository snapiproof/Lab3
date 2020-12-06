package com.metanit;
import java.util.ArrayList;
public class Person extends TextObject implements  Breathe, Tired, See, Carry, ActionsWithBed, ActionWithClothes {
	private String name;
	public Person(String name) {
        super(name);
        this.name = name;
    }


    public void breathe() {
        System.out.printf("%s breathe \n", name);
    }
    public void tired() {
        System.out.printf("%s is tired \n", name);
    }
    public void see(Person person) {
        System.out.printf("%s see %s\n", name, person.name);
    }
    public void carry(Person person, TextObject place) {
        System.out.printf("%s carry %s to %s\n", name, person.name, place.getName());
    }

    public void toBed(Bed bed){
    	System.out.printf("%s in %s \n", name, bed.getName());
    	bed.setSleeper(this);
    }
    public void outBed(Bed bed){
    	System.out.printf("%s get out off %s \n", name, bed.getName());
    	bed.isFree();
    }

    public void toBedSomebody(Bed bed, Person person){
    	System.out.printf("%s put %s to %s\n",name, person.name, bed.getName());
    	bed.setSleeper(person);
    }

    public void removeClothesBySomebody(Person person1, Person person2, Clothes cloth){
        this.clothes.remove(cloth.getName());
        System.out.printf("%s and %s take off %s from %s\n",person1.getName(), person2.getName(), cloth.getName(), this.name);
    }
    public void dressClothesBySomebody(Person person1, Person person2, Clothes cloth){
        this.clothes.add(cloth.getName());
        System.out.printf("%s and %s dress %s to %s\n",person1.getName(), person2.getName(), cloth.getName(), this.name);
    }


    public void outBedSomebody(Bed bed, Person person){
    	System.out.printf("%s take out %s from %s\n",name, person.name, bed.getName());
    	bed.isFree();
    }
    public void sleep(){
    	System.out.printf("%s sleep\n",name);
	}

    private ArrayList clothes = new ArrayList();
    public void dressClothes(Clothes cloth){
        this.clothes.add(cloth.getName());
        System.out.printf("%s dress %s\n",this.name, cloth.getName());
    }
    public void dressClothesSomebody(Person person, Clothes cloth){
        person.clothes.add(cloth.getName());
        System.out.printf("%s dress %s to %s\n",this.name, cloth.getName(), person.getName());
    }
    public void removeClothes(Clothes cloth){
        this.clothes.remove(cloth.getName());
        System.out.printf("%s remove %s\n",this.name, cloth.getName());
    }
    public void removeClothesSomebody(Person person, Clothes cloth){
        person.clothes.remove(cloth.getName());
        System.out.printf("%s remove %s from %s\n",this.name, cloth.getName(), person.getName());
    }
    public String checkClothes(){
        return clothes.toString();
        
    }
	
    @Override
    public String toString() {
        return "Person's name is" + this.getName();
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.person, clothes);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return (name == person.name) && clothes.equals(person.clothes);
    }
}
