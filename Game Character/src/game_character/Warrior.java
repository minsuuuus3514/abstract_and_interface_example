package game_character;

import character_basic.GameCharacterBasic;

public class Warrior extends GameCharacterBasic {

	@Override
	public void attackMethod() {
		// TODO Auto-generated method stub
		System.out.println("����");
		System.out.println("���");
	}

	@Override
	public void skillMethod() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� �˼�");
	}
	
	public void worriorPassiveSkill() {
		System.out.println("ȸ�Ǽ�");
	}

}
