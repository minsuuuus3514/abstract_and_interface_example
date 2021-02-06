package game_character;

import character_basic.GameCharacterBasic;

public class Magician extends GameCharacterBasic {

	
	@Override
	public void attackMethod() {
		// TODO Auto-generated method stub
		System.out.println("에너지볼");
	}

	@Override
	public void skillMethod() {
		// TODO Auto-generated method stub
		System.out.println("파이어볼");
		System.out.println("아이스미사일");
	}
	
	public void magicianPassiveSkill() {
		System.out.println("마나 회복");
	}

}
