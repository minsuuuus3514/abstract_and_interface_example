package game_character;

import character_basic.GameCharacterBasic;

public class Archer extends GameCharacterBasic {

	@Override
	public void attackMethod() {
		// TODO Auto-generated method stub
		System.out.println("일반 화살");
	}

	@Override
	public void skillMethod() {
		// TODO Auto-generated method stub
		System.out.println("강철화살");
	}
	
	public void archerPassiveSkill() {
		System.out.println("은폐술");
	}

}
