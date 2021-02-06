package game_character;

import character_basic.GameCharacterBasic;
import interfaces.SecondaryClass;

public class Wizard extends GameCharacterBasic implements SecondaryClass {

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
	
	@Override
	public void secondaryActiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("라이트닝 볼트");
	}

	@Override
	public void secondaryPassiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("마나 실드");
	}

	

}
