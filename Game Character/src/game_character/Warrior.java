package game_character;

import character_basic.GameCharacterBasic;

public class Warrior extends GameCharacterBasic {

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

}
