package com.metanit;
public interface ActionsWithBed {
	public void toBed(Bed bed);
	public void outBed(Bed bed);
	public void toBedSomebody(Bed bed, Person person);
	public void outBedSomebody(Bed bed, Person person);
	public void sleep();
}