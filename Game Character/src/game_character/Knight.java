package game_character;

import character_basic.GameCharacterBasic;
import interfaces.SecondaryClass;

public class Knight extends GameCharacterBasic implements SecondaryClass {

	@Override
	public void attackMethod() {
		// TODO Auto-generated method stub
		System.out.println("베기");
		System.out.println("찌르기");
	}

	@Override
	public void skillMethod() {
		// TODO Auto-generated method stub
		System.out.println("회전 검술");
	}
	
	public void worriorPassiveSkill() {
		System.out.println("회피술");
	}

	@Override
	public void secondaryActiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("방패술");
	}

	@Override
	public void secondaryPassiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("체력 회복");
	}
	
}
